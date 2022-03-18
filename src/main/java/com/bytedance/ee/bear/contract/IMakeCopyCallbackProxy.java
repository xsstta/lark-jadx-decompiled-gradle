package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IMakeCopyCallbackProxy implements AbstractC10952a<am.AbstractC5109b> {
    /* renamed from: a */
    public am.AbstractC5109b mo16349b(IBinder iBinder) {
        return BinderIMakeCopyCallback.Stub.asInterface(iBinder);
    }
}
