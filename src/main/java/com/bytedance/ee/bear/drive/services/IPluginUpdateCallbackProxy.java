package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.AbstractC7197n;
import com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IPluginUpdateCallbackProxy implements AbstractC10952a<AbstractC7197n.AbstractC7198a> {
    /* renamed from: a */
    public AbstractC7197n.AbstractC7198a mo16349b(IBinder iBinder) {
        return BinderIPluginUpdateCallback.Stub.asInterface(iBinder);
    }
}
