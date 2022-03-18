package androidx.appcompat.widget;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.x */
public class C0480x {

    /* renamed from: a */
    private int f1733a;

    /* renamed from: b */
    private int f1734b;

    /* renamed from: c */
    private int f1735c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1736d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1737e;

    /* renamed from: f */
    private int f1738f;

    /* renamed from: g */
    private boolean f1739g;

    /* renamed from: h */
    private boolean f1740h;

    /* renamed from: a */
    public int mo2736a() {
        return this.f1733a;
    }

    /* renamed from: b */
    public int mo2739b() {
        return this.f1734b;
    }

    C0480x() {
    }

    /* renamed from: c */
    public int mo2741c() {
        if (this.f1739g) {
            return this.f1734b;
        }
        return this.f1733a;
    }

    /* renamed from: d */
    public int mo2742d() {
        if (this.f1739g) {
            return this.f1733a;
        }
        return this.f1734b;
    }

    /* renamed from: a */
    public void mo2738a(boolean z) {
        if (z != this.f1739g) {
            this.f1739g = z;
            if (!this.f1740h) {
                this.f1733a = this.f1737e;
                this.f1734b = this.f1738f;
            } else if (z) {
                int i = this.f1736d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1737e;
                }
                this.f1733a = i;
                int i2 = this.f1735c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1738f;
                }
                this.f1734b = i2;
            } else {
                int i3 = this.f1735c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1737e;
                }
                this.f1733a = i3;
                int i4 = this.f1736d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1738f;
                }
                this.f1734b = i4;
            }
        }
    }

    /* renamed from: a */
    public void mo2737a(int i, int i2) {
        this.f1735c = i;
        this.f1736d = i2;
        this.f1740h = true;
        if (this.f1739g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1733a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1734b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1733a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1734b = i2;
        }
    }

    /* renamed from: b */
    public void mo2740b(int i, int i2) {
        this.f1740h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1737e = i;
            this.f1733a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1738f = i2;
            this.f1734b = i2;
        }
    }
}
