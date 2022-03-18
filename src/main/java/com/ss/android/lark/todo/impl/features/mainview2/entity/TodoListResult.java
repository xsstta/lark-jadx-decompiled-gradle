package com.ss.android.lark.todo.impl.features.mainview2.entity;

import com.bytedance.lark.pb.todo.v1.Todo;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0002\u0010\bR\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/entity/TodoListResult;", "", "originalTodoList", "", "Lcom/bytedance/lark/pb/todo/v1/Todo;", "belongFilter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "(Ljava/util/List;Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;)V", "getBelongFilter", "()Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "setBelongFilter", "(Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;)V", "todoList", "getTodoList", "()Ljava/util/List;", "setTodoList", "(Ljava/util/List;)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.a.g */
public final class TodoListResult {

    /* renamed from: a */
    private List<Todo> f140564a;

    /* renamed from: b */
    private TodoListView.Type f140565b;

    /* renamed from: a */
    public final List<Todo> mo193517a() {
        return this.f140564a;
    }

    /* renamed from: b */
    public final TodoListView.Type mo193518b() {
        return this.f140565b;
    }

    public TodoListResult(List<Todo> list, TodoListView.Type type) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(type, "belongFilter");
        this.f140565b = type;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        this.f140564a = arrayList;
    }
}
