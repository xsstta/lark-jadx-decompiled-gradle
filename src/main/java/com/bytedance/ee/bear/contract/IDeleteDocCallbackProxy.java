package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IDeleteDocCallbackProxy implements AbstractC10952a<am.AbstractC5108a> {
    /* renamed from: a */
    public am.AbstractC5108a mo16349b(IBinder iBinder) {
        return BinderIDeleteDocCallback.Stub.asInterface(iBinder);
    }
}
