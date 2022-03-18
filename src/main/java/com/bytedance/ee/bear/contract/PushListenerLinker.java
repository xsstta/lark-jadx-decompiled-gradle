package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class PushListenerLinker implements IInterface, AbstractC10957d {
    private BinderPushListener mBinderPushListener;
    private AbstractC5230u mPushListenerImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderPushListener.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mPushListenerImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mPushListenerImp.init(application);
    }

    public PushListenerLinker(AbstractC5230u uVar, Application application) {
        this.mPushListenerImp = uVar;
        this.mBinderPushListener = new BinderPushListenerImp(this.mPushListenerImp, application);
    }
}
