package com.lynx.tasm.behavior.ui.utils;

import android.os.Build;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.utils.C26945b;

public class BorderRadius {

    /* renamed from: a */
    public static int f66617a = 1;

    /* renamed from: b */
    public static int f66618b = 2;

    /* renamed from: c */
    private float f66619c;

    /* renamed from: d */
    private float f66620d;

    /* renamed from: e */
    private int f66621e;

    /* renamed from: f */
    private C26826a[] f66622f;

    /* renamed from: g */
    private float[] f66623g;

    public enum Location {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    public enum Unit {
        NUMBER,
        PERCENTAGE
    }

    /* renamed from: a */
    public void mo95504a() {
        this.f66623g = null;
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.BorderRadius$a */
    public static class C26826a {

        /* renamed from: a */
        public float f66624a;

        /* renamed from: b */
        public float f66625b;

        /* renamed from: c */
        public Unit f66626c;

        /* renamed from: d */
        public Unit f66627d;

        public C26826a() {
            mo95510a();
        }

        /* renamed from: a */
        public void mo95510a() {
            this.f66625b = 1.0E21f;
            this.f66624a = 1.0E21f;
            Unit unit = Unit.NUMBER;
            this.f66627d = unit;
            this.f66626c = unit;
        }

        /* renamed from: a */
        public boolean mo95511a(C26826a aVar) {
            if (aVar == null || !C26945b.m97908a(this.f66624a, aVar.f66624a) || !C26945b.m97908a(this.f66625b, aVar.f66625b) || this.f66626c != aVar.f66626c || this.f66627d != aVar.f66627d) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    public float[] mo95508b() {
        float[] fArr = this.f66623g;
        if (fArr != null) {
            return fArr;
        }
        this.f66623g = m97490a(false, BitmapDescriptorFactory.HUE_RED);
        if (Build.VERSION.SDK_INT >= 17) {
            m97491d();
        }
        m97492e();
        return this.f66623g;
    }

    /* renamed from: c */
    public boolean mo95509c() {
        C26826a[] aVarArr = this.f66622f;
        if (aVarArr != null) {
            for (C26826a aVar : aVarArr) {
                if (aVar != null) {
                    if (!C26705f.m96794a(aVar.f66624a) && aVar.f66624a > BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    if (!C26705f.m96794a(aVar.f66625b) && aVar.f66625b > BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m97491d() {
        int i;
        int i2;
        boolean z = true;
        float[] a = m97490a(true, 1.0E21f);
        int[] iArr = {2, 3, 0, 1, 6, 7, 4, 5};
        float[] fArr = this.f66623g;
        int i3 = this.f66621e;
        int i4 = 0;
        if ((f66617a & i3) == 0) {
            z = false;
        }
        if ((i3 & f66618b) != 0) {
            for (int i5 = 0; i5 < 8; i5++) {
                if (C26705f.m96794a(a[i5])) {
                    a[i5] = fArr[i5];
                }
            }
            while (i4 < 8) {
                if (z) {
                    i2 = iArr[i4];
                } else {
                    i2 = i4;
                }
                fArr[i4] = a[i2];
                i4++;
            }
            return;
        }
        while (i4 < 8) {
            if (z) {
                i = iArr[i4];
            } else {
                i = i4;
            }
            float f = a[i];
            if (!C26705f.m96794a(f)) {
                fArr[i4] = f;
            }
            i4++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r2 < 1.0f) goto L_0x0032;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m97492e() {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BorderRadius.m97492e():void");
    }

    /* renamed from: a */
    public static Unit m97489a(String str) {
        if (str == null || !str.endsWith("%")) {
            return Unit.NUMBER;
        }
        return Unit.PERCENTAGE;
    }

    /* renamed from: a */
    public boolean mo95506a(int i) {
        if (this.f66621e != i) {
            this.f66621e = i;
            this.f66623g = null;
            return true;
        } else if (this.f66623g == null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo95505a(float f, float f2) {
        if (f < BitmapDescriptorFactory.HUE_RED || C26705f.m96794a(f)) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (f2 < BitmapDescriptorFactory.HUE_RED || C26705f.m96794a(f2)) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (!C26945b.m97908a(f, this.f66619c) || !C26945b.m97908a(f2, this.f66620d)) {
            this.f66619c = f;
            this.f66620d = f2;
            this.f66623g = null;
            return true;
        } else if (this.f66623g == null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo95507a(int i, C26826a aVar) {
        if (i >= 0 && i < 8) {
            if (this.f66622f == null) {
                this.f66622f = new C26826a[8];
            }
            if (aVar == null) {
                aVar = new C26826a();
            }
            if (!aVar.mo95511a(this.f66622f[i])) {
                this.f66622f[i] = aVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private float[] m97490a(boolean z, float f) {
        float[] fArr = new float[8];
        int i = 0;
        if (this.f66622f == null) {
            while (i < 8) {
                fArr[i] = f;
                i++;
            }
            return fArr;
        }
        Location[] locationArr = z ? new Location[]{Location.TOP_START, Location.TOP_END, Location.BOTTOM_END, Location.BOTTOM_START} : new Location[]{Location.TOP_LEFT, Location.TOP_RIGHT, Location.BOTTOM_RIGHT, Location.BOTTOM_LEFT};
        while (i < locationArr.length) {
            C26826a aVar = this.f66622f[locationArr[i].ordinal()];
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (aVar == null) {
                fArr[i3] = f;
                fArr[i2] = f;
            } else {
                if (C26705f.m96794a(aVar.f66624a)) {
                    fArr[i2] = f;
                } else if (aVar.f66626c == Unit.PERCENTAGE) {
                    fArr[i2] = aVar.f66624a * this.f66619c;
                } else {
                    fArr[i2] = aVar.f66624a;
                }
                if (C26705f.m96794a(aVar.f66625b)) {
                    fArr[i3] = f;
                } else if (aVar.f66627d == Unit.PERCENTAGE) {
                    fArr[i3] = aVar.f66625b * this.f66620d;
                } else {
                    fArr[i3] = aVar.f66625b;
                }
            }
            i++;
        }
        return fArr;
    }
}
