package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.a */
public final class C22619a implements as {

    /* renamed from: a */
    private final ByteBuffer f56002a;

    public C22619a(ByteBuffer byteBuffer) {
        this.f56002a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.internal.as
    /* renamed from: a */
    public final long mo78854a() {
        return (long) this.f56002a.capacity();
    }

    @Override // com.google.android.play.core.internal.as
    /* renamed from: a */
    public final void mo78855a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f56002a) {
            int i2 = (int) j;
            this.f56002a.position(i2);
            this.f56002a.limit(i2 + i);
            slice = this.f56002a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
