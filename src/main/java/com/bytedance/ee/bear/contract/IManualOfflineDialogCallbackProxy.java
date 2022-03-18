package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IManualOfflineDialogCallbackProxy implements AbstractC10952a<am.AbstractC5111d> {
    /* renamed from: a */
    public am.AbstractC5111d mo16349b(IBinder iBinder) {
        return BinderIManualOfflineDialogCallback.Stub.asInterface(iBinder);
    }
}
