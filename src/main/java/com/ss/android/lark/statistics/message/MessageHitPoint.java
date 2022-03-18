package com.ss.android.lark.statistics.message;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.param.IMConstants;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.dependency.ar;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.statistics.message.Conf;
import com.ss.android.lark.statistics.message.MessageHitUtils;
import com.ss.android.lark.statistics.p2704r.C54984a;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.vesdk.C64034n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "MessageCommonParam", "MessageReplyParam", "MessageSentParam", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.n.d */
public final class MessageHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static String f135776a = ChatTypeStateKeeper.f135669d;

    /* renamed from: b */
    public static String f135777b = "main";

    /* renamed from: c */
    public static Map<String, String> f135778c;

    /* renamed from: d */
    public static final Companion f135779d = new Companion(null);

    /* renamed from: e */
    private static final AbstractC36498n f135780e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001&B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0002\u0010\u0014J\b\u0010$\u001a\u00020%H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam;", "", "chatType", "", "chatId", "", "location", "notice", "messageLength", "cid", "emojiType", "", "emojiCount", "richTextImageCount", "docLinkCount", "isSecretChat", "", "messageType", "isBotChat", "isMeetingChat", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IIIZIZZ)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getCid", "getDocLinkCount", "getEmojiCount", "getEmojiType", "()Ljava/util/List;", "()Z", "getLocation", "getMessageLength", "getMessageType", "getNotice", "getRichTextImageCount", "toJson", "Lorg/json/JSONObject;", "Builder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.n.d$b */
    public static class MessageCommonParam {

        /* renamed from: a */
        private final int f135797a;

        /* renamed from: b */
        private final String f135798b;

        /* renamed from: c */
        private final String f135799c;

        /* renamed from: d */
        private final String f135800d;

        /* renamed from: e */
        private final int f135801e;

        /* renamed from: f */
        private final String f135802f;

        /* renamed from: g */
        private final List<String> f135803g;

        /* renamed from: h */
        private final int f135804h;

        /* renamed from: i */
        private final int f135805i;

        /* renamed from: j */
        private final int f135806j;

        /* renamed from: k */
        private final boolean f135807k;

        /* renamed from: l */
        private final int f135808l;

        /* renamed from: m */
        private final boolean f135809m;

        /* renamed from: n */
        private final boolean f135810n;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00106\u001a\u000207H\u0016J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nJ\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001fJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\nJ\u000e\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010%\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001a\u0010'\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001a\u00100\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000e¨\u00068"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam$Builder;", "", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "chatType", "", "getChatType", "()I", "setChatType", "(I)V", "cid", "getCid", "setCid", "docLinkCount", "getDocLinkCount", "setDocLinkCount", "emojiCount", "getEmojiCount", "setEmojiCount", "emojiType", "", "getEmojiType", "()Ljava/util/List;", "setEmojiType", "(Ljava/util/List;)V", "isBotChat", "", "()Z", "setBotChat", "(Z)V", "isMeetingChat", "setMeetingChat", "isSecretChat", "setSecretChat", "location", "getLocation", "setLocation", "messageLength", "getMessageLength", "setMessageLength", "messageType", "getMessageType", "setMessageType", "notice", "getNotice", "setNotice", "richTextImageCount", "getRichTextImageCount", "setRichTextImageCount", "build", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.d$b$a */
        public static class Builder {

            /* renamed from: a */
            private int f135811a = -1;

            /* renamed from: b */
            private String f135812b = "";

            /* renamed from: c */
            private String f135813c = "";

            /* renamed from: d */
            private String f135814d = "";

            /* renamed from: e */
            private int f135815e;

            /* renamed from: f */
            private String f135816f = "";

            /* renamed from: g */
            private List<String> f135817g = new ArrayList();

            /* renamed from: h */
            private int f135818h;

            /* renamed from: i */
            private int f135819i;

            /* renamed from: j */
            private int f135820j;

            /* renamed from: k */
            private boolean f135821k;

            /* renamed from: l */
            private int f135822l = -1;

            /* renamed from: m */
            private boolean f135823m;

            /* renamed from: n */
            private boolean f135824n;

            /* renamed from: a */
            public final int mo187583a() {
                return this.f135811a;
            }

            /* renamed from: b */
            public final String mo187589b() {
                return this.f135812b;
            }

            /* renamed from: c */
            public final String mo187593c() {
                return this.f135813c;
            }

            /* renamed from: d */
            public final String mo187598d() {
                return this.f135814d;
            }

            /* renamed from: e */
            public final int mo187601e() {
                return this.f135815e;
            }

            /* renamed from: f */
            public final String mo187607f() {
                return this.f135816f;
            }

            /* renamed from: g */
            public final List<String> mo187611g() {
                return this.f135817g;
            }

            /* renamed from: h */
            public final int mo187612h() {
                return this.f135818h;
            }

            /* renamed from: i */
            public final int mo187614i() {
                return this.f135819i;
            }

            /* renamed from: j */
            public final int mo187616j() {
                return this.f135820j;
            }

            /* renamed from: k */
            public final boolean mo187619k() {
                return this.f135821k;
            }

            /* renamed from: l */
            public final int mo187620l() {
                return this.f135822l;
            }

            /* renamed from: m */
            public final boolean mo187622m() {
                return this.f135823m;
            }

            /* renamed from: n */
            public final boolean mo187623n() {
                return this.f135824n;
            }

            /* renamed from: o */
            public MessageCommonParam mo187624o() {
                return new MessageCommonParam(this.f135811a, this.f135812b, this.f135813c, this.f135814d, this.f135815e, this.f135816f, this.f135817g, this.f135818h, this.f135819i, this.f135820j, this.f135821k, this.f135822l, this.f135823m, this.f135824n);
            }

            /* renamed from: a */
            public final void mo187584a(int i) {
                this.f135811a = i;
            }

            /* renamed from: b */
            public final void mo187590b(int i) {
                this.f135815e = i;
            }

            /* renamed from: c */
            public final void mo187594c(int i) {
                this.f135818h = i;
            }

            /* renamed from: d */
            public final Builder mo187597d(boolean z) {
                Builder aVar = this;
                aVar.f135821k = z;
                return aVar;
            }

            /* renamed from: e */
            public final Builder mo187603e(boolean z) {
                Builder aVar = this;
                aVar.f135823m = z;
                return aVar;
            }

            /* renamed from: f */
            public final Builder mo187606f(boolean z) {
                Builder aVar = this;
                aVar.f135824n = z;
                return aVar;
            }

            /* renamed from: g */
            public final Builder mo187609g(int i) {
                Builder aVar = this;
                aVar.f135811a = i;
                return aVar;
            }

            /* renamed from: h */
            public final Builder mo187613h(int i) {
                Builder aVar = this;
                aVar.f135815e = i;
                return aVar;
            }

            /* renamed from: i */
            public final Builder mo187615i(int i) {
                Builder aVar = this;
                aVar.f135818h = i;
                return aVar;
            }

            /* renamed from: j */
            public final Builder mo187617j(int i) {
                Builder aVar = this;
                aVar.f135819i = i;
                return aVar;
            }

            /* renamed from: k */
            public final Builder mo187618k(int i) {
                Builder aVar = this;
                aVar.f135820j = i;
                return aVar;
            }

            /* renamed from: l */
            public final Builder mo187621l(int i) {
                Builder aVar = this;
                aVar.f135822l = i;
                return aVar;
            }

            /* renamed from: a */
            public final void mo187585a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.f135812b = str;
            }

            /* renamed from: b */
            public final Builder mo187588b(List<String> list) {
                Intrinsics.checkParameterIsNotNull(list, "emojiType");
                Builder aVar = this;
                aVar.f135817g = list;
                return aVar;
            }

            /* renamed from: c */
            public final void mo187595c(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.f135814d = str;
            }

            /* renamed from: d */
            public final void mo187599d(int i) {
                this.f135819i = i;
            }

            /* renamed from: e */
            public final Builder mo187602e(String str) {
                Intrinsics.checkParameterIsNotNull(str, "chatId");
                Builder aVar = this;
                aVar.f135812b = str;
                return aVar;
            }

            /* renamed from: f */
            public final Builder mo187605f(String str) {
                Intrinsics.checkParameterIsNotNull(str, "notice");
                Builder aVar = this;
                aVar.f135814d = str;
                return aVar;
            }

            /* renamed from: g */
            public final Builder mo187610g(String str) {
                Intrinsics.checkParameterIsNotNull(str, "cid");
                Builder aVar = this;
                aVar.f135816f = str;
                return aVar;
            }

            /* renamed from: a */
            public final void mo187586a(List<String> list) {
                Intrinsics.checkParameterIsNotNull(list, "<set-?>");
                this.f135817g = list;
            }

            /* renamed from: b */
            public final void mo187591b(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.f135813c = str;
            }

            /* renamed from: c */
            public final void mo187596c(boolean z) {
                this.f135824n = z;
            }

            /* renamed from: d */
            public final void mo187600d(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.f135816f = str;
            }

            /* renamed from: e */
            public final void mo187604e(int i) {
                this.f135820j = i;
            }

            /* renamed from: f */
            public final void mo187608f(int i) {
                this.f135822l = i;
            }

            /* renamed from: a */
            public final void mo187587a(boolean z) {
                this.f135821k = z;
            }

            /* renamed from: b */
            public final void mo187592b(boolean z) {
                this.f135823m = z;
            }
        }

        /* renamed from: b */
        public final int mo187569b() {
            return this.f135797a;
        }

        /* renamed from: c */
        public final String mo187570c() {
            return this.f135798b;
        }

        /* renamed from: d */
        public final String mo187571d() {
            return this.f135799c;
        }

        /* renamed from: e */
        public final String mo187572e() {
            return this.f135800d;
        }

        /* renamed from: f */
        public final int mo187573f() {
            return this.f135801e;
        }

        /* renamed from: g */
        public final String mo187574g() {
            return this.f135802f;
        }

        /* renamed from: h */
        public final List<String> mo187575h() {
            return this.f135803g;
        }

        /* renamed from: i */
        public final int mo187576i() {
            return this.f135804h;
        }

        /* renamed from: j */
        public final int mo187577j() {
            return this.f135805i;
        }

        /* renamed from: k */
        public final int mo187578k() {
            return this.f135806j;
        }

        /* renamed from: l */
        public final boolean mo187579l() {
            return this.f135807k;
        }

        /* renamed from: m */
        public final int mo187580m() {
            return this.f135808l;
        }

        /* renamed from: n */
        public final boolean mo187581n() {
            return this.f135809m;
        }

        /* renamed from: o */
        public final boolean mo187582o() {
            return this.f135810n;
        }

        /* renamed from: a */
        public JSONObject mo187568a() {
            JSONObject put = new JSONObject().put("chat_type", this.f135797a).put("chat_id", this.f135798b).put("notice", this.f135800d).put("message_length", this.f135801e).put("cid", this.f135802f).put("emoji_type", this.f135803g).put("emoji_count", this.f135804h).put("richtext_image_count", this.f135805i).put("doc_link_count", this.f135806j).put("is_secret_chat", this.f135807k).put("message_type", this.f135808l).put("is_bot_chat", this.f135809m).put("is_meeting_chat", this.f135810n);
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(CHAT_TY…TING_CHAT, isMeetingChat)");
            return put;
        }

        public MessageCommonParam(int i, String str, String str2, String str3, int i2, String str4, List<String> list, int i3, int i4, int i5, boolean z, int i6, boolean z2, boolean z3) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "location");
            Intrinsics.checkParameterIsNotNull(str3, "notice");
            Intrinsics.checkParameterIsNotNull(str4, "cid");
            Intrinsics.checkParameterIsNotNull(list, "emojiType");
            this.f135797a = i;
            this.f135798b = str;
            this.f135799c = str2;
            this.f135800d = str3;
            this.f135801e = i2;
            this.f135802f = str4;
            this.f135803g = list;
            this.f135804h = i3;
            this.f135805i = i4;
            this.f135806j = i5;
            this.f135807k = z;
            this.f135808l = i6;
            this.f135809m = z2;
            this.f135810n = z3;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m213274a() {
        f135779d.mo187555g();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m213275a(boolean z) {
        f135779d.mo187537a(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0007J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0007J \u0010&\u001a\u00020\u00042\u0006\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0007J\"\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u00020#H\u0007J\u0018\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020%2\b\u00106\u001a\u0004\u0018\u000107J\u0012\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020%H\u0007J\u001a\u0010<\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010=\u001a\u00020%H\u0007J\u0010\u0010>\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010@\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010A\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010B\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010C\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0018\u0010D\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u00042\u0006\u0010E\u001a\u00020%J\u0010\u0010F\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010G\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010H\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010I\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0016\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020\u0004J\u0006\u0010M\u001a\u00020#J\u0006\u0010N\u001a\u00020#J\u0016\u0010O\u001a\u00020#2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0004J\u0016\u0010R\u001a\u00020#2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0004J.\u0010S\u001a\u00020#2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020%2\u0006\u0010W\u001a\u00020%J\u0006\u0010X\u001a\u00020#JO\u0010Y\u001a\u00020#2\b\u0010Z\u001a\u0004\u0018\u00010\u00042\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010P\u001a\u0004\u0018\u00010\u00042\b\u0010]\u001a\u0004\u0018\u00010\u00042\b\u0010^\u001a\u0004\u0018\u00010\\2\u0006\u0010_\u001a\u00020\\2\b\u0010-\u001a\u0004\u0018\u00010.¢\u0006\u0002\u0010`JO\u0010a\u001a\u00020#2\b\u0010Z\u001a\u0004\u0018\u00010\u00042\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010P\u001a\u0004\u0018\u00010\u00042\b\u0010]\u001a\u0004\u0018\u00010\u00042\b\u0010^\u001a\u0004\u0018\u00010\\2\u0006\u0010_\u001a\u00020\\2\b\u0010-\u001a\u0004\u0018\u00010.¢\u0006\u0002\u0010`J\u0018\u0010b\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010c\u001a\u00020\u0004J0\u0010b\u001a\u00020#2\u0006\u0010[\u001a\u00020\\2\u0006\u0010d\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010e\u001a\u00020%H\u0007J\u001c\u0010b\u001a\u00020#2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002000g2\u0006\u0010c\u001a\u00020\u0004J\u0018\u0010h\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010c\u001a\u00020\u0004J\u0018\u0010i\u001a\u00020#2\u0006\u0010j\u001a\u00020\u00042\u0006\u0010k\u001a\u00020lH\u0007J.\u0010m\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010n\u001a\u0004\u0018\u0001022\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010o\u001a\u0004\u0018\u000100J0\u0010p\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010n\u001a\u0004\u0018\u0001022\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010o\u001a\u0004\u0018\u000100H\u0002J$\u0010q\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010n\u001a\u0004\u0018\u0001022\b\u0010/\u001a\u0004\u0018\u000100J&\u0010r\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010n\u001a\u0004\u0018\u0001022\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001e\u0010s\u001a\u00020#2\u0006\u0010[\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0004J\u0006\u0010t\u001a\u00020#J\u0006\u0010u\u001a\u00020#J\u000e\u0010v\u001a\u00020#2\u0006\u0010w\u001a\u00020\\J\u001e\u0010x\u001a\u00020#2\u0006\u0010y\u001a\u00020\u00042\u0006\u0010z\u001a\u00020\\2\u0006\u0010{\u001a\u00020%J\u0006\u0010|\u001a\u00020#J\u000e\u0010}\u001a\u00020#2\u0006\u0010~\u001a\u00020%J\u0011\u0010\u001a\u00020#2\u0007\u0010\u0001\u001a\u00020\u0004H\u0002J\t\u0010\u0001\u001a\u00020#H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint$Companion;", "", "()V", "ACTION", "", "JSON_KEY_ACTIVITY", "JSON_KEY_TYPE", "MESSAGE_CURRENT_LOCATION", "getMESSAGE_CURRENT_LOCATION", "()Ljava/lang/String;", "setMESSAGE_CURRENT_LOCATION", "(Ljava/lang/String;)V", "MESSAGE_LOCATION_THREAD", "MESSAGE_NOTICE_AT", "MESSAGE_NOTICE_ATALLL", "MESSAGE_NOTICE_ATOTHER", "MESSAGE_NOTICE_ME", "MESSAGE_NOTICE_NONE", "MESSAGE_NOTICE_OTHER", "MESSAGE_TYPE_KEY", "MESSAGE_TYPE_TRANSFER", "", "REACTION_CURRENT_LOCATION", "getREACTION_CURRENT_LOCATION", "setREACTION_CURRENT_LOCATION", "REACTION_LOCATION_MAIN", "REACTION_LOCATION_THREAD", "REACTION_LOCATION_TOPIC_ROOT", "REACTION_LOCATION_TOPIC_THREAD", "TAG", "TYPE", "docDependency", "Lcom/ss/android/lark/dependency/IDocDependency;", "kotlin.jvm.PlatformType", "addToJoinGroupByGroupCard", "", "reasonIsEmpty", "", "createAtType", "hasAtSomebody", "hasAtAll", "hasAtMe", "hasAtSombody", "createMessageSendCommonParam", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "curP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "dragAudioMessagePlay", "getChatType", "isGroup", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getMessageTypeHitItem", "key", "hideAudioText", "isAuto", "joinGroupByGroupCard", "isInChat", "sendAsrFinalOnScreen", "sourceId", "sendAsrFinalResultEmpty", "sendAsrFinishThenCancel", "sendAsrFinishThenEdit", "sendAsrFirstOnScreen", "sendAsrReceiveEndResponse", "isSuccess", "sendAsrRecordingStart", "sendAsrRecordingStop", "sendAsrSendEndPacket", "sendAsrUserTouchButton", "sendAudio2TextError", "isAudio2Text", "errorMsg", "sendDeleteMessage", "sendDeleteMessageConfirm", "sendMessageAdminDeleteEvent", "chatId", "chatType", "sendMessageAdminRecallEvent", "sendMessageCompleteInScreenEvent", "hasMissingMessage", "loading", "syncMissSucc", "inScreen", "sendMessageCopy", "sendMessageReaction", "messageId", "messageType", "", "reactionType", "reactionSource", "reactionTime", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILcom/ss/android/lark/chat/entity/chat/Chat;)V", "sendMessageReactionImpl", "sendMessageRead", "userId", "atType", "isBot", "messageList", "", "sendMessageReadImpl", "sendMessageRecall", "msgType", "msgUpdateTime", "", "sendMessageReply", "p2pChatter", "parentMessage", "sendMessageReplyImpl", "sendMessageSend", "sendMessageSendImpl", "sendMessageUrlClick", "sendOneWayContactSystemMsgName", "sendOneWayContactSystemMsgSetting", "sendReadActivityAwardMessage", ShareHitPoint.f121869d, "sendRecordSent", "method", "duration", "recognized", "sendSystemContentNameClick", "sendTextBlocked", "isSecretChat", "sentExtraCardAnalyticsData", "analyticsDataJsonString", "showAudioText", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.n.d$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final String mo187522a(boolean z, boolean z2, boolean z3) {
            return (z2 || z3) ? z ? "me" : (!z2 || z || z3) ? z3 ? "atall" : "other" : "atother" : "none";
        }

        private Companion() {
        }

        /* renamed from: a */
        public final String mo187521a() {
            return MessageHitPoint.f135777b;
        }

        /* renamed from: a */
        public final void mo187535a(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            String str2 = "y";
            String str3 = z ? str2 : C64034n.f161683a;
            String str4 = z2 ? str2 : C64034n.f161683a;
            String str5 = z3 ? str2 : C64034n.f161683a;
            if (!z4) {
                str2 = C64034n.f161683a;
            }
            Statistics.sendEvent("lark_chat_message_track", new JSONObject().put(ShareHitPoint.f121869d, str).put("has_miss", str3).put("sync_miss_success", str5).put("miss_in_screen", str2).put("loading", str4));
        }

        /* renamed from: a */
        public final void mo187536a(List<? extends Message> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "messageList");
            Intrinsics.checkParameterIsNotNull(str, "userId");
            for (Message message : list) {
                mo187528a(message, str);
            }
        }

        /* renamed from: a */
        public final void mo187528a(Message message, String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC54963b(message, str));
        }

        /* renamed from: a */
        public final void mo187531a(String str, Integer num, String str2, String str3, Integer num2, int i, Chat chat) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC54962a(str, num, str2, str3, num2, i, chat));
        }

        /* renamed from: a */
        public final void mo187533a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "messageType");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Intrinsics.checkParameterIsNotNull(str3, "messageId");
            Statistics.sendEvent("message_url_click", new JSONObject().put("message_type", str).put("chat_type", str2).put("message_id", C57859q.m224565a(str3)));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187537a(boolean z) {
            Statistics.sendEvent("apply_to_join_group_by_group_card", new JSONObject().put("is_note", z ? C64034n.f161683a : "y"));
        }

        /* renamed from: a */
        public final void mo187530a(String str, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "method");
            StringBuilder sb = new StringBuilder();
            sb.append("sendRecordSent:");
            sb.append(z);
            sb.append('/');
            sb.append(str);
            sb.append('/');
            int i2 = i / 1000;
            sb.append(i2);
            Log.m165379d("MessageHitPoint", sb.toString());
            Statistics.sendEvent("audio_send", new JSONObject().put("way", str).put("audio_time", i2).put("is_convert_text", z ? "y" : C64034n.f161683a));
        }

        /* renamed from: a */
        public final void mo187532a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Statistics.sendEvent("message_admin_recall", new JSONObject().put("chat_id", str).put("chat_type", str2));
        }

        /* renamed from: a */
        public final void mo187538a(boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMsg");
            Statistics.sendEvent("audio_convert_server_error", new JSONObject().put("page", z ? "text" : "audio_and_text").put("error_msg", str));
        }

        /* renamed from: a */
        public final void mo187534a(String str, boolean z) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            ar m = b2.mo134585m();
            Intrinsics.checkExpressionValueIsNotNull(m, "ChatModuleInstanceHolder…ncy().wschannelDependency");
            IMConstants.NetworkLevel a2 = m.mo134481a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…ependency.curNetWorkLevel");
            Statistics.sendEvent("asl_asr_receive_end_response_dev", new JSONObject().put("user_id", a).put("source_id", str).put("is_success", z ? 1 : 0).put("net_status", a2.getValue()).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: b */
        public final void mo187539b() {
            Statistics.sendEvent("message_delete");
        }

        /* renamed from: c */
        public final void mo187548c() {
            Statistics.sendEvent("message_delete_confirm");
        }

        /* renamed from: e */
        public final void mo187551e() {
            Statistics.sendEvent("join_or_leave_group_name_click");
        }

        @JvmStatic
        /* renamed from: f */
        public final void mo187553f() {
            Statistics.sendEvent("audio_convert_to_text");
        }

        @JvmStatic
        /* renamed from: g */
        public final void mo187555g() {
            Statistics.sendEvent("audio_play_drag");
        }

        /* renamed from: h */
        public final void mo187557h() {
            Statistics.sendEvent("chat_systemmessage_beadded_name_click");
        }

        /* renamed from: i */
        public final void mo187559i() {
            Statistics.sendEvent("chat_systemmessage_beadded_settings_click");
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.d$a$b */
        public static final class RunnableC54963b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f135788a;

            /* renamed from: b */
            final /* synthetic */ String f135789b;

            RunnableC54963b(Message message, String str) {
                this.f135788a = message;
                this.f135789b = str;
            }

            public final void run() {
                MessageHitPoint.f135779d.mo187542b(this.f135788a, this.f135789b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.d$a$c */
        static final class RunnableC54964c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Chat f135790a;

            /* renamed from: b */
            final /* synthetic */ ChatChatter f135791b;

            /* renamed from: c */
            final /* synthetic */ Message f135792c;

            /* renamed from: d */
            final /* synthetic */ Message f135793d;

            RunnableC54964c(Chat chat, ChatChatter chatChatter, Message message, Message message2) {
                this.f135790a = chat;
                this.f135791b = chatChatter;
                this.f135792c = message;
                this.f135793d = message2;
            }

            public final void run() {
                MessageHitPoint.f135779d.mo187541b(this.f135790a, this.f135791b, this.f135792c, this.f135793d);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.d$a$d */
        static final class RunnableC54965d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Chat f135794a;

            /* renamed from: b */
            final /* synthetic */ ChatChatter f135795b;

            /* renamed from: c */
            final /* synthetic */ Message f135796c;

            RunnableC54965d(Chat chat, ChatChatter chatChatter, Message message) {
                this.f135794a = chat;
                this.f135795b = chatChatter;
                this.f135796c = message;
            }

            public final void run() {
                MessageHitPoint.f135779d.mo187540b(this.f135794a, this.f135795b, this.f135796c);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.d$a$a */
        public static final class RunnableC54962a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f135781a;

            /* renamed from: b */
            final /* synthetic */ Integer f135782b;

            /* renamed from: c */
            final /* synthetic */ String f135783c;

            /* renamed from: d */
            final /* synthetic */ String f135784d;

            /* renamed from: e */
            final /* synthetic */ Integer f135785e;

            /* renamed from: f */
            final /* synthetic */ int f135786f;

            /* renamed from: g */
            final /* synthetic */ Chat f135787g;

            RunnableC54962a(String str, Integer num, String str2, String str3, Integer num2, int i, Chat chat) {
                this.f135781a = str;
                this.f135782b = num;
                this.f135783c = str2;
                this.f135784d = str3;
                this.f135785e = num2;
                this.f135786f = i;
                this.f135787g = chat;
            }

            public final void run() {
                MessageHitPoint.f135779d.mo187544b(this.f135781a, this.f135782b, this.f135783c, this.f135784d, this.f135785e, this.f135786f, this.f135787g);
            }
        }

        /* renamed from: d */
        public final void mo187549d() {
            Statistics.sendEvent("message_copy", new JSONObject().put("message_type", "text"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187529a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MessageHitPoint.f135776a = str;
        }

        /* renamed from: b */
        public final void mo187543b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            MessageHitPoint.f135777b = str;
        }

        @JvmStatic
        /* renamed from: c */
        public final String mo187547c(String str) {
            String str2 = MessageHitPoint.f135778c.get(str);
            if (str2 == null) {
                return "other";
            }
            return str2;
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo187546b(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = C64034n.f161683a;
            } else {
                str = "y";
            }
            Statistics.sendEvent("audio_hide_text", jSONObject.put("is_auto", str));
        }

        /* renamed from: a */
        public final void mo187523a(int i) {
            Statistics.sendEvent("read_activity_award_message", new JSONObject().put(ShareHitPoint.f121869d, i));
        }

        /* renamed from: j */
        public final void mo187561j(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            Statistics.sendEvent("asl_asr_final_result_empty_dev", new JSONObject().put("user_id", N.mo134394a()).put("source_id", str).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: k */
        public final void mo187562k(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            Statistics.sendEvent("asl_asr_finish_then_cancel_dev", new JSONObject().put("user_id", N.mo134394a()).put("source_id", str));
        }

        /* renamed from: l */
        public final void mo187563l(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            Statistics.sendEvent("asl_asr_finish_then_edit_dev", new JSONObject().put("user_id", N.mo134394a()).put("source_id", str));
        }

        /* renamed from: m */
        private final void m213277m(String str) {
            try {
                com.alibaba.fastjson.JSONObject a = C57878s.m224589a(str);
                if (a != null) {
                    Integer integer = a.getInteger(ShareHitPoint.f121869d);
                    String string = a.getString("activity");
                    if (integer != null && !TextUtils.isEmpty(string)) {
                        mo187523a(integer.intValue());
                    }
                }
            } catch (JSONException e) {
                Log.m165397w("MessageHitPoint", "send extra card analytics data error, " + e.getMessage());
            }
        }

        /* renamed from: d */
        public final void mo187550d(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            ar m = b2.mo134585m();
            Intrinsics.checkExpressionValueIsNotNull(m, "ChatModuleInstanceHolder…ncy().wschannelDependency");
            IMConstants.NetworkLevel a2 = m.mo134481a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…ependency.curNetWorkLevel");
            Statistics.sendEvent("asl_asr_user_touch_button", new JSONObject().put("user_id", a).put("source_id", str).put("net_status", a2.getValue()).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: e */
        public final void mo187552e(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            ar m = b2.mo134585m();
            Intrinsics.checkExpressionValueIsNotNull(m, "ChatModuleInstanceHolder…ncy().wschannelDependency");
            IMConstants.NetworkLevel a2 = m.mo134481a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…ependency.curNetWorkLevel");
            Statistics.sendEvent("asl_asr_recording_start_dev", new JSONObject().put("user_id", a).put("source_id", str).put("net_status", a2.getValue()).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: f */
        public final void mo187554f(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            ar m = b2.mo134585m();
            Intrinsics.checkExpressionValueIsNotNull(m, "ChatModuleInstanceHolder…ncy().wschannelDependency");
            IMConstants.NetworkLevel a2 = m.mo134481a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…ependency.curNetWorkLevel");
            Statistics.sendEvent("asl_asr_first_partial_on_screen_dev", new JSONObject().put("user_id", a).put("source_id", str).put("net_status", a2.getValue()).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: g */
        public final void mo187556g(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            ar m = b2.mo134585m();
            Intrinsics.checkExpressionValueIsNotNull(m, "ChatModuleInstanceHolder…ncy().wschannelDependency");
            IMConstants.NetworkLevel a2 = m.mo134481a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…ependency.curNetWorkLevel");
            Statistics.sendEvent("asl_asr_recording_stop_dev", new JSONObject().put("user_id", a).put("source_id", str).put("net_status", a2.getValue()).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: h */
        public final void mo187558h(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            ar m = b2.mo134585m();
            Intrinsics.checkExpressionValueIsNotNull(m, "ChatModuleInstanceHolder…ncy().wschannelDependency");
            IMConstants.NetworkLevel a2 = m.mo134481a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…ependency.curNetWorkLevel");
            Statistics.sendEvent("asl_asr_send_end_packet_dev", new JSONObject().put("user_id", a).put("source_id", str).put("net_status", a2.getValue()).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: i */
        public final void mo187560i(String str) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            ar m = b2.mo134585m();
            Intrinsics.checkExpressionValueIsNotNull(m, "ChatModuleInstanceHolder…ncy().wschannelDependency");
            IMConstants.NetworkLevel a2 = m.mo134481a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatModuleInstanceHolder…ependency.curNetWorkLevel");
            Statistics.sendEvent("asl_asr_final_result_on_screen_dev", new JSONObject().put("user_id", a).put("source_id", str).put("net_status", a2.getValue()).put("timestamp", System.currentTimeMillis()));
        }

        /* renamed from: b */
        public final void mo187545b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            Statistics.sendEvent("message_admin_delete", new JSONObject().put("chat_id", str).put("chat_type", str2));
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[SYNTHETIC, Splitter:B:23:0x0074] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo187542b(com.ss.android.lark.chat.entity.message.Message r9, java.lang.String r10) {
            /*
            // Method dump skipped, instructions count: 406
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.statistics.message.MessageHitPoint.Companion.mo187542b(com.ss.android.lark.chat.entity.message.Message, java.lang.String):void");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187527a(Chat chat, boolean z) {
            String str;
            String str2;
            if (chat == null) {
                str = "";
            } else if (chat.isCrossTenant()) {
                str = "external";
            } else if (chat.isPublic()) {
                str = "public";
            } else {
                str = "private";
            }
            JSONObject put = new JSONObject().put(ShareHitPoint.f121869d, str);
            if (z) {
                str2 = "enterjoinedgroup";
            } else {
                str2 = "joinnewgroup";
            }
            Statistics.sendEvent("join_group_by_group_card", put.put("action", str2));
        }

        /* renamed from: a */
        public final void mo187525a(Chat chat, ChatChatter chatChatter, Message message) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC54965d(chat, chatChatter, message));
        }

        /* renamed from: b */
        public final void mo187540b(Chat chat, ChatChatter chatChatter, Message message) {
            boolean z;
            String str;
            String b;
            if (message != null) {
                if (chat == null) {
                    chat = C32821b.m126120a().mo121056e(message.getChatId());
                }
                if (chat != null) {
                    Conf.DocInfo aVar = null;
                    if (chatChatter == null) {
                        if (chat.getChatMode() != Chat.ChatMode.THREAD_V2 && chat.getType() == Chat.Type.P2P) {
                            chatChatter = C32835d.m126323c().m126324c(chat.getId(), chat.getP2pChatterId());
                        } else {
                            chatChatter = null;
                        }
                    }
                    if (message.getType() == Message.Type.TEXT) {
                        String c = C34352r.m133236c(message);
                        MessageHitUtils.Companion aVar2 = MessageHitUtils.f135842b;
                        Intrinsics.checkExpressionValueIsNotNull(c, "textContent");
                        aVar = aVar2.mo187636a(c);
                    }
                    MessageCommonParam a = m213276a(chat, message, chatChatter);
                    MessageSentParam.Builder aVar3 = new MessageSentParam.Builder();
                    if (a.mo187578k() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    MessageSentParam.Builder g = aVar3.mo187632g(z);
                    String str2 = "";
                    if (aVar == null || (str = aVar.mo187516a()) == null) {
                        str = str2;
                    }
                    MessageSentParam.Builder i = g.mo187634i(str);
                    if (!(aVar == null || (b = aVar.mo187517b()) == null)) {
                        str2 = b;
                    }
                    JSONObject a2 = i.mo187633h(str2).mo187631a(a).mo187624o().mo187568a();
                    Log.m165379d("MessageHitPoint", "message sent json = " + a2);
                    Statistics.sendEvent("message_sent", a2);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d1, code lost:
            if (r14 != false) goto L_0x00d5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00c9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final com.ss.android.lark.statistics.message.MessageHitPoint.MessageCommonParam m213276a(com.ss.android.lark.chat.entity.chat.Chat r12, com.ss.android.lark.chat.entity.message.Message r13, com.ss.android.lark.chat.entity.chatter.ChatChatter r14) {
            /*
            // Method dump skipped, instructions count: 314
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.statistics.message.MessageHitPoint.Companion.m213276a(com.ss.android.lark.chat.entity.chat.Chat, com.ss.android.lark.chat.entity.message.Message, com.ss.android.lark.chat.entity.chatter.ChatChatter):com.ss.android.lark.statistics.n.d$b");
        }

        /* renamed from: b */
        public final void mo187541b(Chat chat, ChatChatter chatChatter, Message message, Message message2) {
            String str;
            if (message != null && message2 != null) {
                if (chat == null) {
                    chat = C32821b.m126120a().mo121056e(message.getChatId());
                }
                if (chat != null) {
                    if (chatChatter == null) {
                        if (chat.getChatMode() != Chat.ChatMode.THREAD_V2 && chat.getType() == Chat.Type.P2P) {
                            chatChatter = C32835d.m126323c().m126324c(chat.getId(), chat.getP2pChatterId());
                        } else {
                            chatChatter = null;
                        }
                    }
                    if (message.getPosition() == message2.getPosition()) {
                        str = "first";
                    } else {
                        str = "other";
                    }
                    Companion aVar = this;
                    String c = aVar.mo187547c(message2.getType().toString());
                    MessageReplyParam.Builder aVar2 = new MessageReplyParam.Builder();
                    String id = message2.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "parentMessage.id");
                    JSONObject a = aVar2.mo187627h(id).mo187625a(message.getCreateTime()).mo187628i(str).mo187629j(c).mo187626a(aVar.m213276a(chat, message, chatChatter)).mo187624o().mo187568a();
                    Log.m165379d("MessageHitPoint", "message reply json = " + a);
                    Statistics.sendEvent("message_reply", a);
                }
            }
        }

        /* renamed from: a */
        public final void mo187526a(Chat chat, ChatChatter chatChatter, Message message, Message message2) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC54964c(chat, chatChatter, message, message2));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187524a(int i, String str, Chat chat, String str2, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "atType");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str2, "messageId");
            try {
                Statistics.sendEvent("message_read", new JSONObject().put("message_type", i).put("chat_type", chat.getType()).put("notice", str).put("chat_id", chat.getId()).put("is_mute", ChatTypeStateKeeper.f135671f.mo187411b()).put("is_chatbox", ChatTypeStateKeeper.f135671f.mo187413c()).put("message_id", str2).put("is_secret_chat", chat.isSecret()).put("is_bot_chat", z).put("is_meeting_chat", chat.isMeeting()));
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo187544b(String str, Integer num, String str2, String str3, Integer num2, int i, Chat chat) {
            boolean z;
            Ref.IntRef intRef;
            Ref.ObjectRef objectRef;
            boolean z2;
            if (str == null) {
                return;
            }
            if (str2 != null || chat != null) {
                if (chat == null) {
                    chat = C32821b.m126120a().mo121056e(str2);
                }
                if (chat != null) {
                    ChatChatter chatChatter = null;
                    if (chat.getChatMode() != Chat.ChatMode.THREAD_V2 && chat.getType() == Chat.Type.P2P) {
                        chatChatter = C32835d.m126323c().m126324c(chat.getId(), chat.getP2pChatterId());
                    }
                    if (chat.isP2PChat()) {
                        if (chatChatter != null) {
                            z2 = chatChatter.isBot();
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            z = true;
                            intRef = new Ref.IntRef();
                            objectRef = new Ref.ObjectRef();
                            if (num2 != null && num2.intValue() == 0) {
                                objectRef.element = "recent_used";
                                intRef.element = 0;
                            } else if (num2 != null && num2.intValue() == 5) {
                                objectRef.element = "quick_append";
                                intRef.element = -1;
                            } else if ((num2 != null && num2.intValue() == 2) || (num2 != null && num2.intValue() == 1)) {
                                objectRef.element = "reaction_list";
                                intRef.element = C54984a.m213521a(str3);
                            } else if ((num2 != null && num2.intValue() == 3) || (num2 != null && num2.intValue() == 4)) {
                                objectRef.element = "reaction_button_click";
                                intRef.element = -1;
                            } else {
                                objectRef.element = "other";
                                intRef.element = -1;
                            }
                            Conf.Param.Companion aVar = Conf.Param.f135775a;
                            JSONObject put = new JSONObject().put("message_aim_type", num).put("reaction_type", str3);
                            Chat.Type type = chat.getType();
                            Intrinsics.checkExpressionValueIsNotNull(type, "curChat.type");
                            Statistics.sendEvent("message_reaction", put.put("chat_type", type.getNumber()).put("location", MessageHitPoint.f135779d.mo187521a()).put("create_type", objectRef.element).put("reaction_time", i).put("reaction_page", intRef.element).put("chat_id", chat.getId()).put("message_id", str).put("is_secret_chat", chat.isSecret()).put("is_meeting_chat", chat.isMeeting()).put("is_bot_chat", z));
                        }
                    }
                    z = false;
                    intRef = new Ref.IntRef();
                    objectRef = new Ref.ObjectRef();
                    if (num2 != null) {
                        objectRef.element = "recent_used";
                        intRef.element = 0;
                        Conf.Param.Companion aVar2 = Conf.Param.f135775a;
                        JSONObject put2 = new JSONObject().put("message_aim_type", num).put("reaction_type", str3);
                        Chat.Type type2 = chat.getType();
                        Intrinsics.checkExpressionValueIsNotNull(type2, "curChat.type");
                        Statistics.sendEvent("message_reaction", put2.put("chat_type", type2.getNumber()).put("location", MessageHitPoint.f135779d.mo187521a()).put("create_type", objectRef.element).put("reaction_time", i).put("reaction_page", intRef.element).put("chat_id", chat.getId()).put("message_id", str).put("is_secret_chat", chat.isSecret()).put("is_meeting_chat", chat.isMeeting()).put("is_bot_chat", z));
                    }
                    if (num2 != null) {
                        objectRef.element = "quick_append";
                        intRef.element = -1;
                        Conf.Param.Companion aVar22 = Conf.Param.f135775a;
                        JSONObject put22 = new JSONObject().put("message_aim_type", num).put("reaction_type", str3);
                        Chat.Type type22 = chat.getType();
                        Intrinsics.checkExpressionValueIsNotNull(type22, "curChat.type");
                        Statistics.sendEvent("message_reaction", put22.put("chat_type", type22.getNumber()).put("location", MessageHitPoint.f135779d.mo187521a()).put("create_type", objectRef.element).put("reaction_time", i).put("reaction_page", intRef.element).put("chat_id", chat.getId()).put("message_id", str).put("is_secret_chat", chat.isSecret()).put("is_meeting_chat", chat.isMeeting()).put("is_bot_chat", z));
                    }
                    if (num2 != null) {
                        objectRef.element = "reaction_list";
                        intRef.element = C54984a.m213521a(str3);
                        Conf.Param.Companion aVar222 = Conf.Param.f135775a;
                        JSONObject put222 = new JSONObject().put("message_aim_type", num).put("reaction_type", str3);
                        Chat.Type type222 = chat.getType();
                        Intrinsics.checkExpressionValueIsNotNull(type222, "curChat.type");
                        Statistics.sendEvent("message_reaction", put222.put("chat_type", type222.getNumber()).put("location", MessageHitPoint.f135779d.mo187521a()).put("create_type", objectRef.element).put("reaction_time", i).put("reaction_page", intRef.element).put("chat_id", chat.getId()).put("message_id", str).put("is_secret_chat", chat.isSecret()).put("is_meeting_chat", chat.isMeeting()).put("is_bot_chat", z));
                    }
                    objectRef.element = "reaction_list";
                    intRef.element = C54984a.m213521a(str3);
                    Conf.Param.Companion aVar2222 = Conf.Param.f135775a;
                    JSONObject put2222 = new JSONObject().put("message_aim_type", num).put("reaction_type", str3);
                    Chat.Type type2222 = chat.getType();
                    Intrinsics.checkExpressionValueIsNotNull(type2222, "curChat.type");
                    Statistics.sendEvent("message_reaction", put2222.put("chat_type", type2222.getNumber()).put("location", MessageHitPoint.f135779d.mo187521a()).put("create_type", objectRef.element).put("reaction_time", i).put("reaction_page", intRef.element).put("chat_id", chat.getId()).put("message_id", str).put("is_secret_chat", chat.isSecret()).put("is_meeting_chat", chat.isMeeting()).put("is_bot_chat", z));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\"B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0002\u0010\u0019J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001b¨\u0006#"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageReplyParam;", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam;", "replyMessageId", "", "replyMessageTime", "", "replyOrder", "messageAimType", "chatType", "", "chatId", "location", "notice", "messageLength", "cid", "emojiType", "", "emojiCount", "richTextImageCount", "docLinkCount", "isSecretChat", "", "messageType", "isBotChat", "isMeetingChat", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IIIZIZZ)V", "getMessageAimType", "()Ljava/lang/String;", "getReplyMessageId", "getReplyMessageTime", "()J", "getReplyOrder", "toJson", "Lorg/json/JSONObject;", "Builder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.n.d$c */
    public static final class MessageReplyParam extends MessageCommonParam {

        /* renamed from: a */
        private final String f135825a;

        /* renamed from: b */
        private final long f135826b;

        /* renamed from: c */
        private final String f135827c;

        /* renamed from: d */
        private final String f135828d;

        @Override // com.ss.android.lark.statistics.message.MessageHitPoint.MessageCommonParam
        /* renamed from: a */
        public JSONObject mo187568a() {
            JSONObject put = super.mo187568a().put("reply_message_id", this.f135825a).put("reply_message_time", this.f135826b).put("reply_order", this.f135827c).put("message_aim_type", this.f135828d);
            Intrinsics.checkExpressionValueIsNotNull(put, "super.toJson().put(REPLY…AIM_TYPE, messageAimType)");
            return put;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageReplyParam$Builder;", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam$Builder;", "()V", "messageAimType", "", "getMessageAimType", "()Ljava/lang/String;", "setMessageAimType", "(Ljava/lang/String;)V", "replyMessageId", "getReplyMessageId", "setReplyMessageId", "replyMessageTime", "", "getReplyMessageTime", "()J", "setReplyMessageTime", "(J)V", "replyOrder", "getReplyOrder", "setReplyOrder", "build", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageReplyParam;", "commonParam", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.d$c$a */
        public static final class Builder extends MessageCommonParam.Builder {

            /* renamed from: a */
            private String f135829a = "";

            /* renamed from: b */
            private long f135830b;

            /* renamed from: c */
            private String f135831c = "";

            /* renamed from: d */
            private String f135832d = "";

            /* renamed from: p */
            public MessageReplyParam mo187624o() {
                return new MessageReplyParam(this.f135829a, this.f135830b, this.f135831c, this.f135832d, mo187583a(), mo187589b(), mo187593c(), mo187598d(), mo187601e(), mo187607f(), mo187611g(), mo187612h(), mo187614i(), mo187616j(), mo187619k(), mo187620l(), mo187622m(), mo187623n());
            }

            /* renamed from: a */
            public final Builder mo187625a(long j) {
                Builder aVar = this;
                aVar.f135830b = j;
                return aVar;
            }

            /* renamed from: h */
            public final Builder mo187627h(String str) {
                Intrinsics.checkParameterIsNotNull(str, "replyMessageId");
                Builder aVar = this;
                aVar.f135829a = str;
                return aVar;
            }

            /* renamed from: i */
            public final Builder mo187628i(String str) {
                Intrinsics.checkParameterIsNotNull(str, "replyOrder");
                Builder aVar = this;
                aVar.f135831c = str;
                return aVar;
            }

            /* renamed from: j */
            public final Builder mo187629j(String str) {
                Intrinsics.checkParameterIsNotNull(str, "messageAimType");
                Builder aVar = this;
                aVar.f135832d = str;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187626a(MessageCommonParam bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "commonParam");
                Builder aVar = this;
                aVar.mo187584a(bVar.mo187569b());
                aVar.mo187585a(bVar.mo187570c());
                aVar.mo187591b(bVar.mo187571d());
                aVar.mo187595c(bVar.mo187572e());
                aVar.mo187590b(bVar.mo187573f());
                aVar.mo187600d(bVar.mo187574g());
                aVar.mo187586a(bVar.mo187575h());
                aVar.mo187594c(bVar.mo187576i());
                aVar.mo187599d(bVar.mo187577j());
                aVar.mo187604e(bVar.mo187578k());
                aVar.mo187587a(bVar.mo187579l());
                aVar.mo187608f(bVar.mo187580m());
                aVar.mo187592b(bVar.mo187581n());
                aVar.mo187596c(bVar.mo187582o());
                return aVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MessageReplyParam(String str, long j, String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, List<String> list, int i3, int i4, int i5, boolean z, int i6, boolean z2, boolean z3) {
            super(i, str4, str5, str6, i2, str7, list, i3, i4, i5, z, i6, z2, z3);
            Intrinsics.checkParameterIsNotNull(str, "replyMessageId");
            Intrinsics.checkParameterIsNotNull(str2, "replyOrder");
            Intrinsics.checkParameterIsNotNull(str3, "messageAimType");
            Intrinsics.checkParameterIsNotNull(str4, "chatId");
            Intrinsics.checkParameterIsNotNull(str5, "location");
            Intrinsics.checkParameterIsNotNull(str6, "notice");
            Intrinsics.checkParameterIsNotNull(str7, "cid");
            Intrinsics.checkParameterIsNotNull(list, "emojiType");
            this.f135825a = str;
            this.f135826b = j;
            this.f135827c = str2;
            this.f135828d = str3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageSentParam;", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam;", "hasDocLink", "", "fileType", "", "fileId", "chatType", "", "chatId", "location", "notice", "messageLength", "cid", "emojiType", "", "emojiCount", "richTextImageCount", "docLinkCount", "isSecretChat", "messageType", "isBotChat", "isMeetingChat", "(ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IIIZIZZ)V", "getFileId", "()Ljava/lang/String;", "getFileType", "getHasDocLink", "()Z", "toJson", "Lorg/json/JSONObject;", "Builder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.n.d$d */
    public static final class MessageSentParam extends MessageCommonParam {

        /* renamed from: a */
        private final boolean f135833a;

        /* renamed from: b */
        private final String f135834b;

        /* renamed from: c */
        private final String f135835c;

        @Override // com.ss.android.lark.statistics.message.MessageHitPoint.MessageCommonParam
        /* renamed from: a */
        public JSONObject mo187568a() {
            JSONObject put = super.mo187568a().put("is_has_docslink", this.f135833a).put("file_type", this.f135834b).put("file_id", C57859q.m224565a(this.f135835c));
            Intrinsics.checkExpressionValueIsNotNull(put, "super.toJson().put(IS_HA…ils.uidEncryptor(fileId))");
            return put;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageSentParam$Builder;", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam$Builder;", "()V", "fileId", "", "getFileId", "()Ljava/lang/String;", "setFileId", "(Ljava/lang/String;)V", "fileType", "getFileType", "setFileType", "hasDocLink", "", "getHasDocLink", "()Z", "setHasDocLink", "(Z)V", "build", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageSentParam;", "commonParam", "Lcom/ss/android/lark/statistics/message/MessageHitPoint$MessageCommonParam;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.n.d$d$a */
        public static final class Builder extends MessageCommonParam.Builder {

            /* renamed from: a */
            private boolean f135836a;

            /* renamed from: b */
            private String f135837b = "";

            /* renamed from: c */
            private String f135838c = "";

            /* renamed from: p */
            public MessageSentParam mo187624o() {
                return new MessageSentParam(this.f135836a, this.f135837b, this.f135838c, mo187583a(), mo187589b(), mo187593c(), mo187598d(), mo187601e(), mo187607f(), mo187611g(), mo187612h(), mo187614i(), mo187616j(), mo187619k(), mo187620l(), mo187622m(), mo187623n());
            }

            /* renamed from: g */
            public final Builder mo187632g(boolean z) {
                Builder aVar = this;
                aVar.f135836a = z;
                return aVar;
            }

            /* renamed from: h */
            public final Builder mo187633h(String str) {
                Intrinsics.checkParameterIsNotNull(str, "fileType");
                Builder aVar = this;
                aVar.f135837b = str;
                return aVar;
            }

            /* renamed from: i */
            public final Builder mo187634i(String str) {
                Intrinsics.checkParameterIsNotNull(str, "fileId");
                Builder aVar = this;
                aVar.f135838c = str;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187631a(MessageCommonParam bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "commonParam");
                Builder aVar = this;
                aVar.mo187584a(bVar.mo187569b());
                aVar.mo187585a(bVar.mo187570c());
                aVar.mo187591b(bVar.mo187571d());
                aVar.mo187595c(bVar.mo187572e());
                aVar.mo187590b(bVar.mo187573f());
                aVar.mo187600d(bVar.mo187574g());
                aVar.mo187586a(bVar.mo187575h());
                aVar.mo187594c(bVar.mo187576i());
                aVar.mo187599d(bVar.mo187577j());
                aVar.mo187604e(bVar.mo187578k());
                aVar.mo187587a(bVar.mo187579l());
                aVar.mo187608f(bVar.mo187580m());
                aVar.mo187592b(bVar.mo187581n());
                aVar.mo187596c(bVar.mo187582o());
                return aVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MessageSentParam(boolean z, String str, String str2, int i, String str3, String str4, String str5, int i2, String str6, List<String> list, int i3, int i4, int i5, boolean z2, int i6, boolean z3, boolean z4) {
            super(i, str3, str4, str5, i2, str6, list, i3, i4, i5, z2, i6, z3, z4);
            Intrinsics.checkParameterIsNotNull(str, "fileType");
            Intrinsics.checkParameterIsNotNull(str2, "fileId");
            Intrinsics.checkParameterIsNotNull(str3, "chatId");
            Intrinsics.checkParameterIsNotNull(str4, "location");
            Intrinsics.checkParameterIsNotNull(str5, "notice");
            Intrinsics.checkParameterIsNotNull(str6, "cid");
            Intrinsics.checkParameterIsNotNull(list, "emojiType");
            this.f135833a = z;
            this.f135834b = str;
            this.f135835c = str2;
        }
    }

    static {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        f135780e = b.mo134513L();
        HashMap hashMap = new HashMap();
        f135778c = hashMap;
        hashMap.put("POST", "richtext");
        f135778c.put("FILE", "file");
        f135778c.put("TEXT", "text");
        f135778c.put("IMAGE", "image");
        f135778c.put("AUDIO", "voice");
        f135778c.put("TEXT_IMAGE", "text_image");
        f135778c.put("SYSTEM", "system");
        f135778c.put("MEDIA", "video");
        f135778c.put("EMAIL", "mail");
        f135778c.put("SHARE_GROUP_CHAT", "share_group_chat");
        f135778c.put("STICKER", "sticker");
        f135778c.put("SHARE_USER_CARD", "share_user_card");
    }
}
