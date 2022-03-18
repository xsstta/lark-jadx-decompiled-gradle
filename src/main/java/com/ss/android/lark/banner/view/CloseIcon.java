package com.ss.android.lark.banner.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
public class CloseIcon extends View {

    /* renamed from: a */
    private Paint f73724a;

    /* renamed from: b */
    private Path f73725b;

    /* renamed from: c */
    private int f73726c = UIUtils.getColor(getContext(), R.color.lkui_N600);

    /* renamed from: d */
    private float f73727d = TypedValue.applyDimension(1, 1.3f, UIUtils.getDisplayMetrics(getContext()));

    /* renamed from: e */
    private boolean f73728e;

    /* renamed from: a */
    public void mo104527a(int i) {
        this.f73726c = i;
        this.f73728e = true;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        Paint paint = this.f73724a;
        if (paint == null) {
            Paint paint2 = new Paint();
            this.f73724a = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f73724a.setColor(this.f73726c);
            this.f73724a.setStrokeWidth(this.f73727d);
            this.f73728e = false;
        } else if (this.f73728e) {
            paint.setColor(this.f73726c);
            this.f73724a.setStrokeWidth(this.f73727d);
            this.f73728e = false;
        }
        Path path = this.f73725b;
        if (path == null) {
            this.f73725b = new Path();
        } else {
            path.reset();
        }
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = width - getPaddingEnd();
        int paddingBottom = height - getPaddingBottom();
        float f = (float) paddingStart;
        float f2 = (float) paddingTop;
        this.f73725b.moveTo(f, f2);
        float f3 = (float) paddingEnd;
        float f4 = (float) paddingBottom;
        this.f73725b.lineTo(f3, f4);
        this.f73725b.moveTo(f, f4);
        this.f73725b.lineTo(f3, f2);
        this.f73725b.close();
        canvas.drawPath(this.f73725b, this.f73724a);
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
