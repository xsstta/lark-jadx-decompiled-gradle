package p001a.p002a.p003a.p005b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: a.a.a.b.a */
public class C0010a {
    /* renamed from: a */
    public static void m18a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m19a(String str, int i) {
        C0028b.m44a("android.os.FileUtils", str, Integer.valueOf(i), -1, -1);
    }

    /* renamed from: a */
    public static void m20a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m21a(String str) {
        return new File(str).mkdirs();
    }
}
