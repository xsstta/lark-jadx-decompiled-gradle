package p001a.p002a.p003a.p005b.p006a.p007a;

import android.util.Log;
import com.ss.android.vesdk.p3188b.C63954b;
import dalvik.system.DexClassLoader;

/* renamed from: a.a.a.b.a.a.b */
public final class C0013b extends DexClassLoader {
    public C0013b(String str, String str2, String str3, ClassLoader classLoader) {
        super(str, str2, str3, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(C63954b.f161494a, "Cannot find The class:" + str);
            }
        }
        return super.loadClass(str, z);
    }
}
