package com.google.android.gms.internal.p979b;

import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.b.g */
final class C21890g extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    C21890g() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C21888e.m79198a(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C21888e.m79198a(bArr);
    }
}
