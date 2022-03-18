package com.ss.android.lark.notification.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SettingDividerView extends View {

    /* renamed from: a */
    private int f121894a;

    /* renamed from: b */
    private int f121895b;

    /* renamed from: c */
    private float f121896c;

    /* renamed from: d */
    private float f121897d;

    /* renamed from: e */
    private Paint f121898e;

    /* renamed from: f */
    private Paint f121899f;

    public SettingDividerView(Context context) {
        super(context);
        m191079a(null);
    }

    public void setLeftBlankWidth(float f) {
        this.f121896c = f;
        invalidate();
    }

    public void setRightBlankWidth(float f) {
        this.f121897d = f;
        invalidate();
    }

    public void setBlankColor(int i) {
        this.f121894a = i;
        this.f121898e.setColor(i);
        invalidate();
    }

    public void setSolidColor(int i) {
        this.f121895b = i;
        this.f121899f.setColor(i);
        invalidate();
    }

    public void draw(Canvas canvas) {
        float f = this.f121896c;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, (float) getBottom(), this.f121898e);
        }
        if (this.f121897d > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawRect(((float) getWidth()) - this.f121897d, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getBottom(), this.f121898e);
        }
        canvas.drawRect(this.f121896c, BitmapDescriptorFactory.HUE_RED, ((float) getWidth()) - this.f121897d, (float) getBottom(), this.f121899f);
    }

    /* renamed from: a */
    private void m191079a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.f121894a = getResources().getColor(R.color.bg_body);
            this.f121895b = getResources().getColor(R.color.line_divider_default);
            this.f121896c = BitmapDescriptorFactory.HUE_RED;
            this.f121897d = BitmapDescriptorFactory.HUE_RED;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.blank_color, R.attr.left_blank_width, R.attr.right_blank_width, R.attr.solid_color});
            this.f121894a = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.bg_body));
            this.f121895b = obtainStyledAttributes.getColor(3, getResources().getColor(R.color.line_divider_default));
            this.f121896c = obtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
            this.f121897d = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f121898e = paint;
        paint.setColor(this.f121894a);
        this.f121898e.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = new Paint();
        this.f121899f = paint2;
        paint2.setColor(this.f121895b);
        this.f121899f.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public SettingDividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m191079a(attributeSet);
    }

    public SettingDividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m191079a(attributeSet);
    }
}
