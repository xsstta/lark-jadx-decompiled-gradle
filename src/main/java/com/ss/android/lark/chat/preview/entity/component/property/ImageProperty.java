package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0000H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/ImageProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "image", "Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "alt", "", "(Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;Ljava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getImage", "()Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "clone", "equals", "", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImageProperty extends BaseProperty {
    private final String alt;
    private final ImageSet image;

    public final String getAlt() {
        return this.alt;
    }

    public final ImageSet getImage() {
        return this.image;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        ImageSet imageSet = this.image;
        int i2 = 0;
        if (imageSet != null) {
            i = imageSet.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.alt;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public ImageProperty clone() {
        ImageProperty imageProperty = new ImageProperty(this.image, this.alt);
        imageProperty.setMarginLeft(getMarginLeft());
        imageProperty.setMarginRight(getMarginRight());
        imageProperty.setMarginTop(getMarginTop());
        imageProperty.setMarginBottom(getMarginBottom());
        return imageProperty;
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
            ImageProperty imageProperty = (ImageProperty) obj;
            if (!(!Intrinsics.areEqual(this.image, imageProperty.image)) && !(!Intrinsics.areEqual(this.alt, imageProperty.alt))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ImageProperty");
    }

    public ImageProperty(ImageSet imageSet, String str) {
        super(Type.IMAGE);
        this.image = imageSet;
        this.alt = str;
    }
}
