package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.splitcompat.f */
final class C22667f implements AbstractC22672k {

    /* renamed from: a */
    final /* synthetic */ C22668g f56086a;

    C22667f(C22668g gVar) {
        this.f56086a = gVar;
    }

    @Override // com.google.android.play.core.splitcompat.AbstractC22672k
    /* renamed from: a */
    public final void mo78995a(C22673l lVar, File file, boolean z) throws IOException {
        this.f56086a.f56088b.add(file);
        if (!z) {
            this.f56086a.f56089c.set(false);
        }
    }
}
