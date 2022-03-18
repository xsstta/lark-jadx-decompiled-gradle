package com.ss.android.lark.create.groupchat.impl.statistics;

import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/CreateGroupHitPointNew;", "", "()V", "Companion", "Params", "TextType", "Value", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateGroupHitPointNew {

    /* renamed from: a */
    public static final Companion f93887a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/CreateGroupHitPointNew$TextType;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "INPLUS", "ADD_MEMBER", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TextType implements IParam {
        INPLUS("inplus", null, 2, null),
        ADD_MEMBER("add_member", null, 2, null);
        
        private final String key;
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.key;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IParam.C54954a.m213213a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IParam.C54954a.m213212a(this, cVar);
        }

        private TextType(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ TextType(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "text_type" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0007J0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011H\u0007J8\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\nH\u0007¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/statistics/CreateGroupHitPointNew$Companion;", "", "()V", "boolean2Str", "", "value", "", "sendIMChatMemberToolLimitClick", "", "extraParams", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendIMChatMemberTopLimitView", "sendIMGroupCreateClickEvent", "params", "sendImGroupCreateClickEvent", "click", "target", "", "sendImGroupCreateViewEvent", "canCreateGroup", "canCreateSecretChat", "canCreateChannel", "isChatHistoryInclude", "isTransferIncluded", "scene", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew$a */
    public static final class Companion {
        /* renamed from: a */
        private final String m143457a(boolean z) {
            return z ? "true" : "false";
        }

        /* renamed from: a */
        public final void mo134197a(String str, String str2) {
            m143458a(this, str, str2, (Map) null, 4, (Object) null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo134196a(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "params");
            Statistics.sendEvent("im_group_create_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo134200b(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParams");
            Statistics.sendEvent("im_chat_member_toplimit_view", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo134201c(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParams");
            Statistics.sendEvent("im_chat_member_toplimit_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        /* renamed from: a */
        public final void mo134198a(String str, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            JSONObject put = new JSONObject().put("click", str).put("target", str2);
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    put.put(entry.getKey(), entry.getValue());
                }
            }
            Statistics.sendEvent("im_group_create_click", put);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m143458a(Companion aVar, String str, String str2, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            aVar.mo134198a(str, str2, map);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo134199a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "scene");
            Companion aVar = this;
            Statistics.sendEvent("im_group_create_view", C54952a.m213205a(MapsKt.mapOf(TuplesKt.to("is_create_group", aVar.m143457a(z)), TuplesKt.to("is_create_secret_chat", aVar.m143457a(z2)), TuplesKt.to("is_create_channel", aVar.m143457a(z3)), TuplesKt.to("is_chat_history_included", aVar.m143457a(z4)), TuplesKt.to("is_transfer_included", aVar.m143457a(z5))), cVar).toJson());
        }
    }
}
