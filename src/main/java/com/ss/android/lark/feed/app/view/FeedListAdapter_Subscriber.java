package com.ss.android.lark.feed.app.view;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.feed.app.model.event.ChatStartEvent;

public final class FeedListAdapter_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, ChatStartEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.feed.app.view.FeedListAdapter_Subscriber.C379371 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((FeedListAdapter) obj).onChatStart((ChatStartEvent) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
