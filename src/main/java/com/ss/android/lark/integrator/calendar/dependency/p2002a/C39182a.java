package com.ss.android.lark.integrator.calendar.dependency.p2002a;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.integrator.calendar.dependency.p2002a.p2003a.C39183a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.a.a */
public class C39182a extends AbstractNotification<Notice, C39183a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return UpdateDialogStatusCode.DISMISS;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C39183a> mo31114c() {
        return new C39185c();
    }
}
