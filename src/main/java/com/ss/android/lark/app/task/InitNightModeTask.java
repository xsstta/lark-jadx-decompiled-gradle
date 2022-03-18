package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitNightModeTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        m106245b(context);
    }

    /* renamed from: b */
    private void m106245b(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initNightMode(context);
    }
}
