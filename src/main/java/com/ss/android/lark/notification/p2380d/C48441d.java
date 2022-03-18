package com.ss.android.lark.notification.p2380d;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.notification.d.d */
public class C48441d implements AbstractNotification.AbstractC48496c<Notice> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: b */
    public /* synthetic */ void mo31118b(Notice notice) {
        AbstractNotification.AbstractC48496c.CC.$default$b(this, notice);
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: a */
    public void mo31117a(Notice notice) {
        String str;
        String str2 = notice.messageId;
        if (notice.extra != null) {
            str = notice.extra.f122004c;
        } else {
            str = "";
        }
        C29990c.m110930b().ad().mo134631a(str, str2, null, "other");
    }
}
