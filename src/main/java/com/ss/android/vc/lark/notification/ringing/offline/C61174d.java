package com.ss.android.vc.lark.notification.ringing.offline;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.lark.notification.ringing.offline.d */
public class C61174d implements AbstractNotification.AbstractC48495b<Notice> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        return 1;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: c */
    public Notice mo31140c(Notice notice) {
        if (notice == null) {
            return null;
        }
        C60700b.m235851b("VCOfflineRingNotificationDataProcessor", "[prepareData]", "notice.voipParams = " + notice.voipParams);
        if (notice.extra == null) {
            notice.extra = new Notice.Extra();
        }
        return new VCOfflineNotice(notice);
    }
}
