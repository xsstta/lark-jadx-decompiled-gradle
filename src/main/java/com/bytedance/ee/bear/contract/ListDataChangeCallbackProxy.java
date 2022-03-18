package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class ListDataChangeCallbackProxy implements AbstractC10952a<am.AbstractC5112e> {
    /* renamed from: a */
    public am.AbstractC5112e mo16349b(IBinder iBinder) {
        return BinderListDataChangeCallback.Stub.asInterface(iBinder);
    }
}
