package com.ss.android.lark.chatsetting.impl.statistics;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u001a\u0010#\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010$\u001a\u00020\u0004H\u0007J\u0012\u0010%\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010&\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u001a\u0010'\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010(\u001a\u00020\u0004H\u0007J\u001a\u0010)\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010(\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\u00040\u00048FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatStatisticUtil;", "", "()V", "CATEGORY", "", "CHAT_ID", "CONTENT", "COUNT", "GROUP_ID", "MODE", "MODE_PRIVATE", "MODE_PUBLIC", "POST_TYPE", "SOURCE", "SOURCE_CHAT_EXIT", "SOURCE_CHAT_MANAGE", "TYPE", "TYPE_GROUP_CHAT", "tenantId", "kotlin.jvm.PlatformType", "getTenantId", "()Ljava/lang/String;", "tenantId$delegate", "Lkotlin/Lazy;", "getCategory", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getDefaultExtra", "Lorg/json/JSONObject;", "sendChangePostTypeEvent", "", "postType", "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "sendDissolveGroupEvent", "sendFinishChangeGroupOwnerEvent", ShareHitPoint.f121868c, "sendMemberPageShowEvent", "sendQuitGroupClickEvent", "sendSaveEditChatNameEvent", "name", "sendSaveNickNameEvent", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.a */
public final class ChatStatisticUtil {

    /* renamed from: a */
    public static final ChatStatisticUtil f90512a = new ChatStatisticUtil();

    /* renamed from: b */
    private static final Lazy f90513b = LazyKt.lazy(C35073a.INSTANCE);

    private ChatStatisticUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.a$a */
    static final class C35073a extends Lambda implements Function0<String> {
        public static final C35073a INSTANCE = new C35073a();

        C35073a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34476o g = a.mo127277g();
            Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
            return g.mo127415c();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m136659b(Chat chat) {
        Statistics.sendEvent("im_chat_menber_page_show", f90512a.m136664e(chat));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m136663d(Chat chat) {
        Statistics.sendEvent("im_chat_exit_chat_click", f90512a.m136664e(chat));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m136661c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Statistics.sendEvent("im_chat_delete_confirm_click", f90512a.m136664e(chat));
    }

    /* renamed from: e */
    private final JSONObject m136664e(Chat chat) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (chat == null) {
            return jSONObject;
        }
        jSONObject.put("group_id", chat.getId());
        jSONObject.put(ShareHitPoint.f121869d, "group_chat");
        if (chat.isPublic()) {
            str = "public";
        } else {
            str = "private";
        }
        jSONObject.put("mode", str);
        jSONObject.put("category", m136656a(chat));
        return jSONObject;
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<String> m136656a(Chat chat) {
        if (chat == null) {
            return CollectionsKt.emptyList();
        }
        Map mapOf = MapsKt.mapOf(TuplesKt.to(Boolean.valueOf(chat.isThread()), "circle"), TuplesKt.to(Boolean.valueOf(chat.isSecret()), "off_the_record"), TuplesKt.to(Boolean.valueOf(true ^ chat.isCrossTenant()), "internal"), TuplesKt.to(Boolean.valueOf(chat.isCrossTenant()), "external"), TuplesKt.to(Boolean.valueOf(chat.isEdu()), "school_parent"), TuplesKt.to(Boolean.valueOf(chat.is_department()), "department"), TuplesKt.to(Boolean.valueOf(chat.isTenant()), "all_staff"), TuplesKt.to(Boolean.valueOf(chat.isOnCall()), "on_call"), TuplesKt.to(Boolean.valueOf(chat.isCustomerService()), "customer_service"), TuplesKt.to(Boolean.valueOf(chat.isMeeting()), "meeting"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            ((Boolean) entry.getKey()).booleanValue();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136658a(Chat chat, String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        JSONObject e = f90512a.m136664e(chat);
        e.put(ShareHitPoint.f121868c, str);
        Statistics.sendEvent("im_chat_manage_assign_owner_confirm_click", e);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m136657a(Chat chat, Chat.PostType postType) {
        String str;
        Intrinsics.checkParameterIsNotNull(postType, "postType");
        JSONObject e = f90512a.m136664e(chat);
        int i = C35074b.f90515a[postType.ordinal()];
        if (i == 1) {
            str = "anyone";
        } else if (i != 2) {
            str = "owner";
        } else {
            str = "selected_member";
        }
        e.put("value", str);
        Statistics.sendEvent("im_chat_manage_permission_to_send_msg_confirm_click", e);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m136660b(Chat chat, String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (chat != null) {
            JSONObject e = f90512a.m136664e(chat);
            e.put("content", str);
            e.put("count", str.length());
            Statistics.sendEvent("im_chat_name_save_click", e);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m136662c(Chat chat, String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (chat != null) {
            JSONObject e = f90512a.m136664e(chat);
            e.put("content", str);
            e.put("count", str.length());
            Statistics.sendEvent("im_chat_config_edit_alias_save_click", e);
        }
    }
}
