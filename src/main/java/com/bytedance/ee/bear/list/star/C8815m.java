package com.bytedance.ee.bear.list.star;

import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.star.m */
public class C8815m implements AbstractC8457h {

    /* renamed from: a */
    private FolderSortStrategy f23734a;

    /* renamed from: b */
    public AbstractC68307f<ArrayList<Document>> mo33866b() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$m$NH7H1KO0zXlXpIthZXgA1Nwz80Q */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8815m.this.m36949a((Boolean) obj);
            }
        }).mo238020d($$Lambda$FSNy96UUdC_mSq0yGTc2JIy7ug.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("StarListCache", "getFilter()...");
        return C8153a.m32844b().mo31639i("star");
    }

    /* renamed from: a */
    public void mo33865a(FolderSortStrategy folderSortStrategy) {
        this.f23734a = folderSortStrategy;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ List m36949a(Boolean bool) throws Exception {
        return C8153a.m32844b().mo31578a(6, this.f23734a);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("StarListCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$m$F95awNZcDeBzaXsPihOIUaHEZI */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8815m.m36952a(this.f$0, (ArrayList) obj);
            }
        }, $$Lambda$m$rdfaKp3qJ5RFxj3llcZwolydZpY.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("StarListCache", "clearAndSave");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.star.$$Lambda$m$5RSeYXm02NfZznVt2JIXzAwGJKU */
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8815m.this.m36951a((C8815m) this.f$1, (ArrayList) ((Boolean) obj));
            }
        }, $$Lambda$m$N8CUMHoBaZ7xaHNkocV6B2dYnOA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36951a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31613c(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 6), C8200i.m33452a(arrayList, 6, this.f23734a), 6, this.f23734a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36952a(ArrayList arrayList, ArrayList arrayList2) throws Exception {
        C8153a.m32844b().mo31589a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 6));
    }
}
