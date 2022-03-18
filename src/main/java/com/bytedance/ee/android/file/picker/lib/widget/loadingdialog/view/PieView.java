package com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4139a;

public class PieView extends View implements AbstractC4139a {

    /* renamed from: a */
    private Paint f12578a;

    /* renamed from: b */
    private Paint f12579b;

    /* renamed from: c */
    private RectF f12580c;

    /* renamed from: d */
    private int f12581d = 100;

    /* renamed from: e */
    private int f12582e;

    /* renamed from: a */
    private void m17239a() {
        Paint paint = new Paint(1);
        this.f12578a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12578a.setStrokeWidth((float) UIHelper.f12487a.mo16121a(getContext(), 0.1f));
        this.f12578a.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f12579b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f12579b.setStrokeWidth((float) UIHelper.f12487a.mo16121a(getContext(), 2.0f));
        this.f12579b.setColor(-1);
        this.f12580c = new RectF();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4139a
    public void setMax(int i) {
        this.f12581d = i;
    }

    public void setProgress(int i) {
        this.f12582e = i;
        invalidate();
    }

    public PieView(Context context) {
        super(context);
        m17239a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f12580c, 270.0f, (((float) this.f12582e) * 360.0f) / ((float) this.f12581d), true, this.f12578a);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) ((getWidth() / 2) - UIHelper.f12487a.mo16121a(getContext(), 4.0f)), this.f12579b);
    }

    public PieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17239a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a = UIHelper.f12487a.mo16121a(getContext(), 40.0f);
        setMeasuredDimension(a, a);
    }

    public PieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17239a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int a = UIHelper.f12487a.mo16121a(getContext(), 4.0f);
        float f = (float) a;
        this.f12580c.set(f, f, (float) (i - a), (float) (i2 - a));
    }
}
