package com.ss.android.lark.feed.app.model.cache;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.p1862b.C37684b;
import com.ss.android.lark.feed.app.model.p1862b.C37697f;
import com.ss.android.lark.feed.app.model.p1862b.C37704i;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.dto.NetworkLevel;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.FeedCursor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.model.cache.b */
public class C37716b implements C37684b.AbstractC37686a, C37697f.AbstractC37699a, C37704i.AbstractC37706a, ICache<ICache.AbstractC37714a> {

    /* renamed from: a */
    private final C37715a f96691a = new C37715a();

    /* renamed from: b */
    private final C37720e f96692b = new C37720e();

    /* renamed from: c */
    private final Map<FeedFilter, C37719d> f96693c = new HashMap() {
        /* class com.ss.android.lark.feed.app.model.cache.C37716b.C377171 */

        {
            FeedCard.FeedType feedType;
            FeedFilter[] values = FeedFilter.values();
            for (FeedFilter feedFilter : values) {
                if (feedFilter == FeedFilter.INBOX) {
                    feedType = FeedCard.FeedType.INBOX;
                } else if (feedFilter == FeedFilter.DONE) {
                    feedType = FeedCard.FeedType.DONE;
                } else {
                    feedType = null;
                }
                put(feedFilter, new C37719d(feedType, feedFilter));
            }
        }
    };

    /* renamed from: d */
    private final C37725f f96694d = new C37725f();

    /* renamed from: a */
    public void mo138272a(String str) {
        this.f96692b.mo138312a(str);
    }

    /* renamed from: a */
    public void mo138273a(String str, FeedCard.FeedType feedType) {
        this.f96692b.mo138313a(str, feedType);
    }

    /* renamed from: a */
    public void mo138269a(ICache.AbstractC37714a aVar) {
        this.f96692b.mo138310a(aVar);
        this.f96691a.mo138263a(aVar);
        this.f96694d.mo138352a(aVar);
    }

