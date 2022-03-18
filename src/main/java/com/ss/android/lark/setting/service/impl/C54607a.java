package com.ss.android.lark.setting.service.impl;

import com.bytedance.lark.pb.settings.v1.DriveNotificationSetting;
import com.bytedance.lark.pb.settings.v1.MessengerNotificationSetting;
import com.bytedance.lark.pb.settings.v1.NotificationSettingV2;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.dto.C54122b;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;

/* renamed from: com.ss.android.lark.setting.service.impl.a */
public class C54607a {
    /* renamed from: a */
    private static DriveNotificationSetting m211912a(C54122b bVar) {
        return new DriveNotificationSetting(Boolean.valueOf(bVar.mo185285a()));
    }

    /* renamed from: a */
    private static C54122b m211916a(DriveNotificationSetting driveNotificationSetting) {
        if (driveNotificationSetting == null) {
            return null;
        }
        return new C54122b(driveNotificationSetting.notify_open.booleanValue());
    }

    /* renamed from: a */
    public static NotificationSettingV2 m211913a(com.ss.android.lark.setting.dto.NotificationSettingV2 notificationSettingV2) {
        return new NotificationSettingV2(new MessengerNotificationSetting.C19171a().mo65495a(MessengerNotificationSetting.SwithState.fromValue(notificationSettingV2.getChatMsgState().getNumber())).mo65496a(Boolean.valueOf(notificationSettingV2.isBuzzOpen())).mo65498b(Boolean.valueOf(notificationSettingV2.isMentionOpen())).mo65499c(Boolean.valueOf(notificationSettingV2.isUserSingleChatOpen())).mo65500d(Boolean.valueOf(notificationSettingV2.isMentionAllOpen())).build(), m211912a(notificationSettingV2.getDriveNotificationSetting()));
    }

    /* renamed from: a */
    public static NotificationSetting m211914a(com.bytedance.lark.pb.settings.v1.NotificationSetting notificationSetting) {
        boolean z;
        if (notificationSetting == null) {
            return null;
        }
        if (notificationSetting.all != null && notificationSetting.all.booleanValue()) {
            return NotificationSetting.allInstance();
        }
        if (notificationSetting.none != null && notificationSetting.none.booleanValue()) {
            return NotificationSetting.noneInstance();
        }
        if (notificationSetting.specific_messages == null) {
            return NotificationSetting.buzzAndMentionInstance();
        }
        boolean z2 = false;
        if (notificationSetting.specific_messages.buzz == null) {
            z = false;
        } else {
            z = notificationSetting.specific_messages.buzz.booleanValue();
        }
        if (notificationSetting.specific_messages.mention != null) {
            z2 = notificationSetting.specific_messages.mention.booleanValue();
        }
        if (z && z2) {
            return NotificationSetting.buzzAndMentionInstance();
        }
        if (z) {
            return NotificationSetting.buzzInstance();
        }
        if (z2) {
            return NotificationSetting.mentionInstance();
        }
        return NotificationSetting.buzzAndMentionInstance();
    }

    /* renamed from: a */
    public static com.ss.android.lark.setting.dto.NotificationSettingV2 m211915a(NotificationSettingV2 notificationSettingV2) {
        if (notificationSettingV2 == null) {
            Log.m165383e("NotificationSettingParser", "parseNotificationSettingV2FromPb failed: pbSettingV2 is null");
            return null;
        }
        com.ss.android.lark.setting.dto.NotificationSettingV2 notificationSettingV22 = new com.ss.android.lark.setting.dto.NotificationSettingV2();
        MessengerNotificationSetting messengerNotificationSetting = notificationSettingV2.messenger_notification_setting;
        C54122b a = m211916a(notificationSettingV2.drive_notification_setting);
        if (a == null) {
            Log.m165383e("NotificationSettingParser", "parseNotificationSettingV2FromPb failed: driveNotificationSetting is null");
        } else {
            notificationSettingV22.setDriveNotificationSetting(a);
        }
        if (messengerNotificationSetting == null) {
            Log.m165383e("NotificationSettingParser", "parseNotificationSettingV2FromPb failed: msgSetting is null");
            return null;
        }
        notificationSettingV22.setChatMsgState(NotificationSettingV2.ChatMsgNotificationState.forNumber(messengerNotificationSetting.switch_state.getValue()));
        notificationSettingV22.setBuzzOpen(messengerNotificationSetting.buzz_open.booleanValue());
        notificationSettingV22.setMentionOpen(messengerNotificationSetting.mention_open.booleanValue());
        notificationSettingV22.setUserSingleChatOpen(messengerNotificationSetting.user_p2p_chat_open.booleanValue());
        notificationSettingV22.setMentionAllOpen(messengerNotificationSetting.mention_all_open.booleanValue());
        return notificationSettingV22;
    }
}
