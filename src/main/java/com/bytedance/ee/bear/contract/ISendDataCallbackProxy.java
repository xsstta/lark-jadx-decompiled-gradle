package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class ISendDataCallbackProxy implements AbstractC10952a<AbstractC5094ag.AbstractC5098d> {
    /* renamed from: a */
    public AbstractC5094ag.AbstractC5098d mo16349b(IBinder iBinder) {
        return BinderISendDataCallback.Stub.asInterface(iBinder);
    }
}
