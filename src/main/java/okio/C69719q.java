package okio;

import javax.annotation.Nullable;

/* access modifiers changed from: package-private */
/* renamed from: okio.q */
public final class C69719q {

    /* renamed from: a */
    final byte[] f174167a;

    /* renamed from: b */
    int f174168b;

    /* renamed from: c */
    int f174169c;

    /* renamed from: d */
    boolean f174170d;

    /* renamed from: e */
    boolean f174171e;

    /* renamed from: f */
    C69719q f174172f;

    /* renamed from: g */
    C69719q f174173g;

    C69719q() {
        this.f174167a = new byte[8192];
        this.f174171e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C69719q mo244623a() {
        this.f174170d = true;
        return new C69719q(this.f174167a, this.f174168b, this.f174169c, true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C69719q mo244627b() {
        return new C69719q((byte[]) this.f174167a.clone(), this.f174168b, this.f174169c, false, true);
    }

    @Nullable
    /* renamed from: c */
    public final C69719q mo244628c() {
        C69719q qVar;
        C69719q qVar2 = this.f174172f;
        if (qVar2 != this) {
            qVar = qVar2;
        } else {
            qVar = null;
        }
        C69719q qVar3 = this.f174173g;
        qVar3.f174172f = qVar2;
        this.f174172f.f174173g = qVar3;
        this.f174172f = null;
        this.f174173g = null;
        return qVar;
    }

    /* renamed from: d */
    public final void mo244629d() {
        int i;
        C69719q qVar = this.f174173g;
        if (qVar == this) {
            throw new IllegalStateException();
        } else if (qVar.f174171e) {
            int i2 = this.f174169c - this.f174168b;
            int i3 = 8192 - qVar.f174169c;
            if (qVar.f174170d) {
                i = 0;
            } else {
                i = qVar.f174168b;
            }
            if (i2 <= i3 + i) {
                mo244626a(qVar, i2);
                mo244628c();
                C69720r.m267639a(this);
            }
        }
    }

    /* renamed from: a */
    public final C69719q mo244625a(C69719q qVar) {
        qVar.f174173g = this;
        qVar.f174172f = this.f174172f;
        this.f174172f.f174173g = qVar;
        this.f174172f = qVar;
        return qVar;
    }

    /* renamed from: a */
    public final C69719q mo244624a(int i) {
        C69719q qVar;
        if (i <= 0 || i > this.f174169c - this.f174168b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            qVar = mo244623a();
        } else {
            qVar = C69720r.m267638a();
            System.arraycopy(this.f174167a, this.f174168b, qVar.f174167a, 0, i);
        }
        qVar.f174169c = qVar.f174168b + i;
        this.f174168b += i;
        this.f174173g.mo244625a(qVar);
        return qVar;
    }

    /* renamed from: a */
    public final void mo244626a(C69719q qVar, int i) {
        if (qVar.f174171e) {
            int i2 = qVar.f174169c;
            if (i2 + i > 8192) {
                if (!qVar.f174170d) {
                    int i3 = qVar.f174168b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = qVar.f174167a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        qVar.f174169c -= qVar.f174168b;
                        qVar.f174168b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f174167a, this.f174168b, qVar.f174167a, qVar.f174169c, i);
            qVar.f174169c += i;
            this.f174168b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    C69719q(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f174167a = bArr;
        this.f174168b = i;
        this.f174169c = i2;
        this.f174170d = z;
        this.f174171e = z2;
    }
}
