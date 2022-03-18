package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IManualOfflineCallbackProxy implements AbstractC10952a<am.AbstractC5110c> {
    /* renamed from: a */
    public am.AbstractC5110c mo16349b(IBinder iBinder) {
        return BinderIManualOfflineCallback.Stub.asInterface(iBinder);
    }
}
