package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/TextButtonProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "text", "", "actionId", "isDisable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getActionId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getText", "equals", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TextButtonProperty extends BaseProperty {
    private final String actionId;
    private final Boolean isDisable;
    private final String text;

    public final String getActionId() {
        return this.actionId;
    }

    public final String getText() {
        return this.text;
    }

    public final Boolean isDisable() {
        return this.isDisable;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int i2;
        int hashCode = super.hashCode() * 31;
        String str = this.text;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        String str2 = this.actionId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Boolean bool = this.isDisable;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return i5 + i3;
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
        if (obj != null) {
            TextButtonProperty textButtonProperty = (TextButtonProperty) obj;
            if (!(!Intrinsics.areEqual(this.text, textButtonProperty.text)) && !(!Intrinsics.areEqual(this.actionId, textButtonProperty.actionId)) && !(!Intrinsics.areEqual(this.isDisable, textButtonProperty.isDisable))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.TextButtonProperty");
    }

    public TextButtonProperty(String str, String str2, Boolean bool) {
        super(Type.TEXT_BUTTON);
        this.text = str;
        this.actionId = str2;
        this.isDisable = bool;
    }
}
