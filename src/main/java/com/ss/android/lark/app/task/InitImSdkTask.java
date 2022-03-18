package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.app.util.OpenSSLEnvUtil;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.network.C51858b;
import com.ss.android.lark.platform.network.ttnet.C51880f;
import com.ss.android.lark.utils.ApiUtils;

public class InitImSdkTask extends AsyncLaunchTask {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo102720g() {
        DynamicConfigModule.m145552b().mo136167a();
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        OpenSSLEnvUtil.f72905b.mo103200a();
        Log.m165389i("InitUtil", "start load domain config");
        mo102720g();
        C51880f.m201207a(context);
        Log.m165389i("InitUtil", "start init Im sdk");
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        new C51858b().mo178026a(context, iPassportApi.getDeviceId(), iPassportApi.oldSdkEnv(), iPassportApi.envType(), iPassportApi.getUserUnit(), C26246a.m94977a(context));
    }
}
