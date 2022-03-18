package com.bytedance.ee.bear.list.p431g;

import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.g.a */
public class C8455a extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        return null;
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a, com.bytedance.ee.bear.list.sort.AbstractC8755a
    /* renamed from: b */
    public List<FilterType> mo33058b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FilterType.ALL);
        arrayList.add(FilterType.DOC);
        arrayList.add(FilterType.SHEET);
        return arrayList;
    }

    public C8455a(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
