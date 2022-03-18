package com.ss.android.lark.chat.utils;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.chat.utils.d */
public final class ChatParamUtils {

    /* renamed from: a */
    public static final ChatParamUtils f88665a = new ChatParamUtils();

    /* renamed from: b */
    private static String f88666b;

    /* renamed from: c */
    private static Chat f88667c;

    /* renamed from: d */
    private static String f88668d;

    /* renamed from: e */
    private static Chatter f88669e;

    /* renamed from: f */
    private static String f88670f;

    /* renamed from: a */
    public static final Map<String, Object> m133135a(Chat chat, String str) {
        return m133137a(chat, str, (Chatter) null, 4, (Object) null);
    }

    /* renamed from: a */
    public static final void m133142a(String str, String str2) {
        m133144a(str, str2, (Chat) null, 4, (Object) null);
    }

    private ChatParamUtils() {
    }

    /* renamed from: a */
    public static final String m133134a() {
        return f88670f;
    }

    /* renamed from: d */
    public static final Chat m133151d() {
        return f88667c;
    }

    /* renamed from: a */
    public static /* synthetic */ void m133144a(String str, String str2, Chat chat, int i, Object obj) {
        if ((i & 4) != 0) {
            chat = null;
        }
        m133143a(str, str2, chat);
    }

