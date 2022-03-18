package com.larksuite.framework.ui.dragger;

import android.view.View;

/* renamed from: com.larksuite.framework.ui.dragger.d */
public class C26203d extends AbstractC26202c {

    /* renamed from: a */
    private View f64702a;

    @Override // com.larksuite.framework.ui.dragger.AbstractC26202c
    /* renamed from: a */
    public String mo93193a() {
        return "DragInEvent";
    }

    /* renamed from: b */
    public View mo93206b() {
        return this.f64702a;
    }

    public C26203d(float f, float f2, float f3, float f4, int i, int i2, View view, C26208i iVar, View view2) {
        super(f, f2, f3, f4, i, i2, view, iVar);
        this.f64702a = view2;
    }
}
