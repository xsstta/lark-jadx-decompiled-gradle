package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class zzfl extends zzfj {
    private final /* synthetic */ zzfj zza;

    @Override // com.google.android.libraries.places.internal.zzfj
    public final zzfo zzb(String str) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfl(zzfj zzfj, zzfj zzfj2) {
        super(zzfj2, null);
        this.zza = zzfj;
    }

    @Override // com.google.android.libraries.places.internal.zzfj
    public final <A extends Appendable> A zza(A a, Iterator<?> it) throws IOException {
        zzft.zza(a, "appendable");
        zzft.zza(it, "parts");
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    a.append(this.zza.zza(next));
                    break;
                }
            } else {
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                a.append(this.zza.zza);
                a.append(this.zza.zza(next2));
            }
        }
        return a;
    }
}
