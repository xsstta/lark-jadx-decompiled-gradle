package com.ss.android.lark.notification.p2387i;

import com.bytedance.lark.pb.basic.v1.PushBannerNotificationExtraBody;

/* renamed from: com.ss.android.lark.notification.i.a */
public class C48537a {
    /* renamed from: a */
    public static C48541c m191359a(PushBannerNotificationExtraBody pushBannerNotificationExtraBody) {
        if (pushBannerNotificationExtraBody == null) {
            return null;
        }
        return new C48541c(pushBannerNotificationExtraBody.title, pushBannerNotificationExtraBody.subtitle, pushBannerNotificationExtraBody.content, pushBannerNotificationExtraBody.extra);
    }
}
