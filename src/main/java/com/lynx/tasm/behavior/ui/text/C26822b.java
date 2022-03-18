package com.lynx.tasm.behavior.ui.text;

import android.text.Layout;
import android.text.Spanned;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.shadow.text.C26718e;

/* renamed from: com.lynx.tasm.behavior.ui.text.b */
public class C26822b {
    /* renamed from: a */
    public static Spanned m97438a(Layout layout) {
        if (layout != null && (layout.getText() instanceof Spanned)) {
            return (Spanned) layout.getText();
        }
        return null;
    }

    /* renamed from: a */
    public static Spanned m97439a(AndroidText androidText) {
        if (androidText != null && (androidText.getText() instanceof Spanned)) {
            return (Spanned) androidText.getText();
        }
        return null;
    }

    /* renamed from: a */
    public static AbstractC26623a m97440a(float f, float f2, AbstractC26623a aVar, Layout layout, Spanned spanned) {
        C26718e[] eVarArr;
        if (layout != null && f <= ((float) layout.getWidth()) && f2 <= ((float) layout.getHeight())) {
            int lineForVertical = layout.getLineForVertical((int) f2);
            if (f2 <= ((float) layout.getLineBottom(lineForVertical)) && f2 >= ((float) layout.getLineTop(lineForVertical)) && f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) ((int) f));
                if (spanned != null) {
                    eVarArr = (C26718e[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C26718e.class);
                } else {
                    eVarArr = null;
                }
                if (!(eVarArr == null || eVarArr.length == 0)) {
                    int length = spanned.length();
                    int length2 = eVarArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length2) {
                        C26718e eVar = eVarArr[i];
                        int spanStart = spanned.getSpanStart(eVar);
                        int spanEnd = spanned.getSpanEnd(eVar);
                        if (offsetForHorizontal >= spanStart && offsetForHorizontal <= spanEnd && spanStart >= i2 && spanEnd <= length) {
                            aVar = eVar;
                        }
                        i++;
                        i2 = spanStart;
                        length = spanEnd;
                    }
                }
            }
        }
        return aVar;
    }
}
