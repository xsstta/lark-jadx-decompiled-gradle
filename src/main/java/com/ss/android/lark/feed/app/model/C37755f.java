package com.ss.android.lark.feed.app.model;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: com.ss.android.lark.feed.app.model.f */
public class C37755f {

    /* renamed from: c */
    private static final C37755f f96800c = new C37755f();

    /* renamed from: a */
    public final Queue<UIFeedCard> f96801a = new ConcurrentLinkedDeque();

    /* renamed from: b */
    public final Runnable f96802b = new Runnable() {
        /* class com.ss.android.lark.feed.app.model.C37755f.RunnableC377561 */

        public void run() {
            C37755f.this.mo138463a(C37755f.this.f96801a.poll());
            if (!C37755f.this.f96801a.isEmpty()) {
                CoreThreadPool.getSerialTaskHandler().postDelayed(C37755f.this.f96802b, 500);
            }
        }
    };

    /* renamed from: d */
    private final AbstractC38118b f96803d = C38146f.m149976a();

    /* renamed from: e */
    private final ConcurrentHashMap<String, Long> f96804e = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C37755f m148611a() {
        return f96800c;
    }

    /* renamed from: b */
    public void mo138465b() {
        this.f96801a.clear();
    }

    /* renamed from: a */
    public void mo138464a(List<UIFeedCard> list) {
        this.f96801a.clear();
        for (UIFeedCard uIFeedCard : list) {
            if (uIFeedCard != null) {
                this.f96801a.offer(uIFeedCard);
            }
        }
        CoreThreadPool.getSerialTaskHandler().removeCallbacks(this.f96802b);
        CoreThreadPool.getSerialTaskHandler().post(this.f96802b);
    }

    /* renamed from: a */
    public void mo138463a(UIFeedCard uIFeedCard) {
        if (uIFeedCard != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.f96804e.get(uIFeedCard.getId());
            if (l != null && currentTimeMillis - l.longValue() < 30000) {
                return;
            }
            if (uIFeedCard.getType() == FeedCard.Type.DOC) {
                List<String> asList = Arrays.asList(((DocFeedPreview) uIFeedCard).getDocUrl());
                AbstractC38037a.AbstractC38051k z = C37268c.m146766b().mo139207z();
                if (z != null) {
                    z.mo139255a(asList);
                    this.f96804e.put(uIFeedCard.getId(), Long.valueOf(currentTimeMillis));
                }
                Log.m165389i("FeedModule_PreloaderV2", "preloadFeedItemsData: doc id = " + uIFeedCard.getId() + " url = " + asList);
            } else if (uIFeedCard.getType() == FeedCard.Type.CHAT) {
                this.f96803d.mo139446b(Arrays.asList(uIFeedCard.getId()), new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.feed.app.model.C37755f.C377572 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("FeedModule_PreloaderV2", "preloadFeedError" + errorResult);
                    }
                });
                this.f96804e.put(uIFeedCard.getId(), Long.valueOf(currentTimeMillis));
                Log.m165389i("FeedModule_PreloaderV2", "preloadFeedItemsData: feed id = " + uIFeedCard.getId());
            } else if (uIFeedCard.getType() == FeedCard.Type.APP || uIFeedCard.getType() == FeedCard.Type.OPEN_APP_CHAT) {
                C37268c.m146766b().mo139173a(1);
                this.f96804e.put(uIFeedCard.getId(), Long.valueOf(currentTimeMillis));
                Log.m165389i("FeedModule_PreloaderV2", "preloadFeedItemsData: app id = " + uIFeedCard.getId());
            }
        }
    }
}
