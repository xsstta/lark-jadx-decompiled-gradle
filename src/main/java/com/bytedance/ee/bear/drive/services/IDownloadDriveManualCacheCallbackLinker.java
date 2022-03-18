package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IDownloadDriveManualCacheCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIDownloadDriveManualCacheCallback mBinderIDownloadDriveManualCacheCallback;
    private AbstractC7176d mIDownloadDriveManualCacheCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIDownloadDriveManualCacheCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIDownloadDriveManualCacheCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIDownloadDriveManualCacheCallbackImp.init(application);
    }

    public IDownloadDriveManualCacheCallbackLinker(AbstractC7176d dVar, Application application) {
        this.mIDownloadDriveManualCacheCallbackImp = dVar;
        this.mBinderIDownloadDriveManualCacheCallback = new BinderIDownloadDriveManualCacheCallbackImp(this.mIDownloadDriveManualCacheCallbackImp, application);
    }
}
