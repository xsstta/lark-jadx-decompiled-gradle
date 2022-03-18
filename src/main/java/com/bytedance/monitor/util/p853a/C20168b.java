package com.bytedance.monitor.util.p853a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.C1711a;
import com.bytedance.monitor.util.C20172c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.monitor.util.a.b */
public class C20168b {

    /* renamed from: a */
    private static List<String> f49281a = new ArrayList();

    /* renamed from: a */
    private static File m73597a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            C20172c.m73617a(file.getAbsolutePath());
        }
        return file;
    }

    /* renamed from: b */
    private static File m73600b(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File a = m73597a(context);
        if (a != null) {
            return new File(a, mapLibraryName);
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized boolean m73599a(Context context, String str) {
        synchronized (C20168b.class) {
            if (f49281a.contains(str)) {
                return true;
            }
            try {
                C1711a.m7628a(str);
                f49281a.add(str);
            } catch (UnsatisfiedLinkError e) {
                File b = m73600b(context, str);
                if (b == null) {
                    return false;
                }
                if (b.exists()) {
                    b.delete();
                }
                String a = m73598a(context, str, b);
                if (a != null) {
                    Log.e("loadLibrary", e.getMessage() + "[" + a + "]");
                    return false;
                }
                System.load(b.getAbsolutePath());
                f49281a.add(str);
            } catch (Throwable unused) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static String m73598a(Context context, String str, File file) {
        InputStream inputStream;
        Throwable th;
        ZipFile zipFile;
        String message;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb = new StringBuilder();
                    sb.append("lib/");
                    String str2 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    sb.append(str2.substring(0, indexOf));
                    sb.append("/");
                    sb.append(System.mapLibraryName(str));
                    String sb2 = sb.toString();
                    ZipEntry entry2 = zipFile.getEntry(sb2);
                    if (entry2 == null) {
                        message = "Library entry not found:" + sb2;
                        C20172c.m73614a((Closeable) null);
                        C20172c.m73614a((Closeable) null);
                        C20172c.m73616a(zipFile);
                        return message;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                inputStream2 = zipFile.getInputStream(entry);
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                try {
                    message = th.getMessage();
                    C20172c.m73614a(fileOutputStream2);
                    C20172c.m73614a(inputStream);
                    C20172c.m73616a(zipFile);
                    return message;
                } catch (Throwable th3) {
                    C20172c.m73614a(fileOutputStream2);
                    C20172c.m73614a(inputStream);
                    C20172c.m73616a(zipFile);
                    throw th3;
                }
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th4) {
                inputStream = inputStream2;
                th = th4;
                message = th.getMessage();
                C20172c.m73614a(fileOutputStream2);
                C20172c.m73614a(inputStream);
                C20172c.m73616a(zipFile);
                return message;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        C20172c.m73615a(file.getAbsolutePath(), 493);
                        C20172c.m73614a(fileOutputStream);
                        C20172c.m73614a(inputStream2);
                        C20172c.m73616a(zipFile);
                        return null;
                    }
                }
            } catch (Throwable th5) {
                fileOutputStream2 = fileOutputStream;
                inputStream = inputStream2;
                th = th5;
                message = th.getMessage();
                C20172c.m73614a(fileOutputStream2);
                C20172c.m73614a(inputStream);
                C20172c.m73616a(zipFile);
                return message;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            zipFile = null;
            message = th.getMessage();
            C20172c.m73614a(fileOutputStream2);
            C20172c.m73614a(inputStream);
            C20172c.m73616a(zipFile);
            return message;
        }
    }
}
