package com.ss.android.lark.feed.app.model;

import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LocalCacheItem;
import com.ss.android.lark.feed.app.entity.ShortCutPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.dto.ShortcutBtnPreView;
import com.ss.android.lark.feed.interfaces.AbstractC38091b;
import com.ss.android.lark.feed.interfaces.AbstractC38113w;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.j */
public class C37784j {

    /* renamed from: a */
    ICache f96892a;

    /* renamed from: b */
    volatile boolean f96893b;

    /* renamed from: c */
    AbstractC38091b f96894c = new AbstractC38091b() {
        /* class com.ss.android.lark.feed.app.model.C37784j.C377851 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38091b
        /* renamed from: a */
        public void mo138515a() {
            C37784j jVar = C37784j.this;
            jVar.mo138509a(jVar.f96892a.mo138248d(FeedCard.FeedType.INBOX).mo138376c(), false);
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38091b
        /* renamed from: a */
        public void mo138516a(boolean z) {
            if (!z) {
                C37784j jVar = C37784j.this;
                jVar.mo138509a(jVar.f96892a.mo138248d(FeedCard.FeedType.INBOX).mo138376c(), true);
            }
        }
    };

    /* renamed from: d */
    AbstractC38113w f96895d = new AbstractC38113w() {
        /* class com.ss.android.lark.feed.app.model.C37784j.C377862 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38113w
        /* renamed from: a */
        public void mo138517a() {
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38113w
        /* renamed from: b */
        public void mo138518b() {
            C37784j.this.f96893b = true;
            C37784j.this.mo138512d();
        }
    };

    /* renamed from: e */
    private List<UIFeedCard> f96896e;

    /* renamed from: f */
    private List<UIFeedCard> f96897f;

    /* renamed from: g */
    private boolean f96898g;

    /* renamed from: b */
    public void mo138510b() {
        if (this.f96898g) {
            C37268c.m146766b().mo139187f().mo139292b(this.f96895d);
            C37268c.m146766b().mo139184c().mo139226b(this.f96894c);
        }
    }

    /* renamed from: c */
    public void mo138511c() {
        if (this.f96898g) {
            this.f96896e = mo138513e();
            this.f96897f = mo138514f();
            if (this.f96893b) {
                mo138512d();
            }
        }
    }

    /* renamed from: a */
    public void mo138507a() {
        boolean a = C37268c.m146766b().mo139198q().mo139256a("lark.feed.local.cache.enable");
        this.f96898g = a;
        if (a) {
            C37268c.m146766b().mo139184c().mo139225a(this.f96894c);
            C37268c.m146766b().mo139187f().mo139291a(this.f96895d);
        }
    }

    /* renamed from: d */
    public void mo138512d() {
        if (!CollectionUtils.isEmpty(this.f96896e)) {
            this.f96892a.mo138239a(this.f96896e, FeedFilter.INBOX);
            this.f96892a.mo138235a(FeedCard.FeedType.INBOX, LoadState.LoadType.LOCAL);
        }
        if (!CollectionUtils.isEmpty(this.f96897f)) {
            this.f96892a.mo138244b(this.f96897f);
        }
    }

    /* renamed from: e */
    public List<UIFeedCard> mo138513e() {
        ArrayList arrayList = new ArrayList();
        List<LocalCacheItem> jSONArray = UserSP.getInstance().getJSONArray("local_feed_cache", LocalCacheItem.class);
        if (CollectionUtils.isEmpty(jSONArray)) {
            return arrayList;
        }
        for (LocalCacheItem localCacheItem : jSONArray) {
            arrayList.add(LocalCacheItem.unpackCacheItem(localCacheItem.getEntityType(), localCacheItem.getContent()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<UIFeedCard> mo138514f() {
        ArrayList arrayList = new ArrayList();
        List<LocalCacheItem> jSONArray = UserSP.getInstance().getJSONArray("local_shortcut_cache", LocalCacheItem.class);
        if (CollectionUtils.isEmpty(jSONArray)) {
            return arrayList;
        }
        for (LocalCacheItem localCacheItem : jSONArray) {
            UIFeedCard unpackCacheItem = LocalCacheItem.unpackCacheItem(localCacheItem.getEntityType(), localCacheItem.getContent());
            if (unpackCacheItem != null) {
                arrayList.add(unpackCacheItem);
            }
        }
        return arrayList;
    }

    public C37784j(ICache iCache) {
        this.f96892a = iCache;
    }

    /* renamed from: a */
    public void mo138508a(List<UIFeedCard> list) {
        Log.m165389i("FeedModule_LocalCacheManager", "updateLocalCacheImpl");
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            UIFeedCard uIFeedCard = list.get(i2);
            if (uIFeedCard instanceof ShortCutPreview) {
                List<UIFeedCard> feedPreviews = ((ShortCutPreview) uIFeedCard).getFeedPreviews();
                if (!CollectionUtils.isEmpty(feedPreviews)) {
                    feedPreviews = feedPreviews.subList(0, Math.min(8, feedPreviews.size()));
                }
                ArrayList arrayList2 = new ArrayList();
                if (!CollectionUtils.isEmpty(feedPreviews)) {
                    for (UIFeedCard uIFeedCard2 : feedPreviews) {
                        if (!(uIFeedCard2 instanceof ShortcutBtnPreView)) {
                            arrayList2.add(uIFeedCard2);
                        }
                    }
                }
                this.f96897f = m148713a("local_shortcut_cache", this.f96897f, arrayList2);
                z = true;
            } else if (uIFeedCard instanceof FeedPreview) {
                arrayList.add(uIFeedCard);
                i++;
            }
            if (i >= 10) {
                break;
            }
        }
        if (!z) {
            this.f96897f = m148713a("local_shortcut_cache", this.f96897f, new ArrayList());
        }
        this.f96896e = m148713a("local_feed_cache", this.f96896e, arrayList);
    }

    /* renamed from: a */
    public void mo138509a(final List<UIFeedCard> list, boolean z) {
        if (z) {
            CoreThreadPool.getDefault().getScheduleThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.model.C37784j.RunnableC377873 */

                public void run() {
                    C37784j.this.mo138508a(list);
                }
            });
        } else {
            mo138508a(list);
        }
    }

    /* renamed from: a */
    private List<UIFeedCard> m148713a(String str, List<UIFeedCard> list, List<UIFeedCard> list2) {
        boolean z = false;
        if (list != null && list2 != null && list.size() == list2.size()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (list.get(i).getRankTime() != list2.get(i).getRankTime()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        z = true;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (UIFeedCard uIFeedCard : list2) {
                LocalCacheItem packCacheItem = LocalCacheItem.packCacheItem(uIFeedCard.getType(), uIFeedCard);
                if (packCacheItem != null) {
                    arrayList.add(packCacheItem);
                }
            }
            UserSP.getInstance().putJSONArray(str, arrayList);
        }
        return list2;
    }
}
