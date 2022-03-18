package com.ss.android.lark.feed.app.model;

import android.os.Process;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.ShortcutInfoLoadResult;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.banner.ug_banner.FeedBannerLoaderProxy;
import com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.app.filter.data.FilterDataLoader;
import com.ss.android.lark.feed.app.filter.data.IFilterDataLoader;
import com.ss.android.lark.feed.app.model.C37678b;
import com.ss.android.lark.feed.app.model.cache.C37716b;
import com.ss.android.lark.feed.app.model.common.C37730c;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.p1862b.C37687c;
import com.ss.android.lark.feed.app.model.p1864d.C37746f;
import com.ss.android.lark.feed.app.model.p1865e.AbstractC37751a;
import com.ss.android.lark.feed.app.model.p1865e.C37753b;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.dto.NetworkLevel;
import com.ss.android.lark.feed.interfaces.AbstractC38089ad;
import com.ss.android.lark.feed.interfaces.AbstractC38096g;
import com.ss.android.lark.feed.interfaces.AbstractC38116z;
import com.ss.android.lark.feed.interfaces.IDeviceNotifyListener;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.C38173m;
import com.ss.android.lark.feed.service.p1884a.AbstractC38121c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.feed.app.model.i */
public class C37774i {

    /* renamed from: a */
    C37716b f96863a;

    /* renamed from: b */
    volatile C37687c f96864b;

    /* renamed from: c */
    volatile C37687c f96865c;

    /* renamed from: d */
    C37753b f96866d;

    /* renamed from: e */
    C37678b f96867e;

    /* renamed from: f */
    IFeedBannerLoader f96868f;

    /* renamed from: g */
    FilterDataLoader f96869g;

    /* renamed from: h */
    AbstractC38121c f96870h;

    /* renamed from: i */
    AbstractC38037a.AbstractC38047g f96871i;

    /* renamed from: j */
    AbstractC38037a.AbstractC38040ab f96872j;

    /* renamed from: k */
    public final C37746f f96873k;

    /* renamed from: l */
    public final C37730c f96874l;

    /* renamed from: m */
    private Map<FeedFilter, C37687c> f96875m = new HashMap();

    /* renamed from: n */
    private final AtomicBoolean f96876n;

    /* renamed from: o */
    private AbstractC38096g f96877o;

    /* renamed from: p */
    private AbstractC38089ad f96878p;

    /* renamed from: i */
    private void m148688i() {
        C37753b bVar = this.f96866d;
        if (bVar != null) {
            bVar.mo138456a(new AbstractC37751a.AbstractC37752a() {
                /* class com.ss.android.lark.feed.app.model.C37774i.AnonymousClass11 */

                @Override // com.ss.android.lark.feed.app.model.p1865e.AbstractC37751a.AbstractC37752a
                /* renamed from: a */
                public void mo138454a(ErrorResult errorResult) {
                    C37774i.this.f96874l.mo138390a(32);
                }

                @Override // com.ss.android.lark.feed.app.model.p1865e.AbstractC37751a.AbstractC37752a
                /* renamed from: a */
                public void mo138455a(ShortcutInfoLoadResult shortcutInfoLoadResult) {
                    C37774i.this.f96863a.mo138244b(C37774i.this.f96873k.mo138448a(shortcutInfoLoadResult.shortcuts, shortcutInfoLoadResult.feedInfos));
                }
            });
        }
    }

    /* renamed from: e */
    public void mo138497e() {
        C37678b bVar = this.f96867e;
        if (bVar != null) {
            bVar.mo138118a(new C37678b.AbstractC37681a() {
                /* class com.ss.android.lark.feed.app.model.C37774i.C377773 */

                @Override // com.ss.android.lark.feed.app.model.C37678b.AbstractC37681a
                /* renamed from: a */
                public void mo138121a() {
                    C37774i.this.f96863a.mo138267a((BannerPreview) null);
                }

                @Override // com.ss.android.lark.feed.app.model.C37678b.AbstractC37681a
                /* renamed from: a */
                public void mo138122a(BannerPreview bannerPreview) {
                    C37774i.this.f96863a.mo138267a(bannerPreview);
                }
            });
        }
    }

    /* renamed from: h */
    private void m148687h() {
        C37268c.m146767c().mo139348b(this.f96877o);
        C37268c.m146767c().mo139345b(this.f96878p);
    }

