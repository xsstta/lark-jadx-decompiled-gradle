package com.ss.android.lark.chat.preview.entity.component.property;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.Direction;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.tangram.base.props.Props;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\t\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/ButtonProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "iconKey", "Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "text", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/ss/android/lark/chat/preview/entity/component/Direction;", "actionId", "isDisable", "", "(Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;Ljava/lang/String;Lcom/ss/android/lark/chat/preview/entity/component/Direction;Ljava/lang/String;Ljava/lang/Boolean;)V", "getActionId", "()Ljava/lang/String;", "getDirection", "()Lcom/ss/android/lark/chat/preview/entity/component/Direction;", "getIconKey", "()Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getText", "clone", "Lcom/ss/android/lark/tangram/base/props/Props;", "equals", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ButtonProperty extends BaseProperty {
    private final String actionId;
    private final Direction direction;
    private final ImageSet iconKey;
    private final Boolean isDisable;
    private final String text;

    public final String getActionId() {
        return this.actionId;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final ImageSet getIconKey() {
        return this.iconKey;
    }

    public final String getText() {
        return this.text;
    }

    public final Boolean isDisable() {
        return this.isDisable;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public Props clone() {
        ButtonProperty buttonProperty = new ButtonProperty(this.iconKey, this.text, this.direction, this.actionId, this.isDisable);
        buttonProperty.setMarginLeft(getMarginLeft());
        buttonProperty.setMarginRight(getMarginRight());
        buttonProperty.setMarginTop(getMarginTop());
        buttonProperty.setMarginBottom(getMarginBottom());
        return buttonProperty;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        ImageSet imageSet = this.iconKey;
        int i5 = 0;
        if (imageSet != null) {
            i = imageSet.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        String str = this.text;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Direction direction2 = this.direction;
        if (direction2 != null) {
            i3 = direction2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.actionId;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Boolean bool = this.isDisable;
        if (bool != null) {
            i5 = bool.hashCode();
        }
        return i9 + i5;
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
            ButtonProperty buttonProperty = (ButtonProperty) obj;
            if (!(!Intrinsics.areEqual(this.iconKey, buttonProperty.iconKey)) && !(!Intrinsics.areEqual(this.text, buttonProperty.text)) && this.direction == buttonProperty.direction && !(!Intrinsics.areEqual(this.actionId, buttonProperty.actionId)) && !(!Intrinsics.areEqual(this.isDisable, buttonProperty.isDisable))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.ButtonProperty");
    }

    public ButtonProperty(ImageSet imageSet, String str, Direction direction2, String str2, Boolean bool) {
        super(Type.BUTTON);
        this.iconKey = imageSet;
        this.text = str;
        this.direction = direction2;
        this.actionId = str2;
        this.isDisable = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonProperty(ImageSet imageSet, String str, Direction direction2, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSet, str, (i & 4) != 0 ? Direction.LTR : direction2, str2, bool);
    }
}
