package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.p024a.AbstractC0528b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huawei.hms.android.HwBuildEx;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.motion.widget.r */
public abstract class AbstractC0588r {

    /* renamed from: a */
    protected AbstractC0528b f2336a;

    /* renamed from: b */
    protected int[] f2337b = new int[10];

    /* renamed from: c */
    protected float[] f2338c = new float[10];

    /* renamed from: d */
    private int f2339d;

    /* renamed from: e */
    private String f2340e;

    /* renamed from: a */
    public abstract void mo3353a(View view, float f);

    /* renamed from: androidx.constraintlayout.motion.widget.r$a */
    static class C0589a extends AbstractC0588r {
        C0589a() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setAlpha(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$c */
    static class C0591c extends AbstractC0588r {
        C0591c() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo3350a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$d */
    static class C0592d extends AbstractC0588r {
        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
        }

        C0592d() {
        }

        /* renamed from: a */
        public void mo3358a(View view, float f, double d, double d2) {
            view.setRotation(mo3350a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$e */
    static class C0593e extends AbstractC0588r {
        C0593e() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setPivotX(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$f */
    static class C0594f extends AbstractC0588r {
        C0594f() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setPivotY(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$g */
    static class C0595g extends AbstractC0588r {

        /* renamed from: d */
        boolean f2344d;

        C0595g() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo3350a(f));
            } else if (!this.f2344d) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f2344d = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(mo3350a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("SplineSet", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$h */
    static class C0596h extends AbstractC0588r {
        C0596h() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setRotation(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$i */
    static class C0597i extends AbstractC0588r {
        C0597i() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setRotationX(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$j */
    static class C0598j extends AbstractC0588r {
        C0598j() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setRotationY(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$k */
    static class C0599k extends AbstractC0588r {
        C0599k() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setScaleX(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$l */
    static class C0600l extends AbstractC0588r {
        C0600l() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setScaleY(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$n */
    static class C0602n extends AbstractC0588r {
        C0602n() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setTranslationX(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$o */
    static class C0603o extends AbstractC0588r {
        C0603o() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            view.setTranslationY(mo3350a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$p */
    static class C0604p extends AbstractC0588r {
        C0604p() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo3350a(f));
            }
        }
    }

    public String toString() {
        String str = this.f2340e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f2339d; i++) {
            str = str + "[" + this.f2337b[i] + " , " + decimalFormat.format((double) this.f2338c[i]) + "] ";
        }
        return str;
    }

    /* renamed from: a */
    public float mo3350a(float f) {
        return (float) this.f2336a.mo3098a((double) f, 0);
    }

    /* renamed from: b */
    public float mo3355b(float f) {
        return (float) this.f2336a.mo3102b((double) f, 0);
    }

    /* renamed from: a */
    public void mo3354a(String str) {
        this.f2340e = str;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$b */
    static class C0590b extends AbstractC0588r {

        /* renamed from: d */
        String f2341d;

        /* renamed from: e */
        SparseArray<ConstraintAttribute> f2342e;

        /* renamed from: f */
        float[] f2343f;

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3351a(int i) {
            int size = this.f2342e.size();
            int b = this.f2342e.valueAt(0).mo3798b();
            double[] dArr = new double[size];
            this.f2343f = new float[b];
            int[] iArr = new int[2];
            iArr[1] = b;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f2342e.keyAt(i2)) * 0.01d;
                this.f2342e.valueAt(i2).mo3797a(this.f2343f);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f2343f;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f2336a = AbstractC0528b.m2417a(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3352a(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: a */
        public void mo3357a(int i, ConstraintAttribute constraintAttribute) {
            this.f2342e.append(i, constraintAttribute);
        }

        public C0590b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f2341d = str.split(",")[1];
            this.f2342e = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0588r
        /* renamed from: a */
        public void mo3353a(View view, float f) {
            this.f2336a.mo3100a((double) f, this.f2343f);
            this.f2342e.valueAt(0).mo3795a(view, this.f2343f);
        }
    }

    /* renamed from: a */
    public void mo3351a(int i) {
        int i2 = this.f2339d;
        if (i2 != 0) {
            C0601m.m2755a(this.f2337b, this.f2338c, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f2339d; i4++) {
                int[] iArr = this.f2337b;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i3;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2339d; i6++) {
                if (i6 > 0) {
                    int[] iArr3 = this.f2337b;
                    if (iArr3[i6] == iArr3[i6 - 1]) {
                    }
                }
                dArr[i5] = ((double) this.f2337b[i6]) * 0.01d;
                dArr2[i5][0] = (double) this.f2338c[i6];
                i5++;
            }
            this.f2336a = AbstractC0528b.m2417a(i, dArr, dArr2);
        }
    }

    /* renamed from: b */
    static AbstractC0588r m2732b(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0597i();
            case 1:
                return new C0598j();
            case 2:
                return new C0602n();
            case 3:
                return new C0603o();
            case 4:
                return new C0604p();
            case 5:
                return new C0595g();
            case 6:
                return new C0599k();
            case 7:
                return new C0600l();
            case '\b':
                return new C0589a();
            case '\t':
                return new C0593e();
            case '\n':
                return new C0594f();
            case 11:
                return new C0596h();
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return new C0591c();
            case '\r':
                return new C0592d();
            case 14:
                return new C0589a();
            case 15:
                return new C0589a();
            default:
                return null;
        }
    }

    /* renamed from: a */
    static AbstractC0588r m2731a(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new C0590b(str, sparseArray);
    }

    /* renamed from: a */
    public void mo3352a(int i, float f) {
        int[] iArr = this.f2337b;
        if (iArr.length < this.f2339d + 1) {
            this.f2337b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f2338c;
            this.f2338c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f2337b;
        int i2 = this.f2339d;
        iArr2[i2] = i;
        this.f2338c[i2] = f;
        this.f2339d = i2 + 1;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.r$m */
    private static class C0601m {
        /* renamed from: b */
        private static int m2756b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m2757c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m2757c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m2757c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }

        /* renamed from: a */
        static void m2755a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int b = m2756b(iArr, fArr, i5, i6);
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
}
