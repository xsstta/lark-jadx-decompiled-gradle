package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IManualOfflineDialogCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIManualOfflineDialogCallback mBinderIManualOfflineDialogCallback;
    private AbstractC5192k mIManualOfflineDialogCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIManualOfflineDialogCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIManualOfflineDialogCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIManualOfflineDialogCallbackImp.init(application);
    }

    public IManualOfflineDialogCallbackLinker(AbstractC5192k kVar, Application application) {
        this.mIManualOfflineDialogCallbackImp = kVar;
        this.mBinderIManualOfflineDialogCallback = new BinderIManualOfflineDialogCallbackImp(this.mIManualOfflineDialogCallbackImp, application);
    }
}
