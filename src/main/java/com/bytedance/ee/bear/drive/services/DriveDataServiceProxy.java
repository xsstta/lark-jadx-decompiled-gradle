package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.BinderDriveDataService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class DriveDataServiceProxy implements AbstractC10952a<AbstractC7181i> {
    /* renamed from: a */
    public AbstractC7181i mo16349b(IBinder iBinder) {
        return BinderDriveDataService.Stub.asInterface(iBinder);
    }
}
