package com.ss.android.lark.chat.entity.message.content;

import com.alibaba.fastjson.annotation.JSONType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "expireTime", "", "getExpireTime", "()J", "setExpireTime", "(J)V", "joinChatErrState", "Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "getJoinChatErrState", "()Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "setJoinChatErrState", "(Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;)V", "joinToken", "", "getJoinToken", "()Ljava/lang/String;", "setJoinToken", "(Ljava/lang/String;)V", "isContentSame", "", "diffable", "isItemSame", "GroupState", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "ShareGroupChatContent")
public final class ShareGroupChatContent extends Content {
    private Chat chat;
    private long expireTime;
    private GroupState joinChatErrState;
    private String joinToken;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "ALREADY_IN_GROUP", "JUST_SHOW_GROUP_INFO", "CAN_JOIN_DIRECTLY", "NEED_APPLY", "PENDING_APPROVAL", "NEED_CREATE_TENANT", "NEED_SWITCH_TENANT", "EXTERNAL_USERS_CANNOT_OPERATE", "INVITER_LEFT", "GROUP_DISBANDED", "SHARING_DISABLED", "SHARE_EXPIRED", "NO_EXTERNAL_COMMUNICATION_AUTHORITY", "GROUP_IS_FULL", "LINK_CERTIFIED_REFUSE", "QR_CODE_CERTIFIED_REFUSE", "SHARE_CARD_CERTIFIED_REFUSE", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum GroupState implements Serializable {
        ALREADY_IN_GROUP,
        JUST_SHOW_GROUP_INFO,
        CAN_JOIN_DIRECTLY,
        NEED_APPLY,
        PENDING_APPROVAL,
        NEED_CREATE_TENANT,
        NEED_SWITCH_TENANT,
        EXTERNAL_USERS_CANNOT_OPERATE,
        INVITER_LEFT,
        GROUP_DISBANDED,
        SHARING_DISABLED,
        SHARE_EXPIRED,
        NO_EXTERNAL_COMMUNICATION_AUTHORITY,
        GROUP_IS_FULL,
        LINK_CERTIFIED_REFUSE,
        QR_CODE_CERTIFIED_REFUSE,
        SHARE_CARD_CERTIFIED_REFUSE
    }

    public final Chat getChat() {
        return this.chat;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final GroupState getJoinChatErrState() {
        return this.joinChatErrState;
    }

    public final String getJoinToken() {
        return this.joinToken;
    }

    public final void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setJoinChatErrState(GroupState groupState) {
        this.joinChatErrState = groupState;
    }

    public final void setJoinToken(String str) {
        this.joinToken = str;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isItemSame(Content content) {
        String str;
        if (!(content instanceof ShareGroupChatContent)) {
            return false;
        }
        if (this == content) {
            return true;
        }
        Chat chat2 = this.chat;
        if (chat2 == null) {
            return false;
        }
        ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) content;
        if (shareGroupChatContent.chat == null) {
            return false;
        }
        String str2 = null;
        if (chat2 != null) {
            str = chat2.getId();
        } else {
            str = null;
        }
        Chat chat3 = shareGroupChatContent.chat;
        if (chat3 != null) {
            str2 = chat3.getId();
        }
        if (!Intrinsics.areEqual(str, str2) || this.joinChatErrState != shareGroupChatContent.joinChatErrState) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (!(content instanceof ShareGroupChatContent)) {
            return false;
        }
        if (this == content) {
            return true;
        }
        Chat chat2 = this.chat;
        if (chat2 == null) {
            return false;
        }
        ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) content;
        if (shareGroupChatContent.chat == null) {
            return false;
        }
        if (chat2 == null) {
            Intrinsics.throwNpe();
        }
        String id = chat2.getId();
        Chat chat3 = shareGroupChatContent.chat;
        if (chat3 == null) {
            Intrinsics.throwNpe();
        }
        if (!(!Intrinsics.areEqual(id, chat3.getId())) && this.expireTime == shareGroupChatContent.expireTime && this.joinChatErrState == shareGroupChatContent.joinChatErrState) {
            return true;
        }
        return false;
    }
}
