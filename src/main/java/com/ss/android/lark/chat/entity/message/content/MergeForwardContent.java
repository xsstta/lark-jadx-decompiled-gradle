package com.ss.android.lark.chat.entity.message.content;

import com.alibaba.fastjson.annotation.JSONType;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010J\u001a\u00020\u0000H\u0016J\u0013\u0010K\u001a\u00020\u00122\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J\b\u0010N\u001a\u00020OH\u0016R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R\u001c\u0010-\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u001c\u00100\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002040\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\t\"\u0004\b6\u0010\u000bR,\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u001e0\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR\u001c\u0010;\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006P"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "", "()V", "chatters", "", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatterInfo;", "getChatters", "()Ljava/util/Map;", "setChatters", "(Ljava/util/Map;)V", "groupChatName", "getGroupChatName", "()Ljava/lang/String;", "setGroupChatName", "(Ljava/lang/String;)V", "isFromPrivateTopic", "", "()Z", "setFromPrivateTopic", "(Z)V", "isManualTranslated", "setManualTranslated", "isTranslated", "setTranslated", "messageId", "getMessageId", "setMessageId", "messages", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "getMessages", "()Ljava/util/List;", "setMessages", "(Ljava/util/List;)V", "originChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getOriginChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setOriginChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "p2pCreatorName", "getP2pCreatorName", "setP2pCreatorName", "p2pPartnerName", "getP2pPartnerName", "setP2pPartnerName", "quasiTitle", "getQuasiTitle", "setQuasiTitle", "reactionChatterMap", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getReactionChatterMap", "setReactionChatterMap", "reactionMap", "Lcom/ss/android/lark/chat/entity/reaction/Reaction;", "getReactionMap", "setReactionMap", "subtitle", "getSubtitle", "setSubtitle", "thread", "Lcom/bytedance/lark/pb/basic/v1/Thread;", "getThread", "()Lcom/bytedance/lark/pb/basic/v1/Thread;", "setThread", "(Lcom/bytedance/lark/pb/basic/v1/Thread;)V", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$Type;", "getType", "()Lcom/ss/android/lark/chat/entity/chat/Chat$Type;", "setType", "(Lcom/ss/android/lark/chat/entity/chat/Chat$Type;)V", "clone", "equals", "content", "", "hashCode", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "MergeForwardContent")
public final class MergeForwardContent extends Content implements Cloneable {
    private Map<String, ? extends ChatterInfo> chatters;
    private String groupChatName;
    private boolean isFromPrivateTopic;
    private boolean isManualTranslated;
    private boolean isTranslated;
    private String messageId;
    private List<? extends Message> messages;
    private Chat originChat;
    private String p2pCreatorName;
    private String p2pPartnerName;
    private String quasiTitle;
    private Map<String, ? extends Chatter> reactionChatterMap = new HashMap();
    private Map<String, ? extends List<? extends Reaction>> reactionMap = new HashMap();
    private String subtitle = "";
    private Thread thread;
    private Chat.Type type;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.chatter.ChatterInfo>, java.util.Map<java.lang.String, com.ss.android.lark.chat.entity.chatter.ChatterInfo> */
    public final Map<String, ChatterInfo> getChatters() {
        return this.chatters;
    }

