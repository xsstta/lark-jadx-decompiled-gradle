package com.ss.android.lark.chat.entity.preview;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020\u0004HÖ\u0001R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponents;", "Ljava/io/Serializable;", "rootIds", "", "", "elements", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponent;", "imageIds", "buttonIds", "richTextIds", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getButtonIds", "()Ljava/util/List;", "setButtonIds", "(Ljava/util/List;)V", "getElements", "()Ljava/util/Map;", "setElements", "(Ljava/util/Map;)V", "getImageIds", "setImageIds", "getRichTextIds", "setRichTextIds", "getRootIds", "setRootIds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UrlPreviewComponents implements Serializable {
    private List<String> buttonIds;
    private Map<String, UrlPreviewComponent> elements;
    private List<String> imageIds;
    private List<String> richTextIds;
    private List<String> rootIds;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.entity.preview.UrlPreviewComponents */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrlPreviewComponents copy$default(UrlPreviewComponents urlPreviewComponents, List list, Map map, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = urlPreviewComponents.rootIds;
        }
        if ((i & 2) != 0) {
            map = urlPreviewComponents.elements;
        }
        if ((i & 4) != 0) {
            list2 = urlPreviewComponents.imageIds;
        }
        if ((i & 8) != 0) {
            list3 = urlPreviewComponents.buttonIds;
        }
        if ((i & 16) != 0) {
            list4 = urlPreviewComponents.richTextIds;
        }
        return urlPreviewComponents.copy(list, map, list2, list3, list4);
    }

    public final List<String> component1() {
        return this.rootIds;
    }

    public final Map<String, UrlPreviewComponent> component2() {
        return this.elements;
    }

    public final List<String> component3() {
        return this.imageIds;
    }

    public final List<String> component4() {
        return this.buttonIds;
    }

    public final List<String> component5() {
        return this.richTextIds;
    }

    public final UrlPreviewComponents copy(List<String> list, Map<String, UrlPreviewComponent> map, List<String> list2, List<String> list3, List<String> list4) {
        Intrinsics.checkParameterIsNotNull(list, "rootIds");
        Intrinsics.checkParameterIsNotNull(map, "elements");
        Intrinsics.checkParameterIsNotNull(list2, "imageIds");
        Intrinsics.checkParameterIsNotNull(list3, "buttonIds");
        Intrinsics.checkParameterIsNotNull(list4, "richTextIds");
        return new UrlPreviewComponents(list, map, list2, list3, list4);
    }

    public String toString() {
        return "UrlPreviewComponents(rootIds=" + this.rootIds + ", elements=" + this.elements + ", imageIds=" + this.imageIds + ", buttonIds=" + this.buttonIds + ", richTextIds=" + this.richTextIds + ")";
    }

    public final List<String> getButtonIds() {
        return this.buttonIds;
    }

    public final Map<String, UrlPreviewComponent> getElements() {
        return this.elements;
    }

    public final List<String> getImageIds() {
        return this.imageIds;
    }

    public final List<String> getRichTextIds() {
        return this.richTextIds;
    }

    public final List<String> getRootIds() {
        return this.rootIds;
    }

    public int hashCode() {
        return (((((((this.rootIds.hashCode() * 31) + this.elements.hashCode()) * 31) + this.imageIds.hashCode()) * 31) + this.buttonIds.hashCode()) * 31) + this.richTextIds.hashCode();
    }

    public final void setButtonIds(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.buttonIds = list;
    }

    public final void setElements(Map<String, UrlPreviewComponent> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.elements = map;
    }

    public final void setImageIds(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.imageIds = list;
    }

    public final void setRichTextIds(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.richTextIds = list;
    }

    public final void setRootIds(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.rootIds = list;
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
            UrlPreviewComponents urlPreviewComponents = (UrlPreviewComponents) obj;
            if (!(!Intrinsics.areEqual(this.rootIds, urlPreviewComponents.rootIds)) && !(!Intrinsics.areEqual(this.elements, urlPreviewComponents.elements)) && !(!Intrinsics.areEqual(this.imageIds, urlPreviewComponents.imageIds)) && !(!Intrinsics.areEqual(this.buttonIds, urlPreviewComponents.buttonIds)) && !(!Intrinsics.areEqual(this.richTextIds, urlPreviewComponents.richTextIds))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.UrlPreviewComponents");
    }

    public UrlPreviewComponents(List<String> list, Map<String, UrlPreviewComponent> map, List<String> list2, List<String> list3, List<String> list4) {
        Intrinsics.checkParameterIsNotNull(list, "rootIds");
        Intrinsics.checkParameterIsNotNull(map, "elements");
        Intrinsics.checkParameterIsNotNull(list2, "imageIds");
        Intrinsics.checkParameterIsNotNull(list3, "buttonIds");
        Intrinsics.checkParameterIsNotNull(list4, "richTextIds");
        this.rootIds = list;
        this.elements = map;
        this.imageIds = list2;
        this.buttonIds = list3;
        this.richTextIds = list4;
    }
}
