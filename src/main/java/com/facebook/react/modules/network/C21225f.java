package com.facebook.react.modules.network;

/* renamed from: com.facebook.react.modules.network.f */
public class C21225f {
    /* renamed from: a */
    public static String m76993a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                z = true;
            } else {
                sb.append(charAt);
            }
        }
        if (z) {
            return sb.toString();
        }
        return str;
    }

    /* renamed from: b */
    public static String m76994b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 || charAt >= 127) && charAt != '\t') {
                z = true;
            } else {
                sb.append(charAt);
            }
        }
        if (z) {
            return sb.toString();
        }
        return str;
    }
}
