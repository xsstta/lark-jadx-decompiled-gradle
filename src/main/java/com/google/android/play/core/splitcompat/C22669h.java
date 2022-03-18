package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitcompat.h */
public final class C22669h implements AbstractC22671j {

    /* renamed from: a */
    final /* synthetic */ Set f56091a;

    /* renamed from: b */
    final /* synthetic */ AbstractC22680s f56092b;

    /* renamed from: c */
    final /* synthetic */ C22674m f56093c;

    C22669h(C22674m mVar, Set set, AbstractC22680s sVar) {
        this.f56093c = mVar;
        this.f56091a = set;
        this.f56092b = sVar;
    }

    @Override // com.google.android.play.core.splitcompat.AbstractC22671j
    /* renamed from: a */
    public final void mo78996a(ZipFile zipFile, Set<C22673l> set) throws IOException {
        this.f56091a.addAll(C22674m.m82530a(this.f56093c, set, this.f56092b, zipFile));
    }
}
