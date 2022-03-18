package com.bytedance.ee.bear.drive.services;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drive.services.BinderIUploadCallback;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class IUploadCallbackProxy implements AbstractC10952a<AbstractC7184l.AbstractC7188d> {
    /* renamed from: a */
    public AbstractC7184l.AbstractC7188d mo16349b(IBinder iBinder) {
        return BinderIUploadCallback.Stub.asInterface(iBinder);
    }
}
