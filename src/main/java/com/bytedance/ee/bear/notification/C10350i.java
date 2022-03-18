package com.bytedance.ee.bear.notification;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
import com.bytedance.ee.bear.notification.AbstractC10323d;
import com.bytedance.ee.bear.notification.bean.Notification;
import com.bytedance.ee.bear.notification.p512a.C10302a;
import com.bytedance.ee.bear.notification.p512a.C10307b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.notification.i */
public class C10350i {

    /* renamed from: a */
    public CopyOnWriteArrayList<String> f27865a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public C10307b f27866b;

    /* renamed from: c */
    private C1177w<Notification> f27867c = new C1177w<>();

    /* renamed from: d */
    private LiveData<List<Notification>> f27868d;

    /* renamed from: e */
    private Map<AbstractC10323d.AbstractC10325b, BinderOnDomainCharacteristicChangeListener> f27869e = new HashMap();

    /* renamed from: f */
    private HandlerC10360a f27870f = new HandlerC10360a(Looper.getMainLooper());

    /* renamed from: g */
    private AbstractC10323d.AbstractC10325b f27871g = new AbstractC10323d.AbstractC10325b() {
        /* class com.bytedance.ee.bear.notification.C10350i.C103511 */

        @Override // com.bytedance.ee.bear.notification.AbstractC10323d.AbstractC10325b
        /* renamed from: a */
        public void mo39434a(String str) {
            C13479a.m54764b("NotificationViewModel", "onConfigChanged()...newUnitId = " + str);
            C10350i.this.f27866b.mo39361a(str);
        }
    };

    /* renamed from: h */
    private AbstractC1178x<List<Notification>> f27872h = new AbstractC1178x<List<Notification>>() {
        /* class com.bytedance.ee.bear.notification.C10350i.C103588 */

        /* renamed from: a */
        public void onChanged(List<Notification> list) {
            if (list != null) {
                C10350i.this.mo39472b(list);
                C10350i.this.mo39468a(list);
                C13479a.m54772d("NotificationViewModel", "notificationDatabase: onChanged, notificationResults = " + list);
                for (Notification notification : list) {
                    C10350i.this.mo39464a(notification);
                    C10350i.this.mo39470b(notification);
                }
            }
        }
    };

    /* renamed from: a */
    public LiveData<Notification> mo39463a() {
        return this.f27867c;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m43050g() {
        this.f27868d.mo5925a(this.f27872h);
    }

    /* renamed from: c */
    public void mo39473c() {
        mo39475d();
        m43049f();
    }

    /* renamed from: e */
    public void mo39477e() {
        this.f27866b.mo39358a();
        mo39471b(this.f27871g);
    }

    /* renamed from: f */
    private void m43049f() {
        this.f27866b.mo39363b().mo238001b(new Consumer<List<Notification>>() {
            /* class com.bytedance.ee.bear.notification.C10350i.C103599 */

            /* renamed from: a */
            public void accept(List<Notification> list) throws Exception {
                ArrayList arrayList = new ArrayList();
                for (Notification notification : list) {
                    if (C10350i.this.f27865a.contains(notification.getId())) {
                        C13479a.m54772d("NotificationViewModel", "result " + C13598b.m55190a(notification) + " has closed but unsync, ignore it");
                    } else {
                        arrayList.add(notification);
                    }
                }
                C13479a.m54764b("NotificationViewModel", "loadValidNotificationFromNet, result = " + C13598b.m55190a(arrayList));
                C10350i.this.f27866b.mo39365b(arrayList);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.notification.C10350i.AnonymousClass10 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("NotificationViewModel", "loadValidNotificationFromNet", th);
            }
        });
    }

    /* renamed from: b */
    public void mo39469b() {
        this.f27866b.mo39366c().mo237998a(new AbstractC68322n<List<String>>() {
            /* class com.bytedance.ee.bear.notification.C10350i.C103577 */

            /* renamed from: a */
            public boolean test(List<String> list) {
                return !list.isEmpty();
            }
        }).mo238001b(new Consumer<List<String>>() {
            /* class com.bytedance.ee.bear.notification.C10350i.C103555 */

            /* renamed from: a */
            public void accept(List<String> list) {
                C13479a.m54772d("NotificationViewModel", "loadUnSyncNotification: " + list);
                C10350i.this.f27865a.clear();
                C10350i.this.f27865a.addAll(list);
                C10350i.this.f27866b.mo39362a(list);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.notification.C10350i.C103566 */

            /* renamed from: a */
            public void accept(Throwable th) {
                C13479a.m54759a("NotificationViewModel", "loadUnSyncNotification failed", th);
            }
        });
    }

    /* renamed from: d */
    public void mo39475d() {
        this.f27868d = this.f27866b.mo39368d();
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.notification.$$Lambda$i$wvMLXGHAXaGYoZRARL0SFSVAdSQ */

            public final void run() {
                C10350i.this.m43050g();
            }
        });
    }

