package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.bg */
public abstract class AbstractC22631bg implements Closeable {
    /* renamed from: a */
    public abstract long mo78697a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo78698a(long j, long j2) throws IOException;

    /* renamed from: b */
    public synchronized InputStream mo78882b() throws IOException {
        return mo78698a(0, mo78697a());
    }
}
