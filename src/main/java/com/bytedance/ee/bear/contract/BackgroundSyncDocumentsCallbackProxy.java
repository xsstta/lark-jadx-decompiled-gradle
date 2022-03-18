package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class BackgroundSyncDocumentsCallbackProxy implements AbstractC10952a<AbstractC5094ag.AbstractC5095a> {
    /* renamed from: a */
    public AbstractC5094ag.AbstractC5095a mo16349b(IBinder iBinder) {
        return BinderBackgroundSyncDocumentsCallback.Stub.asInterface(iBinder);
    }
}
