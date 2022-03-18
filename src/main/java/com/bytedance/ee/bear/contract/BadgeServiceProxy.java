package com.bytedance.ee.bear.contract;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderBadgeService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class BadgeServiceProxy implements AbstractC10952a<AbstractC5080aa> {
    /* renamed from: a */
    public AbstractC5080aa mo16349b(IBinder iBinder) {
        return BinderBadgeService.Stub.asInterface(iBinder);
    }
}
