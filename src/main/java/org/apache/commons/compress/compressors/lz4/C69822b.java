package org.apache.commons.compress.compressors.lz4;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.commons.compress.compressors.AbstractC69784b;
import org.apache.commons.compress.compressors.lz77support.C69835b;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.p3493a.C69748c;

/* renamed from: org.apache.commons.compress.compressors.lz4.b */
public class C69822b extends AbstractC69784b {

    /* renamed from: a */
    private final LZ77Compressor f174489a;

    /* renamed from: b */
    private final OutputStream f174490b;

    /* renamed from: c */
    private final byte[] f174491c = new byte[1];

    /* renamed from: d */
    private boolean f174492d;

    /* renamed from: e */
    private Deque<C69825a> f174493e = new LinkedList();

    /* renamed from: f */
    private Deque<byte[]> f174494f = new LinkedList();

    /* access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.compress.compressors.lz4.b$a */
    public static final class C69825a {

        /* renamed from: a */
        private final Deque<byte[]> f174497a = new LinkedList();

        /* renamed from: b */
        private int f174498b;

        /* renamed from: c */
        private int f174499c;

        /* renamed from: d */
        private boolean f174500d;

        /* renamed from: a */
        private static int m267941a(int i, int i2) {
            int i3 = 15;
            if (i >= 15) {
                i = 15;
            }
            if (i2 < 4) {
                i3 = 0;
            } else if (i2 < 19) {
                i3 = i2 - 4;
            }
            return (i << 4) | i3;
        }

        /* renamed from: c */
        public boolean mo244943c() {
            return this.f174500d;
        }

