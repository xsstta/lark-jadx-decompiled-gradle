package com.ss.android.lark.favorite.list;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.favorite.detail.C37189a;

public final class FavoriteListModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C37189a.class, new BaseEventListener() {
            /* class com.ss.android.lark.favorite.list.FavoriteListModel_Subscriber.C372081 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((FavoriteListModel) obj).onFavoriteDelete((C37189a) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
