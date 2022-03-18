package com.ss.android.lark.integrator.todo.dependency;

import android.app.Application;
import android.content.Context;
import com.ss.android.lark.todo.dependency.idependency.ISettingDependency;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoSetting;", "Lcom/ss/android/lark/todo/dependency/idependency/ISettingDependency;", "()V", "getContext", "Landroid/content/Context;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.s */
public final class TodoSetting implements ISettingDependency {
    @Override // com.ss.android.lark.todo.dependency.idependency.ISettingDependency
    /* renamed from: a */
    public Context mo145427a() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "LarkContext.getApplication().applicationContext");
        return applicationContext;
    }
}
