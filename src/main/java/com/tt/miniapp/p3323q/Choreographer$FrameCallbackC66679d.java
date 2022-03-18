package com.tt.miniapp.p3323q;

import android.view.Choreographer;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AppbrandContext;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tt.miniapp.q.d */
public class Choreographer$FrameCallbackC66679d extends AbstractC66676a implements Choreographer.FrameCallback {

    /* renamed from: c */
    public WeakReference<C66678c> f168332c;

    /* renamed from: d */
    private long f168333d = -1;

    /* renamed from: e */
    private int f168334e;

    /* renamed from: f */
    private Choreographer f168335f;

    /* renamed from: g */
    private IAppContext f168336g;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3323q.AbstractC66676a
    /* renamed from: b */
    public void mo232429b() {
        this.f168335f.postFrameCallback(this);
    }

    /* renamed from: c */
    private void m260429c() {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.p3323q.Choreographer$FrameCallbackC66679d.RunnableC666801 */

            public void run() {
                if (Choreographer$FrameCallbackC66679d.this.f168332c != null && Choreographer$FrameCallbackC66679d.this.f168332c.get() != null) {
                    Choreographer$FrameCallbackC66679d.this.f168332c.get().mo232431a();
                }
            }
        });
    }

    public void doFrame(long j) {
        if (this.f168333d == -1) {
            this.f168333d = j;
            this.f168334e = 0;
        }
        long j2 = j - this.f168333d;
        if (j2 > TimeUnit.MILLISECONDS.toNanos(200)) {
            float nanos = ((((float) this.f168334e) * 1.0f) * ((float) TimeUnit.SECONDS.toNanos(1))) / ((float) j2);
            if (this.f168336g.isDestroying() || this.f168336g.isDestroyed()) {
                this.f168335f.removeFrameCallback(this);
                return;
            }
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f168336g);
            if (inst == null) {
                this.f168335f.removeFrameCallback(this);
                return;
            }
            C66689h.m260456b(inst.getForeBackgroundManager().mo231961c(), Math.round(nanos), this.f168336g);
            this.f168333d = -1;
            if (this.f168332c != null) {
                m260429c();
                return;
            }
            return;
        }
        this.f168334e++;
        this.f168335f.postFrameCallback(this);
    }

    public Choreographer$FrameCallbackC66679d(Choreographer choreographer, IAppContext iAppContext) {
        super(9999);
        this.f168335f = choreographer;
        this.f168336g = iAppContext;
    }
}
