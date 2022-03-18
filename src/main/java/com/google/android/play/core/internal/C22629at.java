package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.az;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.at */
public final class C22629at implements AbstractC22626ag {
    C22629at() {
    }

    /* renamed from: a */
    static am m82279a() {
        return new ap();
    }

    /* renamed from: a */
    public static void m82280a(ClassLoader classLoader, Set<File> set, ar arVar) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                hashSet.add(file.getParentFile());
            }
            Object a = an.m82266a(classLoader);
            bc a2 = bd.m82313a(a, "nativeLibraryDirectories", List.class);
            synchronized (az.class) {
                ArrayList arrayList = new ArrayList((Collection) a2.mo78876a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                a2.mo78877a((Object) arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] a3 = arVar.mo78870a(a, new ArrayList(hashSet), arrayList2);
            if (!arrayList2.isEmpty()) {
                bj bjVar = new bj("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    bx.m82371a(bjVar, arrayList2.get(i));
                }
                throw bjVar;
            }
            synchronized (az.class) {
                bd.m82323b(a, "nativeLibraryPathElements", Object.class).mo78880b(Arrays.asList(a3));
            }
        }
    }

    /* renamed from: a */
    public static boolean m82281a(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return an.m82267a(classLoader, file, file2, z, m82279a(), str, an.m82268b());
    }

    /* renamed from: b */
    static ar m82282b() {
        return new aq();
    }

    @Override // com.google.android.play.core.internal.AbstractC22626ag
    /* renamed from: a */
    public final void mo78866a(ClassLoader classLoader, Set<File> set) {
        m82280a(classLoader, set, m82282b());
    }

    @Override // com.google.android.play.core.internal.AbstractC22626ag
    /* renamed from: a */
    public final boolean mo78867a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m82281a(classLoader, file, file2, z, "zip");
    }
}
