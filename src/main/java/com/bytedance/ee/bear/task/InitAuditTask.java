package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

public class InitAuditTask extends BaseAsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 5;
    }

    @Override // com.bytedance.ee.bear.task.BaseAsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        C13479a.m54764b("InitAuditTask", "execute");
        ((AbstractC9901d) KoinJavaComponent.m268610a(AbstractC9901d.class)).mo37705a();
    }
}
