package com.ss.android.lark.integrator.todo.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.forward.dto.TodoForwardData;
import com.ss.android.lark.todo.dependency.idependency.IOldModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoOldModule;", "Lcom/ss/android/lark/todo/dependency/idependency/IOldModuleDependency;", "()V", "getForwardData", "Lcom/ss/android/lark/forward/dto/TodoForwardData;", "todoGuid", "", "todoSummary", "goTodoShareSelectPage", "", "context", "Landroid/content/Context;", "fragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "requestCode", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.p */
public final class TodoOldModule implements IOldModuleDependency {
    /* renamed from: a */
    private final TodoForwardData m158784a(String str, String str2) {
        TodoForwardData todoForwardData = new TodoForwardData();
        todoForwardData.setTodoGuid(str);
        todoForwardData.setTodoSummary(str2);
        return todoForwardData;
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IOldModuleDependency
    /* renamed from: a */
    public void mo145422a(Context context, C36516a<?> aVar, String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(str2, "todoSummary");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goTodoShareSelectPage(context, aVar, m158784a(str, str2), i);
    }
}
