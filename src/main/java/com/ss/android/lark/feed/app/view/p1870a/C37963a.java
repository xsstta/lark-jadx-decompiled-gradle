package com.ss.android.lark.feed.app.view.p1870a;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.view.a.a */
public class C37963a {

    /* renamed from: a */
    private final FeedListAdapter f97439a;

    /* renamed from: b */
    private final RecyclerView f97440b;

    /* renamed from: c */
    private final List<Integer> f97441c = new ArrayList();

    /* renamed from: com.ss.android.lark.feed.app.view.a.a$a */
    public interface AbstractC37964a {
        /* renamed from: a */
        int mo138871a(int i);

        /* renamed from: a */
        void mo138872a();

        /* renamed from: a */
        void mo138873a(FeedFilter feedFilter);

        /* renamed from: b */
        void mo138874b();

        /* renamed from: c */
        int mo138875c();

        /* renamed from: d */
        void mo138876d();
    }

    /* renamed from: a */
    public void mo139021a() {
        this.f97441c.clear();
    }

    /* renamed from: a */
    private boolean m149325a(int i) {
        if (!this.f97441c.contains(Integer.valueOf(i))) {
            this.f97441c.add(Integer.valueOf(i));
            return false;
        }
        mo139021a();
        return true;
    }

    public C37963a(FeedListAdapter feedListAdapter, RecyclerView recyclerView) {
        this.f97439a = feedListAdapter;
        this.f97440b = recyclerView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.feed.app.entity.UIFeedCard mo139020a(com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a r12, java.lang.Boolean r13, java.lang.Boolean r14) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.view.p1870a.C37963a.mo139020a(com.ss.android.lark.feed.app.view.a.a$a, java.lang.Boolean, java.lang.Boolean):com.ss.android.lark.feed.app.entity.UIFeedCard");
    }
}
