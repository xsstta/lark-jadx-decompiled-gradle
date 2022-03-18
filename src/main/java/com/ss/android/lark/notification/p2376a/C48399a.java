package com.ss.android.lark.notification.p2376a;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2376a.p2377a.C48400a;

/* renamed from: com.ss.android.lark.notification.a.a */
public class C48399a extends AbstractNotification<Notice, C48400a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 8;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C48400a> mo31114c() {
        return new C48403c();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<Notice> mo31115d() {
        return C29990c.m110930b().ad().mo134630a();
    }
}
