package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class ay implements AbstractC22626ag {
    ay() {
    }

    /* renamed from: b */
    static void m82291b(ClassLoader classLoader, Set<File> set) {
        C22629at.m82280a(classLoader, set, new aw());
    }

    /* renamed from: b */
    static boolean m82292b(ClassLoader classLoader, File file, File file2, boolean z) {
        return an.m82267a(classLoader, file, file2, z, C22629at.m82279a(), "path", new ax());
    }

    @Override // com.google.android.play.core.internal.AbstractC22626ag
    /* renamed from: a */
    public final void mo78866a(ClassLoader classLoader, Set<File> set) {
        m82291b(classLoader, set);
    }

    @Override // com.google.android.play.core.internal.AbstractC22626ag
    /* renamed from: a */
    public final boolean mo78867a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m82292b(classLoader, file, file2, z);
    }
}
