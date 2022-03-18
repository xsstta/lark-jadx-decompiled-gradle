package com.bytedance.ee.bear.list.list;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public abstract class BaseListPresenter<M extends AbstractC8542h, V extends AbstractC8544i<VD>, VD extends AbstractC8544i.AbstractC8545a> extends BasePresenter<M, V, VD> implements AbstractC8542h.AbstractC8543a, AbstractC8544i.AbstractC8545a, AbstractC8651p.AbstractC8655d, AbstractC8651p.AbstractC8656e, AbstractC8651p.AbstractC8661j {

    /* renamed from: a */
    private UnSyncDocumentsCallback f23065a = new UnSyncDocumentsCallback(this);

    /* renamed from: b */
    private BackgroundSyncDocumentsCallback f23066b = new BackgroundSyncDocumentsCallback(this);

    /* renamed from: c */
    public Context f23067c;

    /* renamed from: d */
    public C10917c f23068d;

    /* renamed from: e */
    protected C7718l f23069e;

    /* renamed from: f */
    public List<String> f23070f = new ArrayList();

    /* renamed from: g */
    public final List<Document> f23071g = new ArrayList();

    /* renamed from: h */
    public boolean f23072h;

    /* renamed from: i */
    protected ConnectionService.NetworkState f23073i;

    /* renamed from: j */
    public AccountService.Account f23074j;

    /* renamed from: k */
    public C68289a f23075k = new C68289a();

    /* renamed from: l */
    public LiveData<ArrayList<Document>> f23076l;

    /* renamed from: m */
    protected int f23077m = 8;

    /* renamed from: n */
    private final Map<String, Integer> f23078n = new HashMap();

    /* renamed from: o */
    private final ListDataChangeCallback f23079o = new ListDataChangeCallback(this);

    /* renamed from: p */
    private final BinderIProcessStart f23080p = new ProcessStartListener(this);

    /* renamed from: q */
    private boolean f23081q;

    /* renamed from: r */
    private final BaseListPresenter<M, V, VD>.C8525a f23082r = new C8525a();

    /* renamed from: s */
    private AccountService.AccountChangeUICallback f23083s = new AccountChangeUICallback(this);

    /* renamed from: t */
    private final AbstractC6158t f23084t;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35419a(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m35426b(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo32593a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32654a(String str, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32657b(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32658b(String str, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo32596c();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public VD createViewDelegate() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo32597m() {
        return "";
    }

    /* renamed from: a */
    public void mo33302a(boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "setUserVisibleHint()...isVisibleToUser = " + z);
        ((AbstractC8544i) getView()).b_(z);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: a */
    public void mo32655a(Throwable th) {
        C13479a.m54759a(mo32596c(), "onRefreshFailed()...", th);
        ((AbstractC8544i) getView()).mo33333b(th);
        this.f23081q = true;
        if (C13657b.m55421a(((AbstractC8544i) getView()).mo33351w()) && this.f23072h) {
            ((AbstractC8544i) getView()).mo32746a(th);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32594a(Document document) {
        C13479a.m54764b(mo32596c(), "onShareClick()...");
        C8292f.m34147a(this.f23069e.getActivity(), this.f23068d, document, this.f23074j, TextUtils.isEmpty(mo32597m()) ? mo32593a() : mo32597m(), TextUtils.isEmpty(mo32597m()) ? "" : mo32593a(), mo33318t());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33301a(ArrayList<Document> arrayList) {
        String c = mo32596c();
        StringBuilder sb = new StringBuilder();
        sb.append("onListChanged()...list = ");
        sb.append(arrayList == null ? 0 : arrayList.size());
        C13479a.m54764b(c, sb.toString());
        m35428b(arrayList);
        if (C13657b.m55423b(arrayList)) {
            ((AbstractC8544i) getView()).mo32744a(arrayList.size());
        }
        if (C13657b.m55421a(arrayList) && this.f23081q) {
            ((AbstractC8544i) getView()).mo32744a(0);
        }
        ((AbstractC8544i) getView()).mo33334b(arrayList);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8655d
    /* renamed from: a */
    public void mo33300a(String str, int i) {
        String c = mo32596c();
        C13479a.m54764b(c, "onManualOfflineStatusChange()...newStatus = " + i);
        this.f23075k.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str, i) {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$9iKVCOHp0qqef3pZZp2oIY6CVrs */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35421a((BaseListPresenter) this.f$1, (String) this.f$2, (int) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$wJ_1W3SAdX6rgIHnH8_8kYhotI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35435d((BaseListPresenter) ((Throwable) obj));
            }
        }));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8656e
    /* renamed from: a */
    public void mo33299a(OfflineDoc offlineDoc) {
        this.f23075k.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(offlineDoc) {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$KVd0g6ubBqWiWbQW1qPnKZeZuB0 */
            public final /* synthetic */ OfflineDoc f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35418a((BaseListPresenter) this.f$1, (OfflineDoc) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$WlBlBcEoiGFx5vaGBQP0qOmnLkc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35431c((BaseListPresenter) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32650a(ConnectionService.NetworkState networkState) {
        if (networkState == null) {
            C13479a.m54764b(mo32596c(), "onChanged()...networkState is null");
            return;
        }
        String c = mo32596c();
        C13479a.m54764b(c, "onChanged()...networkState = " + networkState.mo20040a());
        ConnectionService.NetworkState networkState2 = this.f23073i;
        if (networkState2 == null || networkState2.mo20040a() != networkState.mo20040a()) {
            this.f23073i = networkState;
        } else {
            C13479a.m54764b(mo32596c(), "onChanged()...networkState is same type");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo33308i() {
        return C13657b.m55421a(((AbstractC8544i) getView()).mo33351w());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: s */
    public boolean mo33317s() {
        return ((AbstractC8544i) getView()).mo33325D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo33318t() {
        return C8292f.m34136a(((AbstractC8544i) getView()).mo33323B());
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C13479a.m54764b(mo32596c(), "destroy()...");
        LiveData<ArrayList<Document>> liveData = this.f23076l;
        if (liveData != null) {
            liveData.mo5922a(this.f23069e);
        }
        mo32662f();
        this.f23075k.mo237935a();
    }

    /* renamed from: k */
    public void mo33310k() {
        C13479a.m54764b(mo32596c(), "onResume()...");
        ((AbstractC8544i) getView()).mo33353y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo33312n() {
        ConnectionService.NetworkState b = C5084ad.m20847d().mo20038b();
        if (b == null || !b.mo20041b()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: o */
    public void mo33313o() {
        C13479a.m54764b(mo32596c(), "onRefresh()...");
        ((AbstractC8542h) getModel()).mo33361q();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: p */
    public void mo33314p() {
        C13479a.m54764b(mo32596c(), "onLoadMore()...");
        ((AbstractC8542h) getModel()).mo33359o();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: r */
    public void mo33316r() {
        C13479a.m54764b(mo32596c(), "onListChangeNotify()");
        ((AbstractC8544i) getView()).mo33324C();
    }

    /* access modifiers changed from: private */
    public static class ProcessStartListener extends BinderIProcessStart.Stub {
        private final WeakReference<BaseListPresenter> presenterRef;

        @Override // com.bytedance.ee.bear.contract.ak.AbstractC5107c
        public void onProcessStart() {
            C13479a.m54764b("BaseListPresenter", "onProcessStart()...");
            WeakReference<BaseListPresenter> weakReference = this.presenterRef;
            if (weakReference == null || weakReference.get() == null) {
                C13479a.m54764b("BaseListPresenter", "onProcessStart()...view = null");
                return;
            }
            BaseListPresenter baseListPresenter = this.presenterRef.get();
            baseListPresenter.getClass();
            C13742g.m55706a(new Runnable() {
                /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$ProcessStartListener$23v5l3zvARM8gxJRUAXR7zSxiS0 */

                public final void run() {
                    BaseListPresenter.this.mo33309j();
                }
            }, 1000);
        }

        ProcessStartListener(BaseListPresenter baseListPresenter) {
            this.presenterRef = new WeakReference<>(baseListPresenter);
        }
    }

    /* renamed from: d */
    private void mo32660d() {
        this.f23073i = C5084ad.m20847d().mo20038b();
        this.f23074j = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f23075k.mo237937a(this.f23068d.mo41508c(am.class).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$2IQVN1c4GMx1Qmo4hsXNCBOXLE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35429c((BaseListPresenter) ((am) obj));
            }
        }, $$Lambda$BaseListPresenter$3sgfY0ZRupOMrUa_s3KiZTCqOCA.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m35446u() {
        ((AbstractC8544i) getView()).mo33334b(new ArrayList<>());
        ((AbstractC8544i) getView()).mo32744a(0);
        ((AbstractC8544i) getView()).mo33343o();
        ((AbstractC8542h) getModel()).mo33360p();
        LiveData<ArrayList<Document>> liveData = this.f23076l;
        if (liveData != null) {
            liveData.mo5922a(this.f23069e);
        }
        mo33307h();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b(mo32596c(), "create()...");
        mo32660d();
        ((AbstractC8544i) getView()).mo33354z();
        mo33307h();
        ((AbstractC8542h) getModel()).mo33357a(this);
        ((AbstractC8542h) getModel()).mo33361q();
        mo32661e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo33307h() {
        this.f23076l = null;
        this.f23076l = ((AbstractC8542h) getModel()).mo32587a();
        C13479a.m54764b("BaseListPresenter", "observeDatabase()...mLiveListData = " + this.f23076l);
        LiveData<ArrayList<Document>> liveData = this.f23076l;
        if (liveData != null) {
            liveData.mo5923a(this.f23069e, this.f23082r);
        } else {
            C13479a.m54764b(mo32596c(), "observeDatabase()...mListLiveData is null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo33315q() {
        C13479a.m54764b(mo32596c(), "preloadDocuments()...");
        this.f23075k.mo237937a(((AbstractC8544i) getView()).mo33335c(this.f23077m).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$hExsbl3m3uvx5aBcC2bOSoU98k */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35422a((BaseListPresenter) ((List) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$GJVjPMbpC69yuTZ62O328bkRME */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35437e((Throwable) obj);
            }
        }));
    }

    /* renamed from: e */
    private void mo32661e() {
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(this.f23083s);
        C5084ad.m20847d().mo20037a().mo5923a(this.f23069e, new C8526b());
        C8674q.m36243f().mo33642a(this);
        this.f23075k.mo237937a(this.f23068d.mo41508c(ak.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$7cq2ayAyyzf1PTjqIhqFLxvncc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListPresenter.this.m35425b((ak) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$fTsHGUexdltyEs5dV_1hinUKkP4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35434d((BaseListPresenter) ((String) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$BIga5xfR2XcVVRDIGagGLDmFsQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35444k((Throwable) obj);
            }
        }));
        mo33309j();
    }

    /* renamed from: f */
    private void mo32662f() {
        ((an) KoinJavaComponent.m268610a(an.class)).mo16404b(this.f23083s);
        this.f23083s = null;
        C8674q.m36243f().mo33649b(this);
        this.f23068d.mo41508c(AbstractC5094ag.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$lnpVlFFuqBsMtsm_2B3xntcHie8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListPresenter.this.m35424b((AbstractC5094ag) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$0_DCpj3fAQx9zeTZHAWsbNk17ZM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35430c((BaseListPresenter) ((String) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$DC8G4XOQ8S8soKrEqTT_0JrYt8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35443j((Throwable) obj);
            }
        });
        this.f23068d.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$XtzKAquIkdR4aejaV1joSt3aEww */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListPresenter.this.m35423b((am) obj);
            }
        }).mo238001b($$Lambda$BaseListPresenter$87t1WEmNtDqjHQWZmWmlhnO9YQQ.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$3NYEa4XFc92poS8ItbOei82uec */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35442i((Throwable) obj);
            }
        });
        this.f23068d.mo41508c(ak.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$c8Ys0W9ZQLmnHhPD9H7hSBuq3Go */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListPresenter.this.m35417a((ak) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$6AjOStYmjGBJVtnPiBRVqxUN4Vo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35427b((BaseListPresenter) ((String) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$mBW__fZCFtJyZ3YTXqlFqHvRIw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35441h((Throwable) obj);
            }
        });
        this.f23075k.mo237935a();
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8661j
    /* renamed from: b */
    public void mo33101b() {
        C13479a.m54764b(mo32596c(), "onTenantChanged()...");
        BearExecutors.m48468c().execute(new Runnable() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$GfqVysy_ow654zqdmAJ33g3tGRo */

            public final void run() {
                BaseListPresenter.this.m35446u();
            }
        });
    }

    /* renamed from: j */
    public void mo33309j() {
        C13479a.m54764b(mo32596c(), "registerRemoteCallback()...");
        this.f23075k.mo237937a(this.f23068d.mo41508c(AbstractC5094ag.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$dIhC4GGbUj_Z5HkQQIKmhN7Hpo */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListPresenter.this.m35416a((AbstractC5094ag) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$vF1RNmnuFqXDcbDg0JoZbdaeqxw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.mo32651a((BaseListPresenter) ((String) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$tF9MlH59APpcRS4KdvCHW10TwFk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35440g((Throwable) obj);
            }
        }));
        this.f23075k.mo237937a(this.f23068d.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$QdckuNBHvpOQfZ61XxBW1mRElOQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseListPresenter.this.m35415a((am) obj);
            }
        }).mo238001b($$Lambda$BaseListPresenter$l_akIB4pYbCkngrzsdwnwX5bqCw.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$ESwr85a2ka07tOB0EWkiJM0nEhw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseListPresenter.this.m35439f((Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public List<Document> mo33311l() {
        ArrayList arrayList = new ArrayList();
        if (C13657b.m55421a(((AbstractC8544i) getView()).mo33351w())) {
            return arrayList;
        }
        for (Document document : ((AbstractC8544i) getView()).mo33351w()) {
            if (document.mo32483t() == C8275a.f22375h.mo32555b()) {
                arrayList.add(document);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.list.BaseListPresenter$a */
    public class C8525a implements AbstractC1178x<ArrayList<Document>> {
        private C8525a() {
        }

        /* renamed from: a */
        public void onChanged(ArrayList<Document> arrayList) {
            BaseListPresenter.this.f23072h = true;
            BaseListPresenter.this.mo33301a(arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.list.BaseListPresenter$b */
    public class C8526b implements AbstractC1178x<ConnectionService.NetworkState> {
        private C8526b() {
        }

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            BaseListPresenter.this.mo32650a(networkState);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m35417a(ak akVar) throws Exception {
        akVar.removeProcessStartCallback(this.f23080p);
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ String m35425b(ak akVar) throws Exception {
        akVar.addProcessStartCallback(this.f23080p);
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m35431c(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m35435d(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m35437e(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m35439f(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m35440g(Throwable th) throws Exception {
        C13479a.m54774d(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m35442i(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m35443j(Throwable th) throws Exception {
        C13479a.m54774d(mo32596c(), th);
    }

    private static class AccountChangeUICallback extends AccountService.AccountChangeUICallback {
        private final WeakReference<BaseListPresenter<AbstractC8542h, AbstractC8544i<AbstractC8544i.AbstractC8545a>, AbstractC8544i.AbstractC8545a>> presenterRef;

        AccountChangeUICallback(BaseListPresenter baseListPresenter) {
            this.presenterRef = new WeakReference<>(baseListPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
        public void onChangeInUi(AccountService.Account account) {
            C13479a.m54764b("BaseListPresenter", "onChangeInUi()...account = " + account);
            if (account == null) {
                C13479a.m54764b("BaseListPresenter", "onChangeInUi()...account is null");
            } else if (this.presenterRef.get() == null) {
                C13479a.m54764b("BaseListPresenter", "presenterRef.get() is null");
            } else {
                BaseListPresenter<AbstractC8542h, AbstractC8544i<AbstractC8544i.AbstractC8545a>, AbstractC8544i.AbstractC8545a> baseListPresenter = this.presenterRef.get();
                if (baseListPresenter.f23074j == null || !TextUtils.equals(baseListPresenter.f23074j.f14584a, account.f14584a)) {
                    baseListPresenter.f23074j = account;
                    if (baseListPresenter.f23076l != null) {
                        baseListPresenter.f23076l.mo5922a(baseListPresenter.f23069e);
                    }
                    baseListPresenter.mo33307h();
                    ((AbstractC8542h) baseListPresenter.getModel()).mo33361q();
                    return;
                }
                C13479a.m54764b(baseListPresenter.mo32596c(), "onChangeInUi()...account is the same");
            }
        }
    }

    /* access modifiers changed from: private */
    public static class BackgroundSyncDocumentsCallback extends BinderBackgroundSyncDocumentsCallback.Stub {
        private WeakReference<BaseListPresenter> presenterRef;

        BackgroundSyncDocumentsCallback(BaseListPresenter baseListPresenter) {
            this.presenterRef = new WeakReference<>(baseListPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5095a
        public void onChange(OfflineDoc offlineDoc) {
            C13479a.m54764b("BaseListPresenter", "BackgroundSyncDocumentsCallback onChange()...offlineDoc = " + offlineDoc);
            WeakReference<BaseListPresenter> weakReference = this.presenterRef;
            if (weakReference == null || weakReference.get() == null) {
                C13479a.m54764b("BaseListPresenter", "BackgroundSyncDocumentsCallback onChange()...presenterRef or presenterRef.get() is null");
            } else {
                this.presenterRef.get().mo33299a(offlineDoc);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class ListDataChangeCallback extends SimpleListDataChangeCallback {
        private final WeakReference<BaseListPresenter> presenterRef;

        ListDataChangeCallback(BaseListPresenter baseListPresenter) {
            this.presenterRef = new WeakReference<>(baseListPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onPin(String str, boolean z) {
            super.onPin(str, z);
            C13479a.m54764b("BaseListPresenter", "onPin()...isPin = " + z);
            WeakReference<BaseListPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable(str, z) {
                    /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$ListDataChangeCallback$YSLBPSls6MT2IzGNPVHATQcTy5Y */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ boolean f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        BaseListPresenter.this.mo32654a((BaseListPresenter) this.f$1, (String) this.f$2);
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onRename(String str, String str2) {
            super.onRename(str, str2);
            C13479a.m54764b("BaseListPresenter", "onRename()...");
            WeakReference<BaseListPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable(str, str2) {
                    /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$ListDataChangeCallback$Aq0i5j92enCOTSZrrsrJ8k4b1s */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        BaseListPresenter.this.mo32657b((BaseListPresenter) this.f$1, this.f$2);
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onStar(String str, boolean z) {
            super.onStar(str, z);
            C13479a.m54764b("BaseListPresenter", "onStar()...isStar = " + z);
            WeakReference<BaseListPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable(str, z) {
                    /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$ListDataChangeCallback$7lpgE1W4tg8fFloNeaKqgV5lLYE */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ boolean f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        BaseListPresenter.this.mo32658b((BaseListPresenter) this.f$1, (String) this.f$2);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public static class UnSyncDocumentsCallback extends BinderUnSyncDocumentsCallback.Stub {
        private final WeakReference<BaseListPresenter> presenterRef;

        UnSyncDocumentsCallback(BaseListPresenter baseListPresenter) {
            this.presenterRef = new WeakReference<>(baseListPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5100f
        public void onChange(List<String> list) {
            C13479a.m54764b("BaseListPresenter", "UnSyncDocumentsCallback onChange()...list size = " + C13657b.m55424c(list));
            WeakReference<BaseListPresenter> weakReference = this.presenterRef;
            if (weakReference == null || weakReference.get() == null) {
                C13479a.m54764b("BaseListPresenter", "UnSyncDocumentsCallback onChange()...presenterRef or presenterRef.get() is null");
                return;
            }
            BaseListPresenter baseListPresenter = this.presenterRef.get();
            baseListPresenter.f23075k.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(list, baseListPresenter) {
                /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$UnSyncDocumentsCallback$8uuAZNcpEQuM48OeOnY6ENrg8Kw */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ BaseListPresenter f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseListPresenter.UnSyncDocumentsCallback.this.lambda$onChange$0$BaseListPresenter$UnSyncDocumentsCallback(this.f$1, this.f$2, (Boolean) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$UnSyncDocumentsCallback$utjbwc__Nt315m_xy60bi57l75M */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C13479a.m54761a((BaseListPresenter) BaseListPresenter.this.mo32596c(), (Throwable) obj);
                }
            }));
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5100f
        public void onRemove(List<String> list) {
            C13479a.m54764b("BaseListPresenter", "UnSyncDocumentsCallback onRemove()...list size = " + C13657b.m55424c(list));
            WeakReference<BaseListPresenter> weakReference = this.presenterRef;
            if (weakReference == null || weakReference.get() == null) {
                C13479a.m54764b("BaseListPresenter", "UnSyncDocumentsCallback onRemove()...presenterRef or presenterRef.get() is null");
                return;
            }
            BaseListPresenter baseListPresenter = this.presenterRef.get();
            baseListPresenter.f23075k.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(list, baseListPresenter) {
                /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$UnSyncDocumentsCallback$guqZdoF8nosc2_myLLj5mTWFmbs */
                public final /* synthetic */ List f$0;
                public final /* synthetic */ BaseListPresenter f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseListPresenter.UnSyncDocumentsCallback.lambda$onRemove$2(this.f$0, this.f$1, (Boolean) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.list.list.$$Lambda$BaseListPresenter$UnSyncDocumentsCallback$dnjmvONM7fNLhETZbYQsMTg2H4 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C13479a.m54761a((BaseListPresenter) BaseListPresenter.this.mo32596c(), (Throwable) obj);
                }
            }));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
            if (r9 == false) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
            r4.mo32436e(3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
            if (r4.mo32486u() == 2) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
            if (r4.mo32486u() == 3) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
            r4.mo32436e(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
            r2 = r8.mo32596c();
            com.bytedance.ee.log.C13479a.m54764b(r2, "UnSyncDocumentsCallback onChange()...position = " + r3 + ", state = " + r4.mo32486u());
            ((com.bytedance.ee.bear.list.list.AbstractC8544i) r8.getView()).mo33328a(r3, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateSyncState(com.bytedance.ee.bear.list.list.BaseListPresenter<com.bytedance.ee.bear.list.list.AbstractC8542h, com.bytedance.ee.bear.list.list.AbstractC8544i<com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a>, com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a> r8, boolean r9) {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.list.BaseListPresenter.UnSyncDocumentsCallback.updateSyncState(com.bytedance.ee.bear.list.list.BaseListPresenter, boolean):void");
        }

        public /* synthetic */ void lambda$onChange$0$BaseListPresenter$UnSyncDocumentsCallback(List list, BaseListPresenter baseListPresenter, Boolean bool) throws Exception {
            if (list == null || list.isEmpty()) {
                updateSyncState(baseListPresenter, true);
                baseListPresenter.f23070f.clear();
                return;
            }
            baseListPresenter.f23070f = list;
            updateSyncState(baseListPresenter, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0004 A[EDGE_INSN: B:14:0x0004->B:12:0x0004 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ void lambda$onRemove$2(java.util.List r3, com.bytedance.ee.bear.list.list.BaseListPresenter r4, java.lang.Boolean r5) throws java.lang.Exception {
            /*
                java.util.Iterator r3 = r3.iterator()
            L_0x0004:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x003c
                java.lang.Object r5 = r3.next()
                java.lang.String r5 = (java.lang.String) r5
                java.util.List<com.bytedance.ee.bear.list.dto.Document> r0 = r4.f23071g
                java.util.Iterator r0 = r0.iterator()
            L_0x0016:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0004
                java.lang.Object r1 = r0.next()
                com.bytedance.ee.bear.list.dto.Document r1 = (com.bytedance.ee.bear.list.dto.Document) r1
                java.lang.String r2 = r1.mo32472o()
                boolean r2 = android.text.TextUtils.equals(r5, r2)
                if (r2 != 0) goto L_0x0036
                java.lang.String r2 = r1.mo32375B()
                boolean r2 = android.text.TextUtils.equals(r5, r2)
                if (r2 == 0) goto L_0x0016
            L_0x0036:
                java.util.List<com.bytedance.ee.bear.list.dto.Document> r5 = r4.f23071g
                r5.remove(r1)
                goto L_0x0004
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.list.BaseListPresenter.UnSyncDocumentsCallback.lambda$onRemove$2(java.util.List, com.bytedance.ee.bear.list.list.BaseListPresenter, java.lang.Boolean):void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m35415a(am amVar) throws Exception {
        amVar.registerChangeCallback(this.f23079o);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m35423b(am amVar) throws Exception {
        amVar.unRegisterChangeCallback(this.f23079o);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m35430c(String str) throws Exception {
        C13479a.m54772d(mo32596c(), "docsDataService: unRegisterListeners");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m35434d(String str) throws Exception {
        C13479a.m54772d(mo32596c(), "hostService addProcessStartCallback success ");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m35441h(Throwable th) throws Exception {
        C13479a.m54759a(mo32596c(), "hostService removeProcessStartCallback fail", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m35444k(Throwable th) throws Exception {
        C13479a.m54759a(mo32596c(), "hostService addProcessStartCallback fail", th);
    }

    /* access modifiers changed from: protected */
    public void a_(Document document) {
        C13479a.m54764b(mo32596c(), "responseDeleteClick()...");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m35416a(AbstractC5094ag agVar) throws Exception {
        agVar.registerUnSyncDocumentsChangeCallback(this.f23065a);
        agVar.registerBackgroundSyncDocumentsChangeCallback(this.f23066b);
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ String m35424b(AbstractC5094ag agVar) throws Exception {
        agVar.unRegisterUnSyncDocumentsChangeCallback(this.f23065a);
        this.f23065a = null;
        agVar.unRegisterBackgroundSyncDocumentsChangeCallback(this.f23066b);
        this.f23066b = null;
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m35445l(Throwable th) throws Exception {
        C13479a.m54758a("BaseListPresenter", "getManualOfflineStateList error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo32651a(String str) throws Exception {
        C13479a.m54772d(mo32596c(), "docsDataService: registerListeners");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35427b(String str) throws Exception {
        C13479a.m54772d(mo32596c(), "hostService removeProcessStartCallback success ");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m35429c(am amVar) throws Exception {
        List<Document> manualOfflineStateList = amVar.getManualOfflineStateList();
        for (Document document : manualOfflineStateList) {
            mo33300a(document.mo32472o(), document.mo32486u());
        }
        C13479a.m54764b("BaseListPresenter", "getManualOfflineStateList()...success, size = " + manualOfflineStateList.size());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35422a(List list) throws Exception {
        C8292f.m34158a(this.f23068d, list, mo33312n(), mo32593a());
        C8292f.m34157a(this.f23068d, list, mo33312n());
    }

    /* renamed from: c */
    private boolean mo32659c(Document document) {
        if (document.mo32483t() != C8275a.f22371d.mo32555b() || document.mo32469n() == null || !TextUtils.equals(document.mo32469n().trim(), "!~!~193278~!~!")) {
            return false;
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/debug/activity").mo17305a(268435456).mo17317a();
        return true;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: d */
    public void mo33305d(Document document) {
        C13479a.m54764b(mo32596c(), "onDeleteClick()...");
        if (!mo32659c(document)) {
            if (!mo33312n()) {
                Context context = this.f23067c;
                Toast.showFailureText(context, context.getString(R.string.Doc_List_OperateFailedNoNet), 0);
                return;
            }
            a_(document);
            ListAnalysis.m32496a(C5234y.m21391b(), this.f23074j, "delete", document, mo32593a(), C8292f.m34136a(((AbstractC8544i) getView()).mo33323B()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5 A[EDGE_INSN: B:35:0x00a5->B:22:0x00a5 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35428b(java.util.ArrayList<com.bytedance.ee.bear.list.dto.Document> r6) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.list.BaseListPresenter.m35428b(java.util.ArrayList):void");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: b */
    public void mo33303b(Throwable th) {
        C13479a.m54759a(mo32596c(), "onLoadMoreFailed()...", th);
        ((AbstractC8544i) getView()).mo33336c(th);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: b */
    public void mo33304b(boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onLoadMoreSuccess()...hasMore = " + z);
        ((AbstractC8544i) getView()).mo33340d(z);
        mo33315q();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106 A[EDGE_INSN: B:40:0x0106->B:30:0x0106 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m35418a(com.bytedance.ee.bear.contract.offline.OfflineDoc r5, java.lang.Boolean r6) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.list.BaseListPresenter.m35418a(com.bytedance.ee.bear.contract.offline.OfflineDoc, java.lang.Boolean):void");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: a */
    public void mo32648a(int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onRefreshSuccess()...hasMore = " + z + ", size = " + i);
        ((AbstractC8544i) getView()).mo32732a(i, z);
        this.f23081q = true;
        if (C13657b.m55421a(((AbstractC8544i) getView()).mo33351w())) {
            ((AbstractC8544i) getView()).mo32744a(i);
        }
        mo33315q();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo33298a(RecyclerView recyclerView, int i) {
        String c = mo32596c();
        C13479a.m54772d(c, "onScrollStateChanged()...newState = " + i);
        if (i == 0) {
            mo33315q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35421a(String str, int i, Boolean bool) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            if (i == 0) {
                this.f23078n.remove(str);
            } else {
                this.f23078n.put(str, Integer.valueOf(i));
            }
            List<Document> w = ((AbstractC8544i) getView()).mo33351w();
            if (C13657b.m55423b(w)) {
                boolean z = false;
                for (int i2 = 0; i2 < w.size(); i2++) {
                    Document document = w.get(i2);
                    if (TextUtils.equals(str, document.mo32472o())) {
                        if (i != 0) {
                            z = true;
                        }
                        document.mo32447h(z);
                        if (this.f23070f.contains(str)) {
                            C13479a.m54764b(mo32596c(), "onManualOfflineStatusChange()...document is need sync");
                            i = 1;
                        }
                        for (Document document2 : this.f23071g) {
                            if (TextUtils.equals(document2.mo32472o(), str) || TextUtils.equals(document2.mo32375B(), str)) {
                                i = document2.mo32486u();
                                C13479a.m54764b(mo32596c(), "onManualOfflineStatusChange()...document is syncing");
                            }
                        }
                        document.mo32450i(document.mo32486u());
                        document.mo32436e(i);
                        ((AbstractC8544i) getView()).mo33328a(i2, document);
                        String c = mo32596c();
                        C13479a.m54764b(c, "onManualOfflineStatusChange()...position = " + i2 + ", status = " + document.mo32486u());
                        return;
                    }
                }
            }
        }
    }

    public BaseListPresenter(V v, M m, Context context, C10917c cVar, C7718l lVar) {
        super(m, v);
        this.f23067c = context;
        this.f23068d = cVar;
        this.f23069e = lVar;
        this.f23084t = (AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class);
    }
}
