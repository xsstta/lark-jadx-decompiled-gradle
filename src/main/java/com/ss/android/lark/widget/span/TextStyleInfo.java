package com.ss.android.lark.widget.span;

import android.graphics.Typeface;
import java.util.Objects;

public class TextStyleInfo extends SpanInfo {
    public boolean isBold;
    public boolean isIndependent = true;
    public boolean isItalic;
    public boolean isStrikeThruText;
    public boolean isUnderlineText;
    public int textBgColor;
    public int textColor;
    public int textSize = -1;
    public Typeface textStyle;

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.textSize), Integer.valueOf(this.textColor), Integer.valueOf(this.textBgColor), this.textStyle, Boolean.valueOf(this.isUnderlineText), Boolean.valueOf(this.isStrikeThruText), Boolean.valueOf(this.isBold), Boolean.valueOf(this.isItalic), Boolean.valueOf(this.isIndependent));
    }

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyleInfo)) {
            return false;
        }
        TextStyleInfo textStyleInfo = (TextStyleInfo) obj;
        if (this.textSize == textStyleInfo.textSize && this.textColor == textStyleInfo.textColor && this.textBgColor == textStyleInfo.textBgColor && this.isUnderlineText == textStyleInfo.isUnderlineText && this.isStrikeThruText == textStyleInfo.isStrikeThruText && this.isBold == textStyleInfo.isBold && this.isItalic == textStyleInfo.isItalic && this.isIndependent == textStyleInfo.isIndependent && Objects.equals(this.textStyle, textStyleInfo.textStyle)) {
            return true;
        }
        return false;
    }
}
