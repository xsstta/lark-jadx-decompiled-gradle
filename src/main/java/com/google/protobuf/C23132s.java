package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;

/* access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.s */
public final class C23132s extends ByteString {
    public static final int[] minLengthByDepth;
    private static final long serialVersionUID = 1;
    public final ByteString left;
    private final int leftLength;
    public final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.s$b */
    public static class C23135b implements Iterator<ByteString.AbstractC23037f> {

        /* renamed from: a */
        private final Stack<C23132s> f57077a;

        /* renamed from: b */
        private ByteString.AbstractC23037f f57078b;

        public boolean hasNext() {
            if (this.f57078b != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        private ByteString.AbstractC23037f m83851b() {
            while (!this.f57077a.isEmpty()) {
                ByteString.AbstractC23037f a = m83850a(this.f57077a.pop().right);
                if (!a.isEmpty()) {
                    return a;
                }
            }
            return null;
        }

        /* renamed from: a */
        public ByteString.AbstractC23037f next() {
            ByteString.AbstractC23037f fVar = this.f57078b;
            if (fVar != null) {
                this.f57078b = m83851b();
                return fVar;
            }
            throw new NoSuchElementException();
        }

        private C23135b(ByteString byteString) {
            this.f57077a = new Stack<>();
            this.f57078b = m83850a(byteString);
        }

        /* renamed from: a */
        private ByteString.AbstractC23037f m83850a(ByteString byteString) {
            while (byteString instanceof C23132s) {
                C23132s sVar = (C23132s) byteString;
                this.f57077a.push(sVar);
                byteString = sVar.left;
            }
            return (ByteString.AbstractC23037f) byteString;
        }
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new C23136c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.s$a */
    public static class C23134a {

        /* renamed from: a */
        private final Stack<ByteString> f57076a;

        private C23134a() {
            this.f57076a = new Stack<>();
        }

        /* renamed from: a */
        private int m83846a(int i) {
            int binarySearch = Arrays.binarySearch(C23132s.minLengthByDepth, i);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        /* renamed from: a */
        private void m83847a(ByteString byteString) {
            if (byteString.isBalanced()) {
                m83848b(byteString);
            } else if (byteString instanceof C23132s) {
                C23132s sVar = (C23132s) byteString;
                m83847a(sVar.left);
                m83847a(sVar.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        /* renamed from: b */
        private void m83848b(ByteString byteString) {
            int a = m83846a(byteString.size());
            int i = C23132s.minLengthByDepth[a + 1];
            if (this.f57076a.isEmpty() || this.f57076a.peek().size() >= i) {
                this.f57076a.push(byteString);
                return;
            }
            int i2 = C23132s.minLengthByDepth[a];
            ByteString pop = this.f57076a.pop();
            while (!this.f57076a.isEmpty() && this.f57076a.peek().size() < i2) {
                pop = new C23132s(this.f57076a.pop(), pop);
            }
            C23132s sVar = new C23132s(pop, byteString);
            while (!this.f57076a.isEmpty()) {
                if (this.f57076a.peek().size() >= C23132s.minLengthByDepth[m83846a(sVar.size()) + 1]) {
                    break;
                }
                sVar = new C23132s(this.f57076a.pop(), sVar);
            }
            this.f57076a.push(sVar);
        }

        /* renamed from: a */
        public ByteString mo80301a(ByteString byteString, ByteString byteString2) {
            m83847a(byteString);
            m83847a(byteString2);
            ByteString pop = this.f57076a.pop();
            while (!this.f57076a.isEmpty()) {
                pop = new C23132s(this.f57076a.pop(), pop);
            }
            return pop;
        }
    }

    /* renamed from: com.google.protobuf.s$c */
    private class C23136c extends InputStream {

        /* renamed from: b */
        private C23135b f57080b;

        /* renamed from: c */
        private ByteString.AbstractC23037f f57081c;

        /* renamed from: d */
        private int f57082d;

        /* renamed from: e */
        private int f57083e;

        /* renamed from: f */
        private int f57084f;

        /* renamed from: g */
        private int f57085g;

        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return C23132s.this.size() - (this.f57084f + this.f57083e);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m83854a();
            m83853a(null, 0, this.f57085g);
        }

        /* renamed from: a */
        private void m83854a() {
            C23135b bVar = new C23135b(C23132s.this);
            this.f57080b = bVar;
            ByteString.AbstractC23037f a = bVar.next();
            this.f57081c = a;
            this.f57082d = a.size();
            this.f57083e = 0;
            this.f57084f = 0;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m83855b();
            ByteString.AbstractC23037f fVar = this.f57081c;
            if (fVar == null) {
                return -1;
            }
            int i = this.f57083e;
            this.f57083e = i + 1;
            return fVar.byteAt(i) & 255;
        }

        /* renamed from: b */
        private void m83855b() {
            int i;
            if (this.f57081c != null && this.f57083e == (i = this.f57082d)) {
                this.f57084f += i;
                this.f57083e = 0;
                if (this.f57080b.hasNext()) {
                    ByteString.AbstractC23037f a = this.f57080b.next();
                    this.f57081c = a;
                    this.f57082d = a.size();
                    return;
                }
                this.f57081c = null;
                this.f57082d = 0;
            }
        }

        public void mark(int i) {
            this.f57085g = this.f57084f + this.f57083e;
        }

        public C23136c() {
            m83854a();
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) m83853a(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        private int m83853a(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m83855b();
                if (this.f57081c != null) {
                    int min = Math.min(this.f57082d - this.f57083e, i3);
                    if (bArr != null) {
                        this.f57081c.copyTo(bArr, this.f57083e, i, min);
                        i += min;
                    }
                    this.f57083e += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            Objects.requireNonNull(bArr);
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m83853a(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        if (this.totalLength >= minLengthByDepth[this.treeDepth]) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public C23108e newCodedInput() {
        return C23108e.m83765a(new C23136c());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C23135b bVar = new C23135b(this);
        while (bVar.hasNext()) {
            arrayList.add(bVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0) {
            return true;
        }
        return false;
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        minLengthByDepth = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = minLengthByDepth;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void writeTo(AbstractC23107d dVar) throws IOException {
        this.left.writeTo(dVar);
        this.right.writeTo(dVar);
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        checkIndex(i, this.totalLength);
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.byteAt(i);
        }
        return this.right.byteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
            return m83845a(byteString);
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x001b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x001b */
    /* renamed from: a */
    private boolean m83845a(ByteString byteString) {
        boolean z;
        C23135b bVar = new C23135b(this);
        ByteString.AbstractC23037f fVar = (ByteString.AbstractC23037f) bVar.next();
        C23135b bVar2 = new C23135b(byteString);
        ByteString.AbstractC23037f fVar2 = (ByteString.AbstractC23037f) bVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = fVar.size() - i;
            int size2 = fVar2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = fVar.equalsRange(fVar2, i2, min);
            } else {
                z = fVar2.equalsRange(fVar, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 < i4) {
                if (min == size) {
                    i = 0;
                    fVar = (ByteString.AbstractC23037f) bVar.next();
                } else {
                    i += min;
                    fVar = fVar;
                }
                if (min == size2) {
                    fVar2 = (ByteString.AbstractC23037f) bVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    static C23132s newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new C23132s(byteString, byteString2);
    }

    /* renamed from: a */
    private static ByteString m83844a(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private C23132s(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int checkRange = checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new C23132s(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return m83844a(byteString, byteString2);
        }
        if (byteString instanceof C23132s) {
            C23132s sVar = (C23132s) byteString;
            if (sVar.right.size() + byteString2.size() < 128) {
                return new C23132s(sVar.left, m83844a(sVar.right, byteString2));
            } else if (sVar.left.getTreeDepth() > sVar.right.getTreeDepth() && sVar.getTreeDepth() > byteString2.getTreeDepth()) {
                return new C23132s(sVar.left, new C23132s(sVar.right, byteString2));
            }
        }
        if (size >= minLengthByDepth[Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
            return new C23132s(byteString, byteString2);
        }
        return new C23134a().mo80301a(byteString, byteString2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else if (i >= i4) {
            this.right.writeToInternal(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.right.copyToInternal(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }
}
