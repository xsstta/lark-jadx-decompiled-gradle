package com.bytedance.ee.bear.notification;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.notification.AbstractC10344g;
import com.bytedance.ee.bear.notification.bean.Notification;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.notification.h */
public class C10346h extends AbstractC10317b {

    /* renamed from: a */
    public C10350i f27853a;

    /* renamed from: b */
    public String f27854b;

    /* renamed from: c */
    public Map<AbstractC10344g.AbstractC10345a, AbstractC1178x<Notification>> f27855c = new HashMap();

    /* renamed from: d */
    private Handler f27856d;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.f27853a.mo39477e();
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g
    public void notifyNotificationClosed(String str) {
        if (this.f27854b.equals(str)) {
            this.f27853a.mo39467a(str);
        }
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g
    public void registerINotification(final BinderINotificationView binderINotificationView) {
        final C103471 r0 = new AbstractC1178x<Notification>() {
            /* class com.bytedance.ee.bear.notification.C10346h.C103471 */

            /* renamed from: a */
            public void onChanged(Notification notification) {
                if (notification != null) {
                    C10346h.this.mo39459a(binderINotificationView, notification);
                    C10346h.this.f27854b = notification.getId();
                    return;
                }
                C10346h.this.mo39458a(binderINotificationView);
                C10346h.this.f27854b = "";
            }
        };
        this.f27856d.post(new Runnable() {
            /* class com.bytedance.ee.bear.notification.C10346h.RunnableC103482 */

            public void run() {
                C10346h.this.f27853a.mo39463a().mo5925a(r0);
                C10346h.this.f27855c.put(binderINotificationView, r0);
            }
        });
    }

    /* renamed from: a */
    public void mo39458a(AbstractC10344g.AbstractC10345a aVar) {
        C13479a.m54772d("NotificationServiceImpl", "onNotificationOffline, result = " + this.f27854b);
        aVar.closeNotification(this.f27854b);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.notification.AbstractC10317b
    public void lazyInit(Application application) {
        this.f27856d = new Handler(Looper.getMainLooper());
        C10350i iVar = new C10350i(mo39376c());
        this.f27853a = iVar;
        iVar.mo39469b();
        this.f27853a.mo39473c();
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10344g
    public void unregisterINotification(final BinderINotificationView binderINotificationView) {
        final AbstractC1178x<Notification> xVar = this.f27855c.get(binderINotificationView);
        this.f27856d.post(new Runnable() {
            /* class com.bytedance.ee.bear.notification.C10346h.RunnableC103493 */

            public void run() {
                C10346h.this.f27853a.mo39463a().mo5928b(xVar);
                C10346h.this.f27855c.remove(binderINotificationView);
            }
        });
    }

    /* renamed from: a */
    public void mo39459a(AbstractC10344g.AbstractC10345a aVar, Notification notification) {
        C13479a.m54772d("NotificationServiceImpl", "onNotificationOnline, result = " + notification);
        String c = C4484g.m18494b().mo17252c();
        String en = notification.getContent().getEn();
        if (TextUtils.equals(c, Locale.JAPAN.getLanguage())) {
            en = notification.getContent().getJa();
        } else if (TextUtils.equals(c, Locale.CHINESE.getLanguage())) {
            en = notification.getContent().getZh();
        }
        aVar.showNotification(notification.getId(), notification.getProducts(), en);
    }
}
