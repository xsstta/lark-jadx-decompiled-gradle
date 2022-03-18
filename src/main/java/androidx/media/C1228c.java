package androidx.media;

import java.util.Arrays;

/* renamed from: androidx.media.c */
class C1228c implements AbstractC1224a {

    /* renamed from: a */
    int f4447a;

    /* renamed from: b */
    int f4448b;

    /* renamed from: c */
    int f4449c;

    /* renamed from: d */
    int f4450d = -1;

    /* renamed from: b */
    public int mo6217b() {
        return this.f4448b;
    }

    /* renamed from: c */
    public int mo6218c() {
        return this.f4447a;
    }

    C1228c() {
    }

    /* renamed from: a */
    public int mo6216a() {
        int i = this.f4450d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m5527a(false, this.f4449c, this.f4447a);
    }

    /* renamed from: d */
    public int mo6219d() {
        int i = this.f4449c;
        int a = mo6216a();
        if (a == 6) {
            i |= 4;
        } else if (a == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4448b), Integer.valueOf(this.f4449c), Integer.valueOf(this.f4447a), Integer.valueOf(this.f4450d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4450d != -1) {
            sb.append(" stream=");
            sb.append(this.f4450d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m5528a(this.f4447a));
        sb.append(" content=");
        sb.append(this.f4448b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4449c).toUpperCase());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1228c)) {
            return false;
        }
        C1228c cVar = (C1228c) obj;
        if (this.f4448b == cVar.mo6217b() && this.f4449c == cVar.mo6219d() && this.f4447a == cVar.mo6218c() && this.f4450d == cVar.f4450d) {
            return true;
        }
        return false;
    }
}
