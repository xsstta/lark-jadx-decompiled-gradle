package com.ss.android.lark.mine.impl.index.v2.title;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.mine.impl.status.p2282a.C45802a;

public final class TitleModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C45802a.class, new BaseEventListener() {
            /* class com.ss.android.lark.mine.impl.index.v2.title.TitleModel_Subscriber.C457391 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TitleModel) obj).onUserStatusUpdate((C45802a) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
