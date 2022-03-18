package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.e */
public final class C0828e {

    /* renamed from: a */
    public static final AbstractC0827d f3298a = new C0833e(null, false);

    /* renamed from: b */
    public static final AbstractC0827d f3299b = new C0833e(null, true);

    /* renamed from: c */
    public static final AbstractC0827d f3300c = new C0833e(C0830b.f3306a, false);

    /* renamed from: d */
    public static final AbstractC0827d f3301d = new C0833e(C0830b.f3306a, true);

    /* renamed from: e */
    public static final AbstractC0827d f3302e = new C0833e(C0829a.f3304a, false);

    /* renamed from: f */
    public static final AbstractC0827d f3303f = C0834f.f3309a;

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.text.e$c */
    public interface AbstractC0831c {
        /* renamed from: a */
        int mo4468a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: a */
    static int m3971a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m3972b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    /* renamed from: androidx.core.text.e$b */
    private static class C0830b implements AbstractC0831c {

        /* renamed from: a */
        static final C0830b f3306a = new C0830b();

        private C0830b() {
        }

        @Override // androidx.core.text.C0828e.AbstractC0831c
        /* renamed from: a */
        public int mo4468a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0828e.m3972b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.e$e */
    private static class C0833e extends AbstractC0832d {

        /* renamed from: a */
        private final boolean f3308a;

        /* access modifiers changed from: protected */
        @Override // androidx.core.text.C0828e.AbstractC0832d
        /* renamed from: a */
        public boolean mo4469a() {
            return this.f3308a;
        }

        C0833e(AbstractC0831c cVar, boolean z) {
            super(cVar);
            this.f3308a = z;
        }
    }

    /* renamed from: androidx.core.text.e$f */
    private static class C0834f extends AbstractC0832d {

        /* renamed from: a */
        static final C0834f f3309a = new C0834f();

        C0834f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.core.text.C0828e.AbstractC0832d
        /* renamed from: a */
        public boolean mo4469a() {
            if (C0835f.m3981a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.core.text.e$a */
    private static class C0829a implements AbstractC0831c {

        /* renamed from: a */
        static final C0829a f3304a = new C0829a(true);

        /* renamed from: b */
        private final boolean f3305b;

        private C0829a(boolean z) {
            this.f3305b = z;
        }

        @Override // androidx.core.text.C0828e.AbstractC0831c
        /* renamed from: a */
        public int mo4468a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0828e.m3971a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f3305b) {
                        return 1;
                    }
                } else if (this.f3305b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f3305b ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.e$d */
    private static abstract class AbstractC0832d implements AbstractC0827d {

        /* renamed from: a */
        private final AbstractC0831c f3307a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo4469a();

        AbstractC0832d(AbstractC0831c cVar) {
            this.f3307a = cVar;
        }

        /* renamed from: b */
        private boolean m3976b(CharSequence charSequence, int i, int i2) {
            int a = this.f3307a.mo4468a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo4469a();
            }
            return false;
        }

        @Override // androidx.core.text.AbstractC0827d
        /* renamed from: a */
        public boolean mo4467a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f3307a == null) {
                return mo4469a();
            } else {
                return m3976b(charSequence, i, i2);
            }
        }
    }
}
