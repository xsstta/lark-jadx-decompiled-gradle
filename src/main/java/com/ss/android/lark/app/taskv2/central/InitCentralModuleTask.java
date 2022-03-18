package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.CompressSoLoaderTask;
import com.ss.android.lark.app.task.initor.DiskManageModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor;
import java.util.ArrayList;
import java.util.List;

public class InitCentralModuleTask extends AsyncLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitLogTask.class);
        arrayList.add(InitKVDataStoreTask.class);
        arrayList.add(InitCrashMonitorTaskV2.class);
        arrayList.add(InitRustSdkTask.class);
        return arrayList;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        TeaAgentModuleDependencyInitor.m106643a(context);
        DiskManageModuleDependencyInitor.m106375a();
        new CompressSoLoaderTask().mo43817a(context);
    }
}
