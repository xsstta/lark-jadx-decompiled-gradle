package com.ss.android.lark.ding.service.impl.notification.p1805a;

import com.ss.android.lark.ding.service.impl.notification.entity.C36774a;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.notification.export.AbstractNotification;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.a.b */
public class C36763b extends AbstractNotification<UrgentNotice, C36774a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 3;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<UrgentNotice> mo31113b() {
        return new C36765d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C36774a> mo31114c() {
        return new C36767f();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<UrgentNotice> mo31115d() {
        return new C36766e();
    }
}
