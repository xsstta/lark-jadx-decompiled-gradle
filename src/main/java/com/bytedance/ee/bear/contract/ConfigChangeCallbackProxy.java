package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderConfigChangeCallback;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class ConfigChangeCallbackProxy implements AbstractC10952a<ak.AbstractC5105a> {
    /* renamed from: a */
    public ak.AbstractC5105a mo16349b(IBinder iBinder) {
        return BinderConfigChangeCallback.Stub.asInterface(iBinder);
    }
}
