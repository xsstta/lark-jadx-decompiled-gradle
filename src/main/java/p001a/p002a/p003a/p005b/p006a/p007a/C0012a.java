package p001a.p002a.p003a.p005b.p006a.p007a;

import android.util.Log;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import dalvik.system.PathClassLoader;

/* renamed from: a.a.a.b.a.a.a */
public final class C0012a extends PathClassLoader {
    public C0012a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(AbstractC60044a.f149675a, "Cannot find The class:" + str);
            }
        }
        return super.loadClass(str, z);
    }
}
