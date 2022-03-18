package com.ss.android.lark.feed.app.model.cache;

import android.text.TextUtils;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.ExtraHeaderPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.FilterPreview;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.feed.app.entity.NoticeHeaderPreview;
import com.ss.android.lark.feed.app.entity.ShortCutPreview;
import com.ss.android.lark.feed.app.entity.ThreadFeedPreview;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.C37727a;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.p1862b.C37687c;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.dto.NetworkLevel;
import com.ss.android.lark.feed.dto.ShortcutBtnPreView;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.utils.DevicePerfUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.feed.app.model.cache.e */
public class C37720e {

    /* renamed from: a */
    public long f96702a;

    /* renamed from: b */
    public long f96703b = -1;

    /* renamed from: c */
    public final ConcurrentHashMap<ICache.AbstractC37714a, Integer> f96704c;

    /* renamed from: d */
    public volatile boolean f96705d;

    /* renamed from: e */
    public int f96706e;

    /* renamed from: f */
    private final C37727a f96707f;

    /* renamed from: g */
    private List<UIFeedCard> f96708g = new ArrayList();

    /* renamed from: h */
    private List<FeedTabItemData.IFilterItem> f96709h = new ArrayList();

    /* renamed from: i */
    private ShortcutBtnPreView f96710i;

    /* renamed from: j */
    private String f96711j;

    /* renamed from: k */
    private final C37718c f96712k;

    /* renamed from: l */
    private final Map<FeedFilter, Set<String>> f96713l;

    /* renamed from: m */
    private final HashSet<String> f96714m;

    /* renamed from: n */
    private final ReadWriteLock f96715n;

    /* renamed from: o */
    private final String f96716o;

    /* renamed from: p */
    private volatile int f96717p;

    /* renamed from: q */
    private volatile int f96718q;

    /* renamed from: r */
    private volatile NetworkLevel f96719r;

    /* renamed from: s */
    private volatile ExecutorService f96720s;

    /* renamed from: t */
    private volatile int f96721t;

    /* renamed from: u */
    private volatile Map<String, Integer> f96722u;

    /* renamed from: v */
    private volatile int f96723v;

    /* renamed from: w */
    private final Set<String> f96724w;

    /* renamed from: x */
    private final Set<String> f96725x;

    /* renamed from: y */
    private final Set<String> f96726y;

    /* renamed from: z */
    private volatile boolean f96727z;

    /* renamed from: e */
    public boolean mo138343e() {
        return this.f96727z;
    }

    /* renamed from: a */
    public void mo138312a(String str) {
        this.f96711j = str;
        this.f96720s = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("feed_cache_executor");
        m148397j();
    }

    /* renamed from: a */
    public void mo138310a(ICache.AbstractC37714a aVar) {
        this.f96704c.put(aVar, 0);
    }

