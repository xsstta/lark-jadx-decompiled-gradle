package com.bytedance.ee.bear.domain;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class OnDomainCharacteristicChangeListenerLinker implements IInterface, AbstractC10957d {
    private BinderOnDomainCharacteristicChangeListener mBinderOnDomainCharacteristicChangeListener;
    private AbstractC6303a mOnDomainCharacteristicChangeListenerImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderOnDomainCharacteristicChangeListener.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mOnDomainCharacteristicChangeListenerImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mOnDomainCharacteristicChangeListenerImp.init(application);
    }

    public OnDomainCharacteristicChangeListenerLinker(AbstractC6303a aVar, Application application) {
        this.mOnDomainCharacteristicChangeListenerImp = aVar;
        this.mBinderOnDomainCharacteristicChangeListener = new BinderOnDomainCharacteristicChangeListenerImp(this.mOnDomainCharacteristicChangeListenerImp, application);
    }
}
