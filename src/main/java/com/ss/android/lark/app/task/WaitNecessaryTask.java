package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.ArrayList;
import java.util.List;

public class WaitNecessaryTask extends AbstractLaunchTask {

    /* renamed from: a */
    List<Class<? extends ILaunchTask>> f72652a;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        return this.f72652a;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
    }

    /* renamed from: b */
    public WaitNecessaryTask mo102766b(Class<? extends ILaunchTask> cls) {
        if (this.f72652a == null) {
            this.f72652a = new ArrayList();
        }
        this.f72652a.add(cls);
        return this;
    }
}
