package com.larksuite.framework.ui.dragger;

import android.view.View;

/* renamed from: com.larksuite.framework.ui.dragger.e */
public class C26204e extends AbstractC26202c {

    /* renamed from: a */
    private View f64703a;

    @Override // com.larksuite.framework.ui.dragger.AbstractC26202c
    /* renamed from: a */
    public String mo93193a() {
        return "DragMoveEvent";
    }

    /* renamed from: b */
    public View mo93207b() {
        return this.f64703a;
    }

    public C26204e(float f, float f2, float f3, float f4, int i, int i2, View view, C26208i iVar, View view2) {
        super(f, f2, f3, f4, i, i2, view, iVar);
        this.f64703a = view2;
    }
}
