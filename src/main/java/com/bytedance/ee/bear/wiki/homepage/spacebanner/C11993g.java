package com.bytedance.ee.bear.wiki.homepage.spacebanner;

import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacebanner.g */
public class C11993g implements AbstractC8457h {
    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public FolderSortStrategy mo32619a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public LiveData<ArrayList<Document>> mo45937b() {
        C13479a.m54764b("WikiSpaceCache", "getWikiSpaceLiveData()...");
        return C1138ae.m5354a(C8153a.m32844b().mo31655s(), $$Lambda$fgfDtnqtsSLGZQRojRUuhyAyWA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m49739c(ArrayList arrayList) throws Exception {
        C8153a.m32844b().mo31634g(C8213o.m33657b(arrayList));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: a */
    public void mo32620a(ArrayList<Document> arrayList) {
        C13479a.m54764b("WikiSpaceCache", "clearAndSave()...");
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList) {
            /* class com.bytedance.ee.bear.wiki.homepage.spacebanner.$$Lambda$g$ygmzRg3Vknu8wLQtFwiLh7lSGLw */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11993g.m49737a(this.f$0, (Boolean) obj);
            }
        }, $$Lambda$g$uWdBN5Rl83RqNgJKGR1_I6ShJI.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8457h
    /* renamed from: b */
    public void mo32621b(ArrayList<Document> arrayList) {
        C13479a.m54764b("WikiSpaceCache", "save()...");
        AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$g$RcsgsMmcgTRkjFBlqwEis1NqHs.INSTANCE, $$Lambda$g$aTJYILKCH8jJwXUDHe5XLnK2UIM.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m49737a(ArrayList arrayList, Boolean bool) throws Exception {
        C8153a.m32844b().mo31637h(C8213o.m33657b(arrayList));
    }
}
