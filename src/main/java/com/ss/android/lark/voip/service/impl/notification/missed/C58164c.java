package com.ss.android.lark.voip.service.impl.notification.missed;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.notification.missed.entity.VoipNotice;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.missed.c */
public class C58164c implements AbstractNotification.AbstractC48495b<VoipNotice> {

    /* renamed from: a */
    private AbstractC57987d.AbstractC57988a f143081a = C57977a.m224905c().getChatDependency();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        return 0;
    }

    /* renamed from: a */
    public VoipNotice mo31140c(Notice notice) {
        String str = notice.extra.f122006e;
        if (str == null) {
            return null;
        }
        return new VoipNotice(this.f143081a.mo145506b(str), this.f143081a.mo145503a(str), notice);
    }
}
