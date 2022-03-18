package com.bytedance.applog.util;

import android.text.TextUtils;
import com.bytedance.applog.network.AbstractC3450b;
import com.bytedance.applog.network.RangersHttpException;
import com.bytedance.applog.p200d.C3396a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.applog.util.c */
public class C3453c implements AbstractC3450b {
    @Override // com.bytedance.applog.network.AbstractC3450b
    /* renamed from: a */
    public String mo13885a(String str, Map<String, String> map) throws RangersHttpException {
        return C3396a.m14176a(0, str, (HashMap) map, null);
    }

    @Override // com.bytedance.applog.network.AbstractC3450b
    /* renamed from: a */
    public String mo13887a(String str, byte[] bArr, Map<String, String> map) throws RangersHttpException {
        return C3396a.m14176a(1, str, (HashMap) map, bArr);
    }

    @Override // com.bytedance.applog.network.AbstractC3450b
    /* renamed from: b */
    public byte[] mo13888b(String str, byte[] bArr, Map<String, String> map) throws RangersHttpException {
        return C3396a.m14185b(1, str, (HashMap) map, bArr);
    }

    @Override // com.bytedance.applog.network.AbstractC3450b
    /* renamed from: a */
    public String mo13886a(String str, byte[] bArr, String str2) throws RangersHttpException {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("Content-Type", str2);
        }
        return mo13887a(str, bArr, hashMap);
    }
}
