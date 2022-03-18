package com.huawei.secure.android.common.p1021a.p1026d;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* renamed from: com.huawei.secure.android.common.a.d.b */
public final class C23809b {
    /* renamed from: a */
    public static String m87022a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m87023a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes("UTF-8");
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                int i2 = i * 2;
                sb.append(new String(new byte[]{bytes[i2]}, "UTF-8"));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException | NumberFormatException e) {
            C23810c.m87026b("HexUtil", "hex string 2 byte array exception : " + e.getMessage());
        }
        return bArr;
    }
}