    /* renamed from: j */
    private void m148689j() {
        FilterDataLoader aVar;
        if (FeedFgUtils.m146773b() && (aVar = this.f96869g) != null) {
            aVar.mo137828a(new IFilterDataLoader.FilterLoadCallback() {
                /* class com.ss.android.lark.feed.app.model.C37774i.AnonymousClass12 */

                @Override // com.ss.android.lark.feed.app.filter.data.IFilterDataLoader.FilterLoadCallback
                /* renamed from: a */
                public void mo137830a(ArrayList<FeedTabItemData.IFilterItem> arrayList, boolean z) {
                    C37774i.this.f96863a.mo138250d(new ArrayList(arrayList));
                    C37774i.this.f96863a.mo138242a(z);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo138494b() {
        m148687h();
        for (C37687c cVar : this.f96875m.values()) {
            cVar.mo138141b();
        }
        this.f96875m.clear();
        IFeedBannerLoader dVar = this.f96868f;
        if (dVar != null) {
            dVar.mo137171a();
        }
    }

    /* renamed from: d */
    public void mo138496d() {
        Log.m165389i("LoaderManager", "onDonePageShowed:" + this.f96876n.get());
        if (this.f96876n.compareAndSet(false, true)) {
            C57865c.m224576a(new Runnable() {
                /* class com.ss.android.lark.feed.app.model.C37774i.AnonymousClass10 */

                public void run() {
                    C37774i.this.f96865c.mo138142c();
                }
            });
        }
    }

    /* renamed from: f */
    public void mo138498f() {
        C37262a.m146726a().mo139206y().mo139276f();
        if (this.f96868f == null) {
            this.f96868f = new FeedBannerLoaderProxy();
        }
        this.f96868f.mo137173a(C37262a.m146726a().mo139170a(), new IFeedBannerLoader.ILoadCompleteListener() {
            /* class com.ss.android.lark.feed.app.model.C37774i.C377784 */

            @Override // com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader.ILoadCompleteListener
            /* renamed from: a */
            public void mo137214a(UGBannerPreview uGBannerPreview, boolean z) {
                C37774i.this.f96863a.mo138268a(uGBannerPreview, z);
            }
        });
    }

    /* renamed from: g */
    private void m148686g() {
        boolean z;
        NetworkLevel a = this.f96872j.mo139218a();
        this.f96863a.mo138271a(a);
        if (a == NetworkLevel.NET_UNAVAILABLE) {
            z = true;
        } else {
            z = false;
        }
        this.f96863a.mo138236a(FeedCard.FeedType.INBOX, LoadState.LoadType.CONNECT, z);
        this.f96863a.mo138236a(FeedCard.FeedType.DONE, LoadState.LoadType.CONNECT, z);
        this.f96878p = new AbstractC38089ad() {
            /* class com.ss.android.lark.feed.app.model.C37774i.C377751 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38089ad
            /* renamed from: a */
            public void mo138499a(NetworkLevel networkLevel) {
                boolean z;
                C37716b bVar = C37774i.this.f96863a;
                FeedCard.FeedType feedType = FeedCard.FeedType.INBOX;
                LoadState.LoadType loadType = LoadState.LoadType.CONNECT;
                boolean z2 = true;
                if (networkLevel == NetworkLevel.NET_UNAVAILABLE) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.mo138236a(feedType, loadType, z);
                C37716b bVar2 = C37774i.this.f96863a;
                FeedCard.FeedType feedType2 = FeedCard.FeedType.DONE;
                LoadState.LoadType loadType2 = LoadState.LoadType.CONNECT;
                if (networkLevel != NetworkLevel.NET_UNAVAILABLE) {
                    z2 = false;
                }
                bVar2.mo138236a(feedType2, loadType2, z2);
                C37774i.this.f96863a.mo138271a(networkLevel);
            }
        };
        C37268c.m146767c().mo139332a(this.f96878p);
        this.f96877o = new AbstractC38096g() {
            /* class com.ss.android.lark.feed.app.model.C37774i.C377795 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38096g
            /* renamed from: a */
            public void mo138502a(boolean z) {
                if (z) {
                    boolean d = C37268c.m146766b().mo139185d();
                    Log.m165389i("LoaderManager", "onConnectionStateChange : isConnected = " + z + "isAppRealForeground" + d);
                    if (d) {
                        C37774i.this.f96874l.mo138390a(1640);
                        C37774i.this.mo138493a(true);
                        return;
                    }
                    C37774i.this.f96874l.mo138390a(1640);
                }
            }
        };
        C37268c.m146767c().mo139335a(this.f96877o);
    }

    /* renamed from: a */
    public void mo138487a() {
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
            C37687c cVar = new C37687c(feedFilter, feedType, this.f96863a);
            cVar.mo138138a();
            this.f96875m.put(feedFilter, cVar);
        }
        this.f96864b = this.f96875m.get(FeedFilter.INBOX);
        this.f96865c = this.f96875m.get(FeedFilter.DONE);
        m148686g();
    }

    /* renamed from: c */
    public void mo138495c() {
        C37268c.m146766b().mo139195n().mo139355a("load_all", null);
        m148689j();
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.model.C37774i.RunnableC377806 */

            /* JADX INFO: finally extract failed */
            public void run() {
                int threadPriority = Process.getThreadPriority(Process.myTid());
                try {
                    Process.setThreadPriority(-8);
                    C37774i.this.f96864b.mo138142c();
                    Process.setThreadPriority(threadPriority);
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    throw th;
                }
            }
        });
        C37708c cVar = new C37708c();
        cVar.mo138222a(new IDeviceNotifyListener() {
            /* class com.ss.android.lark.feed.app.model.C37774i.C377817 */

            @Override // com.ss.android.lark.feed.interfaces.IDeviceNotifyListener
            /* renamed from: a */
            public void mo138504a(int i) {
                C37774i.this.f96863a.mo138243b(i);
            }
        });
        this.f96863a.mo138246c(cVar.mo138221a());
        this.f96863a.mo138249d(cVar.mo138224b());
        cVar.mo138223a(new AbstractC38116z() {
            /* class com.ss.android.lark.feed.app.model.C37774i.C377828 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38116z
            /* renamed from: a */
            public void mo138505a(Map<String, Integer> map) {
                C37774i.this.f96863a.mo138245b(map);
            }
        });
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.model.C37774i.RunnableC377839 */

            public void run() {
                String a = C53234a.m205877a();
                C37268c.m146766b().mo139195n().mo139356b("load_tenant", a);
                C37774i.this.mo138491a(a);
                C37268c.m146766b().mo139195n().mo139354a();
            }
        });
        m148688i();
        String a = C53234a.m205877a();
        C37268c.m146766b().mo139195n().mo139356b("load_shortcut", a);
        ShortcutInfoLoadResult a2 = this.f96870h.mo139425a(a);
        if (a2.shortcuts != null) {
            this.f96863a.mo138244b(this.f96873k.mo138448a(a2.shortcuts, a2.feedInfos));
        }
        C37268c.m146766b().mo139195n().mo139354a();
        C37268c.m146766b().mo139195n().mo139354a();
    }

