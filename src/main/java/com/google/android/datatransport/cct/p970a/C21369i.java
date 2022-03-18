package com.google.android.datatransport.cct.p970a;

import com.google.android.datatransport.cct.p970a.zzy;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.a.i */
public final class C21369i extends zzy {

    /* renamed from: a */
    private final zzy.zzc f51961a;

    /* renamed from: b */
    private final zzy.zzb f51962b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.a.i$b */
    public static final class C21371b extends zzy.AbstractC21385a {

        /* renamed from: a */
        private zzy.zzc f51963a;

        /* renamed from: b */
        private zzy.zzb f51964b;

        C21371b() {
        }

        @Override // com.google.android.datatransport.cct.p970a.zzy.AbstractC21385a
        /* renamed from: a */
        public zzy mo72589a() {
            return new C21369i(this.f51963a, this.f51964b, null);
        }

        @Override // com.google.android.datatransport.cct.p970a.zzy.AbstractC21385a
        /* renamed from: a */
        public zzy.AbstractC21385a mo72587a(zzy.zzb zzb) {
            this.f51964b = zzb;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.zzy.AbstractC21385a
        /* renamed from: a */
        public zzy.AbstractC21385a mo72588a(zzy.zzc zzc) {
            this.f51963a = zzc;
            return this;
        }
    }

    /* renamed from: a */
    public zzy.zzc mo72582a() {
        return this.f51961a;
    }

    /* renamed from: b */
    public zzy.zzb mo72583b() {
        return this.f51962b;
    }

    public int hashCode() {
        int i;
        zzy.zzc zzc = this.f51961a;
        int i2 = 0;
        if (zzc == null) {
            i = 0;
        } else {
            i = zzc.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        zzy.zzb zzb = this.f51962b;
        if (zzb != null) {
            i2 = zzb.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f51961a + ", mobileSubtype=" + this.f51962b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzy)) {
            return false;
        }
        zzy.zzc zzc = this.f51961a;
        if (zzc != null ? zzc.equals(((C21369i) obj).f51961a) : ((C21369i) obj).f51961a == null) {
            zzy.zzb zzb = this.f51962b;
            if (zzb == null) {
                if (((C21369i) obj).f51962b == null) {
                    return true;
                }
            } else if (zzb.equals(((C21369i) obj).f51962b)) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ C21369i(zzy.zzc zzc, zzy.zzb zzb, C21370a aVar) {
        this.f51961a = zzc;
        this.f51962b = zzb;
    }
}
