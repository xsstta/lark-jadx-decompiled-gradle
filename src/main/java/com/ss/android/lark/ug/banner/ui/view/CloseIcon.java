package com.ss.android.lark.ug.banner.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class CloseIcon extends View {

    /* renamed from: a */
    private Paint f141325a;

    /* renamed from: b */
    private Path f141326b;

    /* renamed from: c */
    private int f141327c = UIUtils.getColor(getContext(), R.color.lkui_N600);

    /* renamed from: d */
    private float f141328d = TypedValue.applyDimension(1, 1.3f, UIUtils.getDisplayMetrics(getContext()));

    /* renamed from: e */
    private boolean f141329e;

    public void setIconColor(int i) {
        this.f141327c = i;
        this.f141329e = true;
        postInvalidate();
    }

    public void setIconLineWidth(float f) {
        this.f141328d = f;
        this.f141329e = true;
        postInvalidate();
    }

    public CloseIcon(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        Paint paint = this.f141325a;
        if (paint == null) {
            Paint paint2 = new Paint();
            this.f141325a = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f141325a.setColor(this.f141327c);
            this.f141325a.setStrokeWidth(this.f141328d);
            this.f141329e = false;
        } else if (this.f141329e) {
            paint.setColor(this.f141327c);
            this.f141325a.setStrokeWidth(this.f141328d);
            this.f141329e = false;
        }
        Path path = this.f141326b;
        if (path == null) {
            this.f141326b = new Path();
        } else {
            path.reset();
        }
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = width - getPaddingEnd();
        int paddingBottom = height - getPaddingBottom();
        float f = (float) paddingStart;
        float f2 = (float) paddingTop;
        this.f141326b.moveTo(f, f2);
        float f3 = (float) paddingEnd;
        float f4 = (float) paddingBottom;
        this.f141326b.lineTo(f3, f4);
        this.f141326b.moveTo(f, f4);
        this.f141326b.lineTo(f3, f2);
        this.f141326b.close();
        canvas.drawPath(this.f141326b, this.f141325a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public CloseIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CloseIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