    /* renamed from: a */
    public void mo138491a(String str) {
        mo138492a(str, "", (IGetDataCallback<TenantInfo>) null);
    }

    public C37774i(C37716b bVar) {
        this.f96863a = bVar;
        this.f96870h = C38173m.m150043b();
        this.f96871i = C37268c.m146766b().mo139154A();
        this.f96872j = C37268c.m146766b().mo139197p();
        this.f96866d = new C37753b();
        this.f96867e = new C37678b();
        this.f96869g = new FilterDataLoader();
        this.f96876n = new AtomicBoolean(false);
        this.f96873k = new C37746f();
        this.f96874l = new C37730c();
    }

    /* renamed from: a */
    public void mo138490a(FeedFilter feedFilter) {
        C37687c cVar = this.f96875m.get(feedFilter);
        if (cVar != null) {
            cVar.mo138141b();
        }
        C37687c cVar2 = new C37687c(feedFilter, FeedCard.FeedType.INBOX, this.f96863a);
        cVar2.mo138138a();
        cVar2.mo138139a(0, (FeedPreview) null);
        this.f96875m.put(feedFilter, cVar2);
    }

    /* renamed from: a */
    public void mo138493a(boolean z) {
        if (this.f96874l.mo138392c(32)) {
            Log.m165389i("LoaderManager", "checkNeedReloadDingData refreshShortcutData");
            m148688i();
            this.f96874l.mo138391b(32);
        }
        if (this.f96874l.mo138392c(64)) {
            Log.m165389i("LoaderManager", "checkNeedReloadDingData refreshAtMeMessage");
            this.f96874l.mo138391b(64);
        }
        if (this.f96874l.mo138392c(DynamicModule.f58006b)) {
            Log.m165389i("LoaderManager", "checkNeedReloadDingData refreshTenantData");
            mo138491a((String) null);
            this.f96874l.mo138391b(DynamicModule.f58006b);
        }
    }

    /* renamed from: a */
    public void mo138488a(FeedCard.FeedType feedType, int i, FeedPreview feedPreview) {
        C37687c cVar;
        FeedFilter b = C37548b.m147657a().mo137792b();
        if (b != null && (cVar = this.f96875m.get(b)) != null) {
            cVar.mo138139a(i, feedPreview);
        }
    }

    /* renamed from: a */
    public void mo138489a(FeedCard.FeedType feedType, C38126b bVar, int i) {
        FeedFilter feedFilter;
        C37687c cVar;
        C37687c cVar2;
        if (feedType == FeedCard.FeedType.INBOX) {
            feedFilter = FeedFilter.INBOX;
        } else if (feedType == FeedCard.FeedType.DONE) {
            feedFilter = FeedFilter.DONE;
        } else {
            feedFilter = null;
        }
        if (!(feedFilter == null || (cVar2 = this.f96875m.get(feedFilter)) == null)) {
            cVar2.mo138140a(bVar, i);
        }
        FeedFilter b = C37548b.m147657a().mo137792b();
        if (b != null && b != FeedFilter.INBOX && b != FeedFilter.DONE && (cVar = this.f96875m.get(b)) != null) {
            cVar.mo138140a(bVar, i);
        }
    }

    /* renamed from: a */
    public void mo138492a(String str, String str2, final IGetDataCallback<TenantInfo> iGetDataCallback) {
        C37268c.m146766b().mo139200s().mo139319a(str, str2, new IGetDataCallback<TenantInfo>() {
            /* class com.ss.android.lark.feed.app.model.C37774i.C377762 */

            /* renamed from: a */
            public void onSuccess(TenantInfo tenantInfo) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(tenantInfo);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C37774i.this.f96874l.mo138390a(DynamicModule.f58006b);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }
}
