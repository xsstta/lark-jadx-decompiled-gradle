package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.TimeZone;

public class TimeLinesLayer extends FrameLayout {

    /* renamed from: a */
    public static String[] f75235a;

    /* renamed from: b */
    protected static final int f75236b;

    /* renamed from: c */
    protected int f75237c;

    /* renamed from: d */
    protected int f75238d;

    /* renamed from: e */
    protected int f75239e;

    /* renamed from: f */
    protected int f75240f;

    /* renamed from: g */
    protected float f75241g;

    /* renamed from: h */
    protected int f75242h;

    /* renamed from: i */
    protected int f75243i;

    /* renamed from: j */
    protected int f75244j;

    /* renamed from: k */
    protected Paint f75245k;

    /* renamed from: l */
    protected Paint f75246l;

    /* renamed from: m */
    protected Paint f75247m;

    /* renamed from: n */
    protected Paint f75248n;

    /* renamed from: o */
    protected Paint f75249o;

    /* renamed from: p */
    protected int f75250p;

    /* renamed from: q */
    protected float f75251q;

    /* renamed from: r */
    protected float f75252r;

    /* renamed from: s */
    protected int f75253s;

    /* renamed from: t */
    protected int f75254t;

    /* renamed from: u */
    protected boolean f75255u;

    /* renamed from: v */
    protected int f75256v;

    /* renamed from: w */
    protected int f75257w;

    /* renamed from: x */
    protected C30167c f75258x;

    /* renamed from: y */
    protected CalendarDate f75259y;

    public float getTextBaseLine() {
        return this.f75252r;
    }

    /* renamed from: c */
    public void mo108755c() {
        this.f75255u = true;
        invalidate();
    }

    /* renamed from: d */
    public void mo108756d() {
        this.f75255u = false;
        invalidate();
    }

    static {
        String[] strArr = new String[25];
        f75235a = strArr;
        f75236b = strArr.length;
    }

    /* renamed from: b */
    public void mo108754b() {
        this.f75257w = -1;
        this.f75256v = -1;
        invalidate();
    }

