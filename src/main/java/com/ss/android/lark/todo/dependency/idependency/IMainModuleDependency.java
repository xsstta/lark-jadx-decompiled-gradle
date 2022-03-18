package com.ss.android.lark.todo.dependency.idependency;

import android.content.Context;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/dependency/idependency/IMainModuleDependency;", "", "isEnableTab", "", "isMainTab", "launchTodoTab", "", "context", "Landroid/content/Context;", "launchTodoTabThenOpenCreate", "launchTodoTabWithFilter", "filter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "isResetExpandState", "launchTodoTabWithFirstFilter", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.a.n */
public interface IMainModuleDependency {
    /* renamed from: a */
    void mo145414a(Context context);

    /* renamed from: a */
    void mo145415a(Context context, TodoListView.Type type, boolean z);

    /* renamed from: a */
    boolean mo145416a();

    /* renamed from: b */
    void mo145417b(Context context);

    /* renamed from: b */
    boolean mo145418b();

    /* renamed from: c */
    void mo145419c(Context context);
}
