package com.ss.android.lark.app.taskv2.subordinate;

import android.content.Context;
import android.os.Process;
import com.ss.android.lark.app.task.InitImSdkTask;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitImSdkTaskV2 extends InitImSdkTask {
    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.lark.app.task.InitImSdkTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        int threadPriority = Process.getThreadPriority(Process.myTid());
        try {
            Process.setThreadPriority(-4);
            super.mo43817a(context);
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).initSessionExpiredProcessor(context);
            Process.setThreadPriority(threadPriority);
        } catch (Throwable th) {
            Process.setThreadPriority(threadPriority);
            throw th;
        }
    }
}
