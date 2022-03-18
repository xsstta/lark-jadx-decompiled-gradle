package com.ss.android.lark.todo.impl.framework;

import android.content.Context;
import com.ss.android.lark.todo.dependency.ITodoDependency;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.ISettingDependency;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/TodoContext;", "", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.a */
public final class TodoContext {

    /* renamed from: a */
    private Context f141043a;

    /* renamed from: a */
    public final Context mo194110a() {
        return this.f141043a;
    }

    public TodoContext() {
        Context context;
        ISettingDependency sVar;
        if (this.f141043a == null) {
            ITodoDependency a = TodoDependencyHolder.f139242a.mo191730a();
            if (a == null || (sVar = a.settingDependency()) == null) {
                context = null;
            } else {
                context = sVar.mo145427a();
            }
            this.f141043a = context;
        }
    }
}
