package com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.framework.busevents.CalendarViewSwitchEvent;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32486b;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32487d;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32489g;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32490h;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;

public final class CalendarShellViewModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, CalendarViewSwitchEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309351 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onCalendarViewSwitchEvent((CalendarViewSwitchEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32490h.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309362 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onNormalViewTimeZoneChangedEvent((C32490h) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32485a.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309373 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onAccountChangedEvent((C32485a) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, SettingChangedEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309384 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onSettingChangedEvent((SettingChangedEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32493l.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309395 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onReloadAllEvent((C32493l) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32487d.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309406 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onLaunchFinished((C32487d) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32486b.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309417 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onAppendEvent((C32486b) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32489g.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel_Subscriber.C309428 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarShellViewModel) obj).onInvalidTimeZoneEvent((C32489g) baseEvent);
            }
        }, ThreadMode.POSTING);
    }
}
