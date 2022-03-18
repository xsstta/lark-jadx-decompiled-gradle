package com.bytedance.ee.bear.domain;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class RemoteDomainCharacteristicServiceLinker implements IInterface, AbstractC10957d {
    private BinderRemoteDomainCharacteristicService mBinderRemoteDomainCharacteristicService;
    private AbstractC6304b mRemoteDomainCharacteristicServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderRemoteDomainCharacteristicService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mRemoteDomainCharacteristicServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mRemoteDomainCharacteristicServiceImp.init(application);
    }

    public RemoteDomainCharacteristicServiceLinker(AbstractC6304b bVar, Application application) {
        this.mRemoteDomainCharacteristicServiceImp = bVar;
        this.mBinderRemoteDomainCharacteristicService = new BinderRemoteDomainCharacteristicServiceImp(this.mRemoteDomainCharacteristicServiceImp, application);
    }
}
