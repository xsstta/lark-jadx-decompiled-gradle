package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveToSpaceCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class SaveToSpaceCallbackProxy implements AbstractC10952a<AbstractC5150g.AbstractC5155e> {
    /* renamed from: a */
    public AbstractC5150g.AbstractC5155e mo16349b(IBinder iBinder) {
        return BinderSaveToSpaceCallback.Stub.asInterface(iBinder);
    }
}
