package com.bytedance.ee.bear.list.share;

import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.FolderSort;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.share.ae */
public class C8712ae extends AbstractC8708a {
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public LiveData<ArrayList<Document>> mo33766b() {
        C13479a.m54764b("ShareFolderListCache", "getDisplayShareFolderLiveData()...");
        return C1138ae.m5354a(C8153a.m32844b().mo31622e(), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("ShareFolderListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("shared_folder");
        if (i == null) {
            return new FolderSortStrategy("shared_folder", FilterType.ALL.getType(), "", "", FolderSort.NAME.getRank(), true);
        }
        return i;
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("ShareFolderListCache", "clearAndSave()...");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ae$64Zve2wuL4xrk0qbPxZNyDPqmg */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8712ae.m36473a(this.f$0, (Boolean) obj);
            }
        }, $$Lambda$ae$790mq4QRz81BcITnsR0jTQ7F7uY.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36473a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31603b(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 4));
    }
}
