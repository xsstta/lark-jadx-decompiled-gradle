package com.bytedance.common.profilesdk.util;

import android.os.Build;
import com.bytedance.common.profilesdk.AppContext;
import com.bytedance.common.profilesdk.DexImageLoader;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class FileUtils {
    private static byte[] ZIP_HEADER_1 = {80, 75, 3, 4};
    private static byte[] ZIP_HEADER_2 = {80, 75, 5, 6};

    public static boolean createIfNotExist(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.getParentFile().mkdirs();
            return file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isFileValid(File file) {
        if (file == null || !file.exists() || file.length() == 0) {
            return false;
        }
        return true;
    }

    public static long getCreationTime(String str) {
        File file = new File(str);
        if (!file.exists() || Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        try {
            return Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r5.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readAllBytes(java.io.File r5) throws java.io.IOException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r5)
            r1.<init>(r2)
            r5 = 512(0x200, float:7.175E-43)
            byte[] r2 = new byte[r5]     // Catch:{ all -> 0x0028 }
        L_0x0015:
            r3 = 0
            int r4 = r1.read(r2, r3, r5)     // Catch:{ all -> 0x0028 }
            if (r4 <= 0) goto L_0x0020
            r0.write(r2, r3, r4)     // Catch:{ all -> 0x0028 }
            goto L_0x0015
        L_0x0020:
            r1.close()
            byte[] r5 = r0.toByteArray()
            return r5
        L_0x0028:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r1 = move-exception
            r5.addSuppressed(r1)
        L_0x0033:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.profilesdk.util.FileUtils.readAllBytes(java.io.File):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0044 A[SYNTHETIC, Splitter:B:33:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isArchiveFile(java.io.File r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4.isDirectory()
            if (r1 == 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0038 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0038 }
            r4 = 4
            byte[] r1 = new byte[r4]     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            int r3 = r2.read(r1, r0, r4)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            if (r3 != r4) goto L_0x002c
            byte[] r4 = com.bytedance.common.profilesdk.util.FileUtils.ZIP_HEADER_1     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            boolean r4 = java.util.Arrays.equals(r4, r1)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            if (r4 != 0) goto L_0x002a
            byte[] r4 = com.bytedance.common.profilesdk.util.FileUtils.ZIP_HEADER_2     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            boolean r4 = java.util.Arrays.equals(r4, r1)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            if (r4 == 0) goto L_0x002c
        L_0x002a:
            r4 = 1
            r0 = 1
        L_0x002c:
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0041
        L_0x0030:
            r4 = move-exception
            r1 = r2
            goto L_0x0042
        L_0x0033:
            r4 = move-exception
            r1 = r2
            goto L_0x0039
        L_0x0036:
            r4 = move-exception
            goto L_0x0042
        L_0x0038:
            r4 = move-exception
        L_0x0039:
            r4.printStackTrace()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            return r0
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.profilesdk.util.FileUtils.isArchiveFile(java.io.File):boolean");
    }

    public static File getSo(String str) {
        Throwable th;
        String mapLibraryName = System.mapLibraryName(str);
        File file = new File(AppContext.getContext().getApplicationInfo().nativeLibraryDir + File.separator + mapLibraryName);
        if (file.exists()) {
            return file;
        }
        Logger.m15163d("Reflect .so path");
        try {
            ClassLoader classLoader = DexImageLoader.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (classLoader instanceof BaseDexClassLoader) {
                Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(classLoader);
                Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
                declaredField2.setAccessible(true);
                for (File file2 : (List) declaredField2.get(obj)) {
                    File file3 = new File(file2, System.mapLibraryName(str));
                    try {
                        if (file3.exists()) {
                            return file3;
                        }
                        file = file3;
                    } catch (Throwable th2) {
                        th = th2;
                        file = file3;
                        Logger.m15165e("Failed to get library path, " + str, th);
                        return file;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            Logger.m15165e("Failed to get library path, " + str, th);
            return file;
        }
        return file;
    }
}
