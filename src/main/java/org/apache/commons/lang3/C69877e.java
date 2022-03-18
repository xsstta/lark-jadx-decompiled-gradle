package org.apache.commons.lang3;

/* renamed from: org.apache.commons.lang3.e */
public class C69877e {
    /* renamed from: a */
    public static boolean m268158a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m268161b(CharSequence charSequence) {
        if (m268158a(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m268159a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return C69876d.m268154a(charSequence, false, 0, charSequence2, 0, charSequence.length());
        }
        return charSequence.equals(charSequence2);
    }

    /* renamed from: b */
    public static boolean m268162b(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence == charSequence2) {
            return true;
        } else {
            if (charSequence.length() != charSequence2.length()) {
                return false;
            }
            return C69876d.m268154a(charSequence, true, 0, charSequence2, 0, charSequence.length());
        }
    }

    /* renamed from: b */
    public static boolean m268163b(CharSequence charSequence, char... cArr) {
        if (!(charSequence == null || cArr == null)) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                            return false;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m268160a(CharSequence charSequence, char... cArr) {
        if (!m268158a(charSequence) && !C69853a.m268062a(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i = length - 1;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                            return true;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m268155a(String str, String str2, String str3) {
        return m268156a(str, str2, str3, -1);
    }

    /* renamed from: a */
    public static String m268156a(String str, String str2, String str3, int i) {
        return m268157a(str, str2, str3, i, false);
    }

    /* renamed from: a */
    private static String m268157a(String str, String str2, String str3, int i, boolean z) {
        String str4;
        if (m268158a(str) || m268158a(str2) || str3 == null || i == 0) {
            return str;
        }
        if (z) {
            str4 = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            str4 = str;
        }
        int i2 = 0;
        int indexOf = str4.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        int i3 = 64;
        if (i < 0) {
            i3 = 16;
        } else if (i <= 64) {
            i3 = i;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length2 * i3));
        while (indexOf != -1) {
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(str3);
            i2 = indexOf + length;
            i--;
            if (i == 0) {
                break;
            }
            indexOf = str4.indexOf(str2, i2);
        }
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }
}
