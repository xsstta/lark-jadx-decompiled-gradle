package com.ss.android.lark.feed.app.view;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;

public final class ShortcutFeedItemView_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, ShortcutAnimationEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.feed.app.view.ShortcutFeedItemView_Subscriber.C379601 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((ShortcutFeedItemView) obj).getMessageEvent((ShortcutAnimationEvent) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
