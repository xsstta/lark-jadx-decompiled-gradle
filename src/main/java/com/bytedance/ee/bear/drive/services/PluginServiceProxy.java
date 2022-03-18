package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.BinderPluginService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class PluginServiceProxy implements AbstractC10952a<AbstractC7197n> {
    /* renamed from: a */
    public AbstractC7197n mo16349b(IBinder iBinder) {
        return BinderPluginService.Stub.asInterface(iBinder);
    }
}
