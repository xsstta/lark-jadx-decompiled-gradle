package androidx.core.graphics;

import android.graphics.Insets;

/* renamed from: androidx.core.graphics.b */
public final class C0769b {

    /* renamed from: a */
    public static final C0769b f3130a = new C0769b(0, 0, 0, 0);

    /* renamed from: b */
    public final int f3131b;

    /* renamed from: c */
    public final int f3132c;

    /* renamed from: d */
    public final int f3133d;

    /* renamed from: e */
    public final int f3134e;

    public int hashCode() {
        return (((((this.f3131b * 31) + this.f3132c) * 31) + this.f3133d) * 31) + this.f3134e;
    }

    /* renamed from: a */
    public Insets mo4290a() {
        return Insets.of(this.f3131b, this.f3132c, this.f3133d, this.f3134e);
    }

    public String toString() {
        return "Insets{left=" + this.f3131b + ", top=" + this.f3132c + ", right=" + this.f3133d + ", bottom=" + this.f3134e + '}';
    }

    /* renamed from: a */
    public static C0769b m3719a(Insets insets) {
        return m3718a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0769b bVar = (C0769b) obj;
        if (this.f3134e == bVar.f3134e && this.f3131b == bVar.f3131b && this.f3133d == bVar.f3133d && this.f3132c == bVar.f3132c) {
            return true;
        }
        return false;
    }

    private C0769b(int i, int i2, int i3, int i4) {
        this.f3131b = i;
        this.f3132c = i2;
        this.f3133d = i3;
        this.f3134e = i4;
    }

    /* renamed from: a */
    public static C0769b m3718a(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f3130a;
        }
        return new C0769b(i, i2, i3, i4);
    }
}
