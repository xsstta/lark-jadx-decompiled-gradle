package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.list.AbstractC8457h;
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

public class ar implements AbstractC8457h {

    /* renamed from: a */
    private FolderSortStrategy f23577a;

    /* renamed from: b */
    public AbstractC68307f<ArrayList<Document>> mo33771b() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ar$RsJd8pTaHChToCtJ7QE7Oy14 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ar.this.m36571a((Boolean) obj);
            }
        }).mo238020d($$Lambda$FSNy96UUdC_mSq0yGTc2JIy7ug.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("SharedListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("shared");
        if (i == null) {
            return new FolderSortStrategy("shared", FilterType.ALL.getType(), "", "", ShareFileSort.MODIFIED_TIME.getRank(), false);
        }
        return i;
    }

    /* renamed from: a */
    public void mo33770a(FolderSortStrategy folderSortStrategy) {
        this.f23577a = folderSortStrategy;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ List m36571a(Boolean bool) throws Exception {
        return C8153a.m32844b().mo31578a(10, this.f23577a);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("SharedListCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ar$EAMq5FYcTAOfTQuLg0sLGk2nys4 */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ar.m36574a(this.f$0, (ArrayList) obj);
            }
        }, $$Lambda$ar$rLVhjmyNTnF9ZBcf9aRFcxJtPk.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("SharedListCache", "clearAndSave()...");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ar$6jM0lzSSPUZ43vvkV_z91OXEB0 */
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ar.this.m36573a((ar) this.f$1, (ArrayList) ((Boolean) obj));
            }
        }, $$Lambda$ar$7CI2luwV4lvrCaN_h4TUaeYnKE.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36573a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31613c(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 10), C8200i.m33452a(arrayList, 10, this.f23577a), 10, this.f23577a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36574a(ArrayList arrayList, ArrayList arrayList2) throws Exception {
        C8153a.m32844b().mo31589a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 10));
    }
}
