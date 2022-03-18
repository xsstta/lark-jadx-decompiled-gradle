package com.larksuite.component.universe_design.datepicker.api;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001cJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0005H&¨\u0006\u001d"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/api/IDatePickerDelegate;", "", "getFirstDayOfWeek", "", "getSelectedCalendar", "Ljava/util/Calendar;", "setFirstDayOfWeek", "", "firstDayOfWeek", "setMonthDateTextSize", "textSize", "", "setMonthDateTypeFace", "typeFace", "Landroid/graphics/Typeface;", "setMonthHeadTextSize", "setMonthHeadTypeFace", "setMonthPageScrollEnable", "scrollEnable", "", "setMonthPickerListener", "listener", "Lcom/larksuite/component/universe_design/datepicker/api/IDatePickerDelegate$DatePickerListener;", "setMonthShowMode", "monthShowMode", "Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;", "setSelectedCalendar", "date", "DatePickerListener", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.a.a */
public interface IDatePickerDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/api/IDatePickerDelegate$DatePickerListener;", "", "onDateChanged", "", "year", "", "monthOfYear", "dayOfMonth", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.a.a$a */
    public interface DatePickerListener {
        /* renamed from: a */
        void mo90447a(int i, int i2, int i3);
    }
}
