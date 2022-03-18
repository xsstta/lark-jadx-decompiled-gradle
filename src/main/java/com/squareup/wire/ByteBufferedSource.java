package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.AbstractC69699e;
import okio.AbstractC69722t;
import okio.ByteString;
import okio.C69694c;
import okio.C69710l;
import okio.C69724v;

public class ByteBufferedSource implements AbstractC69699e {
    static Charset UTF8 = Charset.forName("UTF-8");
    int position;
    byte[] source;

    static int reverseBytesInt(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    static long reverseBytesLong(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // okio.AbstractC69699e
    public C69694c buffer() {
        return null;
    }

    @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
    }

    @Override // okio.AbstractC69699e
    public C69694c getBuffer() {
        return null;
    }

    @Override // okio.AbstractC69699e
    public long indexOf(byte b) throws IOException {
        return 0;
    }

    public long indexOf(byte b, long j) throws IOException {
        return 0;
    }

    public long indexOf(byte b, long j, long j2) throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public long indexOf(ByteString byteString) throws IOException {
        return 0;
    }

    public long indexOf(ByteString byteString, long j) throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public long indexOfElement(ByteString byteString) throws IOException {
        return 0;
    }

    public long indexOfElement(ByteString byteString, long j) throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public InputStream inputStream() {
        return null;
    }

    public boolean isOpen() {
        return false;
    }

    public AbstractC69699e peek() {
        return null;
    }

    @Override // okio.AbstractC69699e
    public boolean rangeEquals(long j, ByteString byteString) throws IOException {
        return false;
    }

    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) throws IOException {
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return 0;
    }

    public int read(byte[] bArr) throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69723u
    public long read(C69694c cVar, long j) throws IOException {
        return 0;
    }

    public long readAll(AbstractC69722t tVar) throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public byte[] readByteArray() throws IOException {
        return new byte[0];
    }

    @Override // okio.AbstractC69699e
    public ByteString readByteString() throws IOException {
        return null;
    }

    @Override // okio.AbstractC69699e
    public long readDecimalLong() throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public void readFully(C69694c cVar, long j) throws IOException {
    }

    @Override // okio.AbstractC69699e
    public void readFully(byte[] bArr) throws IOException {
    }

    @Override // okio.AbstractC69699e
    public long readHexadecimalUnsignedLong() throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public short readShort() throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69699e
    public short readShortLe() throws IOException {
        return 0;
    }

    public String readString(long j, Charset charset) throws IOException {
        return null;
    }

    @Override // okio.AbstractC69699e
    public String readString(Charset charset) throws IOException {
        return null;
    }

    public String readUtf8() throws IOException {
        return null;
    }

    public int readUtf8CodePoint() throws IOException {
        return 0;
    }

    public String readUtf8Line() throws IOException {
        return null;
    }

    @Override // okio.AbstractC69699e
    public String readUtf8LineStrict() throws IOException {
        return null;
    }

    @Override // okio.AbstractC69699e
    public String readUtf8LineStrict(long j) throws IOException {
        return null;
    }

    @Override // okio.AbstractC69699e
    public int select(C69710l lVar) throws IOException {
        return 0;
    }

    @Override // okio.AbstractC69723u
    public C69724v timeout() {
        return null;
    }

    @Override // okio.AbstractC69699e
    public boolean exhausted() throws IOException {
        if (this.position >= this.source.length) {
            return true;
        }
        return false;
    }

    @Override // okio.AbstractC69699e
    public byte readByte() throws IOException {
        byte[] bArr = this.source;
        int i = this.position;
        this.position = i + 1;
        return bArr[i];
    }

    @Override // okio.AbstractC69699e
    public int readIntLe() throws IOException {
        return reverseBytesInt(readInt());
    }

    @Override // okio.AbstractC69699e
    public long readLongLe() throws IOException {
        return reverseBytesLong(readLong());
    }

    @Override // okio.AbstractC69699e
    public int readInt() throws IOException {
        byte[] bArr = this.source;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        this.position = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.position = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    @Override // okio.AbstractC69699e
    public long readLong() throws IOException {
        byte[] bArr = this.source;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = i3 + 1;
        this.position = i4;
        int i5 = i4 + 1;
        this.position = i5;
        int i6 = i5 + 1;
        this.position = i6;
        int i7 = i6 + 1;
        this.position = i7;
        int i8 = i7 + 1;
        this.position = i8;
        this.position = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    ByteBufferedSource(byte[] bArr) {
        this.source = bArr;
    }

    @Override // okio.AbstractC69699e
    public void skip(long j) throws IOException {
        this.position = (int) (((long) this.position) + j);
    }

    @Override // okio.AbstractC69699e
    public boolean request(long j) throws IOException {
        if (((long) this.position) + j < ((long) this.source.length)) {
            return true;
        }
        return false;
    }

    @Override // okio.AbstractC69699e
    public byte[] readByteArray(long j) throws IOException {
        int i = (int) j;
        byte[] bArr = new byte[i];
        System.arraycopy(this.source, this.position, bArr, 0, i);
        this.position = (int) (((long) this.position) + j);
        return bArr;
    }

    @Override // okio.AbstractC69699e
    public ByteString readByteString(long j) throws IOException {
        ByteString of = ByteString.of(this.source, this.position, (int) j);
        this.position = (int) (((long) this.position) + j);
        return of;
    }

    @Override // okio.AbstractC69699e
    public String readUtf8(long j) throws IOException {
        String str = new String(this.source, this.position, (int) j, UTF8);
        this.position = (int) (((long) this.position) + j);
        return str;
    }

    @Override // okio.AbstractC69699e
    public void require(long j) throws IOException {
        if (((long) this.position) + j > ((long) this.source.length)) {
            throw new EOFException();
        }
    }
}
