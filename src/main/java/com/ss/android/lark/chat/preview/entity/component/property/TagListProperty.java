package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/TagListProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "tagString", "", "", "(Ljava/util/List;)V", "getTagString", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TagListProperty extends BaseProperty {
    private final List<String> tagString;

    public final List<String> getTagString() {
        return this.tagString;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        List<String> list = this.tagString;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public TagListProperty(List<String> list) {
        super(Type.TAG_LIST);
        this.tagString = list;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TagListProperty) && super.equals(obj) && !(!Intrinsics.areEqual(this.tagString, ((TagListProperty) obj).tagString))) {
            return true;
        }
        return false;
    }
}
