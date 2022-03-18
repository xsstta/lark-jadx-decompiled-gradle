package com.ss.android.lark.multitask.p2373a;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;

/* renamed from: com.ss.android.lark.multitask.a.a */
public class C48276a extends ColorDrawable {

    /* renamed from: a */
    Path f121564a = new Path();

    public C48276a(int i) {
        super(i);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f121564a);
        super.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f121564a.reset();
        this.f121564a.addCircle((float) rect.right, (float) rect.bottom, (float) rect.width(), Path.Direction.CW);
    }
}
