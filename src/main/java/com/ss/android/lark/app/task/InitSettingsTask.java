package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitSettingsTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (!((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initAppSettingV3();
        }
    }
}
