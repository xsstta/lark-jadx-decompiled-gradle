package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderSaveCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class SaveCallbackProxy implements AbstractC10952a<AbstractC5150g.AbstractC5154d> {
    /* renamed from: a */
    public AbstractC5150g.AbstractC5154d mo16349b(IBinder iBinder) {
        return BinderSaveCallback.Stub.asInterface(iBinder);
    }
}
