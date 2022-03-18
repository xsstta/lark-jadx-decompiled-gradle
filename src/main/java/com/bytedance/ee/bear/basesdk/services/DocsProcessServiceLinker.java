package com.bytedance.ee.bear.basesdk.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class DocsProcessServiceLinker implements IInterface, AbstractC10957d {
    private BinderDocsProcessService mBinderDocsProcessService;
    private AbstractC4491a mDocsProcessServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderDocsProcessService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mDocsProcessServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mDocsProcessServiceImp.init(application);
    }

    public DocsProcessServiceLinker(AbstractC4491a aVar, Application application) {
        this.mDocsProcessServiceImp = aVar;
        this.mBinderDocsProcessService = new BinderDocsProcessServiceImp(this.mDocsProcessServiceImp, application);
    }
}
