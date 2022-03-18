package com.lark.falcon.engine.common;

import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.lark.falcon.engine.common.a */
public class C23971a {

    /* renamed from: a */
    private static String f59300a;

    /* renamed from: b */
    private static boolean f59301b;

    /* renamed from: a */
    public static synchronized String m87624a() {
        String str;
        synchronized (C23971a.class) {
            if (!f59301b) {
                f59301b = true;
                try {
                    f59300a = m87625b();
                } catch (IOException unused) {
                }
            }
            str = f59300a;
        }
        return str;
    }

    /* renamed from: b */
    private static String m87625b() throws IOException {
        byte[] bArr = new byte[64];
        FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
        try {
            int read = fileInputStream.read(bArr);
            int a = m87623a(bArr, 0, read, (byte) 0);
            if (a > 0) {
                read = a;
            }
            return new String(bArr, 0, read);
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    private static int m87623a(byte[] bArr, int i, int i2, byte b) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] == b) {
                return i3;
            }
        }
        return -1;
    }
}
