package com.bytedance.crash.upload;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bytedance.crash.upload.b */
public class C3889b extends FilterOutputStream {

    /* renamed from: a */
    public long f11900a;

    /* renamed from: b */
    public long f11901b;

    /* renamed from: b */
    public long mo15523b() {
        return this.f11900a;
    }

    /* renamed from: a */
    public long mo15522a() {
        long j = this.f11900a;
        long j2 = j - this.f11901b;
        this.f11901b = j;
        return j2;
    }

    public C3889b(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) throws IOException {
        this.f11900a++;
        this.out.write(i);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f11900a += (long) i2;
        this.out.write(bArr, i, i2);
    }
}
