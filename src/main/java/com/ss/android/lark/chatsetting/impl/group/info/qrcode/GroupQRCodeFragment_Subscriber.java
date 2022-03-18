package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.chatsetting.impl.group.DesktopShareTimeFinishEvent;

public final class GroupQRCodeFragment_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, DesktopShareTimeFinishEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeFragment_Subscriber.C346551 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((GroupQRCodeFragment) obj).onDesktopEditShareTime((DesktopShareTimeFinishEvent) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
