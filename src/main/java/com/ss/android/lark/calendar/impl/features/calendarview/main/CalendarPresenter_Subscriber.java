package com.ss.android.lark.calendar.impl.features.calendarview.main;

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

public final class CalendarPresenter_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C32493l.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308791 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onReloadAllEvent((C32493l) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32489g.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308802 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onAppendFailWhenTimeZoneInvalid((C32489g) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32486b.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308813 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onAppendEvent((C32486b) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C32485a.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308824 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onAccountChanged((C32485a) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, CalendarViewSwitchEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308835 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onCalendarViewSwitched((CalendarViewSwitchEvent) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C32490h.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308846 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onNormalViewTimeZoneChanged((C32490h) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C32487d.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308857 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onCalendarColdLaunchFinish((C32487d) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, SettingChangedEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter_Subscriber.C308868 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((CalendarPresenter) obj).onSettingChanged((SettingChangedEvent) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
