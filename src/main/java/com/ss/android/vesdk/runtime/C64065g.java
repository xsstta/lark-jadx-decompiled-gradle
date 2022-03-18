package com.ss.android.vesdk.runtime;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.C1711a;
import com.ss.android.ttve.log.C60193a;
import com.ss.android.vesdk.C64047r;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.vesdk.runtime.g */
public class C64065g {

    /* renamed from: a */
    private static List<String> f161770a = new ArrayList();

    /* renamed from: a */
    private static File m251429a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            C64047r.m251371b(file.getAbsolutePath());
        }
        return file;
    }

    /* renamed from: a */
    private static String m251432a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    /* renamed from: a */
    private static File m251430a(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File a = m251429a(context);
        if (a != null) {
            return new File(a, mapLibraryName);
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized boolean m251433a(String str, Context context) {
        synchronized (C64065g.class) {
            if (f161770a.contains(str)) {
                return true;
            }
            try {
                C1711a.m7628a(str);
                f161770a.add(str);
            } catch (UnsatisfiedLinkError e) {
                Log.e("VESafelyLibsLoader", "loadLibrary " + str + " error", e);
                C60193a.m233973a(4, "loadLibrary " + str + " error." + m251432a(e));
                File a = m251430a(context, str);
                if (a == null) {
                    return false;
                }
                if (a.exists()) {
                    a.delete();
                }
                String a2 = m251431a(context, str, a);
                if (a2 != null) {
                    Log.e("loadLibrary", e.getMessage() + "[" + a2 + "]");
                    C60193a.m233973a(4, e.getMessage() + "[" + a2 + "]");
                    return false;
                }
                System.load(a.getAbsolutePath());
                f161770a.add(str);
            } catch (Throwable unused) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private static String m251431a(Context context, String str, File file) {
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
                        C64047r.m251367a((Closeable) null);
                        C64047r.m251367a((Closeable) null);
                        C64047r.m251369a(zipFile);
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
                    C64047r.m251367a(fileOutputStream2);
                    C64047r.m251367a(inputStream);
                    C64047r.m251369a(zipFile);
                    return message;
                } catch (Throwable th3) {
                    C64047r.m251367a(fileOutputStream2);
                    C64047r.m251367a(inputStream);
                    C64047r.m251369a(zipFile);
                    throw th3;
                }
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th4) {
                inputStream = inputStream2;
                th = th4;
                message = th.getMessage();
                C64047r.m251367a(fileOutputStream2);
                C64047r.m251367a(inputStream);
                C64047r.m251369a(zipFile);
                return message;
            }
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        C64047r.m251368a(file.getAbsolutePath(), 493);
                        C64047r.m251367a(fileOutputStream);
                        C64047r.m251367a(inputStream2);
                        C64047r.m251369a(zipFile);
                        return null;
                    }
                }
            } catch (Throwable th5) {
                fileOutputStream2 = fileOutputStream;
                inputStream = inputStream2;
                th = th5;
                message = th.getMessage();
                C64047r.m251367a(fileOutputStream2);
                C64047r.m251367a(inputStream);
                C64047r.m251369a(zipFile);
                return message;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            zipFile = null;
            message = th.getMessage();
            C64047r.m251367a(fileOutputStream2);
            C64047r.m251367a(inputStream);
            C64047r.m251369a(zipFile);
            return message;
        }
    }
}
