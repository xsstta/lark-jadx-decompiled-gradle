package com.ss.android.lark.setting;

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
    private int f133980a;

    /* renamed from: b */
    private int f133981b;

    /* renamed from: c */
    private float f133982c;

    /* renamed from: d */
    private float f133983d;

    /* renamed from: e */
    private Paint f133984e;

    /* renamed from: f */
    private Paint f133985f;

    public SettingDividerView(Context context) {
        super(context);
        m209962a(null);
    }

    public void setLeftBlankWidth(float f) {
        this.f133982c = f;
        invalidate();
    }

    public void setRightBlankWidth(float f) {
        this.f133983d = f;
        invalidate();
    }

    public void setBlankColor(int i) {
        this.f133980a = i;
        this.f133984e.setColor(i);
        invalidate();
    }

    public void setSolidColor(int i) {
        this.f133981b = i;
        this.f133985f.setColor(i);
        invalidate();
    }

    public void draw(Canvas canvas) {
        float f = this.f133982c;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, (float) getHeight(), this.f133984e);
        }
        if (this.f133983d > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawRect(((float) getWidth()) - this.f133983d, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), this.f133984e);
        }
        canvas.drawRect(this.f133982c, BitmapDescriptorFactory.HUE_RED, ((float) getWidth()) - this.f133983d, (float) getHeight(), this.f133985f);
    }

    /* renamed from: a */
    private void m209962a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.f133980a = getResources().getColor(R.color.bg_body);
            this.f133981b = getResources().getColor(R.color.line_divider_default);
            this.f133982c = BitmapDescriptorFactory.HUE_RED;
            this.f133983d = BitmapDescriptorFactory.HUE_RED;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.blank_color, R.attr.left_blank_width, R.attr.right_blank_width, R.attr.solid_color});
            this.f133980a = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.bg_body));
            this.f133981b = obtainStyledAttributes.getColor(3, getResources().getColor(R.color.line_divider_default));
            this.f133982c = obtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
            this.f133983d = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f133984e = paint;
        paint.setColor(this.f133980a);
        this.f133984e.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = new Paint();
        this.f133985f = paint2;
        paint2.setColor(this.f133981b);
        this.f133985f.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public SettingDividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m209962a(attributeSet);
    }

    public SettingDividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m209962a(attributeSet);
    }
}
