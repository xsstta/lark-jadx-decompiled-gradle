package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.core.dependency.AbstractC36123h;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.core.i */
class C39370i implements AbstractC36123h {
    C39370i() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: c */
    public String mo132975c() {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).getAutoTranslationFGKey();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: d */
    public String mo132976d() {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).getOpenMailFromNoticeKey();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: e */
    public boolean mo132977e() {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).isMailPushOptimizeFGOpen();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: b */
    public boolean mo132973b() {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).isMailSettingEnable();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: a */
    public boolean mo132969a() {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).isSupportMailTo();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: a */
    public void mo132967a(Activity activity) {
        ((IMailApi) ApiUtils.getApi(IMailApi.class)).startEmailSettingPage(activity);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: a */
    public Intent mo132966a(String str) {
        IMailApi iMailApi = (IMailApi) ApiUtils.getApi(IMailApi.class);
        return iMailApi.getLaunchMailTransPageIntent(C36149a.m142162a().mo157098b().mo105697a(LarkContext.getApplication(), iMailApi.getPackageName()), str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: b */
    public boolean mo132974b(String str) {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).canOpen(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: b */
    public void mo132972b(Context context, String str) {
        ((IMailApi) ApiUtils.getApi(IMailApi.class)).openEml(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: a */
    public void mo132968a(Context context, String str) {
        IMailApi iMailApi = (IMailApi) ApiUtils.getApi(IMailApi.class);
        iMailApi.handleMailOfflinePushNotice(C36149a.m142162a().mo157098b().mo105697a(LarkContext.getApplication(), iMailApi.getPackageName()), str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: a */
    public boolean mo132970a(Context context, Intent intent) {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).openMailFromNotify(context, intent);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36123h
    /* renamed from: a */
    public boolean mo132971a(Context context, String str, Map<String, String> map) {
        return ((IMailApi) ApiUtils.getApi(IMailApi.class)).open(context, str, map);
    }
}
