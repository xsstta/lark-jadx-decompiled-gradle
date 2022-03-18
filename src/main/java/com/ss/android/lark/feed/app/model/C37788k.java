package com.ss.android.lark.feed.app.model;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.feed.v1.FilterPushInfo;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.p1864d.C37746f;
import com.ss.android.lark.feed.app.p1848a.C37292f;
import com.ss.android.lark.feed.dto.C38081a;
import com.ss.android.lark.feed.dto.C38082b;
import com.ss.android.lark.feed.interfaces.AbstractC38086aa;
import com.ss.android.lark.feed.interfaces.AbstractC38103l;
import com.ss.android.lark.feed.interfaces.AbstractC38104m;
import com.ss.android.lark.feed.interfaces.AbstractC38105n;
import com.ss.android.lark.feed.interfaces.AbstractC38106o;
import com.ss.android.lark.feed.interfaces.AbstractC38107p;
import com.ss.android.lark.feed.interfaces.AbstractC38108r;
import com.ss.android.lark.feed.interfaces.AbstractC38109s;
import com.ss.android.lark.feed.interfaces.AbstractC38110t;
import com.ss.android.lark.feed.interfaces.AbstractC38111u;
import com.ss.android.lark.feed.interfaces.AbstractC38112v;
import com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.p1874e.C38083a;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.C38128e;
import com.ss.android.lark.feed.service.impl.C38166k;
import com.ss.android.lark.feed.service.impl.C38167l;
import com.ss.android.lark.feed.service.impl.PushStatisticsEvent;
import com.ss.android.lark.feed.service.impl.Status;
import com.ss.android.lark.feed.statistics.chatbox.ChatBoxHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.lark.feed.app.model.k */
public class C37788k {

    /* renamed from: a */
    ICache f96903a;

    /* renamed from: b */
    C37746f f96904b = new C37746f();

    /* renamed from: c */
    volatile AbstractC37798a f96905c;

    /* renamed from: d */
    public final AbstractC38037a.AbstractC38049i f96906d = C37268c.m146766b().mo139186e();

    /* renamed from: e */
    public long f96907e;

    /* renamed from: f */
    public long f96908f;

    /* renamed from: g */
    public volatile boolean f96909g;

    /* renamed from: h */
    public volatile long f96910h = -1;

    /* renamed from: i */
    public volatile long f96911i = -1;

    /* renamed from: j */
    private final ReadWriteLock f96912j = new ReentrantReadWriteLock();

