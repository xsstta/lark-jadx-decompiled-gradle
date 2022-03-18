package com.tt.miniapp.ttapkgdecoder.p3334b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.tt.miniapp.ttapkgdecoder.b.b */
public class C66981b extends AbstractC66980a {

    /* renamed from: a */
    protected int f168908a;

    /* renamed from: b */
    RandomAccessFile f168909b;

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: b */
    public void mo233015b() {
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: c */
    public void mo233017c() {
        try {
            this.f168909b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: b */
    public void mo233016b(long j) {
        this.f168908a = (int) (((long) this.f168908a) + j);
    }

    public C66981b(File file) {
        try {
            this.f168909b = new RandomAccessFile(file, "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: a */
    public void mo233014a(byte[] bArr) throws IOException {
        this.f168909b.seek((long) this.f168908a);
        this.f168909b.readFully(bArr);
        this.f168908a += bArr.length;
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: a */
    public int mo233013a(byte[] bArr, int i, int i2) throws IOException {
        this.f168909b.seek((long) this.f168908a);
        int read = this.f168909b.read(bArr, i, i2);
        this.f168908a += read;
        return read;
    }
}
