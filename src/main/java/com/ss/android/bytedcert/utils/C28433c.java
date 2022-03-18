package com.ss.android.bytedcert.utils;

import android.content.Context;
import android.media.ExifInterface;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.MessageDigest;

/* renamed from: com.ss.android.bytedcert.utils.c */
public class C28433c {
    /* renamed from: a */
    public static void m104215a(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: a */
    public static String m104211a(File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return new BigInteger(1, instance.digest()).toString(16);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static void m104220c(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m104220c(file2);
                    try {
                        file2.delete();
                    } catch (Exception unused) {
                    }
                } else if (file2.exists()) {
                    m104220c(file2);
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: b */
    public static String m104218b(File file) {
        String str = "";
        if (file.exists() && !file.isDirectory()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str = str + readLine + "\n";
                }
                fileInputStream.close();
            } catch (FileNotFoundException unused) {
                Log.d("TestFile", "The File doesn't not exist.");
            } catch (IOException e) {
                Log.d("TestFile", e.getMessage());
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b A[SYNTHETIC, Splitter:B:18:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC, Splitter:B:25:0x0037] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m104219b(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r4 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0024, all -> 0x0020 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0024, all -> 0x0020 }
            long r2 = r0.length()     // Catch:{ Exception -> 0x001e }
            int r0 = (int) r2     // Catch:{ Exception -> 0x001e }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x001e }
            r1.read(r0)     // Catch:{ Exception -> 0x001e }
            r1.close()     // Catch:{ Exception -> 0x0019 }
            goto L_0x001d
        L_0x0019:
            r4 = move-exception
            r4.printStackTrace()
        L_0x001d:
            return r0
        L_0x001e:
            r0 = move-exception
            goto L_0x0026
        L_0x0020:
            r0 = move-exception
            r1 = r4
            r4 = r0
            goto L_0x0035
        L_0x0024:
            r0 = move-exception
            r1 = r4
        L_0x0026:
            r0.printStackTrace()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ Exception -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0033:
            return r4
        L_0x0034:
            r4 = move-exception
        L_0x0035:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ Exception -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.bytedcert.utils.C28433c.m104219b(java.lang.String):byte[]");
    }

    /* renamed from: b */
    public static String m104217b(Context context, String str) {
        File externalFilesDir = context.getApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath() + File.separator + str;
    }

    /* renamed from: a */
    public static String m104212a(String str, final String str2) {
        String[] list;
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (list = file.list(new FilenameFilter() {
            /* class com.ss.android.bytedcert.utils.C28433c.C284341 */

            public boolean accept(File file, String str) {
                if (!str.startsWith(str2) || !str.endsWith("model")) {
                    return false;
                }
                return true;
            }
        })) == null || list.length <= 0) {
            return "";
        }
        return str + "/" + list[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[SYNTHETIC, Splitter:B:22:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC, Splitter:B:27:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m104213a(byte[] r3, java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.bytedcert.utils.C28433c.m104213a(byte[], java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m104214a(ExifInterface exifInterface, String str) {
        String obj;
        String attribute;
        if (!TextUtils.isEmpty(str)) {
            try {
                ExifInterface exifInterface2 = new ExifInterface(str);
                Field[] fields = ExifInterface.class.getFields();
                for (int i = 0; i < fields.length; i++) {
                    String name = fields[i].getName();
                    if (!TextUtils.isEmpty(name) && name.startsWith("TAG") && (attribute = exifInterface.getAttribute((obj = fields[i].get(ExifInterface.class).toString()))) != null) {
                        exifInterface2.setAttribute(obj, attribute);
                    }
                }
                exifInterface2.saveAttributes();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static boolean m104216a(Context context, String str) {
        String b = m104217b(context, str);
        if (b == null) {
            return true;
        }
        File file = new File(b);
        if (file.exists()) {
            return true;
        }
        try {
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(file.getParentFile().getAbsolutePath());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            file.createNewFile();
            InputStream open = context.getApplicationContext().getAssets().open(str);
            if (open == null) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    open.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException unused) {
            file.delete();
            return false;
        }
    }
}
