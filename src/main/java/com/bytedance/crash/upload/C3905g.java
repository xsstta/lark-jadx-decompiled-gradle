package com.bytedance.crash.upload;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.upload.g */
public class C3905g extends DataOutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: a */
    public void mo15556a() throws IOException {
        super.close();
    }

    public C3905g(OutputStream outputStream) {
        super(outputStream);
    }
}
