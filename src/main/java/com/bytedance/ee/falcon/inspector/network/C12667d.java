package com.bytedance.ee.falcon.inspector.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.falcon.inspector.network.d */
public class C12667d extends FilterOutputStream {

    /* renamed from: a */
    private long f33912a;

    /* renamed from: a */
    public long mo48039a() {
        return this.f33912a;
    }

    public C12667d(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) throws IOException {
        this.out.write(i);
        this.f33912a++;
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f33912a += (long) i2;
    }
}
