package com.ss.android.lark.integrator.mail;

import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.preload.AbstractC52220a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.mail.a */
public class C39846a implements AbstractC52220a {
    @Override // com.ss.android.lark.preload.AbstractC52220a
    public void doPreload() {
        if (!TextUtils.equals(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDefaultTabName(), "mail") && !TextUtils.equals(C36519d.m144080a().mo134818b(), "mail")) {
            MailModuleProvider.m158123a().mo150103c(LarkContext.getApplication());
        }
    }
}
