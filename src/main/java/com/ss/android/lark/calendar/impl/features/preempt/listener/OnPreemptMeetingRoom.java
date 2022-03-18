package com.ss.android.lark.calendar.impl.features.preempt.listener;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnPreemptMeetingRoom;", "", "onLoadFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadSucceed", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.a.c */
public interface OnPreemptMeetingRoom {
    /* renamed from: a */
    void mo117849a(ErrorResult errorResult);

    /* renamed from: a */
    void mo117850a(CalendarEvent calendarEvent);
}
