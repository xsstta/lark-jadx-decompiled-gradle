package com.bytedance.ee.lark.infra.foundation.utils;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import kotlin.io.C69104g;

public class IOUtils {
    private static final String[] PATH_PROJECTION = {"_data"};

    public static String calculateMD5(File file) {
        return calculateMD5(file, 1024);
    }

    public static File getCacheDirectory(Context context) {
        return getCacheDirectory(context, true);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                AppBrandLogger.eWithThrowable("IOUtils", "", e);
            }
        }
    }

    public static boolean createFile(String str) {
        try {
            return new File(str).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean hasExternalStoragePermission(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static boolean mkdir(String str) {
        return new File(str).mkdirs();
    }

    public static void removeDir(String str) throws Exception {
        delete(new File(str));
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void clearDir(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            delete(file);
        }
    }

    public static boolean exists(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        AppBrandLogger.m52830i("IOUtils", "exists->path is empty!");
        return false;
    }

    public static String getFileExtension(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
            return str.substring(lastIndexOf);
        }
        return "";
    }

    public static byte[] readBytes(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("IOUtils", "", e);
            return null;
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

    public static long getAvailSpace(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("IOUtils", "getAvailSpace path is emtpy!");
            return 0;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static long getDirSizeNonRecursive(File file) {
        long j = 0;
        if (file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                j += file2.length();
            }
        }
        return j;
    }

    public static File getExternalCacheDir(Context context) {
        String str;
        File file;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        if ("mounted".equals(str)) {
            file = context.getExternalCacheDir();
        } else {
            file = null;
        }
        if (file == null) {
            AppBrandLogger.m52829e("IOUtils", "appDir null. mounted:" + str);
        }
        return file;
    }

    public static File getExternalFilesDir(Context context) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        File file = null;
        if ("mounted".equals(str)) {
            file = context.getExternalFilesDir(null);
        }
        if (file == null) {
            AppBrandLogger.m52829e("IOUtils", "appDir null. mounted:" + str);
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static long getZipTrueSize(String str) {
        long j = 0;
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(str).entries();
            while (entries.hasMoreElements()) {
                j += ((ZipEntry) entries.nextElement()).getSize();
            }
        } catch (IOException e) {
            AppBrandLogger.eWithThrowable("IOUtils", "", e);
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[SYNTHETIC, Splitter:B:16:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003f A[SYNTHETIC, Splitter:B:24:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFile(java.io.File r5) {
        /*
            java.lang.String r0 = "IOUtils"
            r1 = 0
            r2 = 6
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r4, r1, r3)     // Catch:{ FileNotFoundException -> 0x001f }
            r4.close()     // Catch:{ Exception -> 0x0016 }
            goto L_0x003a
        L_0x0016:
            r5 = move-exception
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.stacktrace(r2, r0, r5)
            goto L_0x003a
        L_0x001f:
            r5 = move-exception
            goto L_0x0025
        L_0x0021:
            r5 = move-exception
            goto L_0x003d
        L_0x0023:
            r5 = move-exception
            r4 = r1
        L_0x0025:
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()     // Catch:{ all -> 0x003b }
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.stacktrace(r2, r0, r5)     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ Exception -> 0x0032 }
            goto L_0x003a
        L_0x0032:
            r5 = move-exception
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.stacktrace(r2, r0, r5)
        L_0x003a:
            return r1
        L_0x003b:
            r5 = move-exception
            r1 = r4
        L_0x003d:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x004b
        L_0x0043:
            r1 = move-exception
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.stacktrace(r2, r0, r1)
        L_0x004b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.foundation.utils.IOUtils.decodeFile(java.io.File):android.graphics.Bitmap");
    }

    public static boolean delete(File file) {
        AppBrandLogger.m52829e("IOUtils", "delete", file.getName());
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return file.delete();
            }
            boolean z = true;
            for (int i = 0; i < listFiles.length; i++) {
                boolean delete = delete(listFiles[i]);
                z &= delete;
                if (!delete) {
                    AppBrandLogger.m52829e("IOUtils", "failed to delete file: ", listFiles[i]);
                }
            }
            return file.delete() & z;
        }
        AppBrandLogger.m52829e("IOUtils", "invalid path: ", file);
        return false;
    }

    public static String fileSize(long j) {
        if (j <= 0) {
            return "0";
        }
        double d = (double) j;
        int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(d / Math.pow(1024.0d, (double) log10)) + " " + new String[]{"B", "kB", "MB", "GB", "TB"}[log10];
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
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot Create Files Dir"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.foundation.utils.IOUtils.getFilesDirPath(android.content.Context):java.lang.String");
    }

    public static String getSizeByUnit(double d) {
        if (d == 0.0d) {
            return "0K";
        }
        if (d >= 1048576.0d) {
            return String.format(Locale.getDefault(), "%.1f", Double.valueOf(d / 1048576.0d)) + "M";
        }
        return String.format(Locale.getDefault(), "%.1f", Double.valueOf(d / 1024.0d)) + "K";
    }

    public static long fileLength(File file) {
        File[] listFiles;
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.offer(file);
        int i = 0;
        int i2 = 0;
        while (!linkedList.isEmpty()) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 > 5000) {
                AppBrandLogger.m52829e("IOUtils", "file length calculation timeout, cost:" + currentTimeMillis2 + " current file count:" + (i + linkedList.size()) + " current depth:" + i2);
                return -1;
            }
            int size = linkedList.size();
            i++;
            while (size > 0) {
                size--;
                File file2 = (File) linkedList.poll();
                j += file2.length();
                if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                    for (File file3 : listFiles) {
                        linkedList.offer(file3);
                    }
                }
            }
            i2++;
        }
        return j;
    }

    public static void unZipFolder(InputStream inputStream, String str) throws Exception {
        unZipFolder(inputStream, str, false);
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static void unZipFolder(String str, String str2) throws Exception {
        unZipFolder((InputStream) new FileInputStream(str), str2, false);
    }

    public static boolean checkMD5(String str, File file) {
        String calculateMD5;
        if (TextUtils.isEmpty(str) || file == null || (calculateMD5 = calculateMD5(file)) == null) {
            return false;
        }
        return calculateMD5.toLowerCase().startsWith(str.toLowerCase());
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static File getIndividualCacheDirectory(Context context, String str) {
        File cacheDirectory = getCacheDirectory(context);
        File file = new File(cacheDirectory, str);
        return (file.exists() || file.mkdir()) ? file : cacheDirectory;
    }

    public static boolean isSubPath(File file, File file2) {
        if (!(file == null || file2 == null)) {
            File parentFile = file2.getParentFile();
            while (parentFile != null && C69104g.m265933b(parentFile, file)) {
                if (parentFile.equals(file)) {
                    return true;
                }
                parentFile = parentFile.getParentFile();
            }
        }
        return false;
    }

    public static String readString(String str, String str2) {
        try {
            return new String(readBytes(str), str2);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("IOUtils", "", e);
            return null;
        }
    }

    public static void writeBytes(String str, byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.write(bArr, 0, bArr.length);
            dataOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static String getFromAssets(Context context, String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
            String str2 = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return str2;
                }
                str2 = str2 + readLine;
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("IOUtils", "", e);
            return "";
        }
    }

    public static boolean isSubPath(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return isSubPath(new File(str), new File(str2));
    }

    public static boolean setPermissions(String str, int i) {
        if (C12785d.m52847a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1) != null) {
            return true;
        }
        AppBrandLogger.m52829e("IOUtils", "setPermissions failed-->Path:" + str);
        return false;
    }

    public static String calculateMD5(File file, int i) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[i];
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to process file for MD5", e);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        AppBrandLogger.eWithThrowable("IOUtils", "", e2);
                    }
                    throw th;
                }
            }
            String replace = String.format("%32s", new BigInteger(1, instance.digest()).toString(16)).replace(' ', '0');
            try {
                fileInputStream.close();
            } catch (IOException e3) {
                AppBrandLogger.eWithThrowable("IOUtils", "", e3);
            }
            return replace;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static File getCacheDirectory(Context context, boolean z) {
        File file;
        String str = "";
        try {
            str = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
        }
        if (!z || !"mounted".equals(str) || !hasExternalStoragePermission(context)) {
            file = null;
        } else {
            file = getExternalCacheDir(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file != null) {
            return file;
        }
        return new File("/data/data/" + context.getPackageName() + "/cache/");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[SYNTHETIC, Splitter:B:18:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003d A[SYNTHETIC, Splitter:B:26:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getFromAssetsByte(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "IOUtils"
            r2 = 0
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            int r4 = r3.available()     // Catch:{ Exception -> 0x0025 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0025 }
            r3.read(r4)     // Catch:{ Exception -> 0x0025 }
            if (r3 == 0) goto L_0x0024
            r3.close()     // Catch:{ Exception -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r3 = move-exception
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.eWithThrowable(r1, r0, r3)
        L_0x0024:
            return r4
        L_0x0025:
            r4 = move-exception
            goto L_0x002b
        L_0x0027:
            r4 = move-exception
            goto L_0x003b
        L_0x0029:
            r4 = move-exception
            r3 = r2
        L_0x002b:
            r4.printStackTrace()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r3 = move-exception
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.eWithThrowable(r1, r0, r3)
        L_0x0038:
            return r2
        L_0x0039:
            r4 = move-exception
            r2 = r3
        L_0x003b:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r3 = move-exception
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.eWithThrowable(r1, r0, r3)
        L_0x0045:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.foundation.utils.IOUtils.getFromAssetsByte(android.content.Context, java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0074 A[SYNTHETIC, Splitter:B:47:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007e A[SYNTHETIC, Splitter:B:52:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008a A[SYNTHETIC, Splitter:B:59:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0094 A[SYNTHETIC, Splitter:B:64:0x0094] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFolder(java.io.File r8, java.io.File r9) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.foundation.utils.IOUtils.copyFolder(java.io.File, java.io.File):boolean");
    }

    public static int readInt(String str, String str2, int i) {
        try {
            String str3 = new String(readBytes(str), str2);
            if (!TextUtils.isEmpty(str3)) {
                return Integer.parseInt(str3);
            }
            return i;
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("IOUtils", "", e);
            return i;
        }
    }

    public static void unZipFolder(String str, String str2, boolean z) throws Exception {
        unZipFolder(new FileInputStream(str), str2, z);
    }

    public static boolean writeStringToFile(String str, String str2, String str3) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a A[SYNTHETIC, Splitter:B:36:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC, Splitter:B:41:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081 A[SYNTHETIC, Splitter:B:47:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008b A[SYNTHETIC, Splitter:B:52:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyAssets(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.foundation.utils.IOUtils.copyAssets(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4 A[SYNTHETIC, Splitter:B:50:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4 A[SYNTHETIC, Splitter:B:55:0x00e4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int copyFile(java.io.File r9, java.io.File r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.foundation.utils.IOUtils.copyFile(java.io.File, java.io.File, boolean):int");
    }

    public static void unZipFolder(InputStream inputStream, String str, boolean z) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        String substring = name.substring(0, name.length() - 1);
                        new File(str + File.separator + substring).mkdirs();
                    } else {
                        File file = new File(str + File.separator + name);
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
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
