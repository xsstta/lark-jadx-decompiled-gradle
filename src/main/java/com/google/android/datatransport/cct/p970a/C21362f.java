package com.google.android.datatransport.cct.p970a;

import com.google.android.datatransport.cct.p970a.AbstractC21376n;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.a.f */
public final class C21362f extends AbstractC21376n {

    /* renamed from: a */
    private final long f51932a;

    /* renamed from: b */
    private final int f51933b;

    /* renamed from: c */
    private final long f51934c;

    /* renamed from: d */
    private final byte[] f51935d;

    /* renamed from: e */
    private final String f51936e;

    /* renamed from: f */
    private final long f51937f;

    /* renamed from: g */
    private final zzy f51938g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.cct.a.f$b */
    public static final class C21364b extends AbstractC21376n.AbstractC21377a {

        /* renamed from: a */
        private Long f51939a;

        /* renamed from: b */
        private Integer f51940b;

        /* renamed from: c */
        private Long f51941c;

        /* renamed from: d */
        private byte[] f51942d;

        /* renamed from: e */
        private String f51943e;

        /* renamed from: f */
        private Long f51944f;

        /* renamed from: g */
        private zzy f51945g;

        C21364b() {
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: a */
        public AbstractC21376n mo72558a() {
            String str = "";
            if (this.f51939a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f51940b == null) {
                str = str + " eventCode";
            }
            if (this.f51941c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f51944f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C21362f(this.f51939a.longValue(), this.f51940b.intValue(), this.f51941c.longValue(), this.f51942d, this.f51943e, this.f51944f.longValue(), this.f51945g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: a */
        public AbstractC21376n.AbstractC21377a mo72555a(zzy zzy) {
            this.f51945g = zzy;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: a */
        public AbstractC21376n.AbstractC21377a mo72553a(int i) {
            this.f51940b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: b */
        public AbstractC21376n.AbstractC21377a mo72559b(long j) {
            this.f51941c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: c */
        public AbstractC21376n.AbstractC21377a mo72560c(long j) {
            this.f51944f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: a */
        public AbstractC21376n.AbstractC21377a mo72554a(long j) {
            this.f51939a = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: a */
        public AbstractC21376n.AbstractC21377a mo72556a(String str) {
            this.f51943e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n.AbstractC21377a
        /* renamed from: a */
        public AbstractC21376n.AbstractC21377a mo72557a(byte[] bArr) {
            this.f51942d = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n
    /* renamed from: a */
    public long mo72543a() {
        return this.f51932a;
    }

    /* renamed from: b */
    public int mo72544b() {
        return this.f51933b;
    }

    @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n
    /* renamed from: c */
    public long mo72545c() {
        return this.f51934c;
    }

    /* renamed from: d */
    public byte[] mo72546d() {
        return this.f51935d;
    }

    /* renamed from: e */
    public String mo72547e() {
        return this.f51936e;
    }

    @Override // com.google.android.datatransport.cct.p970a.AbstractC21376n
    /* renamed from: f */
    public long mo72549f() {
        return this.f51937f;
    }

    /* renamed from: g */
    public zzy mo72550g() {
        return this.f51938g;
    }

    public int hashCode() {
        int i;
        long j = this.f51932a;
        long j2 = this.f51934c;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f51933b) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f51935d)) * 1000003;
        String str = this.f51936e;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j3 = this.f51937f;
        int i3 = (((hashCode ^ i) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        zzy zzy = this.f51938g;
        if (zzy != null) {
            i2 = zzy.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f51932a + ", eventCode=" + this.f51933b + ", eventUptimeMs=" + this.f51934c + ", sourceExtension=" + Arrays.toString(this.f51935d) + ", sourceExtensionJsonProto3=" + this.f51936e + ", timezoneOffsetSeconds=" + this.f51937f + ", networkConnectionInfo=" + this.f51938g + "}";
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21376n)) {
            return false;
        }
        AbstractC21376n nVar = (AbstractC21376n) obj;
        if (this.f51932a == nVar.mo72543a()) {
            C21362f fVar = (C21362f) nVar;
            if (this.f51933b == fVar.f51933b && this.f51934c == nVar.mo72545c()) {
                byte[] bArr2 = this.f51935d;
                if (nVar instanceof C21362f) {
                    bArr = fVar.f51935d;
                } else {
                    bArr = fVar.f51935d;
                }
                if (Arrays.equals(bArr2, bArr) && ((str = this.f51936e) != null ? str.equals(fVar.f51936e) : fVar.f51936e == null) && this.f51937f == nVar.mo72549f()) {
                    zzy zzy = this.f51938g;
                    if (zzy == null) {
                        if (fVar.f51938g == null) {
                            return true;
                        }
                    } else if (zzy.equals(fVar.f51938g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* synthetic */ C21362f(long j, int i, long j2, byte[] bArr, String str, long j3, zzy zzy, C21363a aVar) {
        this.f51932a = j;
        this.f51933b = i;
        this.f51934c = j2;
        this.f51935d = bArr;
        this.f51936e = str;
        this.f51937f = j3;
        this.f51938g = zzy;
    }
}
