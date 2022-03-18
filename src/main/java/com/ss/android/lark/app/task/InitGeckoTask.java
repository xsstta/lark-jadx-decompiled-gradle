package com.ss.android.lark.app.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.dynamicconfig.service.impl.C36885b;
import com.ss.android.lark.p1382b.p1383a.C29411a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitGeckoTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        String deviceId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "0";
        }
        String a = C36885b.m145580c().mo136165a("gecko");
        if (!TextUtils.isEmpty(a)) {
            C14264e.m57551a().mo52221a(new GeckoGlobalConfig.C14187a(context).mo52046a($$Lambda$InitGeckoTask$wCQUBEAYKw6VaaeP57LHeAkQso.INSTANCE).mo52050c(a).mo52047a(C26246a.m94977a(context)).mo52044a((long) C29411a.m108291a().mo104277a()).mo52049b(deviceId).mo52045a(GeckoGlobalConfig.ENVType.PROD).mo52048a());
        }
    }
}
