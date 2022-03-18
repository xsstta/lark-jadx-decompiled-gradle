package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.log.C13479a;

public class ar extends AbstractC8314a {

    /* renamed from: b */
    private final String f22480b = "PersonalSubListCache";

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("PersonalSubListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i(this.f22477a);
        if (i == null) {
            return new FolderSortStrategy(this.f22477a, FilterType.ALL.getType(), "", "", FolderSort.NAME.getRank(), true);
        }
        return i;
    }

    public ar(String str) {
        super(str);
    }
}
