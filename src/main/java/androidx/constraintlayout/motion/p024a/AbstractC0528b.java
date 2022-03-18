package androidx.constraintlayout.motion.p024a;

/* renamed from: androidx.constraintlayout.motion.a.b */
public abstract class AbstractC0528b {
    /* renamed from: a */
    public abstract double mo3098a(double d, int i);

    /* renamed from: a */
    public abstract void mo3099a(double d, double[] dArr);

    /* renamed from: a */
    public abstract void mo3100a(double d, float[] fArr);

    /* renamed from: a */
    public abstract double[] mo3101a();

    /* renamed from: b */
    public abstract double mo3102b(double d, int i);

    /* renamed from: b */
    public abstract void mo3103b(double d, double[] dArr);

    /* renamed from: androidx.constraintlayout.motion.a.b$a */
    static class C0529a extends AbstractC0528b {

        /* renamed from: a */
        double f1945a;

        /* renamed from: b */
        double[] f1946b;

        @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
        /* renamed from: b */
        public double mo3102b(double d, int i) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
        /* renamed from: a */
        public double[] mo3101a() {
            return new double[]{this.f1945a};
        }

        C0529a(double d, double[] dArr) {
            this.f1945a = d;
            this.f1946b = dArr;
        }

        @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
        /* renamed from: a */
        public double mo3098a(double d, int i) {
            return this.f1946b[i];
        }

        @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
        /* renamed from: a */
        public void mo3099a(double d, double[] dArr) {
            double[] dArr2 = this.f1946b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
        /* renamed from: b */
        public void mo3103b(double d, double[] dArr) {
            for (int i = 0; i < this.f1946b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.motion.p024a.AbstractC0528b
        /* renamed from: a */
        public void mo3100a(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f1946b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static AbstractC0528b m2418a(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C0526a(iArr, dArr, dArr2);
    }

    /* renamed from: a */
    public static AbstractC0528b m2417a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C0533e(dArr, dArr2);
        }
        if (i != 2) {
            return new C0532d(dArr, dArr2);
        }
        return new C0529a(dArr[0], dArr2[0]);
    }
}
