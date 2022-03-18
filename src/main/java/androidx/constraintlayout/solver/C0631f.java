package androidx.constraintlayout.solver;

/* renamed from: androidx.constraintlayout.solver.f */
final class C0631f {

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.f$a */
    public interface AbstractC0632a<T> {
        /* renamed from: a */
        T mo3462a();

        /* renamed from: a */
        void mo3463a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo3464a(T t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.f$b */
    public static class C0633b<T> implements AbstractC0632a<T> {

        /* renamed from: a */
        private final Object[] f2489a;

        /* renamed from: b */
        private int f2490b;

        @Override // androidx.constraintlayout.solver.C0631f.AbstractC0632a
        /* renamed from: a */
        public T mo3462a() {
            int i = this.f2490b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f2489a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f2490b = i - 1;
            return t;
        }

        @Override // androidx.constraintlayout.solver.C0631f.AbstractC0632a
        /* renamed from: a */
        public boolean mo3464a(T t) {
            int i = this.f2490b;
            Object[] objArr = this.f2489a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2490b = i + 1;
            return true;
        }

        C0633b(int i) {
            if (i > 0) {
                this.f2489a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        @Override // androidx.constraintlayout.solver.C0631f.AbstractC0632a
        /* renamed from: a */
        public void mo3463a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f2490b;
                Object[] objArr = this.f2489a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f2490b = i3 + 1;
                }
            }
        }
    }
}
