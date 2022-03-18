package com.bytedance.ee.bear.facade.glide.p383a.p385b;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13597a;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.b.b */
public class C7750b implements AbstractC7751c {
    @Override // com.bytedance.ee.bear.facade.glide.p383a.p385b.AbstractC7751c
    /* renamed from: a */
    public byte[] mo30374a(String str, String str2, byte[] bArr) {
        if (bArr == null) {
            C13479a.m54758a("AesGcmDecoder", "decodeToByte() sourceData == null");
        }
        return C13597a.m55182a(bArr, str, str2);
    }
}
