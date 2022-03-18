package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IDownloadDriveManualCacheCallbackProxy implements AbstractC10952a<AbstractC7184l.AbstractC7186b> {
    /* renamed from: a */
    public AbstractC7184l.AbstractC7186b mo16349b(IBinder iBinder) {
        return BinderIDownloadDriveManualCacheCallback.Stub.asInterface(iBinder);
    }
}
