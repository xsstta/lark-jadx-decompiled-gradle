package com.ss.android.lark.widget.richtext2.widget.text;

import android.text.SpannableStringBuilder;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.text.c */
public abstract class AbstractC59111c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract SpannableStringBuilder mo200811a(SpannableStringBuilder spannableStringBuilder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo200816a(String str, int i, int i2) {
        int length = str.length();
        if (i < 0 || i >= length || i2 < 0 || i2 > length) {
            return false;
        }
        return true;
    }
}
