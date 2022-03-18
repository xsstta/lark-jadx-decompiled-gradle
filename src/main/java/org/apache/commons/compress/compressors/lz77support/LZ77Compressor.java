package org.apache.commons.compress.compressors.lz77support;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class LZ77Compressor {

    /* renamed from: a */
    private static final Block f174524a = new C69831c();

    /* renamed from: b */
    private final C69835b f174525b;

    /* renamed from: c */
    private final AbstractC69830b f174526c;

    /* renamed from: d */
    private final byte[] f174527d;

    /* renamed from: e */
    private final int[] f174528e;

    /* renamed from: f */
    private final int[] f174529f;

    /* renamed from: g */
    private final int f174530g;

    /* renamed from: h */
    private boolean f174531h;

    /* renamed from: i */
    private int f174532i;

    /* renamed from: j */
    private int f174533j;

    /* renamed from: k */
    private int f174534k;

    /* renamed from: l */
    private int f174535l;

    /* renamed from: m */
    private int f174536m = -1;

    /* renamed from: n */
    private int f174537n;

    public static abstract class Block {

        public enum BlockType {
            LITERAL,
            BACK_REFERENCE,
            EOD
        }

        /* renamed from: c */
        public abstract BlockType mo244956c();
    }

    /* renamed from: org.apache.commons.compress.compressors.lz77support.LZ77Compressor$b */
    public interface AbstractC69830b {
        /* renamed from: a */
        void mo244933a(Block block) throws IOException;
    }

    /* renamed from: a */
    private int m267973a(int i, byte b) {
        return ((i << 5) ^ (b & 255)) & 32767;
    }

    /* renamed from: org.apache.commons.compress.compressors.lz77support.LZ77Compressor$a */
    public static final class C69829a extends Block {

        /* renamed from: a */
        private final int f174538a;

        /* renamed from: b */
        private final int f174539b;

        /* renamed from: a */
        public int mo244957a() {
            return this.f174538a;
        }

        /* renamed from: b */
        public int mo244958b() {
            return this.f174539b;
        }

        @Override // org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block
        /* renamed from: c */
        public Block.BlockType mo244956c() {
            return Block.BlockType.BACK_REFERENCE;
        }

        public String toString() {
            return "BackReference with offset " + this.f174538a + " and length " + this.f174539b;
        }

        public C69829a(int i, int i2) {
            this.f174538a = i;
            this.f174539b = i2;
        }
    }

    /* renamed from: org.apache.commons.compress.compressors.lz77support.LZ77Compressor$c */
    public static final class C69831c extends Block {
        @Override // org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block
        /* renamed from: c */
        public Block.BlockType mo244956c() {
            return Block.BlockType.EOD;
        }
    }

    /* renamed from: org.apache.commons.compress.compressors.lz77support.LZ77Compressor$d */
    public static final class C69832d extends Block {

        /* renamed from: a */
        private final byte[] f174540a;

        /* renamed from: b */
        private final int f174541b;

        /* renamed from: c */
        private final int f174542c;

        /* renamed from: a */
        public byte[] mo244960a() {
            return this.f174540a;
        }

        /* renamed from: b */
        public int mo244961b() {
            return this.f174541b;
        }

        @Override // org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block
        /* renamed from: c */
        public Block.BlockType mo244956c() {
            return Block.BlockType.LITERAL;
        }

        /* renamed from: d */
        public int mo244962d() {
            return this.f174542c;
        }

        public String toString() {
            return "LiteralBlock starting at " + this.f174541b + " with length " + this.f174542c;
        }

        public C69832d(byte[] bArr, int i, int i2) {
            this.f174540a = bArr;
            this.f174541b = i;
            this.f174542c = i2;
        }
    }

    /* renamed from: e */
    private void m267982e() {
        while (true) {
            int i = this.f174537n;
            if (i > 0) {
                int i2 = this.f174532i;
                this.f174537n = i - 1;
                m267972a(i2 - i);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m267977c() {
        for (int i = 0; i < 2; i++) {
            this.f174534k = m267973a(this.f174534k, this.f174527d[i]);
        }
        this.f174531h = true;
    }

    /* renamed from: f */
    private void m267983f() throws IOException {
        AbstractC69830b bVar = this.f174526c;
        byte[] bArr = this.f174527d;
        int i = this.f174535l;
        bVar.mo244933a(new C69832d(bArr, i, this.f174532i - i));
    }

    /* renamed from: a */
    public void mo244953a() throws IOException {
        int i = this.f174535l;
        int i2 = this.f174532i;
        if (i != i2 || this.f174533j > 0) {
            this.f174532i = i2 + this.f174533j;
            m267983f();
        }
        this.f174526c.mo244933a(f174524a);
    }

    /* renamed from: b */
    private void m267975b() throws IOException {
        int i;
        int a = this.f174525b.mo244974a();
        int i2 = this.f174535l;
        if (i2 != this.f174532i && i2 < a) {
            m267983f();
            this.f174535l = this.f174532i;
        }
        byte[] bArr = this.f174527d;
        System.arraycopy(bArr, a, bArr, 0, a);
        this.f174532i -= a;
        this.f174536m -= a;
        this.f174535l -= a;
        int i3 = 0;
        while (true) {
            int i4 = -1;
            if (i3 >= 32768) {
                break;
            }
            int[] iArr = this.f174528e;
            int i5 = iArr[i3];
            if (i5 >= a) {
                i4 = i5 - a;
            }
            iArr[i3] = i4;
            i3++;
        }
        for (int i6 = 0; i6 < a; i6++) {
            int[] iArr2 = this.f174529f;
            int i7 = iArr2[i6];
            if (i7 >= a) {
                i = i7 - a;
            } else {
                i = -1;
            }
            iArr2[i6] = i;
        }
    }

    /* renamed from: d */
    private void m267979d() throws IOException {
        int b = this.f174525b.mo244975b();
        boolean h = this.f174525b.mo244981h();
        int i = this.f174525b.mo244982i();
        while (this.f174533j >= b) {
            m267982e();
            int i2 = 0;
            int a = m267972a(this.f174532i);
            if (a != -1 && a - this.f174532i <= this.f174525b.mo244977d()) {
                i2 = m267981e(a);
                if (h && i2 <= i && this.f174533j > b) {
                    i2 = m267974b(i2);
                }
            }
            if (i2 >= b) {
                if (this.f174535l != this.f174532i) {
                    m267983f();
                    this.f174535l = -1;
                }
                m267980d(i2);
                m267978c(i2);
                this.f174533j -= i2;
                int i3 = this.f174532i + i2;
                this.f174532i = i3;
                this.f174535l = i3;
            } else {
                this.f174533j--;
                int i4 = this.f174532i + 1;
                this.f174532i = i4;
                if (i4 - this.f174535l >= this.f174525b.mo244978e()) {
                    m267983f();
                    this.f174535l = this.f174532i;
                }
            }
        }
    }

    /* renamed from: d */
    private void m267980d(int i) throws IOException {
        this.f174526c.mo244933a(new C69829a(this.f174532i - this.f174536m, i));
    }

    /* renamed from: a */
    private int m267972a(int i) {
        int a = m267973a(this.f174534k, this.f174527d[(i - 1) + 3]);
        this.f174534k = a;
        int[] iArr = this.f174528e;
        int i2 = iArr[a];
        this.f174529f[this.f174530g & i] = i2;
        iArr[a] = i;
        return i2;
    }

    /* renamed from: b */
    private int m267974b(int i) {
        int i2 = this.f174536m;
        int i3 = this.f174534k;
        this.f174533j--;
        int i4 = this.f174532i + 1;
        this.f174532i = i4;
        int a = m267972a(i4);
        int i5 = this.f174529f[this.f174532i & this.f174530g];
        int e = m267981e(a);
        if (e > i) {
            return e;
        }
        this.f174536m = i2;
        this.f174528e[this.f174534k] = i5;
        this.f174534k = i3;
        this.f174532i--;
        this.f174533j++;
        return i;
    }

    /* renamed from: c */
    private void m267978c(int i) {
        int min = Math.min(i - 1, this.f174533j - 3);
        for (int i2 = 1; i2 <= min; i2++) {
            m267972a(this.f174532i + i2);
        }
        this.f174537n = (i - min) - 1;
    }

    /* renamed from: e */
    private int m267981e(int i) {
        int b = this.f174525b.mo244975b() - 1;
        int min = Math.min(this.f174525b.mo244976c(), this.f174533j);
        int max = Math.max(0, this.f174532i - this.f174525b.mo244977d());
        int min2 = Math.min(min, this.f174525b.mo244979f());
        int g = this.f174525b.mo244980g();
        for (int i2 = 0; i2 < g && i >= max; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < min; i4++) {
                byte[] bArr = this.f174527d;
                if (bArr[i + i4] != bArr[this.f174532i + i4]) {
                    break;
                }
                i3++;
            }
            if (i3 > b) {
                this.f174536m = i;
                b = i3;
                if (i3 >= min2) {
                    break;
                }
            }
            i = this.f174529f[i & this.f174530g];
        }
        return b;
    }

    /* renamed from: a */
    public void mo244954a(byte[] bArr) {
        if (this.f174532i == 0 && this.f174533j == 0) {
            int min = Math.min(this.f174525b.mo244974a(), bArr.length);
            System.arraycopy(bArr, bArr.length - min, this.f174527d, 0, min);
            if (min >= 3) {
                m267977c();
                int i = (min - 3) + 1;
                for (int i2 = 0; i2 < i; i2++) {
                    m267972a(i2);
                }
                this.f174537n = 2;
            } else {
                this.f174537n = min;
            }
            this.f174532i = min;
            this.f174535l = min;
            return;
        }
        throw new IllegalStateException("the compressor has already started to accept data, can't prefill anymore");
    }

    public LZ77Compressor(C69835b bVar, AbstractC69830b bVar2) {
        Objects.requireNonNull(bVar, "params must not be null");
        Objects.requireNonNull(bVar2, "callback must not be null");
        this.f174525b = bVar;
        this.f174526c = bVar2;
        int a = bVar.mo244974a();
        this.f174527d = new byte[(a * 2)];
        this.f174530g = a - 1;
        int[] iArr = new int[32768];
        this.f174528e = iArr;
        Arrays.fill(iArr, -1);
        this.f174529f = new int[a];
    }

    /* renamed from: b */
    private void m267976b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > (this.f174527d.length - this.f174532i) - this.f174533j) {
            m267975b();
        }
        System.arraycopy(bArr, i, this.f174527d, this.f174532i + this.f174533j, i2);
        int i3 = this.f174533j + i2;
        this.f174533j = i3;
        if (!this.f174531h && i3 >= this.f174525b.mo244975b()) {
            m267977c();
        }
        if (this.f174531h) {
            m267979d();
        }
    }

    /* renamed from: a */
    public void mo244955a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f174525b.mo244974a();
        while (i2 > a) {
            m267976b(bArr, i, a);
            i += a;
            i2 -= a;
        }
        if (i2 > 0) {
            m267976b(bArr, i, i2);
        }
    }
}
