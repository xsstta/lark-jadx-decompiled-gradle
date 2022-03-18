package com.ss.android.lark.littleapp.p2126d;

import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.p2126d.p2127a.C41320a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.littleapp.d.a */
public class C41319a extends AbstractNotification<Notice, C41320a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 10;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C41320a> mo31114c() {
        return new C41322c();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<Notice> mo31115d() {
        return C41354g.m163939a().getNotificationDependency().mo144232a();
    }
}
