package com.ss.android.lark.money.redpacket.send;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.DigitsKeyListener;

/* renamed from: com.ss.android.lark.money.redpacket.send.b */
public class C48177b extends DigitsKeyListener {

    /* renamed from: a */
    private int f121233a = 2;

    public C48177b() {
        super(false, true);
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null) {
            i2 = filter.length();
            charSequence = filter;
            i = 0;
        }
        int i5 = i2 - i;
        if (i5 == 0) {
            return charSequence;
        }
        if (charSequence.toString().equals(".") && i3 == 0) {
            return "0.";
        }
        int length = spanned.length();
        for (int i6 = 0; i6 < i3; i6++) {
            if (spanned.charAt(i6) == '.') {
                if ((length - (i6 + 1)) + i5 > this.f121233a) {
                    return "";
                } else {
                    return new SpannableStringBuilder(charSequence, i, i2);
                }
            }
        }
        int i7 = i;
        while (true) {
            if (i7 >= i2) {
                break;
            } else if (charSequence.charAt(i7) != '.') {
                i7++;
            } else if ((length - i4) + (i2 - (i7 + 1)) > this.f121233a) {
                return "";
            }
        }
        return new SpannableStringBuilder(charSequence, i, i2);
    }
}
