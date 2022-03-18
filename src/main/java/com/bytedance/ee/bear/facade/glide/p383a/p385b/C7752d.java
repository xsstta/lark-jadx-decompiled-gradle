package com.bytedance.ee.bear.facade.glide.p383a.p385b;

import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.b.d */
public class C7752d implements AbstractC7751c {
    @Override // com.bytedance.ee.bear.facade.glide.p383a.p385b.AbstractC7751c
    /* renamed from: a */
    public byte[] mo30374a(String str, String str2, byte[] bArr) {
        if (bArr == null) {
            C13479a.m54758a("SM4GcmDecoder", "decodeToByte() sourceData == null");
        }
        return ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35629a(bArr, str, str2);
    }
}
