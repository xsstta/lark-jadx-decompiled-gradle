package com.ss.android.lark.notification.setting.impl.setting;

import com.larksuite.suite.R;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.notification.setting.impl.setting.a */
public class C48600a {
    /* renamed from: a */
    public static String m191592a(NotificationSettingV2 notificationSettingV2) {
        if (notificationSettingV2.isBuzzOpen() && notificationSettingV2.isMentionOpen() && notificationSettingV2.isUserSingleChatOpen()) {
            return "" + UIHelper.getString(R.string.Lark_NewSettings_MessageNotificationScopeBuzzMentionAndPrivate);
        } else if (notificationSettingV2.isBuzzOpen() && notificationSettingV2.isMentionOpen()) {
            return "" + UIHelper.getString(R.string.Lark_NewSettings_BuzzAndMentionMessages);
        } else if (notificationSettingV2.isBuzzOpen() && notificationSettingV2.isUserSingleChatOpen()) {
            return "" + UIHelper.getString(R.string.Lark_NewSettings_BuzzAndPrivateMessages);
        } else if (!notificationSettingV2.isBuzzOpen()) {
            return "";
        } else {
            return "" + UIHelper.getString(R.string.Lark_NewSettings_BuzzMessages);
        }
    }
}
