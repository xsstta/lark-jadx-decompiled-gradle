package com.larksuite.framework.launch.task;

import android.content.Context;
import com.larksuite.framework.launch.scheduler.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLaunchTask<T> implements ILaunchTask<T> {

    /* renamed from: d */
    List<Class<? extends ILaunchTask>> f64437d;

    /* renamed from: e */
    Period f64438e = Period.APP_SUPER2ATTACHBASEEND;

    /* renamed from: f */
    Period f64439f = Period.APP_SUPER2ONCREATEEND;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        return null;
    }

    @Override // com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
    }

    @Override // com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 0;
    }

    @Override // com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: d */
    public boolean mo92546d() {
        return false;
    }

    @Override // com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: f */
    public void mo92548f() {
    }

    @Override // com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: c */
    public final List<Class<? extends ILaunchTask>> mo92545c() {
        if (this.f64437d == null) {
            this.f64437d = mo43818a();
        }
        return this.f64437d;
    }

    @Override // com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: e */
    public String mo92547e() {
        return getClass().getSimpleName();
    }

    @Override // com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public ILaunchTask<T> mo92544a(Class<? extends ILaunchTask> cls) {
        if (this.f64437d == null) {
            List<Class<? extends ILaunchTask>> a = mo43818a();
            this.f64437d = a;
            if (a == null) {
                this.f64437d = new ArrayList();
            }
        }
        this.f64437d.add(cls);
        return this;
    }
}
