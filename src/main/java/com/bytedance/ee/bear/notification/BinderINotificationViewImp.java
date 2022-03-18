package com.bytedance.ee.bear.notification;

import android.app.Application;
import com.bytedance.ee.bear.notification.AbstractC10344g;
import com.bytedance.ee.bear.notification.BinderINotificationView;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderINotificationViewImp extends BinderINotificationView.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AbstractC10344g.AbstractC10345a mINotificationView;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.notification.BinderINotificationView.Stub
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.notification.BinderINotificationView.Stub
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.notification.BinderINotificationView.Stub
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mINotificationView;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderINotificationViewImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g.AbstractC10345a
    public void closeNotification(String str) {
        lazyInit();
        this.mINotificationView.closeNotification(str);
    }

    public BinderINotificationViewImp(AbstractC10344g.AbstractC10345a aVar, Application application) {
        this.mINotificationView = aVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g.AbstractC10345a
    public void showNotification(String str, List<String> list, String str2) {
        lazyInit();
        this.mINotificationView.showNotification(str, list, str2);
    }
}
