package com.ss.android.lark.calendar.impl.features.calendars.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder.InstancesMonthViewHolder;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R4\u0010\u000f\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011 \u0012*\u0012\u0012\u000e\b\u0001\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00100\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/InstanceDateView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentDayColor", "day", "Landroid/widget/TextView;", "futureDayColor", "pastDayColor", "week", "weekStringArray", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "bind", "", "currentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "showDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InstanceDateView extends LinearLayout {

    /* renamed from: a */
    private final int f75733a;

    /* renamed from: b */
    private final int f75734b;

    /* renamed from: c */
    private final int f75735c;

    /* renamed from: d */
    private final String[] f75736d;

    /* renamed from: e */
    private final TextView f75737e;

    /* renamed from: f */
    private final TextView f75738f;

    public InstanceDateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo109294a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        int i;
        Intrinsics.checkParameterIsNotNull(calendarDate, "currentDate");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "showDate");
        int julianDay = calendarDate.getJulianDay();
        int julianDay2 = calendarDate2.getJulianDay();
        this.f75737e.setText((CharSequence) C69043h.m265738a(this.f75736d, calendarDate2.getWeekDay() - 1));
        this.f75738f.setText(String.valueOf(calendarDate2.getMonthDay()));
        if (julianDay2 < julianDay) {
            i = this.f75735c;
        } else if (julianDay2 > julianDay) {
            i = this.f75734b;
        } else {
            i = this.f75733a;
        }
        this.f75737e.setTextColor(i);
        this.f75738f.setTextColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceDateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75733a = UDColorUtils.getColor(context, R.color.ud_B500);
        int color = UDColorUtils.getColor(context, R.color.text_title);
        this.f75734b = color;
        this.f75735c = UDColorUtils.getColor(context, R.color.text_placeholder);
        String[] stringArray = context.getResources().getStringArray(R.array.weeks_short);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "context.resources.getStr…rray(R.array.weeks_short)");
        this.f75736d = stringArray;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(color);
        textView.setSingleLine(true);
        textView.setTypeface(InstancesMonthViewHolder.f75609b.mo109172a());
        this.f75737e = textView;
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 26.0f);
        textView2.setTextColor(color);
        textView2.setSingleLine(true);
        textView2.setTypeface(InstancesMonthViewHolder.f75609b.mo109172a());
        this.f75738f = textView2;
        setPadding(0, C32659l.m125335a((Number) 13), 0, C32659l.m125335a((Number) 13));
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        addView(textView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        addView(textView2, layoutParams2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstanceDateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
