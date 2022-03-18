package com.bytedance.ee.bear.list.mine;

import com.bytedance.ee.bear.list.sort.AbstractC8756b;
import com.bytedance.ee.bear.list.sort.SortType;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.mine.j */
public class C8621j extends AbstractC8756b {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8756b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8756b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.list.sort.AbstractC8769h.AbstractC8770a
    /* renamed from: a */
    public List<SortType> mo32742a() {
        ArrayList arrayList = new ArrayList();
        SortType rVar = new SortType(MineSort.MODIFIED_TIME.getResId(), MineSort.MODIFIED_TIME.getRank(), MineSort.MODIFIED_TIME.getAsc(), MineSort.MODIFIED_TIME.getReportSort());
        rVar.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
        arrayList.add(rVar);
        SortType rVar2 = new SortType(MineSort.CREATE_TIME.getResId(), MineSort.CREATE_TIME.getRank(), MineSort.CREATE_TIME.getAsc(), MineSort.CREATE_TIME.getReportSort());
        rVar2.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        arrayList.add(rVar2);
        return arrayList;
    }
}
