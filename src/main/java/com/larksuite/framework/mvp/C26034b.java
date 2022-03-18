package com.larksuite.framework.mvp;

import com.larksuite.framework.mvp.IView;
import com.larksuite.framework.mvp.IView.IViewDelegate;

/* renamed from: com.larksuite.framework.mvp.b */
public class C26034b<VD extends IView.IViewDelegate> implements IView<VD> {

    /* renamed from: a */
    private VD f64443a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f64443a = null;
    }

    /* renamed from: c */
    public VD mo92555c() {
        return this.f64443a;
    }

    @Override // com.larksuite.framework.mvp.IView
    public void setViewDelegate(VD vd) {
        this.f64443a = vd;
    }
}
