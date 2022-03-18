package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.share.x */
public class C8752x extends AbstractC8708a {

    /* renamed from: a */
    private FolderSortStrategy f23608a;

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("ShareFileListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("shared_file");
        if (i == null) {
            return new FolderSortStrategy("shared_file", FilterType.ALL.getType(), "", "", ShareFileSort.MODIFIED_TIME.getRank(), false);
        }
        return i;
    }

    /* renamed from: b */
    public AbstractC68307f<ArrayList<Document>> mo33783b() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$x$b7D18KPNjZVwuTEgf5J5IGrwHFs */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8752x.this.m36773a((Boolean) obj);
            }
        }).mo238020d($$Lambda$FSNy96UUdC_mSq0yGTc2JIy7ug.INSTANCE);
    }

    /* renamed from: a */
    public void mo33782a(FolderSortStrategy folderSortStrategy) {
        this.f23608a = folderSortStrategy;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ List m36773a(Boolean bool) throws Exception {
        return C8153a.m32844b().mo31578a(4, this.f23608a);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("ShareFileListCache", "clearAndSave()...");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$x$8TcrN2qKfwufuT50Kb3WoNIxkhQ */
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8752x.this.m36775a((C8752x) this.f$1, (ArrayList) ((Boolean) obj));
            }
        }, $$Lambda$x$xhXwDBPEvdwJzKeQJ7OjASgDjmY.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36775a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31591a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 4), C8200i.m33452a(arrayList, 4, this.f23608a), 4, this.f23608a);
    }
}
