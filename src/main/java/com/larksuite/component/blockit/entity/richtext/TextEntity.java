package com.larksuite.component.blockit.entity.richtext;

import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/larksuite/component/blockit/entity/richtext/TextEntity;", "Ljava/io/Serializable;", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "docEntity", "", "", "Lcom/ss/android/lark/doc/entity/Doc;", "(Lcom/ss/android/lark/widget/richtext/RichText;Ljava/util/Map;)V", "getDocEntity", "()Ljava/util/Map;", "getText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TextEntity implements Serializable {
    private final Map<String, Doc> docEntity;
    private RichText text;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.blockit.entity.richtext.TextEntity */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextEntity copy$default(TextEntity textEntity, RichText richText, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            richText = textEntity.text;
        }
        if ((i & 2) != 0) {
            map = textEntity.docEntity;
        }
        return textEntity.copy(richText, map);
    }

    public final RichText component1() {
        return this.text;
    }

    public final Map<String, Doc> component2() {
        return this.docEntity;
    }

    public final TextEntity copy(RichText richText, Map<String, ? extends Doc> map) {
        return new TextEntity(richText, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextEntity)) {
            return false;
        }
        TextEntity textEntity = (TextEntity) obj;
        return Intrinsics.areEqual(this.text, textEntity.text) && Intrinsics.areEqual(this.docEntity, textEntity.docEntity);
    }

    public int hashCode() {
        RichText richText = this.text;
        int i = 0;
        int hashCode = (richText != null ? richText.hashCode() : 0) * 31;
        Map<String, Doc> map = this.docEntity;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TextEntity(text=" + this.text + ", docEntity=" + this.docEntity + ")";
    }

    public final Map<String, Doc> getDocEntity() {
        return this.docEntity;
    }

    public final RichText getText() {
        return this.text;
    }

    public final void setText(RichText richText) {
        this.text = richText;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.lark.doc.entity.Doc> */
    /* JADX WARN: Multi-variable type inference failed */
    public TextEntity(RichText richText, Map<String, ? extends Doc> map) {
        this.text = richText;
        this.docEntity = map;
    }
}