    /* renamed from: a */
    public void mo108753a() {
        if (C30022a.f74882a.languageDependency().mo108250c() || C30022a.f74882a.languageDependency().mo108249b() || C30022a.f74882a.languageDependency().mo108251d()) {
            C32646c.m125269a(f75235a);
            return;
        }
        CalendarDate moveToDayStart = new CalendarDate().moveToDayStart();
        for (int i = 0; i < f75235a.length; i++) {
            moveToDayStart.setHour(i);
            f75235a[i] = C32646c.m125255a(moveToDayStart.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
            if (i == f75235a.length - 1 && C30022a.f74882a.timeFormatDependency().mo108189a()) {
                f75235a[i] = "24:00";
            }
        }
    }

    public void setEventChipsGridLine(C30167c cVar) {
        this.f75258x = cVar;
    }

    public TimeLinesLayer(Context context) {
        this(context, null);
    }

    public void setChooseBegin(int i) {
        this.f75256v = i;
        invalidate();
    }

    public void setChooseEnd(int i) {
        this.f75257w = i;
        invalidate();
    }

    public void setCurrentDayIndex(int i) {
        this.f75254t = i;
        invalidate();
    }

    public void setNumDays(int i) {
        this.f75244j = i;
        requestLayout();
    }

    public void setTimeUnit(int i) {
        this.f75253s = i;
        invalidate();
    }

    /* renamed from: a */
    private void m111761a(Canvas canvas) {
        int i = this.f75238d;
        int i2 = this.f75254t;
        int i3 = this.f75243i;
        canvas.drawRect((float) ((i2 * i3) + i), BitmapDescriptorFactory.HUE_RED, (float) (i + ((i2 + 1) * i3)), (float) this.f75242h, this.f75247m);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m111763b(canvas);
        if (this.f75255u) {
            m111761a(canvas);
        }
        m111762a(canvas, this.f75256v, false);
        m111762a(canvas, this.f75257w, true);
    }

    /* renamed from: b */
    private void m111763b(Canvas canvas) {
        for (int i = 0; i < f75236b; i++) {
            canvas.drawText(f75235a[i], (float) (this.f75238d / 2), this.f75252r + ((float) (this.f75237c * i)), this.f75246l);
            for (int i2 = 0; i2 < this.f75244j; i2++) {
                int i3 = this.f75238d;
                int i4 = this.f75239e;
                int i5 = this.f75243i;
                float f = (float) (i3 + i4 + (i5 * i2));
                float f2 = this.f75251q + ((float) (this.f75237c * i));
                canvas.drawLine(f, f2, (((float) i5) + f) - ((float) i4), f2, this.f75245k);
            }
        }
    }

    /* renamed from: a */
    private void m111760a(Context context) {
        this.f75237c = UIUtils.dp2px(context, 50.0f);
        this.f75238d = UIUtils.dp2px(getContext(), 56.0f);
        this.f75239e = UIUtils.dp2px(context, 2.5f);
        this.f75240f = UIUtils.dp2px(context, 0.5f);
        this.f75241g = (float) UIUtils.dp2px(context, 12.0f);
        float dp2px = (float) UIUtils.dp2px(context, 7.0f);
        this.f75251q = dp2px;
        this.f75242h = ((f75236b - 1) * this.f75237c) + (((int) Math.ceil((double) dp2px)) * 2);
        setWillNotDraw(false);
        this.f75245k.setColor(context.getResources().getColor(R.color.line_divider_default));
        this.f75245k.setStrokeWidth((float) this.f75240f);
        this.f75246l.setColor(context.getResources().getColor(R.color.text_placeholder));
        this.f75246l.setTextSize(this.f75241g);
        this.f75246l.setStyle(Paint.Style.FILL);
        this.f75246l.setTextAlign(Paint.Align.CENTER);
        this.f75246l.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.f75246l.getFontMetrics();
        this.f75252r = (float) ((int) ((this.f75251q - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)));
        this.f75247m.setColor(C25633a.m91708b(C32634ae.m125178a(R.color.ud_N100), 0.4f));
        this.f75247m.setStyle(Paint.Style.FILL);
        this.f75248n.setColor(context.getResources().getColor(R.color.ud_B300));
        this.f75248n.setTextSize(this.f75241g);
        this.f75248n.setStyle(Paint.Style.FILL);
        this.f75248n.setTextAlign(Paint.Align.CENTER);
        this.f75248n.setAntiAlias(true);
        this.f75249o.setColor(context.getResources().getColor(R.color.ud_N100));
        this.f75249o.setStyle(Paint.Style.FILL);
        this.f75256v = -1;
        this.f75257w = -1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.f75250p = size;
        this.f75243i = (size - this.f75238d) / this.f75244j;
        setMeasuredDimension(size, this.f75242h);
    }

    public TimeLinesLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75244j = 3;
        this.f75245k = new Paint();
        this.f75246l = new Paint();
        this.f75247m = new Paint();
        this.f75248n = new Paint();
        this.f75249o = new Paint();
        this.f75253s = 15;
        this.f75259y = new CalendarDate();
        mo108753a();
        m111760a(context);
    }

    /* renamed from: a */
    private void m111762a(Canvas canvas, int i, boolean z) {
        String str;
        if (i >= 0) {
            int a = this.f75258x.mo108770a(this.f75258x.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i).top);
            int round = Math.round((((float) this.f75237c) / 60.0f) * ((float) this.f75253s));
            int i2 = a / 3600;
            int i3 = this.f75253s;
            int i4 = ((a % 3600) / 60) / i3;
            if (i3 * i4 >= 60) {
                i2++;
                i4 = 0;
            }
            float f = this.f75252r + ((float) (this.f75237c * i2)) + ((float) (round * i4));
            CalendarDate calendarDate = new CalendarDate();
            this.f75259y = calendarDate;
            calendarDate.setHour(i2);
            this.f75259y.setMinute(i4 * this.f75253s);
            if (z) {
                str = C32646c.m125270b(this.f75259y.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
            } else {
                str = C32646c.m125255a(this.f75259y.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
            }
            canvas.drawText(str, (float) (this.f75238d / 2), f, this.f75248n);
        }
    }
}
