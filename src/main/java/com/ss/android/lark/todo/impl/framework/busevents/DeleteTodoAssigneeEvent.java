package com.ss.android.lark.todo.impl.framework.busevents;

import com.ss.android.eventbus.BaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/busevents/DeleteTodoAssigneeEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "todoId", "", "assigneeId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssigneeId", "()Ljava/lang/String;", "getTodoId", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.b.c */
public final class DeleteTodoAssigneeEvent extends BaseEvent {

    /* renamed from: a */
    private final String f141053a;

    /* renamed from: b */
    private final String f141054b;

    /* renamed from: a */
    public final String mo194123a() {
        return this.f141053a;
    }

    /* renamed from: b */
    public final String mo194124b() {
        return this.f141054b;
    }

    public DeleteTodoAssigneeEvent(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "todoId");
        Intrinsics.checkParameterIsNotNull(str2, "assigneeId");
        this.f141053a = str;
        this.f141054b = str2;
    }
}
