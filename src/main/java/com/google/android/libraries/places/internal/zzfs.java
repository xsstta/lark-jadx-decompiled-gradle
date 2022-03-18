package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzfs {
    private final zzfd zza;
    private final boolean zzb;
    private final zzfw zzc;
    private final int zzd;

    private zzfs(zzfw zzfw) {
        this(zzfw, false, zzfh.zza, Integer.MAX_VALUE);
    }

    public static zzfs zza(zzfd zzfd) {
        zzft.zza(zzfd);
        return new zzfs(new zzfv(zzfd));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzft.zza(charSequence);
        Iterator<String> zza2 = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza2.hasNext()) {
            arrayList.add(zza2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private zzfs(zzfw zzfw, boolean z, zzfd zzfd, int i) {
        this.zzc = zzfw;
        this.zza = zzfd;
        this.zzd = Integer.MAX_VALUE;
    }
}
