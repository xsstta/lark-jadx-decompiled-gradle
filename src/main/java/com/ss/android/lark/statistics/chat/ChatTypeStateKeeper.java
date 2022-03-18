package com.ss.android.lark.statistics.chat;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper;", "", "()V", "Companion", "EnterChatParams", "Key", "Position", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.chat.f */
public final class ChatTypeStateKeeper {

    /* renamed from: a */
    public static String f135666a = "single";

    /* renamed from: b */
    public static boolean f135667b = false;

    /* renamed from: c */
    public static boolean f135668c = false;

    /* renamed from: d */
    public static final String f135669d = f135669d;

    /* renamed from: e */
    public static final String f135670e = f135670e;

    /* renamed from: f */
    public static final Companion f135671f = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bw\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$EnterChatParams;", "", "builder", "Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$EnterChatParams$Builder;", "(Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$EnterChatParams$Builder;)V", "chatId", "", "isRemind", "", "isInChatBox", "isMeeting", "isTopic", "isGroupChat", "isBotChat", "isOldestUnread", "isFromNotification", "isSecret", "messageId", "from", "threadId", "(Ljava/lang/String;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getFrom", "()Z", "getMessageId", "getThreadId", "Builder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.chat.f$b */
    public static final class EnterChatParams {

        /* renamed from: a */
        private final String f135672a;

        /* renamed from: b */
        private final boolean f135673b;

        /* renamed from: c */
        private final boolean f135674c;

        /* renamed from: d */
        private final boolean f135675d;

        /* renamed from: e */
        private final boolean f135676e;

        /* renamed from: f */
        private final boolean f135677f;

        /* renamed from: g */
        private final boolean f135678g;

        /* renamed from: h */
        private final boolean f135679h;

        /* renamed from: i */
        private final boolean f135680i;

        /* renamed from: j */
        private final boolean f135681j;

        /* renamed from: k */
        private final String f135682k;

        /* renamed from: l */
        private final String f135683l;

        /* renamed from: m */
        private final String f135684m;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010'\u001a\u00020(J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006)"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$EnterChatParams$Builder;", "", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "from", "getFrom", "setFrom", "isBotChat", "", "()Z", "setBotChat", "(Z)V", "isFromNotification", "setFromNotification", "isGroupChat", "setGroupChat", "isInChatBox", "setInChatBox", "isMeeting", "setMeeting", "isOldestUnread", "setOldestUnread", "isRemind", "setRemind", "isSecret", "setSecret", "isTopic", "setTopic", "messageId", "getMessageId", "setMessageId", "threadId", "getThreadId", "setThreadId", "build", "Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$EnterChatParams;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.statistics.chat.f$b$a */
        public static final class Builder {

            /* renamed from: a */
            private String f135685a = "";

            /* renamed from: b */
            private boolean f135686b;

            /* renamed from: c */
            private boolean f135687c;

            /* renamed from: d */
            private boolean f135688d;

            /* renamed from: e */
            private boolean f135689e;

            /* renamed from: f */
            private boolean f135690f;

            /* renamed from: g */
            private boolean f135691g;

            /* renamed from: h */
            private boolean f135692h;

            /* renamed from: i */
            private boolean f135693i;

            /* renamed from: j */
            private boolean f135694j;

            /* renamed from: k */
            private String f135695k = "";

            /* renamed from: l */
            private String f135696l = "";

            /* renamed from: m */
            private String f135697m = "";

            /* renamed from: a */
            public final String mo187430a() {
                return this.f135685a;
            }

            /* renamed from: b */
            public final boolean mo187433b() {
                return this.f135686b;
            }

            /* renamed from: c */
            public final boolean mo187436c() {
                return this.f135687c;
            }

            /* renamed from: d */
            public final boolean mo187438d() {
                return this.f135688d;
            }

            /* renamed from: e */
            public final boolean mo187440e() {
                return this.f135689e;
            }

            /* renamed from: f */
            public final boolean mo187442f() {
                return this.f135690f;
            }

            /* renamed from: g */
            public final boolean mo187444g() {
                return this.f135691g;
            }

            /* renamed from: h */
            public final boolean mo187445h() {
                return this.f135692h;
            }

            /* renamed from: i */
            public final boolean mo187446i() {
                return this.f135693i;
            }

            /* renamed from: j */
            public final boolean mo187447j() {
                return this.f135694j;
            }

            /* renamed from: k */
            public final String mo187448k() {
                return this.f135695k;
            }

            /* renamed from: l */
            public final String mo187449l() {
                return this.f135696l;
            }

            /* renamed from: m */
            public final String mo187450m() {
                return this.f135697m;
            }

            /* renamed from: n */
            public final EnterChatParams mo187451n() {
                return new EnterChatParams(this);
            }

            /* renamed from: a */
            public final Builder mo187428a(String str) {
                Builder aVar = this;
                aVar.f135685a = str;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo187431b(String str) {
                Builder aVar = this;
                aVar.f135696l = str;
                return aVar;
            }

            /* renamed from: c */
            public final Builder mo187434c(String str) {
                Builder aVar = this;
                aVar.f135697m = str;
                return aVar;
            }

            /* renamed from: d */
            public final Builder mo187437d(boolean z) {
                Builder aVar = this;
                aVar.f135690f = z;
                return aVar;
            }

            /* renamed from: e */
            public final Builder mo187439e(boolean z) {
                Builder aVar = this;
                aVar.f135691g = z;
                return aVar;
            }

            /* renamed from: f */
            public final Builder mo187441f(boolean z) {
                Builder aVar = this;
                aVar.f135692h = z;
                return aVar;
            }

            /* renamed from: g */
            public final Builder mo187443g(boolean z) {
                Builder aVar = this;
                aVar.f135694j = z;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo187429a(boolean z) {
                Builder aVar = this;
                aVar.f135686b = z;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo187432b(boolean z) {
                Builder aVar = this;
                aVar.f135688d = z;
                return aVar;
            }

            /* renamed from: c */
            public final Builder mo187435c(boolean z) {
                Builder aVar = this;
                aVar.f135689e = z;
                return aVar;
            }
        }

        /* renamed from: a */
        public final String mo187416a() {
            return this.f135672a;
        }

        /* renamed from: b */
        public final boolean mo187417b() {
            return this.f135673b;
        }

        /* renamed from: c */
        public final boolean mo187418c() {
            return this.f135675d;
        }

        /* renamed from: d */
        public final boolean mo187419d() {
            return this.f135676e;
        }

        /* renamed from: e */
        public final boolean mo187420e() {
            return this.f135677f;
        }

        /* renamed from: f */
        public final boolean mo187421f() {
            return this.f135678g;
        }

        /* renamed from: g */
        public final boolean mo187422g() {
            return this.f135679h;
        }

        /* renamed from: h */
        public final boolean mo187423h() {
            return this.f135680i;
        }

        /* renamed from: i */
        public final boolean mo187424i() {
            return this.f135681j;
        }

        /* renamed from: j */
        public final String mo187425j() {
            return this.f135682k;
        }

        /* renamed from: k */
        public final String mo187426k() {
            return this.f135683l;
        }

        /* renamed from: l */
        public final String mo187427l() {
            return this.f135684m;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public EnterChatParams(Builder aVar) {
            this(aVar.mo187430a(), aVar.mo187433b(), aVar.mo187436c(), aVar.mo187438d(), aVar.mo187440e(), aVar.mo187442f(), aVar.mo187444g(), aVar.mo187445h(), aVar.mo187446i(), aVar.mo187447j(), aVar.mo187448k(), aVar.mo187449l(), aVar.mo187450m());
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
        }

        private EnterChatParams(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str2, String str3, String str4) {
            this.f135672a = str;
            this.f135673b = z;
            this.f135674c = z2;
            this.f135675d = z3;
            this.f135676e = z4;
            this.f135677f = z5;
            this.f135678g = z6;
            this.f135679h = z7;
            this.f135680i = z8;
            this.f135681j = z9;
            this.f135682k = str2;
            this.f135683l = str3;
            this.f135684m = str4;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m213145a(String str) {
        f135671f.mo187412c(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0004H\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0004H\u0007J\f\u0010\u001c\u001a\u00020\u0015*\u00020\u0017H\u0002J\f\u0010\u001d\u001a\u00020\u0015*\u00020\u0017H\u0002J\f\u0010\u001e\u001a\u00020\u0015*\u00020\u0017H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$Companion;", "", "()V", "MESSAGE_LOCATION_MAIN", "", "getMESSAGE_LOCATION_MAIN", "()Ljava/lang/String;", "MESSAGE_LOCATION_TOPIC", "getMESSAGE_LOCATION_TOPIC", "current", "getCurrent", "setCurrent", "(Ljava/lang/String;)V", "isInChatBox", "", "()Z", "setInChatBox", "(Z)V", "isMute", "setMute", "resetStatisticsCurrentPositionFromChatWin", "", "params", "Lcom/ss/android/lark/statistics/chat/ChatTypeStateKeeper$EnterChatParams;", "restInChatBox", "setCurrentInputLocation", "location", "setCurrentReactionInputLocation", "resetCurrent", "resetInputLocation", "resetMute", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.chat.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo187405a() {
            return ChatTypeStateKeeper.f135666a;
        }

        /* renamed from: c */
        public final boolean mo187413c() {
            return ChatTypeStateKeeper.f135668c;
        }

        /* renamed from: d */
        public final String mo187414d() {
            return ChatTypeStateKeeper.f135669d;
        }

        /* renamed from: e */
        public final String mo187415e() {
            return ChatTypeStateKeeper.f135670e;
        }

        /* renamed from: b */
        public final boolean mo187411b() {
            return ChatTypeStateKeeper.f135667b;
        }

        /* renamed from: f */
        private final void m213149f() {
            Companion aVar = this;
            aVar.mo187410b(aVar.mo187413c());
        }

        /* renamed from: b */
        public final void mo187410b(boolean z) {
            ChatTypeStateKeeper.f135668c = z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187407a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            ChatTypeStateKeeper.f135666a = str;
        }

        /* renamed from: b */
        private final void m213146b(EnterChatParams bVar) {
            mo187408a(!bVar.mo187417b());
        }

        /* renamed from: a */
        public final void mo187408a(boolean z) {
            ChatTypeStateKeeper.f135667b = z;
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo187412c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            MessageHitPoint.f135779d.mo187543b(str);
        }

        /* renamed from: c */
        private final void m213147c(EnterChatParams bVar) {
            if (bVar.mo187419d()) {
                Companion aVar = this;
                aVar.mo187409b(aVar.mo187415e());
                return;
            }
            Companion aVar2 = this;
            aVar2.mo187409b(aVar2.mo187414d());
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo187409b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            MessageHitPoint.f135779d.mo187529a(str);
            if (str == "thread_input") {
                Statistics.sendEvent("thread_view");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187406a(EnterChatParams bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "params");
            ChatTypeStateKeeper.f135671f.m213148d(bVar);
            ChatTypeStateKeeper.f135671f.m213147c(bVar);
            ChatTypeStateKeeper.f135671f.m213146b(bVar);
            ChatTypeStateKeeper.f135671f.m213149f();
            ChatHitPoint.f135648a.mo187351a(bVar);
            ChatHitPoint.f135648a.mo187358a(bVar.mo187423h(), bVar.mo187416a(), bVar.mo187425j());
        }

        /* renamed from: d */
        private final void m213148d(EnterChatParams bVar) {
            String str;
            if (bVar.mo187420e()) {
                Companion aVar = this;
                aVar.mo187407a("group");
                if (bVar.mo187418c()) {
                    aVar.mo187407a("meeting");
                }
                if (bVar.mo187419d()) {
                    aVar.mo187407a("group_topic");
                }
                if (bVar.mo187424i()) {
                    aVar.mo187407a("group_secret");
                    return;
                }
                return;
            }
            Companion aVar2 = this;
            if (bVar.mo187421f()) {
                str = "single_bot";
            } else if (bVar.mo187424i()) {
                str = "single_secret";
            } else {
                str = "single";
            }
            aVar2.mo187407a(str);
        }
    }
}
