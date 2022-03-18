package com.ss.android.ttmd5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.ss.android.ttmd5.a */
public class C60175a implements AbstractC60176b {

    /* renamed from: a */
    private final RandomAccessFile f150180a;

    @Override // com.ss.android.ttmd5.AbstractC60176b
    /* renamed from: b */
    public void mo205495b() throws IOException {
        this.f150180a.close();
    }

    @Override // com.ss.android.ttmd5.AbstractC60176b
    /* renamed from: a */
    public long mo205493a() throws IOException {
        return this.f150180a.length();
    }

    public C60175a(File file) throws FileNotFoundException {
        this.f150180a = new RandomAccessFile(file, "r");
    }

    @Override // com.ss.android.ttmd5.AbstractC60176b
    /* renamed from: a */
    public void mo205494a(long j, long j2) throws IOException {
        this.f150180a.seek(j);
    }

    @Override // com.ss.android.ttmd5.AbstractC60176b
    /* renamed from: a */
    public int mo205492a(byte[] bArr, int i, int i2) throws IOException {
        return this.f150180a.read(bArr, i, i2);
    }
}
