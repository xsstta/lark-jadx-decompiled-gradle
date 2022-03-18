package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.list.sort.AbstractC8756b;
import com.bytedance.ee.bear.list.sort.SortType;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class ap extends AbstractC8756b {
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
        SortType rVar = new SortType(ShareFileSort.MODIFIED_TIME.getResId(), ShareFileSort.MODIFIED_TIME.getRank(), ShareFileSort.MODIFIED_TIME.getAsc(), ShareFileSort.MODIFIED_TIME.getReportSort());
        arrayList.add(rVar);
        rVar.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
        SortType rVar2 = new SortType(ShareFileSort.SHARE_TIME.getResId(), ShareFileSort.SHARE_TIME.getRank(), ShareFileSort.SHARE_TIME.getAsc(), ShareFileSort.SHARE_TIME.getReportSort());
        arrayList.add(rVar2);
        rVar2.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Shared);
        SortType rVar3 = new SortType(ShareFileSort.CREATE_TIME.getResId(), ShareFileSort.CREATE_TIME.getRank(), ShareFileSort.CREATE_TIME.getAsc(), ShareFileSort.CREATE_TIME.getReportSort());
        rVar3.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        arrayList.add(rVar3);
        return arrayList;
    }
}
