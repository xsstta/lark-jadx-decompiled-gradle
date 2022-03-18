package com.ss.android.lark.chatwindow.view.readstate;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class ReadStateView extends View {

    /* renamed from: a */
    private int f91167a;

    /* renamed from: b */
    private int f91168b;

    /* renamed from: c */
    private float f91169c;

    /* renamed from: d */
    private float f91170d;

    /* renamed from: e */
    private Paint f91171e;

    /* renamed from: f */
    private Paint f91172f;

    /* renamed from: g */
    private Paint f91173g;

    /* renamed from: h */
    private Drawable f91174h;

    /* renamed from: i */
    private Drawable f91175i;

    /* renamed from: j */
    private Drawable f91176j;

    /* renamed from: k */
    private int f91177k;

    /* renamed from: l */
    private int f91178l;

    /* renamed from: m */
    private int f91179m;

    /* renamed from: n */
    private float f91180n;

    /* renamed from: o */
    private int f91181o;

    public float getProgress() {
        return this.f91180n;
    }

    public ReadStateView(Context context) {
        this(context, null);
    }

    public void setProgress(float f) {
        this.f91180n = Math.max(Math.min(f, 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() - measuredWidth;
        float f = this.f91180n;
        if (f == 1.0f) {
            int i = (int) (this.f91169c + this.f91170d);
            this.f91176j.setBounds(measuredWidth - i, measuredHeight - i, measuredWidth + i, measuredHeight + i);
            this.f91176j.draw(canvas);
            return;
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            paint = this.f91171e;
        } else {
            paint = this.f91172f;
            paint.setStyle(Paint.Style.FILL);
            this.f91172f.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
            int i2 = this.f91167a;
            canvas.drawArc((float) (measuredWidth - i2), (float) (measuredHeight - i2), (float) (measuredWidth + i2), (float) (i2 + measuredHeight), (float) this.f91181o, Math.min(Math.max(45.0f, this.f91180n * 360.0f), 315.0f), true, this.f91172f);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f91170d);
        canvas.drawCircle((float) measuredWidth, (float) measuredHeight, this.f91169c, paint);
    }

    public ReadStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo129861a(float f, float f2) {
        this.f91169c = f;
        this.f91170d = f2;
        this.f91167a = (int) (f - (f2 * 2.0f));
        invalidate();
    }

    /* renamed from: a */
    private void m137814a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.all_read_color, R.attr.all_read_icon, R.attr.all_unread_color, R.attr.all_unread_icon, R.attr.part_read_color, R.attr.part_read_icon});
            this.f91174h = obtainStyledAttributes.getDrawable(3);
            this.f91175i = obtainStyledAttributes.getDrawable(5);
            this.f91176j = obtainStyledAttributes.getDrawable(1);
            this.f91177k = obtainStyledAttributes.getColor(2, this.f91177k);
            this.f91178l = obtainStyledAttributes.getColor(4, this.f91178l);
            this.f91179m = obtainStyledAttributes.getColor(0, this.f91179m);
            obtainStyledAttributes.recycle();
        }
        this.f91171e.setColor(this.f91177k);
        this.f91172f.setColor(this.f91178l);
        this.f91173g.setColor(this.f91179m);
    }

    public ReadStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f91167a = UIHelper.dp2px(5.0f);
        this.f91168b = UIHelper.dp2px(5.0f);
        this.f91169c = (float) UIHelper.dp2px(7.825f);
        this.f91170d = (float) UIHelper.dp2px(1.85f);
        this.f91171e = new Paint(1);
        this.f91172f = new Paint(1);
        this.f91173g = new Paint(1);
        this.f91176j = UIHelper.getDrawable(R.drawable.ic_svg_read_state_all_read);
        this.f91177k = -4012596;
        this.f91178l = -15091320;
        this.f91179m = -15091320;
        this.f91180n = BitmapDescriptorFactory.HUE_RED;
        this.f91181o = -90;
        m137814a(context, attributeSet);
    }
}
