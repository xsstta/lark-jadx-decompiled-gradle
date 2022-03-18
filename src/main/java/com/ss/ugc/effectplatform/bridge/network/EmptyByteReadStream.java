package com.ss.ugc.effectplatform.bridge.network;

import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/network/EmptyByteReadStream;", "Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;", "()V", "available", "", "close", "", "read", "", C63954b.f161494a, "", "offset", "len", "effect_bridge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.network.b */
public final class EmptyByteReadStream implements ByteReadStream {
    @Override // com.ss.ugc.effectplatform.bridge.network.ByteReadStream
    /* renamed from: a */
    public int mo207358a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, C63954b.f161494a);
        return 0;
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.ByteReadStream
    /* renamed from: a */
    public void mo207359a() {
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.ByteReadStream
    /* renamed from: b */
    public boolean mo207360b() {
        return false;
    }
}
