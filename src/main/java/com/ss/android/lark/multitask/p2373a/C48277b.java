package com.ss.android.lark.multitask.p2373a;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: com.ss.android.lark.multitask.a.b */
public class C48277b extends LayerDrawable {

    /* renamed from: a */
    Path f121565a = new Path();

    public C48277b(Drawable[] drawableArr) {
        super(drawableArr);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f121565a);
        super.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f121565a.reset();
        this.f121565a.addCircle((float) rect.right, (float) rect.bottom, (float) rect.width(), Path.Direction.CW);
    }
}
