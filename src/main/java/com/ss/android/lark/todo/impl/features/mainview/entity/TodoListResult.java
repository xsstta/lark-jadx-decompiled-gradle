package com.ss.android.lark.todo.impl.features.mainview.entity;

import com.bytedance.lark.pb.todo.v1.Todo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoListResult;", "", "originalTodoList", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "belongFilter", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "(Ljava/util/List;Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;)V", "getBelongFilter", "()Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "setBelongFilter", "(Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;)V", "todoList", "getTodoList", "()Ljava/util/List;", "setTodoList", "(Ljava/util/List;)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.entity.c */
public final class TodoListResult {

    /* renamed from: a */
    private List<Todo> f140336a;

    /* renamed from: b */
    private TodoFilterType f140337b;

    /* renamed from: a */
    public final List<Todo> mo193211a() {
        return this.f140336a;
    }

    /* renamed from: b */
    public final TodoFilterType mo193212b() {
        return this.f140337b;
    }

    public TodoListResult(List<Todo> list, TodoFilterType todoFilterType) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(todoFilterType, "belongFilter");
        this.f140337b = todoFilterType;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        this.f140336a = arrayList;
    }
}
