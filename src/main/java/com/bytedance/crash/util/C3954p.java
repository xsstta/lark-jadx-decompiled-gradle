package com.bytedance.crash.util;

import android.os.Build;
import android.system.ErrnoException;
import com.bytedance.crash.p222f.C3750a;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.crash.util.p */
public final class C3954p {

    /* renamed from: a */
    private static int f12055a;

    /* renamed from: b */
    private static boolean f12056b;

    /* renamed from: c */
    private static boolean f12057c;

    /* renamed from: c */
    public static boolean m16442c() {
        int i = f12055a;
        if (i == 24 || i == 23) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m16436a() {
        if (!m16441b() && C3931ae.m16316a() < 25165824) {
            f12057c = true;
        }
    }

    /* renamed from: b */
    public static boolean m16441b() {
        int i = f12055a;
        if (i == 28 || i == 2 || f12057c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m16437a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16440a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16438a(IOException iOException) {
        Throwable cause;
        if (iOException != null && (cause = iOException.getCause()) != null && Build.VERSION.SDK_INT >= 21 && (cause instanceof ErrnoException)) {
            ErrnoException errnoException = (ErrnoException) cause;
            C3968x.m16530a((Object) ("find errnor " + errnoException.errno));
            int i = errnoException.errno;
            if (i == 2 || i == 28) {
                f12055a = errnoException.errno;
            } else if (i == 23 || i == 24) {
                f12055a = errnoException.errno;
                if (!f12056b) {
                    f12056b = true;
                    NativeTools.m16236b().mo15625l();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16439a(String str, int i) {
        C3750a.m15512a("android.os.FileUtils", "setPermissions", str, new C3750a.C3751a(Integer.TYPE, Integer.valueOf(i)), new C3750a.C3751a(Integer.TYPE, -1), new C3750a.C3751a(Integer.TYPE, -1));
    }
}
