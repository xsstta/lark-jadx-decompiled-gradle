package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.ApiUtils;

public class InitLKPScreenShotPushTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(final Context context) {
        if (DesktopUtil.m144301a(context)) {
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).initScreenShotReceiver();
            C28513a.m104513a(new C28513a.AbstractC28515b() {
                /* class com.ss.android.lark.app.taskv2.preload.InitLKPScreenShotPushTask.C290481 */

                @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28515b
                public void onLoginStatusChanged(boolean z) {
                    if (!z && DesktopUtil.m144301a(context)) {
                        ((IIMApi) ApiUtils.getApi(IIMApi.class)).unInitScreenShotReceiver();
                    }
                }
            });
        }
    }
}
