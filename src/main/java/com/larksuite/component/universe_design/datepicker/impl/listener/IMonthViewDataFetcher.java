package com.larksuite.component.universe_design.datepicker.impl.listener;

import com.larksuite.component.universe_design.datepicker.impl.data.MonthShowMode;
import com.larksuite.component.universe_design.util.CalendarDate;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewDataFetcher;", "", "getCurrentDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "getFirstDayOfWeek", "Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "getMonthShowMode", "Lcom/larksuite/component/universe_design/datepicker/impl/data/MonthShowMode;", "getSelectedDate", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.a.b */
public interface IMonthViewDataFetcher {
    /* renamed from: a */
    CalendarDate mo90438a();

    /* renamed from: b */
    CalendarDate mo90439b();

    /* renamed from: c */
    MonthShowMode mo90440c();

    /* renamed from: d */
    CalendarDate.DayOfWeek mo90441d();
}
