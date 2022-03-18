package com.ss.android.ugc.effectmanager.knadapt;

import com.ss.android.vesdk.p3188b.C63954b;
import com.ss.ugc.effectplatform.bridge.network.ByteReadStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/InputStreamByteRead;", "Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "available", "", "close", "", "read", "", C63954b.f161494a, "", "offset", "len", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.a */
public final class InputStreamByteRead implements ByteReadStream {

    /* renamed from: a */
    private final InputStream f151434a;

    @Override // com.ss.ugc.effectplatform.bridge.network.ByteReadStream
    /* renamed from: a */
    public void mo207359a() {
        this.f151434a.close();
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.ByteReadStream
    /* renamed from: b */
    public boolean mo207360b() {
        if (this.f151434a.available() >= 0) {
            return true;
        }
        return false;
    }

    public InputStreamByteRead(InputStream inputStream) {
        Intrinsics.checkParameterIsNotNull(inputStream, "inputStream");
        this.f151434a = inputStream;
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.ByteReadStream
    /* renamed from: a */
    public int mo207358a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, C63954b.f161494a);
        return this.f151434a.read(bArr, i, i2);
    }
}
