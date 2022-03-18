package com.larksuite.framework.ui.p1197a;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: com.larksuite.framework.ui.a.a */
public class C26177a extends ColorDrawable {

    /* renamed from: a */
    private Drawable f64659a;

    /* renamed from: a */
    public Drawable mo93156a() {
        return this.f64659a;
    }

    C26177a(Drawable drawable) {
        this.f64659a = drawable;
        setColor(-16777216);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f64659a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }
}
