package com.ss.android.lark.integrator.moments.dependency;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.moments.dependency.idependency.IPhoneModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsPhoneModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IPhoneModuleDependency;", "()V", "showPhoneIdentifyDialog", "", "context", "Landroid/content/Context;", "phoneNumber", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.n */
public final class MomentsPhoneModule implements IPhoneModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.IPhoneModuleDependency
    /* renamed from: a */
    public void mo144726a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).showPhoneIdentifyDialog((Activity) context, str);
    }
}
