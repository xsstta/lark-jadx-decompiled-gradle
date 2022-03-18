package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitcompat.g */
public final class C22668g implements AbstractC22671j {

    /* renamed from: a */
    final /* synthetic */ AbstractC22680s f56087a;

    /* renamed from: b */
    final /* synthetic */ Set f56088b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f56089c;

    /* renamed from: d */
    final /* synthetic */ C22674m f56090d;

    C22668g(C22674m mVar, AbstractC22680s sVar, Set set, AtomicBoolean atomicBoolean) {
        this.f56090d = mVar;
        this.f56087a = sVar;
        this.f56088b = set;
        this.f56089c = atomicBoolean;
    }

    @Override // com.google.android.play.core.splitcompat.AbstractC22671j
    /* renamed from: a */
    public final void mo78996a(ZipFile zipFile, Set<C22673l> set) throws IOException {
        this.f56090d.m82533a(this.f56087a, set, new C22667f(this));
    }
}
