package com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4139a;
import com.larksuite.suite.R;

public class AnnularView extends View implements AbstractC4139a {

    /* renamed from: a */
    private Paint f12564a;

    /* renamed from: b */
    private Paint f12565b;

    /* renamed from: c */
    private RectF f12566c;

    /* renamed from: d */
    private int f12567d = 100;

    /* renamed from: e */
    private int f12568e;

    @Override // com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.AbstractC4139a
    public void setMax(int i) {
        this.f12567d = i;
    }

    public void setProgress(int i) {
        this.f12568e = i;
        invalidate();
    }

    public AnnularView(Context context) {
        super(context);
        m17235a(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (((float) this.f12568e) * 360.0f) / ((float) this.f12567d);
        canvas.drawArc(this.f12566c, 270.0f, f, false, this.f12564a);
        canvas.drawArc(this.f12566c, f + 270.0f, 360.0f - f, false, this.f12565b);
    }

    /* renamed from: a */
    private void m17235a(Context context) {
        Paint paint = new Paint(1);
        this.f12564a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f12564a.setStrokeWidth((float) UIHelper.f12487a.mo16121a(getContext(), 3.0f));
        this.f12564a.setColor(-1);
        Paint paint2 = new Paint(1);
        this.f12565b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f12565b.setStrokeWidth((float) UIHelper.f12487a.mo16121a(getContext(), 3.0f));
        this.f12565b.setColor(context.getResources().getColor(R.color.file_picker_loading_dialog_grey_color));
        this.f12566c = new RectF();
    }

    public AnnularView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17235a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a = UIHelper.f12487a.mo16121a(getContext(), 40.0f);
        setMeasuredDimension(a, a);
    }

    public AnnularView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17235a(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int a = UIHelper.f12487a.mo16121a(getContext(), 4.0f);
        float f = (float) a;
        this.f12566c.set(f, f, (float) (i - a), (float) (i2 - a));
    }
}
