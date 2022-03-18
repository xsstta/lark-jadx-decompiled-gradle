package com.ss.android.lark.integrator.todo.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56253e;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoBrowser;", "Lcom/ss/android/lark/todo/dependency/idependency/IBrowserModuleDependency;", "()V", "openUrl", "", "context", "Landroid/content/Context;", "url", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.e */
public final class TodoBrowser implements AbstractC56253e {
    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56253e
    /* renamed from: a */
    public void mo145368a(Context context, String str) {
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (iCoreApi != null) {
            iCoreApi.openUrl(context, str);
        }
    }
}
