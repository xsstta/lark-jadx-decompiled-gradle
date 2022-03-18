package org.apache.commons.compress.compressors.lz4;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.AbstractC69784b;
import org.apache.commons.compress.compressors.lz77support.C69835b;
import org.apache.commons.compress.p3493a.C69748c;

public class FramedLZ4CompressorOutputStream extends AbstractC69784b {

    /* renamed from: a */
    private static final byte[] f174468a = new byte[4];

    /* renamed from: b */
    private final byte[] f174469b;

    /* renamed from: c */
    private final byte[] f174470c;

    /* renamed from: d */
    private final OutputStream f174471d;

    /* renamed from: e */
    private final C69818a f174472e;

    /* renamed from: f */
    private boolean f174473f;

    /* renamed from: g */
    private int f174474g;

    /* renamed from: h */
    private final C69828d f174475h;

    /* renamed from: i */
    private final C69828d f174476i;

    /* renamed from: j */
    private byte[] f174477j;

    /* renamed from: k */
    private int f174478k;

    public enum BlockSize {
        K64(65536, 4),
        K256(262144, 5),
        M1(1048576, 6),
        M4(4194304, 7);
        
        private final int index;
        private final int size;

        /* access modifiers changed from: package-private */
        public int getIndex() {
            return this.index;
        }

        /* access modifiers changed from: package-private */
        public int getSize() {
            return this.size;
        }

        private BlockSize(int i, int i2) {
            this.size = i;
            this.index = i2;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            mo244917a();
        } finally {
            this.f174471d.close();
        }
    }

    /* renamed from: c */
    private void m267919c() throws IOException {
        this.f174471d.write(f174468a);
        if (this.f174472e.f174481b) {
            C69748c.m267714a(this.f174471d, this.f174475h.getValue(), 4);
        }
    }

    /* renamed from: a */
    public void mo244917a() throws IOException {
        if (!this.f174473f) {
            if (this.f174474g > 0) {
                m267918b();
            }
            m267919c();
            this.f174473f = true;
        }
    }

    /* renamed from: org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream$a */
    public static class C69818a {

        /* renamed from: f */
        public static final C69818a f174479f = new C69818a(BlockSize.M4, true, false, false);

        /* renamed from: a */
        public final BlockSize f174480a;

        /* renamed from: b */
        public final boolean f174481b;

        /* renamed from: c */
        public final boolean f174482c;

        /* renamed from: d */
        public final boolean f174483d;

        /* renamed from: e */
        public final C69835b f174484e;

        public String toString() {
            return "LZ4 Parameters with BlockSize " + this.f174480a + ", withContentChecksum " + this.f174481b + ", withBlockChecksum " + this.f174482c + ", withBlockDependency " + this.f174483d;
        }

        public C69818a(BlockSize blockSize, boolean z, boolean z2, boolean z3) {
            this(blockSize, z, z2, z3, C69822b.m267930c().mo244984a());
        }

        public C69818a(BlockSize blockSize, boolean z, boolean z2, boolean z3, C69835b bVar) {
            this.f174480a = blockSize;
            this.f174481b = z;
            this.f174482c = z2;
            this.f174483d = z3;
            this.f174484e = bVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r0.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m267918b() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.m267918b():void");
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f174469b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    /* renamed from: a */
    private void m267917a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f174477j.length);
        if (min > 0) {
            byte[] bArr2 = this.f174477j;
            int length = bArr2.length - min;
            if (length > 0) {
                System.arraycopy(bArr2, min, bArr2, 0, length);
            }
            System.arraycopy(bArr, i, this.f174477j, length, min);
            this.f174478k = Math.min(this.f174478k + min, this.f174477j.length);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f174472e.f174481b) {
            this.f174475h.update(bArr, i, i2);
        }
        if (this.f174474g + i2 > this.f174470c.length) {
            m267918b();
            while (true) {
                byte[] bArr2 = this.f174470c;
                if (i2 <= bArr2.length) {
                    break;
                }
                System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
                byte[] bArr3 = this.f174470c;
                i += bArr3.length;
                i2 -= bArr3.length;
                this.f174474g = bArr3.length;
                m267918b();
            }
        }
        System.arraycopy(bArr, i, this.f174470c, this.f174474g, i2);
        this.f174474g += i2;
    }
}
