package com.tt.miniapphost.util;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.tt.miniapphost.util.c */
public class C67586c {
    /* renamed from: a */
    public static void m263046a(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            m263051b(file);
        }
    }

    /* renamed from: c */
    public static long m263052c(File file) {
        if (file == null || !file.exists()) {
            return 0;
        }
        return m263053d(file);
    }

    /* renamed from: a */
    public static byte[] m263050a(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "CryptoUtil", e.getStackTrace());
            return null;
        }
    }

    /* renamed from: d */
    private static long m263053d(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            j += m263052c(file2);
        }
        return j;
    }

    /* renamed from: b */
    public static void m263051b(File file) {
        if (file.isFile()) {
            if (file.delete()) {
                AppBrandLogger.m52830i("CryptoUtil", "file delete success:" + file.getPath());
                return;
            }
            AppBrandLogger.m52829e("CryptoUtil", "file delete fail:" + file.getPath());
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                AppBrandLogger.m52829e("CryptoUtil", "fatal error, file is not a directory:" + file.getPath());
                return;
            }
            for (File file2 : listFiles) {
                m263051b(file2);
            }
            if (file.delete()) {
                AppBrandLogger.m52830i("CryptoUtil", "dir delete success:" + file.getPath());
                return;
            }
            AppBrandLogger.m52830i("CryptoUtil", "dir delete fail:" + file.getPath());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x004c A[SYNTHETIC, Splitter:B:34:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0063 A[SYNTHETIC, Splitter:B:44:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x006d A[SYNTHETIC, Splitter:B:49:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m263049a(java.lang.String r2, byte[] r3) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.C67586c.m263049a(java.lang.String, byte[]):boolean");
    }

    /* renamed from: a */
    public static void m263047a(String str, String str2) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    String substring = name.substring(0, name.length() - 1);
                    new File(str2 + File.separator + substring).mkdirs();
                } else {
                    File file = new File(str2 + File.separator + name);
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                    fileOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[SYNTHETIC, Splitter:B:25:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072 A[SYNTHETIC, Splitter:B:30:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083 A[SYNTHETIC, Splitter:B:36:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[SYNTHETIC, Splitter:B:41:0x0093] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m263048a(java.io.InputStream r11, java.io.File r12) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.C67586c.m263048a(java.io.InputStream, java.io.File):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c A[SYNTHETIC, Splitter:B:43:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c A[SYNTHETIC, Splitter:B:48:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f A[SYNTHETIC, Splitter:B:54:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00af A[SYNTHETIC, Splitter:B:59:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m263045a(java.io.File r9, java.io.File r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.C67586c.m263045a(java.io.File, java.io.File, boolean):int");
    }
}
