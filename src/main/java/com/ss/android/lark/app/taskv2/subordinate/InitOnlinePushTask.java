package com.ss.android.lark.app.taskv2.subordinate;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.ApiUtils;

public class InitOnlinePushTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        C51995b.m201716a("init_push");
        mo103164b(context);
        C51995b.m201714a();
    }

    /* renamed from: b */
    public void mo103164b(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerOnlinePush(context);
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerOnlinePush();
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).registerAppStrategyOnlinePush();
    }
}
