package com.bytedance.ee.bear.list.manualoffline;

import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.h */
public class C8609h implements AbstractC8457h {
    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("ManualOfflineListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("manual_offline");
        if (i == null) {
            return new FolderSortStrategy("manual_offline", FilterType.ALL.getType(), "", "", ManualOfflineSort.DEFAULT.getRank(), false);
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m35945c(ArrayList arrayList) throws Exception {
        C8153a.m32844b().mo31589a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 7));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("ManualOfflineListCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$h$tNZItO5I8HMdFu8rkkTK_BXYTaA.INSTANCE, $$Lambda$h$uEYIUSRB4Cf6cquLVkM7kbg5qNA.INSTANCE);
    }
}
