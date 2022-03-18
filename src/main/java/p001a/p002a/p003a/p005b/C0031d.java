package p001a.p002a.p003a.p005b;

import android.content.Context;
import com.C1711a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.a.a.b.d */
public class C0031d {

    /* renamed from: a */
    private static List<String> f50a = new ArrayList();

    /* renamed from: a */
    private static File m51a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            C0010a.m21a(file.getAbsolutePath());
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Closeable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m52a(android.content.Context r7, java.lang.String r8, java.io.File r9) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a.p002a.p003a.p005b.C0031d.m52a(android.content.Context, java.lang.String, java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static synchronized boolean m53a(Context context, String str) {
        synchronized (C0031d.class) {
            if (f50a.contains(str)) {
                return true;
            }
            try {
                C1711a.m7628a(str);
                f50a.add(str);
            } catch (UnsatisfiedLinkError unused) {
                File b = m54b(context, str);
                if (b == null) {
                    return false;
                }
                if (b.exists()) {
                    b.delete();
                }
                if (m52a(context, str, b) != null) {
                    return false;
                }
                System.load(b.getAbsolutePath());
                f50a.add(str);
            } catch (Throwable unused2) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    private static File m54b(Context context, String str) {
        String mapLibraryName = System.mapLibraryName(str);
        File a = m51a(context);
        if (a != null) {
            return new File(a, mapLibraryName);
        }
        return null;
    }
}
