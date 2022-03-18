package com.bytedance.ee.bear.list.mine;

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

/* renamed from: com.bytedance.ee.bear.list.mine.h */
public class C8619h implements AbstractC8457h {

    /* renamed from: a */
    private FolderSortStrategy f23368a;

    /* renamed from: b */
    public AbstractC68307f<ArrayList<Document>> mo33576b() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$h$A2rpDWGEY0UHaUnwUVoh1mVJc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8619h.this.m36006a((Boolean) obj);
            }
        }).mo238020d($$Lambda$FSNy96UUdC_mSq0yGTc2JIy7ug.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("MineListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("mine");
        if (i == null) {
            return new FolderSortStrategy("mine", FilterType.ALL.getType(), "", "", MineSort.MODIFIED_TIME.getRank(), false);
        }
        return i;
    }

    /* renamed from: a */
    public void mo33575a(FolderSortStrategy folderSortStrategy) {
        this.f23368a = folderSortStrategy;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ List m36006a(Boolean bool) throws Exception {
        return C8153a.m32844b().mo31578a(2, this.f23368a);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("MineListCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$h$M_5hv6Z2rdJtshW7WX8MxWm8v1w */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8619h.m36009a(this.f$0, (ArrayList) obj);
            }
        }, $$Lambda$h$H_5dp5FZQIG4GHFeTi7Tm5qr6oU.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("MineListCache", "clearAndSave()...");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$h$O8rHmLNMRk8Hak0SRi3srJqvBPY */
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8619h.this.m36008a((C8619h) this.f$1, (ArrayList) ((Boolean) obj));
            }
        }, $$Lambda$h$yNqJ6cYVcC3tWh61RYMoEmJJLx4.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36008a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31604b(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 2), C8200i.m33452a(arrayList, 2, this.f23368a), 2, this.f23368a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36009a(ArrayList arrayList, ArrayList arrayList2) throws Exception {
        C8153a.m32844b().mo31589a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 2));
    }
}
