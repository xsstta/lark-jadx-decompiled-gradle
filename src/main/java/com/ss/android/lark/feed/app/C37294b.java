package com.ss.android.lark.feed.app;

import androidx.recyclerview.widget.C1374g;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.b */
public class C37294b extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private List<UIFeedCard> f95790a;

    /* renamed from: b */
    private List<UIFeedCard> f95791b;

    /* renamed from: c */
    private FeedFilter f95792c;

    /* renamed from: d */
    private FeedFilter f95793d;

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        return this.f95790a.size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        return this.f95791b.size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        return this.f95790a.get(i).getId().equals(this.f95791b.get(i2).getId());
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        FeedFilter feedFilter;
        UIFeedCard uIFeedCard = this.f95790a.get(i);
        UIFeedCard uIFeedCard2 = this.f95791b.get(i2);
        FeedFilter feedFilter2 = this.f95792c;
        if (feedFilter2 == null || (feedFilter = this.f95793d) == null || feedFilter == feedFilter2 || uIFeedCard.isRemind()) {
            return uIFeedCard.exactlyCompare(uIFeedCard2);
        }
        return false;
    }

    public C37294b(List<UIFeedCard> list, List<UIFeedCard> list2, FeedFilter feedFilter, FeedFilter feedFilter2) {
        this.f95790a = list;
        this.f95791b = list2;
        this.f95792c = feedFilter2;
        this.f95793d = feedFilter;
    }
}
