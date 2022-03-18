package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.fcm_export.IFCMModule;
import com.ss.android.lark.platform.offlinepush.C51894a;
import com.ss.android.lark.utils.ApiUtils;

public class InitWsOfflinePushTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        IFCMModule loadFCMFromLocal = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadFCMFromLocal();
        if (loadFCMFromLocal != null) {
            loadFCMFromLocal.initializeApp();
        }
        C51894a.C51895a.m201284a(context);
    }
}
