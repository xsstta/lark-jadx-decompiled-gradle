package com.ss.android.lark.calendar.impl.features.calendarview;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH&¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramDelegate;", "", "addEventReloadTask", "", "cancelEventTransmit", "eventTransmit", "startTime", "", "endTime", "getCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getSelectedDate", "hideSdkSyncLoading", "moveLogicDateToToday", "refreshMonthTitle", "date", "saveNoRepeatEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "setTabProgress", "process", "", "setTabScrollByMoveToToday", "animDuration", "", "setTabScrollProgress", "startAppendViewAnimation", "updateSelectDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.j */
public interface IDiagramDelegate {
    /* renamed from: a */
    void mo111631a(float f);

    /* renamed from: a */
    void mo111632a(int i);

    /* renamed from: a */
    void mo111633a(long j, long j2);

    /* renamed from: a */
    void mo111634a(CalendarDate calendarDate);

    /* renamed from: a */
    void mo111635a(CalendarEventInstance calendarEventInstance, long j, long j2);

    /* renamed from: b */
    void mo111636b(CalendarDate calendarDate);

    /* renamed from: c */
    CalendarDate mo111637c();

    /* renamed from: d */
    CalendarDate mo111638d();

    /* renamed from: e */
    void mo111639e();

    /* renamed from: f */
    void mo111640f();

    /* renamed from: g */
    void mo111641g();

    /* renamed from: h */
    void mo111642h();
}
