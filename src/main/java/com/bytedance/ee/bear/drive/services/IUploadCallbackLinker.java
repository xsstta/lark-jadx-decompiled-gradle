package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IUploadCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIUploadCallback mBinderIUploadCallback;
    private AbstractC7179g mIUploadCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIUploadCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIUploadCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIUploadCallbackImp.init(application);
    }

    public IUploadCallbackLinker(AbstractC7179g gVar, Application application) {
        this.mIUploadCallbackImp = gVar;
        this.mBinderIUploadCallback = new BinderIUploadCallbackImp(this.mIUploadCallbackImp, application);
    }
}
