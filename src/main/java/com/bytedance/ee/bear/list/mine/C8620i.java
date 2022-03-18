package com.bytedance.ee.bear.list.mine;

import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.mine.i */
public class C8620i extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SortType(MineSort.MODIFIED_TIME.getResId(), MineSort.MODIFIED_TIME.getRank(), MineSort.MODIFIED_TIME.getAsc(), MineSort.MODIFIED_TIME.getReportSort()));
        arrayList.add(new SortType(MineSort.CREATE_TIME.getResId(), MineSort.CREATE_TIME.getRank(), MineSort.CREATE_TIME.getAsc(), MineSort.CREATE_TIME.getReportSort()));
        return arrayList;
    }

    public C8620i(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
