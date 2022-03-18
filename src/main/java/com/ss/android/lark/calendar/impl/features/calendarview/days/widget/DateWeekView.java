package com.ss.android.lark.calendar.impl.features.calendarview.days.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.p1493a.C31101a;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000eJ\u0010\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u0015J\b\u0010%\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\u001aH\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u000e\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0007J\b\u0010/\u001a\u00020\u001aH\u0002J\u0010\u00100\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u0007H\u0002J\u000e\u00103\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R4\u0010\u0013\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015 \u0016*\u0012\u0012\u000e\b\u0001\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00140\u0014X\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/DateWeekView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dateTV", "Landroid/widget/TextView;", "lunarDateTV", "mDiffToday", "mIsShowLunarDay", "", "mTimeZone", "Ljava/util/TimeZone;", "mTodayDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mWeeks", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "weekTV", "addOffsetDays", "", "offsetDay", "changeColorByDiff", "diffToday", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "refreshLunarDate", "isShowLunarDay", "refreshTimeZone", "timeZoneId", "setDate", "setDateColor", "color", "setDateTypeface", "typeface", "Landroid/graphics/Typeface;", "setLunarDate", "setLunarDateColor", "setToday", "today", "setWeek", "setWeekColor", "updateDateActual", "diff", "updateDiffToday", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DateWeekView extends RelativeLayout {

    /* renamed from: a */
    private String[] f77393a;

    /* renamed from: b */
    private int f77394b;

    /* renamed from: c */
    private TimeZone f77395c;

    /* renamed from: d */
    private CalendarDate f77396d;

    /* renamed from: e */
    private boolean f77397e;

    /* renamed from: f */
    private final TextView f77398f;

    /* renamed from: g */
    private final TextView f77399g;

    /* renamed from: h */
    private final TextView f77400h;

    public DateWeekView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DateWeekView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: a */
    private final void m114843a() {
        CalendarDate addDay = this.f77396d.addDay(this.f77394b);
        Intrinsics.checkExpressionValueIsNotNull(addDay, "date");
        String valueOf = String.valueOf(addDay.getMonthDay());
        this.f77399g.setText(valueOf);
        float measureText = this.f77399g.getPaint().measureText(valueOf);
        ViewGroup.LayoutParams layoutParams = this.f77399g.getLayoutParams();
        layoutParams.width = (int) measureText;
        this.f77399g.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private final void m114844b() {
        CalendarDate addDay = this.f77396d.addDay(this.f77394b);
        String[] strArr = this.f77393a;
        Intrinsics.checkExpressionValueIsNotNull(addDay, "date");
        String str = strArr[addDay.getWeekDay() - 1];
        Intrinsics.checkExpressionValueIsNotNull(str, "mWeeks[date.weekDay - 1]");
        this.f77398f.setText(str);
    }

    /* renamed from: c */
    private final void m114845c() {
        if (!this.f77397e) {
            this.f77400h.setVisibility(8);
            return;
        }
        CalendarDate addDay = this.f77396d.addDay(this.f77394b);
        this.f77400h.setVisibility(0);
        this.f77400h.setText(C31101a.m116088a(addDay));
    }

    private final void setDateColor(int i) {
        this.f77399g.setTextColor(i);
    }

    private final void setLunarDateColor(int i) {
        this.f77400h.setTextColor(i);
    }

    private final void setWeekColor(int i) {
        this.f77398f.setTextColor(i);
    }

    /* renamed from: b */
    public final void mo111370b(int i) {
        this.f77394b = i;
        m114846c(i);
    }

    /* renamed from: c */
    private final void m114846c(int i) {
        m114843a();
        m114844b();
        m114845c();
        m114847d(i);
    }

    /* renamed from: a */
    public final void mo111367a(int i) {
        int i2 = this.f77394b + i;
        this.f77394b = i2;
        m114846c(i2);
    }

    public final void setDateTypeface(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeface");
        this.f77399g.setTypeface(typeface);
    }

    public final void setToday(int i) {
        CalendarDate calendarDate = new CalendarDate(this.f77395c);
        this.f77396d = calendarDate;
        calendarDate.setJulianDay(i);
    }

    /* renamed from: a */
    public final void mo111369a(boolean z) {
        if (this.f77397e != z) {
            this.f77397e = z;
            m114845c();
        }
    }

    /* renamed from: d */
    private final void m114847d(int i) {
        if (i == 0) {
            setDateColor(C32634ae.m125178a(R.color.primary_pri_500));
            setWeekColor(C32634ae.m125178a(R.color.primary_pri_500));
            setLunarDateColor(C32634ae.m125178a(R.color.primary_pri_500));
        } else if (i < 0) {
            setDateColor(C32634ae.m125178a(R.color.ud_N500));
            setWeekColor(C32634ae.m125178a(R.color.ud_N500));
            setLunarDateColor(C32634ae.m125178a(R.color.ud_N400));
        } else {
            setDateColor(C32634ae.m125178a(R.color.text_title));
            setWeekColor(C32634ae.m125178a(R.color.text_title));
            setLunarDateColor(C32634ae.m125178a(R.color.ud_N500));
        }
    }

    /* renamed from: a */
    public final void mo111368a(String str) {
        if (str != null && !Intrinsics.areEqual(this.f77395c.getID(), str)) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
            this.f77395c = timeZone;
            this.f77396d = new CalendarDate(timeZone);
            m114846c(this.f77394b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateWeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        String[] stringArray = getResources().getStringArray(R.array.Lark_Calendar_WeekAbbr);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "resources.getStringArray…y.Lark_Calendar_WeekAbbr)");
        this.f77393a = stringArray;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f77395c = timeZone;
        this.f77396d = new CalendarDate(timeZone);
        TextView textView = new TextView(context);
        this.f77398f = textView;
        TextView textView2 = new TextView(context);
        this.f77399g = textView2;
        TextView textView3 = new TextView(context);
        this.f77400h = textView3;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(UIHelper.dp2px(8.0f));
        textView.setId(R.id.days_header_week);
        textView.setTextColor(C32634ae.m125178a(R.color.text_title));
        textView.setTextSize(1, 12.0f);
        addView(textView, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(UIHelper.dp2px(8.0f));
        layoutParams2.addRule(3, textView.getId());
        textView2.setId(R.id.days_header_date);
        textView2.setTextColor(C32634ae.m125178a(R.color.text_title));
        textView2.setTextSize(1, 24.0f);
        textView2.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf"));
        addView(textView2, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = UIHelper.dp2px(30.0f);
        layoutParams3.setMarginStart(UIHelper.dp2px(6.0f));
        layoutParams3.addRule(17, textView2.getId());
        textView3.setTextColor(C32634ae.m125178a(R.color.ud_N400));
        textView3.setTextSize(1, 11.0f);
        addView(textView3, layoutParams3);
        setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DateWeekView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
