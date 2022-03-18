package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.z */
final class C22616z extends InputStream {

    /* renamed from: a */
    private final InputStream f55996a;

    /* renamed from: b */
    private long f55997b;

    C22616z(InputStream inputStream, long j) {
        this.f55996a = inputStream;
        this.f55997b = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.f55997b;
        if (j <= 0) {
            return -1;
        }
        this.f55997b = j - 1;
        return this.f55996a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f55997b;
        if (j <= 0) {
            return -1;
        }
        int read = this.f55996a.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f55997b -= (long) read;
        }
        return read;
    }
}
