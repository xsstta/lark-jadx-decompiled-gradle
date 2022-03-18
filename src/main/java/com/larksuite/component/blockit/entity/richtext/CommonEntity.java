package com.larksuite.component.blockit.entity.richtext;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/blockit/entity/richtext/CommonEntity;", "Ljava/io/Serializable;", "msgId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getMsgId", "setMsgId", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CommonEntity implements Serializable {
    private final String chatId;
    private String msgId;

    public static /* synthetic */ CommonEntity copy$default(CommonEntity commonEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonEntity.msgId;
        }
        if ((i & 2) != 0) {
            str2 = commonEntity.chatId;
        }
        return commonEntity.copy(str, str2);
    }

    public final String component1() {
        return this.msgId;
    }

    public final String component2() {
        return this.chatId;
    }

    public final CommonEntity copy(String str, String str2) {
        return new CommonEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEntity)) {
            return false;
        }
        CommonEntity commonEntity = (CommonEntity) obj;
        return Intrinsics.areEqual(this.msgId, commonEntity.msgId) && Intrinsics.areEqual(this.chatId, commonEntity.chatId);
    }

    public int hashCode() {
        String str = this.msgId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.chatId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CommonEntity(msgId=" + this.msgId + ", chatId=" + this.chatId + ")";
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final void setMsgId(String str) {
        this.msgId = str;
    }

    public CommonEntity(String str, String str2) {
        this.msgId = str;
        this.chatId = str2;
    }
}
