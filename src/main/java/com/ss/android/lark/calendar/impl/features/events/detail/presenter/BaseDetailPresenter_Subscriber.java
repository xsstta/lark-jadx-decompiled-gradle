package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32491i;

public final class BaseDetailPresenter_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C32491i.class, new BaseEventListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter_Subscriber.C313601 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((BaseDetailPresenter) obj).onQuitMeetingEvent((C32491i) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
