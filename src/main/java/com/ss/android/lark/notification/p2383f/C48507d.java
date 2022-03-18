package com.ss.android.lark.notification.p2383f;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.notification.f.d */
public class C48507d implements AbstractNotification.AbstractC48495b<Notice> {

    /* renamed from: a */
    private AbstractC36474h.AbstractC36476b f122096a = C29990c.m110930b().aa();

    /* renamed from: b */
    private AbstractC36474h.AbstractC36477c f122097b = C29990c.m110930b().ac();

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: c */
    public Notice mo31140c(Notice notice) {
        if (notice == null || notice.extra == null) {
            return null;
        }
        return notice;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        if (notice == null || notice.extra == null || notice.extra.f122015n == null) {
            return 0;
        }
        if (notice.shouldNotify || (notice.state != 3 && notice.state != 2)) {
            return notice.extra.f122016o ? 1 : 0;
        }
        return 1;
    }
}
