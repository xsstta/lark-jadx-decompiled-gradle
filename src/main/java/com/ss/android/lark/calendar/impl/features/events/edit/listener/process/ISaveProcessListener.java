package com.ss.android.lark.calendar.impl.features.events.edit.listener.process;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J(\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u000eH&J4\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H&J\b\u0010!\u001a\u00020\u000eH&¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/ISaveProcessListener;", "", "getCalendarReserveLimitTip", "", "onGetCurrentLimitEndDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onGetEventStartTime", "", "onGetFromChatType", "onGetIsEndDateValidate", "", "onGetIsFromProfile", "onGetSaveHitPointSource", "onSaveCreateFailure", "", "errorCode", "", "onSaveCreateFinished", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onSaveEditFailure", "onSaveEditFinished", "resultEvent", "updateTypeNum", "startTimeDiff", "endTimeDiff", "onStartSwitchCalendar", "onSwitchCalendarComplete", "isSuccess", "event", "originalEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "onWithoutSave", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.b.b.d */
public interface ISaveProcessListener {
    /* renamed from: a */
    void mo114636a();

    /* renamed from: a */
    void mo114637a(int i);

    /* renamed from: a */
    void mo114638a(CalendarEvent calendarEvent);

    /* renamed from: a */
    void mo114639a(CalendarEvent calendarEvent, int i, long j, long j2);

    /* renamed from: a */
    void mo114640a(boolean z, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance);

    /* renamed from: b */
    void mo114641b();

    /* renamed from: b */
    void mo114642b(int i);

    /* renamed from: c */
    boolean mo114643c();

    /* renamed from: d */
    CalendarDate mo114644d();

    /* renamed from: e */
    long mo114645e();

    /* renamed from: f */
    String mo114646f();

    /* renamed from: g */
    String mo114647g();

    /* renamed from: h */
    String mo114648h();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.b.b.d$a */
    public static final class C31540a {
        /* renamed from: a */
        public static /* synthetic */ void m118898a(ISaveProcessListener dVar, boolean z, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    calendarEvent = null;
                }
                if ((i & 4) != 0) {
                    calendarEvent2 = null;
                }
                if ((i & 8) != 0) {
                    calendarEventInstance = null;
                }
                dVar.mo114640a(z, calendarEvent, calendarEvent2, calendarEventInstance);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSwitchCalendarComplete");
        }
    }
}
