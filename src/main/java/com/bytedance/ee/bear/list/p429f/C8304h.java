package com.bytedance.ee.bear.list.p429f;

import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.f.h */
public class C8304h implements AbstractC8457h {
    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        return null;
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("PinedCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.p429f.$$Lambda$h$SOBQsRtCHbXdwqSBhVYH8iSzkY */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8304h.m34243a(this.f$0, (ArrayList) obj);
            }
        }, $$Lambda$h$2luIvqX8mKzXTzZ91JYyBBW3omg.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("PinedCache", "clearAndSave()...");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.p429f.$$Lambda$h$prN_ZA5zdXyx2aCv8uvt7VS7Oig */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8304h.m34242a(this.f$0, (Boolean) obj);
            }
        }, $$Lambda$h$gHIsqlO2QjDWq9AkmVeVvYx4bhE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34242a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31590a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 5), 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34243a(ArrayList arrayList, ArrayList arrayList2) throws Exception {
        C8153a.m32844b().mo31589a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 5));
    }
}
