package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.larksuite.component.safemode.SafeModeConstants;
import com.larksuite.component.safemode.SafeModeManager;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.InitAppreciableTask;
import com.ss.android.lark.app.task.InitMonitorTask;
import com.ss.android.lark.app.taskv2.preload.JatoTask;
import com.ss.android.lark.app.taskv2.scheduler.LaunchTaskExecutor;
import com.ss.android.lark.app.taskv2.subordinate.InitDeviceIdFetcherTask;
import java.util.ArrayList;
import java.util.List;

public class CentralStageFinishedTask extends AsyncLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitCentralModuleTask.class);
        arrayList.add(InitCrashMonitorTaskV2.class);
        arrayList.add(InitKVDataStoreTask.class);
        arrayList.add(InitLogTask.class);
        arrayList.add(InitRustSdkTask.class);
        arrayList.add(InitTTWebViewBasicTaskV2.class);
        arrayList.add(InitUIComponentTask.class);
        arrayList.add(InitMonitorTask.class);
        arrayList.add(JatoTask.class);
        arrayList.add(InitAppreciableTask.class);
        arrayList.add(InitDeviceIdFetcherTask.class);
        arrayList.add(StartMiraTask.class);
        return arrayList;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        if (SafeModeManager.f62333a.mo88864a() == SafeModeConstants.SafeModeLevel.NONE) {
            LaunchTaskExecutor.m106910a().mo103159c();
        }
    }
}
