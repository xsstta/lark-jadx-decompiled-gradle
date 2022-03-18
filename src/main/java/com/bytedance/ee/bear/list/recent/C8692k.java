package com.bytedance.ee.bear.list.recent;

import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.recent.k */
public class C8692k extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a, com.bytedance.ee.bear.list.sort.AbstractC8755a
    /* renamed from: b */
    public List<FilterType> mo33058b() {
        List<FilterType> b = super.mo33058b();
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21068b() || ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            b.add(FilterType.WIKI);
        }
        return b;
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SortType(RecentSort.ALL.getResId(), RecentSort.ALL.getRank(), RecentSort.ALL.getAsc(), RecentSort.ALL.getReportSort()));
        arrayList.add(new SortType(RecentSort.MODIFIED.getResId(), RecentSort.MODIFIED.getRank(), RecentSort.MODIFIED.getAsc(), RecentSort.MODIFIED.getReportSort()));
        arrayList.add(new SortType(RecentSort.OPENED.getResId(), RecentSort.OPENED.getRank(), RecentSort.OPENED.getAsc(), RecentSort.OPENED.getReportSort()));
        arrayList.add(new SortType(RecentSort.CREATED.getResId(), RecentSort.CREATED.getRank(), RecentSort.CREATED.getAsc(), RecentSort.CREATED.getReportSort()));
        return arrayList;
    }

    public C8692k(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
