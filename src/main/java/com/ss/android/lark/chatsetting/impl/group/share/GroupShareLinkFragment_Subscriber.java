package com.ss.android.lark.chatsetting.impl.group.share;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.chatsetting.impl.group.DesktopShareTimeFinishEvent;

public final class GroupShareLinkFragment_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, DesktopShareTimeFinishEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkFragment_Subscriber.C349761 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((GroupShareLinkFragment) obj).onDesktopEditShareTime((DesktopShareTimeFinishEvent) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
