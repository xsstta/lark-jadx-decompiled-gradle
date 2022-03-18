package com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.p1493a.C31101a;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0002()B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020!J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a(\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013 \u0014*\u0014\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00120\u0012X\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayHeaderPage;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "itemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayHeaderPage$OnHeaderItemClickedListener;", "getItemClickedListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayHeaderPage$OnHeaderItemClickedListener;", "setItemClickedListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayHeaderPage$OnHeaderItemClickedListener;)V", "mCurrentDay", "mSelectedDay", "mWeeks", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "startDay", "getStartDay", "()I", "setStartDay", "(I)V", "changeColorByDiff", "", "dayDateWeek", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayDateWeekView;", "diffToday", "isSelected", "", "refresh", "isShowLunarDay", "setCurrentDay", "currentDay", "setSelectedDay", "selectedDay", "Companion", "OnHeaderItemClickedListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DayHeaderPage extends LinearLayout {

    /* renamed from: b */
    public static final Companion f77424b = new Companion(null);

    /* renamed from: a */
    public int f77425a;

    /* renamed from: c */
    private String[] f77426c;

    /* renamed from: d */
    private int f77427d;

    /* renamed from: e */
    private OnHeaderItemClickedListener f77428e;

    /* renamed from: f */
    private int f77429f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayHeaderPage$OnHeaderItemClickedListener;", "", "onItemClicked", "", "beforeDay", "", "afterDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayHeaderPage$b */
    public interface OnHeaderItemClickedListener {
        /* renamed from: a */
        void mo111401a(int i, int i2);
    }

    public DayHeaderPage(Context context) {
        this(context, null, 0, 6, null);
    }

    public DayHeaderPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/dayheader/DayHeaderPage$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayHeaderPage$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final OnHeaderItemClickedListener getItemClickedListener() {
        return this.f77428e;
    }

    public final int getStartDay() {
        return this.f77429f;
    }

    public final void setCurrentDay(int i) {
        this.f77427d = i;
    }

    public final void setItemClickedListener(OnHeaderItemClickedListener bVar) {
        this.f77428e = bVar;
    }

    public final void setSelectedDay(int i) {
        this.f77425a = i;
    }

    public final void setStartDay(int i) {
        this.f77429f = i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayHeaderPage$c */
    public static final class View$OnClickListenerC30791c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DayHeaderPage f77430a;

        View$OnClickListenerC30791c(DayHeaderPage dayHeaderPage) {
            this.f77430a = dayHeaderPage;
        }

        public final void onClick(View view) {
            int intValue;
            OnHeaderItemClickedListener itemClickedListener;
            Log.m165389i("DayHeaderPage", C32673y.m125369a("oneClickTime"));
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            Object tag = view.getTag();
            if (!(tag instanceof Integer)) {
                tag = null;
            }
            Integer num = (Integer) tag;
            if (num != null && (intValue = num.intValue()) != this.f77430a.f77425a && (itemClickedListener = this.f77430a.getItemClickedListener()) != null) {
                itemClickedListener.mo111401a(this.f77430a.f77425a, intValue);
            }
        }
    }

    /* renamed from: a */
    public final void mo111394a(boolean z) {
        if (this.f77429f != 0) {
            CalendarDate calendarDate = new CalendarDate();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                calendarDate.setJulianDay(this.f77429f + i);
                View childAt = getChildAt(i);
                if (childAt != null) {
                    DayDateWeekView dayDateWeekView = (DayDateWeekView) childAt;
                    dayDateWeekView.setDateDay(String.valueOf(calendarDate.getMonthDay()));
                    if (z) {
                        dayDateWeekView.setLunarDayVisibility(0);
                        dayDateWeekView.setLunarDay(C31101a.m116088a(calendarDate));
                    } else {
                        dayDateWeekView.setLunarDayVisibility(8);
                    }
                    dayDateWeekView.setTag(Integer.valueOf(calendarDate.getJulianDay()));
                    boolean z2 = true;
                    dayDateWeekView.setWeekDay(this.f77426c[calendarDate.getWeekDay() - 1]);
                    dayDateWeekView.setOnClickListener(new View$OnClickListenerC30791c(this));
                    int i2 = (this.f77429f - this.f77427d) + i;
                    if (calendarDate.getJulianDay() != this.f77425a) {
                        z2 = false;
                    }
                    m114865a(dayDateWeekView, i2, z2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayDateWeekView");
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DayHeaderPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77426c = C32634ae.m125183c(R.array.weeks_abbr);
        for (int i2 = 0; i2 < 7; i2++) {
            DayDateWeekView dayDateWeekView = new DayDateWeekView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            dayDateWeekView.setLayoutParams(layoutParams);
            addView(dayDateWeekView);
        }
    }

    /* renamed from: a */
    private final void m114865a(DayDateWeekView dayDateWeekView, int i, boolean z) {
        if (i == 0) {
            dayDateWeekView.setWeekDayTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            dayDateWeekView.setLunarDayTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            if (z) {
                dayDateWeekView.setDateDayTextColor(C32634ae.m125178a(R.color.white));
                dayDateWeekView.setDateDayBackground(R.drawable.bg_select_blue_circle);
                return;
            }
            dayDateWeekView.setDateDayTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            dayDateWeekView.setDateDayBackground(0);
        } else if (i < 0) {
            dayDateWeekView.setWeekDayTextColor(C32634ae.m125178a(R.color.ud_N500));
            dayDateWeekView.setDateDayTextColor(C32634ae.m125178a(R.color.ud_N500));
            dayDateWeekView.setLunarDayTextColor(C32634ae.m125178a(R.color.ud_N400));
            if (z) {
                dayDateWeekView.setDateDayBackground(R.drawable.calendar_shape_gray_circle_bg);
            } else {
                dayDateWeekView.setDateDayBackground(0);
            }
        } else {
            dayDateWeekView.setWeekDayTextColor(C32634ae.m125178a(R.color.text_title));
            dayDateWeekView.setDateDayTextColor(C32634ae.m125178a(R.color.text_title));
            dayDateWeekView.setLunarDayTextColor(C32634ae.m125178a(R.color.text_placeholder));
            if (z) {
                dayDateWeekView.setDateDayBackground(R.drawable.calendar_shape_gray_circle_bg);
            } else {
                dayDateWeekView.setDateDayBackground(0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DayHeaderPage(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
