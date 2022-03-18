package com.ss.ttm.utils;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class AVCrashUtil {
    public static String getBase64SampleCrash(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    public static boolean existsCrashFile(Context context, String str) {
        if (context == null && str == null) {
            return false;
        }
        return new File(str).exists();
    }

    public static void compress(InputStream inputStream, OutputStream outputStream) throws Exception {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                return;
            }
        }
    }

    public static void deleteCrashFile(Context context, String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        return copyFile(str, str2, z, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[SYNTHETIC, Splitter:B:22:0x0058] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCrashFileContext(android.content.Context r7, java.lang.String r8, java.lang.StringBuilder r9) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.AVCrashUtil.getCrashFileContext(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080 A[SYNTHETIC, Splitter:B:46:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0088 A[Catch:{ IOException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0093 A[SYNTHETIC, Splitter:B:58:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x009b A[Catch:{ IOException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00a6 A[SYNTHETIC, Splitter:B:70:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ae A[Catch:{ IOException -> 0x00aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.AVCrashUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
