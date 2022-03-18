package com.ss.android.vc.lark.notification.ringing;

import android.text.TextUtils;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.vc.lark.notification.ringing.b */
public class C61166b implements AbstractNotification.AbstractC48494a {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48494a
    /* renamed from: a */
    public void mo135461a(Notice notice) {
        if (notice == null || TextUtils.isEmpty(notice.key)) {
            C60700b.m235864f("VCRingNotificationCanceler", "[cancel]", "because notice or key is null");
            return;
        }
        C60700b.m235851b("VCRingNotificationCanceler", "[cancel2]", "notice.key = " + notice.key);
        C57823a.m224448a(ar.m236694a()).mo196174a(notice.key.hashCode());
    }
}
