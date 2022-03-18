package com.ss.android.lark.calendar.impl.features.events.edit.listener.process;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u000e\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J<\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J<\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/INotificationListener;", "", "onAfterAddAccount", "", "onAfterChooseCancel", "onCancelNotificationBtnChosen", "onJudgeNotificationBoxTypeFailed", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "startTime", "", "endTime", "onNoNotificationBox", "onNotSendNotificationBtnChosen", "isShareToChat", "", "isTransferToChat", "onSendNotificationBtnChosen", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.b.b.c */
public interface INotificationListener {
    /* renamed from: a */
    void mo111617a();

    /* renamed from: a */
    void mo111618a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2);

    /* renamed from: a */
    void mo111619a(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2);

    /* renamed from: b */
    void mo111620b(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2);

    /* renamed from: b */
    void mo111621b(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2);
}
