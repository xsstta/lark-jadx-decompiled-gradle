package com.bytedance.geckox.buffer.p760a;

import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.buffer.a.b */
public class C14210b extends AbstractC14211c {

    /* renamed from: a */
    private AbstractC14208a f37365a;

    /* renamed from: b */
    private AbstractC14267a f37366b;

    /* renamed from: c */
    private UpdatePackage f37367c;

    /* renamed from: d */
    private long f37368d;

    /* renamed from: e */
    private long f37369e;

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
    }

    public C14210b(AbstractC14208a aVar) {
        this.f37365a = aVar;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f37365a.mo52096a(i);
        m57354a(4);
    }

    /* renamed from: a */
    private void m57354a(int i) {
        long j = this.f37369e + ((long) i);
        this.f37369e = j;
        AbstractC14267a aVar = this.f37366b;
        if (aVar != null) {
            aVar.mo52239a(this.f37367c, this.f37368d, j);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f37365a.mo52097a(bArr);
        m57354a(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f37365a.mo52093a(bArr, i, i2);
        m57354a(i2);
    }

    public C14210b(AbstractC14208a aVar, AbstractC14267a aVar2, UpdatePackage updatePackage, long j) {
        this(aVar);
        this.f37366b = aVar2;
        this.f37367c = updatePackage;
        this.f37368d = j;
    }
}
