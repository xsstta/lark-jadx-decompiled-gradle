package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class zzfo {
    private final zzfj zza;
    private final String zzb;

    private zzfo(zzfj zzfj, String str) {
        this.zza = zzfj;
        this.zzb = (String) zzft.zza(str);
    }

    public final StringBuilder zza(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
        try {
            zzft.zza(sb);
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(this.zza.zza(entry.getKey()));
                sb.append((CharSequence) this.zzb);
                sb.append(this.zza.zza(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.zza.zza);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(this.zza.zza(entry2.getKey()));
                    sb.append((CharSequence) this.zzb);
                    sb.append(this.zza.zza(entry2.getValue()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* synthetic */ zzfo(zzfj zzfj, String str, zzfm zzfm) {
        this(zzfj, str);
    }
}
