package com.bytedance.ee.bear.wiki.homepage.spacelist.p583a;

import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wiki.homepage.spacelist.p583a.AbstractC11994a;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacelist.a.b */
public class C11996b implements AbstractC11994a {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ArrayList m49759a(String str) throws Exception {
        return C8213o.m33656a(C8153a.m32844b().mo31654r());
    }

    @Override // com.bytedance.ee.bear.wiki.homepage.spacelist.p583a.AbstractC11994a
    /* renamed from: a */
    public List<C8213o> mo45945a(List<Document> list) {
        if (list != null) {
            return C8213o.m33657b(list);
        }
        C13479a.m54758a("SpaceListPresenter", "data from home page is null");
        return new ArrayList();
    }

    @Override // com.bytedance.ee.bear.wiki.homepage.spacelist.p583a.AbstractC11994a
    /* renamed from: a */
    public void mo45946a(AbstractC11994a.AbstractC11995a aVar) {
        AbstractC68307f a = AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d($$Lambda$b$AFp7LWI00SaT8HhVQut_F7YhmMo.INSTANCE).mo237985a(C11678b.m48481e());
        aVar.getClass();
        a.mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p583a.$$Lambda$0xjMCQsE2X7yWj5IBRav1DFbhpA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC11994a.AbstractC11995a.this.onSpaceLoaded((ArrayList) obj);
            }
        }, $$Lambda$b$k7b3MMdwFwYO4Pdr8NqFLLQcE.INSTANCE);
    }
}
