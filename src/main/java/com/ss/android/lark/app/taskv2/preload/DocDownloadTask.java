package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.utils.ApiUtils;

public class DocDownloadTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).downloadFullResource(context);
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).fetchAppSetting();
    }
}
