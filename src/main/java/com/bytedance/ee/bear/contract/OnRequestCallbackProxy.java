package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderOnRequestCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class OnRequestCallbackProxy implements AbstractC10952a<am.AbstractC5113f> {
    /* renamed from: a */
    public am.AbstractC5113f mo16349b(IBinder iBinder) {
        return BinderOnRequestCallback.Stub.asInterface(iBinder);
    }
}
