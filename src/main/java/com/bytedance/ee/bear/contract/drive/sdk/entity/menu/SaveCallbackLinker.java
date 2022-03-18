package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class SaveCallbackLinker implements IInterface, AbstractC10957d {
    private BinderSaveCallback mBinderSaveCallback;
    private AbstractC5148e mSaveCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderSaveCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mSaveCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mSaveCallbackImp.init(application);
    }

    public SaveCallbackLinker(AbstractC5148e eVar, Application application) {
        this.mSaveCallbackImp = eVar;
        this.mBinderSaveCallback = new BinderSaveCallbackImp(this.mSaveCallbackImp, application);
    }
}
