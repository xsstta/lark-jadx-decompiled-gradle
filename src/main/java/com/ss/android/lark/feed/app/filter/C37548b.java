package com.ss.android.lark.feed.app.filter;

import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.filter.b */
public class C37548b {

    /* renamed from: a */
    private FeedFilter f96274a = FeedFilter.UNKNOWN;

    /* renamed from: b */
    private volatile FeedFilter f96275b = FeedFilter.INBOX;

    /* renamed from: c */
    private FeedFilter f96276c = FeedFilter.UNKNOWN;

    /* renamed from: d */
    private Map<FeedFilter, Integer> f96277d = new HashMap();

    /* renamed from: e */
    private long f96278e = -1;

    /* renamed from: f */
    private long f96279f = -1;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.filter.b$a */
    public static class C37549a {

        /* renamed from: a */
        static C37548b f96280a = new C37548b();
    }

    /* renamed from: a */
    public static C37548b m147657a() {
        return C37549a.f96280a;
    }

    /* renamed from: b */
    public FeedFilter mo137792b() {
        return this.f96275b;
    }

    /* renamed from: c */
    public FeedFilter mo137793c() {
        return this.f96276c;
    }

    /* renamed from: d */
    public long mo137794d() {
        return this.f96278e;
    }

    /* renamed from: e */
    public long mo137795e() {
        return this.f96279f;
    }

    /* renamed from: a */
    public void mo137787a(int i) {
        this.f96277d.put(FeedFilter.INBOX, Integer.valueOf(i));
    }

    /* renamed from: b */
    public int mo137791b(FeedFilter feedFilter) {
        Integer num = this.f96277d.get(feedFilter);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public void mo137789a(FeedFilter feedFilter) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("setCurFilterType: ");
        if (feedFilter == null) {
            str = "";
        } else {
            str = feedFilter.name();
        }
        sb.append(str);
        Log.m165389i("FilterStatusManager", sb.toString());
        this.f96276c = this.f96275b;
        this.f96275b = feedFilter;
    }

    /* renamed from: a */
    public void mo137790a(List<FeedTabItemData.IFilterItem> list) {
        if (list != null) {
            for (FeedTabItemData.IFilterItem eVar : list) {
                if (eVar.mo137801b() != FeedFilter.INBOX) {
                    this.f96277d.put(eVar.mo137801b(), Integer.valueOf(eVar.mo137803c()));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo137788a(long j, long j2) {
        this.f96278e = j;
        this.f96279f = j2;
    }
}
