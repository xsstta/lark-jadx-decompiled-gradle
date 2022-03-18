package com.bytedance.ee.bear.list.recent;

import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.recent.j */
public class C8691j implements AbstractC8457h {

    /* renamed from: a */
    private FolderSortStrategy f23509a;

    /* renamed from: b */
    private final C68289a f23510b = new C68289a();

    /* renamed from: c */
    public void mo33717c() {
        this.f23510b.mo237935a();
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        C13479a.m54764b("RecentListCache", "getFilter()...");
        FolderSortStrategy i = C8153a.m32844b().mo31639i("recent");
        if (i == null) {
            return new FolderSortStrategy("recent", FilterType.ALL.getType(), "", "", RecentSort.ALL.getRank(), false);
        }
        return i;
    }

    /* renamed from: b */
    public AbstractC68307f<ArrayList<Document>> mo33716b() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$j$KenoMUYPffgbw8r6Meg_99uvM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8691j.this.m36372a((Boolean) obj);
            }
        }).mo238020d($$Lambda$FSNy96UUdC_mSq0yGTc2JIy7ug.INSTANCE);
    }

    /* renamed from: a */
    public void mo33714a(FolderSortStrategy folderSortStrategy) {
        this.f23509a = folderSortStrategy;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ List m36372a(Boolean bool) throws Exception {
        return C8153a.m32844b().mo31578a(1, this.f23509a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36375b(String str) throws Exception {
        C8153a.m32844b().mo31594b(1, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36378c(ArrayList arrayList) throws Exception {
        C8153a.m32844b().mo31589a(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 1));
    }

    /* renamed from: a */
    public void mo33715a(String str) {
        C13479a.m54764b("RecentListCache", "delete()...");
        this.f23510b.mo237937a(AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$j$1hnPXeyA5qyDqihfSKpNJi5e8Yk.INSTANCE, $$Lambda$j$eykw2FF3Gwrd_OY5Sq8vX_kD2c.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("RecentListCache", "save()...");
        this.f23510b.mo237937a(AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$j$YdFNiC1XftOffZ5mCuu2zzE6mI.INSTANCE, $$Lambda$j$m33uhXbxJPrbOlBLcO3jg0TUs.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("RecentListCache", "clearAndSave()...list size = " + C13657b.m55424c(arrayList));
        this.f23510b.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$j$7wopUqN4OHN77yuems9vIMNs */
            public final /* synthetic */ ArrayList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8691j.this.m36374a(this.f$1, (Boolean) obj);
            }
        }, $$Lambda$j$T3phNBDuYK0aD_bb2kT4gbnQII.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36374a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31604b(C8200i.m33453b(arrayList), C8200i.m33451a(arrayList, 1), C8200i.m33452a(arrayList, 1, this.f23509a), 1, this.f23509a);
    }
}
