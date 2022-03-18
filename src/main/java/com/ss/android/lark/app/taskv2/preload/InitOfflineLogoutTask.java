package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitOfflineLogoutTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).runOfflineLogoutTask();
    }
}
