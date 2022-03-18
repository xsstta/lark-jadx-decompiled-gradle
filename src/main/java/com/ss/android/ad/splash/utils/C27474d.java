package com.ss.android.ad.splash.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.ad.splash.utils.d */
public class C27474d {
    /* renamed from: a */
    private static void m100316a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m100320b(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m100314a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return 0;
        }
        return file.length() / 1024;
    }

    /* renamed from: c */
    public static boolean m100321c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m100320b(new File(str));
    }

    /* renamed from: a */
    public static long m100313a(File file) {
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory() || file.listFiles() == null) {
            return file.length() / 1024;
        }
        for (File file2 : file.listFiles()) {
            j += m100313a(file2);
        }
        return j;
    }

    /* renamed from: b */
    public static String m100319b(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        File file = new File(str);
        String str2 = null;
        str2 = null;
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                str2 = m100315a((InputStream) fileInputStream);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                m100316a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            m100316a((Closeable) fileInputStream2);
            throw th;
        }
        m100316a((Closeable) fileInputStream);
        return str2;
    }

    /* renamed from: a */
    private static String m100315a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            } catch (Exception e) {
                C27477g.m100330d("SplashAdSdk", "Exception:" + e);
            } catch (Throwable th) {
                m100316a(bufferedReader);
                throw th;
            }
        }
        m100316a(bufferedReader);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m100318a(File file, long j) {
        if (file == null || j <= 0 || System.currentTimeMillis() - file.lastModified() > j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m100317a(String str, String str2, String str3) {
        Throwable th;
        Exception e;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            File file = new File(str2);
            if (file.exists() || file.mkdir()) {
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str2 + str3, false);
                    try {
                        fileOutputStream2.write(str.getBytes());
                        fileOutputStream2.flush();
                        m100316a(fileOutputStream2);
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            C27477g.m100330d("SplashAdSdk", "Exception:" + e);
                            m100316a(fileOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            m100316a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        m100316a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    C27477g.m100330d("SplashAdSdk", "Exception:" + e);
                    m100316a(fileOutputStream);
                }
            }
        }
    }
}
