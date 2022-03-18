package com.ss.android.lark.chatsetting.impl.statistics.ownership;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.statistics.Statistics;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ownership/OwnershipHitPointNew;", "", "()V", "Companion", "Params", "Value", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.statistics.ownership.b */
public final class OwnershipHitPointNew {

    /* renamed from: a */
    public static final Lazy f90530a = LazyKt.lazy(C35077b.INSTANCE);

    /* renamed from: b */
    public static final Companion f90531b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H\u0002J8\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H\u0007J4\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012J\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ownership/OwnershipHitPointNew$Companion;", "", "()V", "userId", "", "kotlin.jvm.PlatformType", "getUserId", "()Ljava/lang/String;", "userId$delegate", "Lkotlin/Lazy;", "sendBaseClickEvent", "", "eventName", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "click", "target", "extraParams", "", "sendGroupManageClickEvent", "sendSearchEnableClickEvent", "sendSearchEnableRemindClickEvent", "sendSearchEnableRemindView", "sendSearchEnableView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.ownership.b$a */
    public static final class Companion {
        /* renamed from: a */
        private final String m136785a() {
            Lazy lazy = OwnershipHitPointNew.f90530a;
            Companion aVar = OwnershipHitPointNew.f90531b;
            return (String) lazy.getValue();
        }

        /* renamed from: a */
        public final void mo129299a(Chat chat, String str, String str2) {
            m136786a(this, chat, str, str2, null, 8, null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void mo129301b(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_allow_to_be_searched_remind_view", new JSONObject(ChatParamUtils.m133137a(chat, m136785a(), (Chatter) null, 4, (Object) null)));
        }

        /* renamed from: a */
        public final void mo129298a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Statistics.sendEvent("im_chat_allow_to_be_searched_view", new JSONObject(ChatParamUtils.m133137a(chat, m136785a(), (Chatter) null, 4, (Object) null)));
        }

        /* renamed from: b */
        public final void mo129302b(Chat chat, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            m136787a("im_chat_allow_to_be_searched_remind_click", chat, str, str2, null);
        }

        /* renamed from: b */
        public final void mo129303b(Chat chat, String str, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            m136787a("im_chat_allow_to_be_searched_click", chat, str, str2, map);
        }

        /* renamed from: a */
        public final void mo129300a(Chat chat, String str, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            m136787a("im_group_manage_click", chat, str, str2, map);
        }

        /* renamed from: a */
        private final void m136787a(String str, Chat chat, String str2, String str3, Map<String, ? extends Object> map) {
            JSONObject jSONObject = new JSONObject(ChatParamUtils.m133137a(chat, m136785a(), (Chatter) null, 4, (Object) null));
            jSONObject.put("click", str2);
            jSONObject.put("target", str3);
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            Statistics.sendEvent(str, jSONObject);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chatsetting.impl.statistics.ownership.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m136786a(Companion aVar, Chat chat, String str, String str2, Map map, int i, Object obj) {
            if ((i & 8) != 0) {
                map = null;
            }
            aVar.mo129300a(chat, str, str2, map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.statistics.ownership.b$b */
    static final class C35077b extends Lambda implements Function0<String> {
        public static final C35077b INSTANCE = new C35077b();

        C35077b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34476o g = a.mo127277g();
            Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
            return g.mo127412a();
        }
    }
}
