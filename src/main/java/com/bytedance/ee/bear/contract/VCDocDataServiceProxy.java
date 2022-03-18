package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderVCDocDataService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class VCDocDataServiceProxy implements AbstractC10952a<as> {
    /* renamed from: a */
    public as mo16349b(IBinder iBinder) {
        return BinderVCDocDataService.Stub.asInterface(iBinder);
    }
}
