package com.bytedance.ee.bear.document;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.document.AbstractC5625aa;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C6057p;
import com.bytedance.ee.bear.document.DocReport;
import com.bytedance.ee.bear.document.fail.DocException;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.rendergone.C6087a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p409j.AbstractC7935a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

/* renamed from: com.bytedance.ee.bear.document.p */
public class C6057p implements AbstractC5887o {

    /* renamed from: g */
    static final /* synthetic */ boolean f16929g = true;

    /* renamed from: a */
    protected String f16930a = "DocumentLoaderImpl";

    /* renamed from: b */
    protected final C6095s f16931b;

    /* renamed from: c */
    public final DocReport f16932c;

    /* renamed from: d */
    public final Runnable f16933d = new Runnable() {
        /* class com.bytedance.ee.bear.document.$$Lambda$p$XUUzPqngd2xTNn7i8NKg8ZaZYMw */

        public final void run() {
            C6057p.this.m24542p();
        }
    };

    /* renamed from: e */
    protected AccountService.Account f16934e;

    /* renamed from: f */
    public String f16935f = "direct";

    /* renamed from: h */
    private final C6059a f16936h;

    /* renamed from: i */
    private final C6060b f16937i;

    /* renamed from: j */
    private final List<AbstractC5887o.AbstractC5888a> f16938j;

    /* renamed from: k */
    private boolean f16939k;

    /* renamed from: l */
    private Disposable f16940l;

    /* renamed from: m */
    private AbstractC5625aa f16941m;

