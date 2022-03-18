package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: okio.d */
public interface AbstractC69698d extends WritableByteChannel, AbstractC69722t {
    /* renamed from: a */
    long mo244513a(AbstractC69723u uVar) throws IOException;

    /* renamed from: b */
    OutputStream mo244527b();

    /* renamed from: b */
    AbstractC69698d mo244530b(String str) throws IOException;

    /* renamed from: b */
    AbstractC69698d mo244531b(String str, int i, int i2) throws IOException;

    /* renamed from: b */
    AbstractC69698d mo244532b(ByteString byteString) throws IOException;

    /* renamed from: b */
    AbstractC69698d mo244533b(byte[] bArr) throws IOException;

    /* renamed from: b */
    AbstractC69698d mo244534b(byte[] bArr, int i, int i2) throws IOException;

    C69694c buffer();

    /* renamed from: d */
    AbstractC69698d mo244541d() throws IOException;

    @Override // okio.AbstractC69722t, java.io.Flushable
    void flush() throws IOException;

    /* renamed from: g */
    AbstractC69698d mo244550g(long j) throws IOException;

    /* renamed from: h */
    AbstractC69698d mo244553h(int i) throws IOException;

    /* renamed from: h */
    AbstractC69698d mo244554h(long j) throws IOException;

    /* renamed from: i */
    AbstractC69698d mo244557i(int i) throws IOException;

    /* renamed from: i */
    AbstractC69698d mo244558i(long j) throws IOException;

    /* renamed from: j */
    AbstractC69698d mo244560j() throws IOException;

    /* renamed from: j */
    AbstractC69698d mo244561j(int i) throws IOException;

    /* renamed from: k */
    AbstractC69698d mo244562k(int i) throws IOException;
}
