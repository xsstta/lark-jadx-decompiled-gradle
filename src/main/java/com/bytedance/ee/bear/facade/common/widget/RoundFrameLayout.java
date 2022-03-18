package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a */
    private float[] f20882a;

    /* renamed from: b */
    private Path f20883b;

    /* renamed from: c */
    private RectF f20884c;

    /* renamed from: d */
    private int f20885d;

    public RoundFrameLayout(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f20883b);
        super.draw(canvas);
        canvas.restore();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m30898a(Context context, AttributeSet attributeSet) {
        int i;
        float[] fArr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bottom_left_radius, R.attr.bottom_right_radius, R.attr.radius, R.attr.top_left_radius, R.attr.top_right_radius});
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        boolean hasValue2 = obtainStyledAttributes.hasValue(3);
        boolean hasValue3 = obtainStyledAttributes.hasValue(4);
        boolean hasValue4 = obtainStyledAttributes.hasValue(0);
        boolean hasValue5 = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            i = obtainStyledAttributes.getDimensionPixelOffset(2, this.f20885d);
        } else {
            i = this.f20885d;
        }
        float f = (float) i;
        int i2 = 0;
        while (true) {
            fArr = this.f20882a;
            if (i2 >= fArr.length) {
                break;
            }
            fArr[i2] = f;
            i2++;
        }
        if (hasValue2) {
            fArr[0] = (float) obtainStyledAttributes.getDimensionPixelSize(3, this.f20885d);
            this.f20882a[1] = (float) obtainStyledAttributes.getDimensionPixelSize(3, this.f20885d);
        }
        if (hasValue3) {
            this.f20882a[2] = (float) obtainStyledAttributes.getDimensionPixelSize(4, this.f20885d);
            this.f20882a[3] = (float) obtainStyledAttributes.getDimensionPixelSize(4, this.f20885d);
        }
        if (hasValue5) {
            this.f20882a[4] = (float) obtainStyledAttributes.getDimensionPixelSize(1, this.f20885d);
            this.f20882a[5] = (float) obtainStyledAttributes.getDimensionPixelSize(1, this.f20885d);
        }
        if (hasValue4) {
            this.f20882a[6] = (float) obtainStyledAttributes.getDimensionPixelSize(0, this.f20885d);
            this.f20882a[7] = (float) obtainStyledAttributes.getDimensionPixelSize(0, this.f20885d);
        }
        obtainStyledAttributes.recycle();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20882a = new float[8];
        this.f20883b = new Path();
        this.f20884c = new RectF();
        this.f20885d = C13749l.m55738a(8);
        m30898a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo30242a(int i, int i2, int i3, int i4) {
        float[] fArr = this.f20882a;
        float f = (float) i;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = (float) i2;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = (float) i3;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = (float) i4;
        fArr[6] = f4;
        fArr[7] = f4;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f20884c.left = BitmapDescriptorFactory.HUE_RED;
        this.f20884c.top = BitmapDescriptorFactory.HUE_RED;
        this.f20884c.right = (float) getWidth();
        this.f20884c.bottom = (float) getHeight();
        this.f20883b.rewind();
        this.f20883b.addRoundRect(this.f20884c, this.f20882a, Path.Direction.CW);
    }
}
