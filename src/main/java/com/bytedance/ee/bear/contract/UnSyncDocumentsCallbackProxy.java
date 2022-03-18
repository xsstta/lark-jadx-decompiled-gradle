package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class UnSyncDocumentsCallbackProxy implements AbstractC10952a<AbstractC5094ag.AbstractC5100f> {
    /* renamed from: a */
    public AbstractC5094ag.AbstractC5100f mo16349b(IBinder iBinder) {
        return BinderUnSyncDocumentsCallback.Stub.asInterface(iBinder);
    }
}
