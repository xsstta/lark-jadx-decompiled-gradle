package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class DocsDataServiceLinker implements IInterface, AbstractC10957d {
    private BinderDocsDataService mBinderDocsDataService;
    private AbstractC5170f mDocsDataServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderDocsDataService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mDocsDataServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mDocsDataServiceImp.init(application);
    }

    public DocsDataServiceLinker(AbstractC5170f fVar, Application application) {
        this.mDocsDataServiceImp = fVar;
        this.mBinderDocsDataService = new BinderDocsDataServiceImp(this.mDocsDataServiceImp, application);
    }
}
