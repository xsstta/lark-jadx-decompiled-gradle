package com.ss.android.lark.widget.dialog.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58433a;

public class BarView extends View implements AbstractC58433a {

    /* renamed from: a */
    private Paint f143845a;

    /* renamed from: b */
    private Paint f143846b;

    /* renamed from: c */
    private RectF f143847c;

    /* renamed from: d */
    private RectF f143848d;

    /* renamed from: e */
    private int f143849e = 100;

    /* renamed from: f */
    private int f143850f;

    /* renamed from: g */
    private float f143851g;

    /* renamed from: a */
    private void m226524a() {
        Paint paint = new Paint(1);
        this.f143845a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f143845a.setStrokeWidth((float) UIUtils.dp2px(getContext(), 2.0f));
        this.f143845a.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f143846b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f143846b.setColor(-1);
        this.f143851g = (float) UIUtils.dp2px(getContext(), 5.0f);
        float f = this.f143851g;
        this.f143848d = new RectF(f, f, ((((float) getWidth()) - this.f143851g) * ((float) this.f143850f)) / ((float) this.f143849e), ((float) getHeight()) - this.f143851g);
        this.f143847c = new RectF();
    }

    @Override // com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58433a
    public void setMax(int i) {
        this.f143849e = i;
    }

    public BarView(Context context) {
        super(context);
        m226524a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f143847c;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f143847c.height() / 2.0f, this.f143845a);
        RectF rectF2 = this.f143848d;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f143848d.height() / 2.0f, this.f143846b);
    }

    public void setProgress(int i) {
        this.f143850f = i;
        RectF rectF = this.f143848d;
        float f = this.f143851g;
        rectF.set(f, f, ((((float) getWidth()) - this.f143851g) * ((float) this.f143850f)) / ((float) this.f143849e), ((float) getHeight()) - this.f143851g);
        invalidate();
    }

    public BarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226524a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(UIUtils.dp2px(getContext(), 100.0f), UIUtils.dp2px(getContext(), 20.0f));
    }

    public BarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226524a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int dp2px = UIUtils.dp2px(getContext(), 2.0f);
        float f = (float) dp2px;
        this.f143847c.set(f, f, (float) (i - dp2px), (float) (i2 - dp2px));
    }
}
