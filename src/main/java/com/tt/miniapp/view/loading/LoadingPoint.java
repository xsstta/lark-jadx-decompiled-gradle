package com.tt.miniapp.view.loading;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;

public class LoadingPoint extends View {

    /* renamed from: a */
    int f169543a = Color.parseColor("#ff000000");

    /* renamed from: b */
    Paint f169544b = new Paint();

    /* renamed from: c */
    private Scroller f169545c;

    public int getColor() {
        return this.f169543a;
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f169545c.computeScrollOffset()) {
            ((View) getParent()).scrollTo(this.f169545c.getCurrX(), this.f169545c.getCurrY());
            invalidate();
        }
    }

    public void setColor(int i) {
        this.f169543a = i;
        invalidate();
    }

    public LoadingPoint(Context context) {
        super(context);
        this.f169545c = new Scroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f169544b.setColor(this.f169543a);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (getWidth() / 2), this.f169544b);
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public void mo233628a(int i, int i2) {
        this.f169545c.startScroll(getScrollX(), getScrollY(), i, i2, 1);
        invalidate();
    }

    public LoadingPoint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoadingPoint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
