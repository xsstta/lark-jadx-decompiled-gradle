package com.ss.android.lark.feed.app.model.cache;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.model.cache.ICache;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.feed.app.model.cache.a */
public class C37715a {

    /* renamed from: a */
    private Integer f96688a = new Integer(0);

    /* renamed from: b */
    private Map<Integer, Integer> f96689b;

    /* renamed from: c */
    private Map<ICache.AbstractC37714a, Integer> f96690c;

    /* renamed from: a */
    public Map<Integer, Integer> mo138261a() {
        return this.f96689b;
    }

    public C37715a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f96689b = concurrentHashMap;
        concurrentHashMap.put(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber()), 0);
        this.f96689b.put(Integer.valueOf(FeedCard.FeedType.DONE.getNumber()), 0);
        this.f96690c = new ConcurrentHashMap();
    }

    /* renamed from: b */
    public void mo138264b(ICache.AbstractC37714a aVar) {
        if (aVar == null) {
            this.f96690c.clear();
        } else {
            this.f96690c.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo138263a(ICache.AbstractC37714a aVar) {
        this.f96690c.put(aVar, this.f96688a);
        for (ICache.AbstractC37714a aVar2 : this.f96690c.keySet()) {
            aVar2.mo138258a(this.f96689b);
        }
    }

    /* renamed from: a */
    public void mo138262a(FeedCard.FeedType feedType, int i) {
        boolean z;
        synchronized (this) {
            int intValue = this.f96689b.get(Integer.valueOf(feedType.getNumber())).intValue();
            this.f96689b.put(Integer.valueOf(feedType.getNumber()), Integer.valueOf(i));
            if (intValue != i) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            for (ICache.AbstractC37714a aVar : this.f96690c.keySet()) {
                aVar.mo138258a(this.f96689b);
            }
        }
    }
}
