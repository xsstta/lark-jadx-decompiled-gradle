package com.ss.android.lark.contact.impl.p1754d;

import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.p1754d.p1755a.C35788a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.contact.impl.d.a */
public class C35787a extends AbstractNotification<Notice, C35788a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 6;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C35788a> mo31114c() {
        return new C35790c();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<Notice> mo31115d() {
        return C35358a.m138143a().mo130170o().mo130236a();
    }
}
