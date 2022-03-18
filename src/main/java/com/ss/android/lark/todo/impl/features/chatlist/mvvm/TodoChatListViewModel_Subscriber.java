package com.ss.android.lark.todo.impl.features.chatlist.mvvm;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.todo.impl.framework.busevents.AddTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.UpdateTodoEvent;

public final class TodoChatListViewModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, UpdateTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel_Subscriber.C563181 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TodoChatListViewModel) obj).onUpdateTodoEvent((UpdateTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, DeleteTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel_Subscriber.C563192 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TodoChatListViewModel) obj).onDeleteTodoEvent((DeleteTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, AddTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.chatlist.mvvm.TodoChatListViewModel_Subscriber.C563203 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TodoChatListViewModel) obj).onAddTodoEvent((AddTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
    }
}
