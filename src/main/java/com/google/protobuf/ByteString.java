package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class ByteString implements Serializable, Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new C23038g(C23115i.f57063c);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final AbstractC23034c byteArrayCopier;
    private int hash;

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.ByteString$c */
    public interface AbstractC23034c {
        /* renamed from: a */
        byte[] mo80032a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.protobuf.ByteString$d */
    public interface AbstractC23035d extends Iterator<Byte> {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.ByteString$g */
    public static class C23038g extends AbstractC23037f {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        /* access modifiers changed from: protected */
        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return C23203x.m84023a(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public final C23108e newCodedInput() {
            return C23108e.m83768a(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        C23038g(byte[] bArr) {
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.ByteString
        public final void writeTo(AbstractC23107d dVar) throws IOException {
            dVar.mo80050a(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C23038g)) {
                return obj.equals(this);
            }
            C23038g gVar = (C23038g) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = gVar.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsRange(gVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString substring(int i, int i2) {
            int checkRange = checkRange(i, i2, size());
            if (checkRange == 0) {
                return ByteString.EMPTY;
            }
            return new C23033b(this.bytes, getOffsetIntoBytes() + i, checkRange);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final int partialHash(int i, int i2, int i3) {
            return C23115i.m83807a(i, this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            return C23203x.m84019a(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.ByteString.AbstractC23037f
        public final boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
                } else if (!(byteString instanceof C23038g)) {
                    return byteString.substring(i, i3).equals(substring(0, i2));
                } else {
                    C23038g gVar = (C23038g) byteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = gVar.bytes;
                    int offsetIntoBytes = getOffsetIntoBytes() + i2;
                    int offsetIntoBytes2 = getOffsetIntoBytes();
                    int offsetIntoBytes3 = gVar.getOffsetIntoBytes() + i;
                    while (offsetIntoBytes2 < offsetIntoBytes) {
                        if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                            return false;
                        }
                        offsetIntoBytes2++;
                        offsetIntoBytes3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public abstract void copyTo(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    public abstract int getTreeDepth();

    /* access modifiers changed from: protected */
    public abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract C23108e newCodedInput();

    public abstract InputStream newInput();

    /* access modifiers changed from: protected */
    public abstract int partialHash(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public abstract int size();

    public abstract ByteString substring(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String toStringInternal(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void writeTo(AbstractC23107d dVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    /* renamed from: com.google.protobuf.ByteString$a */
    private static final class C23032a implements AbstractC23034c {
        private C23032a() {
        }

        @Override // com.google.protobuf.ByteString.AbstractC23034c
        /* renamed from: a */
        public byte[] mo80032a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.ByteString$b */
    public static final class C23033b extends C23038g {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString.C23038g
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString, com.google.protobuf.ByteString.C23038g
        public int size() {
            return this.bytesLength;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString, com.google.protobuf.ByteString.C23038g
        public byte byteAt(int i) {
            checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        C23033b(byte[] bArr, int i, int i2) {
            super(bArr);
            checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString, com.google.protobuf.ByteString.C23038g
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$e */
    static final class C23036e {

        /* renamed from: a */
        private final CodedOutputStream f56895a;

        /* renamed from: b */
        private final byte[] f56896b;

        /* renamed from: b */
        public CodedOutputStream mo80036b() {
            return this.f56895a;
        }

        /* renamed from: a */
        public ByteString mo80035a() {
            this.f56895a.mo80051b();
            return new C23038g(this.f56896b);
        }

        private C23036e(int i) {
            byte[] bArr = new byte[i];
            this.f56896b = bArr;
            this.f56895a = CodedOutputStream.m83526a(bArr);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$f */
    static abstract class AbstractC23037f extends ByteString {
        /* access modifiers changed from: package-private */
        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        AbstractC23037f() {
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return ByteString.super.iterator();
        }
    }

    /* renamed from: com.google.protobuf.ByteString$i */
    private static final class C23040i implements AbstractC23034c {
        private C23040i() {
        }

        @Override // com.google.protobuf.ByteString.AbstractC23034c
        /* renamed from: a */
        public byte[] mo80032a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    ByteString() {
    }

    /* access modifiers changed from: protected */
    public final int peekCachedHashCode() {
        return this.hash;
    }

    public static C23039h newOutput() {
        return new C23039h(128);
    }

    /* Return type fixed from 'com.google.protobuf.ByteString$d' to match base method */
    @Override // java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new AbstractC23035d() {
            /* class com.google.protobuf.ByteString.C230311 */

            /* renamed from: b */
            private int f56893b;

            /* renamed from: c */
            private final int f56894c;

            public void remove() {
                throw new UnsupportedOperationException();
            }

            /* renamed from: a */
            public Byte next() {
                return Byte.valueOf(mo80028b());
            }

            public boolean hasNext() {
                if (this.f56893b < this.f56894c) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public byte mo80028b() {
                try {
                    ByteString byteString = ByteString.this;
                    int i = this.f56893b;
                    this.f56893b = i + 1;
                    return byteString.byteAt(i);
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }

            {
                this.f56894c = ByteString.this.size();
            }
        };
    }

    public final String toStringUtf8() {
        return toString(C23115i.f57061a);
    }

    /* renamed from: com.google.protobuf.ByteString$h */
    public static final class C23039h extends OutputStream {

        /* renamed from: a */
        private static final byte[] f56897a = new byte[0];

        /* renamed from: b */
        private final int f56898b;

        /* renamed from: c */
        private final ArrayList<ByteString> f56899c;

        /* renamed from: d */
        private int f56900d;

        /* renamed from: e */
        private byte[] f56901e;

        /* renamed from: f */
        private int f56902f;

        /* renamed from: a */
        public synchronized int mo80038a() {
            return this.f56900d + this.f56902f;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo80038a()));
        }

        C23039h(int i) {
            if (i >= 0) {
                this.f56898b = i;
                this.f56899c = new ArrayList<>();
                this.f56901e = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            if (this.f56902f == this.f56901e.length) {
                m83519a(1);
            }
            byte[] bArr = this.f56901e;
            int i2 = this.f56902f;
            this.f56902f = i2 + 1;
            bArr[i2] = (byte) i;
        }

        /* renamed from: a */
        private void m83519a(int i) {
            this.f56899c.add(new C23038g(this.f56901e));
            int length = this.f56900d + this.f56901e.length;
            this.f56900d = length;
            this.f56901e = new byte[Math.max(this.f56898b, Math.max(i, length >>> 1))];
            this.f56902f = 0;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f56901e;
            int length = bArr2.length;
            int i3 = this.f56902f;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f56902f += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m83519a(i4);
                System.arraycopy(bArr, i + length2, this.f56901e, 0, i4);
                this.f56902f = i4;
            }
        }
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C23115i.f57063c;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    static {
        AbstractC23034c cVar;
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            cVar = new C23040i();
        } else {
            cVar = new C23032a();
        }
        byteArrayCopier = cVar;
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    static C23036e newCodedBuilder(int i) {
        return new C23036e(i);
    }

    static ByteString wrap(byte[] bArr) {
        return new C23038g(bArr);
    }

    public static ByteString copyFromUtf8(String str) {
        return new C23038g(str.getBytes(C23115i.f57061a));
    }

    public static C23039h newOutput(int i) {
        return new C23039h(i);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, MAX_READ_FROM_CHUNK_SIZE);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public final String toString(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return toStringInternal(charset);
    }

    public final boolean startsWith(ByteString byteString) {
        if (size() < byteString.size() || !substring(0, byteString.size()).equals(byteString)) {
            return false;
        }
        return true;
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), i);
    }

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return C23132s.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public final boolean endsWith(ByteString byteString) {
        if (size() < byteString.size() || !substring(size() - byteString.size()).equals(byteString)) {
            return false;
        }
        return true;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new C23038g(str.getBytes(str2));
    }

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new C23038g(str.getBytes(charset));
    }

    private static ByteString readChunk(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C23038g(bArr);
    }

    static ByteString wrap(byte[] bArr, int i, int i2) {
        return new C23033b(bArr, i, i2);
    }

    /* access modifiers changed from: package-private */
    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(inputStream, i);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i = Math.min(i * 2, i2);
        }
    }

    static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        return new C23038g(byteArrayCopier.mo80032a(bArr, i, i2));
    }

    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }
}
