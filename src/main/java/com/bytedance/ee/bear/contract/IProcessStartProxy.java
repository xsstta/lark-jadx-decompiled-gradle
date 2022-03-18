package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IProcessStartProxy implements AbstractC10952a<ak.AbstractC5107c> {
    /* renamed from: a */
    public ak.AbstractC5107c mo16349b(IBinder iBinder) {
        return BinderIProcessStart.Stub.asInterface(iBinder);
    }
}