    /* renamed from: n */
    private AbstractC5625aa.AbstractC5626a f16942n;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m24525a(AbstractC68307f fVar, String str) throws Exception {
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24532b(Object obj) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.p$b */
    public static class C6060b extends WebViewClient {
        private C6060b() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C10548d.m43697a(webView);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            String d = C13598b.m55197d(webResourceRequest.getUrl().toString());
            C13479a.m54764b("WebViewFragment#WebStatus", "onReceivedHttpError()... url = " + d + ", err rsp:" + webResourceResponse);
        }
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o
    /* renamed from: a */
    public void mo23795a() {
        mo23797a(false);
        C13479a.m54764b(this.f16930a, "Load");
        DocStateTracker.f16283a.mo23265a();
        mo24479d();
        this.f16940l = mo24482g().mo238008b((AbstractC68309a) new AbstractC68309a() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$3fkQHXL9NvD1rYGYIjI6QkhhFi0 */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C6057p.this.m24544r();
            }
        }).mo237985a(C11678b.m48481e()).mo237979a($$Lambda$p$m3chjMl6IDRBoj5NtN3UXq2zpqw.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$3z3pfGulPuc16Po_C936m3wZlo4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6057p.this.m24535c((C6057p) ((Throwable) obj));
            }
        }, new AbstractC68309a() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$TOooWZYk8SEC0RcgOlBk1lq5M */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C6057p.this.m24547u();
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$gRDKMRLNTh4Gbq_XWRdqxGcHDQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6057p.this.m24528a((C6057p) ((AbstractC70022d) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o
    /* renamed from: a */
    public void mo23797a(boolean z) {
        Disposable disposable = this.f16940l;
        if (disposable != null) {
            disposable.dispose();
            this.f16940l = null;
        }
        boolean b = C13742g.m55709b(this.f16933d);
        if (b) {
            C13742g.m55710c(this.f16933d);
        }
        String str = this.f16930a;
        C13479a.m54764b(str, "cancelLoad cancelByUser: " + z + "   hasCallback: " + b);
        if (z && b) {
            DocLoadingState n = DocStateTracker.f16283a.mo23279n();
            DocStateTracker.f16283a.mo23276k();
            if (DocStateTracker.f16283a.mo23279n() == DocLoadingState.CANCELED) {
                DocReport dVar = this.f16932c;
                dVar.mo22998a(dVar.mo22995a(n), DocStateTracker.f16283a.mo23281p(), this.f16935f);
                DocBridgeWebViewV2 i = mo24484i();
                if (i != null && !i.mo22364k() && System.currentTimeMillis() - i.getmLoadHtmlStartTime() > 60000) {
                    Disposable b2 = ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b(new Consumer() {
                        /* class com.bytedance.ee.bear.document.$$Lambda$p$pjl1OovKPeCSfw19esjOHirgloo */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C6057p.this.m24531b((C6057p) ((Boolean) obj));
                        }
                    }, new Consumer() {
                        /* class com.bytedance.ee.bear.document.$$Lambda$p$CNzRlo2BoEwB1pyNnY2aCfQqwlQ */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C6057p.this.m24533b((C6057p) ((Throwable) obj));
                        }
                    });
                    String str2 = this.f16930a;
                    C13479a.m54764b(str2, "disposable = " + b2);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o
    /* renamed from: a */
    public void mo23796a(AbstractC5887o.AbstractC5888a aVar) {
        if (!this.f16938j.contains(aVar)) {
            this.f16938j.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo24476a(AbstractC5625aa aaVar) {
        C13479a.m54764b(this.f16930a, "onCreateView");
        this.f16941m = aaVar;
        mo24484i().mo22326a(this.f16936h);
        $$Lambda$p$rPCgsktFIOAXOPL9ca3QoOtjplQ r0 = new AbstractC5625aa.AbstractC5626a() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$rPCgsktFIOAXOPL9ca3QoOtjplQ */

            @Override // com.bytedance.ee.bear.document.AbstractC5625aa.AbstractC5626a
            public final void onDocWebViewDetach() {
                C6057p.this.m24546t();
            }
        };
        this.f16942n = r0;
        aaVar.setOnDetachListener(r0);
    }

    /* renamed from: a */
    public void mo24477a(Throwable th, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        String str = this.f16930a;
        C13479a.m54758a(str, "dealFail map:" + map + "err:" + th);
        C13742g.m55710c(this.f16933d);
        int i = -52;
        if (th instanceof DocException) {
            i = ((DocException) th).getCode();
        }
        DocStateTracker.f16283a.mo23266a(false);
        if (DocStateTracker.f16283a.mo23279n() == DocLoadingState.FAIL) {
            if (map.size() <= 0) {
                map.put("docs_result_code", String.valueOf(i));
                map.put("docs_result_key", "native");
            }
            this.f16932c.mo23004b(map, DocStateTracker.f16283a.mo23281p(), this.f16935f);
        }
        if (i != 4 && i != 1002 && i != 3 && i != -1 && i != -2 && i != -3) {
            if (i == 5) {
                this.f16932c.mo22997a(i);
                new C5671b(this.f16931b.mo24601p()).mo22660b();
            }
            mo24475a(i, th);
        }
    }

    /* renamed from: a */
    public void mo24475a(int i, Throwable th) {
        String str = this.f16930a;
        C13479a.m54759a(str, "dispatchLoadFail:" + i, th);
        C13742g.m55710c(this.f16933d);
        List<AbstractC5887o.AbstractC5888a> list = this.f16938j;
        if (list != null) {
            for (AbstractC5887o.AbstractC5888a aVar : list) {
                aVar.onLoadFail(i, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m24544r() {
        C13479a.m54764b(this.f16930a, "dispatchLoadCancel");
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m24547u() throws Exception {
        C13479a.m54764b(this.f16930a, "Load onComplete , still going on in webView");
    }

    /* renamed from: m */
    private AbstractC68307f<Object> m24539m() {
        return AbstractC68307f.m265083a("Anything").mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$IC_36H1W0unE5f0KZS90F4C05IE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6057p.this.m24523a(obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public BearUrl mo24480e() {
        return this.f16931b.mo24598m().getBearUrl();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public DocBridgeWebViewV2 mo24484i() {
        return (DocBridgeWebViewV2) this.f16931b.mo19448b().mo19435b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.p$a */
    public class C6059a implements AbstractC5089af.AbstractC5091b {
        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onDownloadFullResource() {
            C13479a.m54764b(C6057p.this.f16930a, "onDownloadFullResource");
            if (DocStateTracker.f16283a.mo23279n() == DocLoadingState.WAITING_DOWNLOAD) {
                C6057p.this.f16932c.mo23002b();
            }
            onWaitPreloading();
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onRenderByWaitPreload() {
            C13479a.m54764b(C6057p.this.f16930a, "onRenderByWaitPreload");
            if (C5102ai.m20872j().mo20212d() && C13742g.m55709b(C6057p.this.f16933d)) {
                C13742g.m55710c(C6057p.this.f16933d);
                C13742g.m55706a(C6057p.this.f16933d, (long) DocOpenConfig.m22761b());
            }
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onWaitDownloadFullResource() {
            C13479a.m54764b(C6057p.this.f16930a, "onWaitDownloadFullResource");
            C5234y.m21391b().mo21078a("wait_download_resource", "start_time", String.valueOf(SystemClock.uptimeMillis()));
            DocStateTracker.f16283a.mo23267b();
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onWaitPreloading() {
            C13479a.m54764b(C6057p.this.f16930a, "onWaitPreloading");
            C5234y.m21391b().mo21078a("wait_preload", "start_time", String.valueOf(SystemClock.uptimeMillis()));
            DocStateTracker.f16283a.mo23268c();
        }

        private C6059a() {
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onDocGoBack(String str) {
            C13479a.m54764b(C6057p.this.f16930a, "onDocGoBack");
            AbstractC5233x b = C5234y.m21391b();
            if (b.mo21075a("start_open", "start_time") == null) {
                b.mo21078a("start_open", "start_time", String.valueOf(System.currentTimeMillis()));
            }
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onRenderSuccess(Map<String, String> map) {
            C13479a.m54764b(C6057p.this.f16930a, "onRenderSuccess");
            C13742g.m55710c(C6057p.this.f16933d);
            DocStateTracker.f16283a.mo23266a(C6057p.f16929g);
            if (DocStateTracker.f16283a.mo23279n() == DocLoadingState.SUCCESS) {
                C6057p.this.f16932c.mo23001a(map, DocStateTracker.f16283a.mo23281p(), C6057p.this.f16935f);
            }
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onRendering(String str) {
            C13479a.m54764b(C6057p.this.f16930a, "onRendering");
            C6057p.this.f16935f = str;
            if (DocStateTracker.f16283a.mo23279n() == DocLoadingState.WAITING_PRELOAD) {
                C6057p.this.f16932c.mo22996a();
            }
            DocStateTracker.f16283a.mo23269d();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m24565a(Throwable th, Map map) {
            C6057p.this.mo24477a(th, map);
        }

        @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
        public void onRenderFail(Throwable th, Map<String, String> map) {
            C13479a.m54759a(C6057p.this.f16930a, "onRenderFail", th);
            C13742g.m55705a(new Runnable(th, map) {
                /* class com.bytedance.ee.bear.document.$$Lambda$p$a$g15MLnKRSaIGvAEZcpK9rMI5Fg */
                public final /* synthetic */ Throwable f$1;
                public final /* synthetic */ Map f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C6057p.C6059a.this.m24565a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: k */
    private AbstractC68307f<Long> m24537k() {
        return AbstractC68307f.m265083a(Long.valueOf((long) DocOpenConfig.m22761b())).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$V22OW4X8ZSN57eQp7DV2j1r6fcU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6057p.this.m24522a((Long) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m24541o() {
        C13479a.m54764b(this.f16930a, "dispatchLoadStart");
        List<AbstractC5887o.AbstractC5888a> list = this.f16938j;
        if (list != null) {
            for (AbstractC5887o.AbstractC5888a aVar : list) {
                aVar.onLoadStart();
            }
        }
    }

    /* renamed from: s */
    private DocBridgeWebViewV2 m24545s() throws Exception {
        AbstractC5625aa aaVar = this.f16941m;
        if (aaVar != null && aaVar.getWebView() != null) {
            return (DocBridgeWebViewV2) this.f16931b.mo19448b().mo19435b();
        }
        throw new Exception("Require web view when not attached");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m24546t() {
        C13479a.m54764b(this.f16930a, "webViewReusedByOthers");
        if (!this.f16931b.mo19569k()) {
            m24540n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo24481f() {
        CharSequence b = this.f16931b.mo24598m().getTitle().mo5927b();
        if (b == null) {
            return "";
        }
        return b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AbstractC68307f<Object> mo24482g() {
        return m24536j().mo238014c(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$0eU_X8gMtAgOUIcT1If__fqz5Q */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6057p.this.m24534c((Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$6oCfK_mZP5A6H6_Tjmwe65e3tuU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6057p.this.m24530b((Long) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$pllnHV5xdqvf3THv0RCUkae2S5A */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6057p.this.m24529b((AccountService.Account) obj);
            }
        });
    }

    /* renamed from: j */
    private AbstractC68307f<Boolean> m24536j() {
        boolean z;
        DocBridgeWebViewV2 i = mo24484i();
        String url = i.getUrl();
        if (url == null || !url.contains("/space/app/upgrade/")) {
            z = false;
        } else {
            z = f16929g;
        }
        if (!z) {
            return AbstractC68307f.m265083a(Boolean.valueOf((boolean) f16929g));
        }
        C13606d.m55245a(this.f16930a, new RuntimeException("webview has jumped to upgrade page!"));
        return i.mo22361i();
    }

    /* renamed from: l */
    private AbstractC68307f<AccountService.Account> m24538l() {
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f16934e = f;
        if (f != null) {
            return AbstractC68307f.m265083a(f);
        }
        C13479a.m54764b(this.f16930a, "Will doLoad after fullInitReturnAccountFlow");
        return ((AbstractC7935a) KoinJavaComponent.m268610a(AbstractC7935a.class)).mo30707b().mo237985a(C11678b.m48480d()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$sBpERUtBtgX9neU6VIYLzGYs254 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6057p.this.m24521a((AccountService.Account) obj);
            }
        });
    }

    /* renamed from: n */
    private void m24540n() {
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20192b(this.f16931b.mo24597l());
        AbstractC4931i b = this.f16931b.mo19448b();
        if (b instanceof AbstractC6295z) {
            ((AbstractC6295z) b).mo22532a(false, Integer.valueOf(hashCode()));
        }
        mo24484i().mo22337b(this.f16937i);
    }

    /* renamed from: q */
    private void m24543q() {
        DocBridgeWebViewV2 i = mo24484i();
        DocBridgeWebViewV2 b = ak.m22924b();
        if (b != null && i != null && b != i) {
            i.mo22338b(this.f16936h);
            C6095s sVar = this.f16931b;
            sVar.mo19447a(b.mo22319a(sVar.mo24597l().f15974a, this.f16931b.mo24597l().getLifecycle()));
            mo24484i().mo22326a(this.f16936h);
        }
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o
    /* renamed from: c */
    public void mo23800c() {
        if (C10929e.f29412b.get()) {
            C5234y.m21391b().mo21087d("start_open");
        }
        AbstractC4931i b = this.f16931b.mo19448b();
        if (b instanceof AbstractC6295z) {
            ((AbstractC6295z) b).mo22535d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo24483h() {
        C13479a.m54764b(this.f16930a, "dispatchLoadSuccess");
        C13742g.m55710c(this.f16933d);
        List<AbstractC5887o.AbstractC5888a> list = this.f16938j;
        if (list != null) {
            for (AbstractC5887o.AbstractC5888a aVar : list) {
                aVar.onLoadSuccess();
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o
    /* renamed from: b */
    public void mo23798b() {
        C13742g.m55710c(this.f16933d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo24479d() {
        C13479a.m54764b(this.f16930a, "setupWebView");
        if (!this.f16941m.mo22549a()) {
            ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20184a(this.f16931b.mo24597l());
        }
        DocBridgeWebViewV2 i = mo24484i();
        if (f16929g || i != null) {
            AbstractC4931i b = this.f16931b.mo19448b();
            if (b instanceof AbstractC6295z) {
                ((AbstractC6295z) b).mo22532a(f16929g, Integer.valueOf(hashCode()));
            }
            i.mo22323a(this.f16937i);
            C6087a.m24609a(false);
            i.clearHistory();
            DocReport.f16153n.mo23021b(DocOpenConfig.m22771l());
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m24542p() {
        C13479a.m54764b(this.f16930a, "dispatchLoadFailWithTimeout ");
        C13742g.m55710c(this.f16933d);
        DocLoadingState n = DocStateTracker.f16283a.mo23279n();
        DocStateTracker.f16283a.mo23277l();
        if (DocStateTracker.f16283a.mo23279n() == DocLoadingState.OVERTIME) {
            int a = this.f16932c.mo22995a(n);
            this.f16932c.mo23003b(a, DocStateTracker.f16283a.mo23281p(), this.f16935f);
            if (a == DocReport.ErrCode.f16163a.mo23029b()) {
                Disposable b = ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.document.$$Lambda$p$8EQtQao1duid92s6nsC4hfzXTbg */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6057p.this.m24526a((C6057p) ((Boolean) obj));
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.document.$$Lambda$p$AsNVFn3xmcvG2wfeToSBWycdOw */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6057p.this.m24527a((C6057p) ((Throwable) obj));
                    }
                });
                String str = this.f16930a;
                C13479a.m54764b(str, "disposable = " + b);
            }
            if (DocOpenConfig.m22772m() && C5102ai.m20872j().mo20212d() && (a == DocReport.ErrCode.f16163a.mo23039l() || a == DocReport.ErrCode.f16163a.mo23032e())) {
                C6087a.m24609a((boolean) f16929g);
                C13629i.m55300a(this.f16931b.mo19562e());
            }
            mo24475a(a, (Throwable) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m24530b(Long l) throws Exception {
        return m24538l();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC70020b m24534c(Boolean bool) throws Exception {
        return m24537k();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AccountService.Account m24521a(AccountService.Account account) throws Exception {
        C13479a.m54764b(this.f16930a, "load account confirmed");
        this.f16934e = account;
        return account;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m24529b(AccountService.Account account) throws Exception {
        return m24524a(m24539m());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Long m24522a(Long l) throws Exception {
        C13742g.m55706a(this.f16933d, l.longValue());
        return l;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m24531b(Boolean bool) throws Exception {
        String str = this.f16930a;
        C13479a.m54764b(str, "***reportPreloadHtml*** preloadTemplate：onBackPressed result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24535c(Throwable th) throws Exception {
        String str = this.f16930a;
        C13479a.m54764b(str, "Load onError :" + th);
        mo24477a(th, (Map<String, String>) null);
    }

    /* renamed from: a */
    private static AbstractC70020b<Object> m24524a(AbstractC68307f<Object> fVar) {
        if (C13742g.m55707a()) {
            return fVar;
        }
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48481e()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$gif8kzVe4VBGCM88HHOfPdp75s0 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6057p.m24525a(AbstractC68307f.this, (String) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m24533b(Throwable th) throws Exception {
        C13479a.m54761a(this.f16930a, th);
        C13606d.m55245a(this.f16930a, th);
    }

    public C6057p(C6095s sVar) {
        this.f16931b = sVar;
        this.f16938j = new CopyOnWriteArrayList();
        this.f16937i = new C6060b();
        this.f16936h = new C6059a();
        this.f16932c = new DocReport(C5084ad.m20847d(), C5234y.m21391b(), C4511g.m18594d(), C5102ai.m20872j(), C4511g.m18594d().mo17367q());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24526a(Boolean bool) throws Exception {
        String str = this.f16930a;
        C13479a.m54764b(str, "***reportPreloadHtml*** preloadTemplate result:" + bool);
        m24543q();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Object m24523a(Object obj) throws Exception {
        String str;
        boolean z;
        C13479a.m54764b(this.f16930a, "renderDocumentFlow start url isHtmlCache = true ");
        BearUrl e = mo24480e();
        m24545s().mo22329a(e, mo24481f());
        boolean k = m24545s().mo22364k();
        boolean z2 = f16929g;
        int i = 0;
        if (k) {
            C5968f c = C5955d.m24025b().mo24091c(this.f16934e.f14592i + "_" + this.f16934e.f14584a + "_doc_cached_html", e.f17447b);
            if (c == null || c.mo24137d() == null) {
                z = false;
            } else {
                z = f16929g;
            }
            this.f16939k = z;
            boolean isSubscriptDoc = this.f16931b.mo24598m().isSubscriptDoc();
            if (this.f16939k && !isSubscriptDoc) {
                m24545s().mo22331a(c.mo24137d());
            }
        }
        C5968f a = mo24474a(e);
        if (a == null || a.mo24137d() == null) {
            z2 = false;
        } else {
            i = a.mo24137d().length();
        }
        String str2 = this.f16930a;
        C13479a.m54764b(str2, "doLoad hasHtmlCache: " + this.f16939k + " , hasClientVarCache: " + z2 + " , length: " + i);
        int i2 = z2 ? 1 : 0;
        int i3 = z2 ? 1 : 0;
        int i4 = z2 ? 1 : 0;
        DocReport.f16153n.mo23014a(i2, i, m24545s() instanceof LarkWebView);
        if (!z2 || i <= DocOpenConfig.m22762c()) {
            str = "";
        } else {
            str = a.mo24137d();
        }
        m24545s().mo22341b(str);
        C13479a.m54764b(this.f16930a, "renderDocumentFlow end");
        return obj;
    }

    /* renamed from: b */
    public void mo24478b(AbstractC5625aa aaVar) {
        C13479a.m54764b(this.f16930a, "onDestroyView");
        mo23797a(false);
        m24540n();
        if (aaVar.getOnDetachListener() == this.f16942n) {
            aaVar.setOnDetachListener(null);
        }
        mo24484i().mo22338b(this.f16936h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24527a(Throwable th) throws Exception {
        C13479a.m54761a(this.f16930a, th);
        m24543q();
        C13606d.m55245a(this.f16930a, th);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o
    /* renamed from: b */
    public void mo23799b(AbstractC5887o.AbstractC5888a aVar) {
        List<AbstractC5887o.AbstractC5888a> list = this.f16938j;
        if (list != null) {
            list.remove(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24528a(AbstractC70022d dVar) throws Exception {
        C13479a.m54764b(this.f16930a, "Load onSubscribe");
        dVar.request(Long.MAX_VALUE);
        C13742g.m55711d(new Runnable() {
            /* class com.bytedance.ee.bear.document.$$Lambda$p$tJZHM23FY5MMjzdUzAowTxBBjeg */

            public final void run() {
                C6057p.this.m24541o();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5968f mo24474a(BearUrl bearUrl) {
        return C5955d.m24025b().mo24091c(this.f16934e.f14592i + "_" + this.f16934e.f14584a + C8275a.m34053c(bearUrl.f17446a), bearUrl.f17447b);
    }
}
