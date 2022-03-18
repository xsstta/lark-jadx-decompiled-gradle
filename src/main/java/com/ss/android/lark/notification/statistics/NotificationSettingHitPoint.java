package com.ss.android.lark.notification.statistics;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/notification/statistics/NotificationSettingHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.notification.h.c */
public final class NotificationSettingHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f122128a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m191339a(String str, boolean z) {
        f122128a.mo169612a(str, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\fH\u0007J\b\u0010)\u001a\u00020\u0011H\u0016J\b\u0010*\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/notification/statistics/NotificationSettingHitPoint$Companion;", "Lcom/ss/android/lark/notification/statistics/INotificationSettingHitPoint;", "()V", "NOTIFICATION_SETTING_CLICK", "", "NOTIFICATION_SETTING_STATUS", "NOTIFICATION_SETTING_TARGET", "STATUS_OFF", "STATUS_ON", "TARGET_NONE", "getNotificationClassifyChangeResult", "isOpen", "", "getSpecificMessageKindParamV2", "setting", "Lcom/ss/android/lark/notification/dto/NotificationSettingV2;", "sendNotificationAllEvent", "", "sendNotificationClassifyBuzzEvent", "sendNotificationClassifyChatMsgEvent", "sendNotificationClassifyDriveEvent", "sendNotificationClassifyGroupChatEvent", "sendNotificationClassifyMailEvent", "sendNotificationClassifyMentionEvent", "sendNotificationClassifyReactionEvent", "sendNotificationClassifySingleChatEvent", "sendNotificationNoneEvent", "sendNotificationSpecificEditEvent", "sendNotificationSpecificEvent", "onlyBuzz", "sendNotificationSpecificEventV2", "notificationSettingV2", "sendNotificationSpecificMentionCancelEvent", "sendNotificationSpecificMentionChooseEvent", "sendNotificationSpecificSingleCancelEvent", "sendNotificationSpecificSingleChooseEvent", "sendPCLoginMuteEvent", "sendPCLoginMuteMentionEvent", "sendSendSettingDetailClick", "clickType", UpdateKey.STATUS, "sendSettingNotificationHelpDocsClick", "sendSettingNotificationHelpDocsShow", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.h.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public void mo169610a() {
            Statistics.sendEvent("setting_notification_all_new_message");
        }

        /* renamed from: b */
        public void mo169614b() {
            Statistics.sendEvent("setting_notification_nothing");
        }

        /* renamed from: c */
        public void mo169616c() {
            Statistics.sendEvent("setting_notification_specific_message_edit");
        }

        /* renamed from: d */
        public void mo169617d() {
            Statistics.sendEvent("setting_notification_specific_message_mention_choose");
        }

        /* renamed from: e */
        public void mo169618e() {
            Statistics.sendEvent("setting_notification_specific_message_mention_cancel");
        }

        /* renamed from: f */
        public void mo169619f() {
            Statistics.sendEvent("setting_notification_specific_message_single_choose");
        }

        /* renamed from: g */
        public void mo169620g() {
            Statistics.sendEvent("setting_notification_specific_message_single_cancel");
        }

        /* renamed from: h */
        public void mo169621h() {
            Statistics.sendEvent("setting_notification_helpdocs_show");
        }

        /* renamed from: i */
        public void mo169622i() {
            Statistics.sendEvent("setting_notification_helpdocs_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public void mo169611a(NotificationSettingV2 notificationSettingV2) {
            Intrinsics.checkParameterIsNotNull(notificationSettingV2, "notificationSettingV2");
            Statistics.sendEvent("setting_notification_specific_message", new JSONObject().put("message_kind", m191340b(notificationSettingV2)));
        }

        /* renamed from: b */
        public void mo169615b(boolean z) {
            String str;
            if (z) {
                str = "y";
            } else {
                str = C64034n.f161683a;
            }
            Statistics.sendEvent("setting_pc_login_mute_mobile_notification_mention", new JSONObject().put("open_or_close", str));
        }

        /* renamed from: b */
        private final String m191340b(NotificationSettingV2 notificationSettingV2) {
            if (notificationSettingV2.isBuzzOpen() && notificationSettingV2.isMentionOpen() && notificationSettingV2.isUserSingleChatOpen()) {
                return "buzz&mention&single";
            }
            if (notificationSettingV2.isBuzzOpen() && notificationSettingV2.isMentionOpen()) {
                return "buzz&mention";
            }
            if (!notificationSettingV2.isBuzzOpen() || !notificationSettingV2.isMentionOpen()) {
                return "buzz";
            }
            return "buzz&single";
        }

        /* renamed from: a */
        public void mo169613a(boolean z) {
            String str;
            if (z) {
                str = "y";
            } else {
                str = C64034n.f161683a;
            }
            Statistics.sendEvent("setting_pc_login_mute_mobile_notification", new JSONObject().put("open_or_close", str));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo169612a(String str, boolean z) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "clickType");
            JSONObject put = new JSONObject().put("click", str);
            if (z) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            Statistics.sendEvent("setting_detail_click", put.put(UpdateKey.STATUS, str2).put("target", "none"));
        }
    }
}
