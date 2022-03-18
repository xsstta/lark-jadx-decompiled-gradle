package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BinderOpenLifecycle;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class OpenLifecycleProxy implements AbstractC10952a<BaseOpenEntity.AbstractC5156a> {
    /* renamed from: a */
    public BaseOpenEntity.AbstractC5156a mo16349b(IBinder iBinder) {
        return BinderOpenLifecycle.Stub.asInterface(iBinder);
    }
}
