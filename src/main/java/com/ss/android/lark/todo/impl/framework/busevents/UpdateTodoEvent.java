package com.ss.android.lark.todo.impl.framework.busevents;

import com.bytedance.lark.pb.todo.v1.Todo;
import com.ss.android.eventbus.BaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/busevents/UpdateTodoEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "todo", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "(Lcom/bytedance/lark/pb/todo/v1/Todo;)V", "getTodo", "()Lcom/bytedance/lark/pb/todo/v1/Todo;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.b.f */
public final class UpdateTodoEvent extends BaseEvent {

    /* renamed from: a */
    private final Todo f141057a;

    /* renamed from: a */
    public final Todo mo194127a() {
        return this.f141057a;
    }

    public UpdateTodoEvent(Todo todo) {
        Intrinsics.checkParameterIsNotNull(todo, "todo");
        this.f141057a = todo;
    }
}
