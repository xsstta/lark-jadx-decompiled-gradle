package com.bytedance.ee.bear.notification;

import android.os.IBinder;
import com.bytedance.ee.bear.notification.BinderNotificationService;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class NotificationServiceProxy implements AbstractC10952a<AbstractC10344g> {
    /* renamed from: a */
    public AbstractC10344g mo16349b(IBinder iBinder) {
        return BinderNotificationService.Stub.asInterface(iBinder);
    }
}
