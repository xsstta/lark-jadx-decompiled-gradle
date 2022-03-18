package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.larksuite.framework.launch.task.AbstractLaunchTask;

public abstract class BaseTask extends AbstractLaunchTask {

    /* renamed from: a */
    protected C10917c f30744a;

    /* renamed from: b */
    protected Context f30745b;

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        this.f30745b = context;
        this.f30744a = new C10917c(new C10929e());
    }
}
