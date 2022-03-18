package com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4139a;

public class BarView extends View implements AbstractC4139a {

    /* renamed from: a */
    private Paint f12571a;

    /* renamed from: b */
    private Paint f12572b;

    /* renamed from: c */
    private RectF f12573c;

    /* renamed from: d */
    private RectF f12574d;

    /* renamed from: e */
    private int f12575e = 100;

    /* renamed from: f */
    private int f12576f;

    /* renamed from: g */
    private float f12577g;

    /* renamed from: a */
    private void m17238a() {
        Paint paint = new Paint(1);
        this.f12571a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f12571a.setStrokeWidth((float) UIHelper.f12487a.mo16121a(getContext(), 2.0f));
        this.f12571a.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f12572b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f12572b.setColor(-1);
        this.f12577g = (float) UIHelper.f12487a.mo16121a(getContext(), 5.0f);
        float f = this.f12577g;
        this.f12574d = new RectF(f, f, ((((float) getWidth()) - this.f12577g) * ((float) this.f12576f)) / ((float) this.f12575e), ((float) getHeight()) - this.f12577g);
        this.f12573c = new RectF();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4139a
    public void setMax(int i) {
        this.f12575e = i;
    }

    public BarView(Context context) {
        super(context);
        m17238a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f12573c;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f12573c.height() / 2.0f, this.f12571a);
        RectF rectF2 = this.f12574d;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f12574d.height() / 2.0f, this.f12572b);
    }

    public void setProgress(int i) {
        this.f12576f = i;
        RectF rectF = this.f12574d;
        float f = this.f12577g;
        rectF.set(f, f, ((((float) getWidth()) - this.f12577g) * ((float) this.f12576f)) / ((float) this.f12575e), ((float) getHeight()) - this.f12577g);
        invalidate();
    }

    public BarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17238a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(UIHelper.f12487a.mo16121a(getContext(), 100.0f), UIHelper.f12487a.mo16121a(getContext(), 20.0f));
    }

    public BarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17238a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int a = UIHelper.f12487a.mo16121a(getContext(), 2.0f);
        float f = (float) a;
        this.f12573c.set(f, f, (float) (i - a), (float) (i2 - a));
    }
}
