package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.utils.C32634ae;

public class TimeScaleView extends View {

    /* renamed from: a */
    private static final String[] f78507a;

    /* renamed from: b */
    private static final int f78508b;

    /* renamed from: c */
    private int f78509c;

    /* renamed from: d */
    private int f78510d;

    /* renamed from: e */
    private float f78511e;

    /* renamed from: f */
    private float f78512f;

    /* renamed from: g */
    private float f78513g;

    /* renamed from: h */
    private int f78514h;

    /* renamed from: i */
    private Paint f78515i = new Paint();

    /* renamed from: j */
    private Paint f78516j = new Paint();

    /* renamed from: k */
    private int f78517k;

    /* renamed from: l */
    private int f78518l;

    /* renamed from: m */
    private int f78519m = 15;

    /* renamed from: n */
    private C30167c f78520n;

    public float getTextBaseLine() {
        return this.f78512f;
    }

    static {
        String[] strArr = {"0:00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00"};
        f78507a = strArr;
        f78508b = strArr.length;
    }

    public void setEventChipsGridLine(C30167c cVar) {
        this.f78520n = cVar;
    }

    public void setChooseBegin(int i) {
        this.f78517k = i;
        invalidate();
    }

    public void setChooseEnd(int i) {
        this.f78518l = i;
        invalidate();
    }

    public void setTimeUnit(int i) {
        this.f78519m = i;
        invalidate();
    }

    public TimeScaleView(Context context) {
        super(context);
        m116069a(context);
    }

    /* renamed from: a */
    private void m116070a(Canvas canvas) {
        for (int i = 0; i < f78508b; i++) {
            canvas.drawText(f78507a[i], (float) (this.f78509c / 2), this.f78512f + ((float) (this.f78510d * i)), this.f78515i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m116070a(canvas);
        if (this.f78520n != null) {
            m116071a(canvas, this.f78517k);
            m116071a(canvas, this.f78518l);
        }
    }

    /* renamed from: a */
    private void m116069a(Context context) {
        this.f78510d = UIUtils.dp2px(context, 50.0f);
        this.f78509c = UIUtils.dp2px(context, 40.0f);
        this.f78511e = (float) UIUtils.dp2px(context, 7.0f);
        this.f78513g = (float) UIUtils.dp2px(context, 12.0f);
        this.f78515i.setColor(C32634ae.m125178a(R.color.lkui_N500));
        this.f78515i.setTextSize(this.f78513g);
        this.f78515i.setStyle(Paint.Style.FILL);
        this.f78515i.setTextAlign(Paint.Align.CENTER);
        this.f78515i.setAntiAlias(true);
        this.f78516j.setColor(context.getResources().getColor(R.color.lkui_B300));
        this.f78516j.setTextSize(this.f78513g);
        this.f78516j.setStyle(Paint.Style.FILL);
        this.f78516j.setTextAlign(Paint.Align.CENTER);
        this.f78516j.setAntiAlias(true);
        this.f78517k = -1;
        this.f78518l = -1;
        Paint.FontMetrics fontMetrics = this.f78515i.getFontMetrics();
        this.f78512f = (float) ((int) ((this.f78511e - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)));
        this.f78514h = ((f78508b - 1) * this.f78510d) + (((int) Math.ceil((double) this.f78511e)) * 2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.f78514h);
    }

    public TimeScaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116069a(context);
    }

    /* renamed from: a */
    private void m116071a(Canvas canvas, int i) {
        String str;
        if (i >= 0) {
            int a = this.f78520n.mo108770a(this.f78520n.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i).top);
            int round = Math.round((((float) this.f78510d) / 60.0f) * ((float) this.f78519m));
            int i2 = a / 3600;
            int i3 = this.f78519m;
            int i4 = ((a % 3600) / 60) / i3;
            if (i4 * i3 >= 60) {
                i2++;
                i4 = 0;
            }
            float f = this.f78512f + ((float) (this.f78510d * i2)) + ((float) (round * i4));
            if (i4 * i3 >= 10) {
                str = String.valueOf(i4 * i3);
            } else {
                str = "0" + (i4 * this.f78519m);
            }
            canvas.drawText(i2 + ":" + str, (float) (this.f78509c / 2), f, this.f78516j);
        }
    }

    public TimeScaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m116069a(context);
    }
}
