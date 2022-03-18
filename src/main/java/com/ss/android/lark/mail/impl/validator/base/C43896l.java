package com.ss.android.lark.mail.impl.validator.base;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.validator.base.l */
final class C43896l {

    /* renamed from: a */
    private static final C43885e f111354a = C43885e.m173931a("");

    /* renamed from: b */
    private static CharSequence m173965b(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }

    /* renamed from: a */
    static Map<String, PublicSuffixType> m173964a(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += m173963a(new LinkedList(), charSequence, i, hashMap);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066 A[EDGE_INSN: B:35:0x0066->B:27:0x0066 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m173963a(java.util.List<java.lang.CharSequence> r9, java.lang.CharSequence r10, int r11, java.util.Map<java.lang.String, com.ss.android.lark.mail.impl.validator.base.PublicSuffixType> r12) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.validator.base.C43896l.m173963a(java.util.List, java.lang.CharSequence, int, java.util.Map):int");
    }
}
