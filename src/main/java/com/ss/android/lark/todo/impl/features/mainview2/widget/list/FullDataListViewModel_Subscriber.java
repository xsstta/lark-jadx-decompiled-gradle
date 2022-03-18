package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.todo.impl.framework.busevents.AddTodoEvent;

public final class FullDataListViewModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, AddTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview2.widget.list.FullDataListViewModel_Subscriber.C570541 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((FullDataListViewModel) obj).onAddTodoEvent((AddTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
    }
}
