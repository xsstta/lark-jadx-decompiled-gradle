package com.bytedance.crash.p222f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.crash.util.C3954p;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.crash.f.b */
public class C3752b {

    /* renamed from: a */
    private static final List<String> f11562a = new ArrayList();

    /* renamed from: a */
    public static String m15517a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String a = m15518a(applicationInfo.sourceDir, str, file);
        if (a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 21) {
            return a;
        }
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str2 : strArr) {
                a = m15518a(str2, str, file);
                if (a == null) {
                    return null;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static String m15518a(String str, String str2, File file) {
        InputStream inputStream;
        Throwable th;
        ZipFile zipFile;
        String message;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str2));
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb = new StringBuilder();
                    sb.append("lib/");
                    String str3 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    sb.append(str3.substring(0, indexOf));
                    sb.append("/");
                    sb.append(System.mapLibraryName(str2));
                    String sb2 = sb.toString();
                    ZipEntry entry2 = zipFile.getEntry(sb2);
                    if (entry2 == null) {
                        message = "Library entry not found:" + sb2;
                        C3954p.m16437a((Closeable) null);
                        C3954p.m16437a((Closeable) null);
                        C3954p.m16440a(zipFile);
                        return message;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                    try {
                        message = th.getMessage();
                        C3954p.m16437a(fileOutputStream2);
                        C3954p.m16437a(inputStream);
                        C3954p.m16440a(zipFile);
                        return message;
                    } catch (Throwable th3) {
                        C3954p.m16437a(fileOutputStream2);
                        C3954p.m16437a(inputStream);
                        C3954p.m16440a(zipFile);
                        throw th3;
                    }
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C3954p.m16439a(file.getAbsolutePath(), 493);
                            C3954p.m16437a(fileOutputStream);
                            C3954p.m16437a(inputStream2);
                            C3954p.m16440a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th4) {
                    fileOutputStream2 = fileOutputStream;
                    inputStream = inputStream2;
                    th = th4;
                    message = th.getMessage();
                    C3954p.m16437a(fileOutputStream2);
                    C3954p.m16437a(inputStream);
                    C3954p.m16440a(zipFile);
                    return message;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                message = th.getMessage();
                C3954p.m16437a(fileOutputStream2);
                C3954p.m16437a(inputStream);
                C3954p.m16440a(zipFile);
                return message;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            zipFile = null;
            message = th.getMessage();
            C3954p.m16437a(fileOutputStream2);
            C3954p.m16437a(inputStream);
            C3954p.m16440a(zipFile);
            return message;
        }
    }
}
