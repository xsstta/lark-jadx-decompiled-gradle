package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class BackgroundSyncDocumentsCallbackLinker implements IInterface, AbstractC10957d {
    private AbstractC5117c mBackgroundSyncDocumentsCallbackImp;
    private BinderBackgroundSyncDocumentsCallback mBinderBackgroundSyncDocumentsCallback;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderBackgroundSyncDocumentsCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mBackgroundSyncDocumentsCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mBackgroundSyncDocumentsCallbackImp.init(application);
    }

    public BackgroundSyncDocumentsCallbackLinker(AbstractC5117c cVar, Application application) {
        this.mBackgroundSyncDocumentsCallbackImp = cVar;
        this.mBinderBackgroundSyncDocumentsCallback = new BinderBackgroundSyncDocumentsCallbackImp(this.mBackgroundSyncDocumentsCallbackImp, application);
    }
}
