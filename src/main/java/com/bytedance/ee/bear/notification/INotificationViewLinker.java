package com.bytedance.ee.bear.notification;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class INotificationViewLinker implements IInterface, AbstractC10957d {
    private BinderINotificationView mBinderINotificationView;
    private AbstractC10301a mINotificationViewImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderINotificationView.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mINotificationViewImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mINotificationViewImp.init(application);
    }

    public INotificationViewLinker(AbstractC10301a aVar, Application application) {
        this.mINotificationViewImp = aVar;
        this.mBinderINotificationView = new BinderINotificationViewImp(this.mINotificationViewImp, application);
    }
}
