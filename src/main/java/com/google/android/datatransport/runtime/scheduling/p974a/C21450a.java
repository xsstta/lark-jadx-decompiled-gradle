package com.google.android.datatransport.runtime.scheduling.p974a;

import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.a */
final class C21450a extends AbstractC21462d {

    /* renamed from: b */
    private final long f52073b;

    /* renamed from: c */
    private final int f52074c;

    /* renamed from: d */
    private final int f52075d;

    /* renamed from: e */
    private final long f52076e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.a$a */
    public static final class C21452a extends AbstractC21462d.AbstractC21463a {

        /* renamed from: a */
        private Long f52077a;

        /* renamed from: b */
        private Integer f52078b;

        /* renamed from: c */
        private Integer f52079c;

        /* renamed from: d */
        private Long f52080d;

        C21452a() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d.AbstractC21463a
        /* renamed from: a */
        public AbstractC21462d mo72709a() {
            String str = "";
            if (this.f52077a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f52078b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f52079c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f52080d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new C21450a(this.f52077a.longValue(), this.f52078b.intValue(), this.f52079c.intValue(), this.f52080d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d.AbstractC21463a
        /* renamed from: a */
        public AbstractC21462d.AbstractC21463a mo72707a(int i) {
            this.f52078b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d.AbstractC21463a
        /* renamed from: b */
        public AbstractC21462d.AbstractC21463a mo72710b(int i) {
            this.f52079c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d.AbstractC21463a
        /* renamed from: a */
        public AbstractC21462d.AbstractC21463a mo72708a(long j) {
            this.f52077a = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d.AbstractC21463a
        /* renamed from: b */
        public AbstractC21462d.AbstractC21463a mo72711b(long j) {
            this.f52080d = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d
    /* renamed from: a */
    public long mo72700a() {
        return this.f52073b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d
    /* renamed from: b */
    public int mo72701b() {
        return this.f52074c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d
    /* renamed from: c */
    public int mo72702c() {
        return this.f52075d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21462d
    /* renamed from: d */
    public long mo72703d() {
        return this.f52076e;
    }

    public int hashCode() {
        long j = this.f52073b;
        long j2 = this.f52076e;
        return ((int) ((j2 >>> 32) ^ j2)) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f52074c) * 1000003) ^ this.f52075d) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f52073b + ", loadBatchSize=" + this.f52074c + ", criticalSectionEnterTimeoutMs=" + this.f52075d + ", eventCleanUpAge=" + this.f52076e + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21462d)) {
            return false;
        }
        AbstractC21462d dVar = (AbstractC21462d) obj;
        if (this.f52073b == dVar.mo72700a() && this.f52074c == dVar.mo72701b() && this.f52075d == dVar.mo72702c() && this.f52076e == dVar.mo72703d()) {
            return true;
        }
        return false;
    }

    private C21450a(long j, int i, int i2, long j2) {
        this.f52073b = j;
        this.f52074c = i;
        this.f52075d = i2;
        this.f52076e = j2;
    }
}
