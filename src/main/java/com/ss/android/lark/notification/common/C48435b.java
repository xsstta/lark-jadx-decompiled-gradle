package com.ss.android.lark.notification.common;

import com.bytedance.lark.pb.email.client.v1.MailNotificationSettings;
import com.ss.android.lark.notification.dto.MailNotificationSetting;

/* renamed from: com.ss.android.lark.notification.common.b */
public class C48435b {
    /* renamed from: a */
    public static MailNotificationSetting m191078a(MailNotificationSettings mailNotificationSettings) {
        return new MailNotificationSetting(mailNotificationSettings.mail_notification_enabled.booleanValue());
    }
}
