package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

public class GadgetPreloadTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        Log.m165379d("GadgetPreloadTask", "gadget preload task execute");
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            Log.m165389i("GadgetPreloadTask", "is login so register Push");
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).registerLittleAppOnlinePush();
            return;
        }
        Log.m165389i("GadgetPreloadTask", "not login so do nothing");
    }
}
