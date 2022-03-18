package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: okio.e */
public interface AbstractC69699e extends ReadableByteChannel, AbstractC69723u {
    C69694c buffer();

    boolean exhausted() throws IOException;

    C69694c getBuffer();

    long indexOf(byte b) throws IOException;

    long indexOf(ByteString byteString) throws IOException;

    long indexOfElement(ByteString byteString) throws IOException;

    InputStream inputStream();

    boolean rangeEquals(long j, ByteString byteString) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long j) throws IOException;

    ByteString readByteString() throws IOException;

    ByteString readByteString(long j) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(C69694c cVar, long j) throws IOException;

    void readFully(byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8(long j) throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long j) throws IOException;

    boolean request(long j) throws IOException;

    void require(long j) throws IOException;

    int select(C69710l lVar) throws IOException;

    void skip(long j) throws IOException;
}
