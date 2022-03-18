package com.ss.android.lark.chat.preview.entity.component.property;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.Align;
import com.ss.android.lark.chat.preview.entity.component.Justify;
import com.ss.android.lark.chat.preview.entity.component.Orientation;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0000H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/LinearLayoutProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "orientation", "Lcom/ss/android/lark/chat/preview/entity/component/Orientation;", "spacing", "", "wrapWidth", "padding", "mainAxisJustify", "Lcom/ss/android/lark/chat/preview/entity/component/Justify;", "crossAxisAlign", "Lcom/ss/android/lark/chat/preview/entity/component/Align;", "(Lcom/ss/android/lark/chat/preview/entity/component/Orientation;FFFLcom/ss/android/lark/chat/preview/entity/component/Justify;Lcom/ss/android/lark/chat/preview/entity/component/Align;)V", "getCrossAxisAlign", "()Lcom/ss/android/lark/chat/preview/entity/component/Align;", "getMainAxisJustify", "()Lcom/ss/android/lark/chat/preview/entity/component/Justify;", "getOrientation", "()Lcom/ss/android/lark/chat/preview/entity/component/Orientation;", "getPadding", "()F", "getSpacing", "getWrapWidth", "clone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LinearLayoutProperty extends BaseProperty {
    private final Align crossAxisAlign;
    private final Justify mainAxisJustify;
    private final Orientation orientation;
    private final float padding;
    private final float spacing;
    private final float wrapWidth;

    public LinearLayoutProperty() {
        this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 63, null);
    }

    public static /* synthetic */ LinearLayoutProperty copy$default(LinearLayoutProperty linearLayoutProperty, Orientation orientation2, float f, float f2, float f3, Justify justify, Align align, int i, Object obj) {
        if ((i & 1) != 0) {
            orientation2 = linearLayoutProperty.orientation;
        }
        if ((i & 2) != 0) {
            f = linearLayoutProperty.spacing;
        }
        if ((i & 4) != 0) {
            f2 = linearLayoutProperty.wrapWidth;
        }
        if ((i & 8) != 0) {
            f3 = linearLayoutProperty.padding;
        }
        if ((i & 16) != 0) {
            justify = linearLayoutProperty.mainAxisJustify;
        }
        if ((i & 32) != 0) {
            align = linearLayoutProperty.crossAxisAlign;
        }
        return linearLayoutProperty.copy(orientation2, f, f2, f3, justify, align);
    }

    public final Orientation component1() {
        return this.orientation;
    }

    public final float component2() {
        return this.spacing;
    }

    public final float component3() {
        return this.wrapWidth;
    }

    public final float component4() {
        return this.padding;
    }

    public final Justify component5() {
        return this.mainAxisJustify;
    }

    public final Align component6() {
        return this.crossAxisAlign;
    }

    public final LinearLayoutProperty copy(Orientation orientation2, float f, float f2, float f3, Justify justify, Align align) {
        Intrinsics.checkParameterIsNotNull(orientation2, "orientation");
        Intrinsics.checkParameterIsNotNull(justify, "mainAxisJustify");
        Intrinsics.checkParameterIsNotNull(align, "crossAxisAlign");
        return new LinearLayoutProperty(orientation2, f, f2, f3, justify, align);
    }

    public String toString() {
        return "LinearLayoutProperty(orientation=" + this.orientation + ", spacing=" + this.spacing + ", wrapWidth=" + this.wrapWidth + ", padding=" + this.padding + ", mainAxisJustify=" + this.mainAxisJustify + ", crossAxisAlign=" + this.crossAxisAlign + ")";
    }

    public final Align getCrossAxisAlign() {
        return this.crossAxisAlign;
    }

    public final Justify getMainAxisJustify() {
        return this.mainAxisJustify;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final float getPadding() {
        return this.padding;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final float getWrapWidth() {
        return this.wrapWidth;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public LinearLayoutProperty clone() {
        LinearLayoutProperty linearLayoutProperty = new LinearLayoutProperty(this.orientation, this.spacing, this.wrapWidth, this.padding, this.mainAxisJustify, this.crossAxisAlign);
        linearLayoutProperty.setMarginLeft(getMarginLeft());
        linearLayoutProperty.setMarginRight(getMarginRight());
        linearLayoutProperty.setMarginTop(getMarginTop());
        linearLayoutProperty.setMarginBottom(getMarginBottom());
        return linearLayoutProperty;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        Integer num;
        int hashCode = super.hashCode() * 31;
        Orientation orientation2 = this.orientation;
        Integer num2 = null;
        if (orientation2 != null) {
            num = Integer.valueOf(orientation2.hashCode());
        } else {
            num = null;
        }
        int intValue = (((((((((hashCode + num.intValue()) * 31) + Float.valueOf(this.spacing).hashCode()) * 31) + Float.valueOf(this.wrapWidth).hashCode()) * 31) + Float.valueOf(this.padding).hashCode()) * 31) + this.mainAxisJustify.hashCode()) * 31;
        Align align = this.crossAxisAlign;
        if (align != null) {
            num2 = Integer.valueOf(align.hashCode());
        }
        return intValue + num2.intValue();
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
            LinearLayoutProperty linearLayoutProperty = (LinearLayoutProperty) obj;
            if (this.orientation == linearLayoutProperty.orientation && this.spacing == linearLayoutProperty.spacing && this.wrapWidth == linearLayoutProperty.wrapWidth && this.padding == linearLayoutProperty.padding && this.mainAxisJustify == linearLayoutProperty.mainAxisJustify && this.crossAxisAlign == linearLayoutProperty.crossAxisAlign) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinearLayoutProperty(Orientation orientation2, float f, float f2, float f3, Justify justify, Align align) {
        super(Type.LINEAR_LAYOUT);
        Intrinsics.checkParameterIsNotNull(orientation2, "orientation");
        Intrinsics.checkParameterIsNotNull(justify, "mainAxisJustify");
        Intrinsics.checkParameterIsNotNull(align, "crossAxisAlign");
        this.orientation = orientation2;
        this.spacing = f;
        this.wrapWidth = f2;
        this.padding = f3;
        this.mainAxisJustify = justify;
        this.crossAxisAlign = align;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LinearLayoutProperty(com.ss.android.lark.chat.preview.entity.component.Orientation r5, float r6, float r7, float r8, com.ss.android.lark.chat.preview.entity.component.Justify r9, com.ss.android.lark.chat.preview.entity.component.Align r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            com.ss.android.lark.chat.preview.entity.component.Orientation r5 = com.ss.android.lark.chat.preview.entity.component.Orientation.ROW
        L_0x0006:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000d
            r12 = 0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0014
            r1 = 0
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r8
        L_0x001b:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            com.ss.android.lark.chat.preview.entity.component.Justify r9 = com.ss.android.lark.chat.preview.entity.component.Justify.START
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            com.ss.android.lark.chat.preview.entity.component.Align r10 = com.ss.android.lark.chat.preview.entity.component.Align.TOP
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r0
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty.<init>(com.ss.android.lark.chat.preview.entity.component.Orientation, float, float, float, com.ss.android.lark.chat.preview.entity.component.Justify, com.ss.android.lark.chat.preview.entity.component.Align, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
