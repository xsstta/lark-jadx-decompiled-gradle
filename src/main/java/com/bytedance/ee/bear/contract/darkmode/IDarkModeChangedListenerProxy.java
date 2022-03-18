package com.bytedance.ee.bear.contract.darkmode;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.darkmode.AbstractC5128c;
import com.bytedance.ee.bear.contract.darkmode.BinderIDarkModeChangedListener;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IDarkModeChangedListenerProxy implements AbstractC10952a<AbstractC5128c.AbstractC5129a> {
    /* renamed from: a */
    public AbstractC5128c.AbstractC5129a mo16349b(IBinder iBinder) {
        return BinderIDarkModeChangedListener.Stub.asInterface(iBinder);
    }
}
