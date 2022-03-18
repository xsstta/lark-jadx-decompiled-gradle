package com.ss.android.lark.mediapicker.utils;

/* renamed from: com.ss.android.lark.mediapicker.utils.l */
public class C44756l {
    /* renamed from: a */
    public static String m177505a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
