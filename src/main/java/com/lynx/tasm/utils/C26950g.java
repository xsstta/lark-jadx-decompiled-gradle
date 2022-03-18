package com.lynx.tasm.utils;

import android.os.Build;
import android.util.Log;
import android.view.Choreographer;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.utils.g */
public class C26950g {

    /* renamed from: a */
    public WeakReference<AbstractC26952a> f66902a;

    /* renamed from: b */
    public Choreographer f66903b;

    /* renamed from: c */
    public final Choreographer.FrameCallback f66904c;

    /* renamed from: d */
    private boolean f66905d;

    /* renamed from: e */
    private boolean f66906e;

    /* renamed from: com.lynx.tasm.utils.g$a */
    public interface AbstractC26952a {
        /* renamed from: a */
        void mo95194a(long j);
    }

    /* renamed from: d */
    public void mo95803d() {
        if (this.f66906e) {
            mo95800a();
        }
    }

    /* renamed from: c */
    public void mo95802c() {
        boolean z = this.f66905d;
        this.f66906e = z;
        if (z) {
            mo95801b();
        }
    }

    /* renamed from: a */
    public void mo95800a() {
        if (!this.f66905d) {
            Choreographer choreographer = this.f66903b;
            if (choreographer != null) {
                choreographer.postFrameCallback(this.f66904c);
            }
            Log.d("LynxFrameRateControl", "real start");
            this.f66905d = true;
        }
    }

    /* renamed from: b */
    public void mo95801b() {
        Log.d("LynxFrameRateControl", "stop");
        Choreographer choreographer = this.f66903b;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this.f66904c);
        }
        this.f66905d = false;
    }

    public C26950g(AbstractC26952a aVar) {
        this.f66902a = new WeakReference<>(aVar);
        if (Build.VERSION.SDK_INT > 15) {
            try {
                this.f66903b = Choreographer.getInstance();
            } catch (Throwable unused) {
                Log.e("lynx", "Choreographer.getInstance got exception");
            }
            this.f66904c = new Choreographer.FrameCallback() {
                /* class com.lynx.tasm.utils.C26950g.Choreographer$FrameCallbackC269511 */

                public void doFrame(long j) {
                    AbstractC26952a aVar;
                    if (C26950g.this.f66902a != null && (aVar = C26950g.this.f66902a.get()) != null) {
                        try {
                            aVar.mo95194a(j);
                            C26950g.this.f66903b.postFrameCallback(C26950g.this.f66904c);
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("LynxFrameRateControl", "VSync callback exception:" + e.toString());
                        }
                    }
                }
            };
            return;
        }
        this.f66903b = null;
        this.f66904c = null;
    }
}
