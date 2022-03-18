package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import com.ss.android.lark.dependency.AbstractC36511z;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.im.dependency.g */
public class C39565g implements AbstractC36511z {

    /* renamed from: a */
    final IOpenPlatformApi f101041a = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class));

    @Override // com.ss.android.lark.dependency.AbstractC36511z
    /* renamed from: a */
    public void mo134747a(Context context) {
        this.f101041a.preloadBotChatLittleApp(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36511z
    /* renamed from: b */
    public void mo134750b(Context context) {
        this.f101041a.preloadCardLittleApp(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36511z
    /* renamed from: c */
    public void mo134752c(Context context, String str) {
        this.f101041a.handleFinish(context, str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36511z
    /* renamed from: a */
    public void mo134748a(Context context, String str) {
        this.f101041a.openVoteMiniApp(context, str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36511z
    /* renamed from: b */
    public void mo134751b(Context context, String str) {
        this.f101041a.openCreateActionMiniApp(context, str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36511z
    /* renamed from: a */
    public void mo134749a(Context context, String str, String str2) {
        this.f101041a.openTicketMiniApp(context, str, str2);
    }
}
