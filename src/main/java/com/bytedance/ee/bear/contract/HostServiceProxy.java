package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderHostService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class HostServiceProxy implements AbstractC10952a<ak> {
    /* renamed from: a */
    public ak mo16349b(IBinder iBinder) {
        return BinderHostService.Stub.asInterface(iBinder);
    }
}
