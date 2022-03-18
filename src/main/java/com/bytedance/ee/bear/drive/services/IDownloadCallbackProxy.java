package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIDownloadCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IDownloadCallbackProxy implements AbstractC10952a<AbstractC7184l.AbstractC7185a> {
    /* renamed from: a */
    public AbstractC7184l.AbstractC7185a mo16349b(IBinder iBinder) {
        return BinderIDownloadCallback.Stub.asInterface(iBinder);
    }
}
