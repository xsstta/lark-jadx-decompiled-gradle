package com.ss.android.lark.calendar.impl.features.search;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.framework.busevents.RefreshSearchResultEvent;

public final class CalendarSearchPresenter_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, RefreshSearchResultEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter_Subscriber.C322901 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarSearchPresenter) obj).onDeleteEvent((RefreshSearchResultEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
    }
}
