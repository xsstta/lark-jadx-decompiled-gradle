package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;

public class ao extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SortType(ShareFileSort.MODIFIED_TIME.getResId(), ShareFileSort.MODIFIED_TIME.getRank(), ShareFileSort.MODIFIED_TIME.getAsc(), ShareFileSort.MODIFIED_TIME.getReportSort()));
        arrayList.add(new SortType(ShareFileSort.SHARE_TIME.getResId(), ShareFileSort.SHARE_TIME.getRank(), ShareFileSort.SHARE_TIME.getAsc(), ShareFileSort.SHARE_TIME.getReportSort()));
        arrayList.add(new SortType(ShareFileSort.CREATE_TIME.getResId(), ShareFileSort.CREATE_TIME.getRank(), ShareFileSort.CREATE_TIME.getAsc(), ShareFileSort.CREATE_TIME.getReportSort()));
        return arrayList;
    }

    public ao(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
