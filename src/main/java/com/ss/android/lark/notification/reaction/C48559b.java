package com.ss.android.lark.notification.reaction;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.reaction.b */
public class C48559b implements AbstractNotification.AbstractC48494a {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48494a
    /* renamed from: a */
    public void mo135461a(Notice notice) {
        C57823a.m224448a(C29990c.m110930b().mo134528a()).mo196174a(((int) (Long.parseLong(notice.messageId) % 10001)) * UpdateDialogStatusCode.DISMISS);
    }
}
