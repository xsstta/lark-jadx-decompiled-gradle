package org.apache.commons.compress.compressors.p3495b;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69746a;
import org.apache.commons.compress.p3493a.C69751e;

/* renamed from: org.apache.commons.compress.compressors.b.a */
public class C69785a extends AbstractC69780a {

    /* renamed from: a */
    private int f174325a;

    /* renamed from: b */
    private int f174326b;

    /* renamed from: c */
    private int f174327c;

    /* renamed from: d */
    private boolean f174328d;

    /* renamed from: e */
    private final C69787b f174329e = new C69787b();

    /* renamed from: f */
    private int f174330f;

    /* renamed from: g */
    private C69746a f174331g;

    /* renamed from: h */
    private final boolean f174332h;

    /* renamed from: i */
    private int f174333i = 1;

    /* renamed from: j */
    private int f174334j;

    /* renamed from: k */
    private int f174335k;

    /* renamed from: l */
    private int f174336l;

    /* renamed from: m */
    private int f174337m;

    /* renamed from: n */
    private int f174338n;

    /* renamed from: o */
    private int f174339o;

    /* renamed from: p */
    private int f174340p;

    /* renamed from: q */
    private int f174341q;

    /* renamed from: r */
    private int f174342r;

    /* renamed from: s */
    private int f174343s;

    /* renamed from: t */
    private int f174344t;

    /* renamed from: u */
    private int f174345u;

    /* renamed from: v */
    private char f174346v;

    /* renamed from: w */
    private C69786a f174347w;

