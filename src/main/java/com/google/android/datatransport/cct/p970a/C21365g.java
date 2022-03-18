package com.google.android.datatransport.cct.p970a;

import com.google.android.datatransport.cct.p970a.AbstractC21379p;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.a.g */
public final class C21365g extends AbstractC21379p {

    /* renamed from: a */
    private final long f51946a;

    /* renamed from: b */
    private final long f51947b;

    /* renamed from: c */
    private final zzq f51948c;

    /* renamed from: d */
    private final int f51949d;

    /* renamed from: e */
    private final String f51950e;

    /* renamed from: f */
    private final List<AbstractC21376n> f51951f;

    /* renamed from: g */
    private final zzaa f51952g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.a.g$b */
    public static final class C21367b extends AbstractC21379p.AbstractC21380a {

        /* renamed from: a */
        private Long f51953a;

        /* renamed from: b */
        private Long f51954b;

        /* renamed from: c */
        private zzq f51955c;

        /* renamed from: d */
        private Integer f51956d;

        /* renamed from: e */
        private String f51957e;

        /* renamed from: f */
        private List<AbstractC21376n> f51958f;

        /* renamed from: g */
        private zzaa f51959g;

        C21367b() {
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: a */
        public AbstractC21379p mo72576a() {
            String str = "";
            if (this.f51953a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f51954b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.f51956d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new C21365g(this.f51953a.longValue(), this.f51954b.longValue(), this.f51955c, this.f51956d.intValue(), this.f51957e, this.f51958f, this.f51959g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: a */
        public AbstractC21379p.AbstractC21380a mo72572a(zzaa zzaa) {
            this.f51959g = zzaa;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: a */
        public AbstractC21379p.AbstractC21380a mo72570a(int i) {
            this.f51956d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: b */
        public AbstractC21379p.AbstractC21380a mo72577b(long j) {
            this.f51954b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: a */
        public AbstractC21379p.AbstractC21380a mo72571a(long j) {
            this.f51953a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: a */
        public AbstractC21379p.AbstractC21380a mo72573a(zzq zzq) {
            this.f51955c = zzq;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: a */
        public AbstractC21379p.AbstractC21380a mo72574a(String str) {
            this.f51957e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21379p.AbstractC21380a
        /* renamed from: a */
        public AbstractC21379p.AbstractC21380a mo72575a(List<AbstractC21376n> list) {
            this.f51958f = list;
            return this;
        }
    }

    /* renamed from: a */
    public long mo72561a() {
        return this.f51946a;
    }

    /* renamed from: b */
    public long mo72562b() {
        return this.f51947b;
    }

    /* renamed from: c */
    public zzq mo72563c() {
        return this.f51948c;
    }

    /* renamed from: d */
    public int mo72564d() {
        return this.f51949d;
    }

    /* renamed from: e */
    public String mo72565e() {
        return this.f51950e;
    }

    /* renamed from: f */
    public List<AbstractC21376n> mo72567f() {
        return this.f51951f;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        long j = this.f51946a;
        long j2 = this.f51947b;
        int i4 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        zzq zzq = this.f51948c;
        int i5 = 0;
        if (zzq == null) {
            i = 0;
        } else {
            i = zzq.hashCode();
        }
        int i6 = (((i4 ^ i) * 1000003) ^ this.f51949d) * 1000003;
        String str = this.f51950e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        List<AbstractC21376n> list = this.f51951f;
        if (list == null) {
            i3 = 0;
        } else {
            i3 = list.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        zzaa zzaa = this.f51952g;
        if (zzaa != null) {
            i5 = zzaa.hashCode();
        }
        return i8 ^ i5;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f51946a + ", requestUptimeMs=" + this.f51947b + ", clientInfo=" + this.f51948c + ", logSource=" + this.f51949d + ", logSourceName=" + this.f51950e + ", logEvents=" + this.f51951f + ", qosTier=" + this.f51952g + "}";
    }

    public boolean equals(Object obj) {
        zzq zzq;
        String str;
        List<AbstractC21376n> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21379p)) {
            return false;
        }
        C21365g gVar = (C21365g) ((AbstractC21379p) obj);
        if (this.f51946a == gVar.f51946a && this.f51947b == gVar.f51947b && ((zzq = this.f51948c) != null ? zzq.equals(gVar.f51948c) : gVar.f51948c == null) && this.f51949d == gVar.f51949d && ((str = this.f51950e) != null ? str.equals(gVar.f51950e) : gVar.f51950e == null) && ((list = this.f51951f) != null ? list.equals(gVar.f51951f) : gVar.f51951f == null)) {
            zzaa zzaa = this.f51952g;
            if (zzaa == null) {
                if (gVar.f51952g == null) {
                    return true;
                }
            } else if (zzaa.equals(gVar.f51952g)) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ C21365g(long j, long j2, zzq zzq, int i, String str, List list, zzaa zzaa, C21366a aVar) {
        this.f51946a = j;
        this.f51947b = j2;
        this.f51948c = zzq;
        this.f51949d = i;
        this.f51950e = str;
        this.f51951f = list;
        this.f51952g = zzaa;
    }
}
