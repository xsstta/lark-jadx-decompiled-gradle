package com.tt.miniapp.ttapkgdecoder.p3334b;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: com.tt.miniapp.ttapkgdecoder.b.a */
public abstract class AbstractC66980a implements AbstractC66982c {
    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: a */
    public final int mo233011a() throws IOException {
        byte[] bArr = new byte[4];
        mo233014a(bArr);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: a */
    public final String mo233012a(long j) throws IOException {
        byte[] bArr = new byte[((int) j)];
        mo233014a(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
