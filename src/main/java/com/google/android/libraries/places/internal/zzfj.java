package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

public class zzfj {
    private final String zza;

    public zzfj zza() {
        return new zzfl(this, this);
    }

    private zzfj(zzfj zzfj) {
        this.zza = zzfj.zza;
    }

    public static zzfj zza(String str) {
        return new zzfj(str);
    }

    public zzfo zzb(String str) {
        return new zzfo(this, str, null);
    }

    private zzfj(String str) {
        this.zza = (String) zzft.zza(str);
    }

    /* access modifiers changed from: package-private */
    public CharSequence zza(Object obj) {
        zzft.zza(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* synthetic */ zzfj(zzfj zzfj, zzfm zzfm) {
        this(zzfj);
    }

    public <A extends Appendable> A zza(A a, Iterator<?> it) throws IOException {
        zzft.zza(a);
        if (it.hasNext()) {
            a.append(zza(it.next()));
            while (it.hasNext()) {
                a.append(this.zza);
                a.append(zza(it.next()));
            }
        }
        return a;
    }

    public final StringBuilder zza(StringBuilder sb, Iterator<?> it) {
        try {
            zza((Appendable) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
