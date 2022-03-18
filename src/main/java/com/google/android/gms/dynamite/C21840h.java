package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.dynamite.h */
public final class C21840h extends PathClassLoader {
    C21840h(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
