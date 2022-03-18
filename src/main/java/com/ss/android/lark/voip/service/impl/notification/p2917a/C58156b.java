package com.ss.android.lark.voip.service.impl.notification.p2917a;

import android.text.TextUtils;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.p2908e.C57823a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.a.b */
public class C58156b implements AbstractNotification.AbstractC48494a {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48494a
    /* renamed from: a */
    public void mo135461a(Notice notice) {
        if (notice == null || TextUtils.isEmpty(notice.key)) {
            C60700b.m235864f("VoipRingNotificationCanceler", "[cancel]", "because notice or key is null");
            return;
        }
        C60700b.m235851b("VoipRingNotificationCanceler", "[cancel2]", "notice.key = " + notice.key);
        C57823a.m224448a(ar.m236694a()).mo196174a(notice.key.hashCode());
    }
}
