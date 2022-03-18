package com.ttnet.org.chromium.base.library_loader;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ttnet.org.chromium.base.CommandLine;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.SysUtils;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import com.ttnet.org.chromium.base.task.PostTask;
import com.ttnet.org.chromium.base.task.TaskTraits;
import java.util.concurrent.atomic.AtomicBoolean;

@JNINamespace("base::android")
public class LibraryPrefetcher {
    private static final AtomicBoolean sPrefetchLibraryHasBeenCalled = new AtomicBoolean();

    private static native void nativeForkAndPrefetchNativeLibrary();

    private static native OrderedCodeInfo nativeGetOrderedCodeInfo();

    private static native int nativePercentageOfResidentNativeLibraryCode();

    /* access modifiers changed from: private */
    public static native void nativePeriodicallyCollectResidency();

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    private static final class OrderedCodeInfo {
        public final String filename;
        public final long length;
        public final long startOffset;

        public String toString() {
            return "filename = " + this.filename + " startOffset = " + this.startOffset + " length = " + this.length;
        }

        public OrderedCodeInfo(String str, long j, long j2) {
            this.filename = str;
            this.startOffset = j;
            this.length = j2;
        }
    }

    public static void asyncPrefetchLibrariesToMemory() {
        SysUtils.logPageFaultCountToTracing();
        boolean compareAndSet = sPrefetchLibraryHasBeenCalled.compareAndSet(false, true);
        if (!compareAndSet || !CommandLine.getInstance().hasSwitch("log-native-library-residency")) {
            PostTask.postTask(TaskTraits.USER_BLOCKING, new Runnable(compareAndSet) {
                /* class com.ttnet.org.chromium.base.library_loader.$$Lambda$LibraryPrefetcher$cT7rEmVKIJeQwA9nB9FU9ci5ZUk */
                public final /* synthetic */ boolean f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    LibraryPrefetcher.lambda$asyncPrefetchLibrariesToMemory$0(this.f$0);
                }
            });
        } else {
            new_insert_after_java_lang_Thread_by_knot(new Thread($$Lambda$LibraryPrefetcher$jGRuTrEaUFU8N4hjLT82J5HlWQ.INSTANCE)).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00af, code lost:
        if (r0 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void maybePinOrderedCodeInMemory() {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.LibraryPrefetcher.maybePinOrderedCodeInMemory():void");
    }

    static /* synthetic */ void lambda$asyncPrefetchLibrariesToMemory$0(boolean z) {
        boolean z2;
        String str;
        int nativePercentageOfResidentNativeLibraryCode = nativePercentageOfResidentNativeLibraryCode();
        TraceEvent scoped = TraceEvent.scoped("LibraryPrefetcher.asyncPrefetchLibrariesToMemory", Integer.toString(nativePercentageOfResidentNativeLibraryCode));
        if (!z || nativePercentageOfResidentNativeLibraryCode >= 90) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            try {
                nativeForkAndPrefetchNativeLibrary();
            } catch (Throwable th) {
                if (scoped != null) {
                    $closeResource(th, scoped);
                }
                throw th;
            }
        }
        if (nativePercentageOfResidentNativeLibraryCode != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("LibraryLoader.PercentageOfResidentCodeBeforePrefetch");
            if (z) {
                str = ".ColdStartup";
            } else {
                str = ".WarmStartup";
            }
            sb.append(str);
            RecordHistogram.recordPercentageHistogram(sb.toString(), nativePercentageOfResidentNativeLibraryCode);
        }
        if (scoped != null) {
            $closeResource(null, scoped);
        }
        ContextUtils.getAppSharedPreferences().edit().remove("dont_prefetch_libraries").apply();
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }
}