    /* renamed from: a */
    public final Map<String, Object> mo126912a(ChatMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "chatMessageVO");
        return MapsKt.mapOf(TuplesKt.to("msg_id", cVar.mo121681a()), TuplesKt.to("cid", cVar.mo121696d()), TuplesKt.to("msg_type", m133146b(cVar)));
    }

    /* renamed from: a */
    public final Map<String, Object> mo126913a(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("msg_id", message.getId());
        String str = message.getcId();
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.to("cid", str);
        pairArr[2] = TuplesKt.to("msg_type", mo126915b(message));
        return MapsKt.mapOf(pairArr);
    }

    /* renamed from: a */
    public final String mo126911a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "$this$toText");
        switch (C34337e.f88671a[type.ordinal()]) {
            case 1:
            case 2:
            default:
                return "unknown";
            case 3:
                return "post";
            case 4:
                return "file";
            case 5:
                return "text";
            case 6:
                return "image";
            case 7:
                return "system";
            case 8:
                return "audio";
            case 9:
                return "email";
            case 10:
                return "shareGroupChat";
            case 11:
                return "sticker";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "mergeForward";
            case 13:
                return "calendar";
            case 14:
                return "card";
            case 15:
                return "media";
            case 16:
                return "shareCalendarEvent";
            case 17:
                return "hongbao";
            case 18:
                return "generalCalendar";
            case 19:
                return "video_chat";
            case 20:
                return "location";
            case 21:
                return "commercializedHongbao";
            case 22:
                return "shareUserCard";
            case 23:
                return "todo";
            case 24:
                return "folder";
        }
    }

    /* renamed from: b */
    public static final Map<String, Object> m133148b() {
        return m133149b(f88666b);
    }

    /* renamed from: c */
    public static final void m133150c() {
        f88667c = null;
        String str = null;
        f88666b = str;
        f88668d = str;
        f88669e = null;
    }

    /* renamed from: b */
    private final String m133146b(ChatMessageVO<?> cVar) {
        return mo126911a(cVar.mo121710r());
    }

    /* renamed from: e */
    private final String m133152e(Chat chat) {
        if (chat.isP2PChat()) {
            return "single";
        }
        if (chat.isThread()) {
            return ChatTypeStateKeeper.f135670e;
        }
        return "group";
    }

    /* renamed from: d */
    public final String mo126917d(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "$this$isGroupMember");
        if (chat.isMember()) {
            return "true";
        }
        return "false";
    }

    /* renamed from: a */
    public static final void m133138a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!(!Intrinsics.areEqual(f88666b, chat.getId()))) {
            f88667c = chat;
        }
    }

    /* renamed from: c */
    public final String mo126916c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "$this$isPublicGroup");
        if (chat.isPublic()) {
            return "true";
        }
        return "false";
    }

    /* renamed from: b */
    public static final Map<String, Object> m133149b(String str) {
        boolean z;
        Chat chat;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !(!Intrinsics.areEqual(str, f88666b)) && (chat = f88667c) != null && chat != null) {
            return m133136a(chat, f88668d, f88669e);
        }
        return null;
    }

    /* renamed from: a */
    public static final void m133140a(Chatter chatter) {
        boolean z;
        String str;
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Chat chat = f88667c;
        boolean z2 = false;
        if (chat != null) {
            z = chat.isP2PChat();
        } else {
            z = false;
        }
        if (z) {
            Chat chat2 = f88667c;
            if (chat2 != null) {
                str = chat2.getP2pChatterId();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, chatter.getId())) {
                z2 = true;
            }
        }
        if (z2) {
            f88669e = chatter;
        }
    }

    /* renamed from: f */
    private final String m133153f(Chat chat) {
        if (chat.isMeeting()) {
            return "meeting";
        }
        if (chat.is_department()) {
            return "department";
        }
        if (chat.isTenant()) {
            return "all_staff";
        }
        if (chat.isOnCall()) {
            return "on_call";
        }
        if (chat.isGroup() && chat.isSecret()) {
            return "secret_group";
        }
        if (chat.isCustomerService()) {
            return "customer_service";
        }
        if (chat.isEdu()) {
            return "school_parent";
        }
        if (chat.isThread()) {
            return ChatTypeStateKeeper.f135670e;
        }
        if (chat.isGroup() && chat.getMemberCount() == 1) {
            return "to_myself_group";
        }
        if (chat.isSecret()) {
            return "secret_single";
        }
        if (chat.isSoloChat()) {
            return "to_myself_single";
        }
        Chatter chatter = f88669e;
        if (chatter != null && chatter.isBot()) {
            return "single_bot";
        }
        if (chat.isP2PChat()) {
            return "single_normal";
        }
        return "classic";
    }

    /* renamed from: b */
    public final String mo126914b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "$this$isInnerGroup");
        if (!chat.isCrossTenant()) {
            return "true";
        }
        return "false";
    }

    /* renamed from: a */
    public static final void m133141a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        f88670f = str;
    }

    /* renamed from: b */
    public final String mo126915b(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "$this$getMessageType");
        Message.Type type = message.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, ShareHitPoint.f121869d);
        return mo126911a(type);
    }

    /* renamed from: a */
    public static final void m133139a(Chat chat, Chatter chatter) {
        if (chat != null) {
            m133138a(chat);
        }
        if (chatter != null) {
            m133140a(chatter);
        }
    }

    /* renamed from: b */
    private final String m133147b(Chat chat, String str) {
        if (chat.isGroup() && Intrinsics.areEqual(str, chat.getOwnerId())) {
            return "group_owner";
        }
        if (chat.isAdmin()) {
            return "group_admin";
        }
        return "normal_member";
    }

    /* renamed from: b */
    private final int m133145b(Chat chat, Chatter chatter) {
        if (chat.isP2PChat() && chatter != null && chatter.isBot()) {
            return 1;
        }
        if (chat.isP2PChat()) {
            return 0;
        }
        return chat.getMemberCount() - chat.getUserCount();
    }

    /* renamed from: a */
    public static final Map<String, Object> m133136a(Chat chat, String str, Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.to("chat_id", chat.getId());
        ChatParamUtils dVar = f88665a;
        pairArr[1] = TuplesKt.to("chat_type", dVar.m133152e(chat));
        pairArr[2] = TuplesKt.to("chat_type_detail", dVar.m133153f(chat));
        pairArr[3] = TuplesKt.to("member_type", dVar.m133147b(chat, str));
        pairArr[4] = TuplesKt.to("is_inner_group", dVar.mo126914b(chat));
        pairArr[5] = TuplesKt.to("is_public_group", dVar.mo126916c(chat));
        if (chatter == null) {
            chatter = f88669e;
        }
        pairArr[6] = TuplesKt.to("bot_count", Integer.valueOf(dVar.m133145b(chat, chatter)));
        return MapsKt.mapOf(pairArr);
    }

    /* renamed from: a */
    public static final void m133143a(String str, String str2, Chat chat) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !Intrinsics.areEqual(f88666b, str)) {
            if (str2.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                f88666b = str;
                f88668d = str2;
                f88667c = chat;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Map m133137a(Chat chat, String str, Chatter chatter, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            chatter = null;
        }
        return m133136a(chat, str, chatter);
    }
}
