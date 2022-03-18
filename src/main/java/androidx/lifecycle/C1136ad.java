package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.ad */
public class C1136ad {

    /* renamed from: a */
    private final LifecycleRegistry f4244a;

    /* renamed from: b */
    private final Handler f4245b = new Handler();

    /* renamed from: c */
    private RunnableC1137a f4246c;

    /* renamed from: e */
    public Lifecycle mo5996e() {
        return this.f4244a;
    }

    /* renamed from: a */
    public void mo5992a() {
        m5348a(Lifecycle.Event.ON_CREATE);
    }

    /* renamed from: b */
    public void mo5993b() {
        m5348a(Lifecycle.Event.ON_START);
    }

    /* renamed from: c */
    public void mo5994c() {
        m5348a(Lifecycle.Event.ON_START);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ad$a */
    public static class RunnableC1137a implements Runnable {

        /* renamed from: a */
        final Lifecycle.Event f4247a;

        /* renamed from: b */
        private final LifecycleRegistry f4248b;

        /* renamed from: c */
        private boolean f4249c;

        public void run() {
            if (!this.f4249c) {
                this.f4248b.handleLifecycleEvent(this.f4247a);
                this.f4249c = true;
            }
        }

        RunnableC1137a(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            this.f4248b = lifecycleRegistry;
            this.f4247a = event;
        }
    }

    /* renamed from: d */
    public void mo5995d() {
        m5348a(Lifecycle.Event.ON_STOP);
        m5348a(Lifecycle.Event.ON_DESTROY);
    }

    public C1136ad(LifecycleOwner lifecycleOwner) {
        this.f4244a = new LifecycleRegistry(lifecycleOwner);
    }

    /* renamed from: a */
    private void m5348a(Lifecycle.Event event) {
        RunnableC1137a aVar = this.f4246c;
        if (aVar != null) {
            aVar.run();
        }
        RunnableC1137a aVar2 = new RunnableC1137a(this.f4244a, event);
        this.f4246c = aVar2;
        this.f4245b.postAtFrontOfQueue(aVar2);
    }
}
