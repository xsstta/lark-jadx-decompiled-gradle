package com.ss.android.lark.calendar.impl.features.calendarview.days.layers;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0001/B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001f\u001a\u00020 J(\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H\u0002J&\u0010(\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0003J\u000e\u0010-\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0003J\u0006\u0010.\u001a\u00020 R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/TimeLinesLayer;", "", "mColumnNum", "", "daysLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "(ILcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;)V", "HOUR_TEXTS", "", "", "[Ljava/lang/String;", "mChooseBegin", "mChooseEnd", "mChooseTimePaint", "Landroid/graphics/Paint;", "mColumnWidth", "mHourTextSize", "", "mHourTextWidth", "mLineMarginLeft", "mLinePaint", "mLineSize", "mMarginTop", "mRowHeight", "mTextBaseLY", "mTextPaint", "mTimeShowDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mTimeUnit", "mViewHeight", "mViewWidth", "clearChooseTime", "", "drawChooseTimeImpl", "canvas", "Landroid/graphics/Canvas;", "chooseY", "offsetY", "isNeedCurrentTime", "", "drawTimesLines", "offsetX", "width", "setChooseBegin", "y", "setChooseEnd", "setTimeFormat", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a */
public final class TimeLinesLayer {

    /* renamed from: a */
    public static final Companion f77343a = new Companion(null);

    /* renamed from: b */
    private String[] f77344b = new String[25];

    /* renamed from: c */
    private int f77345c;

    /* renamed from: d */
    private int f77346d;

    /* renamed from: e */
    private float f77347e;

    /* renamed from: f */
    private int f77348f;

    /* renamed from: g */
    private int f77349g;

    /* renamed from: h */
    private int f77350h;

    /* renamed from: i */
    private int f77351i;

    /* renamed from: j */
    private int f77352j;

    /* renamed from: k */
    private Paint f77353k = new Paint();

    /* renamed from: l */
    private Paint f77354l = new Paint();

    /* renamed from: m */
    private Paint f77355m = new Paint();

    /* renamed from: n */
    private int f77356n;

    /* renamed from: o */
    private float f77357o;

    /* renamed from: p */
    private int f77358p = 15;

    /* renamed from: q */
    private int f77359q;

    /* renamed from: r */
    private int f77360r;

    /* renamed from: s */
    private CalendarDate f77361s = new CalendarDate();

    /* renamed from: t */
    private final int f77362t;

    /* renamed from: u */
    private final DaysLayoutParam f77363u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/TimeLinesLayer$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo111336b() {
        this.f77360r = -1;
        this.f77359q = -1;
    }

    /* renamed from: a */
    public final void mo111333a() {
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
                    int length = this.f77344b.length;
                    for (int i = 0; i < length; i++) {
                        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "date");
                        moveToDayStart.setHour(i);
                        this.f77344b[i] = C32646c.m125255a(moveToDayStart.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
                        if (i == this.f77344b.length - 1) {
                            AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
                            Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
                            if (timeFormatDependency.mo108189a()) {
                                this.f77344b[i] = "24:00";
                            }
                        }
                    }
                    return;
                }
            }
        }
        C32646c.m125269a(this.f77344b);
    }

    /* renamed from: a */
    public final void mo111334a(int i) {
        this.f77359q = i;
    }

    /* renamed from: b */
    public final void mo111337b(int i) {
        this.f77360r = i;
    }

    public TimeLinesLayer(int i, DaysLayoutParam daysLayoutParam) {
        Intrinsics.checkParameterIsNotNull(daysLayoutParam, "daysLayoutParam");
        this.f77362t = i;
        this.f77363u = daysLayoutParam;
        mo111333a();
        this.f77356n = UIHelper.dp2px(7.0f);
        this.f77345c = UIHelper.dp2px(50.0f);
        this.f77346d = UIHelper.dp2px(56.0f);
        this.f77348f = UIHelper.dp2px(2.5f);
        this.f77349g = UIHelper.dp2px(0.5f);
        this.f77347e = (float) UIHelper.dp2px(12.0f);
        this.f77351i = (this.f77345c * 24) + (this.f77356n * 2);
        this.f77353k.setColor(C32634ae.m125178a(R.color.line_divider_default));
        this.f77353k.setStrokeWidth((float) this.f77349g);
        this.f77354l.setColor(C32634ae.m125178a(R.color.text_placeholder));
        this.f77354l.setTextSize(this.f77347e);
        this.f77354l.setStyle(Paint.Style.FILL);
        this.f77354l.setTextAlign(Paint.Align.CENTER);
        this.f77354l.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.f77354l.getFontMetrics();
        float f = (float) 2;
        this.f77357o = (((float) this.f77356n) - (fontMetrics.top / f)) - (fontMetrics.bottom / f);
        this.f77355m.setColor(UIHelper.getColor(R.color.lkui_B300));
        this.f77355m.setTextSize(this.f77347e);
        this.f77355m.setStyle(Paint.Style.FILL);
        this.f77355m.setTextAlign(Paint.Align.CENTER);
        this.f77355m.setAntiAlias(true);
        this.f77359q = -1;
        this.f77360r = -1;
    }

    /* renamed from: a */
    private final void m114795a(Canvas canvas, int i, int i2, boolean z) {
        Rect a;
        String str;
        C30167c f = this.f77363u.mo110879f();
        if (f != null && (a = f.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i)) != null) {
            int a2 = f.mo108770a(a.top);
            int a3 = C69029a.m265653a((((float) this.f77345c) / 60.0f) * ((float) this.f77358p));
            int i3 = a2 / 3600;
            int i4 = this.f77358p;
            int i5 = ((a2 % 3600) / 60) / i4;
            if (i4 * i5 >= 60) {
                i3++;
                i5 = 0;
            }
            float f2 = this.f77357o + ((float) (this.f77345c * i3)) + ((float) (a3 * i5)) + ((float) i2);
            CalendarDate calendarDate = new CalendarDate();
            this.f77361s = calendarDate;
            calendarDate.setHour(i3);
            this.f77361s.setMinute(i5 * this.f77358p);
            if (z) {
                str = C32646c.m125270b(this.f77361s.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
                Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            } else {
                str = C32646c.m125255a(this.f77361s.getTimeInMilliSeconds(), TimeZone.getDefault(), true);
                Intrinsics.checkExpressionValueIsNotNull(str, "CalendarDateTimeShowUtil…eZone.getDefault(), true)");
            }
            canvas.drawText(str, ((float) this.f77346d) / ((float) 2), f2, this.f77355m);
        }
    }

    /* renamed from: a */
    public final void mo111335a(Canvas canvas, int i, int i2, int i3) {
        int i4;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (i3 > 0 && (i4 = this.f77362t) > 0) {
            this.f77350h = i3;
            int i5 = (i3 - this.f77346d) / i4;
            this.f77352j = i5;
            if (i5 <= 0) {
                Log.m165383e("TimeLinesLayer", C32673y.m125378d("mViewWidth=" + this.f77350h + ", mHourTextWidth=" + this.f77346d + ", mColumnNum=" + this.f77362t));
                return;
            }
            for (int i6 = 0; i6 < 25; i6++) {
                String str = this.f77344b[i6];
                if (str != null) {
                    canvas.drawText(str, ((float) this.f77346d) / ((float) 2), this.f77357o + ((float) (this.f77345c * i6)) + ((float) i2), this.f77354l);
                    int i7 = this.f77356n + (this.f77345c * i6) + i2;
                    int i8 = this.f77352j;
                    int i9 = i % i8;
                    int i10 = this.f77346d;
                    float f = (float) i10;
                    float f2 = (float) i10;
                    if (i9 < 0) {
                        i9 += i8;
                    }
                    if (i9 > 0) {
                        f2 += (float) i9;
                        int i11 = this.f77348f;
                        if ((f2 - ((float) i8)) + ((float) i11) > f) {
                            f = (f2 - ((float) i8)) + ((float) i11);
                        }
                    }
                    float f3 = f2;
                    float f4 = (float) i7;
                    canvas.drawLine(f, f4, f3, f4, this.f77353k);
                    int i12 = this.f77362t;
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = this.f77348f;
                        float f5 = ((float) i14) + f3;
                        f3 = (((float) this.f77352j) + f5) - ((float) i14);
                        canvas.drawLine(f5, f4, f3, f4, this.f77353k);
                    }
                }
            }
            int i15 = this.f77359q;
            if (i15 >= 0) {
                m114795a(canvas, i15, i2, false);
            }
            int i16 = this.f77360r;
            if (i16 >= 0) {
                m114795a(canvas, i16, i2, true);
            }
        }
    }
}
