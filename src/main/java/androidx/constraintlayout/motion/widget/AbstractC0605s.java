package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.p024a.AbstractC0528b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* renamed from: androidx.constraintlayout.motion.widget.s */
public abstract class AbstractC0605s {

    /* renamed from: k */
    private static float f2345k = 6.2831855f;

    /* renamed from: a */
    protected AbstractC0528b f2346a;

    /* renamed from: b */
    protected int f2347b;

    /* renamed from: c */
    protected int[] f2348c = new int[10];

    /* renamed from: d */
    protected float[][] f2349d = ((float[][]) Array.newInstance(float.class, 10, 3));

    /* renamed from: e */
    protected boolean f2350e;

    /* renamed from: f */
    long f2351f;

    /* renamed from: g */
    float f2352g = Float.NaN;

    /* renamed from: h */
    private int f2353h;

    /* renamed from: i */
    private String f2354i;

    /* renamed from: j */
    private float[] f2355j = new float[3];

    /* renamed from: a */
    public abstract boolean mo3365a(View view, float f, long j, C0552e eVar);

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    public static class C0606a extends AbstractC0605s {
        C0606a() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setAlpha(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$c */
    public static class C0608c extends AbstractC0605s {
        C0608c() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo3360a(f, j, view, eVar));
            }
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$d */
    public static class C0609d extends AbstractC0605s {
        C0609d() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            return this.f2350e;
        }

        /* renamed from: a */
        public boolean mo3368a(View view, C0552e eVar, float f, long j, double d, double d2) {
            view.setRotation(mo3360a(f, j, view, eVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$e */
    public static class C0610e extends AbstractC0605s {

        /* renamed from: h */
        boolean f2361h;

        C0610e() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo3360a(f, j, view, eVar));
            } else if (this.f2361h) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f2361h = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(mo3360a(f, j, view, eVar)));
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$f */
    public static class C0611f extends AbstractC0605s {
        C0611f() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setRotation(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$g */
    public static class C0612g extends AbstractC0605s {
        C0612g() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setRotationX(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$h */
    public static class C0613h extends AbstractC0605s {
        C0613h() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setRotationY(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$i */
    public static class C0614i extends AbstractC0605s {
        C0614i() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setScaleX(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$j */
    public static class C0615j extends AbstractC0605s {
        C0615j() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setScaleY(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$l */
    public static class C0617l extends AbstractC0605s {
        C0617l() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setTranslationX(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$m */
    public static class C0618m extends AbstractC0605s {
        C0618m() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            view.setTranslationY(mo3360a(f, j, view, eVar));
            return this.f2350e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$n */
    public static class C0619n extends AbstractC0605s {
        C0619n() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo3360a(f, j, view, eVar));
            }
            return this.f2350e;
        }
    }

    public String toString() {
        String str = this.f2354i;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f2353h; i++) {
            str = str + "[" + this.f2348c[i] + " , " + decimalFormat.format(this.f2349d[i]) + "] ";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3363a(long j) {
        this.f2351f = j;
    }

    /* renamed from: a */
    public void mo3364a(String str) {
        this.f2354i = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo3359a(float f) {
        float abs;
        switch (this.f2347b) {
            case 1:
                return Math.signum(f * f2345k);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f2345k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f2345k));
        }
        return 1.0f - abs;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    public static class C0607b extends AbstractC0605s {

        /* renamed from: h */
        String f2356h;

        /* renamed from: i */
        SparseArray<ConstraintAttribute> f2357i;

        /* renamed from: j */
        SparseArray<float[]> f2358j = new SparseArray<>();

        /* renamed from: k */
        float[] f2359k;

        /* renamed from: l */
        float[] f2360l;

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public void mo3361a(int i) {
            int size = this.f2357i.size();
            int b = this.f2357i.valueAt(0).mo3798b();
            double[] dArr = new double[size];
            int i2 = b + 2;
            this.f2359k = new float[i2];
            this.f2360l = new float[b];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f2357i.keyAt(i3);
                float[] valueAt = this.f2358j.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.f2357i.valueAt(i3).mo3797a(this.f2359k);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f2359k;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][b] = (double) valueAt[0];
                dArr2[i3][b + 1] = (double) valueAt[1];
            }
            this.f2346a = AbstractC0528b.m2417a(i, dArr, dArr2);
        }

        public C0607b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f2356h = str.split(",")[1];
            this.f2357i = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public boolean mo3365a(View view, float f, long j, C0552e eVar) {
            boolean z;
            this.f2346a.mo3100a((double) f, this.f2359k);
            float[] fArr = this.f2359k;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f2351f;
            if (Float.isNaN(this.f2352g)) {
                this.f2352g = eVar.mo3237a(view, this.f2356h, 0);
                if (Float.isNaN(this.f2352g)) {
                    this.f2352g = BitmapDescriptorFactory.HUE_RED;
                }
            }
            this.f2352g = (float) ((((double) this.f2352g) + ((((double) j2) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f2351f = j;
            float a = mo3359a(this.f2352g);
            this.f2350e = false;
            for (int i = 0; i < this.f2360l.length; i++) {
                boolean z2 = this.f2350e;
                if (((double) this.f2359k[i]) != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.f2350e = z2 | z;
                this.f2360l[i] = (this.f2359k[i] * a) + f3;
            }
            this.f2357i.valueAt(0).mo3795a(view, this.f2360l);
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                this.f2350e = true;
            }
            return this.f2350e;
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0605s
        /* renamed from: a */
        public void mo3362a(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: a */
        public void mo3367a(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.f2357i.append(i, constraintAttribute);
            this.f2358j.append(i, new float[]{f, f2});
            this.f2347b = Math.max(this.f2347b, i2);
        }
    }

    /* renamed from: a */
    public void mo3361a(int i) {
        int i2 = this.f2353h;
        if (i2 == 0) {
            Log.e("SplineSet", "Error no points added to " + this.f2354i);
            return;
        }
        C0616k.m2784a(this.f2348c, this.f2349d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f2348c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i4;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f2353h; i6++) {
            if (i6 > 0) {
                int[] iArr3 = this.f2348c;
                if (iArr3[i6] == iArr3[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f2348c[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[][] fArr = this.f2349d;
            dArr3[0] = (double) fArr[i6][0];
            dArr2[i5][1] = (double) fArr[i6][1];
            dArr2[i5][2] = (double) fArr[i6][2];
            i5++;
        }
        this.f2346a = AbstractC0528b.m2417a(i, dArr, dArr2);
    }

    /* renamed from: a */
    static AbstractC0605s m2762a(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new C0607b(str, sparseArray);
    }

    /* renamed from: a */
    static AbstractC0605s m2761a(String str, long j) {
        AbstractC0605s sVar;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                sVar = new C0612g();
                break;
            case 1:
                sVar = new C0613h();
                break;
            case 2:
                sVar = new C0617l();
                break;
            case 3:
                sVar = new C0618m();
                break;
            case 4:
                sVar = new C0619n();
                break;
            case 5:
                sVar = new C0610e();
                break;
            case 6:
                sVar = new C0614i();
                break;
            case 7:
                sVar = new C0615j();
                break;
            case '\b':
                sVar = new C0611f();
                break;
            case '\t':
                sVar = new C0608c();
                break;
            case '\n':
                sVar = new C0609d();
                break;
            case 11:
                sVar = new C0606a();
                break;
            default:
                return null;
        }
        sVar.mo3363a(j);
        return sVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.constraintlayout.motion.widget.s$k */
    public static class C0616k {
        /* renamed from: b */
        private static int m2785b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m2786c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m2786c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m2786c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }

        /* renamed from: a */
        static void m2784a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m2785b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public float mo3360a(float f, long j, View view, C0552e eVar) {
        boolean z;
        this.f2346a.mo3100a((double) f, this.f2355j);
        float[] fArr = this.f2355j;
        float f2 = fArr[1];
        int i = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i == 0) {
            this.f2350e = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f2352g)) {
            float a = eVar.mo3237a(view, this.f2354i, 0);
            this.f2352g = a;
            if (Float.isNaN(a)) {
                this.f2352g = BitmapDescriptorFactory.HUE_RED;
            }
        }
        float f3 = (float) ((((double) this.f2352g) + ((((double) (j - this.f2351f)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f2352g = f3;
        eVar.mo3238a(view, this.f2354i, 0, f3);
        this.f2351f = j;
        float f4 = this.f2355j[0];
        float a2 = (mo3359a(this.f2352g) * f4) + this.f2355j[2];
        if (f4 == BitmapDescriptorFactory.HUE_RED && i == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f2350e = z;
        return a2;
    }

    /* renamed from: a */
    public void mo3362a(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f2348c;
        int i3 = this.f2353h;
        iArr[i3] = i;
        float[][] fArr = this.f2349d;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f2347b = Math.max(this.f2347b, i2);
        this.f2353h++;
    }
}
