package com.ss.android.lark.integrator.moments.dependency;

import android.app.Activity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.moments.dependency.idependency.IQRCodeModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsQRCodeModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IQRCodeModuleDependency;", "()V", "parseQRCode", "", "qrCodeContent", "", "activity", "Landroid/app/Activity;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.p */
public final class MomentsQRCodeModule implements IQRCodeModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.IQRCodeModuleDependency
    /* renamed from: a */
    public void mo144728a(String str, Activity activity) {
        Intrinsics.checkParameterIsNotNull(str, "qrCodeContent");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).parseQRCode(str, activity);
    }
}
