package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.utils.UIHelper;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J(\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u0002J \u0010*\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0002J&\u0010-\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0003J\u000e\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u0003J\u000e\u00101\u001a\u00020\"2\u0006\u00100\u001a\u00020\u0003J\u0006\u00102\u001a\u00020\"R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/TimeLinesLayer;", "", "mColumnNum", "", "mLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/ITimeLayoutParam;", "(ILcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/ITimeLayoutParam;)V", "HOUR_TEXTS", "", "", "[Ljava/lang/String;", "mChooseBegin", "mChooseEnd", "mChooseTimePaint", "Landroid/graphics/Paint;", "mColumnWidth", "mFirstColumnBackground", "Landroid/graphics/drawable/Drawable;", "mHourTextSize", "", "mHourTextWidth", "mLineMarginLeft", "mLinePaint", "mLineSize", "mMarginTop", "mRowHeight", "mTextBaseLY", "mTextPaint", "mTimeShowDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mTimeUnit", "mViewHeight", "mViewWidth", "clearChooseTime", "", "drawChooseTimeImpl", "canvas", "Landroid/graphics/Canvas;", "chooseY", "offsetY", "isNeedCurrentTime", "", "drawFirstColumnBackground", "viewWidth", "offsetX", "drawTimesLines", "width", "setChooseBegin", "y", "setChooseEnd", "setTimeFormat", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.b.c */
public final class TimeLinesLayer {

    /* renamed from: a */
    private String[] f79018a = new String[25];

    /* renamed from: b */
    private int f79019b;

    /* renamed from: c */
    private int f79020c;

    /* renamed from: d */
    private float f79021d;

    /* renamed from: e */
    private int f79022e;

    /* renamed from: f */
    private int f79023f;

    /* renamed from: g */
    private int f79024g;

    /* renamed from: h */
    private int f79025h;

    /* renamed from: i */
    private int f79026i;

    /* renamed from: j */
    private Paint f79027j = new Paint();

    /* renamed from: k */
    private Paint f79028k = new Paint();

    /* renamed from: l */
    private Paint f79029l = new Paint();

    /* renamed from: m */
    private Drawable f79030m;

    /* renamed from: n */
    private int f79031n;

    /* renamed from: o */
    private float f79032o;

    /* renamed from: p */
    private int f79033p = 15;

    /* renamed from: q */
    private int f79034q;

    /* renamed from: r */
    private int f79035r;

    /* renamed from: s */
    private CalendarDate f79036s = new CalendarDate();

    /* renamed from: t */
    private final int f79037t;

    /* renamed from: u */
    private final ITimeLayoutParam f79038u;

    /* renamed from: b */
    public final void mo113307b() {
        this.f79035r = -1;
        this.f79034q = -1;
    }

    /* renamed from: a */
    public final void mo113304a() {
        AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "CalendarDependencyHolder…ency.languageDependency()");
        if (!languageDependency.mo108250c()) {
            AbstractC30052p languageDependency2 = C30022a.f74882a.languageDependency();
            Intrinsics.checkExpressionValueIsNotNull(languageDependency2, "CalendarDependencyHolder…ency.languageDependency()");
            if (!languageDependency2.mo108249b()) {
                AbstractC30052p languageDependency3 = C30022a.f74882a.languageDependency();
                Intrinsics.checkExpressionValueIsNotNull(languageDependency3, "CalendarDependencyHolder…ency.languageDependency()");
                if (!languageDependency3.mo108251d()) {
                    CalendarDate moveToDayStart = new CalendarDate().moveToDayStart();
                    int length = this.f79018a.length;
                    for (int i = 0; i < length; i++) {
                        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "date");
                        moveToDayStart.setHour(i);
                        this.f79018a[i] = C32646c.m125255a(moveToDayStart.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
                        if (i == this.f79018a.length - 1) {
                            AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
                            Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
                            if (timeFormatDependency.mo108189a()) {
                                this.f79018a[i] = "24:00";
                            }
                        }
                    }
                    return;
                }
            }
        }
        C32646c.m125269a(this.f79018a);
    }

    /* renamed from: a */
    public final void mo113305a(int i) {
        this.f79034q = i;
    }

    /* renamed from: b */
    public final void mo113308b(int i) {
        this.f79035r = i;
    }

    public TimeLinesLayer(int i, ITimeLayoutParam aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mLayoutParam");
        this.f79037t = i;
        this.f79038u = aVar;
        mo113304a();
        this.f79031n = UIHelper.dp2px(7.0f);
        this.f79019b = UIHelper.dp2px(50.0f);
        this.f79020c = UIHelper.dp2px(56.0f);
        this.f79022e = UIHelper.dp2px(2.5f);
        this.f79023f = UIHelper.dp2px(0.5f);
        this.f79021d = (float) UIHelper.dp2px(12.0f);
        this.f79025h = (this.f79019b * 24) + (this.f79031n * 2);
        Drawable a = ao.m125218a(C32634ae.m125178a(R.color.ud_N50), new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewUtil.getCustomCorner…Of(0f, 0f, 0f, 0f), 0, 0)");
        this.f79030m = a;
        this.f79027j.setColor(C32634ae.m125178a(R.color.line_divider_default));
        this.f79027j.setStrokeWidth((float) this.f79023f);
        this.f79028k.setColor(C32634ae.m125178a(R.color.text_placeholder));
        this.f79028k.setTextSize(this.f79021d);
        this.f79028k.setStyle(Paint.Style.FILL);
        this.f79028k.setTextAlign(Paint.Align.CENTER);
        this.f79028k.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.f79028k.getFontMetrics();
        float f = (float) 2;
        this.f79032o = (((float) this.f79031n) - (fontMetrics.top / f)) - (fontMetrics.bottom / f);
        this.f79029l.setColor(UIHelper.getColor(R.color.lkui_B300));
        this.f79029l.setTextSize(this.f79021d);
        this.f79029l.setStyle(Paint.Style.FILL);
        this.f79029l.setTextAlign(Paint.Align.CENTER);
        this.f79029l.setAntiAlias(true);
        this.f79034q = -1;
        this.f79035r = -1;
    }

    /* renamed from: a */
    private final void m116766a(Canvas canvas, int i, int i2) {
        int i3 = this.f79020c;
        int max = Math.max(i2 + i3, i3);
        int i4 = i2 + this.f79020c + this.f79026i;
        if (i >= max && i4 >= max) {
            this.f79030m.setBounds(max, 0, i4, this.f79025h);
            this.f79030m.draw(canvas);
        }
    }

    /* renamed from: a */
    private final void m116767a(Canvas canvas, int i, int i2, boolean z) {
        Rect a;
        String str;
        C30167c a2 = this.f79038u.mo113297a();
        if (a2 != null && (a = a2.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i)) != null) {
            int a3 = a2.mo108770a(a.top);
            int a4 = C69029a.m265653a((((float) this.f79019b) / 60.0f) * ((float) this.f79033p));
            int i3 = a3 / 3600;
            int i4 = this.f79033p;
            int i5 = ((a3 % 3600) / 60) / i4;
            if (i4 * i5 >= 60) {
                i3++;
                i5 = 0;
            }
            float f = this.f79032o + ((float) (this.f79019b * i3)) + ((float) (a4 * i5)) + ((float) i2);
            CalendarDate calendarDate = new CalendarDate();
            this.f79036s = calendarDate;
            calendarDate.setHour(i3);
            this.f79036s.setMinute(i5 * this.f79033p);
            if (z) {
                str = C32646c.m125270b(this.f79036s.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
                Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            } else {
                str = C32646c.m125255a(this.f79036s.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
                Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            }
            canvas.drawText(str, ((float) this.f79020c) / ((float) 2), f, this.f79029l);
        }
    }

    /* renamed from: a */
    public final void mo113306a(Canvas canvas, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (i3 > 0) {
            this.f79024g = i3;
            this.f79026i = (i3 - this.f79020c) / this.f79037t;
            m116766a(canvas, i3, i);
            for (int i4 = 0; i4 < 25; i4++) {
                String str = this.f79018a[i4];
                if (str != null) {
                    canvas.drawText(str, ((float) this.f79020c) / ((float) 2), this.f79032o + ((float) (this.f79019b * i4)) + ((float) i2), this.f79028k);
                    int i5 = this.f79031n + (this.f79019b * i4) + i2;
                    int i6 = this.f79026i;
                    int i7 = i % i6;
                    int i8 = this.f79020c;
                    float f = (float) i8;
                    float f2 = (float) i8;
                    if (i7 < 0) {
                        i7 += i6;
                    }
                    if (i7 > 0) {
                        f2 += (float) i7;
                        int i9 = this.f79022e;
                        if ((f2 - ((float) i6)) + ((float) i9) > f) {
                            f = (f2 - ((float) i6)) + ((float) i9);
                        }
                    }
                    float f3 = f2;
                    float f4 = (float) i5;
                    canvas.drawLine(f, f4, f3, f4, this.f79027j);
                    int i10 = this.f79037t;
                    for (int i11 = 0; i11 < i10; i11++) {
                        int i12 = this.f79022e;
                        float f5 = ((float) i12) + f3;
                        f3 = (((float) this.f79026i) + f5) - ((float) i12);
                        canvas.drawLine(f5, f4, f3, f4, this.f79027j);
                    }
                }
            }
            int i13 = this.f79034q;
            if (i13 >= 0) {
                m116767a(canvas, i13, i2, false);
            }
            int i14 = this.f79035r;
            if (i14 >= 0) {
                m116767a(canvas, i14, i2, true);
            }
        }
    }
}
