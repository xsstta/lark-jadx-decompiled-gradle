package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IMakeCopyCallbackLinker implements IInterface, AbstractC10957d {
    private BinderIMakeCopyCallback mBinderIMakeCopyCallback;
    private AbstractC5178i mIMakeCopyCallbackImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIMakeCopyCallback.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIMakeCopyCallbackImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIMakeCopyCallbackImp.init(application);
    }

    public IMakeCopyCallbackLinker(AbstractC5178i iVar, Application application) {
        this.mIMakeCopyCallbackImp = iVar;
        this.mBinderIMakeCopyCallback = new BinderIMakeCopyCallbackImp(this.mIMakeCopyCallbackImp, application);
    }
}
