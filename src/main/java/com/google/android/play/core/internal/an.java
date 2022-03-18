package com.google.android.play.core.internal;

import android.util.Log;
import com.google.android.play.core.splitinstall.az;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class an implements AbstractC22626ag {
    an() {
    }

    /* renamed from: a */
    static am m82265a() {
        return new C22628ai();
    }

    /* renamed from: a */
    static Object m82266a(ClassLoader classLoader) {
        return bd.m82313a(classLoader, "pathList", Object.class).mo78876a();
    }

    /* renamed from: a */
    static boolean m82267a(ClassLoader classLoader, File file, File file2, boolean z, am amVar, String str, ak akVar) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object a = m82266a(classLoader);
        bc b = bd.m82323b(a, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b.mo78876a());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add((File) bd.m82313a(obj, str, File.class).mo78876a());
        }
        if (!arrayList2.contains(file2)) {
            if (!z && !akVar.mo78869a(a, file2, file)) {
                String valueOf = String.valueOf(file2.getPath());
                Log.w("SplitCompat", valueOf.length() == 0 ? new String("Should be optimized ") : "Should be optimized ".concat(valueOf));
                return false;
            }
            b.mo78878a((Collection) Arrays.asList(amVar.mo78868a(a, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
            if (!arrayList.isEmpty()) {
                bj bjVar = new bj("DexPathList.makeDexElement failed");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    IOException iOException = arrayList.get(i);
                    Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                    bx.m82371a(bjVar, iOException);
                }
                bd.m82323b(a, "dexElementsSuppressedExceptions", IOException.class).mo78878a((Collection) arrayList);
                throw bjVar;
            }
        }
        return true;
    }

    /* renamed from: b */
    static ak m82268b() {
        return new aj();
    }

    /* renamed from: b */
    static void m82269b(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                Log.d("Splitcompat", valueOf.length() == 0 ? new String("Adding native library parent directory: ") : "Adding native library parent directory: ".concat(valueOf));
                hashSet.add(file.getParentFile());
            }
            bc b = bd.m82323b(m82266a(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) b.mo78876a()));
            synchronized (az.class) {
                int size = hashSet.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                Log.d("Splitcompat", sb.toString());
                b.mo78880b(hashSet);
            }
        }
    }

    @Override // com.google.android.play.core.internal.AbstractC22626ag
    /* renamed from: a */
    public final void mo78866a(ClassLoader classLoader, Set<File> set) {
        m82269b(classLoader, set);
    }

    @Override // com.google.android.play.core.internal.AbstractC22626ag
    /* renamed from: a */
    public final boolean mo78867a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m82267a(classLoader, file, file2, z, m82265a(), "zip", m82268b());
    }
}
