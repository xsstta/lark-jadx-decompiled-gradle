package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.app.util.OpenSSLEnvUtil;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.network.C51862d;
import com.ss.android.lark.utils.ApiUtils;

public class InitImSdkWschannelTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        Log.m165389i("InitImSdkWschannelTask", "start init wschannel rust sdk");
        OpenSSLEnvUtil.f72905b.mo103200a();
        C51862d dVar = new C51862d();
        dVar.mo178032a();
        dVar.mo178033a(context, iPassportApi.oldSdkEnv(), iPassportApi.envType(), iPassportApi.getUserUnit());
        Log.m165389i("InitImSdkWschannelTask", "end init wschannel rust sdk");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).setupNotificationListener();
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initWSNotificationModule();
    }
}
