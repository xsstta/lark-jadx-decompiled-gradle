package com.ss.android.lark.message.card.view.richtext;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;

public class YogaProperty implements Serializable {
    private static final long serialVersionUID = 5197740916295279064L;
    public int alignContent = -1;
    public int alignItems = -1;
    public int alignSelf = -1;
    public float aspectRatio = 1.0E21f;
    public float bottom = 1.0E21f;
    public int display = -1;
    public float flexBasis = 1.0E21f;
    public int flexDirection = -1;
    public float flexGrow = -1.0f;
    public float flexShrink = -1.0f;
    public int flexWrap = -1;
    public float height = 1.0E21f;
    public float heightPercent = 1.0E21f;
    public int justifyContent = -1;
    public float left = 1.0E21f;
    public float marginBottom = 1.0E21f;
    public float marginBottomPercent = 1.0E21f;
    public float marginLeft = 1.0E21f;
    public float marginLeftPercent = 1.0E21f;
    public float marginRight = 1.0E21f;
    public float marginRightPercent = 1.0E21f;
    public float marginTop = 1.0E21f;
    public float marginTopPercent = 1.0E21f;
    public float maxHeight = 1.0E21f;
    public float maxHeightPercent = 1.0E21f;
    public float maxWidth = 1.0E21f;
    public float maxWidthPercent = 1.0E21f;
    public float minHeight = 1.0E21f;
    public float minHeightPercent = 1.0E21f;
    public float minWidth = 1.0E21f;
    public float minWidthPercent = 1.0E21f;
    public float paddingBottom;
    public float paddingLeft;
    public float paddingRight;
    public float paddingTop;
    public int position = -1;
    public float right = 1.0E21f;
    public float top = 1.0E21f;
    public float width = 1.0E21f;
    public float widthPercent = 1.0E21f;

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28 = ((this.flexDirection * 31) + this.flexWrap) * 31;
        float f = this.flexBasis;
        int i29 = 0;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i30 = (i28 + i) * 31;
        float f2 = this.flexGrow;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i31 = (i30 + i2) * 31;
        float f3 = this.flexShrink;
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i32 = (((((((((((((i31 + i3) * 31) + this.justifyContent) * 31) + this.alignContent) * 31) + this.alignItems) * 31) + this.alignSelf) * 31) + this.display) * 31) + this.position) * 31;
        float f4 = this.aspectRatio;
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i33 = (i32 + i4) * 31;
        float f5 = this.maxWidth;
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            i5 = Float.floatToIntBits(f5);
        } else {
            i5 = 0;
        }
        int i34 = (i33 + i5) * 31;
        float f6 = this.maxWidthPercent;
        if (f6 != BitmapDescriptorFactory.HUE_RED) {
            i6 = Float.floatToIntBits(f6);
        } else {
            i6 = 0;
        }
        int i35 = (i34 + i6) * 31;
        float f7 = this.minWidth;
        if (f7 != BitmapDescriptorFactory.HUE_RED) {
            i7 = Float.floatToIntBits(f7);
        } else {
            i7 = 0;
        }
        int i36 = (i35 + i7) * 31;
        float f8 = this.minWidthPercent;
        if (f8 != BitmapDescriptorFactory.HUE_RED) {
            i8 = Float.floatToIntBits(f8);
        } else {
            i8 = 0;
        }
        int i37 = (i36 + i8) * 31;
        float f9 = this.width;
        if (f9 != BitmapDescriptorFactory.HUE_RED) {
            i9 = Float.floatToIntBits(f9);
        } else {
            i9 = 0;
        }
        int i38 = (i37 + i9) * 31;
        float f10 = this.widthPercent;
        if (f10 != BitmapDescriptorFactory.HUE_RED) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i39 = (i38 + i10) * 31;
        float f11 = this.maxHeight;
        if (f11 != BitmapDescriptorFactory.HUE_RED) {
            i11 = Float.floatToIntBits(f11);
        } else {
            i11 = 0;
        }
        int i40 = (i39 + i11) * 31;
        float f12 = this.maxHeightPercent;
        if (f12 != BitmapDescriptorFactory.HUE_RED) {
            i12 = Float.floatToIntBits(f12);
        } else {
            i12 = 0;
        }
        int i41 = (i40 + i12) * 31;
        float f13 = this.minHeight;
        if (f13 != BitmapDescriptorFactory.HUE_RED) {
            i13 = Float.floatToIntBits(f13);
        } else {
            i13 = 0;
        }
        int i42 = (i41 + i13) * 31;
        float f14 = this.minHeightPercent;
        if (f14 != BitmapDescriptorFactory.HUE_RED) {
            i14 = Float.floatToIntBits(f14);
        } else {
            i14 = 0;
        }
        int i43 = (i42 + i14) * 31;
        float f15 = this.height;
        if (f15 != BitmapDescriptorFactory.HUE_RED) {
            i15 = Float.floatToIntBits(f15);
        } else {
            i15 = 0;
        }
        int i44 = (i43 + i15) * 31;
        float f16 = this.heightPercent;
        if (f16 != BitmapDescriptorFactory.HUE_RED) {
            i16 = Float.floatToIntBits(f16);
        } else {
            i16 = 0;
        }
        int i45 = (i44 + i16) * 31;
        float f17 = this.marginTop;
        if (f17 != BitmapDescriptorFactory.HUE_RED) {
            i17 = Float.floatToIntBits(f17);
        } else {
            i17 = 0;
        }
        int i46 = (i45 + i17) * 31;
        float f18 = this.marginRight;
        if (f18 != BitmapDescriptorFactory.HUE_RED) {
            i18 = Float.floatToIntBits(f18);
        } else {
            i18 = 0;
        }
        int i47 = (i46 + i18) * 31;
        float f19 = this.marginBottom;
        if (f19 != BitmapDescriptorFactory.HUE_RED) {
            i19 = Float.floatToIntBits(f19);
        } else {
            i19 = 0;
        }
        int i48 = (i47 + i19) * 31;
        float f20 = this.marginLeft;
        if (f20 != BitmapDescriptorFactory.HUE_RED) {
            i20 = Float.floatToIntBits(f20);
        } else {
            i20 = 0;
        }
        int i49 = (i48 + i20) * 31;
        float f21 = this.paddingTop;
        if (f21 != BitmapDescriptorFactory.HUE_RED) {
            i21 = Float.floatToIntBits(f21);
        } else {
            i21 = 0;
        }
        int i50 = (i49 + i21) * 31;
        float f22 = this.paddingRight;
        if (f22 != BitmapDescriptorFactory.HUE_RED) {
            i22 = Float.floatToIntBits(f22);
        } else {
            i22 = 0;
        }
        int i51 = (i50 + i22) * 31;
        float f23 = this.paddingBottom;
        if (f23 != BitmapDescriptorFactory.HUE_RED) {
            i23 = Float.floatToIntBits(f23);
        } else {
            i23 = 0;
        }
        int i52 = (i51 + i23) * 31;
        float f24 = this.paddingLeft;
        if (f24 != BitmapDescriptorFactory.HUE_RED) {
            i24 = Float.floatToIntBits(f24);
        } else {
            i24 = 0;
        }
        int i53 = (i52 + i24) * 31;
        float f25 = this.top;
        if (f25 != BitmapDescriptorFactory.HUE_RED) {
            i25 = Float.floatToIntBits(f25);
        } else {
            i25 = 0;
        }
        int i54 = (i53 + i25) * 31;
        float f26 = this.right;
        if (f26 != BitmapDescriptorFactory.HUE_RED) {
            i26 = Float.floatToIntBits(f26);
        } else {
            i26 = 0;
        }
        int i55 = (i54 + i26) * 31;
        float f27 = this.bottom;
        if (f27 != BitmapDescriptorFactory.HUE_RED) {
            i27 = Float.floatToIntBits(f27);
        } else {
            i27 = 0;
        }
        int i56 = (i55 + i27) * 31;
        float f28 = this.left;
        if (f28 != BitmapDescriptorFactory.HUE_RED) {
            i29 = Float.floatToIntBits(f28);
        }
        return i56 + i29;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YogaProperty yogaProperty = (YogaProperty) obj;
        if (this.flexDirection == yogaProperty.flexDirection && this.flexWrap == yogaProperty.flexWrap && Float.compare(yogaProperty.flexBasis, this.flexBasis) == 0 && Float.compare(yogaProperty.flexGrow, this.flexGrow) == 0 && Float.compare(yogaProperty.flexShrink, this.flexShrink) == 0 && this.justifyContent == yogaProperty.justifyContent && this.alignContent == yogaProperty.alignContent && this.alignItems == yogaProperty.alignItems && this.alignSelf == yogaProperty.alignSelf && this.display == yogaProperty.display && this.position == yogaProperty.position && this.aspectRatio == yogaProperty.aspectRatio && Float.compare(yogaProperty.maxWidth, this.maxWidth) == 0 && Float.compare(yogaProperty.maxWidthPercent, this.maxWidthPercent) == 0 && Float.compare(yogaProperty.minWidth, this.minWidth) == 0 && Float.compare(yogaProperty.minWidthPercent, this.minWidthPercent) == 0 && Float.compare(yogaProperty.width, this.width) == 0 && Float.compare(yogaProperty.widthPercent, this.widthPercent) == 0 && Float.compare(yogaProperty.maxHeight, this.maxHeight) == 0 && Float.compare(yogaProperty.maxHeightPercent, this.maxHeightPercent) == 0 && Float.compare(yogaProperty.minHeight, this.minHeight) == 0 && Float.compare(yogaProperty.minHeightPercent, this.minHeightPercent) == 0 && Float.compare(yogaProperty.height, this.height) == 0 && Float.compare(yogaProperty.heightPercent, this.heightPercent) == 0 && Float.compare(yogaProperty.marginTop, this.marginTop) == 0 && Float.compare(yogaProperty.marginRight, this.marginRight) == 0 && Float.compare(yogaProperty.marginBottom, this.marginBottom) == 0 && Float.compare(yogaProperty.marginLeft, this.marginLeft) == 0 && Float.compare(yogaProperty.paddingTop, this.paddingTop) == 0 && Float.compare(yogaProperty.paddingRight, this.paddingRight) == 0 && Float.compare(yogaProperty.paddingBottom, this.paddingBottom) == 0 && Float.compare(yogaProperty.paddingLeft, this.paddingLeft) == 0 && Float.compare(yogaProperty.top, this.top) == 0 && Float.compare(yogaProperty.right, this.right) == 0 && Float.compare(yogaProperty.bottom, this.bottom) == 0 && Float.compare(yogaProperty.left, this.left) == 0) {
            return true;
        }
        return false;
    }
}
