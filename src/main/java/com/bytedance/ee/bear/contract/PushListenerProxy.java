package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.BinderPushListener;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class PushListenerProxy implements AbstractC10952a<AbstractC5094ag.AbstractC5099e> {
    /* renamed from: a */
    public AbstractC5094ag.AbstractC5099e mo16349b(IBinder iBinder) {
        return BinderPushListener.Stub.asInterface(iBinder);
    }
}
