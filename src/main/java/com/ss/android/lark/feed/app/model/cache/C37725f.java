package com.ss.android.lark.feed.app.model.cache;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.feed.app.model.cache.f */
public class C37725f {

    /* renamed from: a */
    private static final Object f96733a = new Object();

    /* renamed from: b */
    private volatile LoadState f96734b = new LoadState(true, true, false);

    /* renamed from: c */
    private volatile LoadState f96735c = new LoadState();

    /* renamed from: d */
    private AtomicBoolean f96736d = new AtomicBoolean(true);

    /* renamed from: e */
    private AtomicBoolean f96737e = new AtomicBoolean(false);

    /* renamed from: f */
    private AtomicBoolean f96738f = new AtomicBoolean(true);

    /* renamed from: g */
    private AtomicBoolean f96739g = new AtomicBoolean(false);

    /* renamed from: h */
    private ConcurrentHashMap<ICache.AbstractC37714a, Object> f96740h = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo138352a(ICache.AbstractC37714a aVar) {
        this.f96740h.put(aVar, f96733a);
    }

    /* renamed from: a */
    public LoadState mo138349a(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.INBOX) {
            return this.f96734b;
        }
        return this.f96735c;
    }

    /* renamed from: b */
    public void mo138353b(ICache.AbstractC37714a aVar) {
        if (aVar == null) {
            this.f96740h.clear();
        } else {
            this.f96740h.remove(aVar);
        }
    }

    /* renamed from: b */
    private void m148443b(FeedCard.FeedType feedType, LoadState.LoadType loadType) {
        for (ICache.AbstractC37714a aVar : this.f96740h.keySet()) {
            aVar.mo138255a(feedType, loadType);
        }
    }

    /* renamed from: a */
    public void mo138350a(FeedCard.FeedType feedType, LoadState.LoadType loadType) {
        Log.m165389i("FeedModule_LoadStateCache", "updateFirstPageLoaded: feedType:" + feedType + " loadType:" + loadType);
        if (feedType == FeedCard.FeedType.INBOX) {
            if (loadType == LoadState.LoadType.NET) {
                if (this.f96736d.compareAndSet(false, true)) {
                    m148443b(feedType, loadType);
                }
            } else if (this.f96737e.compareAndSet(false, true)) {
                m148443b(feedType, loadType);
            }
        } else if (loadType == LoadState.LoadType.NET) {
            if (this.f96738f.compareAndSet(false, true)) {
                m148443b(feedType, loadType);
            }
        } else if (this.f96739g.compareAndSet(false, true)) {
            m148443b(feedType, loadType);
        }
    }

    /* renamed from: a */
    public void mo138351a(FeedCard.FeedType feedType, LoadState.LoadType loadType, boolean z) {
        Log.m165389i("FeedModule_LoadStateCache", "updateLoadState: feedType:" + feedType + " loadType:" + loadType + " isLoading:" + z);
        if (feedType == FeedCard.FeedType.INBOX) {
            this.f96734b.mo138360a(loadType, z);
            for (ICache.AbstractC37714a aVar : this.f96740h.keySet()) {
                aVar.mo138256a(this.f96734b, FeedCard.FeedType.INBOX);
            }
            return;
        }
        this.f96735c.mo138360a(loadType, z);
        for (ICache.AbstractC37714a aVar2 : this.f96740h.keySet()) {
            aVar2.mo138256a(this.f96735c, FeedCard.FeedType.DONE);
        }
    }
}
