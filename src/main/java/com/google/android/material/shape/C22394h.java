package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C22365r;

/* renamed from: com.google.android.material.shape.h */
public class C22394h {
    /* renamed from: a */
    static C22390d m81145a() {
        return new C22397k();
    }

    /* renamed from: b */
    static C22392f m81150b() {
        return new C22392f();
    }

    /* renamed from: a */
    public static void m81147a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            m81149a(view, (MaterialShapeDrawable) background);
        }
    }

    /* renamed from: a */
    static C22390d m81146a(int i) {
        if (i == 0) {
            return new C22397k();
        }
        if (i != 1) {
            return m81145a();
        }
        return new C22391e();
    }

    /* renamed from: a */
    public static void m81148a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).mo77985r(f);
        }
    }

    /* renamed from: a */
    public static void m81149a(View view, MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.mo77951P()) {
            materialShapeDrawable.mo77984q(C22365r.m81027d(view));
        }
    }
}
