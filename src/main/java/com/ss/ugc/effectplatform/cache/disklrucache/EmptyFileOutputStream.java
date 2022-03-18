package com.ss.ugc.effectplatform.cache.disklrucache;

import bytekn.foundation.io.file.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/disklrucache/EmptyFileOutputStream;", "Lbytekn/foundation/io/file/FileOutputStream;", "()V", "close", "", "flush", "write", "buffer", "", "offset", "", "count", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.a.b */
public final class EmptyFileOutputStream extends FileOutputStream {
    @Override // bytekn.foundation.io.file.FileOutputStream
    /* renamed from: a */
    public void mo8741a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "buffer");
    }

    @Override // bytekn.foundation.io.file.KnCloseable, bytekn.foundation.io.file.FileOutputStream
    /* renamed from: b */
    public void mo8708b() {
    }

    @Override // bytekn.foundation.io.file.FileOutputStream
    /* renamed from: c */
    public void mo8742c() {
    }
}
