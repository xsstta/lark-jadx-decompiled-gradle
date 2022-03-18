package com.ss.android.lark.feed.app.model;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.model.h */
public interface AbstractC37773h {
    /* renamed from: a */
    void mo138396a(FeedCard.FeedType feedType, int i, FeedPreview feedPreview);

    /* renamed from: a */
    void mo138400a(FeedPreview feedPreview);

    /* renamed from: a */
    void mo138401a(UIFeedCard uIFeedCard, FeedCard.FeedType feedType);

    /* renamed from: a */
    void mo138402a(C37731d.AbstractC37734b bVar);

    /* renamed from: a */
    void mo138404a(boolean z);

    /* renamed from: b */
    void mo138407b(FeedFilter feedFilter);

    /* renamed from: b */
    void mo138408b(C37731d.AbstractC37734b bVar);

    /* renamed from: b */
    boolean mo138411b(FeedCard.FeedType feedType);

    /* renamed from: c */
    String mo138412c();

    /* renamed from: d */
    boolean mo138413d();

    /* renamed from: f */
    void mo138415f();

    /* renamed from: h */
    UpdateRecord mo138417h();

    /* renamed from: i */
    UpdateRecord mo138418i();

    /* renamed from: j */
    UpdateRecord mo138419j();

    /* renamed from: k */
    UpdateRecord mo138420k();

    /* renamed from: l */
    UpdateRecord mo138421l();

    /* renamed from: n */
    LoadState mo138423n();

    /* renamed from: o */
    LoadState mo138424o();

    /* renamed from: p */
    Map<Integer, Integer> mo138425p();

    /* renamed from: q */
    void mo138426q();
}
