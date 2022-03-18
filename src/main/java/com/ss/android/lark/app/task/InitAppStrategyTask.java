package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitAppStrategyTask extends AsyncLaunchTask {

    /* renamed from: a */
    private static C28513a.AbstractC28515b f72551a;

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 5;
    }

    /* renamed from: g */
    private void m106067g() {
        C289331 r0 = new C28513a.AbstractC28515b() {
            /* class com.ss.android.lark.app.task.InitAppStrategyTask.C289331 */

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28515b
            public void onLoginStatusChanged(boolean z) {
                ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).notifyAppStrategyOnLoginStatusChanged(z);
            }
        };
        f72551a = r0;
        C28513a.m104513a(r0);
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).onPreTaskStart();
        } else {
            m106067g();
        }
    }
}
