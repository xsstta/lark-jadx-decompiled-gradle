package com.ss.android.lark.money.redpacket.send;

import com.ss.android.lark.money.redpacket.dto.PayURLType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.money.redpacket.send.c */
public class C48178c {

    /* renamed from: a */
    private final Map<String, String> f121234a;

    /* renamed from: b */
    private final PayURLType f121235b;

    public C48178c(Map<String, String> map, PayURLType payURLType) {
        HashMap hashMap = new HashMap();
        this.f121234a = hashMap;
        hashMap.putAll(map);
        this.f121235b = payURLType;
    }
}
