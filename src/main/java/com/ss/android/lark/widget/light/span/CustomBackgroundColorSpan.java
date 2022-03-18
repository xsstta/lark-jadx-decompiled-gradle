package com.ss.android.lark.widget.light.span;

import android.text.style.BackgroundColorSpan;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/widget/light/span/CustomBackgroundColorSpan;", "Landroid/text/style/BackgroundColorSpan;", "color", "", "(I)V", "getColor", "()I", "setColor", "equals", "", "other", "", "hashCode", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CustomBackgroundColorSpan extends BackgroundColorSpan {

    /* renamed from: a */
    private int f144204a;

    public int hashCode() {
        return this.f144204a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CustomBackgroundColorSpan) && this.f144204a == ((CustomBackgroundColorSpan) obj).f144204a) {
            return true;
        }
        return false;
    }
}
