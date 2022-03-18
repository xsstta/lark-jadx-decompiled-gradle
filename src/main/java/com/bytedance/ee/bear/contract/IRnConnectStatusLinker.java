package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IRnConnectStatusLinker implements IInterface, AbstractC10957d {
    private BinderIRnConnectStatus mBinderIRnConnectStatus;
    private AbstractC5206o mIRnConnectStatusImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIRnConnectStatus.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIRnConnectStatusImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIRnConnectStatusImp.init(application);
    }

    public IRnConnectStatusLinker(AbstractC5206o oVar, Application application) {
        this.mIRnConnectStatusImp = oVar;
        this.mBinderIRnConnectStatus = new BinderIRnConnectStatusImp(this.mIRnConnectStatusImp, application);
    }
}
