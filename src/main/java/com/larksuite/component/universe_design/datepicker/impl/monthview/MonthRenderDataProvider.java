package com.larksuite.component.universe_design.datepicker.impl.monthview;

import com.larksuite.component.universe_design.datepicker.impl.data.BaseDay;
import com.larksuite.component.universe_design.datepicker.impl.data.CalendarAttr;
import com.larksuite.component.universe_design.datepicker.impl.data.MonthShowMode;
import com.larksuite.component.universe_design.datepicker.impl.data.Week;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.DateTimeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u0010J]\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u0015J]\u0010\u0016\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u0015J]\u0010\u0018\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J \u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002JC\u0010#\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/monthview/MonthRenderDataProvider;", "", "()V", "initCurrentMonthDate", "", "weeks", "", "Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;", "seedDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "currentDate", "selectDate", "day", "", "row", "col", "([Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;III)V", "initLastMonth", "lastMonthDays", "firstDayPosition", "position", "([Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;IIIII)V", "initNextMonth", "currentMonthDays", "initWeekData", "monthDay", "([Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;IIIII)I", "setDate", "Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;", "date", "setDateState", "setMonthState", "monthState", "Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$MonthState;", "setSelectState", "updateMonthData", "firstWeekDay", "Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "monthShowMode", "Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;", "([Lcom/larksuite/component/universe_design/datepicker/impl/data/Week;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;)I", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.b.b */
public final class MonthRenderDataProvider {

    /* renamed from: a */
    public static final MonthRenderDataProvider f63210a = new MonthRenderDataProvider();

    private MonthRenderDataProvider() {
    }

    /* renamed from: a */
    private final void m92655a(BaseDay aVar, CalendarDate calendarDate) {
        aVar.mo90515a(calendarDate);
    }

    /* renamed from: a */
    private final void m92654a(BaseDay aVar, CalendarAttr.MonthState monthState) {
        aVar.mo90518d().mo90505a(monthState);
    }

    /* renamed from: a */
    private final void m92656a(BaseDay aVar, CalendarDate calendarDate, CalendarDate calendarDate2) {
        if (calendarDate.sameDay(calendarDate2)) {
            aVar.mo90518d().mo90506a(CalendarAttr.SelectState.SELECT);
        } else {
            aVar.mo90518d().mo90506a(CalendarAttr.SelectState.UN_SELECT);
        }
    }

    /* renamed from: b */
    private final void m92658b(BaseDay aVar, CalendarDate calendarDate, CalendarDate calendarDate2) {
        if (calendarDate.sameDay(calendarDate2)) {
            aVar.mo90518d().mo90504a(CalendarAttr.DateState.CURRENT_DATE);
        } else if (calendarDate.beforeDay(calendarDate2)) {
            aVar.mo90518d().mo90504a(CalendarAttr.DateState.PAST_DATE);
        } else {
            aVar.mo90518d().mo90504a(CalendarAttr.DateState.FUTURE_DATE);
        }
    }

