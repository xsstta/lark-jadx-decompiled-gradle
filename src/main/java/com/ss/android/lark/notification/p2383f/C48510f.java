package com.ss.android.lark.notification.p2383f;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.notification.f.f */
public class C48510f implements AbstractNotification.AbstractC48496c<Notice> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: b */
    public /* synthetic */ void mo31118b(Notice notice) {
        AbstractNotification.AbstractC48496c.CC.$default$b(this, notice);
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: a */
    public void mo31117a(Notice notice) {
        String str;
        String str2;
        String str3 = notice.messageId;
        String str4 = "";
        if (notice.extra != null) {
            str2 = notice.extra.f122004c;
            if (notice.extra.f122005d == Notice.Extra.ChatType.P2P) {
                str = "single";
            } else if (notice.extra.f122005d == Notice.Extra.ChatType.GROUP) {
                str = "group";
            } else {
                str = str4;
            }
        } else {
            str2 = str4;
            str = str2;
        }
        if (notice.type == 2) {
            str4 = "at";
        } else if (notice.type == 1) {
            str4 = "message";
        }
        C29990c.m110930b().ad().mo134631a(str2, str3, str, str4);
    }
}
