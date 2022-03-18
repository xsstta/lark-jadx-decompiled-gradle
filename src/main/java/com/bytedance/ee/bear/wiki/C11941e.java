package com.bytedance.ee.bear.wiki;

import android.app.Application;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8202k;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wiki.wikitree.C12076c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.wiki.e */
public class C11941e extends AbstractC11902a {

    /* renamed from: a */
    private Application f32293a;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public void notifyWikiAdded() {
        Application application = this.f32293a;
        if (application != null) {
            C12076c.m49997a(application);
        }
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public AbstractC68307f<Boolean> cleanWikiRecentListDataFlowable() {
        return AbstractC68307f.m265083a(C8153a.m32844b()).mo237985a(C11678b.m48479c()).mo238020d($$Lambda$e$uxvaIZKqnams_2ZDOh1umPxPBIM.INSTANCE).mo237988a((Consumer<? super Throwable>) $$Lambda$e$FgRZkRYcnW0ALXdBgUYfwaUBtWw.INSTANCE).mo238011b((AbstractC70020b) AbstractC68307f.m265083a((Object) false));
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public AbstractC68307f<ArrayList<WikiDocument>> getRecentWikiFlowable() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d($$Lambda$e$y1ZOfHsdXogVP0eCtjcSZfwTWLk.INSTANCE).mo237988a((Consumer<? super Throwable>) $$Lambda$e$_hpNttprcExVyKjFqLcGDFUSWY.INSTANCE).mo238011b((AbstractC70020b) AbstractC68307f.m265083a((Object) new ArrayList()));
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11902a, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
        super.lazyInit(application);
        this.f32293a = application;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m49496a(C8153a aVar) throws Exception {
        C13479a.m54764b("WikiListDataServiceImpl", "cleanWikiRecentListDataFlowable clearRecentWiki");
        aVar.mo31652p();
        C13479a.m54764b("WikiListDataServiceImpl", "cleanWikiRecentListDataFlowable clearWikiSpace");
        aVar.mo31653q();
        return true;
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public void saveRecentWiki(ArrayList<WikiDocument> arrayList) {
        try {
            C13479a.m54764b("WikiListDataServiceImpl", "WikiListDataServiceImpl saveRecentWiki");
            C8153a.m32844b().mo31626e(C8202k.m33599a(arrayList));
        } catch (Exception e) {
            C13479a.m54761a("WikiListDataServiceImpl", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ArrayList m49497a(String str) throws Exception {
        ArrayList<Document> a = C8202k.m33600a(C8153a.m32844b().mo31651o());
        ArrayList arrayList = new ArrayList();
        Iterator<Document> it = a.iterator();
        while (it.hasNext()) {
            Document next = it.next();
            if (next instanceof WikiDocument) {
                arrayList.add((WikiDocument) next);
            }
        }
        C13479a.m54764b("WikiListDataServiceImpl", "getRecentWikiFlowable() RecentWikis size=" + arrayList.size());
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
    public void notifyWikiNodeRemoved(String str, String str2) {
        Application application = this.f32293a;
        if (application != null) {
            C12076c.m49998a(application, str2, str);
        }
    }
}
