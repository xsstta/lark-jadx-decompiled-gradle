package com.ss.android.lark.notification.p2383f;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2383f.p2384a.C48502a;

/* renamed from: com.ss.android.lark.notification.f.a */
public class C48501a extends AbstractNotification<Notice, C48502a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 2;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<Notice> mo31113b() {
        return new C48507d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C48502a> mo31114c() {
        return new C48508e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<Notice> mo31115d() {
        return new C48510f();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: e */
    public AbstractNotification.AbstractC48494a mo135459e() {
        return new C48503b();
    }
}
