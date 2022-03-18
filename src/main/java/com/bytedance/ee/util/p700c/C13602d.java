package com.bytedance.ee.util.p700c;

import com.bytedance.ee.log.C13479a;
import java.security.MessageDigest;

/* renamed from: com.bytedance.ee.util.c.d */
public final class C13602d {

    /* renamed from: a */
    private static char[] f35763a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m55223a(byte[] bArr) {
        return m55224a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static String m55222a(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return m55223a(instance.digest());
        } catch (Exception e) {
            C13479a.m54761a("MD5Utils", e);
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.security.MessageDigest */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.security.MessageDigest */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[SYNTHETIC, Splitter:B:27:0x0047] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m55221a(java.io.File r9) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.util.p700c.C13602d.m55221a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    private static void m55225a(byte b, StringBuilder sb) {
        char[] cArr = f35763a;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & 15];
        sb.append(c);
        sb.append(c2);
    }

    /* renamed from: a */
    private static String m55224a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            m55225a(bArr[i], sb);
            i++;
        }
        return sb.toString();
    }
}
