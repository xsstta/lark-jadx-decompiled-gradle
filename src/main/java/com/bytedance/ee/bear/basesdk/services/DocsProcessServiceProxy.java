package com.bytedance.ee.bear.basesdk.services;

import android.os.IBinder;
import com.bytedance.ee.bear.basesdk.services.BinderDocsProcessService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class DocsProcessServiceProxy implements AbstractC10952a<AbstractC4501b> {
    /* renamed from: a */
    public AbstractC4501b mo16349b(IBinder iBinder) {
        return BinderDocsProcessService.Stub.asInterface(iBinder);
    }
}
