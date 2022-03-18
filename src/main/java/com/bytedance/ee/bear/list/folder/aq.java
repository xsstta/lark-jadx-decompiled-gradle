package com.bytedance.ee.bear.list.folder;

import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;

public class aq extends AbstractC8314a {
    /* renamed from: b */
    public LiveData<ArrayList<Document>> mo32739b() {
        C13479a.m54764b("PersonalRootListCache", "getPersonalFolderLiveData()...");
        return C1138ae.m5354a(C8153a.m32844b().mo31575a(""), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("PersonalRootListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("root");
        if (i == null) {
            return new FolderSortStrategy("root", FilterType.ALL.getType(), "", "", FolderSort.NAME.getRank(), true);
        }
        return i;
    }

    public aq(String str) {
        super(str);
    }
}