    /* renamed from: k */
    private final ExecutorService f96913k = Executors.newSingleThreadExecutor(new ThreadFactory() {
        /* class com.ss.android.lark.feed.app.model.C37788k.ThreadFactoryC377891 */

        /* renamed from: a */
        public static Thread m148750a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m148750a(new Thread(runnable, "FeedPushHandler"));
            a.setPriority(10);
            return a;
        }
    });

    /* renamed from: l */
    private final AbstractC38104m f96914l;

    /* renamed from: m */
    private final AbstractC38103l f96915m;

    /* renamed from: n */
    private final ConcurrentSkipListSet<Future> f96916n = new ConcurrentSkipListSet<>(new Comparator<Future>() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass12 */

        /* renamed from: a */
        public int compare(Future future, Future future2) {
            return 0;
        }
    });

    /* renamed from: o */
    private final AbstractC38109s f96917o = new AbstractC38109s() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass22 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38109s
        /* renamed from: a */
        public void mo138554a(List<Shortcut> list, List<FeedPreviewInfo> list2) {
            C37788k.this.mo138527a(list, list2);
        }
    };

    /* renamed from: p */
    private final AbstractC38106o f96918p = new AbstractC38106o() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass23 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38106o
        /* renamed from: a */
        public void mo137401a(JSONObject jSONObject) {
            C37788k.this.mo138522a(jSONObject);
        }
    };

    /* renamed from: q */
    private final AbstractC38107p f96919q = new AbstractC38107p() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass24 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38107p
        /* renamed from: a */
        public void mo137416a(JSONObject jSONObject) {
            C37788k.this.mo138536c(jSONObject);
        }
    };

    /* renamed from: r */
    private final IPushFeedEntityPreviewListener f96920r = new IPushFeedEntityPreviewListener() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass25 */

        @Override // com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener
        /* renamed from: a */
        public void mo137415a(JSONObject jSONObject) {
            C37788k.this.mo138533b(jSONObject);
        }
    };

    /* renamed from: s */
    private final AbstractC38110t f96921s = new AbstractC38110t() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass26 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38110t
        /* renamed from: a */
        public void mo138555a(PushStatisticsEvent pushStatisticsEvent) {
            C37788k.this.mo138526a(pushStatisticsEvent);
        }
    };

    /* renamed from: t */
    private final AbstractC38105n f96922t = new AbstractC38105n() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass27 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38105n
        /* renamed from: a */
        public void mo138556a(FeedCard.FeedType feedType, Status status) {
            C37788k.this.mo138523a(feedType, status);
        }
    };

    /* renamed from: u */
    private final AbstractC38108r f96923u = new AbstractC38108r() {
        /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass28 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38108r
        /* renamed from: a */
        public void mo138557a(C38082b bVar) {
            C37788k.this.mo138525a(bVar);
        }
    };

    /* renamed from: v */
    private final AbstractC38112v f96924v = new AbstractC38112v() {
        /* class com.ss.android.lark.feed.app.model.C37788k.C377902 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38112v
        /* renamed from: a */
        public void mo137525a(JSONObject jSONObject) {
            C37788k.this.mo138537d(jSONObject);
        }
    };

    /* renamed from: w */
    private final AbstractC38111u f96925w = new AbstractC38111u() {
        /* class com.ss.android.lark.feed.app.model.C37788k.C377913 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38111u
        /* renamed from: a */
        public void mo138558a(Map<String, Integer> map) {
            C37788k.this.mo138529a(map);
        }
    };

    /* renamed from: x */
    private final AbstractC38086aa f96926x = new AbstractC38086aa() {
        /* class com.ss.android.lark.feed.app.model.C37788k.C377924 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38086aa
        /* renamed from: a */
        public void mo137219a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2) {
            C37788k.this.mo138535b(list, list2);
        }
    };

    /* renamed from: y */
    private volatile boolean f96927y;

    /* renamed from: com.ss.android.lark.feed.app.model.k$a */
    public interface AbstractC37798a {
        /* renamed from: a */
        void mo138434a(FeedCard.FeedType feedType, C38126b bVar, int i);

        /* renamed from: a */
        void mo138435a(FeedFilter feedFilter);
    }

    /* renamed from: a */
    public void mo138527a(final List<Shortcut> list, final List<FeedPreviewInfo> list2) {
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.C377968 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37788k.this.f96903a.mo138244b(C37788k.this.f96904b.mo138448a(list, list2));
                return true;
            }
        }));
    }

    /* renamed from: a */
    public void mo138530a(final boolean z) {
        Log.m165389i("FeedModule_PushInfo", "onPushNotifyStatus " + z);
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass13 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37788k.this.f96906d.mo139244a(z);
                C37268c.m146766b().mo139188g();
                C37788k.this.f96903a.mo138243b(C37788k.this.mo138531b(z));
                return true;
            }
        }));
    }

    /* renamed from: a */
    public void mo138529a(final Map<String, Integer> map) {
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass16 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37788k.this.f96903a.mo138245b(map);
                return true;
            }
        }));
    }

    /* renamed from: a */
    public void mo138528a(List<UIFeedCard> list, Map<String, List<FeedFilter>> map, List<String> list2, Map<String, List<FeedFilter>> map2) {
        if (!CollectionUtils.isEmpty(list2)) {
            StringBuilder sb = new StringBuilder(32);
            if (list == null) {
                sb.append("only");
            }
            sb.append(" removeIds =");
            for (String str : list2) {
                sb.append(str);
                sb.append(",");
            }
            Log.m165389i("FeedModule_PushInfo", sb.toString());
        }
        if (CollectionUtils.isNotEmpty(map2)) {
            Log.m165389i("FeedModule_PushInfo", " invalidCaches = " + map2);
        }
        if (!CollectionUtils.isEmpty(list)) {
            if (CollectionUtils.isNotEmpty(map)) {
                Log.m165389i("FeedModule_PushInfo", " filterMap = " + map);
            }
            StringBuilder sb2 = new StringBuilder(list.size() * SmActions.ACTION_ONTHECALL_EXIT);
            sb2.append("feedPreview-Count:");
            sb2.append(list.size());
            for (UIFeedCard uIFeedCard : list) {
                if (uIFeedCard instanceof FeedPreview) {
                    sb2.append("[");
                    FeedPreview feedPreview = (FeedPreview) uIFeedCard;
                    if (feedPreview.getType() == FeedCard.Type.BOX) {
                        sb2.append("boxfeed");
                    }
                    sb2.append("id=");
                    sb2.append(feedPreview.getId());
                    sb2.append(",etp:");
                    sb2.append(feedPreview.getType());
                    sb2.append(",rt:");
                    sb2.append(feedPreview.getRankTime());
                    sb2.append(",dt:");
                    sb2.append(feedPreview.getDisplayTime());
                    sb2.append(",ut:");
                    sb2.append(feedPreview.getUpdateTime());
                    sb2.append(",mark:");
                    sb2.append(feedPreview.getMarkType());
                    sb2.append(",isRemind:");
                    sb2.append(feedPreview.isRemind());
                    sb2.append(",sendStatus:");
                    sb2.append(feedPreview.getMutexMarkType());
                    sb2.append(",bg:");
                    sb2.append(feedPreview.getUnreadCount());
                    sb2.append(",avatar:");
                    sb2.append(feedPreview.getAvatarKey());
                    sb2.append(",isDelay:");
                    sb2.append(feedPreview.isDelayed());
                    sb2.append(",type:");
                    sb2.append(feedPreview.getFeedType());
                    sb2.append(",boxid:");
                    sb2.append(feedPreview.getParentCardId());
                    if (C26284k.m95185a(C37268c.m146766b().mo139170a())) {
                        String localizedDigestMessage = feedPreview.getLocalizedDigestMessage();
                        sb2.append(",length:");
                        sb2.append(localizedDigestMessage == null ? 0 : localizedDigestMessage.length());
                    }
                    sb2.append("]");
                }
            }
            Log.m165389i("FeedModule_PushInfo", sb2.toString());
        }
    }

    /* renamed from: b */
    public void mo138532b() {
        Log.m165389i("FeedModule_PushInfo", "onPushDeviceOnlineStatus");
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass11 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37788k.this.f96903a.mo138243b(C37788k.this.mo138531b(C37788k.this.f96906d.mo139245a()));
                return true;
            }
        }));
    }

    /* renamed from: d */
    private void m148729d() {
        C37268c.m146767c().mo139352b(this.f96914l);
        C37268c.m146767c().mo139351b(this.f96915m);
        C38167l.m150039a().mo139531b(this.f96917o);
        C38128e.m149952a().mo139483b(this.f96918p);
        C38128e.m149952a().mo139484b(this.f96919q);
        C38128e.m149952a().mo139487b(this.f96921s);
        C38128e.m149952a().mo139482b(this.f96922t);
        C38128e.m149952a().mo139486b(this.f96923u);
        if (C37268c.m146766b().mo139198q().mo139256a("lark.feed.thread.avatar.change")) {
            C38128e.m149952a().mo139488b(this.f96924v);
        }
        C37268c.m146766b().mo139200s().mo139322b(this.f96925w);
        C37268c.m146766b().mo139200s().mo139321b(this.f96926x);
    }

    /* renamed from: c */
    private void m148728c() {
        C37268c.m146767c().mo139340a(this.f96914l);
        C37268c.m146767c().mo139339a(this.f96915m);
        C38167l.m150039a().mo139529a(this.f96917o);
        C38128e.m149952a().mo139474a(this.f96918p);
        C38128e.m149952a().mo139475a(this.f96919q);
        C38128e.m149952a().mo139476a(this.f96920r);
        C38128e.m149952a().mo139478a(this.f96921s);
        C38128e.m149952a().mo139473a(this.f96922t);
        C38128e.m149952a().mo139477a(this.f96923u);
        if (C37268c.m146766b().mo139198q().mo139256a("lark.feed.thread.avatar.change")) {
            C38128e.m149952a().mo139479a(this.f96924v);
        }
        C37268c.m146766b().mo139200s().mo139317a(this.f96925w);
        C37268c.m146766b().mo139200s().mo139316a(this.f96926x);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo138521a() {
        m148729d();
        Iterator<Future> it = this.f96916n.iterator();
        while (it.hasNext()) {
            it.next().cancel(false);
        }
        try {
            this.f96912j.writeLock().lock();
            this.f96913k.shutdown();
            this.f96912j.writeLock().unlock();
            this.f96905c = null;
            this.f96916n.clear();
        } catch (Throwable th) {
            this.f96912j.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo138524a(AbstractC37798a aVar) {
        this.f96905c = aVar;
        m148728c();
    }

    /* renamed from: b */
    public int mo138531b(boolean z) {
        if (!z) {
            return 2;
        }
        if (this.f96906d.mo139246b()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public void mo138536c(final JSONObject jSONObject) {
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass14 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                FeedCard.FeedType feedType = (FeedCard.FeedType) jSONObject.get("params_feed_type");
                C38126b bVar = (C38126b) jSONObject.get("key_param_feed_cursor_load_cursor");
                int intValue = ((Integer) jSONObject.get("key_param_feed_cursor_load_count")).intValue();
                String str = (String) jSONObject.get("key_param_feed_cursor_load_box_id");
                if (TextUtils.isEmpty(str) || TextUtils.equals("0", str)) {
                    Log.m165389i("FeedModule_PushInfo", "onPushFeedCursor:" + feedType + " (" + bVar.f97759a + "," + bVar.f97760b + "), id=" + str + " loadCount=" + intValue);
                    C37788k.this.f96903a.mo138232a(feedType, C37548b.m147657a().mo137792b());
                    if (C37788k.this.f96905c != null) {
                        C37788k.this.f96905c.mo138434a(feedType, bVar, intValue);
                    }
                }
                return true;
            }
        }));
    }

    /* renamed from: a */
    public void mo138522a(final JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.model.C37788k.C377979 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    C38166k kVar = (C38166k) jSONObject.get("params_feed_preview_update_info");
                    List<UIFeedCard> a = C37788k.this.f96904b.mo138449a(kVar.f97854a, true);
                    Map<String, List<FeedFilter>> map = (Map) jSONObject.get("key_param_feed_update_filter_list");
                    C37788k.this.mo138539f(jSONObject);
                    C37788k.this.f96903a.mo138240a(a, map);
                    C37788k.this.mo138528a(a, map, kVar.f97855b, null);
                    HashMap hashMap = new HashMap();
                    for (UIFeedCard uIFeedCard : a) {
                        Map<FeedFilter, Boolean> a2 = C37788k.this.f96903a.mo138229a(uIFeedCard, map.get(uIFeedCard.getId()));
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<FeedFilter, Boolean> entry : a2.entrySet()) {
                            if (!entry.getValue().booleanValue()) {
                                arrayList.add(entry.getKey());
                            }
                        }
                        if (CollectionUtils.isNotEmpty(arrayList)) {
                            hashMap.put(uIFeedCard.getId(), arrayList);
                        }
                    }
                    C37788k.this.f96903a.mo138238a(kVar.f97855b);
                    C37788k.this.f96903a.mo138241a(hashMap);
                    C37788k.this.mo138528a(null, null, new ArrayList(hashMap.keySet()), hashMap);
                    C37788k.this.f96903a.mo138230a(((Integer) jSONObject.get("key_param_feed_delayed_count")).intValue());
                    return true;
                }
            }));
        }
    }

    /* renamed from: d */
    public void mo138537d(final JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass20 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    String str = (String) jSONObject.get("key_param_thread_feed_avatar_key");
                    String str2 = (String) jSONObject.get("key_param_thread_feed_chat_id");
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        C37788k.this.f96903a.mo138237a(str, str2);
                    }
                    return true;
                }
            }));
        }
    }

    /* renamed from: a */
    private Future m148726a(AbstractCallableC37029a<Boolean> aVar) {
        try {
            this.f96912j.readLock().lock();
            ExecutorService executorService = this.f96913k;
            if (executorService != null) {
                if (!executorService.isShutdown()) {
                    Future submit = this.f96913k.submit(aVar);
                    this.f96912j.readLock().unlock();
                    return submit;
                }
            }
            FutureTask futureTask = new FutureTask(aVar);
            return futureTask;
        } finally {
            this.f96912j.readLock().unlock();
        }
    }

    /* renamed from: b */
    public void mo138533b(final JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass10 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    C38166k kVar = (C38166k) jSONObject.get("params_feed_preview_update_info");
                    List<UIFeedCard> a = C37788k.this.f96904b.mo138449a(kVar.f97854a, true);
                    Map<String, List<FeedFilter>> map = (Map) jSONObject.get("key_param_feed_update_filter_list");
                    C37788k.this.mo138538e(jSONObject);
                    C37788k.this.f96903a.mo138240a(a, map);
                    C37788k.this.mo138528a(a, map, kVar.f97855b, null);
                    C37788k.this.f96903a.mo138238a(kVar.f97855b);
                    C37788k.this.f96903a.mo138230a(((Integer) jSONObject.get("key_param_feed_delayed_count")).intValue());
                    return true;
                }
            }));
        }
    }

    /* renamed from: a */
    private void m148727a(int i) {
        C37268c.m146766b().mo139201t().mo139229b(i);
        if (C37268c.m146766b().mo139185d()) {
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass21 */

                public void run() {
                    C37268c.m146766b().mo139201t().mo139230b(UIHelper.getContext());
                }
            });
        }
    }

    public C37788k(ICache iCache) {
        this.f96903a = iCache;
        this.f96914l = new AbstractC38104m() {
            /* class com.ss.android.lark.feed.app.model.C37788k.C377935 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38104m
            /* renamed from: a */
            public void mo138559a() {
                C37788k.this.mo138532b();
            }
        };
        this.f96915m = new AbstractC38103l() {
            /* class com.ss.android.lark.feed.app.model.C37788k.C377946 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38103l
            /* renamed from: a */
            public void mo138560a(boolean z) {
                C37788k.this.mo138530a(z);
            }
        };
    }

    /* renamed from: a */
    public int mo138520a(List<TenantInfo> list) {
        int i = 0;
        for (TenantInfo tenantInfo : new ArrayList(list)) {
            if (tenantInfo != null && tenantInfo.isNewUser() && !tenantInfo.isCurrentUser()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public void mo138539f(JSONObject jSONObject) {
        int intValue = ((Integer) jSONObject.get("key_param_feed_badge_count")).intValue();
        int intValue2 = ((Integer) jSONObject.get("key_param_feed_filtered_badge_count")).intValue();
        int intValue3 = ((Integer) jSONObject.get("key_param_feed_mute_badge_count")).intValue();
        int intValue4 = ((Integer) jSONObject.get("key_param_feed_mute_filtered_badge_count")).intValue();
        boolean booleanValue = ((Boolean) jSONObject.get("key_param_feed_badge_has_reddot")).booleanValue();
        List<C38081a> list = (List) jSONObject.get("key_param_feed_update_filter_infos");
        ArrayList arrayList = new ArrayList();
        for (C38081a aVar : list) {
            arrayList.add(new FeedTabItemData.FilterItem(aVar.mo139383a(), aVar.mo139384b(), null));
        }
        this.f96903a.mo138251e(arrayList);
        Log.m165389i("FeedModule_PushInfo", "totalCount=" + intValue + " filterCount=" + intValue2 + " totalMuteCount=" + intValue3 + " filterMuteCount=" + intValue4 + " updateFilterInfos=" + list);
        if (intValue2 == 0 && booleanValue) {
            intValue2 = -intValue4;
        }
        this.f96903a.mo138231a(FeedCard.FeedType.INBOX, intValue2);
        m148727a(intValue);
        C37548b.m147657a().mo137787a(intValue);
        long j = (long) intValue;
        long j2 = (long) intValue3;
        C37548b.m147657a().mo137788a(j, j2);
        this.f96907e = j;
        this.f96908f = j2;
    }

    /* renamed from: e */
    public void mo138538e(JSONObject jSONObject) {
        int intValue = ((Integer) jSONObject.get("key_param_feed_badge_count")).intValue();
        int intValue2 = ((Integer) jSONObject.get("key_param_feed_filtered_badge_count")).intValue();
        int intValue3 = ((Integer) jSONObject.get("key_param_feed_mute_badge_count")).intValue();
        int intValue4 = ((Integer) jSONObject.get("key_param_feed_mute_filtered_badge_count")).intValue();
        boolean booleanValue = ((Boolean) jSONObject.get("key_param_feed_badge_has_reddot")).booleanValue();
        Map map = (Map) jSONObject.get("key_param_feed_update_filter_infos");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || FeedFilter.Companion.valueOf(((Integer) entry.getKey()).intValue()) == FeedFilter.UNKNOWN)) {
                arrayList.add(new FeedTabItemData.FilterItem(FeedFilter.Companion.valueOf(((Integer) entry.getKey()).intValue()), ((FilterPushInfo) entry.getValue()).unread.intValue(), null));
            }
        }
        this.f96903a.mo138251e(arrayList);
        Log.m165389i("FeedModule_PushInfo", "totalCount=" + intValue + " filterCount=" + intValue2 + " totalMuteCount=" + intValue3 + " filterMuteCount=" + intValue4 + " updateFilterInfos=" + map);
        if (intValue2 == 0 && booleanValue) {
            intValue2 = -intValue4;
        }
        this.f96903a.mo138231a(FeedCard.FeedType.INBOX, intValue2);
        m148727a(intValue);
        C37548b.m147657a().mo137787a(intValue);
        long j = (long) intValue;
        long j2 = (long) intValue3;
        C37548b.m147657a().mo137788a(j, j2);
        this.f96907e = j;
        this.f96908f = j2;
    }

    /* renamed from: a */
    public void mo138525a(final C38082b bVar) {
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.C377957 */

            /* renamed from: a */
            public Boolean mo102726b() {
                ArrayList arrayList = new ArrayList();
                if (bVar.mo139387a()) {
                    for (C38081a aVar : bVar.mo139388b()) {
                        arrayList.add(new FeedTabItemData.FilterItem(FeedFilter.Companion.valueOf(aVar.mo139383a().getValue()), aVar.mo139384b(), null));
                    }
                }
                C37788k.this.f96903a.mo138250d(arrayList);
                if (C37788k.this.f96903a.mo138253i() != bVar.mo139389c() && bVar.mo139387a()) {
                    Log.m165389i("FeedModule_PushInfo", "showAtAllInAtFeed changed, reload data if need");
                    C37788k.this.f96903a.mo138242a(bVar.mo139389c());
                    if (bVar.mo139387a()) {
                        C37788k.this.f96905c.mo138435a(FeedFilter.AT_ME);
                    }
                }
                return true;
            }
        }));
    }

    /* renamed from: a */
    public void mo138526a(PushStatisticsEvent pushStatisticsEvent) {
        PushStatisticsEvent.C38122a aVar;
        Log.m165389i("FeedModule_PushInfo", "onPushStatisticsEvent: " + pushStatisticsEvent.toString());
        Map<String, PushStatisticsEvent.C38122a> b = pushStatisticsEvent.mo139452b();
        if (b != null && pushStatisticsEvent.mo139451a() == PushStatisticsEvent.Type.BOX) {
            Iterator<String> it = b.keySet().iterator();
            if (it.hasNext() && (aVar = b.get(it.next())) != null) {
                ChatBoxHitPoint.f97733a.mo139410a((int) aVar.f97757a);
            }
        }
    }

    /* renamed from: a */
    public void mo138523a(final FeedCard.FeedType feedType, final Status status) {
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass17 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                boolean z;
                ICache iCache = C37788k.this.f96903a;
                FeedCard.FeedType feedType = feedType;
                LoadState.LoadType loadType = LoadState.LoadType.NET;
                if (status == Status.START) {
                    z = true;
                } else {
                    z = false;
                }
                iCache.mo138236a(feedType, loadType, z);
                Log.m165389i("FeedModule_PushInfo", "onPushLoadInboxStatus:" + status + " feedType=" + feedType);
                C37788k.this.mo138534b(feedType, status);
                return true;
            }
        }));
    }

    /* renamed from: b */
    public void mo138534b(FeedCard.FeedType feedType, Status status) {
        if (feedType == FeedCard.FeedType.INBOX) {
            if (status == Status.FINISHED && !this.f96927y) {
                this.f96927y = true;
                C38083a.m149814a().mo139406a(new C57865c.AbstractC57871b<AbstractC29620m>() {
                    /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass18 */

                    /* renamed from: a */
                    public void consume(AbstractC29620m mVar) {
                        mVar.mo106729a();
                    }
                });
            }
            if (status == Status.START && this.f96910h == -1) {
                this.f96910h = SystemClock.elapsedRealtime();
            }
            if (status == Status.FINISHED && this.f96910h != -1 && this.f96911i == -1) {
                this.f96911i = SystemClock.elapsedRealtime();
                C38083a.m149814a().mo139406a(new C57865c.AbstractC57871b<AbstractC29620m>() {
                    /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass19 */

                    /* renamed from: a */
                    public void consume(AbstractC29620m mVar) {
                        C37292f.m146921a(C37788k.this.f96911i - C37788k.this.f96910h, !C37788k.this.f96909g);
                        C37788k.this.f96909g = true;
                        C37788k.this.f96910h = -1;
                        C37788k.this.f96911i = -1;
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public void mo138535b(final List<TenantInfo> list, final List<TenantInfo.PendingUser> list2) {
        this.f96916n.add(m148726a(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.model.C37788k.AnonymousClass15 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                int i;
                int i2;
                List list = list;
                int i3 = 0;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                List list2 = list2;
                if (list2 != null) {
                    i2 = list2.size();
                } else {
                    i2 = 0;
                }
                C37788k.this.f96903a.mo138246c(i + i2);
                ICache iCache = C37788k.this.f96903a;
                List<TenantInfo> list3 = list;
                if (list3 != null) {
                    i3 = C37788k.this.mo138520a(list3);
                }
                iCache.mo138249d(i3);
                return true;
            }
        }));
    }
}
