package com.lynx.tasm.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Process;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.lynx.tasm.utils.l */
public class C26958l {
    /* renamed from: a */
    public static Typeface m97966a(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (TypeFaceLancet.cache.contains(str)) {
                return (Typeface) TypeFaceLancet.cache.get(str);
            }
            Typeface createFromFile = Typeface.createFromFile(str);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(str, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(str);
    }

    /* renamed from: a */
    private static File m97967a(Context context) {
        String str = ".lynx-font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getCacheDir(), str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m97968a(File file, byte[] bArr) {
        Throwable th;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileOutputStream.close();
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static Typeface m97965a(Context context, byte[] bArr) {
        File a = m97967a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m97968a(a, bArr)) {
                return null;
            }
            Typeface a2 = m97966a(a.getPath());
            a.delete();
            return a2;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
