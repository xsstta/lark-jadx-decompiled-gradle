package com.bytedance.ee.bear.todocenter.push;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class TodoRNServiceLinker implements IInterface, AbstractC10957d {
    private BinderTodoRNService mBinderTodoRNService;
    private AbstractC11708a mTodoRNServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderTodoRNService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mTodoRNServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mTodoRNServiceImp.init(application);
    }

    public TodoRNServiceLinker(AbstractC11708a aVar, Application application) {
        this.mTodoRNServiceImp = aVar;
        this.mBinderTodoRNService = new BinderTodoRNServiceImp(this.mTodoRNServiceImp, application);
    }
}
