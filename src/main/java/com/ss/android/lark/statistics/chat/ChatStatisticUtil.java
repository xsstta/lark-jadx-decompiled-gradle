package com.ss.android.lark.statistics.chat;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R#\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00040\u00048FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatStatisticUtil;", "", "()V", "CATEGORY", "", "GROUP_ID", "MODE", "MODE_PRIVATE", "MODE_PUBLIC", "TYPE", "TYPE_GROUP_CHAT", "TYPE_P2P_CHAT", "tenantId", "kotlin.jvm.PlatformType", "getTenantId", "()Ljava/lang/String;", "tenantId$delegate", "Lkotlin/Lazy;", "getCategory", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getDefaultExtra", "Lorg/json/JSONObject;", "sendClickMoreItem", "", "sendClickVoteItem", "sendHitPointRecord", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.chat.e */
public final class ChatStatisticUtil {

    /* renamed from: a */
    public static final ChatStatisticUtil f135664a = new ChatStatisticUtil();

    /* renamed from: b */
    private static final Lazy f135665b = LazyKt.lazy(C54951a.INSTANCE);

    private ChatStatisticUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.chat.e$a */
    static final class C54951a extends Lambda implements Function0<String> {
        public static final C54951a INSTANCE = new C54951a();

        C54951a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            return N.mo134405h();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m213141b(Chat chat) {
        if (chat != null) {
            Statistics.sendEvent("im_chat_title_bar_video_call_click", f135664a.m213144e(chat));
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m213142c(Chat chat) {
        if (chat != null) {
            Statistics.sendEvent("im_chat_add_click", f135664a.m213144e(chat));
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m213143d(Chat chat) {
        if (chat != null) {
            Statistics.sendEvent("im_chat_vote_click", f135664a.m213144e(chat));
        }
    }

    /* renamed from: e */
    private final JSONObject m213144e(Chat chat) {
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
        jSONObject.put("category", m213140a(chat));
        return jSONObject;
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<String> m213140a(Chat chat) {
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
}
