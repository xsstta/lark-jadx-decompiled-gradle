package com.bytedance.ee.bear.facade.glide.p383a.p385b;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13597a;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.b.a */
public class C7749a implements AbstractC7751c {
    @Override // com.bytedance.ee.bear.facade.glide.p383a.p385b.AbstractC7751c
    /* renamed from: a */
    public byte[] mo30374a(String str, String str2, byte[] bArr) {
        if (bArr != null) {
            return C13597a.m55181a(bArr, str);
        }
        C13479a.m54758a("AesCbcDecoder", "source data == null");
        return null;
    }
}
