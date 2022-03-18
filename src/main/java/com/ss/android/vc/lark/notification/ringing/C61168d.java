package com.ss.android.vc.lark.notification.ringing;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.lark.notification.ringing.d */
public class C61168d implements AbstractNotification.AbstractC48495b<Notice> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        if (notice == null || notice.extra == null || notice.state != 3) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: c */
    public Notice mo31140c(Notice notice) {
        if (notice == null) {
            return null;
        }
        C60700b.m235851b("VCRingNotificationDataProcessor", "[prepareData]", "notice.key = " + notice.key);
        return notice;
    }
}
