package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import com.ss.android.lark.dependency.AbstractC36471e;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.im.dependency.a */
public class C39558a implements AbstractC36471e {

    /* renamed from: a */
    final IOpenPlatformApi f101034a = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class));

    @Override // com.ss.android.lark.dependency.AbstractC36471e
    /* renamed from: a */
    public String mo134487a(Context context) {
        return this.f101034a.getNoAccessWords(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36471e
    /* renamed from: b */
    public String mo134489b(Context context) {
        return this.f101034a.getNoAccessBtn(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36471e
    /* renamed from: c */
    public String mo134490c(Context context) {
        return this.f101034a.getAppDeactivatedWords(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36471e
    /* renamed from: d */
    public String mo134491d(Context context) {
        return this.f101034a.getAppDeletedDesc(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36471e
    /* renamed from: e */
    public String mo134492e(Context context) {
        return this.f101034a.getAppOfflineDesc(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36471e
    /* renamed from: a */
    public void mo134488a(Context context, String str, String str2, String str3) {
        this.f101034a.openBotUsePermissionPage(context, str, str2, str3);
    }
}