        /* renamed from: d */
        public int mo244944d() {
            return this.f174499c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo244941b() {
            return m267943e() + this.f174499c;
        }

        C69825a() {
        }

        /* renamed from: e */
        private int m267943e() {
            int i = 0;
            for (byte[] bArr : this.f174497a) {
                i += bArr.length;
            }
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo244938a() {
            if (this.f174498b > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo244937a(byte[] bArr) {
            this.f174497a.addFirst(bArr);
        }

        /* renamed from: b */
        public C69825a mo244942b(int i) {
            C69825a aVar = new C69825a();
            aVar.f174497a.addAll(this.f174497a);
            aVar.f174498b = this.f174498b;
            aVar.f174499c = i;
            return aVar;
        }

        /* renamed from: a */
        public void mo244935a(C69825a aVar) {
            Iterator<byte[]> descendingIterator = this.f174497a.descendingIterator();
            while (descendingIterator.hasNext()) {
                aVar.mo244937a(descendingIterator.next());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo244934a(OutputStream outputStream) throws IOException {
            int e = m267943e();
            outputStream.write(m267941a(e, this.f174499c));
            if (e >= 15) {
                m267942a(e - 15, outputStream);
            }
            for (byte[] bArr : this.f174497a) {
                outputStream.write(bArr);
            }
            if (mo244938a()) {
                C69748c.m267714a(outputStream, (long) this.f174498b, 2);
                int i = this.f174499c;
                if (i - 4 >= 15) {
                    m267942a((i - 4) - 15, outputStream);
                }
            }
            this.f174500d = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo244936a(LZ77Compressor.C69829a aVar) {
            if (!mo244938a()) {
                this.f174498b = aVar.mo244957a();
                this.f174499c = aVar.mo244958b();
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo244939a(int i) {
            if (!mo244938a() || i < 16) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] mo244940a(LZ77Compressor.C69832d dVar) {
            byte[] copyOfRange = Arrays.copyOfRange(dVar.mo244960a(), dVar.mo244961b(), dVar.mo244961b() + dVar.mo244962d());
            this.f174497a.add(copyOfRange);
            return copyOfRange;
        }

        /* renamed from: a */
        private static void m267942a(int i, OutputStream outputStream) throws IOException {
            while (i >= 255) {
                outputStream.write(255);
                i -= 255;
            }
            outputStream.write(i);
        }
    }

    /* renamed from: d */
    private void m267931d() {
        m267932e();
        m267933f();
    }

    /* renamed from: a */
    public void mo244925a() throws IOException {
        if (!this.f174492d) {
            this.f174489a.mo244953a();
            this.f174492d = true;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            mo244925a();
        } finally {
            this.f174490b.close();
        }
    }

    /* renamed from: c */
    public static C69835b.C69837a m267930c() {
        return C69835b.m268009a(65536).mo244983a(4).mo244985b(65535).mo244986c(65535).mo244987d(65535);
    }

    /* renamed from: org.apache.commons.compress.compressors.lz4.b$2 */
    static /* synthetic */ class C698242 {

        /* renamed from: a */
        static final /* synthetic */ int[] f174496a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType[] r0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.compressors.lz4.C69822b.C698242.f174496a = r0
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.apache.commons.compress.compressors.lz4.C69822b.C698242.f174496a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.apache.commons.compress.compressors.lz4.C69822b.C698242.f174496a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.apache.commons.compress.compressors.lz77support.LZ77Compressor$Block$BlockType r1 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.lz4.C69822b.C698242.<clinit>():void");
        }
    }

    /* renamed from: e */
    private void m267932e() {
        int i = 0;
        int i2 = 0;
        for (byte[] bArr : this.f174494f) {
            i++;
            i2 += bArr.length;
            if (i2 >= 65536) {
                break;
            }
        }
        int size = this.f174494f.size();
        while (i < size) {
            this.f174494f.removeLast();
            i++;
        }
    }

    /* renamed from: f */
    private void m267933f() {
        Iterator<C69825a> descendingIterator = this.f174493e.descendingIterator();
        int i = 0;
        int i2 = 0;
        while (descendingIterator.hasNext()) {
            i++;
            i2 += descendingIterator.next().mo244941b();
            if (i2 >= 65536) {
                break;
            }
        }
        int size = this.f174493e.size();
        while (i < size && this.f174493e.peekFirst().mo244943c()) {
            this.f174493e.removeFirst();
            i++;
        }
    }

    /* renamed from: b */
    public void mo244929b() throws IOException {
        m267934g();
        for (C69825a aVar : this.f174493e) {
            if (!aVar.mo244943c()) {
                aVar.mo244934a(this.f174490b);
            }
        }
        this.f174493e.clear();
    }

    /* renamed from: g */
    private void m267934g() {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Iterator<C69825a> descendingIterator = this.f174493e.descendingIterator();
        int i = 0;
        int i2 = 0;
        while (descendingIterator.hasNext()) {
            C69825a next = descendingIterator.next();
            if (next.mo244943c()) {
                break;
            }
            int b = next.mo244941b();
            linkedList2.addFirst(Integer.valueOf(b));
            linkedList.addFirst(next);
            i2 += b;
            if (i2 >= 12) {
                break;
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f174493e.remove((C69825a) it.next());
        }
        int size = linkedList.size();
        int i3 = 0;
        for (int i4 = 1; i4 < size; i4++) {
            i3 += ((Integer) linkedList2.get(i4)).intValue();
        }
        C69825a aVar = new C69825a();
        if (i3 > 0) {
            aVar.mo244937a(m267926a(i3, i3));
        }
        C69825a aVar2 = (C69825a) linkedList.get(0);
        int i5 = 12 - i3;
        if (aVar2.mo244938a()) {
            i = aVar2.mo244944d();
        }
        if (!aVar2.mo244938a() || i < i5 + 4) {
            if (aVar2.mo244938a()) {
                aVar.mo244937a(m267926a(i3 + i, i));
            }
            aVar2.mo244935a(aVar);
        } else {
            aVar.mo244937a(m267926a(i3 + i5, i5));
            this.f174493e.add(aVar2.mo244942b(i - i5));
        }
        this.f174493e.add(aVar);
    }

    /* renamed from: a */
    private void m267925a(byte[] bArr) {
        this.f174494f.addFirst(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f174491c;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    /* renamed from: a */
    private C69825a m267924a(int i) throws IOException {
        m267927b(i);
        C69825a peekLast = this.f174493e.peekLast();
        if (peekLast != null && !peekLast.mo244938a()) {
            return peekLast;
        }
        C69825a aVar = new C69825a();
        this.f174493e.addLast(aVar);
        return aVar;
    }

    /* renamed from: b */
    private void m267928b(LZ77Compressor.C69829a aVar) {
        this.f174494f.addFirst(m267926a(aVar.mo244957a(), aVar.mo244958b()));
    }

    /* renamed from: b */
    private void m267927b(int i) throws IOException {
        Iterator<C69825a> descendingIterator = this.f174493e.descendingIterator();
        while (descendingIterator.hasNext()) {
            C69825a next = descendingIterator.next();
            if (next.mo244943c()) {
                break;
            }
            i += next.mo244941b();
        }
        for (C69825a aVar : this.f174493e) {
            if (!aVar.mo244943c()) {
                i -= aVar.mo244941b();
                if (aVar.mo244939a(i)) {
                    aVar.mo244934a(this.f174490b);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo244926a(LZ77Compressor.C69829a aVar) throws IOException {
        m267924a(aVar.mo244958b()).mo244936a(aVar);
        m267928b(aVar);
        m267931d();
    }

    /* renamed from: a */
    public void mo244927a(LZ77Compressor.C69832d dVar) throws IOException {
        m267925a(m267924a(dVar.mo244962d()).mo244940a(dVar));
        m267931d();
    }

    public C69822b(OutputStream outputStream, C69835b bVar) throws IOException {
        this.f174490b = outputStream;
        this.f174489a = new LZ77Compressor(bVar, new LZ77Compressor.AbstractC69830b() {
            /* class org.apache.commons.compress.compressors.lz4.C69822b.C698231 */

            @Override // org.apache.commons.compress.compressors.lz77support.LZ77Compressor.AbstractC69830b
            /* renamed from: a */
            public void mo244933a(LZ77Compressor.Block block) throws IOException {
                int i = C698242.f174496a[block.mo244956c().ordinal()];
                if (i == 1) {
                    C69822b.this.mo244927a((LZ77Compressor.C69832d) block);
                } else if (i == 2) {
                    C69822b.this.mo244926a((LZ77Compressor.C69829a) block);
                } else if (i == 3) {
                    C69822b.this.mo244929b();
                }
            }
        });
    }

    /* renamed from: a */
    private byte[] m267926a(int i, int i2) {
        byte[] bArr = new byte[i2];
        if (i == 1) {
            byte[] peekFirst = this.f174494f.peekFirst();
            byte b = peekFirst[peekFirst.length - 1];
            if (b != 0) {
                Arrays.fill(bArr, b);
            }
        } else {
            m267929b(bArr, i, i2);
        }
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f174489a.mo244955a(bArr, i, i2);
    }

    /* renamed from: b */
    private void m267929b(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = 0;
        while (i2 > 0) {
            byte[] bArr2 = null;
            if (i5 > 0) {
                Iterator<byte[]> it = this.f174494f.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    byte[] next = it.next();
                    if (next.length + i7 >= i5) {
                        bArr2 = next;
                        break;
                    }
                    i7 += next.length;
                }
                if (bArr2 != null) {
                    i3 = (i7 + bArr2.length) - i5;
                    i4 = Math.min(i2, bArr2.length - i3);
                } else {
                    throw new IllegalStateException("failed to find a block containing offset " + i);
                }
            } else {
                i3 = -i5;
                i4 = Math.min(i2, i6 + i5);
                bArr2 = bArr;
            }
            System.arraycopy(bArr2, i3, bArr, i6, i4);
            i5 -= i4;
            i2 -= i4;
            i6 += i4;
        }
    }

    /* renamed from: a */
    public void mo244928a(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
            this.f174489a.mo244954a(copyOfRange);
            m267925a(copyOfRange);
        }
    }
}
