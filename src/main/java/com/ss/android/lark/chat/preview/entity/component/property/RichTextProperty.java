package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/RichTextProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "equals", "", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RichTextProperty extends BaseProperty {
    private final RichText richText;

    public final RichText getRichText() {
        return this.richText;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        RichText richText2 = this.richText;
        if (richText2 != null) {
            i = richText2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public RichTextProperty(RichText richText2) {
        super(Type.RICHTEXT);
        this.richText = richText2;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
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
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.RichTextProperty");
        } else if (!Intrinsics.areEqual(this.richText, ((RichTextProperty) obj).richText)) {
            return false;
        } else {
            return true;
        }
    }
}
