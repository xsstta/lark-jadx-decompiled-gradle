package com.ss.android.lark.integrator.todo.dependency;

import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.todo.dependency.idependency.IAppConfigDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoAppConfig;", "Lcom/ss/android/lark/todo/dependency/idependency/IAppConfigDependency;", "()V", "getTodoHelpDocUrl", "", "key", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.b */
public final class TodoAppConfig implements IAppConfigDependency {
    @Override // com.ss.android.lark.todo.dependency.idependency.IAppConfigDependency
    /* renamed from: a */
    public String mo145363a(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "key");
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (iCoreApi == null) {
            return "";
        }
        C29550b appConfig = iCoreApi.getAppConfig();
        if (appConfig == null || (str2 = appConfig.mo105624a(str)) == null) {
            str2 = "";
        }
        if (str2 != null) {
            return str2;
        }
        return "";
    }
}
