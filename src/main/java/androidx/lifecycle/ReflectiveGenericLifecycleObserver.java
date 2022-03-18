package androidx.lifecycle;

import androidx.lifecycle.C1151c;
import androidx.lifecycle.Lifecycle;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements AbstractC1168n {

    /* renamed from: a */
    private final Object f4208a;

    /* renamed from: b */
    private final C1151c.C1152a f4209b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4208a = obj;
        this.f4209b = C1151c.f4266a.mo6013b(obj.getClass());
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f4209b.mo6014a(lifecycleOwner, event, this.f4208a);
    }
}
