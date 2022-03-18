package com.ss.android.lark.forward.impl.statistics;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ThreadTarget;
import com.ss.android.lark.forward.dto.template.ForwardCallType;
import com.ss.android.lark.forward.dto.template.ForwardLocation;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0002\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/ForwardHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "MessageForwardParam", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.impl.statistics.a */
public final class ForwardHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f98819a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/ForwardHitPoint$Companion;", "", "()V", "TAG", "", "sendCancelMergeForward", "", "location", "sendForwardClickMore", "isExpand", "", "sendForwardCreateGroup", "memberNum", "Ljava/lang/Integer;", ShareHitPoint.f121868c, "sendForwardMultiClick", "position", "sendForwardSelectChatEvent", "chatId", "sendForwardSingleClick", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.impl.statistics.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo140997a(Integer num, String str) {
            Intrinsics.checkParameterIsNotNull(num, "memberNum");
            Statistics.sendEvent("message_forward_create_group", new JSONObject().put("member_num", num).put(ShareHitPoint.f121868c, str));
        }

        /* renamed from: a */
        public final void mo140999a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
            Statistics.sendEvent("forward_select_chat", new JSONObject().put("find_type", "recent").put("chat_id", str).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: a */
        public final void mo140998a(String str, Integer num, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            Intrinsics.checkParameterIsNotNull(num, "position");
            Statistics.sendEvent("message_forward_single_click", new JSONObject().put("location", str).put("sort_position", num).put(ShareHitPoint.f121868c, str2));
        }

        /* renamed from: b */
        public final void mo141000b(String str, Integer num, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            Intrinsics.checkParameterIsNotNull(num, "position");
            Statistics.sendEvent("message_forward_multi_click", new JSONObject().put("location", str).put("sort_position", num).put(ShareHitPoint.f121868c, str2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/ForwardHitPoint$MessageForwardParam;", "", "postScript", "", "messageIds", "", "callType", "Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "location", "Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "targets", "Lcom/ss/android/lark/forward/dto/ForwardTarget;", "(Ljava/lang/String;Ljava/util/List;Lcom/ss/android/lark/forward/dto/template/ForwardCallType;Lcom/ss/android/lark/forward/dto/template/ForwardLocation;Ljava/util/List;)V", "getCallType", "()Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "getLocation", "()Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "getMessageIds", "()Ljava/util/List;", "getPostScript", "()Ljava/lang/String;", "getTargets", "sendEvent", "", "sendEventImpl", "Builder", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.impl.statistics.a$b */
    public static final class MessageForwardParam {

        /* renamed from: a */
        private final String f98820a;

        /* renamed from: b */
        private final List<String> f98821b;

        /* renamed from: c */
        private final ForwardCallType f98822c;

        /* renamed from: d */
        private final ForwardLocation f98823d;

        /* renamed from: e */
        private final List<ForwardTarget> f98824e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.forward.impl.statistics.a$b$b */
        static final class RunnableC38439b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MessageForwardParam f98830a;

            RunnableC38439b(MessageForwardParam bVar) {
                this.f98830a = bVar;
            }

            public final void run() {
                this.f98830a.mo141002b();
            }
        }

        /* renamed from: a */
        public final void mo141001a() {
            if (!CollectionUtils.isEmpty(this.f98821b) && !CollectionUtils.isEmpty(this.f98824e)) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getFixedThreadPool().execute(new RunnableC38439b(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u001b\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/ForwardHitPoint$MessageForwardParam$Builder;", "", "()V", "callType", "Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "getCallType", "()Lcom/ss/android/lark/forward/dto/template/ForwardCallType;", "setCallType", "(Lcom/ss/android/lark/forward/dto/template/ForwardCallType;)V", "location", "Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "getLocation", "()Lcom/ss/android/lark/forward/dto/template/ForwardLocation;", "setLocation", "(Lcom/ss/android/lark/forward/dto/template/ForwardLocation;)V", "messageIds", "", "", "getMessageIds", "()Ljava/util/List;", "setMessageIds", "(Ljava/util/List;)V", "postScript", "getPostScript", "()Ljava/lang/String;", "setPostScript", "(Ljava/lang/String;)V", "targets", "Lcom/ss/android/lark/forward/dto/ForwardTarget;", "getTargets", "setTargets", "build", "Lcom/ss/android/lark/forward/impl/statistics/ForwardHitPoint$MessageForwardParam;", "script", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.forward.impl.statistics.a$b$a */
        public static final class Builder {

            /* renamed from: a */
            private String f98825a;

            /* renamed from: b */
            private List<String> f98826b = new ArrayList();

            /* renamed from: c */
            private ForwardCallType f98827c;

            /* renamed from: d */
            private ForwardLocation f98828d;

            /* renamed from: e */
            private List<? extends ForwardTarget> f98829e = new ArrayList();

            /* renamed from: a */
            public final MessageForwardParam mo141007a() {
                return new MessageForwardParam(this.f98825a, this.f98826b, this.f98827c, this.f98828d, this.f98829e);
            }

            /* renamed from: a */
            public final Builder mo141003a(ForwardCallType forwardCallType) {
                Builder aVar = this;
                aVar.f98827c = forwardCallType;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo141004a(ForwardLocation forwardLocation) {
                Builder aVar = this;
                aVar.f98828d = forwardLocation;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo141008b(List<? extends ForwardTarget> list) {
                Intrinsics.checkParameterIsNotNull(list, "targets");
                Builder aVar = this;
                aVar.f98829e = list;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo141005a(String str) {
                Builder aVar = this;
                aVar.f98825a = str;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo141006a(List<String> list) {
                Builder aVar = this;
                aVar.f98826b = list;
                return aVar;
            }
        }

        /* renamed from: b */
        public final void mo141002b() {
            String str;
            boolean z;
            int i;
            ThreadTarget g;
            String chatId;
            Chat.Type type;
            AbstractC38365a a = C38364a.m151054a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ForwardModule.getDependency()");
            AbstractC38365a.AbstractC38366a g2 = a.mo140445g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "ForwardModule.getDependency().accountDependency");
            String b = g2.mo140457b();
            int size = this.f98824e.size();
            boolean z2 = !TextUtils.isEmpty(this.f98820a);
            if (!CollectionUtils.isEmpty(this.f98821b)) {
                List<String> list = this.f98821b;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() == null) {
                            return;
                        }
                    }
                }
                AbstractC38365a a2 = C38364a.m151054a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "ForwardModule.getDependency()");
                Map<String, Message> b2 = a2.mo140442d().mo140491b(this.f98821b);
                String str2 = null;
                if (CollectionUtils.isEmpty(b2)) {
                    str = null;
                } else {
                    Object first = CollectionsKt.first(b2.values());
                    Intrinsics.checkExpressionValueIsNotNull(first, "messages.values.first()");
                    str = ((Message) first).getChatId();
                }
                if (!CollectionUtils.isEmpty(b2)) {
                    Object first2 = CollectionsKt.first(b2.values());
                    Intrinsics.checkExpressionValueIsNotNull(first2, "messages.values.first()");
                    str2 = ((Message) first2).getThreadId();
                }
                AbstractC38365a a3 = C38364a.m151054a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "ForwardModule.getDependency()");
                Chat a4 = a3.mo140442d().mo140469a(str);
                if (a4 != null) {
                    z = a4.isSecret();
                } else {
                    z = false;
                }
                if (a4 == null || (type = a4.getType()) == null) {
                    i = -1;
                } else {
                    i = type.getNumber();
                }
                ArrayList arrayList = new ArrayList();
                for (T t : this.f98824e) {
                    int a5 = t.mo140565a();
                    if (a5 == 0) {
                        arrayList.add(t.mo140567b());
                    } else if (a5 == 1) {
                        AbstractC38365a a6 = C38364a.m151054a();
                        Intrinsics.checkExpressionValueIsNotNull(a6, "ForwardModule.getDependency()");
                        Chat e = a6.mo140442d().mo140499e(t.mo140567b());
                        if (e != null) {
                            arrayList.add(e.getId());
                        }
                    } else if (!(a5 != 2 || (g = t.mo140573g()) == null || (chatId = g.getChatId()) == null)) {
                        arrayList.add(chatId);
                    }
                }
                JSONArray jSONArray = new JSONArray();
                for (T t2 : b2.values()) {
                    JSONObject jSONObject = new JSONObject();
                    Intrinsics.checkExpressionValueIsNotNull(t2, "message");
                    JSONObject put = jSONObject.put("id", t2.getId());
                    Message.Type type2 = t2.getType();
                    Intrinsics.checkExpressionValueIsNotNull(type2, "message.type");
                    jSONArray.put(put.put("message_type", type2.getNumber()));
                }
                JSONObject put2 = new JSONObject().put("user_unique_id", b).put("receiver_num", size).put("is_postscript", z2).put("chat_type", i).put("chat_aim_id", arrayList).put("chat_id", str).put("is_secret_chat", z).put("messages", jSONArray).put("thread_id", str2);
                ForwardCallType forwardCallType = this.f98822c;
                if (forwardCallType != null) {
                    put2.put("calltype", forwardCallType.getValue());
                }
                ForwardLocation forwardLocation = this.f98823d;
                if (forwardLocation != null) {
                    put2.put("location", forwardLocation.getValue());
                }
                Log.m165379d("ForwardHitPoint", "message forward hit point: " + put2);
                Statistics.sendEvent("message_forward", put2);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.lark.forward.dto.ForwardTarget> */
        /* JADX WARN: Multi-variable type inference failed */
        public MessageForwardParam(String str, List<String> list, ForwardCallType forwardCallType, ForwardLocation forwardLocation, List<? extends ForwardTarget> list2) {
            Intrinsics.checkParameterIsNotNull(list2, "targets");
            this.f98820a = str;
            this.f98821b = list;
            this.f98822c = forwardCallType;
            this.f98823d = forwardLocation;
            this.f98824e = list2;
        }
    }
}
