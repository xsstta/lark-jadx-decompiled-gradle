package org.apache.commons.compress.compressors.lz77support;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: org.apache.commons.compress.compressors.lz77support.b */
public final class C69835b {

    /* renamed from: a */
    private final int f174554a;

    /* renamed from: b */
    private final int f174555b;

    /* renamed from: c */
    private final int f174556c;

    /* renamed from: d */
    private final int f174557d;

    /* renamed from: e */
    private final int f174558e;

    /* renamed from: f */
    private final int f174559f;

    /* renamed from: g */
    private final int f174560g;

    /* renamed from: h */
    private final int f174561h;

    /* renamed from: i */
    private final boolean f174562i;

    /* renamed from: b */
    public static final boolean m268010b(int i) {
        return (i & (i + -1)) == 0;
    }

    /* renamed from: a */
    public int mo244974a() {
        return this.f174554a;
    }

    /* renamed from: b */
    public int mo244975b() {
        return this.f174555b;
    }

    /* renamed from: c */
    public int mo244976c() {
        return this.f174556c;
    }

    /* renamed from: d */
    public int mo244977d() {
        return this.f174557d;
    }

    /* renamed from: e */
    public int mo244978e() {
        return this.f174558e;
    }

    /* renamed from: f */
    public int mo244979f() {
        return this.f174559f;
    }

    /* renamed from: g */
    public int mo244980g() {
        return this.f174560g;
    }

    /* renamed from: h */
    public boolean mo244981h() {
        return this.f174562i;
    }

    /* renamed from: i */
    public int mo244982i() {
        return this.f174561h;
    }

    /* renamed from: org.apache.commons.compress.compressors.lz77support.b$a */
    public static class C69837a {

        /* renamed from: a */
        private final int f174563a;

        /* renamed from: b */
        private int f174564b;

        /* renamed from: c */
        private int f174565c;

        /* renamed from: d */
        private int f174566d;

        /* renamed from: e */
        private int f174567e;

        /* renamed from: f */
        private Integer f174568f;

        /* renamed from: g */
        private Integer f174569g;

        /* renamed from: h */
        private Integer f174570h;

        /* renamed from: i */
        private Boolean f174571i;

        /* renamed from: a */
        public C69835b mo244984a() {
            int i;
            int i2;
            boolean z;
            int i3;
            int i4;
            Integer num = this.f174568f;
            if (num != null) {
                i = num.intValue();
            } else {
                i = Math.max(this.f174564b, this.f174565c / 2);
            }
            Integer num2 = this.f174569g;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = Math.max((int) DynamicModule.f58006b, this.f174563a / SmActions.ACTION_ONTHECALL_EXIT);
            }
            Boolean bool = this.f174571i;
            if (bool == null || bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Integer num3 = this.f174570h;
                if (num3 != null) {
                    i4 = num3.intValue();
                } else {
                    i3 = i;
                    return new C69835b(this.f174563a, this.f174564b, this.f174565c, this.f174566d, this.f174567e, i, i2, z, i3);
                }
            } else {
                i4 = this.f174564b;
            }
            i3 = i4;
            return new C69835b(this.f174563a, this.f174564b, this.f174565c, this.f174566d, this.f174567e, i, i2, z, i3);
        }

        /* renamed from: b */
        public C69837a mo244985b(int i) {
            int i2 = this.f174564b;
            if (i >= i2) {
                i2 = Math.min(i, this.f174563a - 1);
            }
            this.f174565c = i2;
            return this;
        }

        /* renamed from: d */
        public C69837a mo244987d(int i) {
            int i2;
            if (i < 1) {
                i2 = this.f174563a;
            } else {
                i2 = Math.min(i, this.f174563a);
            }
            this.f174567e = i2;
            return this;
        }

        /* renamed from: a */
        public C69837a mo244983a(int i) {
            int max = Math.max(3, i);
            this.f174564b = max;
            if (this.f174563a >= max) {
                if (this.f174565c < max) {
                    this.f174565c = max;
                }
                return this;
            }
            throw new IllegalArgumentException("minBackReferenceLength can't be bigger than windowSize");
        }

        /* renamed from: c */
        public C69837a mo244986c(int i) {
            int i2;
            if (i < 1) {
                i2 = this.f174563a - 1;
            } else {
                i2 = Math.min(i, this.f174563a - 1);
            }
            this.f174566d = i2;
            return this;
        }

        private C69837a(int i) {
            if (i < 2 || !C69835b.m268010b(i)) {
                throw new IllegalArgumentException("windowSize must be a power of two");
            }
            this.f174563a = i;
            this.f174564b = 3;
            int i2 = i - 1;
            this.f174565c = i2;
            this.f174566d = i2;
            this.f174567e = i;
        }
    }

    /* renamed from: a */
    public static C69837a m268009a(int i) {
        return new C69837a(i);
    }

    private C69835b(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.f174554a = i;
        this.f174555b = i2;
        this.f174556c = i3;
        this.f174557d = i4;
        this.f174558e = i5;
        this.f174559f = i6;
        this.f174560g = i7;
        this.f174562i = z;
        this.f174561h = i8;
    }
}
