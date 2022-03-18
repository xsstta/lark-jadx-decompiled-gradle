package com.google.android.datatransport.cct.p970a;

import com.google.android.datatransport.cct.p970a.zzq;

/* renamed from: com.google.android.datatransport.cct.a.e */
final class C21359e extends zzq {

    /* renamed from: a */
    private final zzq.zzb f51928a;

    /* renamed from: b */
    private final AbstractC21352a f51929b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.a.e$b */
    public static final class C21361b extends zzq.AbstractC21384a {

        /* renamed from: a */
        private zzq.zzb f51930a;

        /* renamed from: b */
        private AbstractC21352a f51931b;

        C21361b() {
        }

        @Override // com.google.android.datatransport.cct.p970a.zzq.AbstractC21384a
        /* renamed from: a */
        public zzq mo72542a() {
            return new C21359e(this.f51930a, this.f51931b, null);
        }

        @Override // com.google.android.datatransport.cct.p970a.zzq.AbstractC21384a
        /* renamed from: a */
        public zzq.AbstractC21384a mo72540a(AbstractC21352a aVar) {
            this.f51931b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.zzq.AbstractC21384a
        /* renamed from: a */
        public zzq.AbstractC21384a mo72541a(zzq.zzb zzb) {
            this.f51930a = zzb;
            return this;
        }
    }

    /* renamed from: a */
    public zzq.zzb mo72535a() {
        return this.f51928a;
    }

    /* renamed from: b */
    public AbstractC21352a mo72536b() {
        return this.f51929b;
    }

    public int hashCode() {
        int i;
        zzq.zzb zzb = this.f51928a;
        int i2 = 0;
        if (zzb == null) {
            i = 0;
        } else {
            i = zzb.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        AbstractC21352a aVar = this.f51929b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f51928a + ", androidClientInfo=" + this.f51929b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq.zzb zzb = this.f51928a;
        if (zzb != null ? zzb.equals(((C21359e) obj).f51928a) : ((C21359e) obj).f51928a == null) {
            AbstractC21352a aVar = this.f51929b;
            if (aVar == null) {
                if (((C21359e) obj).f51929b == null) {
                    return true;
                }
            } else if (aVar.equals(((C21359e) obj).f51929b)) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ C21359e(zzq.zzb zzb, AbstractC21352a aVar, C21360a aVar2) {
        this.f51928a = zzb;
        this.f51929b = aVar;
    }
}
