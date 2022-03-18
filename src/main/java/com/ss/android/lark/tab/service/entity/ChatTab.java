package com.ss.android.lark.tab.service.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u0000 '2\u00020\u0001:\u0002&'B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0006\u0010$\u001a\u00020\u001fJ\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/ss/android/lark/tab/service/entity/ChatTab;", "Ljava/io/Serializable;", "id", "", "name", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "payload", "Lokio/ByteString;", "payloadString", "serverId", "(JLjava/lang/String;Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;Lokio/ByteString;Ljava/lang/String;J)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPayload", "()Lokio/ByteString;", "getPayloadString", "getServerId", "getType", "()Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "isSingleton", "toString", "ChatTabType", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatTab implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final long id;
    private final String name;
    private final ByteString payload;
    private final String payloadString;
    private final long serverId;
    private final ChatTabType type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "MESSAGE", "DOC_SPACE", "DOC", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ChatTabType {
        UNKNOWN(0),
        MESSAGE(1),
        DOC_SPACE(2),
        DOC(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "value", "", "valueOf", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.service.entity.ChatTab$ChatTabType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ChatTabType mo188419a(int i) {
                if (i == 0) {
                    return ChatTabType.UNKNOWN;
                }
                if (i == 1) {
                    return ChatTabType.MESSAGE;
                }
                if (i == 2) {
                    return ChatTabType.DOC_SPACE;
                }
                if (i != 3) {
                    return ChatTabType.UNKNOWN;
                }
                return ChatTabType.DOC;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ChatTabType(int i) {
            this.value = i;
        }
    }

    @JvmStatic
    public static final boolean containsBizTabs(List<ChatTab> list) {
        return Companion.mo188424a(list);
    }

    public static /* synthetic */ ChatTab copy$default(ChatTab chatTab, long j, String str, ChatTabType chatTabType, ByteString byteString, String str2, long j2, int i, Object obj) {
        return chatTab.copy((i & 1) != 0 ? chatTab.id : j, (i & 2) != 0 ? chatTab.name : str, (i & 4) != 0 ? chatTab.type : chatTabType, (i & 8) != 0 ? chatTab.payload : byteString, (i & 16) != 0 ? chatTab.payloadString : str2, (i & 32) != 0 ? chatTab.serverId : j2);
    }

    @JvmStatic
    public static final ChatTab messageTab() {
        return Companion.mo188420a();
    }

    @JvmStatic
    public static final ChatTab messageTab(long j) {
        return Companion.mo188421a(j);
    }

    @JvmStatic
    public static final ChatTab preChatTab(String str, ChatTabType chatTabType, ByteString byteString, String str2) {
        return Companion.mo188423a(str, chatTabType, byteString, str2);
    }

    @JvmStatic
    public static final ChatTab spaceListTab(Chat chat, long j) {
        return Companion.mo188422a(chat, j);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final ChatTabType component3() {
        return this.type;
    }

    public final ByteString component4() {
        return this.payload;
    }

    public final String component5() {
        return this.payloadString;
    }

    public final long component6() {
        return this.serverId;
    }

    public final ChatTab copy(long j, String str, ChatTabType chatTabType, ByteString byteString, String str2, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(chatTabType, ShareHitPoint.f121869d);
        return new ChatTab(j, str, chatTabType, byteString, str2, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatTab)) {
            return false;
        }
        ChatTab chatTab = (ChatTab) obj;
        return this.id == chatTab.id && Intrinsics.areEqual(this.name, chatTab.name) && Intrinsics.areEqual(this.type, chatTab.type) && Intrinsics.areEqual(this.payload, chatTab.payload) && Intrinsics.areEqual(this.payloadString, chatTab.payloadString) && this.serverId == chatTab.serverId;
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.id) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ChatTabType chatTabType = this.type;
        int hashCode3 = (hashCode2 + (chatTabType != null ? chatTabType.hashCode() : 0)) * 31;
        ByteString byteString = this.payload;
        int hashCode4 = (hashCode3 + (byteString != null ? byteString.hashCode() : 0)) * 31;
        String str2 = this.payloadString;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode4 + i) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.serverId);
    }

    public String toString() {
        return "ChatTab(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", payload=" + this.payload + ", payloadString=" + this.payloadString + ", serverId=" + this.serverId + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007J*\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/tab/service/entity/ChatTab$Companion;", "", "()V", "MESSAGE_LIST_ID", "", "SPACE_LIST_ID", "containsBizTabs", "", "chatTabs", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "messageTab", "serverId", "preChatTab", "name", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "payload", "Lokio/ByteString;", "payloadJson", "spaceListTab", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.entity.ChatTab$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatTab mo188420a() {
            String string = UIHelper.getString(R.string.Lark_Groups_TabChat);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Groups_TabChat)");
            return new ChatTab(100001, string, ChatTabType.MESSAGE, null, null, -1);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatTab mo188421a(long j) {
            String string = UIHelper.getString(R.string.Lark_Groups_TabChat);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Groups_TabChat)");
            return new ChatTab(100001, string, ChatTabType.MESSAGE, null, null, j);
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo188424a(List<ChatTab> list) {
            if (list != null) {
                List<ChatTab> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (!it.next().isSingleton()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatTab mo188422a(Chat chat, long j) {
            String str;
            if (chat == null || !chat.isP2PChat()) {
                str = UIHelper.getString(R.string.Lark_Groups_TabDocs);
            } else {
                str = UIHelper.getString(R.string.Lark_Groups_ChatDocs);
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "name");
            return new ChatTab(100002, str, ChatTabType.DOC_SPACE, null, null, j);
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatTab mo188423a(String str, ChatTabType chatTabType, ByteString byteString, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            Intrinsics.checkParameterIsNotNull(chatTabType, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str2, "payloadJson");
            return new ChatTab(-1, str, chatTabType, byteString, str2, -1);
        }
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final ByteString getPayload() {
        return this.payload;
    }

    public final String getPayloadString() {
        return this.payloadString;
    }

    public final long getServerId() {
        return this.serverId;
    }

    public final ChatTabType getType() {
        return this.type;
    }

    public final boolean isSingleton() {
        if (this.type != ChatTabType.DOC) {
            return true;
        }
        return false;
    }

    public ChatTab(long j, String str, ChatTabType chatTabType, ByteString byteString, String str2, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(chatTabType, ShareHitPoint.f121869d);
        this.id = j;
        this.name = str;
        this.type = chatTabType;
        this.payload = byteString;
        this.payloadString = str2;
        this.serverId = j2;
    }
}
