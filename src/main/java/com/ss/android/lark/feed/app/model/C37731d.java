package com.ss.android.lark.feed.app.model;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.AbstractC29617j;
import com.ss.android.lark.biz.im.api.AbstractC29618k;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.model.C37788k;
import com.ss.android.lark.feed.app.model.cache.C37716b;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.interfaces.AbstractC38098i;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.Status;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.feed.app.model.d */
public class C37731d implements AbstractC37773h {

    /* renamed from: a */
    public final ConcurrentHashMap<AbstractC37734b, Integer> f96758a;

    /* renamed from: b */
    public final List<AbstractC38098i.AbstractC38100b> f96759b;

    /* renamed from: c */
    public volatile C37716b f96760c;

    /* renamed from: d */
    public volatile C37774i f96761d;

    /* renamed from: e */
    public final Set<AbstractC29617j> f96762e;

    /* renamed from: f */
    public final AbstractC38037a.AbstractC38050j f96763f;

    /* renamed from: g */
    private volatile C37788k f96764g;

    /* renamed from: h */
    private boolean f96765h;

    /* renamed from: i */
    private boolean f96766i;

    /* renamed from: j */
    private final AtomicInteger f96767j;

    /* renamed from: k */
    private String f96768k;

    /* renamed from: l */
    private final List<AbstractC29618k> f96769l;

    /* renamed from: m */
    private final AbstractC38037a.AbstractC38038a f96770m;

    /* renamed from: com.ss.android.lark.feed.app.model.d$b */
    public static abstract class AbstractC37734b {
        /* renamed from: a */
        public void mo138429a(FeedCard.FeedType feedType, LoadState.LoadType loadType) {
        }

        /* renamed from: a */
        public void mo138430a(LoadState loadState, FeedCard.FeedType feedType) {
        }

        /* renamed from: a */
        public void mo138108a(UpdateRecord updateRecord) {
        }

        /* renamed from: a */
        public void mo137402a(Map<Integer, Integer> map) {
        }

        /* renamed from: a */
        public void mo138431a(boolean z) {
        }

        /* renamed from: b */
        public void mo138109b(UpdateRecord updateRecord) {
        }

        /* renamed from: c */
        public void mo138432c(UpdateRecord updateRecord) {
        }

        /* renamed from: d */
        public void mo138433d(UpdateRecord updateRecord) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.model.d$c */
    public static class C37735c {

        /* renamed from: a */
        static C37731d f96773a = new C37731d();
    }

