package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderIMarkFeedCallback;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IMarkFeedCallbackProxy implements AbstractC10952a<ak.AbstractC5106b> {
    /* renamed from: a */
    public ak.AbstractC5106b mo16349b(IBinder iBinder) {
        return BinderIMarkFeedCallback.Stub.asInterface(iBinder);
    }
}
