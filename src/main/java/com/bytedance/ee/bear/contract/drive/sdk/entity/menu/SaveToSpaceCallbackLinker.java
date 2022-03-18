package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class SaveToSpaceCallbackLinker implements IInterface, AbstractC10957d {
    private BinderSaveToSpaceCallback mBinderSaveToSpaceCallback;
    private AbstractC5149f mSaveToSpaceCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderSaveToSpaceCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mSaveToSpaceCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mSaveToSpaceCallbackImp.init(application);
    }

    public SaveToSpaceCallbackLinker(AbstractC5149f fVar, Application application) {
        this.mSaveToSpaceCallbackImp = fVar;
        this.mBinderSaveToSpaceCallback = new BinderSaveToSpaceCallbackImp(this.mSaveToSpaceCallbackImp, application);
    }
}
