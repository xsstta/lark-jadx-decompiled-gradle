package com.bytedance.ee.bear.list.star;

import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.star.n */
public class C8816n extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        return new ArrayList();
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a, com.bytedance.ee.bear.list.sort.AbstractC8755a
    /* renamed from: b */
    public List<FilterType> mo33058b() {
        List<FilterType> b = super.mo33058b();
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21068b()) {
            b.add(FilterType.WIKI);
        }
        return b;
    }

    public C8816n(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
