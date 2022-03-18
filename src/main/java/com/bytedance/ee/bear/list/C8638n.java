package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.contract.NetService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.list.n */
public class C8638n extends NetService.C5076e {

    /* renamed from: a */
    private int f23404a;

    public C8638n() {
        mo20150b("/api/explorer/root/get/");
        this.f23404a = 0;
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, "4");
        mo20147a(hashMap);
        mo20143a(1);
    }

    public C8638n(String str, String str2, HashMap<String, String> hashMap, int i) {
        mo20144a(str);
        mo20150b(str2);
        mo20147a(hashMap);
        mo20143a(i);
    }
}
