package com.ss.android.lark.notification.p2380d;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2380d.p2381a.C48437a;

/* renamed from: com.ss.android.lark.notification.d.a */
public class C48436a extends AbstractNotification<Notice, C48437a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return UpdateDialogStatusCode.SHOW;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C48437a> mo31114c() {
        return new C48439c();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<Notice> mo31115d() {
        return new C48441d();
    }
}
