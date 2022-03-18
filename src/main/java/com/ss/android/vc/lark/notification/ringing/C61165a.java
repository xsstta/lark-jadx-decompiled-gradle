package com.ss.android.vc.lark.notification.ringing;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.entity.C60997u;

/* renamed from: com.ss.android.vc.lark.notification.ringing.a */
public class C61165a extends AbstractNotification<Notice, C60997u> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 10004;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<Notice> mo31113b() {
        return new C61168d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C60997u> mo31114c() {
        return new C61169e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: e */
    public AbstractNotification.AbstractC48494a mo135459e() {
        return new C61166b();
    }
}
