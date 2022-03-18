package com.ss.android.lark.statistics.multiselect;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dto.chat.GetMessageIdsByPositionResponse;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/statistics/multiselect/MultiSelectHitPointNew;", "", "()V", "Companion", "Params", "Value", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.p.b */
public final class MultiSelectHitPointNew {

    /* renamed from: a */
    public static final Lazy f135852a = LazyKt.lazy(C54971b.INSTANCE);

    /* renamed from: b */
    public static final Companion f135853b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J0\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J0\u0010\u0017\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/statistics/multiselect/MultiSelectHitPointNew$Companion;", "", "()V", "userId", "", "getUserId", "()Ljava/lang/String;", "userId$delegate", "Lkotlin/Lazy;", "sendInnerMsgMultiSelectClick", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "msgCount", "", "msgIds", "msgTypes", "click", "target", "sendMsgMultiSelectClick", "msgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "sendMsgMultiSelectClickInThread", "Lcom/ss/android/lark/threaddetail/view/viewdata/ThreadDetailUIItem;", "sendMsgMultiSelectView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.p.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final String mo187666a() {
            Lazy lazy = MultiSelectHitPointNew.f135852a;
            Companion aVar = MultiSelectHitPointNew.f135853b;
            return (String) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187667a(Chat chat) {
            if (chat != null) {
                Statistics.sendEvent("im_msg_multi_select_view", new JSONObject(ChatParamUtils.m133137a(chat, mo187666a(), (Chatter) null, 4, (Object) null)));
            }
        }

        /* renamed from: a */
        public final void mo187668a(Chat chat, List<GetMessageIdsByPositionResponse.MessageTypeInfo> list, String str, String str2) {
            boolean z;
            String str3;
            String str4;
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (chat != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z2 = true;
                int i = 0;
                if (list != null) {
                    int i2 = 0;
                    for (T t : list) {
                        sb.append(t.mo136084a());
                        sb2.append(ChatParamUtils.f88665a.mo126911a(t.mo136085b()));
                        if (i2 != list.size() - 1) {
                            sb.append(",");
                            sb2.append(",");
                        }
                        i2++;
                    }
                }
                List<GetMessageIdsByPositionResponse.MessageTypeInfo> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str3 = "none";
                } else {
                    str3 = sb.toString();
                    Intrinsics.checkExpressionValueIsNotNull(str3, "msgIds.toString()");
                }
                if (list2 != null && !list2.isEmpty()) {
                    z2 = false;
                }
                if (z2) {
                    str4 = "none";
                } else {
                    String sb3 = sb2.toString();
                    Intrinsics.checkExpressionValueIsNotNull(sb3, "msgTypes.toString()");
                    str4 = sb3;
                }
                Companion aVar = this;
                if (list != null) {
                    i = list.size();
                }
                aVar.m213449a(chat, i, str3, str4, str, str2);
            }
        }

        /* renamed from: b */
        public final void mo187669b(Chat chat, List<? extends C55905a> list, String str, String str2) {
            boolean z;
            String str3;
            String str4;
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (chat != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z2 = true;
                int i = 0;
                if (list != null) {
                    int i2 = 0;
                    for (T t : list) {
                        sb.append(t.mo190608k());
                        ChatParamUtils dVar = ChatParamUtils.f88665a;
                        Message l = t.mo190610l();
                        Intrinsics.checkExpressionValueIsNotNull(l, "value.message");
                        Message.Type type = l.getType();
                        Intrinsics.checkExpressionValueIsNotNull(type, "value.message.type");
                        sb2.append(dVar.mo126911a(type));
                        if (i2 != list.size() - 1) {
                            sb.append(",");
                            sb2.append(",");
                        }
                        i2++;
                    }
                }
                List<? extends C55905a> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str3 = "none";
                } else {
                    str3 = sb.toString();
                    Intrinsics.checkExpressionValueIsNotNull(str3, "msgIds.toString()");
                }
                if (list2 != null && !list2.isEmpty()) {
                    z2 = false;
                }
                if (z2) {
                    str4 = "none";
                } else {
                    String sb3 = sb2.toString();
                    Intrinsics.checkExpressionValueIsNotNull(sb3, "msgTypes.toString()");
                    str4 = sb3;
                }
                Companion aVar = this;
                if (list != null) {
                    i = list.size();
                }
                aVar.m213449a(chat, i, str3, str4, str, str2);
            }
        }

        /* renamed from: a */
        private final void m213449a(Chat chat, int i, String str, String str2, String str3, String str4) {
            JSONObject put = new JSONObject(ChatParamUtils.m133137a(chat, mo187666a(), (Chatter) null, 4, (Object) null)).put("click", str3).put("target", str4);
            put.put("msg_count", i).put("msg_id", str).put("msg_type", str2);
            Statistics.sendEvent("im_msg_multi_select_click", put);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.p.b$b */
    static final class C54971b extends Lambda implements Function0<String> {
        public static final C54971b INSTANCE = new C54971b();

        C54971b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            return N.mo134394a();
        }
    }
}
