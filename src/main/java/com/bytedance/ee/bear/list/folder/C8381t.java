package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.sort.AbstractC8755a;
import com.bytedance.ee.bear.list.sort.SortType;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.folder.t */
public class C8381t extends AbstractC8755a {
    @Override // com.bytedance.ee.bear.list.sort.AbstractC8765g.AbstractC8766a
    /* renamed from: a */
    public List<SortType> mo32811a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FolderSort.MODIFIED_TIME.convertSortType());
        arrayList.add(FolderSort.CREATED_TIME.convertSortType());
        arrayList.add(FolderSort.NAME.convertSortType());
        arrayList.add(FolderSort.OWNER.convertSortType());
        return arrayList;
    }

    public C8381t(C10917c cVar, boolean z) {
        super(cVar, z);
    }
}
