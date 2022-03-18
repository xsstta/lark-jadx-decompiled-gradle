package com.ss.android.vc.lark.notification.ringing.offline;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.lark.notification.ringing.offline.c */
public class C61173c implements AbstractNotification.AbstractC48494a {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48494a
    /* renamed from: a */
    public void mo135461a(Notice notice) {
        if (notice != null) {
            C60700b.m235851b("VCOfflineRingNotificationCanceler", "[cancel]", "notice.voipParams = " + notice.voipParams);
            if (notice != null && (notice instanceof VCOfflineNotice)) {
                C61171a.m237879a((VCOfflineNotice) notice);
            }
        }
    }
}
