package org.tukaani.xz.p3528f;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.lang.reflect.Array;
import org.tukaani.xz.p3529g.AbstractC70076a;

/* renamed from: org.tukaani.xz.f.a */
abstract class AbstractC70065a {

    /* renamed from: a */
    final int f175114a;

    /* renamed from: b */
    final int[] f175115b = new int[4];

    /* renamed from: c */
    final C70074c f175116c = new C70074c();

    /* renamed from: d */
    final short[][] f175117d = ((short[][]) Array.newInstance(short.class, 12, 16));

    /* renamed from: e */
    final short[] f175118e = new short[12];

    /* renamed from: f */
    final short[] f175119f = new short[12];

    /* renamed from: g */
    final short[] f175120g = new short[12];

    /* renamed from: h */
    final short[] f175121h = new short[12];

    /* renamed from: i */
    final short[][] f175122i = ((short[][]) Array.newInstance(short.class, 12, 16));

    /* renamed from: j */
    final short[][] f175123j = ((short[][]) Array.newInstance(short.class, 4, 64));

    /* renamed from: k */
    final short[][] f175124k = {new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};

    /* renamed from: l */
    final short[] f175125l = new short[16];

    /* renamed from: org.tukaani.xz.f.a$a */
    abstract class AbstractC70066a {

        /* renamed from: a */
        final short[] f175126a = new short[2];

        /* renamed from: b */
        final short[][] f175127b = ((short[][]) Array.newInstance(short.class, 16, 8));

        /* renamed from: c */
        final short[][] f175128c = ((short[][]) Array.newInstance(short.class, 16, 8));

        /* renamed from: d */
        final short[] f175129d = new short[DynamicModule.f58006b];

        AbstractC70066a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo246762a() {
            AbstractC70076a.m268820a(this.f175126a);
            int i = 0;
            while (true) {
                short[][] sArr = this.f175127b;
                if (i >= sArr.length) {
                    break;
                }
                AbstractC70076a.m268820a(sArr[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.f175127b.length; i2++) {
                AbstractC70076a.m268820a(this.f175128c[i2]);
            }
            AbstractC70076a.m268820a(this.f175129d);
        }
    }

    /* renamed from: org.tukaani.xz.f.a$b */
    abstract class AbstractC70067b {

        /* renamed from: b */
        private final int f175132b;

        /* renamed from: c */
        private final int f175133c;

        /* renamed from: org.tukaani.xz.f.a$b$a */
        abstract class AbstractC70068a {

            /* renamed from: a */
            final short[] f175134a = new short[768];

            AbstractC70068a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo246764a() {
                AbstractC70076a.m268820a(this.f175134a);
            }
        }

        AbstractC70067b(int i, int i2) {
            this.f175132b = i;
            this.f175133c = (1 << i2) - 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo246763a(int i, int i2) {
            int i3 = this.f175132b;
            return (i >> (8 - i3)) + ((i2 & this.f175133c) << i3);
        }
    }

    AbstractC70065a(int i) {
        this.f175114a = (1 << i) - 1;
    }

    /* renamed from: a */
    static final int m268796a(int i) {
        if (i < 6) {
            return i - 2;
        }
        return 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo246761a() {
        int[] iArr = this.f175115b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f175116c.mo246771a();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f175117d;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC70076a.m268820a(sArr[i2]);
            i2++;
        }
        AbstractC70076a.m268820a(this.f175118e);
        AbstractC70076a.m268820a(this.f175119f);
        AbstractC70076a.m268820a(this.f175120g);
        AbstractC70076a.m268820a(this.f175121h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f175122i;
            if (i3 >= sArr2.length) {
                break;
            }
            AbstractC70076a.m268820a(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f175123j;
            if (i4 >= sArr3.length) {
                break;
            }
            AbstractC70076a.m268820a(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f175124k;
            if (i < sArr4.length) {
                AbstractC70076a.m268820a(sArr4[i]);
                i++;
            } else {
                AbstractC70076a.m268820a(this.f175125l);
                return;
            }
        }
    }
}
