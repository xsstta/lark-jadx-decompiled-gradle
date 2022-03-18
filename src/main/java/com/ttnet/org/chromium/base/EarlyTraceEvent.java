package com.ttnet.org.chromium.base;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JNINamespace("base::android")
public class EarlyTraceEvent {
    static List<AsyncEvent> sAsyncEvents;
    private static boolean sCachedBackgroundStartupTracingFlag;
    static List<Event> sCompletedEvents;
    private static final Object sLock = new Object();
    static List<String> sPendingAsyncEvents;
    static Map<String, Event> sPendingEventByKey;
    static volatile int sState;

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i, long j3);

    private static native void nativeRecordEarlyFinishAsyncEvent(String str, long j, long j2);

    private static native void nativeRecordEarlyStartAsyncEvent(String str, long j, long j2);

    public static boolean getBackgroundStartupTracingFlag() {
        return sCachedBackgroundStartupTracingFlag;
    }

    static boolean enabled() {
        if (sState == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class Event {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final long mBeginThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        final long mBeginTimeNanos = elapsedRealtimeNanos();
        long mEndThreadTimeMillis;
        long mEndTimeNanos;
        final String mName;
        final int mThreadId = Process.myTid();

        /* access modifiers changed from: package-private */
        public void end() {
            this.mEndTimeNanos = elapsedRealtimeNanos();
            this.mEndThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        }

        static long elapsedRealtimeNanos() {
            if (Build.VERSION.SDK_INT >= 17) {
                return SystemClock.elapsedRealtimeNanos();
            }
            return SystemClock.elapsedRealtime() * 1000000;
        }

        Event(String str) {
            this.mName = str;
        }
    }

    private static long getOffsetNanos() {
        return (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - Event.elapsedRealtimeNanos();
    }

    static boolean isActive() {
        int i = sState;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    static void disable() {
        synchronized (sLock) {
            if (enabled()) {
                sState = 2;
                maybeFinishLocked();
            }
        }
    }

    static void resetForTesting() {
        synchronized (sLock) {
            sState = 0;
            sCompletedEvents = null;
            sPendingEventByKey = null;
            sAsyncEvents = null;
            sPendingAsyncEvents = null;
        }
    }

    static void enable() {
        synchronized (sLock) {
            if (sState == 0) {
                sCompletedEvents = new ArrayList();
                sPendingEventByKey = new HashMap();
                sAsyncEvents = new ArrayList();
                sPendingAsyncEvents = new ArrayList();
                sState = 1;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void maybeEnable() {
        /*
            com.ttnet.org.chromium.base.ThreadUtils.assertOnUiThread()
            int r0 = com.ttnet.org.chromium.base.EarlyTraceEvent.sState
            if (r0 == 0) goto L_0x0008
            return
        L_0x0008:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            com.ttnet.org.chromium.base.CommandLine r1 = com.ttnet.org.chromium.base.CommandLine.getInstance()     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "trace-startup"
            boolean r1 = r1.hasSwitch(r2)     // Catch:{ all -> 0x004a }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            r1 = 1
            goto L_0x0029
        L_0x001c:
            java.io.File r1 = new java.io.File     // Catch:{ SecurityException -> 0x0028 }
            java.lang.String r4 = "/data/local/chrome-trace-config.json"
            r1.<init>(r4)     // Catch:{ SecurityException -> 0x0028 }
            boolean r1 = r1.exists()     // Catch:{ SecurityException -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            android.content.SharedPreferences r4 = com.ttnet.org.chromium.base.ContextUtils.getAppSharedPreferences()
            java.lang.String r5 = "bg_startup_tracing"
            boolean r4 = r4.getBoolean(r5, r3)
            if (r4 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x003d
            setBackgroundStartupTracingFlag(r3)
            com.ttnet.org.chromium.base.EarlyTraceEvent.sCachedBackgroundStartupTracingFlag = r3
            goto L_0x0040
        L_0x003d:
            com.ttnet.org.chromium.base.EarlyTraceEvent.sCachedBackgroundStartupTracingFlag = r2
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            android.os.StrictMode.setThreadPolicy(r0)
            if (r2 == 0) goto L_0x0049
            enable()
        L_0x0049:
            return
        L_0x004a:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.EarlyTraceEvent.maybeEnable():void");
    }

    private static void maybeFinishLocked() {
        if (!sCompletedEvents.isEmpty()) {
            dumpEvents(sCompletedEvents);
            sCompletedEvents.clear();
        }
        if (!sAsyncEvents.isEmpty()) {
            dumpAsyncEvents(sAsyncEvents);
            sAsyncEvents.clear();
        }
        if (sPendingEventByKey.isEmpty() && sPendingAsyncEvents.isEmpty()) {
            sState = 3;
            sPendingEventByKey = null;
            sCompletedEvents = null;
            sPendingAsyncEvents = null;
            sAsyncEvents = null;
        }
    }

    static String makeEventKeyForCurrentThread(String str) {
        return str + "@" + Process.myTid();
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        ContextUtils.getAppSharedPreferences().edit().putBoolean("bg_startup_tracing", z).apply();
    }

    private static void dumpAsyncEvents(List<AsyncEvent> list) {
        long offsetNanos = getOffsetNanos();
        for (AsyncEvent asyncEvent : list) {
            if (asyncEvent.mIsStart) {
                nativeRecordEarlyStartAsyncEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimestampNanos + offsetNanos);
            } else {
                nativeRecordEarlyFinishAsyncEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimestampNanos + offsetNanos);
            }
        }
    }

    private static void dumpEvents(List<Event> list) {
        long offsetNanos = getOffsetNanos();
        for (Event event : list) {
            nativeRecordEarlyEvent(event.mName, event.mBeginTimeNanos + offsetNanos, event.mEndTimeNanos + offsetNanos, event.mThreadId, event.mEndThreadTimeMillis - event.mBeginThreadTimeMillis);
        }
    }

    public static void end(String str) {
        if (isActive()) {
            synchronized (sLock) {
                if (isActive()) {
                    Event remove = sPendingEventByKey.remove(makeEventKeyForCurrentThread(str));
                    if (remove != null) {
                        remove.end();
                        sCompletedEvents.add(remove);
                        if (sState == 2) {
                            maybeFinishLocked();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        throw new java.lang.IllegalArgumentException("Multiple pending trace events can't have the same name: " + r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void begin(java.lang.String r4) {
        /*
            boolean r0 = enabled()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ttnet.org.chromium.base.EarlyTraceEvent$Event r0 = new com.ttnet.org.chromium.base.EarlyTraceEvent$Event
            r0.<init>(r4)
            java.lang.Object r1 = com.ttnet.org.chromium.base.EarlyTraceEvent.sLock
            monitor-enter(r1)
            boolean r2 = enabled()     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            return
        L_0x0017:
            java.util.Map<java.lang.String, com.ttnet.org.chromium.base.EarlyTraceEvent$Event> r2 = com.ttnet.org.chromium.base.EarlyTraceEvent.sPendingEventByKey     // Catch:{ all -> 0x003e }
            java.lang.String r3 = makeEventKeyForCurrentThread(r4)     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r2.put(r3, r0)     // Catch:{ all -> 0x003e }
            com.ttnet.org.chromium.base.EarlyTraceEvent$Event r0 = (com.ttnet.org.chromium.base.EarlyTraceEvent.Event) r0     // Catch:{ all -> 0x003e }
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Multiple pending trace events can't have the same name: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.EarlyTraceEvent.begin(java.lang.String):void");
    }

    public static void finishAsync(String str, long j) {
        if (isActive()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, false);
            synchronized (sLock) {
                if (isActive()) {
                    if (sPendingAsyncEvents.remove(str)) {
                        sAsyncEvents.add(asyncEvent);
                        if (sState == 2) {
                            maybeFinishLocked();
                        }
                    }
                }
            }
        }
    }

    public static void startAsync(String str, long j) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, true);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                    sPendingAsyncEvents.add(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class AsyncEvent {
        final long mId;
        final boolean mIsStart;
        final String mName;
        final long mTimestampNanos = Event.elapsedRealtimeNanos();

        AsyncEvent(String str, long j, boolean z) {
            this.mName = str;
            this.mId = j;
            this.mIsStart = z;
        }
    }
}
