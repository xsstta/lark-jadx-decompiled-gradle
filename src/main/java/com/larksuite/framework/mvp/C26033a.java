package com.larksuite.framework.mvp;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

/* renamed from: com.larksuite.framework.mvp.a */
public class C26033a<M extends IModel, V extends IView> implements AbstractC26035c<M, V> {

    /* renamed from: a */
    private V f64441a;

    /* renamed from: b */
    private M f64442b;

    /* renamed from: a */
    public V mo92551a() {
        return this.f64441a;
    }

    /* renamed from: b */
    public M mo92554b() {
        return this.f64442b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f64441a.create();
        this.f64442b.create();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        M m = this.f64442b;
        if (m != null) {
            m.destroy();
        }
        V v = this.f64441a;
        if (v != null) {
            v.destroy();
        }
        this.f64442b = null;
        this.f64441a = null;
    }

    /* renamed from: a */
    public void mo92552a(V v) {
        this.f64441a = v;
    }

    /* renamed from: a */
    public void mo92553a(V v, M m) {
        this.f64441a = v;
        this.f64442b = m;
    }
}
