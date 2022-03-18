package com.ss.android.lark.ding.service.impl.notification.p1805a;

import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.a.e */
public class C36766e implements AbstractNotification.AbstractC48496c<UrgentNotice> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.notification.export.entity.Notice] */
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: b */
    public /* synthetic */ void mo31118b(UrgentNotice urgentNotice) {
        AbstractNotification.AbstractC48496c.CC.$default$b(this, urgentNotice);
    }

    /* renamed from: a */
    public void mo31117a(UrgentNotice urgentNotice) {
        String str;
        String str2 = urgentNotice.messageId;
        String str3 = "";
        if (urgentNotice.extra != null) {
            String str4 = urgentNotice.extra.f122004c;
            if (urgentNotice.extra.f122005d == Notice.Extra.ChatType.P2P) {
                str3 = "single";
            } else if (urgentNotice.extra.f122005d == Notice.Extra.ChatType.GROUP) {
                str3 = "group";
            }
            str = str3;
            str3 = str4;
        } else {
            str = str3;
        }
        C36618a.m144492a().mo135105j().mo135160a(str3, str2, str, "buzz");
    }
}
