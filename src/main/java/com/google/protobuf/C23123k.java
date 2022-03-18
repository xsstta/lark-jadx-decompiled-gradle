package com.google.protobuf;

/* renamed from: com.google.protobuf.k */
public class C23123k {

    /* renamed from: b */
    private static final C23111g f57069b = C23111g.m83798b();

    /* renamed from: a */
    protected volatile AbstractC23125m f57070a;

    /* renamed from: c */
    private ByteString f57071c;

    /* renamed from: d */
    private C23111g f57072d;

    /* renamed from: e */
    private volatile ByteString f57073e;

    public int hashCode() {
        return 1;
    }

    /* renamed from: b */
    public ByteString mo80291b() {
        if (this.f57073e != null) {
            return this.f57073e;
        }
        ByteString byteString = this.f57071c;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f57073e != null) {
                return this.f57073e;
            }
            if (this.f57070a == null) {
                this.f57073e = ByteString.EMPTY;
            } else {
                this.f57073e = this.f57070a.mo80224a();
            }
            return this.f57073e;
        }
    }

    /* renamed from: a */
    public AbstractC23125m mo80290a(AbstractC23125m mVar) {
        mo80293c(mVar);
        return this.f57070a;
    }

    /* renamed from: b */
    public AbstractC23125m mo80292b(AbstractC23125m mVar) {
        AbstractC23125m mVar2 = this.f57070a;
        this.f57071c = null;
        this.f57073e = null;
        this.f57070a = mVar;
        return mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80293c(AbstractC23125m mVar) {
        if (this.f57070a == null) {
            synchronized (this) {
                if (this.f57070a == null) {
                    try {
                        if (this.f57071c != null) {
                            this.f57070a = (AbstractC23125m) mVar.mo80122d().mo80235c(this.f57071c, this.f57072d);
                            this.f57073e = this.f57071c;
                        } else {
                            this.f57070a = mVar;
                            this.f57073e = ByteString.EMPTY;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.f57070a = mVar;
                        this.f57073e = ByteString.EMPTY;
                    }
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23123k)) {
            return false;
        }
        C23123k kVar = (C23123k) obj;
        AbstractC23125m mVar = this.f57070a;
        AbstractC23125m mVar2 = kVar.f57070a;
        if (mVar == null && mVar2 == null) {
            return mo80291b().equals(kVar.mo80291b());
        }
        if (mVar != null && mVar2 != null) {
            return mVar.equals(mVar2);
        }
        if (mVar != null) {
            return mVar.equals(kVar.mo80290a(mVar.mo80132m()));
        }
        return mo80290a(mVar2.mo80132m()).equals(mVar2);
    }
}
