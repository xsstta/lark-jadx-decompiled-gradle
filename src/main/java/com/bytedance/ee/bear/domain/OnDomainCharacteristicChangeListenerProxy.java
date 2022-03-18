package com.bytedance.ee.bear.domain;

import android.os.IBinder;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class OnDomainCharacteristicChangeListenerProxy implements AbstractC10952a<AbstractC6307e.AbstractC6308a.AbstractC6309a> {
    /* renamed from: a */
    public AbstractC6307e.AbstractC6308a.AbstractC6309a mo16349b(IBinder iBinder) {
        return BinderOnDomainCharacteristicChangeListener.Stub.asInterface(iBinder);
    }
}
