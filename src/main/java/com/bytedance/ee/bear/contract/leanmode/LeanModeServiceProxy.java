package com.bytedance.ee.bear.contract.leanmode;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.leanmode.BinderLeanModeService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class LeanModeServiceProxy implements AbstractC10952a<AbstractC5198c> {
    /* renamed from: a */
    public AbstractC5198c mo16349b(IBinder iBinder) {
        return BinderLeanModeService.Stub.asInterface(iBinder);
    }
}
