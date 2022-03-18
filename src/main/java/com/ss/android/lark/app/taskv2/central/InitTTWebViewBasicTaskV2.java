package com.ss.android.lark.app.taskv2.central;

import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.InitTTWebViewBasicTask;
import java.util.ArrayList;
import java.util.List;

public class InitTTWebViewBasicTaskV2 extends InitTTWebViewBasicTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitLogTask.class);
        arrayList.add(InitKVDataStoreTask.class);
        arrayList.add(InitCrashMonitorTaskV2.class);
        return arrayList;
    }
}
