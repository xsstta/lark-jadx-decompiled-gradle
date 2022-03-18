package com.bytedance.ee.bear.contract.darkmode;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.darkmode.BinderDarkModeService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class DarkModeServiceProxy implements AbstractC10952a<AbstractC5128c> {
    /* renamed from: a */
    public AbstractC5128c mo16349b(IBinder iBinder) {
        return BinderDarkModeService.Stub.asInterface(iBinder);
    }
}
