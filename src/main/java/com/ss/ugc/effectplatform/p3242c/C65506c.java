package com.ss.ugc.effectplatform.p3242c;

import bytekn.foundation.io.file.ByteArrayOutputStream;
import bytekn.foundation.io.file.ContentEncoding;
import com.ss.ugc.effectplatform.bridge.network.ByteReadStream;
import com.ss.ugc.effectplatform.util.C65547b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertToString", "", "Lcom/ss/ugc/effectplatform/bridge/network/ByteReadStream;", "effect_base_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.c.c */
public final class C65506c {
    /* renamed from: a */
    public static final String m256760a(ByteReadStream aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$convertToString");
        if (!aVar.mo207360b()) {
            return "";
        }
        ByteArrayOutputStream aVar2 = new ByteArrayOutputStream(0, 1, null);
        byte[] bArr = new byte[1024];
        int a = aVar.mo207358a(bArr, 0, 1024);
        while (a >= 0) {
            aVar2.mo8699a(bArr, 0, a);
            a = aVar.mo207358a(bArr, 0, 1024);
        }
        aVar.mo207359a();
        return C65547b.m257044a(aVar2.mo8702c(), ContentEncoding.Utf8);
    }
}
