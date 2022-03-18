package com.ss.android.lark.calendar.impl.features.calendars.detail.fragment;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32488e;

public final class CalendarDetailFragment_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C32488e.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment_Subscriber.C302561 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarDetailFragment) obj).onCalendarEventChanged((C32488e) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
