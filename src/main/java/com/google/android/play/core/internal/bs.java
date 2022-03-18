package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
public final class bs implements as {

    /* renamed from: a */
    private final FileChannel f56040a;

    /* renamed from: b */
    private final long f56041b;

    /* renamed from: c */
    private final long f56042c;

    public bs(FileChannel fileChannel, long j, long j2) {
        this.f56040a = fileChannel;
        this.f56041b = j;
        this.f56042c = j2;
    }

    @Override // com.google.android.play.core.internal.as
    /* renamed from: a */
    public final long mo78854a() {
        return this.f56042c;
    }

    @Override // com.google.android.play.core.internal.as
    /* renamed from: a */
    public final void mo78855a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f56040a.map(FileChannel.MapMode.READ_ONLY, this.f56041b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
