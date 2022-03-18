package com.bytedance.ee.bear.wiki;

import android.app.Application;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.wiki.h */
public class C11956h extends AbstractC11904b {
    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.service.AbstractC10933f, com.bytedance.ee.bear.wiki.AbstractC11904b
    /* renamed from: b */
    public Class<?>[] mo16351b() {
        return new Class[]{am.class};
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a, com.bytedance.ee.bear.wiki.AbstractC11904b
    public void lazyInit(Application application) {
        super.lazyInit(application);
        C13479a.m54764b("WikiServiceImpl", "lazyInit start");
        C13479a.m54764b("WikiServiceImpl", "lazyInit end");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m49529a(Long l) throws Exception {
        return mo45781c().mo41508c(AbstractC11940d.class).mo238014c($$Lambda$6US6hIo8tjTs8MeQThrzMGwBGF0.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11955g
    public void updateWikiTitle(OfflineRenameData offlineRenameData) {
        C13479a.m54764b("WikiServiceImpl", "updateWikiTitle");
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31495a(offlineRenameData);
    }

    @Override // com.bytedance.ee.bear.wiki.AbstractC11955g
    public AbstractC68307f<Boolean> cleanWikiDataFlowable(long j) {
        C13479a.m54764b("WikiServiceImpl", "cleanWikiDataFlowable() beforeTimeInMills=" + j);
        return AbstractC68307f.m265083a(Long.valueOf(j)).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.wiki.$$Lambda$h$5t6CTU9tYQBsQ4wCFi_2FSIAhUE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11956h.this.m49529a((Long) obj);
            }
        }).mo238014c(new Function(j) {
            /* class com.bytedance.ee.bear.wiki.$$Lambda$h$MIVtvriiT2Na5PAg9RDSLFc3Yvc */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11956h.this.m49528a(this.f$1, (ArrayList) obj);
            }
        }).mo237988a((Consumer<? super Throwable>) $$Lambda$h$hSWhXRJK6xnOYMHllwxa5jo6uXI.INSTANCE).mo238011b((AbstractC70020b) AbstractC68307f.m265083a((Object) false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m49530a(ArrayList arrayList) throws Exception {
        return mo45781c().mo41508c(AbstractC5094ag.class).mo237985a(C11678b.m48479c()).mo238020d(new Function(arrayList) {
            /* class com.bytedance.ee.bear.wiki.$$Lambda$h$d5FVbKdBOIEKQGfSsXAKLVEICbw */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11956h.m49526a(this.f$0, (AbstractC5094ag) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m49526a(ArrayList arrayList, AbstractC5094ag agVar) throws Exception {
        C13479a.m54764b("WikiServiceImpl", "cleanWikiDataFlowable() start delDocsList, size=" + arrayList.size());
        agVar.delDocsList(arrayList);
        C13479a.m54764b("WikiServiceImpl", "cleanWikiDataFlowable() end delDocsList");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m49528a(long j, ArrayList arrayList) throws Exception {
        return AbstractC68307f.m265091a(mo45781c().mo41508c(AbstractC11940d.class).mo237985a(C11678b.m48479c()).mo238014c($$Lambda$Uzhjs9nksnNvoSPA_YylORLi8U.INSTANCE), AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(arrayList, j) {
            /* class com.bytedance.ee.bear.wiki.$$Lambda$h$KmThJ_RzwBkXurvMQyuVwqJlm1U */
            public final /* synthetic */ ArrayList f$0;
            public final /* synthetic */ long f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11956h.m49527a(this.f$0, this.f$1, (String) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.wiki.$$Lambda$h$KBBeJ4AHU6ESTGkMLXCaep39sw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11956h.this.m49530a((ArrayList) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ArrayList m49527a(ArrayList arrayList, long j, String str) throws Exception {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WikiDocument wikiDocument = (WikiDocument) it.next();
            if (Long.parseLong(wikiDocument.mo32492x()) * 1000 <= j) {
                arrayList2.add(wikiDocument.mo32472o());
                arrayList2.add(wikiDocument.mo21011c());
            }
        }
        return arrayList2;
    }
}
