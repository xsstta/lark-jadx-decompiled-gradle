package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class UnSyncDocumentsCallbackLinker implements IInterface, AbstractC10957d {
    private BinderUnSyncDocumentsCallback mBinderUnSyncDocumentsCallback;
    private AbstractC5231v mUnSyncDocumentsCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderUnSyncDocumentsCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mUnSyncDocumentsCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mUnSyncDocumentsCallbackImp.init(application);
    }

    public UnSyncDocumentsCallbackLinker(AbstractC5231v vVar, Application application) {
        this.mUnSyncDocumentsCallbackImp = vVar;
        this.mBinderUnSyncDocumentsCallback = new BinderUnSyncDocumentsCallbackImp(this.mUnSyncDocumentsCallbackImp, application);
    }
}
