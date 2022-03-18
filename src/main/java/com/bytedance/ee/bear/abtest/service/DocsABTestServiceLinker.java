package com.bytedance.ee.bear.abtest.service;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class DocsABTestServiceLinker implements IInterface, AbstractC10957d {
    private BinderDocsABTestService mBinderDocsABTestService;
    private AbstractC4155a mDocsABTestServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderDocsABTestService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mDocsABTestServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mDocsABTestServiceImp.init(application);
    }

    public DocsABTestServiceLinker(AbstractC4155a aVar, Application application) {
        this.mDocsABTestServiceImp = aVar;
        this.mBinderDocsABTestService = new BinderDocsABTestServiceImp(this.mDocsABTestServiceImp, application);
    }
}
