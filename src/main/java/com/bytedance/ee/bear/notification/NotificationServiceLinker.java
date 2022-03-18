package com.bytedance.ee.bear.notification;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class NotificationServiceLinker implements IInterface, AbstractC10957d {
    private BinderNotificationService mBinderNotificationService;
    private AbstractC10317b mNotificationServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderNotificationService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mNotificationServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mNotificationServiceImp.init(application);
    }

    public NotificationServiceLinker(AbstractC10317b bVar, Application application) {
        this.mNotificationServiceImp = bVar;
        this.mBinderNotificationService = new BinderNotificationServiceImp(this.mNotificationServiceImp, application);
    }
}
