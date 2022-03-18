package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.p024a.C0530c;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* access modifiers changed from: package-private */
/* renamed from: androidx.constraintlayout.motion.widget.p */
public class C0583p implements Comparable<C0583p> {

    /* renamed from: a */
    static String[] f2277a = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b */
    C0530c f2278b;

    /* renamed from: c */
    int f2279c;

    /* renamed from: d */
    float f2280d;

    /* renamed from: e */
    float f2281e;

    /* renamed from: f */
    float f2282f;

    /* renamed from: g */
    float f2283g;

    /* renamed from: h */
    float f2284h;

    /* renamed from: i */
    float f2285i;

    /* renamed from: j */
    float f2286j;

    /* renamed from: k */
    float f2287k;

    /* renamed from: l */
    int f2288l;

    /* renamed from: m */
    LinkedHashMap<String, ConstraintAttribute> f2289m;

    /* renamed from: n */
    int f2290n;

    /* renamed from: o */
    double[] f2291o;

    /* renamed from: p */
    double[] f2292p;

    /* renamed from: a */
    private static final float m2658a(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    /* renamed from: b */
    private static final float m2660b(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3294a(C0573i iVar, C0583p pVar, C0583p pVar2) {
        float f = ((float) iVar.f2096b) / 100.0f;
        this.f2280d = f;
        this.f2279c = iVar.f2169i;
        float f2 = Float.isNaN(iVar.f2170j) ? f : iVar.f2170j;
        float f3 = Float.isNaN(iVar.f2171k) ? f : iVar.f2171k;
        float f4 = pVar2.f2284h;
        float f5 = pVar.f2284h;
        float f6 = pVar2.f2285i;
        float f7 = pVar.f2285i;
        this.f2281e = this.f2280d;
        float f8 = pVar.f2282f;
        float f9 = pVar.f2283g;
        float f10 = (pVar2.f2282f + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (pVar2.f2283g + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f2282f = (float) ((int) ((f8 + (f10 * f)) - f13));
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.f2283g = (float) ((int) ((f9 + (f11 * f)) - f15));
        this.f2284h = (float) ((int) (f5 + f12));
        this.f2285i = (float) ((int) (f7 + f14));
        float f16 = Float.isNaN(iVar.f2172l) ? f : iVar.f2172l;
        boolean isNaN = Float.isNaN(iVar.f2175o);
        float f17 = BitmapDescriptorFactory.HUE_RED;
        float f18 = isNaN ? BitmapDescriptorFactory.HUE_RED : iVar.f2175o;
        if (!Float.isNaN(iVar.f2173m)) {
            f = iVar.f2173m;
        }
        if (!Float.isNaN(iVar.f2174n)) {
            f17 = iVar.f2174n;
        }
        this.f2290n = 2;
        this.f2282f = (float) ((int) (((pVar.f2282f + (f16 * f10)) + (f17 * f11)) - f13));
        this.f2283g = (float) ((int) (((pVar.f2283g + (f10 * f18)) + (f11 * f)) - f15));
        this.f2278b = C0530c.m2431a(iVar.f2167g);
        this.f2288l = iVar.f2168h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3295a(C0583p pVar, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | m2659a(this.f2281e, pVar.f2281e);
        zArr[1] = zArr[1] | m2659a(this.f2282f, pVar.f2282f) | z;
        zArr[2] = z | m2659a(this.f2283g, pVar.f2283g) | zArr[2];
        zArr[3] = zArr[3] | m2659a(this.f2284h, pVar.f2284h);
        zArr[4] = m2659a(this.f2285i, pVar.f2285i) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3298a(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f2282f;
        float f2 = this.f2283g;
        float f3 = this.f2284h;
        float f4 = this.f2285i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
        fArr[i + 1] = f2 + (f4 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3297a(double[] dArr, int[] iArr) {
        float[] fArr = {this.f2281e, this.f2282f, this.f2283g, this.f2284h, this.f2285i, this.f2286j};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo3296a(C0689b.C0690a aVar) {
        this.f2278b = C0530c.m2431a(aVar.f2875c.f2934c);
        this.f2288l = aVar.f2875c.f2935d;
        this.f2286j = aVar.f2875c.f2938g;
        this.f2279c = aVar.f2875c.f2936e;
        this.f2287k = aVar.f2874b.f2943e;
        for (String str : aVar.f2878f.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f2878f.get(str);
            if (constraintAttribute.mo3794a() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.f2289m.put(str, constraintAttribute);
            }
        }
    }

    public C0583p() {
        this.f2286j = Float.NaN;
        this.f2287k = Float.NaN;
        this.f2288l = AbstractC0549c.f2095a;
        this.f2289m = new LinkedHashMap<>();
        this.f2290n = 0;
        this.f2291o = new double[18];
        this.f2292p = new double[18];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3299a(String str) {
        return this.f2289m.containsKey(str);
    }

    /* renamed from: a */
    public int compareTo(C0583p pVar) {
        return Float.compare(this.f2281e, pVar.f2281e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3300b(String str) {
        return this.f2289m.get(str).mo3798b();
    }

    /* renamed from: a */
    private boolean m2659a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3289a(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.f2289m.get(str);
        if (constraintAttribute.mo3798b() == 1) {
            dArr[i] = (double) constraintAttribute.mo3799c();
            return 1;
        }
        int b = constraintAttribute.mo3798b();
        float[] fArr = new float[b];
        constraintAttribute.mo3797a(fArr);
        int i2 = 0;
        while (i2 < b) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3301b(C0573i iVar, C0583p pVar, C0583p pVar2) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) iVar.f2096b) / 100.0f;
        this.f2280d = f4;
        this.f2279c = iVar.f2169i;
        if (Float.isNaN(iVar.f2170j)) {
            f = f4;
        } else {
            f = iVar.f2170j;
        }
        if (Float.isNaN(iVar.f2171k)) {
            f2 = f4;
        } else {
            f2 = iVar.f2171k;
        }
        float f5 = pVar2.f2284h - pVar.f2284h;
        float f6 = pVar2.f2285i - pVar.f2285i;
        this.f2281e = this.f2280d;
        if (!Float.isNaN(iVar.f2172l)) {
            f4 = iVar.f2172l;
        }
        float f7 = pVar.f2282f;
        float f8 = pVar.f2284h;
        float f9 = pVar.f2283g;
        float f10 = pVar.f2285i;
        float f11 = pVar2.f2282f + (pVar2.f2284h / 2.0f);
        float f12 = f11 - ((f8 / 2.0f) + f7);
        float f13 = (pVar2.f2283g + (pVar2.f2285i / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = f12 * f4;
        float f15 = f5 * f;
        float f16 = f15 / 2.0f;
        this.f2282f = (float) ((int) ((f7 + f14) - f16));
        float f17 = f4 * f13;
        float f18 = f6 * f2;
        float f19 = f18 / 2.0f;
        this.f2283g = (float) ((int) ((f9 + f17) - f19));
        this.f2284h = (float) ((int) (f8 + f15));
        this.f2285i = (float) ((int) (f10 + f18));
        if (Float.isNaN(iVar.f2173m)) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f3 = iVar.f2173m;
        }
        this.f2290n = 1;
        float f20 = (float) ((int) ((pVar.f2282f + f14) - f16));
        this.f2282f = f20;
        float f21 = (float) ((int) ((pVar.f2283g + f17) - f19));
        this.f2283g = f21;
        this.f2282f = f20 + ((-f13) * f3);
        this.f2283g = f21 + (f12 * f3);
        this.f2278b = C0530c.m2431a(iVar.f2167g);
        this.f2288l = iVar.f2168h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3302b(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f2282f;
        float f2 = this.f2283g;
        float f3 = this.f2284h;
        float f4 = this.f2285i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f8 = f + BitmapDescriptorFactory.HUE_RED;
        float f9 = f2 + BitmapDescriptorFactory.HUE_RED;
        float f10 = f6 + BitmapDescriptorFactory.HUE_RED;
        float f11 = f2 + BitmapDescriptorFactory.HUE_RED;
        float f12 = f6 + BitmapDescriptorFactory.HUE_RED;
        float f13 = f7 + BitmapDescriptorFactory.HUE_RED;
        float f14 = f + BitmapDescriptorFactory.HUE_RED;
        float f15 = f7 + BitmapDescriptorFactory.HUE_RED;
        int i4 = i + 1;
        fArr[i] = f8;
        int i5 = i4 + 1;
        fArr[i4] = f9;
        int i6 = i5 + 1;
        fArr[i5] = f10;
        int i7 = i6 + 1;
        fArr[i6] = f11;
        int i8 = i7 + 1;
        fArr[i7] = f12;
        int i9 = i8 + 1;
        fArr[i8] = f13;
        fArr[i9] = f14;
        fArr[i9 + 1] = f15;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3290a(float f, float f2, float f3, float f4) {
        this.f2282f = f;
        this.f2283g = f2;
        this.f2284h = f3;
        this.f2285i = f4;
    }

    public C0583p(int i, int i2, C0573i iVar, C0583p pVar, C0583p pVar2) {
        this.f2286j = Float.NaN;
        this.f2287k = Float.NaN;
        this.f2288l = AbstractC0549c.f2095a;
        this.f2289m = new LinkedHashMap<>();
        this.f2290n = 0;
        this.f2291o = new double[18];
        this.f2292p = new double[18];
        int i3 = iVar.f2176p;
        if (i3 == 1) {
            mo3301b(iVar, pVar, pVar2);
        } else if (i3 != 2) {
            mo3294a(iVar, pVar, pVar2);
        } else {
            mo3292a(i, i2, iVar, pVar, pVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3292a(int i, int i2, C0573i iVar, C0583p pVar, C0583p pVar2) {
        float f;
        float f2;
        float f3 = ((float) iVar.f2096b) / 100.0f;
        this.f2280d = f3;
        this.f2279c = iVar.f2169i;
        if (Float.isNaN(iVar.f2170j)) {
            f = f3;
        } else {
            f = iVar.f2170j;
        }
        if (Float.isNaN(iVar.f2171k)) {
            f2 = f3;
        } else {
            f2 = iVar.f2171k;
        }
        float f4 = pVar2.f2284h;
        float f5 = pVar.f2284h;
        float f6 = pVar2.f2285i;
        float f7 = pVar.f2285i;
        this.f2281e = this.f2280d;
        float f8 = pVar.f2282f;
        float f9 = pVar.f2283g;
        float f10 = pVar2.f2282f + (f4 / 2.0f);
        float f11 = pVar2.f2283g + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f2282f = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f2;
        this.f2283g = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f)));
        this.f2284h = (float) ((int) (f5 + f12));
        this.f2285i = (float) ((int) (f7 + f13));
        this.f2290n = 3;
        if (!Float.isNaN(iVar.f2172l)) {
            this.f2282f = (float) ((int) (iVar.f2172l * ((float) ((int) (((float) i) - this.f2284h)))));
        }
        if (!Float.isNaN(iVar.f2173m)) {
            this.f2283g = (float) ((int) (iVar.f2173m * ((float) ((int) (((float) i2) - this.f2285i)))));
        }
        this.f2278b = C0530c.m2431a(iVar.f2167g);
        this.f2288l = iVar.f2168h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3293a(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        boolean z;
        float f;
        float f2 = this.f2282f;
        float f3 = this.f2283g;
        float f4 = this.f2284h;
        float f5 = this.f2285i;
        if (iArr.length != 0 && this.f2291o.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f2291o = new double[i];
            this.f2292p = new double[i];
        }
        Arrays.fill(this.f2291o, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f2291o[iArr[i2]] = dArr[i2];
            this.f2292p[iArr[i2]] = dArr2[i2];
        }
        int i3 = 0;
        float f6 = Float.NaN;
        float f7 = BitmapDescriptorFactory.HUE_RED;
        float f8 = BitmapDescriptorFactory.HUE_RED;
        float f9 = BitmapDescriptorFactory.HUE_RED;
        float f10 = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            double[] dArr4 = this.f2291o;
            if (i3 >= dArr4.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr4[i3]) || !(dArr3 == null || dArr3[i3] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i3];
                }
                if (!Double.isNaN(this.f2291o[i3])) {
                    d = this.f2291o[i3] + d;
                }
                f = f2;
                float f11 = (float) d;
                float f12 = (float) this.f2292p[i3];
                if (i3 == 1) {
                    f7 = f12;
                    f2 = f11;
                } else if (i3 == 2) {
                    f3 = f11;
                    f9 = f12;
                } else if (i3 == 3) {
                    f4 = f11;
                    f8 = f12;
                } else if (i3 == 4) {
                    f5 = f11;
                    f10 = f12;
                } else if (i3 == 5) {
                    f2 = f;
                    f6 = f11;
                }
                i3++;
            } else {
                f = f2;
            }
            f2 = f;
            i3++;
        }
        if (!Float.isNaN(f6)) {
            float f13 = Float.NaN;
            if (Float.isNaN(Float.NaN)) {
                f13 = BitmapDescriptorFactory.HUE_RED;
            }
            view.setRotation((float) (((double) f13) + ((double) f6) + Math.toDegrees(Math.atan2((double) (f9 + (f10 / 2.0f)), (double) (f7 + (f8 / 2.0f))))));
        } else if (!Float.isNaN(Float.NaN)) {
            view.setRotation(Float.NaN);
        }
        float f14 = f2 + 0.5f;
        int i4 = (int) f14;
        float f15 = f3 + 0.5f;
        int i5 = (int) f15;
        int i6 = (int) (f14 + f4);
        int i7 = (int) (f15 + f5);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view.layout(i4, i5, i6, i7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3291a(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((BitmapDescriptorFactory.HUE_RED * f4) / 2.0f);
        float f9 = f5 - ((BitmapDescriptorFactory.HUE_RED * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + BitmapDescriptorFactory.HUE_RED;
    }
}
