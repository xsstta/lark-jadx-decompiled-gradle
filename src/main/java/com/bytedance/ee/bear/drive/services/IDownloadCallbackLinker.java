package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IDownloadCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIDownloadCallback mBinderIDownloadCallback;
    private AbstractC7175c mIDownloadCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIDownloadCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIDownloadCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIDownloadCallbackImp.init(application);
    }

    public IDownloadCallbackLinker(AbstractC7175c cVar, Application application) {
        this.mIDownloadCallbackImp = cVar;
        this.mBinderIDownloadCallback = new BinderIDownloadCallbackImp(this.mIDownloadCallbackImp, application);
    }
}
