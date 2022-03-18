package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/TextViewProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "text", "", "numberOfLines", "", "(Ljava/lang/String;I)V", "getNumberOfLines", "()I", "getText", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TextViewProperty extends BaseProperty {
    private final int numberOfLines;
    private final String text;

    public final int getNumberOfLines() {
        return this.numberOfLines;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        return (((super.hashCode() * 31) + this.text.hashCode()) * 31) + this.text.hashCode();
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextViewProperty) || !super.equals(obj)) {
            return false;
        }
        TextViewProperty textViewProperty = (TextViewProperty) obj;
        if (!(!Intrinsics.areEqual(this.text, textViewProperty.text)) && this.numberOfLines == textViewProperty.numberOfLines) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextViewProperty(String str, int i) {
        super(Type.TEXT);
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.text = str;
        this.numberOfLines = i;
    }
}
