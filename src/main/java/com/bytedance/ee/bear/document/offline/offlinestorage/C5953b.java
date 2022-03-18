package com.bytedance.ee.bear.document.offline.offlinestorage;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13597a;
import javax.crypto.SecretKey;

/* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.b */
public final class C5953b {

    /* renamed from: a */
    private SecretKey f16677a;

    /* renamed from: b */
    private boolean f16678b;

    public C5953b(char[] cArr) {
        m24013a(cArr);
    }

    /* renamed from: a */
    private void m24013a(char[] cArr) {
        this.f16677a = C13597a.m55180a(cArr);
    }

    /* renamed from: a */
    public String mo24067a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        String a = C13597a.m55179a(bArr, this.f16677a);
        if (this.f16678b) {
            C13479a.m54772d("OfflineCipherHelper", "OfflineCipherHelper.aesDecrypt:  " + (System.currentTimeMillis() - valueOf.longValue()) + "ms");
        }
        return a;
    }

    /* renamed from: a */
    public C5968f mo24066a(C5968f fVar) {
        if (fVar != null && !TextUtils.isEmpty(fVar.mo24137d())) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            fVar.mo24138d(C13597a.m55178a(fVar.mo24137d(), this.f16677a));
            if (this.f16678b) {
                C13479a.m54772d("OfflineCipherHelper", "OfflineCipherHelper.aesEncrypt:  " + (System.currentTimeMillis() - valueOf.longValue()) + "ms");
            }
        }
        return fVar;
    }

    /* renamed from: b */
    public C5968f mo24069b(C5968f fVar) {
        if (fVar != null && !TextUtils.isEmpty(fVar.mo24137d())) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            fVar.mo24138d(C13597a.m55183b(fVar.mo24137d(), this.f16677a));
            if (this.f16678b) {
                C13479a.m54772d("OfflineCipherHelper", "OfflineCipherHelper.aesDecrypt:  " + (System.currentTimeMillis() - valueOf.longValue()) + "ms");
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public byte[] mo24068a(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        byte[] c = C13597a.m55185c(str, this.f16677a);
        if (this.f16678b) {
            C13479a.m54772d("OfflineCipherHelper", "OfflineCipherHelper.aesEncrypt:  " + (System.currentTimeMillis() - valueOf.longValue()) + "ms");
        }
        return c;
    }
}
