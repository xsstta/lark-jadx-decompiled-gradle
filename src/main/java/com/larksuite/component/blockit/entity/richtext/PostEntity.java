package com.larksuite.component.blockit.entity.richtext;

import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/larksuite/component/blockit/entity/richtext/PostEntity;", "Ljava/io/Serializable;", "title", "", "content", "Lcom/ss/android/lark/widget/richtext/RichText;", "docEntity", "", "Lcom/ss/android/lark/doc/entity/Doc;", "(Ljava/lang/String;Lcom/ss/android/lark/widget/richtext/RichText;Ljava/util/Map;)V", "getContent", "()Lcom/ss/android/lark/widget/richtext/RichText;", "getDocEntity", "()Ljava/util/Map;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PostEntity implements Serializable {
    private final RichText content;
    private final Map<String, Doc> docEntity;
    private String title;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.blockit.entity.richtext.PostEntity */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostEntity copy$default(PostEntity postEntity, String str, RichText richText, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postEntity.title;
        }
        if ((i & 2) != 0) {
            richText = postEntity.content;
        }
        if ((i & 4) != 0) {
            map = postEntity.docEntity;
        }
        return postEntity.copy(str, richText, map);
    }

    public final String component1() {
        return this.title;
    }

    public final RichText component2() {
        return this.content;
    }

    public final Map<String, Doc> component3() {
        return this.docEntity;
    }

    public final PostEntity copy(String str, RichText richText, Map<String, ? extends Doc> map) {
        return new PostEntity(str, richText, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostEntity)) {
            return false;
        }
        PostEntity postEntity = (PostEntity) obj;
        return Intrinsics.areEqual(this.title, postEntity.title) && Intrinsics.areEqual(this.content, postEntity.content) && Intrinsics.areEqual(this.docEntity, postEntity.docEntity);
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RichText richText = this.content;
        int hashCode2 = (hashCode + (richText != null ? richText.hashCode() : 0)) * 31;
        Map<String, Doc> map = this.docEntity;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PostEntity(title=" + this.title + ", content=" + this.content + ", docEntity=" + this.docEntity + ")";
    }

    public final RichText getContent() {
        return this.content;
    }

    public final Map<String, Doc> getDocEntity() {
        return this.docEntity;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.lark.doc.entity.Doc> */
    /* JADX WARN: Multi-variable type inference failed */
    public PostEntity(String str, RichText richText, Map<String, ? extends Doc> map) {
        this.title = str;
        this.content = richText;
        this.docEntity = map;
    }
}
