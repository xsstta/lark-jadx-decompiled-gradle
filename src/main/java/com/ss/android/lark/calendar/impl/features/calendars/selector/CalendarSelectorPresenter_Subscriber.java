package com.ss.android.lark.calendar.impl.features.calendars.selector;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32492j;

public final class CalendarSelectorPresenter_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C32492j.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter_Subscriber.C303961 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarSelectorPresenter) obj).onRefreshLocalCalendars((C32492j) baseEvent);
            }
        }, ThreadMode.POSTING);
    }
}
