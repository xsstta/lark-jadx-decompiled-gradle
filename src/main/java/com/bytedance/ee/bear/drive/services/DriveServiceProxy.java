package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.BinderDriveService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class DriveServiceProxy implements AbstractC10952a<AbstractC7184l> {
    /* renamed from: a */
    public AbstractC7184l mo16349b(IBinder iBinder) {
        return BinderDriveService.Stub.asInterface(iBinder);
    }
}
