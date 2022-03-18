package com.bytedance.common.utility.io;

import android.os.Environment;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.ss.ugc.effectplatform.cache.disklrucache.StrictLineReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public final class FileUtils {
    private static final byte[] GIF87A = {71, 73, 70, 56, 55, 97};
    private static final byte[] GIF89A = {71, 73, 70, 56, 57, 97};
    private static final byte[] JPEG = {-1, -40, -1};
    private static final byte[] PNG = {-119, 80, 78, 71, StrictLineReader.f164804b, 10, 26, 10};

    public enum ImageType {
        UNKNOWN,
        JPG,
        PNG,
        GIF
    }

    private FileUtils() {
    }

    public static boolean isExternalStorageWritable() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return true;
        }
        return false;
    }

    public static boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        return false;
    }

    public static boolean isGif(File file) {
        if (getImageType(file) == ImageType.GIF) {
            return true;
        }
        return false;
    }

    public static boolean exists(String str) {
        if (!StringUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    public static ImageType getImageType(String str) {
        if (!StringUtils.isEmpty(str)) {
            return getImageType(new File(str));
        }
        return ImageType.UNKNOWN;
    }

    public static InputStream getInputStream(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (Exception e) {
            try {
                e.printStackTrace();
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public static void clearDir(String str) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath());
                } else if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    public static byte[] getByteArray(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) fileInputStream.read();
            }
            fileInputStream.close();
            return bArr;
        } catch (Exception e) {
            try {
                e.printStackTrace();
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public static String getFileNameWithoutExtension(String str) {
        int lastIndexOf;
        String name = new File(str).getName();
        if (StringUtils.isEmpty(name) || -1 == (lastIndexOf = name.lastIndexOf("."))) {
            return "";
        }
        return name.substring(0, lastIndexOf);
    }

    public static void removeDir(String str) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath());
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCacheDirPath(android.content.Context r3) throws java.lang.NullPointerException {
        /*
            java.lang.String r0 = "Context is NUll"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 0
            java.io.File r1 = r3.getCacheDir()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0016
            java.io.File r3 = r3.getCacheDir()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x003c }
        L_0x0014:
            r0 = r3
            goto L_0x003d
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003c }
            r1.<init>()     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "/data/data/"
            r1.append(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r2 = r3.getPackageName()     // Catch:{ all -> 0x003c }
            r1.append(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "/cache/"
            r1.append(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003c }
            r2 = 0
            java.io.File r3 = r3.getDir(r1, r2)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x003c }
            goto L_0x0014
        L_0x003c:
        L_0x003d:
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot Create Cache Dir"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.FileUtils.getCacheDirPath(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFilesDirPath(android.content.Context r3) throws java.lang.NullPointerException {
        /*
            java.lang.String r0 = "Context is NUll"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 0
            java.io.File r1 = r3.getFilesDir()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0016
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x003c }
        L_0x0014:
            r0 = r3
            goto L_0x003d
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003c }
            r1.<init>()     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "/data/data/"
            r1.append(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r2 = r3.getPackageName()     // Catch:{ all -> 0x003c }
            r1.append(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "/files/"
            r1.append(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003c }
            r2 = 0
            java.io.File r3 = r3.getDir(r1, r2)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x003c }
            goto L_0x0014
        L_0x003c:
        L_0x003d:
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot Create Files Dir"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.FileUtils.getFilesDirPath(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0078 A[SYNTHETIC, Splitter:B:51:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.common.utility.io.FileUtils.ImageType getImageType(java.io.File r3) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.FileUtils.getImageType(java.io.File):com.bytedance.common.utility.io.FileUtils$ImageType");
    }

    private static boolean checkSignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long getDirectorySize(File file, boolean z) {
        long length;
        long j = 0;
        try {
            if (!file.exists() && file.isDirectory()) {
                return 0;
            }
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = getDirectorySize(file2, z);
                } else if (file2.isFile()) {
                    length = file2.length();
                }
                j += length;
            }
            return j;
        } catch (Throwable unused) {
        }
    }

    public static void clearDir(String str, Set<String> set) throws Exception {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath(), set);
                } else if (listFiles[i].isFile()) {
                    String name = listFiles[i].getName();
                    if (set == null || !set.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }

    public static void removeDir(String str, Set<String> set) throws Exception {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    removeDir(listFiles[i].getAbsolutePath(), set);
                } else {
                    String name = listFiles[i].getName();
                    if (set == null || !set.contains(name)) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }

    public static void chmod(String str, int i) {
        Method method;
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            if (cls != null && (method = cls.getMethod("setPermissions", String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE)) != null) {
                int intValue = ((Integer) method.invoke(null, str, Integer.valueOf(i), -1, -1)).intValue();
                if (intValue != 0) {
                    Logger.m15167d("NetHackDbg", "android.os.FileUtils.setPermissions() returned " + intValue + " for '" + str + "', probably didn't work.");
                }
            }
        } catch (ClassNotFoundException unused) {
            Logger.m15167d("NetHackDbg", "android.os.FileUtils.setPermissions() failed - ClassNotFoundException.");
        } catch (IllegalAccessException unused2) {
            Logger.m15167d("NetHackDbg", "android.os.FileUtils.setPermissions() failed - IllegalAccessException.");
        } catch (InvocationTargetException unused3) {
            Logger.m15167d("NetHackDbg", "android.os.FileUtils.setPermissions() failed - InvocationTargetException.");
        } catch (NoSuchMethodException unused4) {
            Logger.m15167d("NetHackDbg", "android.os.FileUtils.setPermissions() failed - NoSuchMethodException.");
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035 A[SYNTHETIC, Splitter:B:25:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A[SYNTHETIC, Splitter:B:31:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFile(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0049
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0049
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0014
            goto L_0x0049
        L_0x0014:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002f }
            boolean r3 = saveInputStream(r2, r4, r5)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r2.close()     // Catch:{ Exception -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0026:
            return r3
        L_0x0027:
            r3 = move-exception
            r0 = r2
            goto L_0x003e
        L_0x002a:
            r3 = move-exception
            r0 = r2
            goto L_0x0030
        L_0x002d:
            r3 = move-exception
            goto L_0x003e
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            r3.printStackTrace()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r3 = move-exception
            r3.printStackTrace()
        L_0x003d:
            return r1
        L_0x003e:
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0048:
            throw r3
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.FileUtils.copyFile(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070 A[SYNTHETIC, Splitter:B:38:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC, Splitter:B:42:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082 A[SYNTHETIC, Splitter:B:48:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0089 A[SYNTHETIC, Splitter:B:52:0x0089] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveInputStream(java.io.InputStream r4, java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.FileUtils.saveInputStream(java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }
}
