package com.bytedance.crash.upload;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.upload.o */
public class C3923o extends GZIPOutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.util.zip.DeflaterOutputStream, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public void finish() {
    }

    /* renamed from: a */
    public void mo15581a() throws IOException {
        super.close();
    }

    /* renamed from: b */
    public void mo15582b() throws IOException {
        super.finish();
    }

    public C3923o(OutputStream outputStream) throws IOException {
        super(outputStream);
    }
}
