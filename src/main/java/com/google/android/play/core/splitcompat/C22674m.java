package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.m */
public final class C22674m {

    /* renamed from: a */
    public static final /* synthetic */ int f56099a = 0;

    /* renamed from: b */
    private static final Pattern f56100b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: c */
    private final C22666e f56101c;

    C22674m(C22666e eVar) throws IOException {
        this.f56101c = eVar;
    }

    /* renamed from: a */
    static /* synthetic */ Set m82530a(C22674m mVar, Set set, AbstractC22680s sVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        mVar.m82533a(sVar, set, new C22670i(hashSet, sVar, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f4 A[SYNTHETIC, Splitter:B:33:0x00f4] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m82532a(com.google.android.play.core.splitcompat.AbstractC22680s r13, com.google.android.play.core.splitcompat.AbstractC22671j r14) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C22674m.m82532a(com.google.android.play.core.splitcompat.s, com.google.android.play.core.splitcompat.j):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m82533a(AbstractC22680s sVar, Set<C22673l> set, AbstractC22672k kVar) throws IOException {
        for (C22673l lVar : set) {
            File a = this.f56101c.mo78983a(sVar.mo78976b(), lVar.f56097a);
            boolean z = false;
            if (a.exists() && a.length() == lVar.f56098b.getSize()) {
                z = true;
            }
            kVar.mo78995a(lVar, a, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<File> mo78997a() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<AbstractC22680s> d = this.f56101c.mo78990d();
        for (String str : this.f56101c.mo78992e()) {
            Iterator<AbstractC22680s> it = d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo78976b().equals(str)) {
                        break;
                    }
                } else {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f56101c.mo78991d(str);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (AbstractC22680s sVar : d) {
            HashSet hashSet2 = new HashSet();
            m82532a(sVar, new C22669h(this, hashSet2, sVar));
            for (File file : this.f56101c.mo78993e(sVar.mo78976b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), sVar.mo78976b(), sVar.mo78975a().getAbsolutePath()));
                    this.f56101c.mo78987b(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<File> mo78998a(AbstractC22680s sVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m82532a(sVar, new C22668g(this, sVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }
}
