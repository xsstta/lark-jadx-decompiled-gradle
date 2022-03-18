package com.ss.android.lark.searchcommon.service.p2645c;

import com.ss.android.lark.searchcommon.service.entity.p2646a.C53947b;
import com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.searchcommon.service.c.h */
public class C53933h extends AbstractC53928d {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d
    /* renamed from: a */
    public Map<Integer, AbstractC53928d.C53929a> mo184361a(C53947b bVar) {
        HashMap hashMap = new HashMap();
        Map a = mo184366a(bVar.mo184464a());
        Map a2 = mo184366a(bVar.mo184476g());
        hashMap.put(1, new AbstractC53928d.C53929a(a));
        hashMap.put(11, new AbstractC53928d.C53929a(a2));
        return hashMap;
    }
}
