package com.ss.android.lark.feed.app.model.p1862b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.hitpoint.FeedApm;
import com.ss.android.lark.feed.app.model.cache.C37719d;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.FeedCursor;
import com.ss.android.lark.feed.service.impl.PullType;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.feed.app.model.b.i */
public class C37704i extends AbstractC37691d<C37702h, C37707j> {

    /* renamed from: g */
    protected AbstractC37706a f96655g;

    /* renamed from: h */
    protected FeedCard.FeedType f96656h;

    /* renamed from: i */
    protected FeedFilter f96657i;

    /* renamed from: com.ss.android.lark.feed.app.model.b.i$a */
    public interface AbstractC37706a {
        /* renamed from: a */
        int mo138216a(FeedCard.FeedType feedType, FeedFilter feedFilter, long j);

        /* renamed from: b */
        long mo138217b(FeedCard.FeedType feedType, FeedFilter feedFilter);

        /* renamed from: c */
        FeedCursor mo138218c(FeedCard.FeedType feedType, FeedFilter feedFilter);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d
    /* renamed from: b */
    public void mo138155b() {
        boolean z = !this.f96606a.get();
        C37728b bVar = this.f96607b;
        super.mo138155b();
        if (z) {
            C37268c.m146766b().mo139195n().mo139358d("load_feed", bVar.mo138385a());
        }
    }