    /* renamed from: b */
    private void m267802b() {
        boolean[] zArr = this.f174347w.f174348a;
        byte[] bArr = this.f174347w.f174349b;
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (zArr[i2]) {
                bArr[i] = (byte) i2;
                i++;
            }
        }
        this.f174330f = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        C69746a aVar = this.f174331g;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f174347w = null;
                this.f174331g = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i;
        if (this.f174331g != null) {
            int c = m267805c();
            if (c < 0) {
                i = -1;
            } else {
                i = 1;
            }
            mo244818a(i);
            return c;
        }
        throw new IOException("stream closed");
    }

    /* renamed from: e */
    private void m267808e() throws IOException {
        int b = this.f174329e.mo244837b();
        this.f174336l = b;
        int i = this.f174334j;
        if (i == b) {
            int i2 = this.f174337m;
            int i3 = (i2 >>> 31) | (i2 << 1);
            this.f174337m = i3;
            this.f174337m = b ^ i3;
            return;
        }
        int i4 = this.f174335k;
        int i5 = (i4 >>> 31) | (i4 << 1);
        this.f174337m = i5;
        this.f174337m = i5 ^ i;
        throw new IOException("BZip2 CRC error");
    }

    /* renamed from: f */
    private boolean m267809f() throws IOException {
        int d = m267806d(this.f174331g);
        this.f174335k = d;
        this.f174333i = 0;
        this.f174347w = null;
        if (d != this.f174337m) {
            throw new IOException("BZip2 CRC error");
        } else if (!this.f174332h || !m267801a(false)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    private int m267817n() throws IOException {
        if (this.f174342r < this.f174346v) {
            this.f174329e.mo244836a(this.f174339o);
            this.f174342r++;
            return this.f174339o;
        }
        this.f174333i = 2;
        this.f174341q++;
        this.f174338n = 0;
        return m267814k();
    }

    /* renamed from: p */
    private int m267819p() throws IOException {
        if (this.f174342r < this.f174346v) {
            int i = this.f174339o;
            this.f174329e.mo244836a(i);
            this.f174342r++;
            this.f174333i = 7;
            return i;
        }
        this.f174341q++;
        this.f174338n = 0;
        return m267815l();
    }

    /* renamed from: c */
    private int m267805c() throws IOException {
        switch (this.f174333i) {
            case 0:
                return -1;
            case 1:
                return m267813j();
            case 2:
                throw new IllegalStateException();
            case 3:
                return m267816m();
            case 4:
                return m267817n();
            case 5:
                throw new IllegalStateException();
            case 6:
                return m267818o();
            case 7:
                return m267819p();
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: i */
    private int m267812i() throws IOException {
        C69786a aVar = this.f174347w;
        int i = aVar.f174350c[0] & 255;
        m267799a(i, 6, "zt");
        int[] iArr = aVar.f174353f[i];
        int i2 = aVar.f174356i[i];
        m267799a(i2, 258, "zn");
        int a = m267797a(this.f174331g, i2);
        while (a > iArr[i2]) {
            i2++;
            m267799a(i2, 258, "zn");
            a = (a << 1) | m267797a(this.f174331g, 1);
        }
        int i3 = a - aVar.f174354g[i][i2];
        m267799a(i3, 258, "zvec");
        return aVar.f174355h[i][i3];
    }

    /* renamed from: j */
    private int m267813j() throws IOException {
        C69786a aVar;
        if (this.f174333i == 0 || (aVar = this.f174347w) == null) {
            return -1;
        }
        int[] iArr = aVar.f174357j;
        int i = this.f174325a + 1;
        int[] a = this.f174347w.mo244834a(i);
        byte[] bArr = this.f174347w.f174362o;
        iArr[0] = 0;
        System.arraycopy(this.f174347w.f174352e, 0, iArr, 1, DynamicModule.f58006b);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.f174325a;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            m267799a(i7, i, "tt index");
            a[i7] = i5;
        }
        int i8 = this.f174326b;
        if (i8 < 0 || i8 >= a.length) {
            throw new IOException("stream corrupted");
        }
        this.f174345u = a[i8];
        this.f174338n = 0;
        this.f174341q = 0;
        this.f174339o = DynamicModule.f58006b;
        if (!this.f174328d) {
            return m267815l();
        }
        this.f174343s = 0;
        this.f174344t = 0;
        return m267814k();
    }

    /* renamed from: k */
    private int m267814k() throws IOException {
        if (this.f174341q <= this.f174325a) {
            this.f174340p = this.f174339o;
            byte[] bArr = this.f174347w.f174362o;
            int i = this.f174345u;
            int i2 = bArr[i] & 255;
            m267799a(i, this.f174347w.f174361n.length, "su_tPos");
            this.f174345u = this.f174347w.f174361n[this.f174345u];
            int i3 = this.f174343s;
            int i4 = 0;
            if (i3 == 0) {
                this.f174343s = C69788c.m267824a(this.f174344t) - 1;
                int i5 = this.f174344t + 1;
                this.f174344t = i5;
                if (i5 == 512) {
                    this.f174344t = 0;
                }
            } else {
                this.f174343s = i3 - 1;
            }
            if (this.f174343s == 1) {
                i4 = 1;
            }
            int i6 = i2 ^ i4;
            this.f174339o = i6;
            this.f174341q++;
            this.f174333i = 3;
            this.f174329e.mo244836a(i6);
            return i6;
        }
        m267808e();
        m267807d();
        return m267813j();
    }

    /* renamed from: l */
    private int m267815l() throws IOException {
        if (this.f174341q <= this.f174325a) {
            this.f174340p = this.f174339o;
            byte[] bArr = this.f174347w.f174362o;
            int i = this.f174345u;
            int i2 = bArr[i] & 255;
            this.f174339o = i2;
            m267799a(i, this.f174347w.f174361n.length, "su_tPos");
            this.f174345u = this.f174347w.f174361n[this.f174345u];
            this.f174341q++;
            this.f174333i = 6;
            this.f174329e.mo244836a(i2);
            return i2;
        }
        this.f174333i = 5;
        m267808e();
        m267807d();
        return m267813j();
    }

    /* renamed from: m */
    private int m267816m() throws IOException {
        if (this.f174339o != this.f174340p) {
            this.f174333i = 2;
            this.f174338n = 1;
            return m267814k();
        }
        int i = this.f174338n + 1;
        this.f174338n = i;
        if (i >= 4) {
            byte[] bArr = this.f174347w.f174362o;
            int i2 = this.f174345u;
            this.f174346v = (char) (bArr[i2] & 255);
            m267799a(i2, this.f174347w.f174361n.length, "su_tPos");
            this.f174345u = this.f174347w.f174361n[this.f174345u];
            int i3 = this.f174343s;
            if (i3 == 0) {
                this.f174343s = C69788c.m267824a(this.f174344t) - 1;
                int i4 = this.f174344t + 1;
                this.f174344t = i4;
                if (i4 == 512) {
                    this.f174344t = 0;
                }
            } else {
                this.f174343s = i3 - 1;
            }
            this.f174342r = 0;
            this.f174333i = 4;
            if (this.f174343s == 1) {
                this.f174346v = (char) (this.f174346v ^ 1);
            }
            return m267817n();
        }
        this.f174333i = 2;
        return m267814k();
    }

    /* renamed from: o */
    private int m267818o() throws IOException {
        if (this.f174339o != this.f174340p) {
            this.f174338n = 1;
            return m267815l();
        }
        int i = this.f174338n + 1;
        this.f174338n = i;
        if (i < 4) {
            return m267815l();
        }
        m267799a(this.f174345u, this.f174347w.f174362o.length, "su_tPos");
        this.f174346v = (char) (this.f174347w.f174362o[this.f174345u] & 255);
        this.f174345u = this.f174347w.f174361n[this.f174345u];
        this.f174342r = 0;
        return m267819p();
    }

    /* renamed from: d */
    private void m267807d() throws IOException {
        C69746a aVar = this.f174331g;
        do {
            char c = m267804c(aVar);
            char c2 = m267804c(aVar);
            char c3 = m267804c(aVar);
            char c4 = m267804c(aVar);
            char c5 = m267804c(aVar);
            char c6 = m267804c(aVar);
            if (c != 23 || c2 != 'r' || c3 != 'E' || c4 != '8' || c5 != 'P' || c6 != 144) {
                boolean z = false;
                if (c == '1' && c2 == 'A' && c3 == 'Y' && c4 == '&' && c5 == 'S' && c6 == 'Y') {
                    this.f174334j = m267806d(aVar);
                    if (m267797a(aVar, 1) == 1) {
                        z = true;
                    }
                    this.f174328d = z;
                    if (this.f174347w == null) {
                        this.f174347w = new C69786a(this.f174327c);
                    }
                    m267811h();
                    this.f174329e.mo244835a();
                    this.f174333i = 1;
                    return;
                }
                this.f174333i = 0;
                throw new IOException("bad block header");
            }
        } while (!m267809f());
    }

    /* renamed from: g */
    private void m267810g() throws IOException {
        int i;
        C69746a aVar = this.f174331g;
        C69786a aVar2 = this.f174347w;
        boolean[] zArr = aVar2.f174348a;
        byte[] bArr = aVar2.f174360m;
        byte[] bArr2 = aVar2.f174350c;
        byte[] bArr3 = aVar2.f174351d;
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            if (m267803b(aVar)) {
                i2 |= 1 << i3;
            }
        }
        Arrays.fill(zArr, false);
        for (int i4 = 0; i4 < 16; i4++) {
            if (((1 << i4) & i2) != 0) {
                int i5 = i4 << 4;
                for (int i6 = 0; i6 < 16; i6++) {
                    if (m267803b(aVar)) {
                        zArr[i5 + i6] = true;
                    }
                }
            }
        }
        m267802b();
        int i7 = this.f174330f + 2;
        int a = m267797a(aVar, 3);
        int a2 = m267797a(aVar, 15);
        m267799a(i7, 259, "alphaSize");
        m267799a(a, 7, "nGroups");
        m267799a(a2, 18003, "nSelectors");
        for (int i8 = 0; i8 < a2; i8++) {
            int i9 = 0;
            while (m267803b(aVar)) {
                i9++;
            }
            bArr3[i8] = (byte) i9;
        }
        int i10 = a;
        while (true) {
            i10--;
            if (i10 < 0) {
                break;
            }
            bArr[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < a2; i11++) {
            int i12 = bArr3[i11] & 255;
            m267799a(i12, 6, "selectorMtf");
            byte b = bArr[i12];
            while (i12 > 0) {
                bArr[i12] = bArr[i12 - 1];
                i12--;
            }
            bArr[0] = b;
            bArr2[i11] = b;
        }
        char[][] cArr = aVar2.f174359l;
        for (int i13 = 0; i13 < a; i13++) {
            int a3 = m267797a(aVar, 5);
            char[] cArr2 = cArr[i13];
            for (int i14 = 0; i14 < i7; i14++) {
                while (m267803b(aVar)) {
                    if (m267803b(aVar)) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    a3 += i;
                }
                cArr2[i14] = (char) a3;
            }
        }
        m267798a(i7, a);
    }

    /* renamed from: h */
    private void m267811h() throws IOException {
        byte[] bArr;
        String str;
        int i;
        int i2;
        char c;
        int i3;
        String str2;
        int i4;
        C69785a aVar = this;
        C69746a aVar2 = aVar.f174331g;
        aVar.f174326b = m267797a(aVar2, 24);
        m267810g();
        C69786a aVar3 = aVar.f174347w;
        byte[] bArr2 = aVar3.f174362o;
        int[] iArr = aVar3.f174352e;
        byte[] bArr3 = aVar3.f174350c;
        byte[] bArr4 = aVar3.f174349b;
        char[] cArr = aVar3.f174358k;
        int[] iArr2 = aVar3.f174356i;
        int[][] iArr3 = aVar3.f174353f;
        int[][] iArr4 = aVar3.f174354g;
        int[][] iArr5 = aVar3.f174355h;
        int i5 = aVar.f174327c * 100000;
        int i6 = DynamicModule.f58006b;
        while (true) {
            i6--;
            if (i6 < 0) {
                break;
            }
            cArr[i6] = (char) i6;
            iArr[i6] = 0;
        }
        int i7 = aVar.f174330f + 1;
        int i8 = m267812i();
        int i9 = bArr3[0] & 255;
        m267799a(i9, 6, "zt");
        int[] iArr6 = iArr4[i9];
        int[] iArr7 = iArr3[i9];
        int[] iArr8 = iArr5[i9];
        int i10 = iArr2[i9];
        int i11 = i8;
        int i12 = -1;
        int i13 = 0;
        int i14 = 49;
        while (i11 != i7) {
            String str3 = "groupNo";
            if (i11 == 0 || i11 == 1) {
                i11 = i11;
                int i15 = -1;
                int i16 = i14;
                int i17 = i13;
                int i18 = i10;
                int[] iArr9 = iArr8;
                int[] iArr10 = iArr7;
                int[] iArr11 = iArr6;
                int i19 = 1;
                while (true) {
                    if (i11 != 0) {
                        bArr = bArr2;
                        if (i11 != 1) {
                            break;
                        }
                        i15 += i19 << 1;
                    } else {
                        i15 += i19;
                        bArr = bArr2;
                    }
                    if (i16 == 0) {
                        int i20 = i17 + 1;
                        m267799a(i20, 18002, str3);
                        int i21 = bArr3[i20] & 255;
                        str = str3;
                        m267799a(i21, 6, "zt");
                        iArr11 = iArr4[i21];
                        iArr10 = iArr3[i21];
                        iArr9 = iArr5[i21];
                        i17 = i20;
                        i2 = iArr2[i21];
                        i = 258;
                        i16 = 49;
                    } else {
                        str = str3;
                        i16--;
                        i2 = i18;
                        i = 258;
                    }
                    m267799a(i2, i, "zn");
                    int a = m267797a(aVar2, i2);
                    int i22 = i2;
                    while (a > iArr10[i22]) {
                        int i23 = i22 + 1;
                        m267799a(i23, 258, "zn");
                        a = (a << 1) | m267797a(aVar2, 1);
                        i22 = i23;
                        iArr5 = iArr5;
                    }
                    int i24 = a - iArr11[i22];
                    m267799a(i24, 258, "zvec");
                    i19 <<= 1;
                    i11 = iArr9[i24];
                    i18 = i2;
                    bArr2 = bArr;
                    str3 = str;
                    iArr5 = iArr5;
                }
                char c2 = cArr[0];
                m267799a(c2, DynamicModule.f58006b, "yy");
                byte b = bArr4[c2];
                int i25 = b & 255;
                iArr[i25] = iArr[i25] + i15 + 1;
                int i26 = i12 + 1;
                int i27 = i26 + i15;
                Arrays.fill(bArr, i26, i27 + 1, b);
                if (i27 < i5) {
                    bArr2 = bArr;
                    i12 = i27;
                    aVar2 = aVar2;
                    iArr6 = iArr11;
                    iArr7 = iArr10;
                    iArr8 = iArr9;
                    i10 = i18;
                    i13 = i17;
                    i7 = i7;
                    i14 = i16;
                    iArr2 = iArr2;
                    iArr5 = iArr5;
                    i5 = i5;
                } else {
                    throw new IOException("block overrun while expanding RLE in MTF, " + i27 + " exceeds " + i5);
                }
            } else {
                i12++;
                if (i12 < i5) {
                    m267799a(i11, 257, "nextSym");
                    int i28 = i11 - 1;
                    char c3 = cArr[i28];
                    m267799a(c3, DynamicModule.f58006b, "yy");
                    int i29 = bArr4[c3] & 255;
                    iArr[i29] = iArr[i29] + 1;
                    bArr2[i12] = bArr4[c3];
                    if (i11 <= 16) {
                        while (i28 > 0) {
                            int i30 = i28 - 1;
                            cArr[i28] = cArr[i30];
                            i28 = i30;
                        }
                        c = 0;
                    } else {
                        c = 0;
                        System.arraycopy(cArr, 0, cArr, 1, i28);
                    }
                    cArr[c] = c3;
                    if (i14 == 0) {
                        int i31 = i13 + 1;
                        m267799a(i31, 18002, str3);
                        int i32 = bArr3[i31] & 255;
                        m267799a(i32, 6, "zt");
                        int[] iArr12 = iArr4[i32];
                        int[] iArr13 = iArr3[i32];
                        int[] iArr14 = iArr5[i32];
                        i4 = iArr2[i32];
                        i13 = i31;
                        iArr6 = iArr12;
                        iArr7 = iArr13;
                        iArr8 = iArr14;
                        str2 = "zn";
                        i3 = 258;
                        i14 = 49;
                    } else {
                        i14--;
                        i4 = i10;
                        str2 = "zn";
                        i3 = 258;
                    }
                    m267799a(i4, i3, str2);
                    int a2 = m267797a(aVar2, i4);
                    int i33 = i4;
                    while (a2 > iArr7[i33]) {
                        i33++;
                        m267799a(i33, 258, str2);
                        a2 = (a2 << 1) | m267797a(aVar2, 1);
                    }
                    int i34 = a2 - iArr6[i33];
                    m267799a(i34, 258, "zvec");
                    i11 = iArr8[i34];
                    i10 = i4;
                    aVar2 = aVar2;
                    i7 = i7;
                    i5 = i5;
                    iArr2 = iArr2;
                } else {
                    throw new IOException("block overrun in MTF, " + i12 + " exceeds " + i5);
                }
            }
            aVar = this;
        }
        aVar.f174325a = i12;
    }

    /* renamed from: a */
    private int m267796a(C69746a aVar) throws IOException {
        return (int) aVar.mo244670a(8);
    }

    /* renamed from: c */
    private static char m267804c(C69746a aVar) throws IOException {
        return (char) m267797a(aVar, 8);
    }

    /* renamed from: d */
    private static int m267806d(C69746a aVar) throws IOException {
        return m267797a(aVar, 32);
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.compress.compressors.b.a$a */
    public static final class C69786a {

        /* renamed from: a */
        final boolean[] f174348a = new boolean[DynamicModule.f58006b];

        /* renamed from: b */
        final byte[] f174349b = new byte[DynamicModule.f58006b];

        /* renamed from: c */
        final byte[] f174350c = new byte[18002];

        /* renamed from: d */
        final byte[] f174351d = new byte[18002];

        /* renamed from: e */
        final int[] f174352e = new int[DynamicModule.f58006b];

        /* renamed from: f */
        final int[][] f174353f = ((int[][]) Array.newInstance(int.class, 6, 258));

        /* renamed from: g */
        final int[][] f174354g = ((int[][]) Array.newInstance(int.class, 6, 258));

        /* renamed from: h */
        final int[][] f174355h = ((int[][]) Array.newInstance(int.class, 6, 258));

        /* renamed from: i */
        final int[] f174356i = new int[6];

        /* renamed from: j */
        final int[] f174357j = new int[257];

        /* renamed from: k */
        final char[] f174358k = new char[DynamicModule.f58006b];

        /* renamed from: l */
        final char[][] f174359l = ((char[][]) Array.newInstance(char.class, 6, 258));

        /* renamed from: m */
        final byte[] f174360m = new byte[6];

        /* renamed from: n */
        int[] f174361n;

        /* renamed from: o */
        byte[] f174362o;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo244834a(int i) {
            int[] iArr = this.f174361n;
            if (iArr != null && iArr.length >= i) {
                return iArr;
            }
            int[] iArr2 = new int[i];
            this.f174361n = iArr2;
            return iArr2;
        }

        C69786a(int i) {
            this.f174362o = new byte[(i * 100000)];
        }
    }

    /* renamed from: b */
    private static boolean m267803b(C69746a aVar) throws IOException {
        if (m267797a(aVar, 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m267801a(boolean z) throws IOException {
        String str;
        C69746a aVar = this.f174331g;
        if (aVar != null) {
            if (!z) {
                aVar.mo244671a();
            }
            int a = m267796a(this.f174331g);
            if (a == -1 && !z) {
                return false;
            }
            int a2 = m267796a(this.f174331g);
            int a3 = m267796a(this.f174331g);
            if (a == 66 && a2 == 90 && a3 == 104) {
                int a4 = m267796a(this.f174331g);
                if (a4 < 49 || a4 > 57) {
                    throw new IOException("BZip2 block size is invalid");
                }
                this.f174327c = a4 - 48;
                this.f174337m = 0;
                return true;
            }
            if (z) {
                str = "Stream is not in the BZip2 format";
            } else {
                str = "Garbage after a valid BZip2 stream";
            }
            throw new IOException(str);
        }
        throw new IOException("No InputStream");
    }

    /* renamed from: a */
    private static int m267797a(C69746a aVar, int i) throws IOException {
        long a = aVar.mo244670a(i);
        if (a >= 0) {
            return (int) a;
        }
        throw new IOException("unexpected end of stream");
    }

    public C69785a(InputStream inputStream, boolean z) throws IOException {
        this.f174331g = new C69746a(inputStream == System.in ? new C69751e(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        this.f174332h = z;
        m267801a(true);
        m267807d();
    }

    /* renamed from: a */
    private void m267798a(int i, int i2) throws IOException {
        C69786a aVar = this.f174347w;
        char[][] cArr = aVar.f174359l;
        int[] iArr = aVar.f174356i;
        int[][] iArr2 = aVar.f174353f;
        int[][] iArr3 = aVar.f174354g;
        int[][] iArr4 = aVar.f174355h;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 32;
            char[] cArr2 = cArr[i3];
            int i5 = i;
            char c = 0;
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                char c2 = cArr2[i5];
                if (c2 > c) {
                    c = c2;
                }
                if (c2 < i4) {
                    i4 = c2;
                }
            }
            m267800a(iArr2[i3], iArr3[i3], iArr4[i3], cArr[i3], i4, c, i);
            iArr[i3] = i4;
        }
    }

    /* renamed from: a */
    private static void m267799a(int i, int i2, String str) throws IOException {
        if (i < 0) {
            throw new IOException("Corrupted input, " + str + " value negative");
        } else if (i >= i2) {
            throw new IOException("Corrupted input, " + str + " value too big");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
            } else if (this.f174331g == null) {
                throw new IOException("stream closed");
            } else if (i2 == 0) {
                return 0;
            } else {
                int i4 = i;
                while (i4 < i3) {
                    int c = m267805c();
                    if (c < 0) {
                        break;
                    }
                    bArr[i4] = (byte) c;
                    mo244818a(1);
                    i4++;
                }
                if (i4 == i) {
                    return -1;
                }
                return i4 - i;
            }
        } else {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
    }

    /* renamed from: a */
    private static void m267800a(int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 <= i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                if (cArr[i7] == i6) {
                    iArr3[i5] = i7;
                    i5++;
                }
            }
        }
        int i8 = 23;
        while (true) {
            i8--;
            if (i8 <= 0) {
                break;
            }
            iArr2[i8] = 0;
            iArr[i8] = 0;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            char c = cArr[i9];
            m267799a(c, 258, "length");
            int i10 = c + 1;
            iArr2[i10] = iArr2[i10] + 1;
        }
        int i11 = iArr2[0];
        for (int i12 = 1; i12 < 23; i12++) {
            i11 += iArr2[i12];
            iArr2[i12] = i11;
        }
        int i13 = iArr2[i];
        int i14 = i;
        while (i14 <= i2) {
            int i15 = i14 + 1;
            int i16 = iArr2[i15];
            int i17 = i4 + (i16 - i13);
            iArr[i14] = i17 - 1;
            i4 = i17 << 1;
            i14 = i15;
            i13 = i16;
        }
        for (int i18 = i + 1; i18 <= i2; i18++) {
            iArr2[i18] = ((iArr[i18 - 1] + 1) << 1) - iArr2[i18];
        }
    }
}
