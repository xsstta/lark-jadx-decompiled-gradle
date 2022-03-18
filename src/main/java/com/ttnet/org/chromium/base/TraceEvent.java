package com.ttnet.org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class TraceEvent implements AutoCloseable {
    private static volatile boolean sATraceEnabled;
    public static volatile boolean sEnabled;
    private final String mName;

    private static native void nativeBegin(String str, String str2);

    public static native void nativeBeginToplevel(String str);

    private static native void nativeEnd(String str, String str2);

    public static native void nativeEndToplevel(String str);

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    private static class BasicLooperMonitor implements Printer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final int SHORTEST_LOG_PREFIX_LENGTH = 18;
        private String mCurrentTarget;

        private BasicLooperMonitor() {
        }

        public void println(String str) {
            if (str.startsWith(">")) {
                beginHandling(str);
            } else {
                endHandling(str);
            }
        }

        private static String getTarget(String str) {
            int i;
            int indexOf = str.indexOf(40, SHORTEST_LOG_PREFIX_LENGTH);
            if (indexOf == -1) {
                i = -1;
            } else {
                i = str.indexOf(41, indexOf);
            }
            if (i != -1) {
                return str.substring(indexOf + 1, i);
            }
            return "";
        }

        /* access modifiers changed from: package-private */
        public void beginHandling(String str) {
            boolean isActive = EarlyTraceEvent.isActive();
            if (TraceEvent.sEnabled || isActive) {
                this.mCurrentTarget = getTraceEventName(str);
                if (TraceEvent.sEnabled) {
                    TraceEvent.nativeBeginToplevel(this.mCurrentTarget);
                } else {
                    EarlyTraceEvent.begin(this.mCurrentTarget);
                }
            }
        }

        private static String getTargetName(String str) {
            int i;
            int indexOf = str.indexOf(SmActions.ACTION_RINGING_ENTRY, SHORTEST_LOG_PREFIX_LENGTH);
            if (indexOf == -1) {
                i = -1;
            } else {
                i = str.indexOf(58, indexOf);
            }
            if (i == -1) {
                i = str.length();
            }
            if (indexOf != -1) {
                return str.substring(indexOf + 2, i);
            }
            return "";
        }

        private static String getTraceEventName(String str) {
            return "Looper.dispatch: " + getTarget(str) + "(" + getTargetName(str) + ")";
        }

        /* access modifiers changed from: package-private */
        public void endHandling(String str) {
            boolean isActive = EarlyTraceEvent.isActive();
            if ((TraceEvent.sEnabled || isActive) && this.mCurrentTarget != null) {
                if (TraceEvent.sEnabled) {
                    TraceEvent.nativeEndToplevel(this.mCurrentTarget);
                } else {
                    EarlyTraceEvent.end(this.mCurrentTarget);
                }
            }
            this.mCurrentTarget = null;
        }
    }

    private static final class LooperMonitorHolder {
        public static final BasicLooperMonitor sInstance;

        private LooperMonitorHolder() {
        }

        static {
            BasicLooperMonitor basicLooperMonitor;
            if (CommandLine.getInstance().hasSwitch("enable-idle-tracing")) {
                basicLooperMonitor = new IdleTracingLooperMonitor();
            } else {
                basicLooperMonitor = new BasicLooperMonitor();
            }
            sInstance = basicLooperMonitor;
        }
    }

    public static boolean enabled() {
        return sEnabled;
    }

    public static void registerNativeEnabledObserver() {
        nativeRegisterEnabledObserver();
    }

    private static final class IdleTracingLooperMonitor extends BasicLooperMonitor implements MessageQueue.IdleHandler {
        private boolean mIdleMonitorAttached;
        private long mLastIdleStartedAt;
        private long mLastWorkStartedAt;
        private int mNumIdlesSeen;
        private int mNumTasksSeen;
        private int mNumTasksSinceLastIdle;

        private IdleTracingLooperMonitor() {
            super();
        }

        private final void syncIdleMonitoring() {
            if (TraceEvent.sEnabled && !this.mIdleMonitorAttached) {
                this.mLastIdleStartedAt = SystemClock.elapsedRealtime();
                Looper.myQueue().addIdleHandler(this);
                this.mIdleMonitorAttached = true;
                Log.v("TraceEvent.LooperMonitor", "attached idle handler");
            } else if (this.mIdleMonitorAttached && !TraceEvent.sEnabled) {
                Looper.myQueue().removeIdleHandler(this);
                this.mIdleMonitorAttached = false;
                Log.v("TraceEvent.LooperMonitor", "detached idle handler");
            }
        }

        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.mLastIdleStartedAt == 0) {
                this.mLastIdleStartedAt = elapsedRealtime;
            }
            long j = elapsedRealtime - this.mLastIdleStartedAt;
            this.mNumIdlesSeen++;
            TraceEvent.begin("Looper.queueIdle", this.mNumTasksSinceLastIdle + " tasks since last idle.");
            if (j > 48) {
                traceAndLog(3, this.mNumTasksSeen + " tasks and " + this.mNumIdlesSeen + " idles processed so far, " + this.mNumTasksSinceLastIdle + " tasks bursted and " + j + "ms elapsed since last idle");
            }
            this.mLastIdleStartedAt = elapsedRealtime;
            this.mNumTasksSinceLastIdle = 0;
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ttnet.org.chromium.base.TraceEvent.BasicLooperMonitor
        public final void beginHandling(String str) {
            if (this.mNumTasksSinceLastIdle == 0) {
                TraceEvent.end("Looper.queueIdle");
            }
            this.mLastWorkStartedAt = SystemClock.elapsedRealtime();
            syncIdleMonitoring();
            super.beginHandling(str);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ttnet.org.chromium.base.TraceEvent.BasicLooperMonitor
        public final void endHandling(String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.mLastWorkStartedAt;
            if (elapsedRealtime > 16) {
                traceAndLog(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
            }
            super.endHandling(str);
            syncIdleMonitoring();
            this.mNumTasksSeen++;
            this.mNumTasksSinceLastIdle++;
        }

        private static void traceAndLog(int i, String str) {
            TraceEvent.instant("TraceEvent.LooperMonitor:IdleStats", str);
            Log.println(i, "TraceEvent.LooperMonitor", str);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end(this.mName);
    }

    public static void maybeEnableEarlyTracing() {
        EarlyTraceEvent.maybeEnable();
        if (EarlyTraceEvent.isActive()) {
            ThreadUtils.getUiThreadLooper().setMessageLogging(LooperMonitorHolder.sInstance);
        }
    }

    public static void begin(String str) {
        begin(str, null);
    }

    public static void end(String str) {
        end(str, null);
    }

    public static TraceEvent scoped(String str) {
        return scoped(str, null);
    }

    public static void instant(String str) {
        if (sEnabled) {
            nativeInstant(str, null);
        }
    }

    public static void setATraceEnabled(boolean z) {
        if (sATraceEnabled != z) {
            sATraceEnabled = z;
            if (z) {
                nativeStartATrace();
            } else {
                nativeStopATrace();
            }
        }
    }

    public static void setEnabled(boolean z) {
        BasicLooperMonitor basicLooperMonitor;
        if (z) {
            EarlyTraceEvent.disable();
        }
        if (sEnabled != z) {
            sEnabled = z;
            if (!sATraceEnabled) {
                Looper uiThreadLooper = ThreadUtils.getUiThreadLooper();
                if (z) {
                    basicLooperMonitor = LooperMonitorHolder.sInstance;
                } else {
                    basicLooperMonitor = null;
                }
                uiThreadLooper.setMessageLogging(basicLooperMonitor);
            }
        }
    }

    public static void instant(String str, String str2) {
        if (sEnabled) {
            nativeInstant(str, str2);
        }
    }

    private TraceEvent(String str, String str2) {
        this.mName = str;
        begin(str, str2);
    }

    public static void begin(String str, String str2) {
        EarlyTraceEvent.begin(str);
        if (sEnabled) {
            nativeBegin(str, str2);
        }
    }

    public static void end(String str, String str2) {
        EarlyTraceEvent.end(str);
        if (sEnabled) {
            nativeEnd(str, str2);
        }
    }

    public static void finishAsync(String str, long j) {
        EarlyTraceEvent.finishAsync(str, j);
        if (sEnabled) {
            nativeFinishAsync(str, j);
        }
    }

    public static void startAsync(String str, long j) {
        EarlyTraceEvent.startAsync(str, j);
        if (sEnabled) {
            nativeStartAsync(str, j);
        }
    }

    public static TraceEvent scoped(String str, String str2) {
        if (EarlyTraceEvent.enabled() || enabled()) {
            return new TraceEvent(str, str2);
        }
        return null;
    }
}
