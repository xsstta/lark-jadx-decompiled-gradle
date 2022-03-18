package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* renamed from: com.google.android.gms.common.images.b */
final class C21717b {

    /* renamed from: a */
    public final Uri f52976a;

    public C21717b(Uri uri) {
        this.f52976a = uri;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f52976a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21717b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Objects.equal(((C21717b) obj).f52976a, this.f52976a);
    }
}
