package com.google.android.datatransport.cct.p970a;

import com.google.android.datatransport.cct.p970a.C21359e;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* renamed from: com.google.android.datatransport.cct.a.zzq */
public abstract class zzq {

    /* renamed from: com.google.android.datatransport.cct.a.zzq$a */
    public static abstract class AbstractC21384a {
        /* renamed from: a */
        public abstract AbstractC21384a mo72540a(AbstractC21352a aVar);

        /* renamed from: a */
        public abstract AbstractC21384a mo72541a(zzb zzb);

        /* renamed from: a */
        public abstract zzq mo72542a();
    }

    /* renamed from: c */
    public static AbstractC21384a m77405c() {
        return new C21359e.C21361b();
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.google.android.datatransport.cct.a.zzq$zzb */
    public static final class zzb extends Enum<zzb> {
        public static final zzb zza = new zzb(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        public static final zzb zzb = new zzb("ANDROID", 1, 4);

        private zzb(String str, int i, int i2) {
        }
    }
}
