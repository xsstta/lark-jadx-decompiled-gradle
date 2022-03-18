package com.ss.android.vc.lark.notification.prompt;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.vc.entity.C60928a;

/* renamed from: com.ss.android.vc.lark.notification.prompt.a */
public class C61159a extends AbstractNotification<CalendarPromptNotice, C60928a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 10006;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<CalendarPromptNotice> mo31113b() {
        return new C61162d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C60928a> mo31114c() {
        return new C61163e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: e */
    public AbstractNotification.AbstractC48494a mo135459e() {
        return new C61160b();
    }
}