    /* renamed from: a */
    public boolean mo138320a(FeedCard.FeedType feedType) {
        try {
            this.f96715n.readLock().lock();
            for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                if (uIFeedCard.getFeedType() == feedType && uIFeedCard.getType() != FeedCard.Type.UNKNOWN) {
                    return false;
                }
            }
            this.f96715n.readLock().unlock();
            return true;
        } finally {
            this.f96715n.readLock().unlock();
        }
    }

    /* renamed from: a */
    public void mo138313a(String str, FeedCard.FeedType feedType) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f96715n.writeLock().lock();
                UIFeedCard uIFeedCard = (UIFeedCard) this.f96712k.get(str);
                if (uIFeedCard != null) {
                    uIFeedCard.setFeedType(feedType);
                    this.f96715n.writeLock().unlock();
                    m148396i();
                }
            } finally {
                this.f96715n.writeLock().unlock();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138309a(UIFeedCard uIFeedCard, List<FeedFilter> list, boolean z) {
        if (uIFeedCard != null) {
            UIFeedCard uIFeedCard2 = (UIFeedCard) this.f96712k.get(uIFeedCard.getId());
            if (uIFeedCard2 == null || uIFeedCard.getUpdateTime() >= uIFeedCard2.getUpdateTime()) {
                this.f96712k.put(uIFeedCard.getId(), uIFeedCard);
            }
            for (FeedFilter feedFilter : list) {
                Set<String> set = this.f96713l.get(feedFilter);
                if (set == null) {
                    set = new HashSet<>();
                    this.f96713l.put(feedFilter, set);
                }
                set.add(uIFeedCard.getId());
            }
            if (z) {
                for (FeedFilter feedFilter2 : this.f96713l.keySet()) {
                    if (!list.contains(feedFilter2)) {
                        Set<String> set2 = this.f96713l.get(feedFilter2);
                        if (set2 != null) {
                            if (FeedFgSyncUtil.m146721a()) {
                                if (feedFilter2 == FeedFilter.AT_ME && uIFeedCard.getFeedType() != FeedCard.FeedType.DONE && !uIFeedCard.isInChatBox()) {
                                    this.f96724w.add(uIFeedCard.getId());
                                } else if (feedFilter2 == FeedFilter.UNREAD && uIFeedCard.getFeedType() != FeedCard.FeedType.DONE && !uIFeedCard.isInChatBox() && uIFeedCard.isRemind()) {
                                    this.f96725x.add(uIFeedCard.getId());
                                }
                            } else if (feedFilter2 == FeedFilter.AT_ME && !list.contains(FeedFilter.DONE)) {
                                this.f96724w.add(uIFeedCard.getId());
                            } else if (feedFilter2 == FeedFilter.UNREAD && !list.contains(FeedFilter.DONE)) {
                                this.f96725x.add(uIFeedCard.getId());
                            }
                            if (feedFilter2 != FeedFilter.MESSAGE || uIFeedCard.isRemind()) {
                                set2.remove(uIFeedCard.getId());
                            } else {
                                this.f96726y.add(uIFeedCard.getId());
                            }
                        }
                    } else {
                        if (feedFilter2 == FeedFilter.AT_ME && this.f96724w.contains(uIFeedCard.getId())) {
                            this.f96724w.remove(uIFeedCard.getId());
                        }
                        if (feedFilter2 == FeedFilter.UNREAD && this.f96725x.contains(uIFeedCard.getId())) {
                            this.f96725x.remove(uIFeedCard.getId());
                        }
                        if (feedFilter2 == FeedFilter.MESSAGE && this.f96726y.contains(uIFeedCard.getId())) {
                            this.f96726y.remove(uIFeedCard.getId());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo138318a(Map<String, List<FeedFilter>> map) {
        if (!CollectionUtils.isEmpty(map)) {
            try {
                this.f96715n.writeLock().lock();
                for (String str : map.keySet()) {
                    List<FeedFilter> list = map.get(str);
                    if (!CollectionUtils.isEmpty(list)) {
                        for (FeedFilter feedFilter : list) {
                            Set<String> set = this.f96713l.get(feedFilter);
                            if (set != null) {
                                set.remove(str);
                            }
                        }
                    }
                    boolean z = true;
                    Iterator<Set<String>> it = this.f96713l.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().contains(str)) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        this.f96712k.remove(str);
                    }
                }
                this.f96715n.writeLock().unlock();
                m148396i();
            } catch (Throwable th) {
                this.f96715n.writeLock().unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo138315a(List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            try {
                this.f96715n.writeLock().lock();
                for (String str : list) {
                    this.f96712k.remove(str);
                    for (Set<String> set : this.f96713l.values()) {
                        if (set != null) {
                            set.remove(str);
                        }
                    }
                }
                this.f96715n.writeLock().unlock();
                m148396i();
            } catch (Throwable th) {
                this.f96715n.writeLock().unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo138316a(List<UIFeedCard> list, FeedFilter feedFilter) {
        mo138317a(list, Collections.singletonMap(null, Collections.singletonList(feedFilter)), false);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo138317a(List<UIFeedCard> list, Map<String, List<FeedFilter>> map, boolean z) {
        m148394f(list);
        try {
            this.f96715n.writeLock().lock();
            boolean z2 = false;
            for (UIFeedCard uIFeedCard : list) {
                List<FeedFilter> list2 = map.get(uIFeedCard.getId());
                if (CollectionUtils.isEmpty(list2)) {
                    list2 = map.get(null);
                    if (CollectionUtils.isEmpty(list2)) {
                        list2 = Collections.singletonList(FeedFilter.INBOX);
                    }
                }
                mo138309a(uIFeedCard, list2, z);
                if (uIFeedCard instanceof FeedPreview) {
                    z2 |= m148389a(uIFeedCard);
                }
            }
            if (z2) {
                mo138338d();
                m148395h();
            }
            this.f96715n.writeLock().unlock();
            m148396i();
        } catch (Throwable th) {
            this.f96715n.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public UpdateRecord mo138304a(UpdateRecord updateRecord) {
        if (!(updateRecord == null || updateRecord.mo138376c() == null)) {
            ShortCutPreview shortCutPreview = null;
            Iterator<UIFeedCard> it = updateRecord.mo138376c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UIFeedCard next = it.next();
                if (next instanceof ShortCutPreview) {
                    shortCutPreview = (ShortCutPreview) next;
                    break;
                }
            }
            ShortcutBtnPreView shortcutBtnPreView = this.f96710i;
            if (!(shortCutPreview == null || shortCutPreview.getFeedPreviews() == null || ShortCutStausManager.m148791a().mo138579f() <= 0 || shortCutPreview.getFeedPreviews().size() <= ShortCutStausManager.m148791a().mo138579f() || shortcutBtnPreView == null)) {
                if (shortCutPreview.getFeedPreviews().get(ShortCutStausManager.m148791a().mo138579f() - 1) instanceof ShortcutBtnPreView) {
                    shortCutPreview.getFeedPreviews().set(ShortCutStausManager.m148791a().mo138579f() - 1, shortcutBtnPreView);
                } else {
                    shortCutPreview.getFeedPreviews().remove(shortcutBtnPreView);
                    shortCutPreview.getFeedPreviews().add(ShortCutStausManager.m148791a().mo138579f() - 1, shortcutBtnPreView);
                }
            }
        }
        return updateRecord;
    }

    /* renamed from: b */
    public void mo138330b(List<UIFeedCard> list) {
        try {
            this.f96715n.readLock().lock();
            for (UIFeedCard uIFeedCard : list) {
                this.f96714m.remove(uIFeedCard.getId());
            }
        } finally {
            this.f96715n.readLock().unlock();
        }
    }

    /* renamed from: b */
    public void mo138331b(Map<String, Integer> map) {
        if (!CollectionUtils.isEmpty(map)) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.f96722u);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f96722u = concurrentHashMap;
            m148388a(NoticeHeaderPreview.inboxId, FeedCard.FeedType.INBOX, true);
            Log.m165389i("FeedModule_FeedDataCache", "setTenantBadgeCount = " + this.f96722u);
        }
    }

    /* renamed from: a */
    public void mo138311a(NetworkLevel networkLevel) {
        if (!(networkLevel == NetworkLevel.SERVICE_UNAVAILABLE || networkLevel == NetworkLevel.NET_UNAVAILABLE)) {
            networkLevel = NetworkLevel.EXCELLENT;
        }
        synchronized (this) {
            if (this.f96719r != networkLevel) {
                this.f96719r = networkLevel;
                m148388a(NoticeHeaderPreview.inboxId, FeedCard.FeedType.INBOX, false);
                NoticeHeaderPreview noticeHeaderPreview = new NoticeHeaderPreview(NoticeHeaderPreview.doneBoxId, FeedCard.FeedType.DONE);
                try {
                    this.f96715n.writeLock().lock();
                    noticeHeaderPreview.setNetworkLevel(networkLevel);
                    if (!noticeHeaderPreview.needCreate()) {
                        this.f96712k.remove(noticeHeaderPreview.getId());
                    } else {
                        this.f96712k.put(noticeHeaderPreview.getId(), (UIFeedCard) noticeHeaderPreview);
                    }
                } finally {
                    this.f96715n.writeLock().unlock();
                }
            }
        }
        m148396i();
        Log.m165389i("FeedModule_FeedDataCache", "setNetworkLevel = " + networkLevel);
    }

    /* renamed from: a */
    public void mo138319a(boolean z) {
        if (C37239a.m146648b().mo136951a("lark.feed.setting_filter_only_at_me")) {
            Log.m165389i("FeedModule_FeedDataCache", "at feed changed, enableAtAll=" + z);
            this.f96727z = z;
            return;
        }
        Log.m165389i("FeedModule_FeedDataCache", "fg is not open, mAtAllInAtFeedCacheValue=" + this.f96727z);
    }

    /* renamed from: a */
    public boolean mo138321a(FeedPreview feedPreview) {
        try {
            this.f96715n.writeLock().lock();
            for (Map.Entry entry : this.f96712k.entrySet()) {
                if (entry.getValue() instanceof FeedPreview) {
                    FeedPreview feedPreview2 = (FeedPreview) entry.getValue();
                    if (feedPreview2.getType() != FeedCard.Type.UNKNOWN && feedPreview2.getFeedType() == feedPreview.getFeedType() && feedPreview2.getRankTime() < feedPreview.getRankTime()) {
                        if (feedPreview2.isDelayed() || (feedPreview2.getUnreadCount() > 0 && feedPreview2.isRemind())) {
                            return true;
                        }
                    }
                }
            }
            this.f96715n.writeLock().unlock();
            return false;
        } finally {
            this.f96715n.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo138307a(BannerPreview bannerPreview) {
        try {
            this.f96715n.writeLock().lock();
            if (bannerPreview == null) {
                this.f96712k.remove(BannerPreview.id);
            } else {
                this.f96712k.put(BannerPreview.id, (UIFeedCard) bannerPreview);
            }
            this.f96715n.writeLock().unlock();
            m148396i();
        } catch (Throwable th) {
            this.f96715n.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo138308a(UGBannerPreview uGBannerPreview, boolean z) {
        try {
            this.f96715n.writeLock().lock();
            if (uGBannerPreview == null) {
                if (this.f96712k.containsKey(UGBannerPreview.id)) {
                    this.f96712k.remove(UGBannerPreview.id);
                    if (!z) {
                        m148391c(false);
                    }
                }
                this.f96705d = false;
            } else {
                this.f96712k.put(UGBannerPreview.id, (UIFeedCard) uGBannerPreview);
                if (z) {
                    m148391c(true);
                }
                this.f96705d = true;
            }
            if (z) {
                m148387a(new Runnable() {
                    /* class com.ss.android.lark.feed.app.model.cache.C37720e.RunnableC377211 */

                    public void run() {
                        for (ICache.AbstractC37714a aVar : C37720e.this.f96704c.keySet()) {
                            aVar.mo138260b(C37720e.this.f96705d);
                        }
                    }
                });
            }
            this.f96715n.writeLock().unlock();
            m148396i();
        } catch (Throwable th) {
            this.f96715n.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo138329b(final UpdateRecord updateRecord) {
        try {
            this.f96715n.writeLock().lock();
            this.f96702a++;
            this.f96715n.writeLock().unlock();
            m148387a(new Runnable() {
                /* class com.ss.android.lark.feed.app.model.cache.C37720e.RunnableC377222 */

                public void run() {
                    if (C37720e.this.f96703b < C37720e.this.f96702a) {
                        C37720e eVar = C37720e.this;
                        eVar.f96703b = eVar.f96702a;
                        for (ICache.AbstractC37714a aVar : C37720e.this.f96704c.keySet()) {
                            aVar.mo138257a(updateRecord);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            this.f96715n.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo138314a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                this.f96715n.writeLock().lock();
                for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                    if (uIFeedCard instanceof ThreadFeedPreview) {
                        ThreadFeedPreview threadFeedPreview = (ThreadFeedPreview) uIFeedCard;
                        if (str2.equals(threadFeedPreview.getChatId())) {
                            ThreadFeedPreview threadFeedPreview2 = new ThreadFeedPreview(threadFeedPreview);
                            threadFeedPreview2.setAvatarKey(str);
                            this.f96712k.put(threadFeedPreview.getId(), (UIFeedCard) threadFeedPreview2);
                        }
                    }
                }
                this.f96715n.writeLock().unlock();
                m148396i();
            } catch (Throwable th) {
                this.f96715n.writeLock().unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public boolean mo138322a(String str, FeedFilter feedFilter) {
        Set<String> set = this.f96713l.get(feedFilter);
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    /* renamed from: a */
    public void mo138305a() {
        if (this.f96720s != null) {
            this.f96720s.shutdown();
        }
    }

    /* renamed from: j */
    private void m148397j() {
        DevicePerfUtils.DevicePerfLevel b = DevicePerfUtils.m224113b();
        if (b == DevicePerfUtils.DevicePerfLevel.LOW || b == DevicePerfUtils.DevicePerfLevel.ULTRALOW) {
            this.f96706e = ParticipantRepo.f117150c;
        }
    }

    /* renamed from: f */
    public boolean mo138344f() {
        try {
            this.f96715n.readLock().lock();
            return this.f96705d;
        } finally {
            this.f96715n.readLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.model.cache.e$4 */
    public static /* synthetic */ class C377244 {

        /* renamed from: a */
        static final /* synthetic */ int[] f96732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.feed.app.entity.FeedFilter[] r0 = com.ss.android.lark.feed.app.entity.FeedFilter.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.feed.app.model.cache.C37720e.C377244.f96732a = r0
                com.ss.android.lark.feed.app.entity.FeedFilter r1 = com.ss.android.lark.feed.app.entity.FeedFilter.AT_ME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.feed.app.model.cache.C37720e.C377244.f96732a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.feed.app.entity.FeedFilter r1 = com.ss.android.lark.feed.app.entity.FeedFilter.UNREAD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.feed.app.model.cache.C37720e.C377244.f96732a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.feed.app.entity.FeedFilter r1 = com.ss.android.lark.feed.app.entity.FeedFilter.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.model.cache.C37720e.C377244.<clinit>():void");
        }
    }

    /* renamed from: h */
    private void m148395h() {
        if (!CollectionUtils.isEmpty(this.f96708g)) {
            ShortCutPreview shortCutPreview = new ShortCutPreview();
            shortCutPreview.setFeedPreviews(new ArrayList(this.f96708g));
            this.f96712k.put(shortCutPreview.getId(), (UIFeedCard) shortCutPreview);
            return;
        }
        this.f96712k.remove(ShortCutPreview.id);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    private void m148396i() {
        try {
            this.f96715n.writeLock().lock();
            this.f96702a++;
            this.f96715n.writeLock().unlock();
            m148387a(new Runnable() {
                /* class com.ss.android.lark.feed.app.model.cache.C37720e.RunnableC377233 */

                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    synchronized (C37687c.f96590a) {
                        Log.m165379d("barrier", "wait barrier = " + (System.currentTimeMillis() - currentTimeMillis));
                    }
                    if (C37720e.this.f96703b < C37720e.this.f96702a) {
                        C37720e eVar = C37720e.this;
                        eVar.f96703b = eVar.f96702a;
                        UpdateRecord a = C37720e.this.mo138303a(C37548b.m147657a().mo137792b());
                        UpdateRecord b = C37720e.this.mo138324b();
                        UpdateRecord c = C37720e.this.mo138332c();
                        for (ICache.AbstractC37714a aVar : C37720e.this.f96704c.keySet()) {
                            aVar.mo138257a(a);
                            aVar.mo138257a(b);
                            aVar.mo138257a(c);
                        }
                        try {
                            Thread.sleep((long) C37720e.this.f96706e);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            });
        } catch (Throwable th) {
            this.f96715n.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public UpdateRecord mo138332c() {
        ArrayList arrayList = new ArrayList();
        if (FeedFgUtils.m146773b()) {
            try {
                this.f96715n.readLock().lock();
                for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                    if (uIFeedCard instanceof FilterPreview) {
                        arrayList.add(uIFeedCard);
                    }
                }
            } finally {
                this.f96715n.readLock().unlock();
            }
        }
        UpdateRecord updateRecord = new UpdateRecord();
        updateRecord.mo138368a(FeedCard.FeedType.INBOX);
        updateRecord.mo138371a(arrayList);
        updateRecord.mo138372a(false);
        updateRecord.mo138367a(this.f96702a);
        updateRecord.mo138370a(this.f96711j);
        updateRecord.mo138366a(3);
        return updateRecord;
    }

    /* renamed from: g */
    public void mo138345g() {
        try {
            this.f96715n.writeLock().lock();
            for (Map.Entry entry : this.f96712k.entrySet()) {
                if (((UIFeedCard) entry.getValue()).getUpdateTime() == -1) {
                    this.f96712k.remove(entry.getKey());
                    Log.m165389i("FeedModule_FeedDataCache", "clearInvalidCache:" + ((String) entry.getKey()));
                }
            }
        } finally {
            this.f96715n.writeLock().unlock();
        }
    }

    public C37720e() {
        C37718c cVar = new C37718c();
        this.f96712k = cVar;
        this.f96713l = new HashMap();
        this.f96704c = new ConcurrentHashMap<>();
        this.f96714m = new HashSet<>();
        this.f96715n = new ReentrantReadWriteLock();
        this.f96716o = String.valueOf(UUID.randomUUID().toString().hashCode());
        this.f96718q = 0;
        this.f96724w = new HashSet();
        this.f96725x = new HashSet();
        this.f96726y = new HashSet();
        this.f96706e = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f96727z = true;
        this.f96707f = new C37727a();
        ExtraHeaderPreview extraHeaderPreview = new ExtraHeaderPreview(ExtraHeaderPreview.inboxId, FeedCard.FeedType.INBOX);
        cVar.put(extraHeaderPreview.getId(), (UIFeedCard) extraHeaderPreview);
        ExtraHeaderPreview extraHeaderPreview2 = new ExtraHeaderPreview(ExtraHeaderPreview.doneBoxId, FeedCard.FeedType.DONE);
        cVar.put(extraHeaderPreview2.getId(), (UIFeedCard) extraHeaderPreview2);
        this.f96702a = 0;
        this.f96703b = 0;
        this.f96717p = 0;
        this.f96721t = 0;
        this.f96722u = new ConcurrentHashMap();
        this.f96723v = 0;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public UpdateRecord mo138324b() {
        ArrayList arrayList = new ArrayList();
        try {
            this.f96715n.readLock().lock();
            for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                if (uIFeedCard.getFeedType() == FeedCard.FeedType.INBOX && this.f96707f.mo138384a(uIFeedCard)) {
                    arrayList.add(uIFeedCard);
                }
            }
            this.f96715n.readLock().unlock();
            Collections.sort(arrayList);
            UpdateRecord updateRecord = new UpdateRecord();
            updateRecord.mo138368a(FeedCard.FeedType.INBOX);
            updateRecord.mo138371a(arrayList);
            updateRecord.mo138372a(false);
            updateRecord.mo138367a(this.f96702a);
            updateRecord.mo138370a(this.f96711j);
            updateRecord.mo138366a(2);
            return mo138304a(updateRecord);
        } catch (Throwable th) {
            this.f96715n.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo138338d() {
        List<UIFeedCard> list = this.f96708g;
        if (list != null && !list.isEmpty()) {
            if (this.f96708g.size() <= ShortCutStausManager.m148791a().mo138579f() || ShortCutStausManager.m148791a().mo138579f() <= 0) {
                Log.m165389i("FeedModule_FeedDataCache", "shortcutMoreBtn == null");
                this.f96710i = null;
                return;
            }
            ShortcutBtnPreView shortcutBtnPreView = new ShortcutBtnPreView();
            this.f96710i = shortcutBtnPreView;
            shortcutBtnPreView.setId(this.f96716o);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int f = ShortCutStausManager.m148791a().mo138579f() - 1; f < this.f96708g.size(); f++) {
                if (this.f96708g.get(f) instanceof FeedPreview) {
                    FeedPreview feedPreview = (FeedPreview) this.f96708g.get(f);
                    if (feedPreview.isContainMarkType(FeedPreview.MarkType.AT_USER) || feedPreview.isContainMarkType(FeedPreview.MarkType.AT_ALL)) {
                        i = feedPreview.getMarkType();
                        if (feedPreview.isContainMarkType(FeedPreview.MarkType.URGENT)) {
                            i ^= FeedPreview.MarkType.URGENT.getNumber();
                        }
                    }
                    if (feedPreview.isRemind()) {
                        i2 += feedPreview.getBadgeCount();
                    } else {
                        i3 += feedPreview.getBadgeCount();
                    }
                }
            }
            if (i != 0) {
                this.f96710i.setMarkType(i);
            }
            if (i2 > 0) {
                this.f96710i.setRemind(true);
                this.f96710i.setUnreadCount((long) i2);
            } else if (i3 > 0) {
                this.f96710i.setRemind(false);
                this.f96710i.setUnreadCount((long) i3);
            }
        }
    }

    /* renamed from: e */
    private int m148392e(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.DONE) {
            return 1;
        }
        return 0;
    }

    /* renamed from: f */
    private FeedFilter m148393f(FeedCard.FeedType feedType) {
        if (feedType == FeedCard.FeedType.DONE) {
            return FeedFilter.DONE;
        }
        return FeedFilter.INBOX;
    }

    /* renamed from: b */
    public void mo138328b(ICache.AbstractC37714a aVar) {
        if (aVar == null) {
            this.f96704c.clear();
        } else {
            this.f96704c.remove(aVar);
        }
    }

    /* renamed from: a */
    private void m148387a(Runnable runnable) {
        if (this.f96720s != null && !this.f96720s.isShutdown()) {
            this.f96720s.execute(runnable);
        }
    }

    /* renamed from: c */
    private void m148391c(boolean z) {
        for (ICache.AbstractC37714a aVar : this.f96704c.keySet()) {
            aVar.mo138259a(z);
        }
    }

    /* renamed from: a */
    public void mo138306a(int i) {
        if (this.f96721t != i) {
            this.f96721t = i;
            m148388a(NoticeHeaderPreview.inboxId, FeedCard.FeedType.INBOX, true);
            Log.m165389i("FeedModule_FeedDataCache", "setTenantBadgeCount = " + this.f96722u);
        }
    }

    /* renamed from: b */
    public UIFeedCard mo138323b(String str) {
        try {
            this.f96715n.readLock().lock();
            return (UIFeedCard) this.f96712k.get(str);
        } finally {
            this.f96715n.readLock().unlock();
        }
    }

    /* renamed from: c */
    public void mo138334c(int i) {
        if (this.f96717p != i) {
            this.f96717p = i;
            m148388a(NoticeHeaderPreview.inboxId, FeedCard.FeedType.INBOX, true);
            Log.m165389i("FeedModule_FeedDataCache", "setDelayedCount = " + this.f96717p);
        }
    }

    /* renamed from: d */
    public void mo138339d(int i) {
        if (this.f96718q != i) {
            this.f96718q = i;
            m148388a(NoticeHeaderPreview.inboxId, FeedCard.FeedType.INBOX, true);
            if (FeedFgUtils.m146773b()) {
                m148390b(true);
            }
            Log.m165389i("FeedModule_FeedDataCache", "setDeviceStatus = " + i);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public void mo138342e(List<UIFeedCard> list) {
        if (C37264a.m146753b()) {
            try {
                this.f96715n.writeLock().lock();
                this.f96708g = list;
                mo138338d();
                m148395h();
                this.f96715n.writeLock().unlock();
                m148396i();
            } catch (Throwable th) {
                this.f96715n.writeLock().unlock();
                throw th;
            }
        }
    }

    /* renamed from: b */
    private void m148390b(boolean z) {
        FilterPreview filterPreview = new FilterPreview();
        try {
            this.f96715n.writeLock().lock();
            filterPreview.setDeviceStatus(this.f96718q);
            filterPreview.setFilterItems(this.f96709h);
            if (!filterPreview.needCreate()) {
                this.f96712k.remove(FilterPreview.id);
            } else {
                this.f96712k.put(FilterPreview.id, (UIFeedCard) filterPreview);
            }
            if (z) {
                m148396i();
            }
        } finally {
            this.f96715n.writeLock().unlock();
        }
    }

    /* renamed from: f */
    private void m148394f(List<UIFeedCard> list) {
        if (!DesktopUtil.m144307b()) {
            ArrayList arrayList = null;
            Iterator<UIFeedCard> it = list.iterator();
            while (it.hasNext()) {
                UIFeedCard next = it.next();
                if (next instanceof ChatFeedPreview) {
                    ChatFeedPreview chatFeedPreview = (ChatFeedPreview) next;
                    if (!chatFeedPreview.isSecret() && !FeedFgUtils.m146773b() && chatFeedPreview.getLastMessagePosition() < 0 && TextUtils.isEmpty(chatFeedPreview.getLocalizedDigestMessage())) {
                        Log.m165389i("FeedModule_FeedDataCache", "filterInvalidFeed => id=" + chatFeedPreview.getId());
                        it.remove();
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(chatFeedPreview.getId());
                    }
                }
            }
            mo138315a(arrayList);
        }
    }

    /* renamed from: d */
    public int mo138337d(FeedCard.FeedType feedType) {
        try {
            this.f96715n.readLock().lock();
            int i = 0;
            int i2 = 0;
            for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                if (uIFeedCard.getFeedType() == feedType) {
                    if (uIFeedCard instanceof IBadgeable) {
                        IBadgeable iBadgeable = (IBadgeable) uIFeedCard;
                        int badgeCount = iBadgeable.getBadgeCount();
                        if (iBadgeable.isRemind()) {
                            i += badgeCount;
                        } else {
                            i2 += badgeCount;
                        }
                    }
                }
            }
            if (i > 0) {
                return i;
            }
            if (i2 > 0) {
                return -1;
            }
            return 0;
        } finally {
            this.f96715n.readLock().unlock();
        }
    }

    /* renamed from: a */
    private boolean m148389a(UIFeedCard uIFeedCard) {
        if (!C37264a.m146753b()) {
            return false;
        }
        for (int i = 0; i < this.f96708g.size(); i++) {
            UIFeedCard uIFeedCard2 = this.f96708g.get(i);
            if (TextUtils.equals(uIFeedCard2.getId(), uIFeedCard.getId()) && uIFeedCard.getUpdateTime() >= uIFeedCard2.getUpdateTime()) {
                ((FeedPreview) uIFeedCard).setShortcutPosition(((FeedPreview) uIFeedCard2).getShortcutPosition());
                this.f96708g.set(i, uIFeedCard);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public UpdateRecord mo138333c(FeedCard.FeedType feedType) {
        ArrayList arrayList = new ArrayList();
        try {
            this.f96715n.readLock().lock();
            boolean z = true;
            for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                if (uIFeedCard.getFeedType() == feedType) {
                    if (!this.f96707f.mo138384a(uIFeedCard)) {
                        if (TextUtils.isEmpty(uIFeedCard.getParentCardId()) || uIFeedCard.getParentCardId().equals("0")) {
                            arrayList.add(uIFeedCard);
                        }
                        if (uIFeedCard.getType() != FeedCard.Type.UNKNOWN) {
                            z = false;
                        }
                    }
                }
            }
            this.f96715n.readLock().unlock();
            Collections.sort(arrayList);
            UpdateRecord updateRecord = new UpdateRecord();
            updateRecord.mo138368a(feedType);
            updateRecord.mo138371a(arrayList);
            updateRecord.mo138372a(z);
            updateRecord.mo138367a(this.f96702a);
            updateRecord.mo138370a(this.f96711j);
            updateRecord.mo138366a(m148392e(feedType));
            updateRecord.mo138369a(m148393f(feedType));
            if (FeedFgUtils.m146773b()) {
                return updateRecord;
            }
            return mo138304a(updateRecord);
        } catch (Throwable th) {
            this.f96715n.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public UpdateRecord mo138325b(FeedCard.FeedType feedType) {
        ArrayList arrayList = new ArrayList();
        try {
            this.f96715n.readLock().lock();
            boolean z = true;
            for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                if (uIFeedCard.getFeedType() == feedType) {
                    if (TextUtils.isEmpty(uIFeedCard.getParentCardId()) || uIFeedCard.getParentCardId().equals("0")) {
                        arrayList.add(uIFeedCard);
                    }
                    if (uIFeedCard.getType() != FeedCard.Type.UNKNOWN) {
                        z = false;
                    }
                }
            }
            this.f96715n.readLock().unlock();
            Collections.sort(arrayList);
            UpdateRecord updateRecord = new UpdateRecord();
            updateRecord.mo138368a(feedType);
            updateRecord.mo138371a(arrayList);
            updateRecord.mo138372a(z);
            updateRecord.mo138367a(this.f96702a);
            updateRecord.mo138370a(this.f96711j);
            updateRecord.mo138366a(m148392e(feedType));
            updateRecord.mo138369a(m148393f(feedType));
            return mo138304a(updateRecord);
        } catch (Throwable th) {
            this.f96715n.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public void mo138335c(FeedFilter feedFilter) {
        int i = C377244.f96732a[feedFilter.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !this.f96726y.isEmpty()) {
                    this.f96713l.get(FeedFilter.MESSAGE).removeAll(this.f96726y);
                    this.f96726y.clear();
                }
            } else if (!this.f96725x.isEmpty()) {
                this.f96713l.get(FeedFilter.UNREAD).removeAll(this.f96725x);
                this.f96725x.clear();
            }
        } else if (!this.f96724w.isEmpty()) {
            this.f96713l.get(FeedFilter.AT_ME).removeAll(this.f96724w);
            this.f96724w.clear();
        }
    }

    /* renamed from: d */
    public void mo138340d(FeedFilter feedFilter) {
        try {
            this.f96715n.writeLock().lock();
            Set<String> set = this.f96713l.get(feedFilter);
            if (set != null) {
                set.clear();
            }
            Log.m165389i("FeedModule_FeedDataCache", "clear filter cache, filter is " + feedFilter.getValue());
        } finally {
            this.f96715n.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public void mo138326b(int i) {
        if (this.f96723v != i) {
            this.f96723v = i;
            m148388a(NoticeHeaderPreview.inboxId, FeedCard.FeedType.INBOX, true);
            Log.m165389i("FeedModule_FeedDataCache", "setInactiveTenantCount = " + this.f96723v);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo138336c(List<FeedTabItemData.IFilterItem> list) {
        if (FeedFgUtils.m146773b()) {
            try {
                this.f96715n.writeLock().lock();
                this.f96709h = list;
                this.f96715n.writeLock().unlock();
                Log.m165389i("FeedModule_FeedDataCache", "setFilterTabList = " + list.size());
                m148390b(true);
            } catch (Throwable th) {
                this.f96715n.writeLock().unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo138341d(List<FeedTabItemData.IFilterItem> list) {
        if (!list.isEmpty() && FeedFgUtils.m146773b()) {
            try {
                this.f96715n.writeLock().lock();
                for (FeedTabItemData.IFilterItem eVar : list) {
                    if (eVar instanceof FeedTabItemData.FilterItem) {
                        int i = 0;
                        while (true) {
                            if (i >= this.f96709h.size()) {
                                break;
                            }
                            FeedTabItemData.IFilterItem eVar2 = this.f96709h.get(i);
                            if ((eVar2 instanceof FeedTabItemData.FilterItem) && eVar2.mo137801b() == eVar.mo137801b()) {
                                ((FeedTabItemData.FilterItem) eVar2).mo137812a(((FeedTabItemData.FilterItem) eVar).mo137819h());
                                this.f96709h.set(i, eVar2);
                                break;
                            }
                            i++;
                        }
                    }
                }
                this.f96715n.writeLock().unlock();
                Log.m165389i("FeedModule_FeedDataCache", "setFilterTabList = " + list.size());
                m148390b(true);
            } catch (Throwable th) {
                this.f96715n.writeLock().unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public UpdateRecord mo138303a(FeedFilter feedFilter) {
        ArrayList arrayList = new ArrayList();
        FeedFilter feedFilter2 = FeedFilter.UNKNOWN;
        try {
            this.f96715n.readLock().lock();
            FeedFilter c = C37548b.m147657a().mo137793c();
            Set<String> set = this.f96713l.get(feedFilter);
            boolean z = true;
            if (!CollectionUtils.isEmpty(set)) {
                for (String str : set) {
                    UIFeedCard uIFeedCard = (UIFeedCard) this.f96712k.get(str);
                    if (uIFeedCard != null) {
                        if (feedFilter == FeedFilter.DONE || uIFeedCard.getFeedType() != FeedCard.FeedType.DONE) {
                            if (feedFilter == FeedFilter.DELAYED || feedFilter == FeedFilter.DONE || TextUtils.isEmpty(uIFeedCard.getParentCardId()) || uIFeedCard.getParentCardId().equals("0")) {
                                arrayList.add(uIFeedCard);
                                if (uIFeedCard.getType() != FeedCard.Type.UNKNOWN) {
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
            this.f96715n.readLock().unlock();
            Collections.sort(arrayList);
            UpdateRecord updateRecord = new UpdateRecord();
            updateRecord.mo138368a(FeedCard.FeedType.INBOX);
            updateRecord.mo138371a(arrayList);
            updateRecord.mo138372a(z);
            if (feedFilter == FeedFilter.INBOX) {
                z = false;
            }
            updateRecord.mo138375b(z);
            updateRecord.mo138367a(this.f96702a);
            updateRecord.mo138370a(this.f96711j);
            updateRecord.mo138366a(0);
            updateRecord.mo138369a(feedFilter);
            updateRecord.mo138374b(c);
            return mo138304a(updateRecord);
        } catch (Throwable th) {
            this.f96715n.readLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.util.HashSet<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void mo138327b(FeedFilter feedFilter) {
        try {
            this.f96715n.writeLock().lock();
            Set<String> set = this.f96713l.get(feedFilter);
            if (set == null) {
                set = new HashSet<>();
            }
            for (Map.Entry entry : this.f96712k.entrySet()) {
                if (((UIFeedCard) entry.getValue()).getType() != FeedCard.Type.UNKNOWN && set.contains(entry.getKey())) {
                    this.f96714m.add(entry.getKey());
                }
            }
        } finally {
            this.f96715n.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public int mo138301a(FeedCard.FeedType feedType, long j) {
        try {
            this.f96715n.readLock().lock();
            int i = 0;
            for (UIFeedCard uIFeedCard : this.f96712k.values()) {
                if (uIFeedCard.getFeedType() == feedType) {
                    if (uIFeedCard.getType() != FeedCard.Type.UNKNOWN) {
                        if (TextUtils.isEmpty(uIFeedCard.getParentCardId()) || uIFeedCard.getParentCardId().equals("0")) {
                            if (!this.f96714m.contains(uIFeedCard.getId())) {
                                if (uIFeedCard.getRankTime() >= j) {
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
            return i;
        } finally {
            this.f96715n.readLock().unlock();
        }
    }

    /* renamed from: a */
    public int mo138302a(FeedFilter feedFilter, long j) {
        try {
            this.f96715n.readLock().lock();
            Set<String> set = this.f96713l.get(feedFilter);
            int i = 0;
            if (set != null) {
                for (String str : set) {
                    UIFeedCard uIFeedCard = (UIFeedCard) this.f96712k.get(str);
                    if (uIFeedCard != null) {
                        if (uIFeedCard.getType() != FeedCard.Type.UNKNOWN) {
                            if (TextUtils.isEmpty(uIFeedCard.getParentCardId()) || uIFeedCard.getParentCardId().equals("0")) {
                                if (!this.f96714m.contains(uIFeedCard.getId())) {
                                    if (uIFeedCard.getRankTime() >= j) {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return i;
        } finally {
            this.f96715n.readLock().unlock();
        }
    }

    /* renamed from: a */
    private void m148388a(String str, FeedCard.FeedType feedType, boolean z) {
        NoticeHeaderPreview noticeHeaderPreview = new NoticeHeaderPreview(str, feedType);
        try {
            this.f96715n.writeLock().lock();
            noticeHeaderPreview.setDeviceStatus(this.f96718q);
            noticeHeaderPreview.setNetworkLevel(this.f96719r);
            noticeHeaderPreview.setDelayCount(this.f96717p);
            noticeHeaderPreview.setTenantCount(this.f96721t);
            noticeHeaderPreview.setTenantBadgeCount(this.f96722u);
            noticeHeaderPreview.setInactiveTenantCount(this.f96723v);
            if (!noticeHeaderPreview.needCreate()) {
                this.f96712k.remove(noticeHeaderPreview.getId());
            } else {
                this.f96712k.put(noticeHeaderPreview.getId(), (UIFeedCard) noticeHeaderPreview);
            }
            if (z) {
                m148396i();
            }
        } finally {
            this.f96715n.writeLock().unlock();
        }
    }
}
