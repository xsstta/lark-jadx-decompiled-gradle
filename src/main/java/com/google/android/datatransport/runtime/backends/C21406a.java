package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.backends.AbstractC21414g;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
final class C21406a extends AbstractC21414g {

    /* renamed from: a */
    private final Iterable<AbstractC21433h> f52001a;

    /* renamed from: b */
    private final byte[] f52002b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.backends.a$a */
    public static final class C21408a extends AbstractC21414g.AbstractC21415a {

        /* renamed from: a */
        private Iterable<AbstractC21433h> f52003a;

        /* renamed from: b */
        private byte[] f52004b;

        C21408a() {
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC21414g.AbstractC21415a
        /* renamed from: a */
        public AbstractC21414g mo72645a() {
            String str = "";
            if (this.f52003a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C21406a(this.f52003a, this.f52004b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC21414g.AbstractC21415a
        /* renamed from: a */
        public AbstractC21414g.AbstractC21415a mo72644a(byte[] bArr) {
            this.f52004b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC21414g.AbstractC21415a
        /* renamed from: a */
        public AbstractC21414g.AbstractC21415a mo72643a(Iterable<AbstractC21433h> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f52003a = iterable;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21414g
    /* renamed from: a */
    public Iterable<AbstractC21433h> mo72638a() {
        return this.f52001a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21414g
    /* renamed from: b */
    public byte[] mo72639b() {
        return this.f52002b;
    }

    public int hashCode() {
        return ((this.f52001a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52002b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f52001a + ", extras=" + Arrays.toString(this.f52002b) + "}";
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21414g)) {
            return false;
        }
        AbstractC21414g gVar = (AbstractC21414g) obj;
        if (this.f52001a.equals(gVar.mo72638a())) {
            byte[] bArr2 = this.f52002b;
            if (gVar instanceof C21406a) {
                bArr = ((C21406a) gVar).f52002b;
            } else {
                bArr = gVar.mo72639b();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    private C21406a(Iterable<AbstractC21433h> iterable, byte[] bArr) {
        this.f52001a = iterable;
        this.f52002b = bArr;
    }
}
