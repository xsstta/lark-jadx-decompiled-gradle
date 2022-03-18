package com.lark.falcon.engine;

import android.os.Handler;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.HashMap;
import java.util.Map;

public class JsTimer {
    private static final String TAG = "JsTimer";
    public final Handler mHandler;
    public final long mJsEnginePtr;
    private long mPoolId = 1;
    private final Map<Long, C23943a> mTimeTasks = new HashMap();

    private native void releaseJsCallback(long j, long j2);

    public native void runJsCallback(long j, long j2);

    public void clearInterval(long j) {
        removeTimeTask(j);
    }

    public void clearTimeout(long j) {
        removeTimeTask(j);
    }

    public JsTimer(long j) {
        this.mJsEnginePtr = j;
        this.mHandler = new Handler();
    }

    private void removeTimeTask(long j) {
        C23943a remove = this.mTimeTasks.remove(Long.valueOf(j));
        if (remove != null) {
            this.mHandler.removeCallbacks(remove.f59254d);
            releaseJsCallback(this.mJsEnginePtr, remove.f59251a);
            return;
        }
        String str = TAG;
        AppBrandLogger.m52829e(str, "removeTimeTask: timeTask is NULL! taskId = " + j);
    }

    public /* synthetic */ void lambda$setTimeout$0$JsTimer(long j, long j2) {
        runJsCallback(this.mJsEnginePtr, j);
        releaseJsCallback(this.mJsEnginePtr, j);
        this.mTimeTasks.remove(Long.valueOf(j2));
    }

    public long setInterval(final long j, final long j2) {
        RunnableC239421 r7 = new Runnable() {
            /* class com.lark.falcon.engine.JsTimer.RunnableC239421 */

            public void run() {
                JsTimer jsTimer = JsTimer.this;
                jsTimer.runJsCallback(jsTimer.mJsEnginePtr, j);
                JsTimer.this.mHandler.postDelayed(this, j2);
            }
        };
        C23943a aVar = new C23943a(j, j2, true, r7);
        long j3 = this.mPoolId;
        this.mPoolId = 1 + j3;
        this.mTimeTasks.put(Long.valueOf(j3), aVar);
        this.mHandler.postDelayed(r7, j2);
        return j3;
    }

    public long setTimeout(long j, long j2) {
        long j3 = this.mPoolId;
        this.mPoolId = 1 + j3;
        C23943a aVar = new C23943a(j, j2, false, new Runnable(j, j3) {
            /* class com.lark.falcon.engine.$$Lambda$JsTimer$OkUQt6WJ5H4qsSMxIj07CBtiKaE */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                JsTimer.this.lambda$setTimeout$0$JsTimer(this.f$1, this.f$2);
            }
        });
        this.mTimeTasks.put(Long.valueOf(j3), aVar);
        this.mHandler.postDelayed(aVar.f59254d, j2);
        return j3;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lark.falcon.engine.JsTimer$a */
    public static final class C23943a {

        /* renamed from: a */
        public final long f59251a;

        /* renamed from: b */
        public final long f59252b;

        /* renamed from: c */
        public final boolean f59253c;

        /* renamed from: d */
        public final Runnable f59254d;

        public C23943a(long j, long j2, boolean z, Runnable runnable) {
            this.f59251a = j;
            this.f59252b = j2;
            this.f59253c = z;
            this.f59254d = runnable;
        }
    }
}
