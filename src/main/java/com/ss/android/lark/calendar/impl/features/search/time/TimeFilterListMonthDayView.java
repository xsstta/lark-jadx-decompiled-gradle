package com.ss.android.lark.calendar.impl.features.search.time;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J&\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterListMonthDayView;", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeFilterListBaseDayView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "renderCurrentMonthDays", "", "selectState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$SelectState;", "dateState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$DateState;", "renderDate", "monthState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$MonthState;", "optionalState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$OptionalState;", "renderEventDot", "dotColors", "", "", "renderNonCurrentMonthDays", "renderNotOptionalDays", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.time.b */
public final class TimeFilterListMonthDayView extends TimeFilterListBaseDayView {
    /* renamed from: b */
    private final void m123535b() {
        getMDateTv().setTextColor(C32634ae.m125178a(R.color.text_disable));
        getMDateTv().setBackgroundResource(R.drawable.calendar_shape_gray_circle_bg);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeFilterListMonthDayView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m123533a(CalendarAttr.DateState dateState) {
        if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
            getMDateTv().setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
        } else {
            getMDateTv().setTextColor(C32634ae.m125178a(R.color.text_disable));
        }
        getMDateTv().setBackgroundResource(0);
    }

    /* renamed from: a */
    private final void m123534a(CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState) {
        if (selectState == CalendarAttr.SelectState.SELECT) {
            if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
                getMDateTv().setTextColor(C32634ae.m125178a(R.color.static_white));
                getMDateTv().setBackgroundResource(R.drawable.bg_select_blue_circle);
                return;
            }
            getMDateTv().setTextColor(C32634ae.m125178a(R.color.text_title));
            getMDateTv().setBackgroundResource(R.drawable.calendar_shape_gray_circle_bg);
        } else if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
            getMDateTv().setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            getMDateTv().setBackgroundResource(0);
        } else {
            getMDateTv().setTextColor(C32634ae.m125178a(R.color.text_title));
            getMDateTv().setBackgroundResource(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.search.time.TimeFilterListBaseDayView
    /* renamed from: a */
    public void mo118229a(List<Integer> list, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState) {
        Intrinsics.checkParameterIsNotNull(list, "dotColors");
        Intrinsics.checkParameterIsNotNull(dateState, "dateState");
        Intrinsics.checkParameterIsNotNull(monthState, "monthState");
        for (Integer num : list) {
            int intValue = num.intValue();
            if (monthState != CalendarAttr.MonthState.CURRENT_MONTH) {
                intValue = UIUtils.getAlphaColor(intValue, 0.6d);
            }
            mo118227a(intValue);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.search.time.TimeFilterListBaseDayView
    /* renamed from: a */
    public void mo118228a(CalendarAttr.MonthState monthState, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState, CalendarAttr.OptionalState optionalState) {
        Intrinsics.checkParameterIsNotNull(monthState, "monthState");
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        Intrinsics.checkParameterIsNotNull(dateState, "dateState");
        Intrinsics.checkParameterIsNotNull(optionalState, "optionalState");
        if (optionalState == CalendarAttr.OptionalState.NOT_OPTIONAL) {
            m123535b();
        } else if (monthState == CalendarAttr.MonthState.CURRENT_MONTH) {
            m123534a(selectState, dateState);
        } else {
            m123533a(dateState);
        }
    }
}
