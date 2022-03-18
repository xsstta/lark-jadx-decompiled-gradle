package com.ss.android.lark.widget.dialog.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58433a;

public class AnnularView extends View implements AbstractC58433a {

    /* renamed from: a */
    private Paint f143838a;

    /* renamed from: b */
    private Paint f143839b;

    /* renamed from: c */
    private RectF f143840c;

    /* renamed from: d */
    private int f143841d = 100;

    /* renamed from: e */
    private int f143842e;

    @Override // com.ss.android.lark.widget.dialog.loadingdialog.AbstractC58433a
    public void setMax(int i) {
        this.f143841d = i;
    }

    public void setProgress(int i) {
        this.f143842e = i;
        invalidate();
    }

    public AnnularView(Context context) {
        super(context);
        m226521a(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (((float) this.f143842e) * 360.0f) / ((float) this.f143841d);
        canvas.drawArc(this.f143840c, 270.0f, f, false, this.f143838a);
        canvas.drawArc(this.f143840c, f + 270.0f, 360.0f - f, false, this.f143839b);
    }

    /* renamed from: a */
    private void m226521a(Context context) {
        Paint paint = new Paint(1);
        this.f143838a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f143838a.setStrokeWidth((float) UIUtils.dp2px(getContext(), 3.0f));
        this.f143838a.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f143839b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f143839b.setStrokeWidth((float) UIUtils.dp2px(getContext(), 3.0f));
        this.f143839b.setColor(C25653b.m91893a(context.getResources().getColor(R.color.lkui_N500), 0.26f));
        this.f143840c = new RectF();
    }

    public AnnularView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226521a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dp2px = UIUtils.dp2px(getContext(), 40.0f);
        setMeasuredDimension(dp2px, dp2px);
    }

    public AnnularView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226521a(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int dp2px = UIUtils.dp2px(getContext(), 4.0f);
        float f = (float) dp2px;
        this.f143840c.set(f, f, (float) (i - dp2px), (float) (i2 - dp2px));
    }
}
