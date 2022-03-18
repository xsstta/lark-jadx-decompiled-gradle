package com.ss.android.lark.voip.service.impl;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.voip.service.impl.service.AbstractC58173c;
import com.ss.android.lark.voip.service.impl.service.C58176e;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.voip.service.impl.a */
public class C58004a {

    /* renamed from: a */
    private static final AbstractC58173c f142680a = new C58176e();

    /* renamed from: a */
    public static void m224997a(String str, String str2, long j) {
        m224998a(str, "join_begin", str2, "user join voip room begin", j);
    }

    /* renamed from: b */
    public static void m224999b(String str, String str2, long j) {
        m224998a(str, "join_succ", str2, "user join voip room success", j);
    }

    /* renamed from: a */
    private static void m224998a(String str, String str2, String str3, String str4, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("callid", str);
        hashMap.put(str2, String.valueOf(j));
        hashMap.put(ShareHitPoint.f121869d, str3);
        AbstractC58173c cVar = f142680a;
        if (cVar != null) {
            cVar.mo197132a("voip", str4, hashMap);
        }
    }
}
