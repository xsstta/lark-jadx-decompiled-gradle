package com.ss.android.lark.voip.service.impl.notification.missed;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.voip.service.impl.notification.missed.entity.C58167a;
import com.ss.android.lark.voip.service.impl.notification.missed.entity.VoipNotice;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.missed.a */
public class C58161a extends AbstractNotification<VoipNotice, C58167a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 10003;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<VoipNotice> mo31113b() {
        return new C58164c();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C58167a> mo31114c() {
        return new C58165d();
    }
}
