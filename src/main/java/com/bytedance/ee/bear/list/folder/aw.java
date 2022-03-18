package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.sort.AbstractC8756b;
import com.bytedance.ee.bear.list.sort.SortType;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class aw extends AbstractC8756b {
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
        SortType convertSortType = FolderSort.MODIFIED_TIME.convertSortType();
        convertSortType.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
        arrayList.add(convertSortType);
        SortType convertSortType2 = FolderSort.CREATED_TIME.convertSortType();
        convertSortType2.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        arrayList.add(convertSortType2);
        SortType convertSortType3 = FolderSort.NAME.convertSortType();
        convertSortType3.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Name);
        arrayList.add(convertSortType3);
        SortType convertSortType4 = FolderSort.OWNER.convertSortType();
        convertSortType4.mo33843a(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Owner);
        arrayList.add(convertSortType4);
        return arrayList;
    }
}
