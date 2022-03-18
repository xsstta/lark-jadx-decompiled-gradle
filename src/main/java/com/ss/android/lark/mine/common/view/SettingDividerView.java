package com.ss.android.lark.mine.common.view;

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
    private int f114996a;

    /* renamed from: b */
    private int f114997b;

    /* renamed from: c */
    private float f114998c;

    /* renamed from: d */
    private float f114999d;

    /* renamed from: e */
    private Paint f115000e;

    /* renamed from: f */
    private Paint f115001f;

    public SettingDividerView(Context context) {
        super(context);
        m180437a(null);
    }

    public void setLeftBlankWidth(float f) {
        this.f114998c = f;
        invalidate();
    }

    public void setRightBlankWidth(float f) {
        this.f114999d = f;
        invalidate();
    }

    public void setBlankColor(int i) {
        this.f114996a = i;
        this.f115000e.setColor(i);
        invalidate();
    }

    public void setSolidColor(int i) {
        this.f114997b = i;
        this.f115001f.setColor(i);
        invalidate();
    }

    public void draw(Canvas canvas) {
        float f = this.f114998c;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, (float) getHeight(), this.f115000e);
        }
        if (this.f114999d > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawRect(((float) getWidth()) - this.f114999d, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), this.f115000e);
        }
        canvas.drawRect(this.f114998c, BitmapDescriptorFactory.HUE_RED, ((float) getWidth()) - this.f114999d, (float) getHeight(), this.f115001f);
    }

    /* renamed from: a */
    private void m180437a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.f114996a = getResources().getColor(R.color.bg_body);
            this.f114997b = getResources().getColor(R.color.line_divider_default);
            this.f114998c = BitmapDescriptorFactory.HUE_RED;
            this.f114999d = BitmapDescriptorFactory.HUE_RED;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.blank_color, R.attr.left_blank_width, R.attr.right_blank_width, R.attr.solid_color});
            this.f114996a = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.bg_body));
            this.f114997b = obtainStyledAttributes.getColor(3, getResources().getColor(R.color.line_divider_default));
            this.f114998c = obtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
            this.f114999d = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f115000e = paint;
        paint.setColor(this.f114996a);
        this.f115000e.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = new Paint();
        this.f115001f = paint2;
        paint2.setColor(this.f114997b);
        this.f115001f.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public SettingDividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m180437a(attributeSet);
    }

    public SettingDividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m180437a(attributeSet);
    }
}
