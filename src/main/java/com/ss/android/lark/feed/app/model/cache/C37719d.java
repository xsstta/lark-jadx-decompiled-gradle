package com.ss.android.lark.feed.app.model.cache;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.FeedCursor;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.cache.d */
public class C37719d {

    /* renamed from: a */
    public static final Long f96695a = Long.MAX_VALUE;

    /* renamed from: b */
    protected List<C38126b> f96696b = new ArrayList();

    /* renamed from: c */
    private FeedCard.FeedType f96697c;

    /* renamed from: d */
    private FeedFilter f96698d;

    /* renamed from: e */
    private int f96699e;

    /* renamed from: f */
    private volatile long f96700f = f96695a.longValue();

    /* renamed from: g */
    private volatile FeedCursor f96701g = FeedCursor.f97764c.mo139471a();

    /* renamed from: a */
    public long mo138291a() {
        return this.f96700f;
    }

    /* renamed from: c */
    public FeedCursor mo138297c() {
        return this.f96701g;
    }

    /* renamed from: b */
    public boolean mo138296b() {
        if ((this.f96701g.mo139466a() == FeedCursor.f97764c.mo139472b().mo139466a() && this.f96701g.mo139467b() == FeedCursor.f97764c.mo139472b().mo139467b()) || this.f96700f == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public long mo138299d() {
        long longValue = f96695a.longValue();
        synchronized (this) {
            for (C38126b bVar : this.f96696b) {
                if (longValue > bVar.f97759a) {
                    longValue = bVar.f97759a;
                }
            }
        }
        return longValue;
    }

    /* renamed from: e */
    public void mo138300e() {
        long d = mo138299d();
        if (d != this.f96700f) {
            this.f96700f = d;
            Log.m165389i("FeedModule_CursorCache", "feedType=" + this.f96697c + " feedFilter=" + this.f96698d + " updateNextLoadMoreCursor:" + d);
        }
    }

    /* renamed from: b */
    public void mo138295b(List<C38126b> list) {
        String a;
        if (!CollectionUtils.isEmpty(list)) {
            synchronized (this) {
                this.f96696b.addAll(list);
                a = mo138292a(this.f96696b);
            }
            Log.m165389i("FeedModule_CursorCache", "feedType=" + this.f96697c + " feedFilter=" + this.f96698d + " saveLoadMoreCursorTime:" + a);
        }
    }

    /* renamed from: c */
    public boolean mo138298c(C38126b bVar) {
        synchronized (this) {
            if (this.f96700f != f96695a.longValue() && bVar.f97760b < this.f96700f) {
                return false;
            }
            for (C38126b bVar2 : this.f96696b) {
                if (bVar2.f97760b >= bVar.f97760b && bVar2.f97759a <= bVar.f97759a) {
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo138292a(List<C38126b> list) {
        Collections.sort(list);
        if (list.size() != 1) {
            ArrayList arrayList = new ArrayList();
            C38126b bVar = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                C38126b bVar2 = list.get(i);
                if (bVar2.f97760b + 1 < bVar.f97759a) {
                    arrayList.add(bVar);
                    bVar = bVar2;
                } else if (bVar.f97759a > bVar2.f97759a) {
                    bVar.f97759a = bVar2.f97759a;
                }
            }
            arrayList.add(bVar);
            list.clear();
            list.addAll(arrayList);
        }
        String str = "";
        for (int i2 = 0; i2 < list.size(); i2++) {
            C38126b bVar3 = list.get(i2);
            if (i2 != 0) {
                str = str + ",";
            }
            str = str + "(" + String.valueOf(bVar3.f97760b) + "," + String.valueOf(bVar3.f97759a) + ")";
        }
        return str;
    }

    /* renamed from: b */
    public void mo138294b(C38126b bVar) {
        if (bVar == null || bVar.f97759a < 0) {
            return;
        }
        if (bVar.f97760b == 0 && bVar.f97759a == 0 && this.f96699e < 3) {
            Log.m165389i("FeedModule_CursorCache", "feedType=" + this.f96697c + " feedFilter=" + this.f96698d + " saveLoadMoreCursorTime: retry:" + this.f96699e);
            this.f96699e = this.f96699e + 1;
            return;
        }
        synchronized (this) {
            if (this.f96700f > bVar.f97759a) {
                Log.m165389i("FeedModule_CursorCache", "real update next loadMore cursoe, feedType=" + this.f96697c + " feedFilter=" + this.f96698d + " currentCursor:" + this.f96700f + " nextLoadMoreCursor:" + bVar.f97759a);
                this.f96700f = bVar.f97759a;
            }
        }
        Log.m165389i("FeedModule_CursorCache", "feedType=" + this.f96697c + " feedFilter=" + this.f96698d + " saveLoadMoreCursorTime:" + this.f96700f);
    }

    /* renamed from: a */
    public void mo138293a(C38126b bVar) {
        if (bVar != null) {
            if (bVar.f97761c != null) {
                if (bVar.f97761c.mo139466a() < 0) {
                    return;
                }
            } else if (bVar.f97759a < 0) {
                return;
            }
            synchronized (this) {
                Log.m165389i("FeedModule_CursorCache", "real update next loadMore cursoe, feedType=" + this.f96697c + " feedFilter=" + this.f96698d + " currentCursor:" + this.f96700f + " nextLoadMoreCursor:" + bVar.f97759a + " currentFeedCursor:" + this.f96701g + " nextFeedCursor:" + bVar.f97761c);
                if (bVar.f97761c != null) {
                    if (bVar.f97761c.mo139466a() <= this.f96701g.mo139466a()) {
                        this.f96701g = bVar.f97761c;
                    }
                } else if (bVar.f97759a <= this.f96700f) {
                    this.f96700f = bVar.f97759a;
                }
            }
        }
    }

    public C37719d(FeedCard.FeedType feedType, FeedFilter feedFilter) {
        this.f96697c = feedType;
        this.f96698d = feedFilter;
    }
}