    /* renamed from: a */
    public static C37731d m148488a() {
        return C37735c.f96773a;
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: c */
    public String mo138412c() {
        return this.f96768k;
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: a */
    public void mo138402a(AbstractC37734b bVar) {
        if (this.f96758a.get(bVar) == null) {
            this.f96758a.put(bVar, 0);
        }
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: a */
    public void mo138404a(boolean z) {
        C37774i iVar = this.f96761d;
        if (this.f96767j.get() == 2 && iVar != null) {
            iVar.mo138493a(z);
        }
    }

    /* renamed from: a */
    public void mo138403a(AbstractC38098i.AbstractC38100b bVar) {
        if (bVar != null) {
            this.f96759b.add(bVar);
        }
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: h */
    public UpdateRecord mo138417h() {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return null;
        }
        return bVar.mo138281c(FeedCard.FeedType.INBOX);
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: j */
    public UpdateRecord mo138419j() {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return null;
        }
        return bVar.mo138276b();
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: k */
    public UpdateRecord mo138420k() {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return null;
        }
        return bVar.mo138280c();
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: l */
    public UpdateRecord mo138421l() {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return null;
        }
        return bVar.mo138283d();
    }

    /* renamed from: m */
    public boolean mo138422m() {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return false;
        }
        return bVar.mo138288g();
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: p */
    public Map<Integer, Integer> mo138425p() {
        C37716b bVar = this.f96760c;
        if (bVar != null) {
            return bVar.mo138286e();
        }
        return null;
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: q */
    public void mo138426q() {
        if (this.f96761d != null) {
            this.f96761d.mo138497e();
        }
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: d */
    public boolean mo138413d() {
        if (this.f96760c == null) {
            return true;
        }
        return !this.f96760c.mo138175d(FeedCard.FeedType.INBOX, C37548b.m147657a().mo137792b());
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: i */
    public UpdateRecord mo138418i() {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return null;
        }
        C37774i iVar = this.f96761d;
        if (this.f96767j.get() == 2 && iVar != null) {
            iVar.mo138496d();
        }
        return bVar.mo138281c(FeedCard.FeedType.DONE);
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: n */
    public LoadState mo138423n() {
        C37716b bVar = this.f96760c;
        if (this.f96767j.get() != 2 || bVar == null) {
            return new LoadState();
        }
        return bVar.mo138285e(FeedCard.FeedType.INBOX);
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: o */
    public LoadState mo138424o() {
        C37716b bVar = this.f96760c;
        if (this.f96767j.get() != 2 || bVar == null) {
            return new LoadState();
        }
        return this.f96760c.mo138285e(FeedCard.FeedType.DONE);
    }

    /* renamed from: r */
    public void mo138427r() {
        for (AbstractC29618k kVar : this.f96769l) {
            kVar.onFeedLoaded();
        }
    }

    private C37731d() {
        this.f96758a = new ConcurrentHashMap<>();
        this.f96759b = new CopyOnWriteArrayList();
        this.f96767j = new AtomicInteger(0);
        this.f96768k = null;
        this.f96769l = new CopyOnWriteArrayList();
        this.f96762e = new CopyOnWriteArraySet();
        this.f96763f = C37268c.m146766b().mo139204w();
        this.f96770m = C37268c.m146766b().mo139155B();
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: f */
    public void mo138415f() {
        Log.m165389i("FeedModule_FeedDataManager", "onFirstPageDataShowed start");
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.feed.app.model.C37731d.RunnableC377321 */

            public void run() {
                Log.m165389i("FeedModule_FeedDataManager", "forceReloadDingData start");
                C37731d.this.f96763f.mo139250d();
            }
        }, 500, TimeUnit.MILLISECONDS);
        C37774i iVar = this.f96761d;
        if (this.f96767j.get() == 2 && iVar != null) {
            iVar.mo138498f();
        }
    }

    /* renamed from: e */
    public void mo138414e() {
        C37774i iVar = this.f96761d;
        if (this.f96767j.get() == 2 && iVar != null) {
            Log.m165389i("FeedModule_FeedDataManager", "start preloadInboxData, thread=" + Thread.currentThread().getName());
            iVar.mo138495c();
            AbstractC38037a.AbstractC38062v v = C37268c.m146766b().mo139203v();
            if (!C37268c.m146766b().mo139203v().mo139304g()) {
                v.mo139293a();
            }
        }
    }

    /* renamed from: g */
    public synchronized void mo138416g() {
        Log.m165389i("FeedModule_FeedDataManager", "unInit " + this.f96770m.mo139208a());
        this.f96767j.set(0);
        if (this.f96764g != null) {
            this.f96764g.mo138521a();
            this.f96764g = null;
            this.f96765h = false;
            this.f96766i = false;
        }
        if (this.f96760c != null) {
            this.f96760c.mo138266a();
            this.f96760c = null;
        }
        if (this.f96761d != null) {
            this.f96761d.mo138494b();
            this.f96761d = null;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo138410b() {
        Log.m165389i("FeedModule_FeedDataManager", "init " + this.f96770m.mo139208a());
        this.f96768k = this.f96770m.mo139208a();
        if (!this.f96767j.compareAndSet(0, 1)) {
            return false;
        }
        this.f96760c = new C37716b();
        this.f96760c.mo138272a(this.f96770m.mo139208a());
        this.f96760c.mo138269a(new C37733a());
        this.f96764g = new C37788k(this.f96760c);
        this.f96764g.mo138524a(new C37736d());
        this.f96765h = true;
        this.f96766i = true;
        this.f96761d = new C37774i(this.f96760c);
        this.f96761d.mo138487a();
        if (this.f96767j.compareAndSet(1, 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.feed.app.model.d$a */
    public class C37733a implements ICache.AbstractC37714a {
        public C37733a() {
        }

        @Override // com.ss.android.lark.feed.app.model.cache.ICache.AbstractC37714a
        /* renamed from: b */
        public void mo138260b(boolean z) {
            C37774i iVar = C37731d.this.f96761d;
            if (iVar != null) {
                iVar.mo138497e();
            }
        }

        @Override // com.ss.android.lark.feed.app.model.cache.ICache.AbstractC37714a
        /* renamed from: a */
        public void mo138259a(boolean z) {
            for (AbstractC37734b bVar : C37731d.this.f96758a.keySet()) {
                if (bVar != null) {
                    bVar.mo138431a(z);
                }
            }
        }

        @Override // com.ss.android.lark.feed.app.model.cache.ICache.AbstractC37714a
        /* renamed from: a */
        public void mo138257a(UpdateRecord updateRecord) {
            if (updateRecord.mo138381h() == 2) {
                for (AbstractC37734b bVar : C37731d.this.f96758a.keySet()) {
                    if (bVar != null) {
                        bVar.mo138432c(updateRecord);
                    }
                }
            } else if (updateRecord.mo138381h() == 3) {
                for (AbstractC37734b bVar2 : C37731d.this.f96758a.keySet()) {
                    if (bVar2 != null) {
                        bVar2.mo138433d(updateRecord);
                    }
                }
            } else if (updateRecord.mo138381h() == 0) {
                for (AbstractC37734b bVar3 : C37731d.this.f96758a.keySet()) {
                    if (bVar3 != null) {
                        bVar3.mo138108a(updateRecord);
                    }
                }
            } else if (updateRecord.mo138381h() == 1) {
                if (C37731d.this.f96760c != null && C37731d.this.f96760c.mo138279b(FeedCard.FeedType.DONE)) {
                    C37731d.this.f96760c.mo138231a(FeedCard.FeedType.DONE, C37731d.this.f96760c.mo138287f());
                }
                for (AbstractC37734b bVar4 : C37731d.this.f96758a.keySet()) {
                    if (bVar4 != null) {
                        bVar4.mo138109b(updateRecord);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.feed.app.model.cache.ICache.AbstractC37714a
        /* renamed from: a */
        public void mo138258a(Map<Integer, Integer> map) {
            for (AbstractC37734b bVar : C37731d.this.f96758a.keySet()) {
                if (bVar != null) {
                    bVar.mo137402a(map);
                }
            }
            for (AbstractC38098i.AbstractC38100b bVar2 : C37731d.this.f96759b) {
                bVar2.onBadgeChange(map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())).intValue());
            }
        }

        @Override // com.ss.android.lark.feed.app.model.cache.ICache.AbstractC37714a
        /* renamed from: a */
        public void mo138256a(LoadState loadState, FeedCard.FeedType feedType) {
            for (AbstractC37734b bVar : C37731d.this.f96758a.keySet()) {
                if (bVar != null) {
                    bVar.mo138430a(loadState, feedType);
                }
            }
        }

        @Override // com.ss.android.lark.feed.app.model.cache.ICache.AbstractC37714a
        /* renamed from: a */
        public void mo138255a(FeedCard.FeedType feedType, LoadState.LoadType loadType) {
            for (AbstractC37734b bVar : C37731d.this.f96758a.keySet()) {
                if (bVar != null) {
                    bVar.mo138429a(feedType, loadType);
                }
            }
            for (AbstractC29617j jVar : C37731d.this.f96762e) {
                if (jVar != null) {
                    jVar.mo106725a();
                }
            }
            C37262a.m146726a().mo139166M().mo139283a("conversation");
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.model.d$d */
    public class C37736d implements C37788k.AbstractC37798a {
        public C37736d() {
        }

        @Override // com.ss.android.lark.feed.app.model.C37788k.AbstractC37798a
        /* renamed from: a */
        public void mo138435a(FeedFilter feedFilter) {
            C37731d.this.f96760c.mo138282c(feedFilter);
            Log.m165389i("FeedModule_FeedDataManager", "current filter is " + C37548b.m147657a().mo137792b().getValue() + ", reload filter is " + feedFilter.getValue());
            if (C37548b.m147657a().mo137792b() == feedFilter) {
                C37731d.this.mo138399a(feedFilter, true);
            }
        }

        @Override // com.ss.android.lark.feed.app.model.C37788k.AbstractC37798a
        /* renamed from: a */
        public void mo138434a(FeedCard.FeedType feedType, C38126b bVar, int i) {
            C37774i iVar = C37731d.this.f96761d;
            if (iVar != null) {
                iVar.mo138489a(feedType, bVar, i);
            }
        }
    }

    /* renamed from: a */
    public void mo138397a(AbstractC29617j jVar) {
        this.f96762e.add(jVar);
    }

    /* renamed from: b */
    public void mo138405b(AbstractC29617j jVar) {
        this.f96762e.remove(jVar);
    }

    /* renamed from: a */
    public UIFeedCard mo138393a(String str) {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return null;
        }
        return bVar.mo138275b(str);
    }

    /* renamed from: b */
    public void mo138406b(AbstractC29618k kVar) {
        if (kVar != null) {
            this.f96769l.remove(kVar);
        }
    }

    /* renamed from: a */
    public UpdateRecord mo138394a(FeedFilter feedFilter) {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return null;
        }
        return bVar.mo138265a(feedFilter);
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: b */
    public void mo138408b(AbstractC37734b bVar) {
        this.f96758a.remove(bVar);
    }

    /* renamed from: a */
    public void mo138395a(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.INBOX) {
            if (this.f96765h && this.f96764g != null) {
                this.f96764g.mo138523a(feedType, Status.FINISHED);
                this.f96765h = false;
            }
        } else if (feedType == FeedCard.FeedType.DONE && this.f96766i && this.f96764g != null) {
            this.f96764g.mo138523a(feedType, Status.FINISHED);
            this.f96766i = false;
        }
    }

    /* renamed from: b */
    public void mo138409b(AbstractC38098i.AbstractC38100b bVar) {
        if (bVar != null) {
            this.f96759b.remove(bVar);
        }
    }

    /* renamed from: c */
    private void m148489c(FeedFilter feedFilter) {
        C37716b bVar = this.f96760c;
        if (bVar != null) {
            bVar.mo138284d(feedFilter);
            UpdateRecord a = this.f96760c.mo138265a(feedFilter);
            boolean d = this.f96760c.mo138175d(a.mo138373b(), feedFilter);
            if (!a.mo138378e() || d) {
                bVar.mo138270a(a);
                Log.m165389i("FeedModule_FeedDataManager", "update items by cache, feedFilter=" + feedFilter.getValue() + ", isDataEmpty=" + a.mo138378e());
                return;
            }
        }
        C37774i iVar = this.f96761d;
        if (iVar != null) {
            iVar.mo138490a(feedFilter);
        }
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: b */
    public void mo138407b(FeedFilter feedFilter) {
        Log.m165389i("FeedModule_FeedDataManager", "changeFeedFilter, feedFilter=" + feedFilter.getValue() + "," + feedFilter.toString());
        if (FeedFgSyncUtil.m146721a()) {
            m148489c(feedFilter);
            return;
        }
        C37716b bVar = this.f96760c;
        if (bVar != null) {
            bVar.mo138277b(feedFilter);
            bVar.mo138284d(feedFilter);
        }
        C37774i iVar = this.f96761d;
        if (iVar != null) {
            iVar.mo138490a(feedFilter);
        }
    }

    /* renamed from: a */
    public void mo138398a(AbstractC29618k kVar) {
        if (kVar != null) {
            this.f96769l.add(kVar);
        }
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: b */
    public boolean mo138411b(FeedCard.FeedType feedType) {
        C37716b bVar = this.f96760c;
        if (bVar == null) {
            return true;
        }
        return bVar.mo138274a(feedType);
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: a */
    public void mo138400a(FeedPreview feedPreview) {
        C37774i iVar = this.f96761d;
        if (this.f96767j.get() == 2 && iVar != null) {
            iVar.mo138488a(feedPreview.getFeedType(), 0, feedPreview);
        }
    }

    /* renamed from: a */
    public void mo138399a(FeedFilter feedFilter, boolean z) {
        if (z) {
            C37716b bVar = this.f96760c;
            if (bVar != null) {
                bVar.mo138277b(feedFilter);
                bVar.mo138284d(feedFilter);
            }
            C37774i iVar = this.f96761d;
            if (iVar != null) {
                iVar.mo138490a(feedFilter);
                return;
            }
            return;
        }
        mo138407b(feedFilter);
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: a */
    public void mo138401a(UIFeedCard uIFeedCard, FeedCard.FeedType feedType) {
        C37716b bVar = this.f96760c;
        if (bVar != null) {
            bVar.mo138273a(uIFeedCard.getId(), feedType);
        }
    }

    @Override // com.ss.android.lark.feed.app.model.AbstractC37773h
    /* renamed from: a */
    public void mo138396a(FeedCard.FeedType feedType, int i, FeedPreview feedPreview) {
        C37774i iVar = this.f96761d;
        if (this.f96767j.get() == 2 && iVar != null) {
            iVar.mo138488a(feedType, i, feedPreview);
        }
    }
}
