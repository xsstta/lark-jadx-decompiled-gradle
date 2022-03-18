package com.bytedance.ee.bear.middleground.drive.export;

import android.os.IBinder;
import com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IUploadStateMonitorProxy implements AbstractC10952a<AbstractC9363c.AbstractC9364a> {
    /* renamed from: a */
    public AbstractC9363c.AbstractC9364a mo16349b(IBinder iBinder) {
        return BinderIUploadStateMonitor.Stub.asInterface(iBinder);
    }
}
