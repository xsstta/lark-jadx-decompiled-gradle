package com.ss.android.lark.chat.entity.preview;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000H\u0002J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "Ljava/io/Serializable;", "", "Lcom/larksuite/framework/utils/diff/Diffable;", "sourceId", "", "previewId", "url", "Lcom/ss/android/lark/chat/entity/preview/Url;", "actions", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewAction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/preview/Url;Ljava/util/Map;)V", "getActions", "()Ljava/util/Map;", "getPreviewId", "()Ljava/lang/String;", "getSourceId", "getUrl", "()Lcom/ss/android/lark/chat/entity/preview/Url;", "compareTo", "", "other", "equals", "", "", "hashCode", "isContentSame", "diffable", "isItemSame", "isValid", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UrlPreviewEntity implements AbstractC26248b<UrlPreviewEntity>, Serializable, Comparable<UrlPreviewEntity> {
    private final Map<String, UrlPreviewAction> actions;
    private final String previewId;
    private final String sourceId;
    private final Url url;

    public int compareTo(UrlPreviewEntity urlPreviewEntity) {
        Intrinsics.checkParameterIsNotNull(urlPreviewEntity, "other");
        return 0;
    }

    public boolean isValid() {
        return true;
    }

    public final Map<String, UrlPreviewAction> getActions() {
        return this.actions;
    }

    public final String getPreviewId() {
        return this.previewId;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final Url getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.sourceId.hashCode() * 31) + this.previewId.hashCode()) * 31;
        Url url2 = this.url;
        if (url2 != null) {
            i = url2.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.actions.hashCode();
    }

    public String toString() {
        return "UrlPreviewEntity(sourceId='" + this.sourceId + "', previewId='" + this.previewId + "', url=" + this.url + ')';
    }

    public boolean isItemSame(UrlPreviewEntity urlPreviewEntity) {
        String str;
        String str2 = this.sourceId;
        if (urlPreviewEntity != null) {
            str = urlPreviewEntity.sourceId;
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str2, str) || !Intrinsics.areEqual(this.previewId, urlPreviewEntity.previewId)) {
            return false;
        }
        return true;
    }

    public boolean isContentSame(UrlPreviewEntity urlPreviewEntity) {
        String str;
        String str2 = this.sourceId;
        if (urlPreviewEntity != null) {
            str = urlPreviewEntity.sourceId;
        } else {
            str = null;
        }
        if ((!Intrinsics.areEqual(str2, str)) || (!Intrinsics.areEqual(this.previewId, urlPreviewEntity.previewId)) || !C26247a.m94983b(this.url, urlPreviewEntity.url)) {
            return false;
        }
        return true;
    }

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
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            UrlPreviewEntity urlPreviewEntity = (UrlPreviewEntity) obj;
            if (!(!Intrinsics.areEqual(this.sourceId, urlPreviewEntity.sourceId)) && !(!Intrinsics.areEqual(this.previewId, urlPreviewEntity.previewId)) && !(!Intrinsics.areEqual(this.url, urlPreviewEntity.url)) && !(!Intrinsics.areEqual(this.actions, urlPreviewEntity.actions))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.UrlPreviewEntity");
    }

    public UrlPreviewEntity(String str, String str2, Url url2, Map<String, UrlPreviewAction> map) {
        Intrinsics.checkParameterIsNotNull(str, "sourceId");
        Intrinsics.checkParameterIsNotNull(str2, "previewId");
        Intrinsics.checkParameterIsNotNull(map, "actions");
        this.sourceId = str;
        this.previewId = str2;
        this.url = url2;
        this.actions = map;
    }
}
