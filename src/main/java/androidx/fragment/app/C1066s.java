package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.s */
public class C1066s implements LifecycleOwner {

    /* renamed from: a */
    private LifecycleRegistry f4040a;

    C1066s() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5690b() {
        if (this.f4040a != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        mo5687a();
        return this.f4040a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5687a() {
        if (this.f4040a == null) {
            this.f4040a = new LifecycleRegistry(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5688a(Lifecycle.Event event) {
        this.f4040a.handleLifecycleEvent(event);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5689a(Lifecycle.State state) {
        this.f4040a.setCurrentState(state);
    }
}
