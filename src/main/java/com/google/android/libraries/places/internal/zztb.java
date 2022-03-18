package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class zztb extends zztc<FieldDescriptorType, Object> {
    @Override // com.google.android.libraries.places.internal.zztc
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                Map.Entry zzb = zzb(i);
                if (((zzqv) zzb.getKey()).zzd()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzqv) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }

    zztb(int i) {
        super(i, null);
    }
}
