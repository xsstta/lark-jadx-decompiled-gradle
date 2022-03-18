package com.ss.android.lark.chat.entity.message.content;

import com.alibaba.fastjson.annotation.JSONType;
import com.ss.android.lark.chat.entity.sticker.StickerInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0005¢\u0006\u0002\u0010\bJ\u0013\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u0004\u0018\u00010\u0003J\b\u0010(\u001a\u00020\u0005H\u0016J\u0006\u0010)\u001a\u00020\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\f¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/StickerContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "key", "", "width", "", "height", "(Ljava/lang/String;II)V", "()V", "getHeight", "()I", "setHeight", "(I)V", "isAdded", "", "()Z", "setAdded", "(Z)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "stickerId", "getStickerId", "setStickerId", "stickerInfo", "Lcom/ss/android/lark/chat/entity/sticker/StickerInfo;", "getStickerInfo", "()Lcom/ss/android/lark/chat/entity/sticker/StickerInfo;", "setStickerInfo", "(Lcom/ss/android/lark/chat/entity/sticker/StickerInfo;)V", "stickerSetId", "getStickerSetId", "setStickerSetId", "getWidth", "setWidth", "equals", "obj", "", "getDescription", "hashCode", "isPaid", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "StickerContent")
public final class StickerContent extends Content {
    private int height;
    private boolean isAdded;
    private String key;
    private String stickerId;
    private StickerInfo stickerInfo;
    private String stickerSetId;
    private int width;

    public StickerContent() {
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final StickerInfo getStickerInfo() {
        return this.stickerInfo;
    }

    public final String getStickerSetId() {
        return this.stickerSetId;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAdded() {
        return this.isAdded;
    }

    public final String getDescription() {
        String description;
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || (description = stickerInfo2.getDescription()) == null) {
            return "";
        }
        return description;
    }

    public int hashCode() {
        String str = this.key;
        if (str == null) {
            return 0;
        }
        if (str == null) {
            Intrinsics.throwNpe();
        }
        return str.hashCode();
    }

    public final boolean isPaid() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 != null) {
            return stickerInfo2.isHasPaid();
        }
        return true;
    }

    public final void setAdded(boolean z) {
        this.isAdded = z;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setStickerInfo(StickerInfo stickerInfo2) {
        this.stickerInfo = stickerInfo2;
    }

    public final void setStickerSetId(String str) {
        this.stickerSetId = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!Intrinsics.areEqual(obj.getClass(), StickerContent.class))) {
            return false;
        }
        return Intrinsics.areEqual(this.key, ((StickerContent) obj).key);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickerContent(String str, int i, int i2) {
        this();
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.key = str;
        this.width = i;
        this.height = i2;
    }
}
