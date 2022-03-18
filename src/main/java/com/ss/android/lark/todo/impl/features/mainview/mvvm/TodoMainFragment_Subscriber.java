package com.ss.android.lark.todo.impl.features.mainview.mvvm;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.todo.impl.framework.busevents.AddTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.CompleteTodoEvent;
import com.ss.android.lark.todo.impl.framework.busevents.DeleteTodoAssigneeEvent;
import com.ss.android.lark.todo.impl.framework.busevents.QuitTodoEvent;

public final class TodoMainFragment_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, AddTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment_Subscriber.C568511 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TodoMainFragment) obj).onAddTodoEvent((AddTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, QuitTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment_Subscriber.C568522 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TodoMainFragment) obj).onQuitTodoEvent((QuitTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, CompleteTodoEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment_Subscriber.C568533 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TodoMainFragment) obj).onCompleteTodoEvent((CompleteTodoEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
        EventBus.getDefault().register(obj, DeleteTodoAssigneeEvent.class, new BaseEventListener() {
            /* class com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment_Subscriber.C568544 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((TodoMainFragment) obj).onDeleteTodoAssigneeEvent((DeleteTodoAssigneeEvent) baseEvent);
            }
        }, ThreadMode.POSTING);
    }
}
