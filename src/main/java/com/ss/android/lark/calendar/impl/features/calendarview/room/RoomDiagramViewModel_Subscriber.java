package com.ss.android.lark.calendar.impl.features.calendarview.room;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;

public final class RoomDiagramViewModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C32485a.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel_Subscriber.C310001 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((RoomDiagramViewModel) obj).onAccountChanged((C32485a) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, SettingChangedEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel_Subscriber.C310012 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((RoomDiagramViewModel) obj).onSettingChanged((SettingChangedEvent) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
