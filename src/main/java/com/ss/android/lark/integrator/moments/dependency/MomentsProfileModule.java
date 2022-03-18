package com.ss.android.lark.integrator.moments.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsProfileModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IProfileModuleDependency;", "()V", "startContactsProfile", "", "context", "Landroid/content/Context;", "userId", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.o */
public final class MomentsProfileModule implements IProfileModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency
    /* renamed from: a */
    public void mo144727a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(context, str, "", new ContactSource.C29531a().mo104726a(11).mo104728a());
    }
}
