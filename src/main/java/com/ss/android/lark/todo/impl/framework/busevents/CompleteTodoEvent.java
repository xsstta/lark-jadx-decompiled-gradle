package com.ss.android.lark.todo.impl.framework.busevents;

import com.ss.android.eventbus.BaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/busevents/CompleteTodoEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "todoId", "", "isComplete", "", "(Ljava/lang/String;Z)V", "()Z", "getTodoId", "()Ljava/lang/String;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.b.b */
public final class CompleteTodoEvent extends BaseEvent {

    /* renamed from: a */
    private final String f141051a;

    /* renamed from: b */
    private final boolean f141052b;

    /* renamed from: a */
    public final String mo194121a() {
        return this.f141051a;
    }

    /* renamed from: b */
    public final boolean mo194122b() {
        return this.f141052b;
    }

    public CompleteTodoEvent(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "todoId");
        this.f141051a = str;
        this.f141052b = z;
    }
}
