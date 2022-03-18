package com.bytedance.ee.bear.notification;

import android.os.IBinder;
import com.bytedance.ee.bear.notification.AbstractC10344g;
import com.bytedance.ee.bear.notification.BinderINotificationView;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class INotificationViewProxy implements AbstractC10952a<AbstractC10344g.AbstractC10345a> {
    /* renamed from: a */
    public AbstractC10344g.AbstractC10345a mo16349b(IBinder iBinder) {
        return BinderINotificationView.Stub.asInterface(iBinder);
    }
}
