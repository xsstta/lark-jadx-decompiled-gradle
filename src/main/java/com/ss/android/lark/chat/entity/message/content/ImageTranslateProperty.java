package com.ss.android.lark.chat.entity.message.content;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;", "Ljava/io/Serializable;", "canTranslate", "", "srcLanguages", "", "", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getCanTranslate", "()Ljava/lang/Boolean;", "setCanTranslate", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSrcLanguages", "()Ljava/util/List;", "setSrcLanguages", "(Ljava/util/List;)V", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;", "equals", "other", "", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImageTranslateProperty implements Serializable {
    private Boolean canTranslate;
    private List<String> srcLanguages;

    public ImageTranslateProperty() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chat.entity.message.content.ImageTranslateProperty */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageTranslateProperty copy$default(ImageTranslateProperty imageTranslateProperty, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = imageTranslateProperty.canTranslate;
        }
        if ((i & 2) != 0) {
            list = imageTranslateProperty.srcLanguages;
        }
        return imageTranslateProperty.copy(bool, list);
    }

    public final Boolean component1() {
        return this.canTranslate;
    }

    public final List<String> component2() {
        return this.srcLanguages;
    }

    public final ImageTranslateProperty copy(Boolean bool, List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "srcLanguages");
        return new ImageTranslateProperty(bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageTranslateProperty)) {
            return false;
        }
        ImageTranslateProperty imageTranslateProperty = (ImageTranslateProperty) obj;
        return Intrinsics.areEqual(this.canTranslate, imageTranslateProperty.canTranslate) && Intrinsics.areEqual(this.srcLanguages, imageTranslateProperty.srcLanguages);
    }

    public int hashCode() {
        Boolean bool = this.canTranslate;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<String> list = this.srcLanguages;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ImageTranslateProperty(canTranslate=" + this.canTranslate + ", srcLanguages=" + this.srcLanguages + ")";
    }

    public final Boolean getCanTranslate() {
        return this.canTranslate;
    }

    public final List<String> getSrcLanguages() {
        return this.srcLanguages;
    }

    public final void setCanTranslate(Boolean bool) {
        this.canTranslate = bool;
    }

    public final void setSrcLanguages(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.srcLanguages = list;
    }

    public ImageTranslateProperty(Boolean bool, List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "srcLanguages");
        this.canTranslate = bool;
        this.srcLanguages = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageTranslateProperty(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
