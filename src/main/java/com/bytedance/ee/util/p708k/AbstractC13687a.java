package com.bytedance.ee.util.p708k;

import androidx.lifecycle.AbstractC1178x;

/* renamed from: com.bytedance.ee.util.k.a */
public abstract class AbstractC13687a<T> implements AbstractC1178x<T> {

    /* renamed from: a */
    private T f35887a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18510a(T t);

    @Override // androidx.lifecycle.AbstractC1178x
    public void onChanged(T t) {
        if (t == null) {
            if (this.f35887a != null) {
                mo18510a(null);
                this.f35887a = null;
            }
        } else if (!t.equals(this.f35887a)) {
            mo18510a(t);
            this.f35887a = t;
        }
    }
}
