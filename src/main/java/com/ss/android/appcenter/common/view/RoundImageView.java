package com.ss.android.appcenter.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RoundImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f70733a;

    /* renamed from: b */
    private int f70734b;

    /* renamed from: c */
    private int f70735c;

    /* renamed from: d */
    private Paint f70736d;

    /* renamed from: e */
    private Path f70737e;

    /* renamed from: f */
    private Paint f70738f;

    public RoundImageView(Context context) {
        super(context);
        m103314a((AttributeSet) null);
    }

    public void setCoverColor(int i) {
        this.f70734b = i;
        invalidate();
    }

    public void setRadius(int i) {
        this.f70735c = i;
        invalidate();
    }

    public void setShape(int i) {
        this.f70733a = i;
        invalidate();
    }

    /* renamed from: a */
    private void m103313a(Canvas canvas) {
        this.f70737e.addRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), Path.Direction.CCW);
        this.f70737e.addCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (Math.min(getWidth(), getHeight()) / 2), Path.Direction.CW);
        canvas.drawPath(this.f70737e, this.f70736d);
    }

    /* renamed from: b */
    private void m103315b(Canvas canvas) {
        this.f70737e.addRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), Path.Direction.CCW);
        this.f70737e.addCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) (Math.min(getWidth(), getHeight()) / 2), Path.Direction.CW);
        canvas.drawPath(this.f70737e, this.f70736d);
    }

    /* renamed from: c */
    private void m103316c(Canvas canvas) {
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
        this.f70737e.addRect(rectF, Path.Direction.CCW);
        Path path = this.f70737e;
        int i = this.f70735c;
        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
        canvas.drawPath(this.f70737e, this.f70736d);
    }

    /* renamed from: d */
    private void m103317d(Canvas canvas) {
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
        Path path = this.f70737e;
        int i = this.f70735c;
        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
        canvas.drawPath(this.f70737e, this.f70738f);
    }

    /* renamed from: a */
    private void m103314a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.cover_color, R.attr.radius, R.attr.shape});
        this.f70733a = obtainStyledAttributes.getInt(2, 0);
        this.f70734b = obtainStyledAttributes.getColor(0, -1);
        this.f70735c = obtainStyledAttributes.getDimensionPixelOffset(1, (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
        obtainStyledAttributes.recycle();
        this.f70736d = new Paint();
        this.f70738f = new Paint();
        this.f70736d.setColor(this.f70734b);
        this.f70736d.setAntiAlias(true);
        this.f70737e = new Path();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f70733a == 2) {
            canvas.save();
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            Path path = this.f70737e;
            int i = this.f70735c;
            path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
            canvas.clipPath(this.f70737e);
        }
        super.onDraw(canvas);
        int i2 = this.f70733a;
        if (i2 == 0) {
            m103315b(canvas);
        } else if (i2 == 1) {
            m103316c(canvas);
        } else if (i2 == 2) {
            m103317d(canvas);
            canvas.restore();
        } else if (i2 == 3) {
            m103313a(canvas);
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m103314a(attributeSet);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103314a(attributeSet);
    }

    /* renamed from: a */
    public void mo100433a(int i, float f, float f2) {
        this.f70738f.setColor(i);
        this.f70738f.setStrokeWidth(f);
        this.f70738f.setStyle(Paint.Style.STROKE);
        this.f70738f.setAntiAlias(true);
        this.f70735c = (int) f2;
        this.f70733a = 2;
        invalidate();
    }
}
