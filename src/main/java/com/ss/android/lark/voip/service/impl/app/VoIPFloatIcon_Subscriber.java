package com.ss.android.lark.voip.service.impl.app;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;

public final class VoIPFloatIcon_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C58130r.class, new BaseEventListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon_Subscriber.C580151 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((VoIPFloatIcon) obj).onVoiceCallStatusChanged((C58130r) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C58039b.class, new BaseEventListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon_Subscriber.C580162 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((VoIPFloatIcon) obj).onVoiceCallStatusChanged((C58039b) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
