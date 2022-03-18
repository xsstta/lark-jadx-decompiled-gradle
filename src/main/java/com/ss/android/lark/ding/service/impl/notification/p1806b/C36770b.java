package com.ss.android.lark.ding.service.impl.notification.p1806b;

import android.content.Context;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.b.b */
public class C36770b implements AbstractNotification.AbstractC48494a {

    /* renamed from: a */
    private Context f94479a = C36618a.m144492a().mo135096a();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48494a
    /* renamed from: a */
    public void mo135461a(Notice notice) {
        C57823a.m224448a(this.f94479a).mo196174a(((int) (Long.parseLong(notice.messageId) % 10003)) * 10003);
    }
}
