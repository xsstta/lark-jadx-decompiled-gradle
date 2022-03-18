package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.c */
public final class C21718c extends AbstractC21716a {

    /* renamed from: c */
    private WeakReference<ImageManager.AbstractC21712a> f52977c;

    public final int hashCode() {
        return Objects.hashCode(this.f52974a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21718c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C21718c cVar = (C21718c) obj;
        ImageManager.AbstractC21712a aVar = this.f52977c.get();
        ImageManager.AbstractC21712a aVar2 = cVar.f52977c.get();
        return aVar2 != null && aVar != null && Objects.equal(aVar2, aVar) && Objects.equal(cVar.f52974a, this.f52974a);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.images.AbstractC21716a
    /* renamed from: a */
    public final void mo73565a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.AbstractC21712a aVar;
        if (!z2 && (aVar = this.f52977c.get()) != null) {
            aVar.mo73553a(this.f52974a.f52976a, drawable, z3);
        }
    }
}
