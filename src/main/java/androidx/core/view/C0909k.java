package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.k */
public class C0909k {

    /* renamed from: a */
    private ViewParent f3458a;

    /* renamed from: b */
    private ViewParent f3459b;

    /* renamed from: c */
    private final View f3460c;

    /* renamed from: d */
    private boolean f3461d;

    /* renamed from: e */
    private int[] f3462e;

    /* renamed from: a */
    public boolean mo4701a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo4702a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo4702a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!mo4694a() || (d = m4376d(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f3460c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m4377d();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0923w.m4418a(d, this.f3460c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f3460c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo4694a() {
        return this.f3461d;
    }

    /* renamed from: b */
    public boolean mo4703b() {
        return mo4697a(0);
    }

    /* renamed from: c */
    public void mo4705c() {
        mo4706c(0);
    }

    /* renamed from: d */
    private int[] m4377d() {
        if (this.f3462e == null) {
            this.f3462e = new int[2];
        }
        return this.f3462e;
    }

    public C0909k(View view) {
        this.f3460c = view;
    }

    /* renamed from: d */
    private ViewParent m4376d(int i) {
        if (i == 0) {
            return this.f3458a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3459b;
    }

    /* renamed from: b */
    public boolean mo4704b(int i) {
        return mo4698a(i, 0);
    }

    /* renamed from: c */
    public void mo4706c(int i) {
        ViewParent d = m4376d(i);
        if (d != null) {
            C0923w.m4416a(d, this.f3460c, i);
            m4374a(i, (ViewParent) null);
        }
    }

    /* renamed from: a */
    public void mo4693a(boolean z) {
        if (this.f3461d) {
            ViewCompat.m4011E(this.f3460c);
        }
        this.f3461d = z;
    }

    /* renamed from: a */
    public boolean mo4697a(int i) {
        if (m4376d(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m4374a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f3458a = viewParent;
        } else if (i == 1) {
            this.f3459b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo4695a(float f, float f2) {
        ViewParent d;
        if (!mo4694a() || (d = m4376d(0)) == null) {
            return false;
        }
        return C0923w.m4419a(d, this.f3460c, f, f2);
    }

    /* renamed from: a */
    public boolean mo4698a(int i, int i2) {
        if (mo4697a(i2)) {
            return true;
        }
        if (!mo4694a()) {
            return false;
        }
        View view = this.f3460c;
        for (ViewParent parent = this.f3460c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0923w.m4421a(parent, view, this.f3460c, i, i2)) {
                m4374a(i2, parent);
                C0923w.m4422b(parent, view, this.f3460c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo4696a(float f, float f2, boolean z) {
        ViewParent d;
        if (!mo4694a() || (d = m4376d(0)) == null) {
            return false;
        }
        return C0923w.m4420a(d, this.f3460c, f, f2, z);
    }

    /* renamed from: a */
    public boolean mo4699a(int i, int i2, int i3, int i4, int[] iArr) {
        return m4375b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public boolean mo4700a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m4375b(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: a */
    public void mo4692a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m4375b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: b */
    private boolean m4375b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr3;
        if (!mo4694a() || (d = m4376d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3460c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] d2 = m4377d();
            d2[0] = 0;
            d2[1] = 0;
            iArr3 = d2;
        } else {
            iArr3 = iArr2;
        }
        C0923w.m4417a(d, this.f3460c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f3460c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }
}
