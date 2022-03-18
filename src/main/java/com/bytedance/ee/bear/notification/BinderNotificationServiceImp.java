package com.bytedance.ee.bear.notification;

import android.app.Application;
import com.bytedance.ee.bear.notification.BinderNotificationService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderNotificationServiceImp extends BinderNotificationService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC10344g mNotificationService;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.notification.BinderNotificationService.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.notification.BinderNotificationService.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.notification.BinderNotificationService.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mNotificationService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderNotificationServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g
    public void notifyNotificationClosed(String str) {
        lazyInit();
        this.mNotificationService.notifyNotificationClosed(str);
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g
    public void registerINotification(BinderINotificationView binderINotificationView) {
        lazyInit();
        this.mNotificationService.registerINotification(binderINotificationView);
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g
    public void unregisterINotification(BinderINotificationView binderINotificationView) {
        lazyInit();
        this.mNotificationService.unregisterINotification(binderINotificationView);
    }

    public BinderNotificationServiceImp(AbstractC10344g gVar, Application application) {
        this.mNotificationService = gVar;
        this.mApplication = application;
    }
}
