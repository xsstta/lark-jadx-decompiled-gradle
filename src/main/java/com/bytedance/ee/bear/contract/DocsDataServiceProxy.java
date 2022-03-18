package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderDocsDataService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class DocsDataServiceProxy implements AbstractC10952a<AbstractC5094ag> {
    /* renamed from: a */
    public AbstractC5094ag mo16349b(IBinder iBinder) {
        return BinderDocsDataService.Stub.asInterface(iBinder);
    }
}
