package com.ss.android.lark.mail.p2158b;

import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.mail.b.c */
public class C41764c implements AbstractNotification.AbstractC48495b<Notice> {

    /* renamed from: a */
    private static AbstractC41740a f106040a = C41724a.m165678a();

    /* renamed from: b */
    private AbstractC41740a.AbstractC41744c f106041b = C41724a.m165678a().getBadgeDependency();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: c */
    public Notice mo31140c(Notice notice) {
        if (notice == null || notice.extra == null) {
            return null;
        }
        if (!f106040a.isAppRealForeground()) {
            this.f106041b.mo144482a(C41724a.m165678a().getAppContext(), this.f106041b.mo144481a() + 1);
        }
        return notice;
    }
}
