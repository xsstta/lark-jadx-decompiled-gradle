package com.ss.android.lark.ding.service.impl.notification.p1806b;

import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.service.impl.notification.entity.C36774a;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.notification.export.AbstractNotification;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.b.a */
public class C36768a extends AbstractNotification<UrgentNotice, C36774a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 5;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<UrgentNotice> mo31113b() {
        return new C36772d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C36774a> mo31114c() {
        return new C36773e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<UrgentNotice> mo31115d() {
        return new AbstractNotification.AbstractC48496c<UrgentNotice>() {
            /* class com.ss.android.lark.ding.service.impl.notification.p1806b.C36768a.C367691 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.notification.export.entity.Notice] */
            @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
            /* renamed from: b */
            public /* synthetic */ void mo31118b(UrgentNotice urgentNotice) {
                AbstractNotification.AbstractC48496c.CC.$default$b(this, urgentNotice);
            }

            /* renamed from: a */
            public void mo31117a(UrgentNotice urgentNotice) {
                C36618a.m144492a().mo135105j().mo135160a(null, null, null, "other");
            }
        };
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: e */
    public AbstractNotification.AbstractC48494a mo135459e() {
        return new C36770b();
    }
}
