package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class AccountChangeCallbackProxy implements AbstractC10952a<AccountService.AbstractC4981a> {
    /* renamed from: a */
    public AccountService.AbstractC4981a mo16349b(IBinder iBinder) {
        return BinderAccountChangeCallback.Stub.asInterface(iBinder);
    }
}
