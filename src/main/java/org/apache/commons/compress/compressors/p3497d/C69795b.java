package org.apache.commons.compress.compressors.p3497d;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.p3493a.C69746a;

/* access modifiers changed from: package-private */
/* renamed from: org.apache.commons.compress.compressors.d.b */
public class C69795b implements Closeable {

    /* renamed from: a */
    public static final short[] f174382a = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* renamed from: b */
    public static final int[] f174383b = {16, 32, 48, 64, 81, SmEvents.EVENT_RE, 146, 210, 275, 403, TTVideoEngine.PLAYER_OPTION_SUB_LANG_IDS, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* renamed from: f */
    private static final int[] f174384f = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: g */
    private static final int[] f174385g;

    /* renamed from: h */
    private static final int[] f174386h;

    /* renamed from: c */
    public C69746a f174387c;

    /* renamed from: d */
    public final InputStream f174388d;

    /* renamed from: e */
    public final C69799c f174389e = new C69799c();

    /* renamed from: i */
    private boolean f174390i;

    /* renamed from: j */
    private AbstractC69798b f174391j;

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.compress.compressors.d.b$b */
    public static abstract class AbstractC69798b {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo244862a(byte[] bArr, int i, int i2) throws IOException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract EnumC69803c mo244863a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo244864b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo244865c() throws IOException;

        private AbstractC69798b() {
        }
    }

    /* renamed from: org.apache.commons.compress.compressors.d.b$e */
    private class C69801e extends AbstractC69798b {
        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: b */
        public boolean mo244864b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: c */
        public int mo244865c() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: a */
        public EnumC69803c mo244863a() {
            return EnumC69803c.INITIAL;
        }

        private C69801e() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: a */
        public int mo244862a(byte[] bArr, int i, int i2) throws IOException {
            throw new IllegalStateException("Cannot read in this state");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.compress.compressors.d.b$c */
    public static class C69799c {

        /* renamed from: a */
        private final byte[] f174396a;

        /* renamed from: b */
        private final int f174397b;

        /* renamed from: c */
        private int f174398c;

        /* renamed from: d */
        private boolean f174399d;

        private C69799c() {
            this(16);
        }

        private C69799c(int i) {
            byte[] bArr = new byte[(1 << i)];
            this.f174396a = bArr;
            this.f174397b = bArr.length - 1;
        }

        /* renamed from: a */
        private int m267858a(int i) {
            int i2 = (i + 1) & this.f174397b;
            if (!this.f174399d && i2 < i) {
                this.f174399d = true;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo244866a(byte b) {
            byte[] bArr = this.f174396a;
            int i = this.f174398c;
            bArr[i] = b;
            this.f174398c = m267858a(i);
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo244868a(byte[] bArr, int i, int i2) {
            for (int i3 = i; i3 < i + i2; i3++) {
                mo244866a(bArr[i3]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo244867a(int i, int i2, byte[] bArr) {
            if (i <= this.f174396a.length) {
                int i3 = this.f174398c;
                int i4 = (i3 - i) & this.f174397b;
                if (this.f174399d || i4 < i3) {
                    int i5 = 0;
                    while (i5 < i2) {
                        bArr[i5] = mo244866a(this.f174396a[i4]);
                        i5++;
                        i4 = m267858a(i4);
                    }
                    return;
                }
                throw new IllegalStateException("Attempt to read beyond memory: dist=" + i);
            }
            throw new IllegalStateException("Illegal distance parameter: " + i);
        }
    }

    /* renamed from: org.apache.commons.compress.compressors.d.b$d */
    private class C69800d extends AbstractC69798b {

        /* renamed from: b */
        private boolean f174401b;

        /* renamed from: c */
        private final EnumC69803c f174402c;

        /* renamed from: d */
        private final C69797a f174403d;

        /* renamed from: e */
        private final C69797a f174404e;

        /* renamed from: f */
        private int f174405f;

        /* renamed from: g */
        private byte[] f174406g = new byte[0];

        /* renamed from: h */
        private int f174407h;

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: b */
        public boolean mo244864b() {
            return !this.f174401b;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: c */
        public int mo244865c() {
            return this.f174407h - this.f174405f;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: a */
        public EnumC69803c mo244863a() {
            if (this.f174401b) {
                return EnumC69803c.INITIAL;
            }
            return this.f174402c;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: a */
        public int mo244862a(byte[] bArr, int i, int i2) throws IOException {
            return m267862b(bArr, i, i2);
        }

        /* renamed from: c */
        private int m267863c(byte[] bArr, int i, int i2) {
            int i3 = this.f174407h - this.f174405f;
            if (i3 <= 0) {
                return 0;
            }
            int min = Math.min(i2, i3);
            System.arraycopy(this.f174406g, this.f174405f, bArr, i, min);
            this.f174405f += min;
            return min;
        }

        /* renamed from: b */
        private int m267862b(byte[] bArr, int i, int i2) throws IOException {
            if (this.f174401b) {
                return -1;
            }
            int c = m267863c(bArr, i, i2);
            while (true) {
                if (c < i2) {
                    int a = C69795b.m267840a(C69795b.this.f174387c, this.f174403d);
                    if (a >= 256) {
                        if (a <= 256) {
                            this.f174401b = true;
                            break;
                        }
                        short s = C69795b.f174382a[a - 257];
                        int a2 = (int) (((long) (s >>> 5)) + C69795b.this.mo244856a(s & 31));
                        int i3 = C69795b.f174383b[C69795b.m267840a(C69795b.this.f174387c, this.f174404e)];
                        int a3 = (int) (((long) (i3 >>> 4)) + C69795b.this.mo244856a(i3 & 15));
                        if (this.f174406g.length < a2) {
                            this.f174406g = new byte[a2];
                        }
                        this.f174407h = a2;
                        this.f174405f = 0;
                        C69795b.this.f174389e.mo244867a(a3, a2, this.f174406g);
                        c += m267863c(bArr, i + c, i2 - c);
                    } else {
                        bArr[c + i] = C69795b.this.f174389e.mo244866a((byte) a);
                        c++;
                    }
                } else {
                    break;
                }
            }
            return c;
        }

        C69800d(EnumC69803c cVar, int[] iArr, int[] iArr2) {
            super();
            this.f174402c = cVar;
            this.f174403d = C69795b.m267842a(iArr);
            this.f174404e = C69795b.m267842a(iArr2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo244855a() {
        return this.f174387c.mo244676e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo244857b() throws IOException {
        return this.f174391j.mo244865c();
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.compress.compressors.d.b$f */
    public class C69802f extends AbstractC69798b {

        /* renamed from: b */
        private final long f174410b;

        /* renamed from: c */
        private long f174411c;

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: a */
        public EnumC69803c mo244863a() {
            if (this.f174411c < this.f174410b) {
                return EnumC69803c.STORED;
            }
            return EnumC69803c.INITIAL;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: b */
        public boolean mo244864b() {
            if (this.f174411c < this.f174410b) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: c */
        public int mo244865c() throws IOException {
            return (int) Math.min(this.f174410b - this.f174411c, C69795b.this.f174387c.mo244673c() / 8);
        }

        private C69802f(long j) {
            super();
            this.f174410b = j;
        }

        /* access modifiers changed from: package-private */
        @Override // org.apache.commons.compress.compressors.p3497d.C69795b.AbstractC69798b
        /* renamed from: a */
        public int mo244862a(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            int min = (int) Math.min(this.f174410b - this.f174411c, (long) i2);
            int i4 = 0;
            while (i4 < min) {
                if (C69795b.this.f174387c.mo244672b() > 0) {
                    bArr[i + i4] = C69795b.this.f174389e.mo244866a((byte) ((int) C69795b.this.mo244856a(8)));
                    i3 = 1;
                } else {
                    int i5 = i + i4;
                    i3 = C69795b.this.f174388d.read(bArr, i5, min - i4);
                    if (i3 != -1) {
                        C69795b.this.f174389e.mo244868a(bArr, i5, i3);
                    } else {
                        throw new EOFException("Truncated Deflate64 Stream");
                    }
                }
                this.f174411c += (long) i3;
                i4 += i3;
            }
            return min;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f174391j = new C69801e();
        this.f174387c = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: org.apache.commons.compress.compressors.d.b$a */
    public static class C69797a {

        /* renamed from: a */
        int f174392a;

        /* renamed from: b */
        C69797a f174393b;

        /* renamed from: c */
        C69797a f174394c;

        /* renamed from: d */
        private final int f174395d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C69797a mo244859a() {
            if (this.f174393b == null && this.f174392a == -1) {
                this.f174393b = new C69797a(this.f174395d + 1);
            }
            return this.f174393b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C69797a mo244861b() {
            if (this.f174394c == null && this.f174392a == -1) {
                this.f174394c = new C69797a(this.f174395d + 1);
            }
            return this.f174394c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo244860a(int i) {
            this.f174392a = i;
            this.f174393b = null;
            this.f174394c = null;
        }

        private C69797a(int i) {
            this.f174392a = -1;
            this.f174395d = i;
        }
    }

    /* renamed from: c */
    private void m267845c() throws IOException {
        this.f174387c.mo244675d();
        long a = mo244856a(16);
        if ((65535 & (a ^ 65535)) == mo244856a(16)) {
            this.f174391j = new C69802f(a);
            return;
        }
        throw new IllegalStateException("Illegal LEN / NLEN values");
    }

    /* renamed from: d */
    private int[][] m267846d() throws IOException {
        int[][] iArr = {new int[((int) (mo244856a(5) + 257))], new int[((int) (mo244856a(5) + 1))]};
        m267843a(this.f174387c, iArr[0], iArr[1]);
        return iArr;
    }

    static {
        int[] iArr = new int[288];
        f174385g = iArr;
        Arrays.fill(iArr, 0, (int) SmEvents.EVENT_UA_SUCCESS, 8);
        Arrays.fill(iArr, (int) SmEvents.EVENT_UA_SUCCESS, (int) DynamicModule.f58006b, 9);
        Arrays.fill(iArr, (int) DynamicModule.f58006b, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f174386h = iArr2;
        Arrays.fill(iArr2, 5);
    }

    /* renamed from: a */
    public long mo244856a(int i) throws IOException {
        return m267841a(this.f174387c, i);
    }

    C69795b(InputStream inputStream) {
        this.f174387c = new C69746a(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.f174388d = inputStream;
        this.f174391j = new C69801e();
    }

    /* renamed from: b */
    private static int[] m267844b(int[] iArr) {
        int[] iArr2 = new int[65];
        int i = 0;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
            iArr2[i2] = iArr2[i2] + 1;
        }
        int i3 = i + 1;
        int[] copyOf = Arrays.copyOf(iArr2, i3);
        int[] iArr3 = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 <= i; i5++) {
            i4 = (i4 + copyOf[i5]) << 1;
            iArr3[i5] = i4;
        }
        return iArr3;
    }

    /* renamed from: a */
    public static C69797a m267842a(int[] iArr) {
        int[] b = m267844b(iArr);
        C69797a aVar = new C69797a(0);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                int i3 = i2 - 1;
                int i4 = b[i3];
                C69797a aVar2 = aVar;
                for (int i5 = i3; i5 >= 0; i5--) {
                    if (((1 << i5) & i4) == 0) {
                        aVar2 = aVar2.mo244859a();
                    } else {
                        aVar2 = aVar2.mo244861b();
                    }
                }
                aVar2.mo244860a(i);
                b[i3] = b[i3] + 1;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static int m267840a(C69746a aVar, C69797a aVar2) throws IOException {
        while (aVar2 != null && aVar2.f174392a == -1) {
            if (m267841a(aVar, 1) == 0) {
                aVar2 = aVar2.f174393b;
            } else {
                aVar2 = aVar2.f174394c;
            }
        }
        if (aVar2 != null) {
            return aVar2.f174392a;
        }
        return -1;
    }

    /* renamed from: a */
    private static long m267841a(C69746a aVar, int i) throws IOException {
        long a = aVar.mo244670a(i);
        if (a != -1) {
            return a;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    /* renamed from: a */
    private static void m267843a(C69746a aVar, int[] iArr, int[] iArr2) throws IOException {
        long a;
        int a2 = (int) (m267841a(aVar, 4) + 4);
        int[] iArr3 = new int[19];
        for (int i = 0; i < a2; i++) {
            iArr3[f174384f[i]] = (int) m267841a(aVar, 3);
        }
        C69797a a3 = m267842a(iArr3);
        int length = iArr.length + iArr2.length;
        int[] iArr4 = new int[length];
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            if (i4 > 0) {
                iArr4[i3] = i2;
                i4--;
                i3++;
            } else {
                int a4 = m267840a(aVar, a3);
                if (a4 < 16) {
                    iArr4[i3] = a4;
                    i3++;
                    i2 = a4;
                } else if (a4 == 16) {
                    i4 = (int) (m267841a(aVar, 2) + 3);
                } else {
                    if (a4 == 17) {
                        a = m267841a(aVar, 3) + 3;
                    } else if (a4 == 18) {
                        a = m267841a(aVar, 7) + 11;
                    }
                    i4 = (int) a;
                    i2 = 0;
                }
            }
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr.length);
        System.arraycopy(iArr4, iArr.length, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    public int mo244854a(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        while (true) {
            if (this.f174390i && !this.f174391j.mo244864b()) {
                return -1;
            }
            if (this.f174391j.mo244863a() != EnumC69803c.INITIAL) {
                return this.f174391j.mo244862a(bArr, i, i2);
            }
            if (mo244856a(1) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f174390i = z;
            int a = (int) mo244856a(2);
            if (a == 0) {
                m267845c();
            } else if (a == 1) {
                this.f174391j = new C69800d(EnumC69803c.FIXED_CODES, f174385g, f174386h);
            } else if (a == 2) {
                int[][] d = m267846d();
                this.f174391j = new C69800d(EnumC69803c.DYNAMIC_CODES, d[0], d[1]);
            } else {
                throw new IllegalStateException("Unsupported compression: " + a);
            }
        }
    }
}
