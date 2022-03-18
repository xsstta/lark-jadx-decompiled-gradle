package com.ss.android.lark.statistics.chat;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.utils.C57859q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointNew;", "", "()V", "Companion", "Params", "Value", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.chat.b */
public final class ChatHitPointNew {

    /* renamed from: a */
    public static final Lazy f135658a = LazyKt.lazy(C54946c.INSTANCE);

    /* renamed from: b */
    public static final Lazy f135659b = LazyKt.lazy(C54945b.INSTANCE);

    /* renamed from: c */
    public static final Companion f135660c = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m213102a(String str, boolean z) {
        f135660c.mo187390a(str, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012J6\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0004J\u0018\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J8\u0010'\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006J\u000e\u0010'\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020&J8\u0010'\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006JD\u0010+\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0002J8\u0010-\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102H\u0007J8\u00104\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006J\u0010\u00105\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0018\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u000209H\u0007J2\u0010:\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006J\"\u0010;\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006J\u000e\u0010<\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J4\u0010<\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006J\"\u0010=\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006J\u000e\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020&J\u000e\u0010@\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\u000e\u0010A\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\u000e\u0010B\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&J\"\u0010C\u001a\u00020\u001d2\b\u0010D\u001a\u0004\u0018\u00010\u00042\b\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u0010F\u001a\u00020\u0004J\u001c\u0010C\u001a\u00020\u001d2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J(\u0010G\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006J\n\u0010H\u001a\u00020\u0004*\u00020IR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006J"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointNew$Companion;", "", "()V", "LOG_TAG", "", "msgClickTargetMap", "", "getMsgClickTargetMap", "()Ljava/util/Map;", "msgClickTargetMap$delegate", "Lkotlin/Lazy;", "userId", "kotlin.jvm.PlatformType", "getUserId", "()Ljava/lang/String;", "userId$delegate", "getMessageParamMap", "threadMessageVO", "Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "getMsgClickParamMap", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "fileId", "fileType", "getMsgTargetByClick", "click", "getThreadParamMap", "threadId", "sendCallSelectClick", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", ShareHitPoint.f121869d, "", "sendCallSelectView", "sendChatInputPlusView", "sendIMChatMemberTopLimitView", "extraParams", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendImChatMainClick", "target", "param", "chatId", "sendImChatMainClickInner", "chatParams", "sendImChatMainView", "botId", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "tabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "sendImGroupApplyClick", "sendImGroupApplyView", "sendImMainAvatarClick", "toUserId", "hasWornMedal", "", "sendImMsgDeleteConfirmClick", "sendImMsgDeleteConfirmView", "sendImMsgMenuClick", "sendImMsgMenuView", "sendImMsgPinToTopCardView", "extraParam", "sendImMsgPinTopCardClick", "sendImMsgUnpinTopConfirmClick", "sendImMsgUnpinTopConfirmView", "sendImUrlRenderClick", "url", "priViewId", "clickTYpe", "sendImUrlRenderView", "toText", "Lcom/ss/android/lark/doc/entity/DocType;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.chat.b$a */
    public static final class Companion {
        /* renamed from: a */
        private final String m213103a() {
            Lazy lazy = ChatHitPointNew.f135658a;
            Companion aVar = ChatHitPointNew.f135660c;
            return (String) lazy.getValue();
        }

        /* renamed from: b */
        private final Map<String, String> m213108b() {
            Lazy lazy = ChatHitPointNew.f135659b;
            Companion aVar = ChatHitPointNew.f135660c;
            return (Map) lazy.getValue();
        }

        /* renamed from: a */
        public final void mo187382a(Chat chat, String str) {
            m213104a(this, chat, str, (Chatter) null, (List) null, 12, (Object) null);
        }

        private Companion() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo187383a(com.ss.android.lark.chat.entity.chat.Chat r6, java.lang.String r7, com.ss.android.lark.chat.entity.chatter.Chatter r8, java.util.List<com.ss.android.lark.tab.service.entity.ChatTab> r9) {
            /*
            // Method dump skipped, instructions count: 199
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.statistics.chat.ChatHitPointNew.Companion.mo187383a(com.ss.android.lark.chat.entity.chat.Chat, java.lang.String, com.ss.android.lark.chat.entity.chatter.Chatter, java.util.List):void");
        }

        /* renamed from: a */
        public final void mo187386a(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "param");
            JSONObject json = C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson();
            Log.m165379d("ChatHitPointNew", "IM_CHAT_MAIN_CLICK, params:" + json);
            Statistics.sendEvent("im_chat_main_click", json);
        }

        /* renamed from: a */
        public final void mo187388a(String str, String str2, String str3, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            Map<String, ? extends Object> b = ChatParamUtils.m133149b(str);
            if (b != null) {
                m213106a(str2, str3, b, map);
            }
        }

        /* renamed from: a */
        public final void mo187384a(Chat chat, String str, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (chat != null) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36450aa N = b.mo134515N();
                Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                m213106a(str, str2, ChatParamUtils.m133137a(chat, N.mo134394a(), (Chatter) null, 4, (Object) null), map);
            }
        }

        /* renamed from: a */
        public final void mo187385a(Chat chat, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(map, "extraParams");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            JSONObject jSONObject = new JSONObject(ChatParamUtils.m133137a(chat, N.mo134394a(), (Chatter) null, 4, (Object) null));
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            Log.m165379d("ChatHitPointNew", "IM_MSG_MENU_VIEW, params:" + jSONObject);
            Statistics.sendEvent("im_msg_menu_view", jSONObject);
        }

        /* renamed from: a */
        public final void mo187380a(Chat chat) {
            if (chat != null) {
                Statistics.sendEvent("im_call_select_view", new JSONObject(ChatParamUtils.m133137a(chat, m213103a(), (Chatter) null, 4, (Object) null)));
            }
        }

        /* renamed from: a */
        public final void mo187381a(Chat chat, int i) {
            if (chat != null) {
                Statistics.sendEvent("im_call_select_click", new JSONObject(ChatParamUtils.m133137a(chat, m213103a(), (Chatter) null, 4, (Object) null)).put("click", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "office_call" : "voice_call" : "vc_call" : "real_call").put("target", (i == 1 || i == 4) ? "none" : "vc_meeting_calling_view"));
            }
        }

        /* renamed from: a */
        public final void mo187389a(String str, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(map, "extraParams");
            Map<String, Object> b = ChatParamUtils.m133149b(str);
            if (b != null) {
                JSONObject jSONObject = new JSONObject(b);
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                Statistics.sendEvent("im_msg_delete_confirm_view", jSONObject);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            if (r3 != null) goto L_0x002b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo187387a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            /*
                r2 = this;
                java.lang.String r0 = "clickTYpe"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "click"
                r0.put(r1, r5)
                java.lang.String r5 = "none"
                if (r3 == 0) goto L_0x002a
                r1 = r3
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0020
                r1 = 1
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                if (r1 != 0) goto L_0x002a
                java.lang.String r3 = com.larksuite.framework.utils.aq.m95059b(r3)
                if (r3 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r3 = r5
            L_0x002b:
                java.lang.String r1 = "url_domain_path"
                r0.put(r1, r3)
                if (r4 == 0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r4 = r5
            L_0x0034:
                java.lang.String r3 = "url_id"
                r0.put(r3, r4)
                r3 = r2
                com.ss.android.lark.statistics.chat.b$a r3 = (com.ss.android.lark.statistics.chat.ChatHitPointNew.Companion) r3
                r3.m213107a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.statistics.chat.ChatHitPointNew.Companion.mo187387a(java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public final Map<String, Object> mo187379a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            return MapsKt.mapOf(TuplesKt.to("thread_id", str));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187390a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "toUserId");
            Statistics.sendEvent("im_chat_main_click", new JSONObject().put("click", "icon").put("is_medal", String.valueOf(z)).put("target", "profile_main_view").put("to_user_id", str));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final String mo187391b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            String str2 = m213108b().get(str);
            if (str2 != null) {
                return str2;
            }
            return "none";
        }

        /* renamed from: c */
        public final void mo187397c(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParams");
            Statistics.sendEvent("im_chat_member_toplimit_view", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        /* renamed from: d */
        public final void mo187399d(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
            Statistics.sendEvent("im_msg_pin_to_top_card_view", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        /* renamed from: e */
        public final void mo187400e(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParams");
            Statistics.sendEvent("im_msg_pin_to_top_card_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        /* renamed from: f */
        public final void mo187401f(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParams");
            Statistics.sendEvent("im_msg_unpin_to_top_confirm_view", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        /* renamed from: g */
        public final void mo187402g(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParams");
            Statistics.sendEvent("im_msg_unpin_to_top_confirm_click", C54952a.m213205a(ChatParamUtils.m133148b(), cVar).toJson());
        }

        /* renamed from: b */
        public final void mo187392b(Chat chat) {
            if (chat != null) {
                Statistics.sendEvent("im_chat_group_apply_view", new JSONObject(ChatParamUtils.m133137a(chat, m213103a(), (Chatter) null, 4, (Object) null)));
            }
        }

        /* renamed from: a */
        private final void m213107a(Map<String, ? extends Object> map) {
            Map<String, Object> b = ChatParamUtils.m133148b();
            if (b != null) {
                JSONObject jSONObject = new JSONObject(b);
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("target", "none");
                Statistics.sendEvent("im_url_render_click", jSONObject);
            }
        }

        /* renamed from: b */
        public final void mo187394b(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "extraParams");
            Statistics.sendEvent("im_msg_menu_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson());
        }

        /* renamed from: a */
        public final String mo187376a(DocType docType) {
            Intrinsics.checkParameterIsNotNull(docType, "$this$toText");
            switch (C54947c.f135661a[docType.ordinal()]) {
                case 1:
                    return "doc";
                case 2:
                    return "sheet";
                case 3:
                    return "bitable";
                case 4:
                    return "mindnote";
                case 5:
                    return "file";
                case 6:
                    return "PPT";
                case 7:
                    return "docx";
                default:
                    return "others";
            }
        }

        /* renamed from: a */
        public final Map<String, Object> mo187377a(ThreadMessageVO<?> threadMessageVO) {
            Intrinsics.checkParameterIsNotNull(threadMessageVO, "threadMessageVO");
            return MapsKt.mapOf(TuplesKt.to("msg_id", threadMessageVO.mo121681a()), TuplesKt.to("cid", threadMessageVO.mo121696d()), TuplesKt.to("msg_type", ChatParamUtils.f88665a.mo126911a(threadMessageVO.mo121710r())));
        }

        /* renamed from: b */
        public final void mo187396b(String str, Map<String, ? extends Object> map) {
            Map<String, Object> b = ChatParamUtils.m133149b(str);
            if (b != null) {
                JSONObject jSONObject = new JSONObject(b);
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                Statistics.sendEvent("im_url_render_view", jSONObject);
            }
        }

        /* renamed from: a */
        public final Map<String, Object> mo187378a(AbsMessageVO<?> aVar, String str, String str2) {
            String str3;
            String url;
            Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
            HashMap hashMap = new HashMap();
            if (aVar instanceof ChatMessageVO) {
                hashMap.putAll(ChatParamUtils.f88665a.mo126912a((ChatMessageVO) aVar));
            } else if (aVar instanceof ThreadMessageVO) {
                hashMap.putAll(mo187377a((ThreadMessageVO) aVar));
            }
            HashMap hashMap2 = hashMap;
            String c = C57859q.m224567c(str);
            String str4 = "none";
            if (c == null) {
                c = str4;
            }
            hashMap2.put("file_id", c);
            if (str2 == null) {
                str2 = str4;
            }
            hashMap2.put("file_type", str2);
            ContentVO g = aVar.mo121699g();
            boolean z = g instanceof TextContentVO;
            if (z || (g instanceof PostContentVO)) {
                PreviewHangPoint previewHangPoint = null;
                if (z) {
                    previewHangPoint = ((TextContentVO) g).mo121904o();
                } else if (g instanceof PostContentVO) {
                    previewHangPoint = ((PostContentVO) g).mo121885q();
                }
                if (previewHangPoint != null) {
                    hashMap2.put("is_url", "true");
                } else {
                    hashMap2.put("is_url", "false");
                }
                if (previewHangPoint == null || (str3 = previewHangPoint.getPreviewId()) == null) {
                    str3 = str4;
                }
                hashMap2.put("url_id", str3);
                if (!(previewHangPoint == null || (url = previewHangPoint.getUrl()) == null)) {
                    str4 = url;
                }
                hashMap2.put("url_domain_path", str4);
            }
            return hashMap2;
        }

        /* renamed from: a */
        private final void m213106a(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
            JSONObject put = new JSONObject(map).put("click", str).put("target", str2);
            if (map2 != null) {
                for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                    put.put(entry.getKey(), entry.getValue());
                }
            }
            Log.m165379d("ChatHitPointNew", "IM_CHAT_MAIN_CLICK, params:" + put);
            Statistics.sendEvent("im_chat_main_click", put);
        }

        /* renamed from: b */
        public final void mo187393b(Chat chat, String str, String str2, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (chat != null) {
                JSONObject put = new JSONObject(ChatParamUtils.m133137a(chat, m213103a(), (Chatter) null, 4, (Object) null)).put("click", str).put("target", str2);
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        put.put(entry.getKey(), entry.getValue());
                    }
                }
                Statistics.sendEvent("im_chat_group_apply_click", put);
            }
        }

        /* renamed from: c */
        public final void mo187398c(String str, String str2, String str3, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            Intrinsics.checkParameterIsNotNull(map, "extraParams");
            Map<String, Object> b = ChatParamUtils.m133149b(str);
            if (b != null) {
                JSONObject put = new JSONObject(b).put("click", str2).put("target", str3);
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    put.put(entry.getKey(), entry.getValue());
                }
                Statistics.sendEvent("im_msg_delete_confirm_click", put);
            }
        }

        /* renamed from: b */
        public final void mo187395b(String str, String str2, String str3, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            Map<String, Object> b = ChatParamUtils.m133149b(str);
            if (b != null) {
                JSONObject jSONObject = new JSONObject(b);
                jSONObject.put("click", str2);
                jSONObject.put("target", str3);
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                Log.m165379d("ChatHitPointNew", "IM_MSG_MENU_CLICK, params:" + jSONObject);
                Statistics.sendEvent("im_msg_menu_click", jSONObject);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.statistics.chat.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m213104a(Companion aVar, Chat chat, String str, Chatter chatter, List list, int i, Object obj) {
            if ((i & 4) != 0) {
                chatter = null;
            }
            if ((i & 8) != 0) {
                list = null;
            }
            aVar.mo187383a(chat, str, chatter, list);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.statistics.chat.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m213105a(Companion aVar, Chat chat, String str, String str2, Map map, int i, Object obj) {
            if ((i & 8) != 0) {
                map = null;
            }
            aVar.mo187384a(chat, str, str2, map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.chat.b$c */
    static final class C54946c extends Lambda implements Function0<String> {
        public static final C54946c INSTANCE = new C54946c();

        C54946c() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.chat.b$b */
    static final class C54945b extends Lambda implements Function0<Map<String, ? extends String>> {
        public static final C54945b INSTANCE = new C54945b();

        C54945b() {
            super(0);
        }

        /* Return type fixed from 'java.util.Map<java.lang.String, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            return MapsKt.mapOf(TuplesKt.to("docs", "ccm_docs_page_view"), TuplesKt.to("file", "ccm_local_page_view"), TuplesKt.to("url", "none"), TuplesKt.to("image", "public_picbrowser_view"), TuplesKt.to("media", "public_picbrowser_view"), TuplesKt.to("sticker", "public_picbrowser_view"), TuplesKt.to("mergeforward", "im_msg_mergeforward_detail_view"), TuplesKt.to("reaction", "none"), TuplesKt.to("@someone", "profile_main_view"), TuplesKt.to("icon", "profile_main_view"));
        }
    }
}
