package com.bytedance.ee.bear.list.manualoffline;

import com.bytedance.ee.bear.list.sort.AbstractC8756b;
import com.bytedance.ee.bear.list.sort.SortType;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.j */
public class C8611j extends AbstractC8756b {
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
        arrayList.add(new SortType(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Added, ManualOfflineSort.DEFAULT.getRank(), ManualOfflineSort.DEFAULT.getAsc(), ManualOfflineSort.DEFAULT.getReportSort()));
        arrayList.add(new SortType(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated, ManualOfflineSort.MODIFIED.getRank(), ManualOfflineSort.MODIFIED.getAsc(), ManualOfflineSort.MODIFIED.getReportSort()));
        arrayList.add(new SortType(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created, ManualOfflineSort.CREATED.getRank(), ManualOfflineSort.CREATED.getAsc(), ManualOfflineSort.CREATED.getReportSort()));
        return arrayList;
    }
}
