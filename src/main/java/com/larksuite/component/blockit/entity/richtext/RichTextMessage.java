package com.larksuite.component.blockit.entity.richtext;

import com.ss.android.lark.chat.entity.message.Message;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/blockit/entity/richtext/RichTextMessage;", "Ljava/io/Serializable;", "messageType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "messageContent", "Lcom/larksuite/component/blockit/entity/richtext/MessageContentEntity;", "(Lcom/ss/android/lark/chat/entity/message/Message$Type;Lcom/larksuite/component/blockit/entity/richtext/MessageContentEntity;)V", "getMessageContent", "()Lcom/larksuite/component/blockit/entity/richtext/MessageContentEntity;", "getMessageType", "()Lcom/ss/android/lark/chat/entity/message/Message$Type;", "setMessageType", "(Lcom/ss/android/lark/chat/entity/message/Message$Type;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RichTextMessage implements Serializable {
    private final MessageContentEntity messageContent;
    private Message.Type messageType;

    public static /* synthetic */ RichTextMessage copy$default(RichTextMessage richTextMessage, Message.Type type, MessageContentEntity messageContentEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            type = richTextMessage.messageType;
        }
        if ((i & 2) != 0) {
            messageContentEntity = richTextMessage.messageContent;
        }
        return richTextMessage.copy(type, messageContentEntity);
    }

    public final Message.Type component1() {
        return this.messageType;
    }

    public final MessageContentEntity component2() {
        return this.messageContent;
    }

    public final RichTextMessage copy(Message.Type type, MessageContentEntity messageContentEntity) {
        Intrinsics.checkParameterIsNotNull(type, "messageType");
        Intrinsics.checkParameterIsNotNull(messageContentEntity, "messageContent");
        return new RichTextMessage(type, messageContentEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextMessage)) {
            return false;
        }
        RichTextMessage richTextMessage = (RichTextMessage) obj;
        return Intrinsics.areEqual(this.messageType, richTextMessage.messageType) && Intrinsics.areEqual(this.messageContent, richTextMessage.messageContent);
    }

    public int hashCode() {
        Message.Type type = this.messageType;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        MessageContentEntity messageContentEntity = this.messageContent;
        if (messageContentEntity != null) {
            i = messageContentEntity.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RichTextMessage(messageType=" + this.messageType + ", messageContent=" + this.messageContent + ")";
    }

    public final MessageContentEntity getMessageContent() {
        return this.messageContent;
    }

    public final Message.Type getMessageType() {
        return this.messageType;
    }

    public final void setMessageType(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "<set-?>");
        this.messageType = type;
    }

    public RichTextMessage(Message.Type type, MessageContentEntity messageContentEntity) {
        Intrinsics.checkParameterIsNotNull(type, "messageType");
        Intrinsics.checkParameterIsNotNull(messageContentEntity, "messageContent");
        this.messageType = type;
        this.messageContent = messageContentEntity;
    }
}
