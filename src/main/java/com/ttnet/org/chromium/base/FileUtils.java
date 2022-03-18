package com.ttnet.org.chromium.base;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Locale;

public class FileUtils {
    public static byte[] readStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String getExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return str.substring(lastIndexOf + 1).toLowerCase(Locale.US);
    }

    public static void batchDeleteFiles(List<String> list) {
        for (String str : list) {
            if (ContentUriUtils.isContentUri(str)) {
                ContentUriUtils.delete(str);
            } else {
                File file = new File(str);
                if (file.exists()) {
                    recursivelyDeleteFile(file);
                }
            }
        }
    }

    public static Uri getUriForFile(File file) {
        Uri uri;
        try {
            uri = ContentUriUtils.getContentUriFromFile(file);
        } catch (IllegalArgumentException e) {
            Log.m264556e("FileUtils", "Could not create content uri: " + e, new Object[0]);
            uri = null;
        }
        if (uri == null) {
            return Uri.fromFile(file);
        }
        return uri;
    }

    public static boolean recursivelyDeleteFile(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                recursivelyDeleteFile(file2);
            }
        }
        boolean delete = file.delete();
        if (!delete) {
            Log.m264556e("FileUtils", "Failed to delete: %s", file);
        }
        return delete;
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        $closeResource(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyStreamToFile(java.io.InputStream r6, java.io.File r7) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getPath()
            r1.append(r2)
            java.lang.String r2 = ".tmp"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            java.lang.String r2 = "FileUtils"
            java.lang.String r3 = "Writing to %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0040 }
            r5 = 0
            r4[r5] = r7     // Catch:{ all -> 0x0040 }
            com.ttnet.org.chromium.base.Log.m264557i(r2, r3, r4)     // Catch:{ all -> 0x0040 }
            copyStream(r6, r1)     // Catch:{ all -> 0x0040 }
            r6 = 0
            $closeResource(r6, r1)
            boolean r6 = r0.renameTo(r7)
            if (r6 == 0) goto L_0x003a
            return
        L_0x003a:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>()
            throw r6
        L_0x0040:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r7 = move-exception
            $closeResource(r6, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.FileUtils.copyStreamToFile(java.io.InputStream, java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        if (r5 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        $closeResource(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap queryBitmapFromContentProvider(android.content.Context r5, android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.FileUtils.queryBitmapFromContentProvider(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean extractAsset(android.content.Context r0, java.lang.String r1, java.io.File r2) {
        /*
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x001c }
            java.io.InputStream r0 = r0.open(r1)     // Catch:{ IOException -> 0x001c }
            r1 = 0
            copyStreamToFile(r0, r2)     // Catch:{ all -> 0x0013 }
            r2 = 1
            if (r0 == 0) goto L_0x0012
            $closeResource(r1, r0)
        L_0x0012:
            return r2
        L_0x0013:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r2 = move-exception
            if (r0 == 0) goto L_0x001b
            $closeResource(r1, r0)
        L_0x001b:
            throw r2
        L_0x001c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.FileUtils.extractAsset(android.content.Context, java.lang.String, java.io.File):boolean");
    }
}
