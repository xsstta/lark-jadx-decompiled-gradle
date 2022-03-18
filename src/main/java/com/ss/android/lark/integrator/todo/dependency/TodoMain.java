package com.ss.android.lark.integrator.todo.dependency;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.todo.wrapper.impl.tabspec.TodoTabPageSpec;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoMain;", "Lcom/ss/android/lark/todo/dependency/idependency/IMainModuleDependency;", "()V", "isEnableTab", "", "isMainTab", "launchTodoTab", "", "context", "Landroid/content/Context;", "launchTodoTabThenOpenCreate", "launchTodoTabWithFilter", "filter", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "isResetExpandState", "launchTodoTabWithFirstFilter", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.n */
public final class TodoMain implements IMainModuleDependency {
    @Override // com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency
    /* renamed from: b */
    public boolean mo145418b() {
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTabType("todo") != TabType.Others) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency
    /* renamed from: a */
    public boolean mo145416a() {
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTabType("todo") == TabType.Main) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency
    /* renamed from: a */
    public void mo145414a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        ((ICoreApi) api).getMainLauncher().mo105706b(context, "todo");
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency
    /* renamed from: c */
    public void mo145419c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).launchMainWindow(context, "todo", TodoTabPageSpec.f139213b.mo191711b());
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency
    /* renamed from: b */
    public void mo145417b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Bundle a = TodoTabPageSpec.f139213b.mo191709a();
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        ((ICoreApi) api).getMainLauncher().mo105707b(context, "todo", a);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency
    /* renamed from: a */
    public void mo145415a(Context context, TodoListView.Type type, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(type, "filter");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).launchMainWindow(context, "todo", TodoTabPageSpec.f139213b.mo191710a(type, z));
    }
}
