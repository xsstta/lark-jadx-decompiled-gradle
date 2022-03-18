package com.ss.android.lark.app.taskv2.subordinate;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.taskv2.central.InitCentralModuleTask;
import com.ss.android.lark.app.taskv2.central.InitCrashMonitorTaskV2;
import com.ss.android.lark.app.taskv2.central.InitKVDataStoreTask;
import com.ss.android.lark.platform.p2476b.C51714a;
import java.util.ArrayList;
import java.util.List;

public class InitDeviceIdFetcherTask extends AbstractLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitCentralModuleTask.class);
        arrayList.add(InitKVDataStoreTask.class);
        arrayList.add(InitCrashMonitorTaskV2.class);
        return arrayList;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        C51714a.m200520a(context);
    }
}
