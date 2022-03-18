package com.ss.android.openbusiness.event;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.openbusiness.event.p3008a.C59593a;
import com.ss.android.openbusiness.event.p3008a.C59594b;
import com.ss.android.openbusiness.event.p3008a.C59595c;
import com.ss.android.openbusiness.event.p3008a.C59596d;
import com.ss.android.openbusiness.event.p3008a.C59597e;
import com.ss.android.openbusiness.event.p3008a.C59598f;

public final class EventManager_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C59594b.class, new BaseEventListener() {
            /* class com.ss.android.openbusiness.event.EventManager_Subscriber.C595871 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((EventManager) obj).onRequestAppsData((C59594b) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C59595c.class, new BaseEventListener() {
            /* class com.ss.android.openbusiness.event.EventManager_Subscriber.C595882 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((EventManager) obj).onRequestResult((C59595c) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C59593a.class, new BaseEventListener() {
            /* class com.ss.android.openbusiness.event.EventManager_Subscriber.C595893 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((EventManager) obj).onOpbAppsOperate((C59593a) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C59596d.class, new BaseEventListener() {
            /* class com.ss.android.openbusiness.event.EventManager_Subscriber.C595904 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((EventManager) obj).onOpbUpdateConfig((C59596d) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C59598f.class, new BaseEventListener() {
            /* class com.ss.android.openbusiness.event.EventManager_Subscriber.C595915 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((EventManager) obj).onStartDrag((C59598f) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, C59597e.class, new BaseEventListener() {
            /* class com.ss.android.openbusiness.event.EventManager_Subscriber.C595926 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((EventManager) obj).onOpenOpbApp((C59597e) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
