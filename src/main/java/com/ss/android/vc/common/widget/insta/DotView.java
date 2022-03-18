package com.ss.android.vc.common.widget.insta;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DotView extends View {

    /* renamed from: a */
    private EnumC60866a f152375a;

    /* renamed from: b */
    private Paint f152376b;

    /* renamed from: c */
    private int f152377c;

    /* renamed from: com.ss.android.vc.common.widget.insta.DotView$a */
    enum EnumC60866a {
        PLACEHOLDER,
        ACTIVE,
        INACTIVE
    }

    public EnumC60866a getState() {
        return this.f152375a;
    }

    public DotView(Context context) {
        super(context);
    }

    public void setState(EnumC60866a aVar) {
        this.f152375a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f152375a != EnumC60866a.PLACEHOLDER) {
            m236581a(canvas);
        }
    }

    /* renamed from: a */
    private void m236581a(Canvas canvas) {
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f152377c, this.f152376b);
    }

    public DotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo208699a(Paint paint, int i) {
        this.f152376b = paint;
        if (i >= 0) {
            this.f152377c = i;
        }
        invalidate();
    }
}
