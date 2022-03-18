package com.ss.android.vc.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.vc.common.p3083e.C60773o;

public class RippleView extends RelativeLayout implements Runnable {

    /* renamed from: a */
    private final int f152083a;

    /* renamed from: b */
    private int f152084b;

    /* renamed from: c */
    private Paint f152085c;

    public void run() {
        int i = this.f152084b + 1;
        this.f152084b = i;
        if (i >= 40) {
            this.f152084b = 1;
        }
        invalidate();
    }

    /* renamed from: a */
    private void m236359a() {
        Paint paint = new Paint();
        this.f152085c = paint;
        paint.setAntiAlias(true);
        this.f152085c.setStyle(Paint.Style.STROKE);
        this.f152085c.setColor(-1);
        this.f152085c.setStrokeWidth(2.0f);
    }

    public RippleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        View childAt = getChildAt(0);
        int width = childAt.getWidth();
        int height = childAt.getHeight();
        if (width != 0 && height != 0) {
            int i = width / 2;
            float x = childAt.getX() + ((float) i);
            float y = childAt.getY() + ((float) (height / 2));
            float width2 = ((float) (((getWidth() / 2) - i) - this.f152083a)) / 19.0f;
            int i2 = this.f152084b;
            if (i2 < 20) {
                this.f152085c.setAlpha(((20 - i2) * 230) / 20);
                canvas.drawCircle(x, y, ((float) (this.f152083a + i)) + (((float) (this.f152084b - 1)) * width2), this.f152085c);
            }
            int i3 = this.f152084b;
            if (i3 > 10 && i3 < 30) {
                this.f152085c.setAlpha(((30 - i3) * 230) / 20);
                canvas.drawCircle(x, y, ((float) (i + this.f152083a)) + (width2 * ((float) (this.f152084b - 11))), this.f152085c);
            }
            postDelayed(this, 32);
        }
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152083a = C60773o.m236115a(3.0d);
        this.f152084b = 1;
        m236359a();
    }
}
