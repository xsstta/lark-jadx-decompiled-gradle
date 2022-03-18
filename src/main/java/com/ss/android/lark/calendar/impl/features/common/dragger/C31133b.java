package com.ss.android.lark.calendar.impl.features.common.dragger;

import android.view.View;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.b */
public class C31133b extends AbstractC31134c {

    /* renamed from: a */
    private View f78636a;

    @Override // com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31134c
    /* renamed from: c */
    public String mo112750c() {
        return "DragEndEvent";
    }

    /* renamed from: d */
    public View mo112751d() {
        return this.f78636a;
    }

    public C31133b(float f, float f2, float f3, float f4, int i, int i2, View view, C31140i iVar, View view2) {
        super(f, f2, f3, f4, i, i2, view, iVar);
        this.f78636a = view2;
    }
}
