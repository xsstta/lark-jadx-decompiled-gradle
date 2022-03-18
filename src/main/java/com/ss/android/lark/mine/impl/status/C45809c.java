package com.ss.android.lark.mine.impl.status;

import android.text.InputFilter;
import android.text.Spanned;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.common.MineUtils;

/* renamed from: com.ss.android.lark.mine.impl.status.c */
public class C45809c implements InputFilter {

    /* renamed from: a */
    private int f115594a;

    public C45809c(int i) {
        this.f115594a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Log.m165379d("UserStatus", " content.length : " + charSequence.length());
        int a = C45801a.m181493a(spanned);
        int a2 = C45801a.m181493a(charSequence) + a;
        int i5 = this.f115594a;
        if (a2 <= i5) {
            return charSequence;
        }
        int i6 = i5 - a;
        int i7 = 0;
        StringBuilder sb = new StringBuilder();
        while (i6 > 0) {
            char charAt = charSequence.charAt(i7);
            if (MineUtils.f114995a.mo160281a(String.valueOf(charAt)) || MineUtils.f114995a.mo160280a(charAt)) {
                if (i6 >= 2) {
                    sb.append(charAt);
                }
                i6 -= 2;
            } else {
                sb.append(charAt);
                i6--;
            }
            i7++;
        }
        return sb.toString();
    }
}
