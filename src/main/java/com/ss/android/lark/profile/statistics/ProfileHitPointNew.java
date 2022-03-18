package com.ss.android.lark.profile.statistics;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/statistics/ProfileHitPointNew;", "", "()V", "Companion", "Params", "Value", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.statistics.d */
public final class ProfileHitPointNew {

    /* renamed from: a */
    public static final Lazy f130739a = LazyKt.lazy(C52913b.INSTANCE);

    /* renamed from: b */
    public static final Companion f130740b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ8\u0010\u0013\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0015\u001a\u00020\u000bJ&\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bR#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/profile/statistics/ProfileHitPointNew$Companion;", "", "()V", "userId", "", "kotlin.jvm.PlatformType", "getUserId", "()Ljava/lang/String;", "userId$delegate", "Lkotlin/Lazy;", "sendImGroupApplyClick", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "click", "target", "extraParams", "", "sendImGroupApplyView", "sendImGroupCardClick", "sendImGroupCardView", "sendJoinGroupFailedEvent", "sendProfileMessageClick", "chatId", "messageId", "cId", "messageType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.d$a */
    public static final class Companion {
        /* renamed from: b */
        private final String m204741b() {
            Lazy lazy = ProfileHitPointNew.f130739a;
            Companion aVar = ProfileHitPointNew.f130740b;
            return (String) lazy.getValue();
        }

        private Companion() {
        }

        /* renamed from: a */
        public final void mo180540a() {
            LinkedHashMap linkedHashMap;
            Map<String, Object> b = ChatParamUtils.m133148b();
            if (b == null || (linkedHashMap = MapsKt.toMutableMap(b)) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put("text_type", "member_join");
            Statistics.sendEvent("im_chat_member_toplimit_view", C54952a.m213207a(linkedHashMap));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void mo180544b(Chat chat) {
            if (chat != null) {
                Statistics.sendEvent("im_chat_group_apply_view", new JSONObject(ChatParamUtils.m133137a(chat, m204741b(), (Chatter) null, 4, (Object) null)));
            }
        }

        /* renamed from: a */
        public final void mo180541a(Chat chat) {
            if (chat != null) {
                Statistics.sendEvent("im_chat_group_card_view", new JSONObject(ChatParamUtils.m133137a(chat, m204741b(), (Chatter) null, 4, (Object) null)).put("group_name_length", chat.getName().length()).put("group_description_length", chat.getDescription().length()).put("member_count", chat.getMemberCount()));
            }
        }

        /* renamed from: b */
        public final void mo180545b(Chat chat, String str, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (chat != null) {
                JSONObject put = new JSONObject(ChatParamUtils.m133137a(chat, m204741b(), (Chatter) null, 4, (Object) null)).put("click", str).put("target", str2);
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        put.put(entry.getKey(), entry.getValue());
                    }
                }
                Statistics.sendEvent("im_chat_group_apply_click", put);
            }
        }

        /* renamed from: a */
        public final void mo180542a(Chat chat, String str, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (chat != null) {
                JSONObject put = new JSONObject(ChatParamUtils.m133137a(chat, m204741b(), (Chatter) null, 4, (Object) null)).put("click", str).put("target", str2).put("group_name_length", chat.getName().length()).put("group_description_length", chat.getDescription().length()).put("member_count", chat.getMemberCount());
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        put.put(entry.getKey(), entry.getValue());
                    }
                }
                Statistics.sendEvent("im_chat_group_card_click", put);
            }
        }

        /* renamed from: a */
        public final void mo180543a(String str, String str2, String str3, Message.Type type) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "messageId");
            Intrinsics.checkParameterIsNotNull(str3, "cId");
            Intrinsics.checkParameterIsNotNull(type, "messageType");
            Map<String, Object> b = ChatParamUtils.m133149b(str);
            if (b != null) {
                Statistics.sendEvent("im_chat_main_click", new JSONObject(b).put("msg_id", str2).put("cid", str3).put("msg_type", ChatParamUtils.f88665a.mo126911a(type)).put("click", "self_user_card").put("target", "profile_main_view"));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.d$b */
    static final class C52913b extends Lambda implements Function0<String> {
        public static final C52913b INSTANCE = new C52913b();

        C52913b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
            Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
            return q.mo133622a();
        }
    }
}
