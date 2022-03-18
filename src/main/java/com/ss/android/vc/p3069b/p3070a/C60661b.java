package com.ss.android.vc.p3069b.p3070a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: com.ss.android.vc.b.a.b */
public class C60661b {

    /* renamed from: a */
    private static final boolean f151722a;

    /* renamed from: b */
    private static final C60661b f151723b = new C60661b();

    /* renamed from: c */
    private Handler f151724c;

    /* renamed from: d */
    private Choreographer f151725d;

    /* renamed from: a */
    public static C60661b m235737a() {
        return f151723b;
    }

    /* renamed from: b */
    private Choreographer m235739b() {
        return Choreographer.getInstance();
    }

    /* renamed from: com.ss.android.vc.b.a.b$a */
    public static abstract class AbstractC60662a {

        /* renamed from: a */
        private Runnable f151726a;

        /* renamed from: b */
        private Choreographer.FrameCallback f151727b;

        /* renamed from: a */
        public abstract void mo208207a(long j);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Choreographer.FrameCallback mo208206a() {
            if (this.f151727b == null) {
                this.f151727b = new Choreographer.FrameCallback() {
                    /* class com.ss.android.vc.p3069b.p3070a.C60661b.AbstractC60662a.Choreographer$FrameCallbackC606631 */

                    public void doFrame(long j) {
                        AbstractC60662a.this.mo208207a(j);
                    }
                };
            }
            return this.f151727b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Runnable mo208208b() {
            if (this.f151726a == null) {
                this.f151726a = new Runnable() {
                    /* class com.ss.android.vc.p3069b.p3070a.C60661b.AbstractC60662a.RunnableC606642 */

                    public void run() {
                        AbstractC60662a.this.mo208207a(System.nanoTime());
                    }
                };
            }
            return this.f151726a;
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        f151722a = z;
    }

    private C60661b() {
        if (f151722a) {
            this.f151725d = m235739b();
        } else {
            this.f151724c = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    private void m235738a(Choreographer.FrameCallback frameCallback) {
        this.f151725d.postFrameCallback(frameCallback);
    }

    /* renamed from: a */
    public void mo208205a(AbstractC60662a aVar) {
        if (f151722a) {
            m235738a(aVar.mo208206a());
        } else {
            this.f151724c.postDelayed(aVar.mo208208b(), 0);
        }
    }
}
