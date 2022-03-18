package com.ss.android.lark.message.card.view.richtext;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.message.card.view.richtext.g */
public class C45374g {
    /* renamed from: a */
    public static YogaNode m180200a(YogaProperty yogaProperty) {
        YogaNode yogaNode = new YogaNode();
        if (yogaProperty == null) {
            return yogaNode;
        }
        if (yogaProperty.position != -1) {
            yogaNode.setPositionType(YogaPositionType.fromInt(yogaProperty.position));
        } else {
            yogaNode.setPositionType(YogaPositionType.RELATIVE);
        }
        if (!YogaConstants.isUndefined(yogaProperty.aspectRatio)) {
            yogaNode.setAspectRatio(yogaProperty.aspectRatio);
        }
        if (yogaProperty.flexDirection != -1) {
            yogaNode.setFlexDirection(YogaFlexDirection.fromInt(yogaProperty.flexDirection));
        } else {
            yogaNode.setFlexDirection(YogaFlexDirection.ROW);
        }
        if (yogaProperty.flexWrap != -1) {
            yogaNode.setWrap(YogaWrap.fromInt(yogaProperty.flexWrap));
        } else {
            yogaNode.setWrap(YogaWrap.WRAP);
        }
        if (!YogaConstants.isUndefined(yogaProperty.flexBasis)) {
            yogaNode.setFlexBasis(yogaProperty.flexBasis);
        } else {
            yogaNode.setFlexBasisAuto();
        }
        if (Float.compare(yogaProperty.flexGrow, -1.0f) != 0) {
            yogaNode.setFlexGrow(yogaProperty.flexGrow);
        } else {
            yogaNode.setFlexGrow(BitmapDescriptorFactory.HUE_RED);
        }
        if (Float.compare(yogaProperty.flexShrink, -1.0f) != 0) {
            yogaNode.setFlexShrink(yogaProperty.flexShrink);
        } else {
            yogaNode.setFlexShrink(1.0f);
        }
        if (yogaProperty.justifyContent != -1) {
            yogaNode.setJustifyContent(YogaJustify.fromInt(yogaProperty.justifyContent));
        } else {
            yogaNode.setJustifyContent(YogaJustify.FLEX_START);
        }
        if (yogaProperty.alignContent != -1) {
            yogaNode.setAlignContent(YogaAlign.fromInt(yogaProperty.alignContent));
        } else {
            yogaNode.setAlignContent(YogaAlign.AUTO);
        }
        if (yogaProperty.alignItems != -1) {
            yogaNode.setAlignItems(YogaAlign.fromInt(yogaProperty.alignItems));
        } else {
            yogaNode.setAlignItems(YogaAlign.STRETCH);
        }
        if (yogaProperty.alignSelf != -1) {
            yogaNode.setAlignSelf(YogaAlign.fromInt(yogaProperty.alignSelf));
        } else {
            yogaNode.setAlignSelf(YogaAlign.AUTO);
        }
        if (yogaProperty.display != -1) {
            yogaNode.setDisplay(YogaDisplay.fromInt(yogaProperty.display));
        } else {
            yogaNode.setDisplay(YogaDisplay.FLEX);
        }
        if (!YogaConstants.isUndefined(yogaProperty.maxWidth)) {
            yogaNode.setMaxWidth(yogaProperty.maxWidth);
        } else if (!YogaConstants.isUndefined(yogaProperty.maxWidthPercent)) {
            yogaNode.setMaxWidthPercent(yogaProperty.maxWidthPercent);
        }
        if (!YogaConstants.isUndefined(yogaProperty.minWidth)) {
            yogaNode.setMinWidth(yogaProperty.minWidth);
        } else if (!YogaConstants.isUndefined(yogaProperty.minWidthPercent)) {
            yogaNode.setMinWidthPercent(yogaProperty.minWidthPercent);
        }
        if (!YogaConstants.isUndefined(yogaProperty.width)) {
            yogaNode.setWidth(yogaProperty.width);
        } else if (!YogaConstants.isUndefined(yogaProperty.widthPercent)) {
            yogaNode.setWidthPercent(yogaProperty.widthPercent);
        } else {
            yogaNode.setWidthAuto();
        }
        if (!YogaConstants.isUndefined(yogaProperty.maxHeight)) {
            yogaNode.setMaxHeight(yogaProperty.maxHeight);
        } else if (!YogaConstants.isUndefined(yogaProperty.maxHeightPercent)) {
            yogaNode.setMaxHeightPercent(yogaProperty.maxHeightPercent);
        }
        if (!YogaConstants.isUndefined(yogaProperty.minHeight)) {
            yogaNode.setMinHeight(yogaProperty.minHeight);
        } else if (!YogaConstants.isUndefined(yogaProperty.minHeightPercent)) {
            yogaNode.setMinHeightPercent(yogaProperty.minHeightPercent);
        }
        if (!YogaConstants.isUndefined(yogaProperty.height)) {
            yogaNode.setHeight(yogaProperty.height);
        } else if (!YogaConstants.isUndefined(yogaProperty.heightPercent)) {
            yogaNode.setHeightPercent(yogaProperty.heightPercent);
        } else {
            yogaNode.setHeightAuto();
        }
        if (!YogaConstants.isUndefined(yogaProperty.marginTop)) {
            yogaNode.setMargin(YogaEdge.TOP, yogaProperty.marginTop);
        } else if (!YogaConstants.isUndefined(yogaProperty.marginTopPercent)) {
            yogaNode.setMarginPercent(YogaEdge.TOP, yogaProperty.marginTopPercent);
        }
        if (!YogaConstants.isUndefined(yogaProperty.marginRight)) {
            yogaNode.setMargin(YogaEdge.RIGHT, yogaProperty.marginRight);
        } else if (!YogaConstants.isUndefined(yogaProperty.marginRightPercent)) {
            yogaNode.setMarginPercent(YogaEdge.RIGHT, yogaProperty.marginRightPercent);
        }
        if (!YogaConstants.isUndefined(yogaProperty.marginBottom)) {
            yogaNode.setMargin(YogaEdge.BOTTOM, yogaProperty.marginBottom);
        } else if (!YogaConstants.isUndefined(yogaProperty.marginBottomPercent)) {
            yogaNode.setMarginPercent(YogaEdge.BOTTOM, yogaProperty.marginBottomPercent);
        }
        if (!YogaConstants.isUndefined(yogaProperty.marginLeft)) {
            yogaNode.setMargin(YogaEdge.LEFT, yogaProperty.marginLeft);
        } else if (!YogaConstants.isUndefined(yogaProperty.marginLeftPercent)) {
            yogaNode.setMarginPercent(YogaEdge.LEFT, yogaProperty.marginLeftPercent);
        }
        yogaNode.setPadding(YogaEdge.TOP, yogaProperty.paddingTop);
        yogaNode.setPadding(YogaEdge.RIGHT, yogaProperty.paddingRight);
        yogaNode.setPadding(YogaEdge.BOTTOM, yogaProperty.paddingBottom);
        yogaNode.setPadding(YogaEdge.LEFT, yogaProperty.paddingLeft);
        if (!YogaConstants.isUndefined(yogaProperty.left)) {
            yogaNode.setPosition(YogaEdge.LEFT, yogaProperty.left);
        }
        if (!YogaConstants.isUndefined(yogaProperty.right)) {
            yogaNode.setPosition(YogaEdge.RIGHT, yogaProperty.right);
        }
        if (!YogaConstants.isUndefined(yogaProperty.top)) {
            yogaNode.setPosition(YogaEdge.TOP, yogaProperty.top);
        }
        if (!YogaConstants.isUndefined(yogaProperty.bottom)) {
            yogaNode.setPosition(YogaEdge.BOTTOM, yogaProperty.bottom);
        }
        return yogaNode;
    }
}
