package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIDriveOpenMonitor;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IDriveOpenMonitorProxy implements AbstractC10952a<AbstractC7184l.AbstractC7187c> {
    /* renamed from: a */
    public AbstractC7184l.AbstractC7187c mo16349b(IBinder iBinder) {
        return BinderIDriveOpenMonitor.Stub.asInterface(iBinder);
    }
}
