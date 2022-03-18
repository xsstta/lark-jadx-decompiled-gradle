package com.ss.android.lark.chatsetting.impl.statistics.chat_function;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/chat_function/ChatFunctionHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.c.a */
public final class ChatFunctionHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f90517a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J6\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eJ@\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0002J \u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¨\u0006$"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/chat_function/ChatFunctionHitPoint$Companion;", "", "()V", "getChatFunctionDefaultExtra", "Lorg/json/JSONObject;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatIdAndMemberTypeExtra", "getChatType", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getIsAdminParam", "admin", "", "sendAnnouncementSideMenuClick", "", "chatType", "isAdmin", "sendCalendarSideMenuClick", "sendChat2OpenAppChat", "appId", "sendChatConfigSideMenuClick", "sendClickCalendarEvent", "sendClickFindTimeEvent", "sendClickGroupAnnouncementEvent", "sendClickMeetingMinuteEvent", "sendClickPinEvent", "sendPinSideMenuClick", "chatId", "isSecret", "isBot", "isMeeting", "sendSettingMenuClick", "event", "sendSidMenuClick", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.c.a$a */
    public static final class Companion {
        /* renamed from: a */
        private final String m136668a(boolean z) {
            return z ? "y" : C64034n.f161683a;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo129191a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "appId");
            Statistics.sendEvent("ev_open_app_chat_feed", new JSONObject().put("anchor", "bot_chat2app").put("app_id", str));
        }

        /* renamed from: c */
        public final void mo129196c(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_announcement_click", m136671h(chat));
        }

        /* renamed from: d */
        public final void mo129197d(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_pin_click", m136671h(chat));
        }

        /* renamed from: e */
        public final void mo129198e(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_cal_click", m136671h(chat));
        }

        /* renamed from: f */
        public final void mo129199f(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_minutes_click", mo129194b(chat));
        }

        /* renamed from: g */
        public final void mo129200g(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_event_click", mo129194b(chat));
        }

        /* renamed from: b */
        public final JSONObject mo129194b(Chat chat) {
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

        /* renamed from: h */
        private final JSONObject m136671h(Chat chat) {
            String str;
            String str2;
            JSONObject jSONObject = new JSONObject();
            if (C34501a.m133936b(chat)) {
                str = "admin";
            } else {
                str = "member";
            }
            jSONObject.put("member_type", str);
            if (chat.isPublic()) {
                str2 = "public";
            } else {
                str2 = "private";
            }
            jSONObject.put("chat_mode", str2);
            jSONObject.put("chat_id", chat.getId());
            jSONObject.put("chat_type", mo129189a(chat));
            jSONObject.put("external", chat.isCrossTenant() ? 1 : 0);
            return jSONObject;
        }

        /* renamed from: a */
        public final String mo129189a(Chat chat) {
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

        /* renamed from: a */
        public final void mo129192a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            m136669a("announcement_sidebar", str, z);
        }

        /* renamed from: b */
        public final void mo129195b(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            m136669a("cal_sidebar", str, z);
        }

        /* renamed from: a */
        public final String mo129190a(Chat chat, Chatter chatter) {
            if (chat == null) {
                return "";
            }
            if (chat.isMeeting()) {
                return "meeting";
            }
            if (chat.isP2PChat()) {
                if (chatter == null || !chatter.isBot()) {
                    return "single";
                }
                return "single_bot";
            } else if (chat.isThread()) {
                return ChatTypeStateKeeper.f135670e;
            } else {
                return "group";
            }
        }

        /* renamed from: a */
        private final void m136669a(String str, String str2, boolean z) {
            Statistics.sendEvent(str, new JSONObject().put("chat_type", str2).put(ShareHitPoint.f121868c, "sidebar").put("is_admin", m136668a(z)));
        }

        /* renamed from: a */
        public final void mo129193a(String str, boolean z, String str2, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            m136670a("pin_sidebar", str, z, str2, z2, z3, z4);
        }

        /* renamed from: a */
        private final void m136670a(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4) {
            Statistics.sendEvent(str, new JSONObject().put("chat_type", str2).put(ShareHitPoint.f121868c, "setting").put("is_admin", m136668a(z)).put("chat_id", str3).put("is_secret_chat", z2).put("is_bot_chat", z3).put("is_meeting_chat", z4));
        }
    }
}
