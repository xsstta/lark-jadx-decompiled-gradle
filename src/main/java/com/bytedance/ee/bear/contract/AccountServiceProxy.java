package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderAccountService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class AccountServiceProxy implements AbstractC10952a<AccountService> {
    /* renamed from: a */
    public AccountService mo16349b(IBinder iBinder) {
        return BinderAccountService.Stub.asInterface(iBinder);
    }
}
