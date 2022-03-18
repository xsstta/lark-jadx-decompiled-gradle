package com.ss.android.lark.chatsetting.impl.statistics.setting;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/setting/SettingHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.f.a */
public final class SettingHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f90520a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m136747a() {
        f90520a.mo129273b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136748a(Chat chat) {
        f90520a.mo129267a(chat);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136749a(String str) {
        f90520a.mo129270a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000bJ\u001e\u0010 \u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J-\u0010#\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020%J\b\u0010*\u001a\u00020\rH\u0007¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/setting/SettingHitPoint$Companion;", "", "()V", "getChatIdAndMemberTypeExtra", "Lorg/json/JSONObject;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatSettingExtra", "isChecked", "", "getChatType", "", "sendAutoTranslateSettingEvent", "", "sendClickChatSearchEvent", ShareHitPoint.f121869d, "", "sendClickCloseSecretChatEvent", "chatId", "sendClickReportEvent", "sendEditAutoTranslationEvent", "sendEditChatBoxSwitchEvent", "sendEditNotificationSwitchEvent", "sendEditQuickSwitchEvent", "sendEditStartFromMsgEvent", "position", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "sendGroupExitEvent", "sendGroupMailSettingChangeEvent", "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "sendGroupMailSwitchChangeEvent", "switch", "sendGroupSettingPermissionEvent", "chatType", "sendNewExitGroupEvent", "sendNewPostSettingChangeEvent", "postType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "whiteMember", "groupMemberCount", "(Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;ILjava/lang/Integer;)V", "sendPostSettingChangeEvent", "sendSingleChatEndEvent", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo129271a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str3, "chatType");
            Statistics.sendEvent("group_setting_permission", new JSONObject().put("chatid", str).put(ShareHitPoint.f121869d, str2).put("chat_type", str3));
        }

        /* renamed from: a */
        public final void mo129264a() {
            Statistics.sendEvent("autotranslate_setting");
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo129273b() {
            Statistics.sendEvent("single_chat_end", new JSONObject().put(ShareHitPoint.f121869d, "secret"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo129265a(Chat.GroupMailSendPermissionType groupMailSendPermissionType) {
            Intrinsics.checkParameterIsNotNull(groupMailSendPermissionType, ShareHitPoint.f121869d);
            Statistics.sendEvent("email_group_settings_changed", new JSONObject().put("permission", groupMailSendPermissionType.getDisplay()));
        }

        /* renamed from: a */
        public final void mo129266a(Chat.PostType postType) {
            String str;
            Intrinsics.checkParameterIsNotNull(postType, "postType");
            int i = C35075b.f90521a[postType.ordinal()];
            if (i == 1) {
                str = "selected";
            } else if (i != 2) {
                str = "anyone";
            } else {
                str = "admin only";
            }
            Statistics.sendEvent("msg_restriction_setting", new JSONObject().put("msg_restriction_type", str));
        }

        /* renamed from: b */
        public final JSONObject mo129272b(Chat chat) {
            String str;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chat_id", chat.getId());
            if (C34501a.m133936b(chat)) {
                str = "admin";
            } else {
                str = "member";
            }
            jSONObject.put("member_type", str);
            return jSONObject;
        }

        /* renamed from: c */
        public final void mo129278c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_setting_end_secret_chat_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: c */
        public final String mo129276c(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (chat.isSecret()) {
                return "secret";
            }
            if (chat.isOnCall()) {
                return "on_call";
            }
            if (chat.isMeeting()) {
                return "meeting";
            }
            if (chat.is_department()) {
                return "department";
            }
            if (chat.isEdu()) {
                return "school_parent";
            }
            if (chat.isCustomerService()) {
                return "customer_service";
            }
            if (chat.isThread()) {
                return "circle";
            }
            if (chat.isP2PChat()) {
                return "p2p";
            }
            if (chat.isTenant()) {
                return "all_staff";
            }
            if (chat.getChatMode() != Chat.ChatMode.DEFAULT || chat.isSecret()) {
                return "unknown type";
            }
            return "classic";
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo129267a(Chat chat) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (chat.isCrossTenant()) {
                str = "external";
            } else if (chat.isPublic()) {
                str = "public";
            } else {
                str = "private";
            }
            if (chat.isSecret()) {
                str2 = "secret";
            } else {
                str2 = "classic";
            }
            if (chat.isThread()) {
                str2 = ChatTypeStateKeeper.f135670e;
            }
            Statistics.sendEvent("group_exit", new JSONObject().put(ShareHitPoint.f121869d, str).put("mode", str2));
        }

        /* renamed from: b */
        public final void mo129275b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_setting_report_click", new JSONObject().put("chat_id", str));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo129270a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Statistics.sendEvent("im_chat_gr_quit_click", new JSONObject().put("chat_id", str));
        }

        /* renamed from: c */
        public final void mo129277c(Chat chat, boolean z) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_chat_box_switch", mo129263a(chat, z));
        }

        /* renamed from: d */
        public final void mo129279d(Chat chat, boolean z) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_notification_switch", mo129263a(chat, z));
        }

        /* renamed from: e */
        public final void mo129280e(Chat chat, boolean z) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_auto_translation_switch", mo129263a(chat, z));
        }

        /* renamed from: a */
        public final JSONObject mo129263a(Chat chat, boolean z) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "off_to_on";
            } else {
                str = "on_to_off";
            }
            jSONObject.put(UpdateKey.STATUS, str);
            jSONObject.put("member_count", String.valueOf(chat.getMemberCount()));
            jSONObject.put("chat_type", mo129276c(chat));
            if (chat.isPublic()) {
                str2 = "public";
            } else {
                str2 = "private";
            }
            jSONObject.put("chat_mode", str2);
            jSONObject.put("chat_id", chat.getId());
            jSONObject.put("external", chat.isCrossTenant() ? 1 : 0);
            return jSONObject;
        }

        /* renamed from: b */
        public final void mo129274b(Chat chat, boolean z) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_setting_quickswitcher_switch", mo129263a(chat, z));
        }

        /* renamed from: a */
        public final void mo129268a(Chat chat, int i) {
            String str;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (i == 0) {
                str = "message";
            } else if (i == 1) {
                str = "docs";
            } else if (i == 2) {
                str = "file";
            } else if (i == 3) {
                str = "photo";
            } else if (i == 4) {
                str = "links";
            } else if (i != 5) {
                str = "search";
            } else {
                str = "wiki";
            }
            Statistics.sendEvent("im_chat_setting_search_click", mo129272b(chat).put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: a */
        public final void mo129269a(Chat chat, Chat.MessagePosition messagePosition) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(messagePosition, "position");
            JSONObject jSONObject = new JSONObject();
            int i = C35075b.f90523c[messagePosition.ordinal()];
            if (i == 1) {
                str = "where_i_left_off";
            } else if (i != 2) {
                str = "";
            } else {
                str = "most_recent_unread";
            }
            jSONObject.put(UpdateKey.STATUS, str);
            jSONObject.put("member_count", String.valueOf(chat.getMemberCount()));
            jSONObject.put("chat_type", mo129276c(chat));
            if (chat.isPublic()) {
                str2 = "public";
            } else {
                str2 = "private";
            }
            jSONObject.put("chat_mode", str2);
            jSONObject.put("chat_id", chat.getId());
            jSONObject.put("external", chat.isCrossTenant() ? 1 : 0);
            Statistics.sendEvent("im_chat_setting_start_from_msg_setting", jSONObject);
        }
    }
}
