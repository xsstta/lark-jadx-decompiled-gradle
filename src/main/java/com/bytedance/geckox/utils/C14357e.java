package com.bytedance.geckox.utils;

import android.os.Build;
import android.os.Process;
import com.bytedance.geckox.p771g.C14276b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.geckox.utils.e */
public class C14357e {
    /* renamed from: c */
    public static boolean m57825c(File file) {
        String[] list;
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!m57825c(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: d */
    public static String m57826d(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    return m57826d(listFiles[0]);
                }
                return null;
            } else if (file.length() == 0) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static long m57827e(File file) {
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += m57827e(file2);
            }
        }
        return j;
    }

    /* renamed from: g */
    private static boolean m57829g(File file) {
        boolean z;
        File[] listFiles;
        if (file == null || !file.exists()) {
            return true;
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            z = true;
        } else {
            z = true;
            for (File file2 : listFiles) {
                if (!z || !m57829g(file2)) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        if (!z || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m57823a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        C14276b.m57604a("gecko-debug-tag", "delete file，pid:", Integer.valueOf(Process.myPid()), ", thread:", Thread.currentThread().toString(), ", file:" + file.getAbsolutePath());
        return m57829g(file);
    }

    /* renamed from: b */
    public static List<File> m57824b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return null;
        }
        List<File> asList = Arrays.asList(listFiles);
        final HashMap hashMap = new HashMap();
        for (File file2 : asList) {
            hashMap.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(asList, new Comparator<File>() {
            /* class com.bytedance.geckox.utils.C14357e.C143581 */

            /* renamed from: a */
            public int compare(File file, File file2) {
                if (file == null && file2 == null) {
                    return 0;
                }
                if (file == null) {
                    return 1;
                }
                if (file2 == null) {
                    return -1;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    return Long.compare(((Long) hashMap.get(file)).longValue(), ((Long) hashMap.get(file2)).longValue());
                }
                int i = (((Long) hashMap.get(file)).longValue() > ((Long) hashMap.get(file2)).longValue() ? 1 : (((Long) hashMap.get(file)).longValue() == ((Long) hashMap.get(file2)).longValue() ? 0 : -1));
                if (i < 0) {
                    return -1;
                }
                if (i == 0) {
                    return 0;
                }
                return 1;
            }
        });
        return asList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0149, code lost:
        r27 = r2;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x014e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x014f, code lost:
        r27 = r2;
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0167 A[SYNTHETIC, Splitter:B:102:0x0167] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0187 A[SYNTHETIC, Splitter:B:110:0x0187] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014e A[ExcHandler: IOException (e java.io.IOException), Splitter:B:4:0x0011] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m57828f(java.io.File r31) {
        /*
        // Method dump skipped, instructions count: 418
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.utils.C14357e.m57828f(java.io.File):boolean");
    }

    /* renamed from: a */
    public static long m57821a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                i += read;
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                return (long) i;
            }
        }
    }

    /* renamed from: a */
    public static void m57822a(String str, String str2) {
        File file;
        try {
            new File(str2).mkdirs();
            String[] list = new File(str).list();
            for (int i = 0; i < list.length; i++) {
                if (str.endsWith(File.separator)) {
                    file = new File(str + list[i]);
                } else {
                    file = new File(str + File.separator + list[i]);
                }
                if (file.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + file.getName());
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                }
                if (file.isDirectory()) {
                    m57822a(str + "/" + list[i], str2 + "/" + list[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C14276b.m57605b("gecko-debug-tag", "copy folder error:", e);
        }
    }
}
