package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0000H\u0016J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/IconButtonProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "iconKey", "Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "actionId", "", "isDisable", "", "alt", "(Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "getAlt", "getIconKey", "()Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "clone", "equals", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IconButtonProperty extends BaseProperty {
    private final String actionId;
    private final String alt;
    private final ImageSet iconKey;
    private final Boolean isDisable;

    public final String getActionId() {
        return this.actionId;
    }

    public final String getAlt() {
        return this.alt;
    }

    public final ImageSet getIconKey() {
        return this.iconKey;
    }

    public final Boolean isDisable() {
        return this.isDisable;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public IconButtonProperty clone() {
        IconButtonProperty iconButtonProperty = new IconButtonProperty(this.iconKey, this.actionId, this.isDisable, this.alt);
        iconButtonProperty.setMarginLeft(getMarginLeft());
        iconButtonProperty.setMarginRight(getMarginRight());
        iconButtonProperty.setMarginTop(getMarginTop());
        iconButtonProperty.setMarginBottom(getMarginBottom());
        return iconButtonProperty;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = super.hashCode() * 31;
        ImageSet imageSet = this.iconKey;
        int i4 = 0;
        if (imageSet != null) {
            i = imageSet.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        String str = this.actionId;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Boolean bool = this.isDisable;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.alt;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i7 + i4;
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
            IconButtonProperty iconButtonProperty = (IconButtonProperty) obj;
            if (!(!Intrinsics.areEqual(this.iconKey, iconButtonProperty.iconKey)) && !(!Intrinsics.areEqual(this.actionId, iconButtonProperty.actionId)) && !(!Intrinsics.areEqual(this.isDisable, iconButtonProperty.isDisable)) && !(!Intrinsics.areEqual(this.alt, iconButtonProperty.alt))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.IconButtonProperty");
    }

    public IconButtonProperty(ImageSet imageSet, String str, Boolean bool, String str2) {
        super(Type.ICON_BUTTON);
        this.iconKey = imageSet;
        this.actionId = str;
        this.isDisable = bool;
        this.alt = str2;
    }
}
