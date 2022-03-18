package com.bytedance.crash.util;

import com.bytedance.crash.C3691b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* renamed from: com.bytedance.crash.util.k */
public class C3947k {
    /* renamed from: b */
    private static String m16386b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 16; i += 8) {
            for (int i2 = 6; i2 >= 0; i2 -= 2) {
                int i3 = i + i2;
                sb.append(str.substring(i3, i3 + 2));
            }
            sb.append(':');
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static String m16388c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 0; i -= 2) {
            try {
                sb.append(Integer.parseInt(str.substring(i, i + 2), 16));
                if (i != 0) {
                    sb.append('.');
                }
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m16383a(String str) {
        String c;
        String[] split = str.split(":");
        if (split.length != 2) {
            return null;
        }
        try {
            long parseLong = Long.parseLong(split[1], 16);
            String str2 = split[0];
            if (str2.length() == 8) {
                String c2 = m16388c(str2);
                if (c2 == null) {
                    return null;
                }
                return c2 + ":" + parseLong;
            } else if (str2.length() != 32 || (c = m16388c(str2.substring(24))) == null) {
                return null;
            } else {
                return m16386b(str2.substring(0, 24)) + c + ":" + parseLong;
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m16384a(File file, File file2) {
        try {
            m16387b(file, file2);
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private static void m16385a(File file, Map<Long, String> map) {
        Throwable th;
        int i;
        String a;
        if (file.exists()) {
            int[] iArr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            String[] strArr = {"sl", "local_address", "st", "tx_queue", "rx_queue", "tr", "tm->when", "retrnsmt", "uid", "timeout", "inode"};
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        C3954p.m16437a(bufferedReader2);
                        return;
                    }
                    String[] split = readLine.split("\\s+");
                    if (split.length <= iArr[10]) {
                        C3954p.m16437a(bufferedReader2);
                        return;
                    }
                    for (int i2 = 0; i2 < 11; i2++) {
                        if (!split[iArr[i2]].equals(strArr[i2])) {
                            C3954p.m16437a(bufferedReader2);
                            return;
                        }
                    }
                    while (true) {
                        String readLine2 = bufferedReader2.readLine();
                        if (readLine2 != null) {
                            String[] split2 = readLine2.split("\\s+");
                            if (split2.length != 0) {
                                if (split2[0].length() != 0) {
                                    i = -1;
                                } else {
                                    i = 0;
                                }
                                int i3 = i + 10;
                                if (split2.length > i3) {
                                    try {
                                        Long valueOf = Long.valueOf(Long.parseLong(split2[i3]));
                                        if (!(valueOf.longValue() == 0 || (a = m16383a(split2[i + 3])) == null)) {
                                            map.put(valueOf, a);
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                        } else {
                            C3954p.m16437a(bufferedReader2);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    } finally {
                        C3954p.m16437a(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x00d9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3 A[SYNTHETIC, Splitter:B:42:0x00e3] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m16387b(java.io.File r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C3947k.m16387b(java.io.File, java.io.File):void");
    }
}
