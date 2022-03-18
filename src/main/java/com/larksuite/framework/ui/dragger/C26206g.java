package com.larksuite.framework.ui.dragger;

import android.view.View;

/* renamed from: com.larksuite.framework.ui.dragger.g */
public class C26206g extends AbstractC26202c {

    /* renamed from: a */
    private View f64705a;

    @Override // com.larksuite.framework.ui.dragger.AbstractC26202c
    /* renamed from: a */
    public String mo93193a() {
        return "DragStartEvent";
    }

    /* renamed from: b */
    public View mo93209b() {
        return this.f64705a;
    }

    public C26206g(float f, float f2, float f3, float f4, int i, int i2, View view, C26208i iVar, View view2) {
        super(f, f2, f3, f4, i, i2, view, iVar);
        this.f64705a = view2;
    }
}
