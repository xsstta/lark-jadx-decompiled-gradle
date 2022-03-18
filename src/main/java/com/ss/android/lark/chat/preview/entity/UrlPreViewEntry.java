package com.ss.android.lark.chat.preview.entity;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntry;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "offset", "", "length", "previewId", "", "previewEntity", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "(IILjava/lang/String;Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;)V", "getLength", "()I", "getOffset", "getPreviewEntity", "()Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "getPreviewId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UrlPreViewEntry implements AbstractC26248b<UrlPreViewEntry>, Serializable {
    private final int length;
    private final int offset;
    private final UrlPreviewEntity previewEntity;
    private final String previewId;

    public static /* synthetic */ UrlPreViewEntry copy$default(UrlPreViewEntry urlPreViewEntry, int i, int i2, String str, UrlPreviewEntity urlPreviewEntity, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = urlPreViewEntry.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = urlPreViewEntry.length;
        }
        if ((i3 & 4) != 0) {
            str = urlPreViewEntry.previewId;
        }
        if ((i3 & 8) != 0) {
            urlPreviewEntity = urlPreViewEntry.previewEntity;
        }
        return urlPreViewEntry.copy(i, i2, str, urlPreviewEntity);
    }

    public final int component1() {
        return this.offset;
    }

    public final int component2() {
        return this.length;
    }

    public final String component3() {
        return this.previewId;
    }

    public final UrlPreviewEntity component4() {
        return this.previewEntity;
    }

    public final UrlPreViewEntry copy(int i, int i2, String str, UrlPreviewEntity urlPreviewEntity) {
        Intrinsics.checkParameterIsNotNull(str, "previewId");
        return new UrlPreViewEntry(i, i2, str, urlPreviewEntity);
    }

    public String toString() {
        return "UrlPreViewEntry(offset=" + this.offset + ", length=" + this.length + ", previewId=" + this.previewId + ", previewEntity=" + this.previewEntity + ")";
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final UrlPreviewEntity getPreviewEntity() {
        return this.previewEntity;
    }

    public final String getPreviewId() {
        return this.previewId;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.offset * 31) + this.length) * 31) + this.previewId.hashCode()) * 31;
        UrlPreviewEntity urlPreviewEntity = this.previewEntity;
        if (urlPreviewEntity != null) {
            i = urlPreviewEntity.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public boolean isItemSame(UrlPreViewEntry urlPreViewEntry) {
        String str;
        String str2 = this.previewId;
        if (urlPreViewEntry != null) {
            str = urlPreViewEntry.previewId;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str2, str)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlPreViewEntry)) {
            return false;
        }
        UrlPreViewEntry urlPreViewEntry = (UrlPreViewEntry) obj;
        if (this.offset == urlPreViewEntry.offset && this.length == urlPreViewEntry.length && !(!Intrinsics.areEqual(this.previewId, urlPreViewEntry.previewId)) && !(!Intrinsics.areEqual(this.previewEntity, urlPreViewEntry.previewEntity))) {
            return true;
        }
        return false;
    }

    public boolean isContentSame(UrlPreViewEntry urlPreViewEntry) {
        String str;
        String str2 = this.previewId;
        if (urlPreViewEntry != null) {
            str = urlPreViewEntry.previewId;
        } else {
            str = null;
        }
        if (!(!Intrinsics.areEqual(str2, str)) && C26247a.m94983b(this.previewEntity, urlPreViewEntry.previewEntity)) {
            return true;
        }
        return false;
    }

    public UrlPreViewEntry(int i, int i2, String str, UrlPreviewEntity urlPreviewEntity) {
        Intrinsics.checkParameterIsNotNull(str, "previewId");
        this.offset = i;
        this.length = i2;
        this.previewId = str;
        this.previewEntity = urlPreviewEntity;
    }
}
