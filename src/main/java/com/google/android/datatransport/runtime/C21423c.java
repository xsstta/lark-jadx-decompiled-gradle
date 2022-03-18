package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AbstractC21439l;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.c */
final class C21423c extends AbstractC21439l {

    /* renamed from: a */
    private final String f52024a;

    /* renamed from: b */
    private final byte[] f52025b;

    /* renamed from: c */
    private final Priority f52026c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.c$a */
    public static final class C21425a extends AbstractC21439l.AbstractC21440a {

        /* renamed from: a */
        private String f52027a;

        /* renamed from: b */
        private byte[] f52028b;

        /* renamed from: c */
        private Priority f52029c;

        C21425a() {
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21439l.AbstractC21440a
        /* renamed from: a */
        public AbstractC21439l mo72669a() {
            String str = "";
            if (this.f52027a == null) {
                str = str + " backendName";
            }
            if (this.f52029c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C21423c(this.f52027a, this.f52028b, this.f52029c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21439l.AbstractC21440a
        /* renamed from: a */
        public AbstractC21439l.AbstractC21440a mo72668a(byte[] bArr) {
            this.f52028b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21439l.AbstractC21440a
        /* renamed from: a */
        public AbstractC21439l.AbstractC21440a mo72666a(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.f52029c = priority;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21439l.AbstractC21440a
        /* renamed from: a */
        public AbstractC21439l.AbstractC21440a mo72667a(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f52027a = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21439l
    /* renamed from: a */
    public String mo72661a() {
        return this.f52024a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21439l
    /* renamed from: b */
    public byte[] mo72662b() {
        return this.f52025b;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21439l
    /* renamed from: c */
    public Priority mo72663c() {
        return this.f52026c;
    }

    public int hashCode() {
        return ((((this.f52024a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52025b)) * 1000003) ^ this.f52026c.hashCode();
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21439l)) {
            return false;
        }
        AbstractC21439l lVar = (AbstractC21439l) obj;
        if (this.f52024a.equals(lVar.mo72661a())) {
            byte[] bArr2 = this.f52025b;
            if (lVar instanceof C21423c) {
                bArr = ((C21423c) lVar).f52025b;
            } else {
                bArr = lVar.mo72662b();
            }
            if (!Arrays.equals(bArr2, bArr) || !this.f52026c.equals(lVar.mo72663c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    private C21423c(String str, byte[] bArr, Priority priority) {
        this.f52024a = str;
        this.f52025b = bArr;
        this.f52026c = priority;
    }
}
