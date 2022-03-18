package com.ss.android.lark.notification.p2382e;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.C48499a;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.notification.e.i */
public class C48464i implements AbstractC48450c {

    /* renamed from: a */
    private Map<Integer, AbstractNotification> f121945a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.e.i$a */
    public static class C48466a {

        /* renamed from: a */
        static C48464i f121946a = new C48464i();
    }

    /* renamed from: a */
    public static C48464i m191147a() {
        return C48466a.f121946a;
    }

    private C48464i() {
        this.f121945a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public AbstractNotification mo169531a(int i) {
        if (this.f121945a.containsKey(Integer.valueOf(i))) {
            return this.f121945a.get(Integer.valueOf(i));
        }
        Log.m165383e("NotificationFactory", "no push type found! for type " + i);
        return null;
    }

    @Override // com.ss.android.lark.notification.p2382e.AbstractC48450c
    /* renamed from: a */
    public <T extends Notice, R extends C48499a> void mo169513a(int i, AbstractNotification<T, R> abstractNotification) {
        if (!this.f121945a.containsKey(Integer.valueOf(i))) {
            this.f121945a.put(Integer.valueOf(i), abstractNotification);
            AbstractNotification.AbstractNotificationDisplayer<R> c = abstractNotification.mo31114c();
            if (c != null) {
                C48460g.m191134a().mo169528a((AbstractNotification.AbstractNotificationDisplayer.AbstractC48493a) c.mo31144a());
            }
        }
    }
}
