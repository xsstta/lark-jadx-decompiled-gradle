package com.ss.android.lark.voip.service.impl.notification.p2917a;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.voip.service.impl.notification.p2917a.p2918a.C58155a;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.a.a */
public class C58154a extends AbstractNotification<Notice, C58155a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 10005;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<Notice> mo31113b() {
        return new C58158d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C58155a> mo31114c() {
        return new C58159e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: e */
    public AbstractNotification.AbstractC48494a mo135459e() {
        return new C58156b();
    }
}
