package com.ss.android.lark.message.card.view.richtext;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NodeParams implements Serializable {
    private static final long serialVersionUID = 3325780907521169105L;
    public int cardVersion = -1;
    public int mBgColor;
    public List<NodeParams> mChildParams = new ArrayList();
    public float mDefaultTextSize = -1.0f;
    public Map<String, String> mExtraProperties;
    public int mFontStyleAndWeight = 0;
    public NodeParams mParents;
    public RichTextElement.RichTextProperty mRichTextProperty;
    public RichTextElement.RichTextTag mRichTextTag;
    public transient CharSequence mSpannableString;
    public List<String> mStyleKeys = new ArrayList();
    public int mTextColor;
    public float mTextSize = -1.0f;
    public YogaProperty mYogaProperty = new YogaProperty();

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        YogaProperty yogaProperty = this.mYogaProperty;
        int i6 = 0;
        if (yogaProperty != null) {
            i = yogaProperty.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        RichTextElement.RichTextTag richTextTag = this.mRichTextTag;
        if (richTextTag != null) {
            i2 = richTextTag.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        RichTextElement.RichTextProperty richTextProperty = this.mRichTextProperty;
        if (richTextProperty != null) {
            i3 = richTextProperty.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        NodeParams nodeParams = this.mParents;
        if (nodeParams != null) {
            i4 = nodeParams.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        List<NodeParams> list = this.mChildParams;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (((((((i10 + i5) * 31) + this.mBgColor) * 31) + this.mTextColor) * 31) + this.mFontStyleAndWeight) * 31;
        float f = this.mTextSize;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            i6 = Float.floatToIntBits(f);
        }
        return i11 + i6;
    }

    public NodeParams(int i) {
        this.cardVersion = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeParams nodeParams = (NodeParams) obj;
        if (this.mBgColor != nodeParams.mBgColor || this.mTextColor != nodeParams.mTextColor || this.mFontStyleAndWeight != nodeParams.mFontStyleAndWeight || Float.compare(nodeParams.mTextSize, this.mTextSize) != 0) {
            return false;
        }
        YogaProperty yogaProperty = this.mYogaProperty;
        if (yogaProperty == null ? nodeParams.mYogaProperty != null : !yogaProperty.equals(nodeParams.mYogaProperty)) {
            return false;
        }
        if (this.mRichTextTag != nodeParams.mRichTextTag) {
            return false;
        }
        RichTextElement.RichTextProperty richTextProperty = this.mRichTextProperty;
        if (richTextProperty == null ? nodeParams.mRichTextProperty != null : !richTextProperty.equals(nodeParams.mRichTextProperty)) {
            return false;
        }
        NodeParams nodeParams2 = this.mParents;
        if (nodeParams2 == null ? nodeParams.mParents != null : !nodeParams2.equals(nodeParams.mParents)) {
            return false;
        }
        List<NodeParams> list = this.mChildParams;
        if (list == null ? nodeParams.mChildParams == null : list.hashCode() == nodeParams.mChildParams.hashCode()) {
            return true;
        }
        return false;
    }
}
