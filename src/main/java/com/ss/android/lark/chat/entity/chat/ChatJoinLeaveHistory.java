package com.ss.android.lark.chat.entity.chat;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0005\u001d\u001e\u001f !BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006\""}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory;", "", "id", "", "action", "", "event", BottomDialog.f17198f, "avatarKey", "chatterName", "chatId", "createTime", "", "extra", "Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$HistoryExtra;", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$HistoryExtra;)V", "getAction", "()I", "getAvatarKey", "()Ljava/lang/String;", "getChatId", "getChatterId", "getChatterName", "getCreateTime", "()J", "getEvent", "getExtra", "()Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$HistoryExtra;", "getId", "Action", "ContentValue", "EventType", "HistoryExtra", "ValueType", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatJoinLeaveHistory {

    /* renamed from: a */
    private final String f87725a;

    /* renamed from: b */
    private final int f87726b;

    /* renamed from: c */
    private final int f87727c;

    /* renamed from: d */
    private final String f87728d;

    /* renamed from: e */
    private final String f87729e;

    /* renamed from: f */
    private final String f87730f;

    /* renamed from: g */
    private final String f87731g;

    /* renamed from: h */
    private final long f87732h;

    /* renamed from: i */
    private final HistoryExtra f87733i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$Action;", "", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Action {
        public static final Companion Companion = Companion.f87734a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$Action$Companion;", "", "()V", "JOIN", "", "LEAVE", "UNKNOWN_ACTION", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory$Action$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f87734a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$EventType;", "", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EventType {
        public static final Companion Companion = Companion.f87735a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$EventType$Companion;", "", "()V", "DEL_ADMIN", "", "DEL_SELF", "INV_CHATTER", "INV_DOC", "INV_GROUP_CHAT", "INV_MESSAGE_CARD", "INV_P2P_CHAT", "INV_QR_CODE", "INV_SEARCH", "INV_SELF", "UNKNOWN_TYPE", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory$EventType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f87735a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$ValueType;", "", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ValueType {
        public static final Companion Companion = Companion.f87736a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$ValueType$Companion;", "", "()V", "BOT", "", "CHAT", "DOC", "UNKNOWN_VALUE_TYPE", "USER", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory$ValueType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f87736a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$ContentValue;", "", "id", "", "docUrl", "displayText", ShareHitPoint.f121869d, "", "unauthorizedDoc", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getDisplayText", "()Ljava/lang/String;", "getDocUrl", "getId", "getType", "()I", "getUnauthorizedDoc", "()Z", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory$a */
    public static final class ContentValue {

        /* renamed from: a */
        private final String f87737a;

        /* renamed from: b */
        private final String f87738b;

        /* renamed from: c */
        private final String f87739c;

        /* renamed from: d */
        private final int f87740d;

        /* renamed from: e */
        private final boolean f87741e;

        /* renamed from: a */
        public final String mo124622a() {
            return this.f87737a;
        }

        /* renamed from: b */
        public final String mo124623b() {
            return this.f87738b;
        }

        /* renamed from: c */
        public final String mo124624c() {
            return this.f87739c;
        }

        /* renamed from: d */
        public final int mo124625d() {
            return this.f87740d;
        }

        /* renamed from: e */
        public final boolean mo124626e() {
            return this.f87741e;
        }

        public ContentValue(String str, String str2, String str3, @ValueType int i, boolean z) {
            this.f87737a = str;
            this.f87738b = str2;
            this.f87739c = str3;
            this.f87740d = i;
            this.f87741e = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$HistoryExtra;", "", "template", "", "map", "", "Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$ContentValue;", "(Ljava/lang/String;Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "getTemplate", "()Ljava/lang/String;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory$b */
    public static final class HistoryExtra {

        /* renamed from: a */
        private final String f87742a;

        /* renamed from: b */
        private final Map<String, ContentValue> f87743b;

        /* renamed from: a */
        public final String mo124627a() {
            return this.f87742a;
        }

        /* renamed from: b */
        public final Map<String, ContentValue> mo124628b() {
            return this.f87743b;
        }

        public HistoryExtra(String str, Map<String, ContentValue> map) {
            Intrinsics.checkParameterIsNotNull(str, "template");
            Intrinsics.checkParameterIsNotNull(map, "map");
            this.f87742a = str;
            this.f87743b = map;
        }
    }

    /* renamed from: a */
    public final String mo124615a() {
        return this.f87725a;
    }

    /* renamed from: b */
    public final int mo124616b() {
        return this.f87727c;
    }

    /* renamed from: c */
    public final String mo124617c() {
        return this.f87728d;
    }

    /* renamed from: d */
    public final String mo124618d() {
        return this.f87729e;
    }

    /* renamed from: e */
    public final String mo124619e() {
        return this.f87730f;
    }

    /* renamed from: f */
    public final long mo124620f() {
        return this.f87732h;
    }

    /* renamed from: g */
    public final HistoryExtra mo124621g() {
        return this.f87733i;
    }

    public ChatJoinLeaveHistory(String str, int i, int i2, String str2, String str3, String str4, String str5, long j, HistoryExtra bVar) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str3, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str4, "chatterName");
        Intrinsics.checkParameterIsNotNull(str5, "chatId");
        Intrinsics.checkParameterIsNotNull(bVar, "extra");
        this.f87725a = str;
        this.f87726b = i;
        this.f87727c = i2;
        this.f87728d = str2;
        this.f87729e = str3;
        this.f87730f = str4;
        this.f87731g = str5;
        this.f87732h = j;
        this.f87733i = bVar;
    }
}
