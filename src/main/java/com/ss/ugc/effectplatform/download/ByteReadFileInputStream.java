package com.ss.ugc.effectplatform.download;

import bytekn.foundation.io.file.FileInputStream;
import com.ss.android.vesdk.p3188b.C63954b;
import com.ss.ugc.effectplatform.bridge.network.ByteReadStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/effectplatform/download/ByteReadFileInputStream;", "Lbytekn/foundation/io/file/FileInputStream;", "byteReadStream", "Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;", "(Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;)V", "available", "", "close", "", "read", "", C63954b.f161494a, "", "offset", "len", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.download.b */
public final class ByteReadFileInputStream extends FileInputStream {

    /* renamed from: b */
    private final ByteReadStream f164890b;

    @Override // bytekn.foundation.io.file.KnCloseable, bytekn.foundation.io.file.FileInputStream
    /* renamed from: b */
    public void mo8708b() {
        this.f164890b.mo207359a();
    }

    public ByteReadFileInputStream(ByteReadStream aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "byteReadStream");
        this.f164890b = aVar;
    }

    @Override // bytekn.foundation.io.file.FileInputStream
    /* renamed from: a */
    public int mo8705a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, C63954b.f161494a);
        return this.f164890b.mo207358a(bArr, i, i2);
    }
}
