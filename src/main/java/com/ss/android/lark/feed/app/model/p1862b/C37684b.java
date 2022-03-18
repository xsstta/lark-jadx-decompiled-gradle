package com.ss.android.lark.feed.app.model.p1862b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.feed.app.model.b.b */
public class C37684b extends AbstractC37691d<C37682a, C37707j> {

    /* renamed from: g */
    private AbstractC37686a f96582g;

    /* renamed from: h */
    private FeedCard.FeedType f96583h;

    /* renamed from: i */
    private FeedFilter f96584i;

    /* renamed from: com.ss.android.lark.feed.app.model.b.b$a */
    public interface AbstractC37686a {
        /* renamed from: b */
        boolean mo138137b(FeedCard.FeedType feedType, FeedFilter feedFilter, C38126b bVar);
    }

    /* renamed from: a */
    public boolean mo138135a(C37682a aVar) {
        if (!this.f96582g.mo138137b(this.f96583h, this.f96584i, aVar.mo138124b())) {
            return false;
        }
        return super.mo138135a((C37728b) aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138133a(C37682a aVar, final AbstractC37691d.AbstractC37692a aVar2) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            mo138154a(false, aVar2);
            boolean a = mo138135a(aVar);
            final long j = aVar.mo138124b().f97760b;
            long j2 = aVar.mo138124b().f97759a;
            final C38126b bVar = new C38126b(j2, j);
            while (true) {
                if (!a || bVar.f97760b < j2 || bVar.f97760b <= 0 || !mo138135a(aVar)) {
                    break;
                }
                aVar.mo138183a(bVar.f97760b);
                if (this.f96583h == FeedCard.FeedType.DONE) {
                    aVar.mo138184a(FeedCard.FilterType.FILTER_ALL);
                }
                Log.m165389i("FeedModule_ContinuousStrategy", "Begin ContinuousPageLoad contextId=" + aVar.mo138385a() + " feedType= " + this.f96583h + " cursor=" + aVar.mo138191c());
                ((C37707j) this.f96608c).mo138219a(aVar, new DataLoader.AbstractC37726a<AbstractC38118b.C38119a>() {
                    /* class com.ss.android.lark.feed.app.model.p1862b.C37684b.C376851 */

                    @Override // com.ss.android.lark.feed.app.model.common.DataLoader.AbstractC37726a
                    /* renamed from: a */
                    public void mo137409a(ErrorResult errorResult) {
                        C37684b.this.mo138152a(errorResult, aVar2);
                        atomicBoolean.set(true);
                    }

                    /* renamed from: a */
                    public void mo137411a(AbstractC38118b.C38119a aVar) {
                        long j = aVar.f97740a;
                        if (aVar.f97742c || j <= 0) {
                            j = -1;
                        }
                        C37684b.this.mo138153a(new AbstractC37691d.C37694c(aVar.f97745f, aVar.f97743d, new C38126b(j, j), aVar.f97746g), aVar2);
                        bVar.f97760b = j;
                    }
                });
                if (atomicBoolean.get()) {
                    break;
                }
                aVar.mo138386a(C53234a.m205877a());
                aVar.mo138182a(10);
                bVar = bVar;
                a = a;
                j = j;
            }
        } finally {
            mo138157b(atomicBoolean.get(), aVar2);
        }
    }

    public C37684b(FeedCard.FeedType feedType, FeedFilter feedFilter, AbstractC37686a aVar, AbstractC37691d.AbstractC37693b bVar) {
        super(bVar);
        this.f96583h = feedType;
        this.f96584i = feedFilter;
        this.f96582g = aVar;
        this.f96608c = new C37707j(feedType);
    }
}