    public final String getGroupChatName() {
        return this.groupChatName;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.chat.entity.message.Message>, java.util.List<com.ss.android.lark.chat.entity.message.Message> */
    public final List<Message> getMessages() {
        return this.messages;
    }

    public final Chat getOriginChat() {
        return this.originChat;
    }

    public final String getP2pCreatorName() {
        return this.p2pCreatorName;
    }

    public final String getP2pPartnerName() {
        return this.p2pPartnerName;
    }

    public final String getQuasiTitle() {
        return this.quasiTitle;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.chatter.Chatter>, java.util.Map<java.lang.String, com.ss.android.lark.chat.entity.chatter.Chatter> */
    public final Map<String, Chatter> getReactionChatterMap() {
        return this.reactionChatterMap;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.android.lark.chat.entity.reaction.Reaction>>, java.util.Map<java.lang.String, java.util.List<com.ss.android.lark.chat.entity.reaction.Reaction>> */
    public final Map<String, List<Reaction>> getReactionMap() {
        return this.reactionMap;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Thread getThread() {
        return this.thread;
    }

    public final Chat.Type getType() {
        return this.type;
    }

    public final boolean isFromPrivateTopic() {
        return this.isFromPrivateTopic;
    }

    public final boolean isManualTranslated() {
        return this.isManualTranslated;
    }

    public final boolean isTranslated() {
        return this.isTranslated;
    }

    @Override // java.lang.Object
    public MergeForwardContent clone() {
        Object clone = super.clone();
        if (clone != null) {
            return (MergeForwardContent) clone;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.MergeForwardContent");
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        List<? extends Message> list = this.messages;
        int i5 = 0;
        if (list != null) {
            if (list == null) {
                Intrinsics.throwNpe();
            }
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Chat.Type type2 = this.type;
        if (type2 != null) {
            if (type2 == null) {
                Intrinsics.throwNpe();
            }
            i2 = type2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str = this.groupChatName;
        if (str != null) {
            if (str == null) {
                Intrinsics.throwNpe();
            }
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.p2pCreatorName;
        if (str2 != null) {
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.p2pPartnerName;
        if (str3 != null) {
            if (str3 == null) {
                Intrinsics.throwNpe();
            }
            i5 = str3.hashCode();
        }
        return i9 + i5;
    }

    public final void setChatters(Map<String, ? extends ChatterInfo> map) {
        this.chatters = map;
    }

    public final void setFromPrivateTopic(boolean z) {
        this.isFromPrivateTopic = z;
    }

    public final void setGroupChatName(String str) {
        this.groupChatName = str;
    }

    public final void setManualTranslated(boolean z) {
        this.isManualTranslated = z;
    }

    public final void setMessageId(String str) {
        this.messageId = str;
    }

    public final void setMessages(List<? extends Message> list) {
        this.messages = list;
    }

    public final void setOriginChat(Chat chat) {
        this.originChat = chat;
    }

    public final void setP2pCreatorName(String str) {
        this.p2pCreatorName = str;
    }

    public final void setP2pPartnerName(String str) {
        this.p2pPartnerName = str;
    }

    public final void setQuasiTitle(String str) {
        this.quasiTitle = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setThread(Thread thread2) {
        this.thread = thread2;
    }

    public final void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public final void setType(Chat.Type type2) {
        this.type = type2;
    }

    public final void setReactionChatterMap(Map<String, ? extends Chatter> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.reactionChatterMap = map;
    }

    public final void setReactionMap(Map<String, ? extends List<? extends Reaction>> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.reactionMap = map;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergeForwardContent)) {
            return false;
        }
        List<? extends Message> list = this.messages;
        if (list != null) {
            z = !Intrinsics.areEqual(list, ((MergeForwardContent) obj).messages);
        } else if (((MergeForwardContent) obj).messages != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        MergeForwardContent mergeForwardContent = (MergeForwardContent) obj;
        if (this.type != mergeForwardContent.type) {
            return false;
        }
        String str = this.groupChatName;
        if (str != null) {
            z2 = !Intrinsics.areEqual(str, mergeForwardContent.groupChatName);
        } else if (mergeForwardContent.groupChatName != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        String str2 = this.p2pCreatorName;
        if (str2 != null) {
            z3 = !Intrinsics.areEqual(str2, mergeForwardContent.p2pCreatorName);
        } else if (mergeForwardContent.p2pCreatorName != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return false;
        }
        String str3 = this.p2pPartnerName;
        String str4 = mergeForwardContent.p2pPartnerName;
        if (str3 != null) {
            return Intrinsics.areEqual(str3, str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }
}
