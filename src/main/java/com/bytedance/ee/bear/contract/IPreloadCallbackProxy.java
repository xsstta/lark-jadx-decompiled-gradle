package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IPreloadCallbackProxy implements AbstractC10952a<AbstractC5094ag.AbstractC5096b> {
    /* renamed from: a */
    public AbstractC5094ag.AbstractC5096b mo16349b(IBinder iBinder) {
        return BinderIPreloadCallback.Stub.asInterface(iBinder);
    }
}
