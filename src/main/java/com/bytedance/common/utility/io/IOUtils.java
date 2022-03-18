package com.bytedance.common.utility.io;

import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.JavaCalls;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.zip.ZipFile;

public final class IOUtils {
    private IOUtils() {
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void close(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean mkdir(String str) {
        return new File(str).mkdirs();
    }

    public static void deleteFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    public static boolean exists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String getFileNameWithoutExtension(String str) {
        int lastIndexOf;
        String fileName = getFileName(str);
        if (fileName == null || fileName.length() <= 0 || (lastIndexOf = fileName.lastIndexOf(46)) <= 0) {
            return fileName;
        }
        return fileName.substring(0, lastIndexOf);
    }

    public static String getParentFilePath(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return null;
    }

    public static boolean canWrite(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        File file2 = new File(file, "." + System.currentTimeMillis());
        boolean mkdir = file2.mkdir();
        if (mkdir) {
            return file2.delete();
        }
        return mkdir;
    }

    public static long getAllBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                StatFs statFs = new StatFs(str);
                return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static long getAvailableBytes(String str) {
        try {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return 0;
            }
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getFileExtension(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf < 0 || lastIndexOf >= str.length() - 1) {
            return "";
        }
        return str.substring(lastIndexOf + 1).toUpperCase(Locale.getDefault());
    }

    public static String getFileName(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[SYNTHETIC, Splitter:B:17:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFileFirstLine(java.lang.String r3) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0022 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0022 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0022 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            r1.close()     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            r1.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001a:
            return r3
        L_0x001b:
            r3 = move-exception
            r0 = r1
            goto L_0x002f
        L_0x001e:
            r0 = r1
            goto L_0x0022
        L_0x0020:
            r3 = move-exception
            goto L_0x002f
        L_0x0022:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002e:
            return r3
        L_0x002f:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0039:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.IOUtils.readFileFirstLine(java.lang.String):java.lang.String");
    }

    public static void clearPath(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            String[] list = file.list();
            for (String str2 : list) {
                String str3 = str.endsWith(File.separator) ? str + str2 : str + File.separator + str2;
                File file2 = new File(str3);
                if (file2.isFile()) {
                    file2.delete();
                }
                if (file2.isDirectory()) {
                    deletePath(str3);
                }
            }
        }
    }

    public static void deletePath(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            String[] list = file.list();
            if (list != null) {
                for (String str2 : list) {
                    if (str2 != null) {
                        String str3 = str.endsWith(File.separator) ? str + str2 : str + File.separator + str2;
                        File file2 = new File(str3);
                        if (file2.isFile()) {
                            file2.delete();
                        }
                        if (file2.isDirectory()) {
                            deletePath(str3);
                        }
                    }
                }
                file.delete();
            }
        }
    }

    public static long getFileSize(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    length += getFileSize(file2.getAbsolutePath());
                } catch (StackOverflowError e) {
                    e.printStackTrace();
                    return 0;
                } catch (OutOfMemoryError e2) {
                    e2.printStackTrace();
                    return 0;
                }
            }
        }
        return length;
    }

    public static boolean copyFile(String str, String str2) {
        return copyFile(new File(str), new File(str2));
    }

    public static boolean renameFile(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            return false;
        }
        return file.renameTo(file2);
    }

    public static void setPermissions(String str, int i) {
        JavaCalls.callStaticMethod("android.os.FileUtils", str, Integer.valueOf(i), -1, -1);
    }

    public static boolean copyFile(File file, File file2) {
        if (!file.exists() || !file.isFile() || file2.isDirectory()) {
            return false;
        }
        if (file2.exists()) {
            file2.delete();
        }
        try {
            byte[] bArr = new byte[2048];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    bufferedInputStream.close();
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    return true;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
            if (r2 != 0) goto L_0x0016
            java.io.File r2 = r1.getParentFile()     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
            r2.mkdirs()     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
            r1.createNewFile()     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
        L_0x0016:
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
            r1.<init>(r3, r5)     // Catch:{ IOException -> 0x0032, all -> 0x0028 }
            r1.write(r4)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r1.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x0039
        L_0x0022:
            r3 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x0025:
            r3 = move-exception
            r0 = r1
            goto L_0x0033
        L_0x0028:
            r3 = move-exception
        L_0x0029:
            r3.printStackTrace()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
        L_0x002e:
            r0.close()
            goto L_0x0039
        L_0x0032:
            r3 = move-exception
        L_0x0033:
            r3.printStackTrace()
            if (r0 == 0) goto L_0x0039
            goto L_0x002e
        L_0x0039:
            return
        L_0x003a:
            r3 = move-exception
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.io.IOUtils.write(java.lang.String, java.lang.String, boolean):void");
    }
}
