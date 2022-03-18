package com.ss.android.lark.voip.service.impl.app;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;

public final class VoIpCallModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C58039b.class, new BaseEventListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallModel_Subscriber.C580261 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((VoIpCallModel) obj).onVoiceCallStatusChanged((C58039b) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C58130r.class, new BaseEventListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallModel_Subscriber.C580272 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((VoIpCallModel) obj).onVoiceCallStatusChanged((C58130r) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
