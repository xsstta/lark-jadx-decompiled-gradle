package com.google.android.gms.internal.p979b;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.b.o */
final class C21899o extends AbstractC21898n {

    /* renamed from: a */
    private final C21897m f53314a = new C21897m();

    C21899o() {
    }

    @Override // com.google.android.gms.internal.p979b.AbstractC21898n
    /* renamed from: a */
    public final void mo74006a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f53314a.mo74007a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
