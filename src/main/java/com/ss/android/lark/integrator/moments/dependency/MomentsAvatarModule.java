package com.ss.android.lark.integrator.moments.dependency;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.moments.dependency.idependency.IAvatarModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsAvatarModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IAvatarModuleDependency;", "()V", "previewMomentsProfileBackground", "", "context", "Landroid/content/Context;", "url", "", "entityId", "imageView", "Landroid/view/View;", "toolText", "toastText", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.b */
public final class MomentsAvatarModule implements IAvatarModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.IAvatarModuleDependency
    /* renamed from: a */
    public void mo144692a(Context context, String str, String str2, View view, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "entityId");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        Intrinsics.checkParameterIsNotNull(str3, "toolText");
        Intrinsics.checkParameterIsNotNull(str4, "toastText");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).previewMomentsProfileBackground(context, str, str2, view, str3, str4);
    }
}