    /* renamed from: a */
    public boolean mo138274a(FeedCard.FeedType feedType) {
        return this.f96692b.mo138320a(feedType);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138238a(List<String> list) {
        this.f96692b.mo138315a(list);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138241a(Map<String, List<FeedFilter>> map) {
        this.f96692b.mo138318a(map);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138239a(List<UIFeedCard> list, FeedFilter feedFilter) {
        this.f96692b.mo138316a(list, feedFilter);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138240a(List<UIFeedCard> list, Map<String, List<FeedFilter>> map) {
        this.f96692b.mo138317a(list, map, true);
    }

    /* renamed from: a */
    public void mo138267a(BannerPreview bannerPreview) {
        this.f96692b.mo138307a(bannerPreview);
    }

    /* renamed from: a */
    public void mo138268a(UGBannerPreview uGBannerPreview, boolean z) {
        this.f96692b.mo138308a(uGBannerPreview, z);
    }

    /* renamed from: a */
    public void mo138270a(UpdateRecord updateRecord) {
        this.f96692b.mo138329b(updateRecord);
    }

    /* renamed from: a */
    public void mo138271a(NetworkLevel networkLevel) {
        this.f96692b.mo138311a(networkLevel);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138236a(FeedCard.FeedType feedType, LoadState.LoadType loadType, boolean z) {
        this.f96694d.mo138351a(feedType, loadType, z);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138235a(FeedCard.FeedType feedType, LoadState.LoadType loadType) {
        this.f96694d.mo138350a(feedType, loadType);
    }

    @Override // com.ss.android.lark.feed.app.model.p1862b.C37684b.AbstractC37686a
    /* renamed from: b */
    public boolean mo138137b(FeedCard.FeedType feedType, FeedFilter feedFilter, C38126b bVar) {
        return m148317e(feedType, feedFilter).mo138298c(bVar);
    }

    @Override // com.ss.android.lark.feed.app.model.p1862b.C37697f.AbstractC37699a
    /* renamed from: a */
    public boolean mo138174a(FeedPreview feedPreview) {
        return this.f96692b.mo138321a(feedPreview);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138237a(String str, String str2) {
        this.f96692b.mo138314a(str, str2);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138242a(boolean z) {
        this.f96692b.mo138319a(z);
    }

    /* renamed from: j */
    private C37719d m148320j() {
        return m148319f(FeedCard.FeedType.INBOX);
    }

    /* renamed from: c */
    public UpdateRecord mo138280c() {
        return this.f96692b.mo138332c();
    }

    /* renamed from: g */
    public boolean mo138288g() {
        return this.f96692b.mo138344f();
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: h */
    public void mo138252h() {
        this.f96692b.mo138345g();
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: i */
    public boolean mo138253i() {
        return this.f96692b.mo138343e();
    }

    /* renamed from: a */
    public void mo138266a() {
        mo138278b((ICache.AbstractC37714a) null);
        this.f96692b.mo138305a();
    }

    /* renamed from: d */
    public UpdateRecord mo138283d() {
        return this.f96692b.mo138303a(C37548b.m147657a().mo137792b());
    }

    /* renamed from: f */
    public int mo138287f() {
        return this.f96692b.mo138337d(FeedCard.FeedType.DONE);
    }

    /* renamed from: b */
    public UpdateRecord mo138276b() {
        return this.f96692b.mo138324b();
    }

    /* renamed from: e */
    public Map<Integer, Integer> mo138286e() {
        return this.f96691a.mo138261a();
    }

    /* renamed from: a */
    public UpdateRecord mo138265a(FeedFilter feedFilter) {
        return this.f96692b.mo138303a(feedFilter);
    }

    /* renamed from: b */
    public UIFeedCard mo138275b(String str) {
        return this.f96692b.mo138323b(str);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: d */
    public UpdateRecord mo138248d(FeedCard.FeedType feedType) {
        return this.f96692b.mo138325b(feedType);
    }

    /* renamed from: e */
    public LoadState mo138285e(FeedCard.FeedType feedType) {
        return this.f96694d.mo138349a(feedType);
    }

    /* renamed from: c */
    public UpdateRecord mo138281c(FeedCard.FeedType feedType) {
        return this.f96692b.mo138333c(feedType);
    }

    /* renamed from: e */
    private C37719d m148318e(FeedFilter feedFilter) {
        return this.f96693c.get(feedFilter);
    }

    /* renamed from: f */
    private C37719d m148319f(FeedCard.FeedType feedType) {
        FeedFilter feedFilter;
        if (feedType == FeedCard.FeedType.INBOX) {
            feedFilter = FeedFilter.INBOX;
        } else {
            feedFilter = FeedFilter.DONE;
        }
        return this.f96693c.get(feedFilter);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: d */
    public void mo138249d(int i) {
        this.f96692b.mo138326b(i);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138230a(int i) {
        this.f96692b.mo138334c(i);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: b */
    public void mo138243b(int i) {
        this.f96692b.mo138339d(i);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: c */
    public void mo138246c(int i) {
        this.f96692b.mo138306a(i);
    }

    /* renamed from: d */
    public void mo138284d(FeedFilter feedFilter) {
        this.f96692b.mo138335c(feedFilter);
    }

    /* renamed from: b */
    public void mo138277b(FeedFilter feedFilter) {
        this.f96692b.mo138327b(feedFilter);
        this.f96693c.put(feedFilter, new C37719d(FeedCard.FeedType.INBOX, feedFilter));
    }

    /* renamed from: c */
    public void mo138282c(FeedFilter feedFilter) {
        this.f96692b.mo138340d(feedFilter);
        this.f96693c.put(feedFilter, new C37719d(FeedCard.FeedType.INBOX, feedFilter));
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: d */
    public void mo138250d(List<FeedTabItemData.IFilterItem> list) {
        this.f96692b.mo138336c(list);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: e */
    public void mo138251e(List<FeedTabItemData.IFilterItem> list) {
        this.f96692b.mo138341d(list);
    }

    /* renamed from: b */
    public void mo138278b(ICache.AbstractC37714a aVar) {
        this.f96694d.mo138353b(aVar);
        this.f96692b.mo138328b(aVar);
        this.f96691a.mo138264b(aVar);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: c */
    public void mo138247c(List<UIFeedCard> list) {
        this.f96692b.mo138330b(list);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: b */
    public void mo138244b(List<UIFeedCard> list) {
        this.f96692b.mo138342e(list);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: b */
    public void mo138245b(Map<String, Integer> map) {
        this.f96692b.mo138331b(map);
    }

    /* renamed from: b */
    public boolean mo138279b(FeedCard.FeedType feedType) {
        return m148319f(feedType).mo138296b();
    }

    /* renamed from: e */
    private C37719d m148317e(FeedCard.FeedType feedType, FeedFilter feedFilter) {
        if (feedFilter != null) {
            return m148318e(feedFilter);
        }
        return m148319f(feedType);
    }

    @Override // com.ss.android.lark.feed.app.model.p1862b.C37704i.AbstractC37706a
    /* renamed from: b */
    public long mo138217b(FeedCard.FeedType feedType, FeedFilter feedFilter) {
        return m148317e(feedType, feedFilter).mo138291a();
    }

    @Override // com.ss.android.lark.feed.app.model.p1862b.C37704i.AbstractC37706a
    /* renamed from: c */
    public FeedCursor mo138218c(FeedCard.FeedType feedType, FeedFilter feedFilter) {
        return m148317e(feedType, feedFilter).mo138297c();
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138231a(FeedCard.FeedType feedType, int i) {
        this.f96691a.mo138262a(feedType, i);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public Map<FeedFilter, Boolean> mo138229a(UIFeedCard uIFeedCard, List<FeedFilter> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            if (m148320j().mo138299d() != C37719d.f96695a.longValue() && uIFeedCard.getFeedType() == FeedCard.FeedType.INBOX && uIFeedCard.getRankTime() < m148320j().mo138299d()) {
                hashMap.put(FeedFilter.INBOX, false);
            }
            return hashMap;
        }
        for (FeedFilter feedFilter : list) {
            if (this.f96692b.mo138322a(uIFeedCard.getId(), feedFilter)) {
                if (feedFilter == FeedFilter.INBOX) {
                    if (m148320j().mo138299d() == C37719d.f96695a.longValue()) {
                        hashMap.put(FeedFilter.INBOX, true);
                    } else if (uIFeedCard.getRankTime() < m148320j().mo138299d()) {
                        hashMap.put(FeedFilter.INBOX, false);
                    } else {
                        hashMap.put(FeedFilter.INBOX, true);
                    }
                } else if (m148318e(feedFilter).mo138299d() == C37719d.f96695a.longValue()) {
                    hashMap.put(feedFilter, true);
                } else if (!this.f96692b.mo138322a(uIFeedCard.getId(), feedFilter) || uIFeedCard.getRankTime() >= m148318e(feedFilter).mo138299d()) {
                    hashMap.put(feedFilter, true);
                } else {
                    hashMap.put(feedFilter, false);
                }
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.feed.app.model.p1862b.C37697f.AbstractC37699a
    /* renamed from: d */
    public boolean mo138175d(FeedCard.FeedType feedType, FeedFilter feedFilter) {
        return m148317e(feedType, feedFilter).mo138296b();
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138232a(FeedCard.FeedType feedType, FeedFilter feedFilter) {
        m148317e(feedType, feedFilter).mo138300e();
    }

    @Override // com.ss.android.lark.feed.app.model.p1862b.C37704i.AbstractC37706a
    /* renamed from: a */
    public int mo138216a(FeedCard.FeedType feedType, FeedFilter feedFilter, long j) {
        if (!FeedFgUtils.m146773b() || feedFilter == null) {
            return this.f96692b.mo138301a(feedType, j);
        }
        return this.f96692b.mo138302a(feedFilter, j);
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138233a(FeedCard.FeedType feedType, FeedFilter feedFilter, C38126b bVar) {
        if (FeedFgSyncUtil.m146721a()) {
            m148317e(feedType, feedFilter).mo138293a(bVar);
        } else {
            m148317e(feedType, feedFilter).mo138294b(bVar);
        }
    }

    @Override // com.ss.android.lark.feed.app.model.cache.ICache
    /* renamed from: a */
    public void mo138234a(FeedCard.FeedType feedType, FeedFilter feedFilter, List<C38126b> list) {
        m148317e(feedType, feedFilter).mo138295b(list);
    }
}
