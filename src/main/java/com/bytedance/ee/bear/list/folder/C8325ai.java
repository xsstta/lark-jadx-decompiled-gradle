package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.list.folder.ai */
public class C8325ai extends AbstractC8314a {
    public C8325ai() {
        super("");
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("MyRootFolderListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("my_root");
        if (i == null) {
            return new FolderSortStrategy("my_root", FilterType.ALL.getType(), "", "", FolderSort.NAME.getRank(), true);
        }
        return i;
    }
}
