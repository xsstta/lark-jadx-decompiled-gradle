package com.bytedance.ee.bear.wikiv2.home.recent;

import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8202k;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.recent.b */
public class C12290b implements AbstractC8457h {
    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m51191d(ArrayList arrayList) throws Exception {
        C8153a.m32844b().mo31626e(m51190c(arrayList));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("RecentWikiListCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$b$NMAOWx0A3MRSNYqMxg8MbiRo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12290b.this.m51191d((ArrayList) obj);
            }
        }, $$Lambda$b$ycZ0pUPG0WECWSUkKSBLub3EpQA.INSTANCE);
    }

    /* renamed from: c */
    private ArrayList<C8202k> m51190c(ArrayList<Document> arrayList) {
        if (C13657b.m55421a(arrayList)) {
            return new ArrayList<>();
        }
        ArrayList<C8202k> arrayList2 = new ArrayList<>();
        Iterator<Document> it = arrayList.iterator();
        while (it.hasNext()) {
            C8202k a = C8202k.m33598a((WikiDocument) it.next());
            if (a != null) {
                arrayList2.add(a);
            }
        }
        return arrayList2;
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("RecentWikiListCache", "clearAndSave()...");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.wikiv2.home.recent.$$Lambda$b$rrwAzUAzv8_nwRjEje0TblX57Kw */
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12290b.this.m51188a(this.f$1, (Boolean) obj);
            }
        }, $$Lambda$b$u_r7U9mXQmYs1SDVmJfDor1y9JE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51188a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31630f(m51190c(arrayList));
    }
}
