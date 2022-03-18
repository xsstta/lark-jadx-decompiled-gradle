package com.ss.android.lark.chat.entity.preview;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/LocalUrlPreviewEntity;", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "localIconUrl", "", "localTitle", "localDescription", "sourceId", "previewId", "url", "Lcom/ss/android/lark/chat/entity/preview/Url;", "actions", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/preview/Url;Ljava/util/Map;)V", "getLocalDescription", "()Ljava/lang/String;", "getLocalIconUrl", "getLocalTitle", "equals", "", "other", "", "hashCode", "", "isValid", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LocalUrlPreviewEntity extends UrlPreviewEntity {
    private final String localDescription;
    private final String localIconUrl;
    private final String localTitle;

    public final String getLocalDescription() {
        return this.localDescription;
    }

    public final String getLocalIconUrl() {
        return this.localIconUrl;
    }

    public final String getLocalTitle() {
        return this.localTitle;
    }

    @Override // com.ss.android.lark.chat.entity.preview.UrlPreviewEntity
    public boolean isValid() {
        return super.isValid();
    }

    @Override // com.ss.android.lark.chat.entity.preview.UrlPreviewEntity
    public int hashCode() {
        int i;
        int i2;
        int hashCode = super.hashCode() * 31;
        String str = this.localIconUrl;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        String str2 = this.localTitle;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.localDescription;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // com.ss.android.lark.chat.entity.preview.UrlPreviewEntity
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if ((!Intrinsics.areEqual(cls2, cls)) || !super.equals(obj)) {
            return false;
        }
        if (obj != null) {
            LocalUrlPreviewEntity localUrlPreviewEntity = (LocalUrlPreviewEntity) obj;
            if (!(!Intrinsics.areEqual(this.localIconUrl, localUrlPreviewEntity.localIconUrl)) && !(!Intrinsics.areEqual(this.localTitle, localUrlPreviewEntity.localTitle)) && !(!Intrinsics.areEqual(this.localDescription, localUrlPreviewEntity.localDescription))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.LocalUrlPreviewEntity");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalUrlPreviewEntity(String str, String str2, String str3, String str4, String str5, Url url, Map<String, UrlPreviewAction> map) {
        super(str4, str5, url, map);
        Intrinsics.checkParameterIsNotNull(str4, "sourceId");
        Intrinsics.checkParameterIsNotNull(str5, "previewId");
        Intrinsics.checkParameterIsNotNull(map, "actions");
        this.localIconUrl = str;
        this.localTitle = str2;
        this.localDescription = str3;
    }
}
