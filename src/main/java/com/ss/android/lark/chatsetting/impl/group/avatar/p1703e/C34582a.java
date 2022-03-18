package com.ss.android.lark.chatsetting.impl.group.avatar.p1703e;

import com.ss.android.lark.chatsetting.impl.group.avatar.p1699a.C34568b;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.e.a */
public class C34582a {
    /* renamed from: a */
    public static boolean m134369a(int i) {
        return (i >= 8304 && i <= 11263) || (i >= 12288 && i <= 12543) || ((i >= 12800 && i <= 13055) || (i >= 126976 && i <= 129647));
    }

    /* renamed from: a */
    public static int m134366a(String str) {
        try {
            return new String(str.getBytes("GBK"), "ISO8859_1").length();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static C34568b m134367a(int i, String str) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < str.length()) {
            int codePointAt = Character.codePointAt(str, i3);
            char charAt = str.charAt(i3);
            if (m134369a(codePointAt)) {
                i2 = 2;
            } else {
                i2 = m134366a(String.valueOf(charAt));
            }
            int i5 = i2 + i4;
            if (i5 > i) {
                break;
            }
            i3 += Character.charCount(codePointAt);
            i4 = i5;
        }
        C34568b bVar = new C34568b();
        bVar.mo127744a(i4);
        bVar.mo127745a(str.substring(0, i3));
        return bVar;
    }

    /* renamed from: a */
    public static String m134368a(int i, String str, String str2) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < str2.length()) {
            int codePointAt = Character.codePointAt(str2, i3);
            char charAt = str2.charAt(i3);
            if (m134369a(codePointAt)) {
                i2 = 2;
            } else {
                i2 = m134366a(String.valueOf(charAt));
            }
            i4 += i2;
            i3 += Character.charCount(codePointAt);
            if (i4 >= i) {
                break;
            }
        }
        return str2.substring(0, i3) + str + str2.substring(i3);
    }
}
