package com.ss.android.lark.todo.wrapper.api;

import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.todo.api.ITodoModule;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/api/ITodoModuleForLark;", "Lcom/ss/android/lark/todo/api/ITodoModule;", "createTodoTabPageSpec", "Lcom/ss/android/lark/maincore/TabPageSpec;", "context", "Landroid/content/Context;", "titleController", "Lcom/ss/android/lark/maincore/ITitleController;", "getAppLinkHandlers", "", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "getChatTodoMessageDependency", "Lcom/ss/android/lark/todo/wrapper/api/IChatWindowTodoMessageDependency;", "getShareDependencyFromTodo", "Lcom/ss/android/lark/todo/wrapper/api/IShareModuleDependencyFromTodo;", "getTodoParser", "Lcom/ss/android/lark/todo/wrapper/api/ITodoParser;", "isTodoDailyRemindEnable", "", "isTodoTabEnable", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.a.c */
public interface ITodoModuleForLark extends ITodoModule {
    /* renamed from: a */
    AbstractC44552i mo191664a(Context context, ITitleController iTitleController);

    /* renamed from: a */
    Map<String, AbstractC29186b> mo191665a(Context context);

    /* renamed from: f */
    AbstractC56227a mo191666f();

    /* renamed from: g */
    IShareModuleDependencyFromTodo mo191667g();

    /* renamed from: h */
    ITodoParser mo191668h();

    /* renamed from: i */
    boolean mo191669i();

    /* renamed from: j */
    boolean mo191670j();
}
