package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.larksuite.framework.launch.task.AsyncLaunchTask;

public abstract class BaseAsyncLaunchTask extends AsyncLaunchTask {

    /* renamed from: a */
    protected C10917c f30742a;

    /* renamed from: b */
    protected Context f30743b;

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        this.f30743b = context;
        this.f30742a = new C10917c(new C10929e());
    }
}
