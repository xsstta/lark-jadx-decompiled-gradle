package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitAuditPreloadTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).initAuditSdk();
    }
}
