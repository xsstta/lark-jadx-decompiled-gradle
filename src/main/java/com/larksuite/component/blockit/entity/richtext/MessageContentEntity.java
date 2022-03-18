package com.larksuite.component.blockit.entity.richtext;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0011\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0007¨\u0006\""}, d2 = {"Lcom/larksuite/component/blockit/entity/richtext/MessageContentEntity;", "Ljava/io/Serializable;", "commonEntity", "Lcom/larksuite/component/blockit/entity/richtext/CommonEntity;", "(Lcom/larksuite/component/blockit/entity/richtext/CommonEntity;)V", "textEntity", "Lcom/larksuite/component/blockit/entity/richtext/TextEntity;", "(Lcom/larksuite/component/blockit/entity/richtext/TextEntity;)V", "postEntity", "Lcom/larksuite/component/blockit/entity/richtext/PostEntity;", "(Lcom/larksuite/component/blockit/entity/richtext/PostEntity;)V", "(Lcom/larksuite/component/blockit/entity/richtext/CommonEntity;Lcom/larksuite/component/blockit/entity/richtext/TextEntity;)V", "(Lcom/larksuite/component/blockit/entity/richtext/CommonEntity;Lcom/larksuite/component/blockit/entity/richtext/TextEntity;Lcom/larksuite/component/blockit/entity/richtext/PostEntity;)V", "getCommonEntity", "()Lcom/larksuite/component/blockit/entity/richtext/CommonEntity;", "setCommonEntity", "getPostEntity", "()Lcom/larksuite/component/blockit/entity/richtext/PostEntity;", "setPostEntity", "getTextEntity", "()Lcom/larksuite/component/blockit/entity/richtext/TextEntity;", "setTextEntity", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MessageContentEntity implements Serializable {
    private CommonEntity commonEntity;
    private PostEntity postEntity;
    private TextEntity textEntity;

    public static /* synthetic */ MessageContentEntity copy$default(MessageContentEntity messageContentEntity, CommonEntity commonEntity2, TextEntity textEntity2, PostEntity postEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            commonEntity2 = messageContentEntity.commonEntity;
        }
        if ((i & 2) != 0) {
            textEntity2 = messageContentEntity.textEntity;
        }
        if ((i & 4) != 0) {
            postEntity2 = messageContentEntity.postEntity;
        }
        return messageContentEntity.copy(commonEntity2, textEntity2, postEntity2);
    }

    public final CommonEntity component1() {
        return this.commonEntity;
    }

    public final TextEntity component2() {
        return this.textEntity;
    }

    public final PostEntity component3() {
        return this.postEntity;
    }

    public final MessageContentEntity copy(CommonEntity commonEntity2, TextEntity textEntity2, PostEntity postEntity2) {
        return new MessageContentEntity(commonEntity2, textEntity2, postEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageContentEntity)) {
            return false;
        }
        MessageContentEntity messageContentEntity = (MessageContentEntity) obj;
        return Intrinsics.areEqual(this.commonEntity, messageContentEntity.commonEntity) && Intrinsics.areEqual(this.textEntity, messageContentEntity.textEntity) && Intrinsics.areEqual(this.postEntity, messageContentEntity.postEntity);
    }

    public int hashCode() {
        CommonEntity commonEntity2 = this.commonEntity;
        int i = 0;
        int hashCode = (commonEntity2 != null ? commonEntity2.hashCode() : 0) * 31;
        TextEntity textEntity2 = this.textEntity;
        int hashCode2 = (hashCode + (textEntity2 != null ? textEntity2.hashCode() : 0)) * 31;
        PostEntity postEntity2 = this.postEntity;
        if (postEntity2 != null) {
            i = postEntity2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MessageContentEntity(commonEntity=" + this.commonEntity + ", textEntity=" + this.textEntity + ", postEntity=" + this.postEntity + ")";
    }

    public final CommonEntity getCommonEntity() {
        return this.commonEntity;
    }

    public final PostEntity getPostEntity() {
        return this.postEntity;
    }

    public final TextEntity getTextEntity() {
        return this.textEntity;
    }

    public final void setCommonEntity(CommonEntity commonEntity2) {
        this.commonEntity = commonEntity2;
    }

    public final void setPostEntity(PostEntity postEntity2) {
        this.postEntity = postEntity2;
    }

    public final void setTextEntity(TextEntity textEntity2) {
        this.textEntity = textEntity2;
    }

    public MessageContentEntity(CommonEntity commonEntity2) {
        this(commonEntity2, null, null);
    }

    public MessageContentEntity(PostEntity postEntity2) {
        this(null, null, postEntity2);
    }

    public MessageContentEntity(TextEntity textEntity2) {
        this(null, textEntity2, null);
    }

    public MessageContentEntity(CommonEntity commonEntity2, TextEntity textEntity2) {
        this(commonEntity2, textEntity2, null);
    }

    public MessageContentEntity(CommonEntity commonEntity2, TextEntity textEntity2, PostEntity postEntity2) {
        this.commonEntity = commonEntity2;
        this.textEntity = textEntity2;
        this.postEntity = postEntity2;
    }
}
