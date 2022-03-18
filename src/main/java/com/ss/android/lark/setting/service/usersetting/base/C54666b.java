package com.ss.android.lark.setting.service.usersetting.base;

import com.bytedance.lark.pb.settings.v1.GetUserSettingResponse;
import com.bytedance.lark.pb.settings.v1.PushUserSetting;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.SmsPhoneUrgentSetting;
import com.ss.android.lark.setting.service.impl.C54607a;

/* renamed from: com.ss.android.lark.setting.service.usersetting.base.b */
public class C54666b {
    /* renamed from: a */
    public static UserSetting m212227a(PushUserSetting pushUserSetting) {
        BadgeStyle forNumber = BadgeStyle.forNumber(pushUserSetting.badge_style.getValue());
        boolean booleanValue = pushUserSetting.navigation_show_mute_badge.booleanValue();
        NotificationSetting a = C54607a.m211914a(pushUserSetting.notification_setting);
        TimeFormatSetting timeFormatSetting = new TimeFormatSetting();
        com.bytedance.lark.pb.settings.v1.TimeFormatSetting timeFormatSetting2 = pushUserSetting.time_format;
        if (timeFormatSetting2 != null) {
            timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.forNumber(timeFormatSetting2.time_format.getValue()));
        }
        boolean booleanValue2 = pushUserSetting.auto_audio_to_text.booleanValue();
        long longValue = pushUserSetting.do_not_disturb_end_time.longValue();
        SmsPhoneUrgentSetting smsPhoneUrgentSetting = new SmsPhoneUrgentSetting();
        com.bytedance.lark.pb.settings.v1.SmsPhoneUrgentSetting smsPhoneUrgentSetting2 = pushUserSetting.sms_phone_urgent_setting;
        if (smsPhoneUrgentSetting2 != null) {
            smsPhoneUrgentSetting.setAccept(smsPhoneUrgentSetting2.accept.booleanValue());
            smsPhoneUrgentSetting.setCanModify(smsPhoneUrgentSetting2.can_modify.booleanValue());
            smsPhoneUrgentSetting.setCanSend(smsPhoneUrgentSetting2.can_send.booleanValue());
            smsPhoneUrgentSetting.setNeedConfirm(smsPhoneUrgentSetting2.need_confirm.booleanValue());
        }
        return new UserSetting(true, forNumber, booleanValue, a, timeFormatSetting, booleanValue2, longValue, smsPhoneUrgentSetting, C54607a.m211915a(pushUserSetting.notification_setting_v2), pushUserSetting.update_time.longValue(), pushUserSetting.message_notifications_off_during_calls.booleanValue());
    }

    /* renamed from: a */
    public static UserSetting m212226a(GetUserSettingResponse getUserSettingResponse) {
        boolean booleanValue = getUserSettingResponse.auto_update_work_status.booleanValue();
        BadgeStyle forNumber = BadgeStyle.forNumber(getUserSettingResponse.badge_style.getValue());
        boolean booleanValue2 = getUserSettingResponse.navigation_show_mute_badge.booleanValue();
        NotificationSetting a = C54607a.m211914a(getUserSettingResponse.notification_setting);
        TimeFormatSetting timeFormatSetting = new TimeFormatSetting();
        com.bytedance.lark.pb.settings.v1.TimeFormatSetting timeFormatSetting2 = getUserSettingResponse.time_format;
        if (timeFormatSetting2 != null) {
            timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.forNumber(timeFormatSetting2.time_format.getValue()));
        }
        boolean booleanValue3 = getUserSettingResponse.auto_audio_to_text.booleanValue();
        long longValue = getUserSettingResponse.do_not_disturb_end_time.longValue();
        SmsPhoneUrgentSetting smsPhoneUrgentSetting = new SmsPhoneUrgentSetting();
        com.bytedance.lark.pb.settings.v1.SmsPhoneUrgentSetting smsPhoneUrgentSetting2 = getUserSettingResponse.sms_phone_urgent_setting;
        if (smsPhoneUrgentSetting2 != null) {
            smsPhoneUrgentSetting.setAccept(smsPhoneUrgentSetting2.accept.booleanValue());
            smsPhoneUrgentSetting.setCanModify(smsPhoneUrgentSetting2.can_modify.booleanValue());
            smsPhoneUrgentSetting.setCanSend(smsPhoneUrgentSetting2.can_send.booleanValue());
            smsPhoneUrgentSetting.setNeedConfirm(smsPhoneUrgentSetting2.need_confirm.booleanValue());
        }
        return new UserSetting(booleanValue, forNumber, booleanValue2, a, timeFormatSetting, booleanValue3, longValue, smsPhoneUrgentSetting, C54607a.m211915a(getUserSettingResponse.notification_setting_v2), getUserSettingResponse.update_time.longValue(), getUserSettingResponse.message_notifications_off_during_calls.booleanValue());
    }
}
