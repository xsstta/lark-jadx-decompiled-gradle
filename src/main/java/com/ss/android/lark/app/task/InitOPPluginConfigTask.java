package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitOPPluginConfigTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getOpenPlatformModule();
    }
}
