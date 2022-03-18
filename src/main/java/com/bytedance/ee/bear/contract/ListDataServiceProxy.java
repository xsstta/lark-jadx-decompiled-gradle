package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderListDataService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class ListDataServiceProxy implements AbstractC10952a<am> {
    /* renamed from: a */
    public am mo16349b(IBinder iBinder) {
        return BinderListDataService.Stub.asInterface(iBinder);
    }
}