    /* renamed from: a */
    public void mo39468a(List<Notification> list) {
        Collections.sort(list, new Comparator<Notification>() {
            /* class com.bytedance.ee.bear.notification.C10350i.C103522 */

            /* renamed from: a */
            public int compare(Notification notification, Notification notification2) {
                return (int) (notification.getStart_time() - notification2.getStart_time());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.notification.i$a */
    public class HandlerC10360a extends Handler {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C10350i.this.mo39474c((Notification) message.obj);
            } else if (i == 1) {
                C10350i.this.mo39476d((Notification) message.obj);
            }
        }

        HandlerC10360a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public void mo39465a(AbstractC10323d.AbstractC10324a aVar) {
        if (aVar != null) {
            ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(new NotificationViewModel$12(this, aVar));
        }
    }

    /* renamed from: a */
    public void mo39466a(AbstractC10323d.AbstractC10325b bVar) {
        if (bVar != null) {
            AbstractC6307e eVar = (AbstractC6307e) KoinJavaComponent.m268610a(AbstractC6307e.class);
            BinderOnDomainCharacteristicChangeListener remove = this.f27869e.remove(bVar);
            if (remove != null) {
                eVar.mo17337b(remove);
            }
            NotificationViewModel$11 notificationViewModel$11 = new NotificationViewModel$11(this, bVar);
            eVar.mo17335a(notificationViewModel$11);
            this.f27869e.put(bVar, notificationViewModel$11);
        }
    }

    /* renamed from: b */
    public void mo39471b(AbstractC10323d.AbstractC10325b bVar) {
        BinderOnDomainCharacteristicChangeListener remove;
        if (bVar != null && (remove = this.f27869e.remove(bVar)) != null) {
            ((AbstractC6307e) KoinJavaComponent.m268610a(AbstractC6307e.class)).mo17337b(remove);
        }
    }

    /* renamed from: d */
    public void mo39476d(Notification notification) {
        C13479a.m54772d("NotificationViewModel", "handleMessageEnd: " + notification);
        if (notification.equals(this.f27867c.mo5927b())) {
            this.f27866b.mo39364b(notification.getId());
            this.f27867c.mo5926a((Notification) null);
        }
    }

    public C10350i(C10917c cVar) {
        C10307b bVar = new C10307b(cVar);
        this.f27866b = bVar;
        bVar.mo39359a(new C10302a.AbstractC10306b() {
            /* class com.bytedance.ee.bear.notification.C10350i.C103533 */

            @Override // com.bytedance.ee.bear.notification.p512a.C10302a.AbstractC10306b
            /* renamed from: a */
            public void mo39357a(Notification notification, boolean z) {
                C13479a.m54764b("NotificationViewModel", "onNotificationChange: " + notification + ", isClose: " + z);
                if (C10350i.this.f27865a.contains(notification.getId())) {
                    C13479a.m54772d("NotificationViewModel", "result " + notification + " has closed but unsync, ignore it");
                } else if (z) {
                    C10350i.this.f27866b.mo39364b(notification.getId());
                } else {
                    C10350i.this.f27866b.mo39360a(notification);
                }
            }
        });
        mo39465a(new AbstractC10323d.AbstractC10324a() {
            /* class com.bytedance.ee.bear.notification.C10350i.C103544 */

            @Override // com.bytedance.ee.bear.notification.AbstractC10323d.AbstractC10324a
            /* renamed from: a */
            public void mo39433a() {
                C10350i.this.mo39475d();
            }
        });
        mo39466a(this.f27871g);
    }

    /* renamed from: a */
    public void mo39464a(Notification notification) {
        C13479a.m54772d("NotificationViewModel", "sendStartMessage: " + notification + ", delay = " + (((notification.getStart_time() * 1000) - System.currentTimeMillis()) / 1000));
        Message obtain = Message.obtain(this.f27870f, 0);
        obtain.obj = notification;
        this.f27870f.sendMessageDelayed(obtain, (notification.getStart_time() * 1000) - System.currentTimeMillis());
    }

    /* renamed from: b */
    public void mo39470b(Notification notification) {
        C13479a.m54772d("NotificationViewModel", "sendEndMessage: " + notification + ", delay = " + (((notification.getEnd_time() * 1000) - System.currentTimeMillis()) / 1000));
        Message obtain = Message.obtain(this.f27870f, 1);
        obtain.obj = notification;
        this.f27870f.sendMessageDelayed(obtain, (notification.getEnd_time() * 1000) - System.currentTimeMillis());
    }

    /* renamed from: c */
    public void mo39474c(Notification notification) {
        List<Notification> list;
        C13479a.m54772d("NotificationViewModel", "handleMessageStart: " + notification);
        LiveData<List<Notification>> liveData = this.f27868d;
        Notification notification2 = null;
        if (liveData != null) {
            list = liveData.mo5927b();
        } else {
            list = null;
        }
        if (list != null) {
            Iterator<Notification> it = this.f27868d.mo5927b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Notification next = it.next();
                if (TextUtils.equals(next.getId(), notification.getId())) {
                    notification2 = next;
                    break;
                }
            }
            if (notification2 != null) {
                C13479a.m54764b("NotificationViewModel", "handleMessageStart: show last version notification");
                this.f27867c.mo5926a(notification);
            }
        }
    }

    /* renamed from: a */
    public void mo39467a(String str) {
        this.f27866b.mo39367c(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.f27866b.mo39362a(arrayList);
        this.f27867c.mo5926a((Notification) null);
    }

    /* renamed from: b */
    public void mo39472b(List<Notification> list) {
        Notification b = this.f27867c.mo5927b();
        if (b != null && !list.contains(b)) {
            C13479a.m54772d("NotificationViewModel", "hideOfflineNotificationIfNeed: current notification is offline, dismiss it");
            this.f27867c.mo5926a((Notification) null);
        }
    }
}