    /* renamed from: a */
    public final int mo90477a(Week[] bVarArr, CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, CalendarDate.DayOfWeek dayOfWeek, MonthShowMode monthShowMode) {
        int i;
        Intrinsics.checkParameterIsNotNull(bVarArr, "weeks");
        Intrinsics.checkParameterIsNotNull(calendarDate, "seedDate");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "currentDate");
        Intrinsics.checkParameterIsNotNull(calendarDate3, "selectDate");
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstWeekDay");
        Intrinsics.checkParameterIsNotNull(monthShowMode, "monthShowMode");
        int a = DateTimeUtils.m93290a(calendarDate.getYear(), calendarDate.getMonth() - 1);
        int a2 = DateTimeUtils.m93290a(calendarDate.getYear(), calendarDate.getMonth());
        int a3 = DateTimeUtils.f63877a.mo91833a(calendarDate.getYear(), calendarDate.getMonth(), dayOfWeek);
        if (monthShowMode == MonthShowMode.FIXED_SIX_ROW) {
            i = 6;
        } else {
            i = RangesKt.coerceAtMost(6, (int) Math.ceil(((double) (a3 + a2)) / 7.0d));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = m92653a(bVarArr, calendarDate, calendarDate2, calendarDate3, a, a2, a3, i2, i3);
        }
        return i;
    }

    /* renamed from: a */
    private final void m92657a(Week[] bVarArr, CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, int i, int i2, int i3) {
        BaseDay[] a;
        BaseDay aVar;
        BaseDay[] a2;
        BaseDay[] a3;
        CalendarDate modifyDay = calendarDate.modifyDay(i);
        BaseDay aVar2 = null;
        if (bVarArr[i2] == null) {
            bVarArr[i2] = new Week(i2, null, 2, null);
        }
        Week bVar = bVarArr[i2];
        if (!(bVar == null || (a3 = bVar.mo90522a()) == null)) {
            aVar2 = a3[i3];
        }
        if (aVar2 == null) {
            Intrinsics.checkExpressionValueIsNotNull(modifyDay, "date");
            BaseDay aVar3 = new BaseDay(i2, i3, modifyDay, new CalendarAttr(CalendarAttr.SelectState.UN_SELECT, CalendarAttr.DateState.CURRENT_DATE, CalendarAttr.MonthState.CURRENT_MONTH));
            Week bVar2 = bVarArr[i2];
            if (!(bVar2 == null || (a2 = bVar2.mo90522a()) == null)) {
                a2[i3] = aVar3;
            }
        }
        Week bVar3 = bVarArr[i2];
        if (bVar3 != null && (a = bVar3.mo90522a()) != null && (aVar = a[i3]) != null) {
            Intrinsics.checkExpressionValueIsNotNull(modifyDay, "date");
            m92655a(aVar, modifyDay);
            m92656a(aVar, modifyDay, calendarDate3);
            m92658b(aVar, modifyDay, calendarDate2);
            m92654a(aVar, CalendarAttr.MonthState.CURRENT_MONTH);
        }
    }

    /* renamed from: a */
    private final int m92653a(Week[] bVarArr, CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, int i, int i2, int i3, int i4, int i5) {
        int i6 = i4;
        for (int i7 = 0; i7 < 7; i7++) {
            int i8 = i7 + (i5 * 7);
            if (i8 >= i3 && i8 < i3 + i2) {
                i6++;
                m92657a(bVarArr, calendarDate, calendarDate2, calendarDate3, i6, i5, i7);
            } else if (i8 < i3) {
                m92660c(bVarArr, calendarDate, calendarDate2, calendarDate3, i, i3, i5, i7, i8);
            } else if (i8 >= i3 + i2) {
                m92659b(bVarArr, calendarDate, calendarDate2, calendarDate3, i2, i3, i5, i7, i8);
            }
        }
        return i6;
    }

    /* renamed from: b */
    private final void m92659b(Week[] bVarArr, CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, int i, int i2, int i3, int i4, int i5) {
        BaseDay[] a;
        BaseDay aVar;
        BaseDay[] a2;
        BaseDay[] a3;
        CalendarDate calendarDate4 = new CalendarDate(calendarDate.getYear(), calendarDate.getMonth() + 1, ((i5 - i2) - i) + 1, 0, 0, 0);
        BaseDay aVar2 = null;
        if (bVarArr[i3] == null) {
            bVarArr[i3] = new Week(i3, null, 2, null);
        }
        Week bVar = bVarArr[i3];
        if (!(bVar == null || (a3 = bVar.mo90522a()) == null)) {
            aVar2 = a3[i4];
        }
        if (aVar2 == null) {
            BaseDay aVar3 = new BaseDay(i3, i4, calendarDate4, new CalendarAttr(CalendarAttr.SelectState.UN_SELECT, CalendarAttr.DateState.FUTURE_DATE, CalendarAttr.MonthState.NEXT_MONTH));
            Week bVar2 = bVarArr[i3];
            if (!(bVar2 == null || (a2 = bVar2.mo90522a()) == null)) {
                a2[i4] = aVar3;
            }
        }
        Week bVar3 = bVarArr[i3];
        if (bVar3 != null && (a = bVar3.mo90522a()) != null && (aVar = a[i4]) != null) {
            m92655a(aVar, calendarDate4);
            m92656a(aVar, calendarDate4, calendarDate3);
            m92658b(aVar, calendarDate4, calendarDate2);
            m92654a(aVar, CalendarAttr.MonthState.NEXT_MONTH);
        }
    }

    /* renamed from: c */
    private final void m92660c(Week[] bVarArr, CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, int i, int i2, int i3, int i4, int i5) {
        BaseDay[] a;
        BaseDay aVar;
        BaseDay[] a2;
        BaseDay[] a3;
        CalendarDate calendarDate4 = new CalendarDate(calendarDate.getYear(), calendarDate.getMonth() - 1, i - ((i2 - i5) - 1), 0, 0, 0);
        BaseDay aVar2 = null;
        if (bVarArr[i3] == null) {
            bVarArr[i3] = new Week(i3, null, 2, null);
        }
        Week bVar = bVarArr[i3];
        if (!(bVar == null || (a3 = bVar.mo90522a()) == null)) {
            aVar2 = a3[i4];
        }
        if (aVar2 == null) {
            BaseDay aVar3 = new BaseDay(i3, i4, calendarDate4, new CalendarAttr(CalendarAttr.SelectState.UN_SELECT, CalendarAttr.DateState.PAST_DATE, CalendarAttr.MonthState.LAST_MONTH));
            Week bVar2 = bVarArr[i3];
            if (!(bVar2 == null || (a2 = bVar2.mo90522a()) == null)) {
                a2[i4] = aVar3;
            }
        }
        Week bVar3 = bVarArr[i3];
        if (bVar3 != null && (a = bVar3.mo90522a()) != null && (aVar = a[i4]) != null) {
            m92655a(aVar, calendarDate4);
            m92656a(aVar, calendarDate4, calendarDate3);
            m92658b(aVar, calendarDate4, calendarDate2);
            m92654a(aVar, CalendarAttr.MonthState.LAST_MONTH);
        }
    }
}
