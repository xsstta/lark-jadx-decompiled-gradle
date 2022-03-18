package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.InitCrashMonitorTask;
import com.ss.android.lark.utils.rxjava.C57877e;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;

public class InitCrashMonitorTaskV2 extends InitCrashMonitorTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: d */
    public boolean mo92546d() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitLogTask.class);
        arrayList.add(InitKVDataStoreTask.class);
        return arrayList;
    }

    @Override // com.ss.android.lark.app.task.InitCrashMonitorTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        RxJavaPlugins.setErrorHandler(C57877e.m224588a());
        super.mo43817a(context);
    }
}
