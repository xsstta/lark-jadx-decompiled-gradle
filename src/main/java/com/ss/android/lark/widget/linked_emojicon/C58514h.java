package com.ss.android.lark.widget.linked_emojicon;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.ss.android.lark.widget.span.TextStyleInfo;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.h */
public class C58514h extends MetricAffectingSpan {

    /* renamed from: a */
    private TextStyleInfo f144410a;

    /* renamed from: a */
    public TextStyleInfo mo198353a() {
        return this.f144410a;
    }

    public int hashCode() {
        return Objects.hash(this.f144410a);
    }

    public C58514h(TextStyleInfo textStyleInfo) {
        this.f144410a = textStyleInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f144410a.equals(((C58514h) obj).f144410a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        if (this.f144410a.textSize > 0) {
            textPaint.setTextSize((float) this.f144410a.textSize);
        }
        if (this.f144410a.textStyle != null) {
            textPaint.setTypeface(this.f144410a.textStyle);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.f144410a.textBgColor != 0) {
            textPaint.bgColor = this.f144410a.textBgColor;
        }
        if (this.f144410a.textSize > -1) {
            textPaint.setTextSize((float) this.f144410a.textSize);
        }
        if (this.f144410a.textColor != 0) {
            textPaint.setColor(this.f144410a.textColor);
        }
        if (this.f144410a.textStyle != null) {
            textPaint.setTypeface(this.f144410a.textStyle);
        }
        if (this.f144410a.isItalic) {
            textPaint.setTextSkewX(-0.25f);
        }
        if (this.f144410a.isBold) {
            textPaint.setFakeBoldText(true);
        }
        if (this.f144410a.isUnderlineText) {
            textPaint.setUnderlineText(true);
        }
        if (this.f144410a.isStrikeThruText) {
            textPaint.setStrikeThruText(true);
        }
    }
}
