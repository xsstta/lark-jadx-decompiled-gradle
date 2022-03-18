package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.p024a.AbstractC0528b;
import androidx.constraintlayout.motion.p024a.C0534f;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huawei.hms.android.HwBuildEx;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.g */
public abstract class AbstractC0555g {

    /* renamed from: a */
    protected ConstraintAttribute f2138a;

    /* renamed from: b */
    public int f2139b;

    /* renamed from: c */
    ArrayList<C0571o> f2140c = new ArrayList<>();

    /* renamed from: d */
    private AbstractC0528b f2141d;

    /* renamed from: e */
    private C0559c f2142e;

    /* renamed from: f */
    private String f2143f;

    /* renamed from: g */
    private int f2144g;

    /* renamed from: a */
    public abstract void mo3244a(View view, float f);

    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    static class C0557a extends AbstractC0555g {
        C0557a() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setAlpha(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$d */
    static class C0560d extends AbstractC0555g {
        C0560d() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(mo3241a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$e */
    static class C0561e extends AbstractC0555g {
        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
        }

        C0561e() {
        }

        /* renamed from: a */
        public void mo3256a(View view, float f, double d, double d2) {
            view.setRotation(mo3241a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$f */
    static class C0562f extends AbstractC0555g {

        /* renamed from: d */
        boolean f2160d;

        C0562f() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo3241a(f));
            } else if (!this.f2160d) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f2160d = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(mo3241a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("KeyCycleOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$g */
    static class C0563g extends AbstractC0555g {
        C0563g() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setRotation(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$h */
    static class C0564h extends AbstractC0555g {
        C0564h() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setRotationX(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$i */
    static class C0565i extends AbstractC0555g {
        C0565i() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setRotationY(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$j */
    static class C0566j extends AbstractC0555g {
        C0566j() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setScaleX(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$k */
    static class C0567k extends AbstractC0555g {
        C0567k() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setScaleY(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$l */
    static class C0568l extends AbstractC0555g {
        C0568l() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setTranslationX(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$m */
    static class C0569m extends AbstractC0555g {
        C0569m() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            view.setTranslationY(mo3241a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$n */
    static class C0570n extends AbstractC0555g {
        C0570n() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo3241a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$b */
    static class C0558b extends AbstractC0555g {

        /* renamed from: d */
        float[] f2146d = new float[1];

        C0558b() {
        }

        @Override // androidx.constraintlayout.motion.widget.AbstractC0555g
        /* renamed from: a */
        public void mo3244a(View view, float f) {
            this.f2146d[0] = mo3241a(f);
            this.f2138a.mo3795a(view, this.f2146d);
        }
    }

    /* renamed from: a */
    public boolean mo3246a() {
        if (this.f2139b == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.f2143f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C0571o> it = this.f2140c.iterator();
        while (it.hasNext()) {
            C0571o next = it.next();
            str = str + "[" + next.f2161a + " , " + decimalFormat.format((double) next.f2162b) + "] ";
        }
        return str;
    }

    /* renamed from: a */
    public float mo3241a(float f) {
        return (float) this.f2142e.mo3252a(f);
    }

    /* renamed from: b */
    public float mo3247b(float f) {
        return (float) this.f2142e.mo3254b(f);
    }

    /* renamed from: a */
    public void mo3245a(String str) {
        this.f2143f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.g$c */
    public static class C0559c {

        /* renamed from: a */
        C0534f f2147a = new C0534f();

        /* renamed from: b */
        float[] f2148b;

        /* renamed from: c */
        double[] f2149c;

        /* renamed from: d */
        float[] f2150d;

        /* renamed from: e */
        float[] f2151e;

        /* renamed from: f */
        float[] f2152f;

        /* renamed from: g */
        int f2153g;

        /* renamed from: h */
        AbstractC0528b f2154h;

        /* renamed from: i */
        double[] f2155i;

        /* renamed from: j */
        double[] f2156j;

        /* renamed from: k */
        float f2157k;

        /* renamed from: l */
        public HashMap<String, ConstraintAttribute> f2158l = new HashMap<>();

        /* renamed from: m */
        private final int f2159m;

        /* renamed from: a */
        public double mo3252a(float f) {
            AbstractC0528b bVar = this.f2154h;
            if (bVar != null) {
                bVar.mo3099a((double) f, this.f2155i);
            } else {
                double[] dArr = this.f2155i;
                dArr[0] = (double) this.f2151e[0];
                dArr[1] = (double) this.f2148b[0];
            }
            return this.f2155i[0] + (this.f2147a.mo3121b((double) f) * this.f2155i[1]);
        }

        /* renamed from: b */
        public double mo3254b(float f) {
            AbstractC0528b bVar = this.f2154h;
            if (bVar != null) {
                double d = (double) f;
                bVar.mo3103b(d, this.f2156j);
                this.f2154h.mo3099a(d, this.f2155i);
            } else {
                double[] dArr = this.f2156j;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d2 = (double) f;
            double b = this.f2147a.mo3121b(d2);
            double d3 = this.f2147a.mo3123d(d2);
            double[] dArr2 = this.f2156j;
            return dArr2[0] + (b * dArr2[1]) + (d3 * this.f2155i[1]);
        }

        /* renamed from: c */
        public void mo3255c(float f) {
            this.f2157k = f;
            int length = this.f2149c.length;
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.f2148b;
            this.f2155i = new double[(fArr.length + 1)];
            this.f2156j = new double[(fArr.length + 1)];
            if (this.f2149c[0] > 0.0d) {
                this.f2147a.mo3119a(0.0d, this.f2150d[0]);
            }
            double[] dArr2 = this.f2149c;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f2147a.mo3119a(1.0d, this.f2150d[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.f2151e[i];
                int i2 = 0;
                while (true) {
                    float[] fArr2 = this.f2148b;
                    if (i2 >= fArr2.length) {
                        break;
                    }
                    dArr[i2][1] = (double) fArr2[i2];
                    i2++;
                }
                this.f2147a.mo3119a(this.f2149c[i], this.f2150d[i]);
            }
            this.f2147a.mo3118a();
            double[] dArr3 = this.f2149c;
            if (dArr3.length > 1) {
                this.f2154h = AbstractC0528b.m2417a(0, dArr3, dArr);
            } else {
                this.f2154h = null;
            }
        }

        C0559c(int i, int i2, int i3) {
            this.f2153g = i;
            this.f2159m = i2;
            this.f2147a.mo3120a(i);
            this.f2148b = new float[i3];
            this.f2149c = new double[i3];
            this.f2150d = new float[i3];
            this.f2151e = new float[i3];
            this.f2152f = new float[i3];
        }

        /* renamed from: a */
        public void mo3253a(int i, int i2, float f, float f2, float f3) {
            this.f2149c[i] = ((double) i2) / 100.0d;
            this.f2150d[i] = f;
            this.f2151e[i] = f2;
            this.f2148b[i] = f3;
        }
    }

    /* renamed from: c */
    public void mo3248c(float f) {
        int size = this.f2140c.size();
        if (size != 0) {
            Collections.sort(this.f2140c, new Comparator<C0571o>() {
                /* class androidx.constraintlayout.motion.widget.AbstractC0555g.C05561 */

                /* renamed from: a */
                public int compare(C0571o oVar, C0571o oVar2) {
                    return Integer.compare(oVar.f2161a, oVar2.f2161a);
                }
            });
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.f2142e = new C0559c(this.f2144g, this.f2139b, size);
            Iterator<C0571o> it = this.f2140c.iterator();
            int i = 0;
            while (it.hasNext()) {
                C0571o next = it.next();
                dArr[i] = ((double) next.f2164d) * 0.01d;
                dArr2[i][0] = (double) next.f2162b;
                dArr2[i][1] = (double) next.f2163c;
                this.f2142e.mo3253a(i, next.f2161a, next.f2164d, next.f2163c, next.f2162b);
                i++;
            }
            this.f2142e.mo3255c(f);
            this.f2141d = AbstractC0528b.m2417a(0, dArr, dArr2);
        }
    }

    /* renamed from: b */
    static AbstractC0555g m2580b(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C0558b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0564h();
            case 1:
                return new C0565i();
            case 2:
                return new C0568l();
            case 3:
                return new C0569m();
            case 4:
                return new C0570n();
            case 5:
                return new C0562f();
            case 6:
                return new C0566j();
            case 7:
                return new C0567k();
            case '\b':
                return new C0557a();
            case '\t':
                return new C0563g();
            case '\n':
                return new C0560d();
            case 11:
                return new C0561e();
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return new C0557a();
            case '\r':
                return new C0557a();
            default:
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.g$o */
    public static class C0571o {

        /* renamed from: a */
        int f2161a;

        /* renamed from: b */
        float f2162b;

        /* renamed from: c */
        float f2163c;

        /* renamed from: d */
        float f2164d;

        public C0571o(int i, float f, float f2, float f3) {
            this.f2161a = i;
            this.f2162b = f3;
            this.f2163c = f2;
            this.f2164d = f;
        }
    }

    /* renamed from: a */
    public void mo3242a(int i, int i2, int i3, float f, float f2, float f3) {
        this.f2140c.add(new C0571o(i, f, f2, f3));
        if (i3 != -1) {
            this.f2139b = i3;
        }
        this.f2144g = i2;
    }

    /* renamed from: a */
    public void mo3243a(int i, int i2, int i3, float f, float f2, float f3, ConstraintAttribute constraintAttribute) {
        this.f2140c.add(new C0571o(i, f, f2, f3));
        if (i3 != -1) {
            this.f2139b = i3;
        }
        this.f2144g = i2;
        this.f2138a = constraintAttribute;
    }
}
