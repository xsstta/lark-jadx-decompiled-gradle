package com.ss.android.vc.lark.notification.ringing.offline;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.C60997u;

/* renamed from: com.ss.android.vc.lark.notification.ringing.offline.b */
public class C61172b extends AbstractNotification<Notice, C60997u> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 20002;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<Notice> mo31113b() {
        return new C61174d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C60997u> mo31114c() {
        return new C61175e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: e */
    public AbstractNotification.AbstractC48494a mo135459e() {
        return new C61173c();
    }

    public C61172b() {
        C60700b.m235851b("VCOfflineRingNotification", "constructor", "");
    }
}
