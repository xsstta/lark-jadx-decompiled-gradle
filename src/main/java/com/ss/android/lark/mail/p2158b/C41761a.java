package com.ss.android.lark.mail.p2158b;

import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.p2158b.p2159a.C41762a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.mail.b.a */
public class C41761a extends AbstractNotification<Notice, C41762a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 7;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<Notice> mo31113b() {
        return new C41764c();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C41762a> mo31114c() {
        return new C41765d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<Notice> mo31115d() {
        return C41724a.m165678a().getNotificationDependency().mo144442a();
    }
}
