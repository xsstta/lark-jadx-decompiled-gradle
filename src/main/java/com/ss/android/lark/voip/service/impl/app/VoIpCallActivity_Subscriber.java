package com.ss.android.lark.voip.service.impl.app;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.voip.service.impl.p2913a.C58005a;

public final class VoIpCallActivity_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C58005a.class, new BaseEventListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallActivity_Subscriber.C580211 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((VoIpCallActivity) obj).receiveVoiceCallWrapperEvent((C58005a) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
