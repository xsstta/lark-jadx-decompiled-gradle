package com.bytedance.ee.bear.abtest.service;

import android.os.IBinder;
import com.bytedance.ee.bear.abtest.service.BinderDocsABTestService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class DocsABTestServiceProxy implements AbstractC10952a<AbstractC4156b> {
    /* renamed from: a */
    public AbstractC4156b mo16349b(IBinder iBinder) {
        return BinderDocsABTestService.Stub.asInterface(iBinder);
    }
}
