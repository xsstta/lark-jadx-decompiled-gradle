package com.ss.android.lark.app.task;

import android.content.Context;
import com.bytedance.lark.sdk.Sdk;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;

public class InitThreadPoolSdkTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Sdk.setPushExecutorService(CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("thread-pool-push"));
    }
}
