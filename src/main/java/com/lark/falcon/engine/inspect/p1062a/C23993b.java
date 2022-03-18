package com.lark.falcon.engine.inspect.p1062a;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lark.falcon.engine.inspect.a.b */
public class C23993b extends BufferedInputStream {

    /* renamed from: a */
    private boolean f59349a;

    /* renamed from: b */
    private boolean f59350b;

    public boolean markSupported() {
        return true;
    }

    /* renamed from: c */
    private void m87714c() {
        if (this.f59349a) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    private void m87715d() {
        if (this.f59350b) {
            throw new IllegalStateException();
        }
    }

    @Override // java.io.FilterInputStream, java.io.BufferedInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        m87714c();
        this.f59350b = false;
        super.reset();
    }

    /* renamed from: b */
    private byte[] m87713b() {
        int i = this.count - this.pos;
        byte[] bArr = new byte[i];
        System.arraycopy(this.buf, this.pos, bArr, 0, i);
        this.pos = 0;
        this.count = 0;
        return bArr;
    }

    /* renamed from: a */
    public synchronized InputStream mo86155a() {
        m87714c();
        m87715d();
        this.f59349a = true;
        return new C23978a(new InputStream[]{new ByteArrayInputStream(m87713b()), this.in});
    }

    public synchronized void mark(int i) {
        m87714c();
        this.f59350b = true;
        super.mark(i);
    }

    public C23993b(InputStream inputStream, int i) {
        super(inputStream, i);
    }
}
