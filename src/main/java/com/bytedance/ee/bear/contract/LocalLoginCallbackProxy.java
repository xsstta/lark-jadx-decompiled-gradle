package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderLocalLoginCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class LocalLoginCallbackProxy implements AbstractC10952a<AccountService.AbstractC4982b> {
    /* renamed from: a */
    public AccountService.AbstractC4982b mo16349b(IBinder iBinder) {
        return BinderLocalLoginCallback.Stub.asInterface(iBinder);
    }
}
