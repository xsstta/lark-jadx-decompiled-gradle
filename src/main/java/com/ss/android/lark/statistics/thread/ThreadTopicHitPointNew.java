package com.ss.android.lark.statistics.thread;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.statistics.Statistics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/statistics/thread/ThreadTopicHitPointNew;", "", "()V", "Companion", "Params", "Value", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.u.b */
public final class ThreadTopicHitPointNew {

    /* renamed from: a */
    public static final Lazy f135907a = LazyKt.lazy(C54985b.INSTANCE);

    /* renamed from: b */
    public static final Companion f135908b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ>\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J*\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J6\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u001a\u0010\u001f\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ&\u0010\u001f\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bJB\u0010 \u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007J\u0018\u0010!\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0004J\n\u0010\"\u001a\u00020\u0004*\u00020#R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006$"}, d2 = {"Lcom/ss/android/lark/statistics/thread/ThreadTopicHitPointNew$Companion;", "", "()V", "userId", "", "kotlin.jvm.PlatformType", "getUserId", "()Ljava/lang/String;", "userId$delegate", "Lkotlin/Lazy;", "getMessageParamMap", "", "threadMessageVO", "Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "getMsgClickParamMap", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "occasion", "fileId", "fileType", "getThreadDetailParamMap", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "threadId", "sendMsgMenuMoreClick", "", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "click", "target", "extraParams", "sendMsgMenuMoreView", "sendThreadDetailClick", "sendThreadDetailView", "toText", "Lcom/ss/android/lark/doc/entity/DocType;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.u.b$a */
    public static final class Companion {
        /* renamed from: a */
        private final String m213576a() {
            Lazy lazy = ThreadTopicHitPointNew.f135907a;
            Companion aVar = ThreadTopicHitPointNew.f135908b;
            return (String) lazy.getValue();
        }

        /* renamed from: a */
        public final void mo187752a(Chat chat, String str, String str2, String str3) {
            m213577a(this, chat, str, str2, str3, null, 16, null);
        }

        private Companion() {
        }

        /* renamed from: a */
        public final void mo187753a(Chat chat, String str, String str2, String str3, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            Intrinsics.checkParameterIsNotNull(str2, "click");
            Intrinsics.checkParameterIsNotNull(str3, "target");
            if (chat != null) {
                if (!(str.length() == 0)) {
                    JSONObject put = new JSONObject(m213578b(chat, str)).put("click", str2).put("target", str3);
                    if (map != null) {
                        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                            put.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Statistics.sendEvent("channel_topic_detail_click", put);
                }
            }
        }

        /* renamed from: a */
        public final void mo187754a(Chat chat, Map<String, ? extends Object> map) {
            if (chat != null) {
                JSONObject jSONObject = new JSONObject(ChatParamUtils.m133137a(chat, m213576a(), (Chatter) null, 4, (Object) null));
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                Statistics.sendEvent("im_msg_menu_more_view", jSONObject);
            }
        }

        /* renamed from: a */
        public final void mo187755a(Chat chat, Map<String, ? extends Object> map, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (chat != null) {
                JSONObject put = new JSONObject(ChatParamUtils.m133137a(chat, m213576a(), (Chatter) null, 4, (Object) null)).put("click", str).put("target", str2);
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        put.put(entry.getKey(), entry.getValue());
                    }
                }
                Statistics.sendEvent("im_msg_menu_more_click", put);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo187746a(DocType docType) {
            Intrinsics.checkParameterIsNotNull(docType, "$this$toText");
            switch (C54986c.f135909a[docType.ordinal()]) {
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
        public final Map<String, Object> mo187747a(ThreadMessageVO<?> threadMessageVO) {
            Intrinsics.checkParameterIsNotNull(threadMessageVO, "threadMessageVO");
            return MapsKt.mapOf(TuplesKt.to("msg_id", threadMessageVO.mo121681a()), TuplesKt.to("cid", threadMessageVO.mo121696d()), TuplesKt.to("msg_type", ChatParamUtils.f88665a.mo126911a(threadMessageVO.mo121710r())));
        }

        /* renamed from: b */
        private final Map<String, Object> m213578b(Chat chat, String str) {
            return MapsKt.mapOf(TuplesKt.to("chat_id", chat.getId()), TuplesKt.to("thread_id", str), TuplesKt.to("is_inner_group", ChatParamUtils.f88665a.mo126914b(chat)), TuplesKt.to("is_public_group", ChatParamUtils.f88665a.mo126916c(chat)), TuplesKt.to("is_group_member", ChatParamUtils.f88665a.mo126917d(chat)));
        }

        /* renamed from: a */
        public final void mo187749a(Chat chat, MessageInfo messageInfo) {
            Message message;
            if (messageInfo != null && (message = messageInfo.getMessage()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo?.getMessage() ?: return");
                mo187754a(chat, ChatParamUtils.f88665a.mo126913a(message));
            }
        }

        /* renamed from: a */
        public final void mo187751a(Chat chat, String str) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            if (chat != null) {
                Statistics.sendEvent("channel_topic_detail_view", new JSONObject(m213578b(chat, str)));
            }
        }

        /* renamed from: a */
        public final Map<String, Object> mo187748a(AbsMessageVO<?> aVar, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
            Intrinsics.checkParameterIsNotNull(str, "occasion");
            HashMap hashMap = new HashMap();
            if (aVar instanceof ChatMessageVO) {
                hashMap.putAll(ChatParamUtils.f88665a.mo126912a((ChatMessageVO) aVar));
            } else if (aVar instanceof ThreadMessageVO) {
                hashMap.putAll(mo187747a((ThreadMessageVO) aVar));
            }
            HashMap hashMap2 = hashMap;
            hashMap2.put("occasion", str);
            if (str2 == null) {
                str2 = "none";
            }
            hashMap2.put("file_id", str2);
            if (str3 == null) {
                str3 = "none";
            }
            hashMap2.put("file_type", str3);
            return hashMap2;
        }

        /* renamed from: a */
        public final void mo187750a(Chat chat, MessageInfo messageInfo, String str, String str2) {
            Message message;
            String str3;
            String str4;
            Doc doc;
            DocType docType;
            String a;
            Doc doc2;
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            if (messageInfo != null && (message = messageInfo.getMessage()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo?.getMessage() ?: return");
                Map<String, Object> a2 = ChatParamUtils.f88665a.mo126913a(message);
                if (a2 != null) {
                    Map<String, ? extends Object> j = C69121n.m265993j(a2);
                    DocResult docResult = null;
                    if (message.getType() == Message.Type.TEXT) {
                        docResult = ((TextContent) message.getContent()).getDocResult();
                    } else if (message.getType() == Message.Type.POST) {
                        docResult = ((PostContent) message.getContent()).getDocResult();
                    }
                    if (docResult == null) {
                        str3 = "false";
                    } else {
                        str3 = "true";
                    }
                    j.put("is_single_doc", str3);
                    String str5 = "none";
                    if (docResult == null || (doc2 = docResult.getDoc()) == null || (str4 = doc2.getId()) == null) {
                        str4 = str5;
                    }
                    j.put("file_id", str4);
                    if (!(docResult == null || (doc = docResult.getDoc()) == null || (docType = doc.getDocType()) == null || (a = mo187746a(docType)) == null)) {
                        str5 = a;
                    }
                    j.put("file_type", str5);
                    mo187755a(chat, j, str, str2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.ss.android.lark.statistics.u.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m213577a(Companion aVar, Chat chat, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 16) != 0) {
                map = null;
            }
            aVar.mo187753a(chat, str, str2, str3, map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.u.b$b */
    static final class C54985b extends Lambda implements Function0<String> {
        public static final C54985b INSTANCE = new C54985b();

        C54985b() {
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
