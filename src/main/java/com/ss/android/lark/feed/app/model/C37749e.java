package com.ss.android.lark.feed.app.model;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.app.model.e */
public class C37749e {

    /* renamed from: a */
    AbstractC38118b f96789a = C38146f.m149976a();

    /* renamed from: b */
    private ConcurrentHashMap<String, Long> f96790b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo138452a(List<UIFeedCard> list) {
        Long l;
        if (!CollectionUtils.isEmpty(list)) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                UIFeedCard uIFeedCard = list.get(i);
                if (uIFeedCard != null) {
                    if (uIFeedCard.getType() == FeedCard.Type.DOC) {
                        Long l2 = this.f96790b.get(uIFeedCard.getId());
                        if (l2 == null || currentTimeMillis - l2.longValue() >= 30000) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(list.size());
                            }
                            arrayList.add(((DocFeedPreview) uIFeedCard).getDocUrl());
                            this.f96790b.put(uIFeedCard.getId(), Long.valueOf(currentTimeMillis));
                            Log.m165389i("FeedModule_FeedDataPreloader", "preloadFeedItemsData: doc id = " + uIFeedCard.getId());
                        }
                    } else if (uIFeedCard.getType() == FeedCard.Type.CHAT) {
                        Long l3 = this.f96790b.get(uIFeedCard.getId());
                        if (l3 == null || currentTimeMillis - l3.longValue() >= 30000) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList(list.size());
                            }
                            arrayList2.add(uIFeedCard.getId());
                            this.f96790b.put(uIFeedCard.getId(), Long.valueOf(currentTimeMillis));
                            Log.m165389i("FeedModule_FeedDataPreloader", "preloadFeedItemsData: feed id = " + uIFeedCard.getId());
                        }
                    } else if ((uIFeedCard.getType() == FeedCard.Type.APP || uIFeedCard.getType() == FeedCard.Type.OPEN_APP_CHAT) && ((l = this.f96790b.get(uIFeedCard.getId())) == null || currentTimeMillis - l.longValue() >= 30000)) {
                        this.f96790b.put(uIFeedCard.getId(), Long.valueOf(currentTimeMillis));
                        Log.m165389i("FeedModule_FeedDataPreloader", "preloadFeedItemsData: app id = " + uIFeedCard.getId());
                        z = true;
                    }
                }
            }
            m148599a(arrayList, arrayList2, z);
        }
    }

    /* renamed from: a */
    private void m148599a(List<String> list, List<String> list2, boolean z) {
        AbstractC38037a.AbstractC38051k z2;
        if (C37548b.m147657a().mo137792b() == FeedFilter.INBOX && !CollectionUtils.isEmpty(list) && (z2 = C37268c.m146766b().mo139207z()) != null) {
            z2.mo139255a(list);
        }
        if (!CollectionUtils.isEmpty(list2)) {
            this.f96789a.mo139446b(list2, new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.feed.app.model.C37749e.C377501 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("FeedModule_FeedDataPreloader", "preloadFeedError" + errorResult);
                }
            });
        }
        if (z) {
            C37268c.m146766b().mo139173a(1);
        }
    }
}
