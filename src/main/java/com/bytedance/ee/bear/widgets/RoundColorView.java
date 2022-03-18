package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.ui.ColorUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RoundColorView extends View {

    /* renamed from: a */
    private int f31788a;

    /* renamed from: b */
    private int f31789b;

    /* renamed from: c */
    private float f31790c = -1.0f;

    /* renamed from: d */
    private boolean f31791d;

    /* renamed from: e */
    private boolean f31792e;

    /* renamed from: f */
    private Paint f31793f;

    /* renamed from: g */
    private RectF f31794g;

    public int getColor() {
        return this.f31788a;
    }

    public int getInnerBorderColor() {
        return this.f31789b;
    }

    private Paint getPaint() {
        if (this.f31793f == null) {
            this.f31793f = new Paint(1);
        }
        return this.f31793f;
    }

    private RectF getBounds() {
        if (this.f31794g == null) {
            this.f31794g = new RectF();
        }
        this.f31794g.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
        return this.f31794g;
    }

    private float getOffset() {
        if (this.f31790c == -1.0f) {
            double width = (double) getWidth();
            this.f31790c = (float) (((double) ((float) ((Math.sqrt(Math.pow(width, 2.0d) * 2.0d) - width) / 2.0d))) / Math.sqrt(2.0d));
        }
        return this.f31790c;
    }

    public void setClear(boolean z) {
        this.f31791d = z;
    }

    public void setNeedBorder(boolean z) {
        this.f31792e = z;
    }

    public RoundColorView(Context context) {
        super(context);
        m48974a(null);
    }

    public void setColor(int i) {
        if (this.f31788a != i) {
            this.f31788a = i;
            invalidate();
        }
    }

    public void setInnerBorderColor(int i) {
        if (this.f31789b != i) {
            this.f31789b = i;
            invalidate();
        }
    }

    /* renamed from: a */
    private void m48974a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.color, R.attr.innerBorderColor}, 0, 0);
            int color = obtainStyledAttributes.getColor(0, this.f31788a);
            this.f31788a = color;
            this.f31789b = obtainStyledAttributes.getColor(1, color);
            obtainStyledAttributes.recycle();
        }
    }

    private void setBorderColor(String str) {
        boolean z;
        if (TextUtils.equals(str, "#f5f5f5") || TextUtils.equals(str, "#ffffff")) {
            z = true;
        } else {
            z = false;
        }
        this.f31792e = z;
        if (z) {
            setInnerBorderColor(ColorUtils.m55698a(str, getContext().getResources().getColor(R.color.space_kit_n300)));
        }
    }

    public void setColor(String str) {
        setBorderColor(str);
        try {
            setColor(Color.parseColor(str));
        } catch (Exception unused) {
            C13479a.m54758a("RoundColorView", "Bad color :" + str);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) getWidth();
        float height = (float) getHeight();
        Paint paint = getPaint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f31788a);
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        canvas.drawRoundRect(getBounds(), f, f2, paint);
        int a = C13749l.m55738a(1);
        if (this.f31792e) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.f31789b);
            float f3 = (float) a;
            paint.setStrokeWidth(f3);
            canvas.drawCircle(f, f2, f - (f3 / 2.0f), paint);
        }
        if (this.f31791d) {
            paint.setColor(-65536);
            float offset = getOffset() + (((float) a) / 2.0f);
            canvas.drawLine(offset, offset, width - offset, height - offset, paint);
        }
    }

    public RoundColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48974a(attributeSet);
    }

    public RoundColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48974a(attributeSet);
    }
}