    /* renamed from: a */
    private long m148239a(long j) {
        return (long) this.f96655g.mo138216a(this.f96656h, this.f96657i, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo138214b(C37702h hVar) {
        if (FeedFgUtils.m146775c()) {
            FeedCursor c = this.f96655g.mo138218c(this.f96656h, this.f96657i);
            hVar.mo138187a(c);
            if (c.mo139466a() == FeedCursor.f97764c.mo139471a().mo139466a() && c.mo139467b() == FeedCursor.f97764c.mo139471a().mo139467b()) {
                hVar.mo138186a(PullType.REFRESH);
                return;
            }
        } else {
            long b = this.f96655g.mo138217b(this.f96656h, this.f96657i);
            if (b == C37719d.f96695a.longValue() || b <= 0) {
                hVar.mo138186a(PullType.REFRESH);
                hVar.mo138183a(0L);
                return;
            }
            hVar.mo138183a(b);
        }
        hVar.mo138186a(PullType.LOAD_MORE);
    }

    /* renamed from: a */
    public boolean mo138135a(C37702h hVar) {
        long j;
        FeedCursor c = this.f96655g.mo138218c(this.f96656h, this.f96657i);
        this.f96655g.mo138217b(this.f96656h, this.f96657i);
        if (!FeedFgUtils.m146775c()) {
            long b = this.f96655g.mo138217b(this.f96656h, this.f96657i);
            if (b <= 0) {
                Log.m165389i("FeedModule_PageLoadStrategy", "checkNeedLoad freeze, cursor invalid, loadMoreCursor=" + c);
                return false;
            }
            j = b;
        } else if (c.mo139466a() == FeedCursor.f97764c.mo139472b().mo139466a() && c.mo139467b() == FeedCursor.f97764c.mo139472b().mo139467b()) {
            Log.m165389i("FeedModule_PageLoadStrategy", "checkNeedLoad freeze, cursor invalid, loadMoreFeedCursor=" + c.mo139466a() + "," + c.mo139467b());
            return false;
        } else {
            j = c.mo139466a();
        }
        if (hVar.mo138198i() == null || hVar.mo138198i() == C37548b.m147657a().mo137792b()) {
            long a = m148239a(j);
            if (((long) (hVar.mo138197h() + hVar.mo138199j())) >= a) {
                return super.mo138135a((C37728b) hVar);
            }
            Log.m165389i("FeedModule_PageLoadStrategy", "checkNeedLoad freeze, showPosition=" + hVar.mo138197h() + ", bufferCount=" + hVar.mo138199j() + ", loadedCount=" + a);
            return false;
        }
        Log.m165389i("FeedModule_PageLoadStrategy", "checkNeedLoad freeze, filter invalid, paramsFilter=" + hVar.mo138198i() + ", currentFilter=" + C37548b.m147657a().mo137792b());
        return false;
    }

    /* renamed from: a */
    public void mo138212a(C37702h hVar, AbstractC38118b.C38119a aVar) {
        if (C37713d.f96684n && hVar.mo138196g() != PullType.BETWEEN_CURSOR && aVar.f97740a <= 0) {
            Log.m165379d("FeedModule_PageLoadStrategy", "checkMonitorBadge");
            CoreThreadPool.getBackgroundHandler().postDelayed(new FeedApm.CheckMonitorBadgeRunnable(aVar.f97746g, aVar.f97747h, false), 3000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138133a(final C37702h hVar, final AbstractC37691d.AbstractC37692a aVar) {
        if (this.f96656h == FeedCard.FeedType.DONE) {
            hVar.mo138184a(FeedCard.FilterType.FILTER_ALL);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            boolean a = mo138135a(hVar);
            mo138154a(a, aVar);
            while (true) {
                if (!a || !mo138135a(hVar)) {
                    break;
                }
                mo138214b(hVar);
                Log.m165389i("FeedModule_PageLoadStrategy", "begin PageLoad contextId=" + hVar.mo138385a() + " feedType= " + this.f96656h + " cursor=" + hVar.mo138191c() + " feedCursor=" + hVar.mo138200k() + " filter=" + hVar.mo138198i() + " showPosition=" + hVar.mo138197h());
                ((C37707j) this.f96608c).mo138219a(hVar, new DataLoader.AbstractC37726a<AbstractC38118b.C38119a>() {
                    /* class com.ss.android.lark.feed.app.model.p1862b.C37704i.C377051 */

                    @Override // com.ss.android.lark.feed.app.model.common.DataLoader.AbstractC37726a
                    /* renamed from: a */
                    public void mo137409a(ErrorResult errorResult) {
                        C37704i.this.mo138152a(errorResult, aVar);
                        atomicBoolean.set(true);
                    }

                    /* renamed from: a */
                    public void mo137411a(AbstractC38118b.C38119a aVar) {
                        C38126b bVar;
                        long j = aVar.f97740a;
                        long c = hVar.mo138191c();
                        if (hVar.mo138196g() == PullType.REFRESH) {
                            long j2 = aVar.f97740a;
                            long c2 = hVar.mo138191c();
                            if (j2 < c2) {
                                if (!FeedFgSyncUtil.m146721a()) {
                                    j = c2;
                                } else {
                                    Log.m165397w("FeedModule_PageLoadStrategy", "refresh success, loadMoreCursor=" + j2 + ", refreshTime=" + c2);
                                }
                            }
                            if (!CollectionUtils.isEmpty(aVar.f97745f)) {
                                c = aVar.f97744e;
                            } else {
                                c = j;
                            }
                        }
                        if (aVar.f97741b != null) {
                            bVar = new C38126b(aVar.f97741b);
                        } else {
                            bVar = new C38126b(j, c);
                        }
                        C37704i.this.mo138153a(new AbstractC37691d.C37694c(aVar.f97745f, aVar.f97743d, bVar, aVar.f97746g), aVar);
                        C37704i.this.mo138212a(hVar, aVar);
                    }
                });
                if (atomicBoolean.get()) {
                    break;
                }
                hVar.mo138386a(C53234a.m205877a());
            }
        } finally {
            mo138157b(atomicBoolean.get(), aVar);
        }
    }

    public C37704i(FeedCard.FeedType feedType, FeedFilter feedFilter, AbstractC37706a aVar, AbstractC37691d.AbstractC37693b bVar) {
        super(bVar);
        this.f96656h = feedType;
        this.f96657i = feedFilter;
        this.f96655g = aVar;
        this.f96608c = new C37707j(feedType);
    }
}
