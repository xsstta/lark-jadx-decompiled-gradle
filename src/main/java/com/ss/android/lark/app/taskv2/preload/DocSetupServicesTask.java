package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;

public class DocSetupServicesTask extends AsyncLaunchTask {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m106763b(Context context) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).setupServices(context);
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Log.m165389i("DocSetupServicesTask", "execute setupServices");
        CoreThreadPool.getSerialTaskHandler().post(new Runnable(context) {
            /* class com.ss.android.lark.app.taskv2.preload.$$Lambda$DocSetupServicesTask$x9VMdm0QE1BqQjK18pYvfWcAJe8 */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                DocSetupServicesTask.lambda$x9VMdm0QE1BqQjK18pYvfWcAJe8(this.f$0);
            }
        });
    }
}
