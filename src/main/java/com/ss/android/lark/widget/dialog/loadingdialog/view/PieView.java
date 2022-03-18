package com.ss.android.lark.widget.dialog.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58433a;

public class PieView extends View implements AbstractC58433a {

    /* renamed from: a */
    private Paint f143852a;

    /* renamed from: b */
    private Paint f143853b;

    /* renamed from: c */
    private RectF f143854c;

    /* renamed from: d */
    private int f143855d = 100;

    /* renamed from: e */
    private int f143856e;

    /* renamed from: a */
    private void m226525a() {
        Paint paint = new Paint(1);
        this.f143852a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f143852a.setStrokeWidth((float) UIUtils.dp2px(getContext(), 0.1f));
        this.f143852a.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f143853b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f143853b.setStrokeWidth((float) UIUtils.dp2px(getContext(), 2.0f));
        this.f143853b.setColor(-1);
        this.f143854c = new RectF();
    }

    @Override // com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58433a
    public void setMax(int i) {
        this.f143855d = i;
    }

    public void setProgress(int i) {
        this.f143856e = i;
        invalidate();
    }

    public PieView(Context context) {
        super(context);
        m226525a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f143854c, 270.0f, (((float) this.f143856e) * 360.0f) / ((float) this.f143855d), true, this.f143852a);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) ((getWidth() / 2) - UIUtils.dp2px(getContext(), 4.0f)), this.f143853b);
    }

    public PieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226525a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dp2px = UIUtils.dp2px(getContext(), 40.0f);
        setMeasuredDimension(dp2px, dp2px);
    }

    public PieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226525a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int dp2px = UIUtils.dp2px(getContext(), 4.0f);
        float f = (float) dp2px;
        this.f143854c.set(f, f, (float) (i - dp2px), (float) (i2 - dp2px));
    }
}
