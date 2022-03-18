package com.ss.android.lark.feed.app.model;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.AbstractC29616i;
import com.ss.android.lark.biz.im.api.C29608b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.interfaces.AbstractC38093d;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.feed.app.model.a */
public class C37668a implements AbstractC38093d {

    /* renamed from: a */
    public ConcurrentHashMap<String, CopyOnWriteArrayList<AbstractC29616i>> f96557a;

    /* renamed from: b */
    public ExecutorService f96558b;

    /* renamed from: c */
    public Runnable f96559c;

    /* renamed from: d */
    C37731d.AbstractC37734b f96560d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.model.a$a */
    public static class C37672a {

        /* renamed from: a */
        static C37668a f96564a = new C37668a();
    }

    /* renamed from: a */
    public static C37668a m148111a() {
        return C37672a.f96564a;
    }

    /* renamed from: b */
    public void mo138103b() {
        C37731d.m148488a().mo138402a(this.f96560d);
    }

    /* renamed from: c */
    public void mo138105c() {
        C37731d.m148488a().mo138408b(this.f96560d);
    }

    private C37668a() {
        this.f96557a = new ConcurrentHashMap<>();
        this.f96558b = CoreThreadPool.getDefault().newSerialIODensityThreadPool("BadgeHandler");
        this.f96559c = new Runnable() {
            /* class com.ss.android.lark.feed.app.model.C37668a.RunnableC376691 */

            public void run() {
                C37668a.this.f96558b.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.model.C37668a.RunnableC376691.RunnableC376701 */

                    public void run() {
                        for (Map.Entry<String, CopyOnWriteArrayList<AbstractC29616i>> entry : C37668a.this.f96557a.entrySet()) {
                            String key = entry.getKey();
                            CopyOnWriteArrayList<AbstractC29616i> value = entry.getValue();
                            C29608b a = C37668a.this.mo138101a(key);
                            if (a == null) {
                                Log.m165389i("FeedModule__BadgeManager", "feed not exist id=" + key + " forgot unregister size=" + value.size());
                            } else {
                                Iterator<AbstractC29616i> it = value.iterator();
                                while (it.hasNext()) {
                                    it.next().mo106724a(key, a);
                                }
                            }
                        }
                    }
                });
            }
        };
        this.f96560d = new C37731d.AbstractC37734b() {
            /* class com.ss.android.lark.feed.app.model.C37668a.C376712 */

            @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
            /* renamed from: a */
            public void mo137402a(Map<Integer, Integer> map) {
                super.mo137402a(map);
            }

            @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
            /* renamed from: a */
            public void mo138108a(UpdateRecord updateRecord) {
                super.mo138108a(updateRecord);
                C37668a.this.f96558b.execute(C37668a.this.f96559c);
            }

            @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
            /* renamed from: b */
            public void mo138109b(UpdateRecord updateRecord) {
                super.mo138109b(updateRecord);
                C37668a.this.f96558b.execute(C37668a.this.f96559c);
            }
        };
    }

    /* renamed from: a */
    public C29608b mo138101a(String str) {
        UIFeedCard a = C37731d.m148488a().mo138393a(str);
        if (a != null) {
            FeedPreview feedPreview = (FeedPreview) a;
            return new C29608b(feedPreview.isRemind(), feedPreview.getBadgeCount());
        }
        Chat a2 = C37268c.m146766b().mo139154A().mo139235a(str);
        if (a2 != null) {
            return new C29608b(a2.isRemind(), a2.getUnReadBadgeCount());
        }
        return null;
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38093d
    /* renamed from: b */
    public synchronized void mo138104b(String str, AbstractC29616i iVar) {
        if (iVar != null) {
            CopyOnWriteArrayList<AbstractC29616i> copyOnWriteArrayList = this.f96557a.get(str);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(iVar);
            }
        }
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38093d
    /* renamed from: a */
    public synchronized void mo138102a(String str, AbstractC29616i iVar) {
        if (iVar != null) {
            CopyOnWriteArrayList<AbstractC29616i> copyOnWriteArrayList = this.f96557a.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f96557a.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(iVar);
        }
    }
}
