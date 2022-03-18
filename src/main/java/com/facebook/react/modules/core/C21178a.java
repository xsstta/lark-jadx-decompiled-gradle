package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.modules.core.a */
public class C21178a {

    /* renamed from: a */
    private static C21178a f51647a;

    /* renamed from: b */
    private Choreographer f51648b = m76908b();

    /* renamed from: b */
    private Choreographer m76908b() {
        return Choreographer.getInstance();
    }

    /* renamed from: com.facebook.react.modules.core.a$a */
    public static abstract class AbstractC21179a {

        /* renamed from: a */
        private Choreographer.FrameCallback f51649a;

        /* renamed from: a */
        public abstract void mo71964a(long j);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Choreographer.FrameCallback mo71977a() {
            if (this.f51649a == null) {
                this.f51649a = new Choreographer.FrameCallback() {
                    /* class com.facebook.react.modules.core.C21178a.AbstractC21179a.Choreographer$FrameCallbackC211801 */

                    public void doFrame(long j) {
                        AbstractC21179a.this.mo71964a(j);
                    }
                };
            }
            return this.f51649a;
        }
    }

    private C21178a() {
    }

    /* renamed from: a */
    public static C21178a m76906a() {
        UiThreadUtil.assertOnUiThread();
        if (f51647a == null) {
            f51647a = new C21178a();
        }
        return f51647a;
    }

    /* renamed from: a */
    private void m76907a(Choreographer.FrameCallback frameCallback) {
        this.f51648b.postFrameCallback(frameCallback);
    }

    /* renamed from: b */
    private void m76909b(Choreographer.FrameCallback frameCallback) {
        this.f51648b.removeFrameCallback(frameCallback);
    }

    /* renamed from: a */
    public void mo71975a(AbstractC21179a aVar) {
        m76907a(aVar.mo71977a());
    }

    /* renamed from: b */
    public void mo71976b(AbstractC21179a aVar) {
        m76909b(aVar.mo71977a());
    }
}
