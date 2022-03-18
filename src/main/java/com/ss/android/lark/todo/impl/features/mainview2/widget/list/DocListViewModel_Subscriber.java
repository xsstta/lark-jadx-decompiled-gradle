package com.ss.android.lark.todo.impl.features.mainview2.widget.list;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.todo.impl.framework.busevents.CompleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoAssigneeEvent;
import com.ss.android.lark.todo.impl.framework.busevents.QuitTodoEvent;

public final class DocListViewModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, QuitTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel_Subscriber.C570421 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((DocListViewModel) obj).onQuitTodoEvent((QuitTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, CompleteTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel_Subscriber.C570432 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((DocListViewModel) obj).onCompleteTodoEvent((CompleteTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, DeleteTodoAssigneeEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview2.widget.list.DocListViewModel_Subscriber.C570443 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((DocListViewModel) obj).onDeleteTodoAssigneeEvent((DeleteTodoAssigneeEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
    }
}
