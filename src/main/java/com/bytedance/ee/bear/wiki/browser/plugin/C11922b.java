package com.bytedance.ee.bear.wiki.browser.plugin;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.C6057p;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wiki.exception.WikiException;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.b */
public class C11922b extends C6057p {

    /* renamed from: h */
    private final boolean f32249h;

    /* renamed from: i */
    private final AbstractC11923a f32250i;

    /* renamed from: j */
    private boolean f32251j;

    /* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.b$a */
    public interface AbstractC11923a {
        void onWikiInfoConfirmed(WikiInfo wikiInfo);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: a */
    public C5968f mo24474a(BearUrl bearUrl) {
        C5968f fVar = null;
        try {
            WikiInfo a = m49412a(this.f16931b.mo19562e().getApplicationContext(), this.f16931b.mo24601p(), this.f16934e, this.f16931b.mo24598m().getOriginBearUrl().f17447b);
            if (a != null) {
                fVar = C5955d.m24025b().mo24091c(this.f16934e.f14592i + "_" + this.f16934e.f14584a + C8275a.m34053c(a.getObjTypeString()), a.getObjToken());
            }
        } catch (Exception e) {
            C13479a.m54761a("WikiLoader", e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getClientVarCache success?");
        sb.append(fVar != null);
        C13479a.m54764b("WikiLoader", sb.toString());
        return fVar == null ? new C5968f() : fVar;
    }

    /* renamed from: a */
    private static String m49423a(AccountService.Account account) {
        return account.f14592i + "_" + account.f14584a + "_WIKI_INFO";
    }

    /* renamed from: a */
    public static AbstractC68307f<WikiInfo> m49420a(Context context, C10917c cVar, String str, boolean z) {
        Context applicationContext = context.getApplicationContext();
        return m49426b(applicationContext, cVar, str, z).mo238026e(new Function(applicationContext, str, cVar, z) {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$GSUDuvpOg8gHTWydNjVU3qu7w */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ C10917c f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.m49424a(this.f$0, this.f$1, this.f$2, this.f$3, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m49424a(Context context, String str, C10917c cVar, boolean z, Throwable th) throws Exception {
        C13479a.m54764b("WikiLoader", "No wiki info cache or read err,will load from network");
        return m49421a(context, str, cVar, z).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$ABgzofauUKNh90FfHYyJ_0TlaaI */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.m49415a(C10917c.this, (WikiInfo) obj);
            }
        });
    }

    /* renamed from: a */
    private static AbstractC68307f<WikiInfo> m49421a(Context context, String str, C10917c cVar, boolean z) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/wiki/tree/get_type/");
        fVar.mo20145a("wiki_token", str);
        fVar.mo20143a(2);
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$b$wp8tRTpLeD6xdyeeJC6XDfIr530.INSTANCE).mo20141a(fVar).mo238029f($$Lambda$b$JGPMdMA9OFXYJOuc1PwH6NtXmxQ.INSTANCE).mo237985a(C11678b.m48478b()).mo238020d(new Function(str, context, cVar, z) {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$wIoBy_zLb6yogULVYghaY5mn19w */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ C10917c f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.m49418a(this.f$0, this.f$1, this.f$2, this.f$3, (WikiInfo) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ WikiInfo m49419a(Throwable th) throws Exception {
        C13479a.m54775e("WikiLoader", "Wiki info rsp err:" + th.getMessage());
        if (th instanceof NetService.ServerErrorException) {
            WikiInfo wikiInfo = new WikiInfo();
            wikiInfo.setCode(((NetService.ServerErrorException) th).getCode());
            return wikiInfo;
        } else if (th instanceof Exception) {
            throw ((Exception) th);
        } else {
            throw new IllegalStateException(th);
        }
    }

    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: a */
    public void mo24477a(Throwable th, Map<String, String> map) {
        m49436j();
        super.mo24477a(th, map);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: e */
    public BearUrl mo24480e() {
        return C6313i.m25327a().mo25399g(C13681h.m55563b(this.f16931b.mo24598m().getOriginUrl(), "wiki_version", "1"));
    }

    /* renamed from: j */
    private void m49436j() {
        TitleBar d;
        if (this.f16931b.mo24598m().getOpenSource() == DocsOpenSource.vc && (d = this.f16931b.mo24597l().mo19444d()) != null) {
            d.mo19515a(false);
            d.mo19525e(false);
            d.mo19526f(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.C6057p
    /* renamed from: g */
    public AbstractC68307f<Object> mo24482g() {
        return m49420a(this.f16931b.mo19562e(), this.f16931b.mo24601p(), this.f16931b.mo24598m().getOriginBearUrl().f17447b, this.f32249h).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$fgX5kyoMBI6nz3ISMLnnwY6PSsc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.this.m49416a((WikiInfo) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$1ojckvAOJyZuuGw71TvTGSlANIY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.this.m49428b((WikiInfo) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$CIZKG17_041W58OLZ04vBK6yako */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.this.m49435f((WikiInfo) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m49434e(WikiInfo wikiInfo) {
        this.f32250i.onWikiInfoConfirmed(wikiInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ AbstractC70020b m49435f(WikiInfo wikiInfo) throws Exception {
        return super.mo24482g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public WikiInfo m49416a(WikiInfo wikiInfo) {
        if (this.f32250i != null) {
            C13742g.m55711d(new Runnable(wikiInfo) {
                /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$0H_2QlWAsteoRBqWsCOgBe1lFU */
                public final /* synthetic */ WikiInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C11922b.this.m49434e(this.f$1);
                }
            });
        }
        return wikiInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ WikiInfo m49433d(WikiInfo wikiInfo) throws Exception {
        if (!this.f32251j) {
            m49432c(wikiInfo);
            this.f32251j = true;
        }
        return wikiInfo;
    }

    /* renamed from: c */
    private void m49432c(WikiInfo wikiInfo) {
        this.f16931b.mo19546a(((AbstractC11921a) KoinJavaComponent.m268610a(AbstractC11921a.class)).mo30724a(this.f16931b, wikiInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public AbstractC70020b<WikiInfo> m49428b(WikiInfo wikiInfo) {
        return AbstractC68307f.m265083a(wikiInfo).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$0HKeU0CpC3Fzlu9gZI2RcjT_w */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.this.m49433d((WikiInfo) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ WikiInfo m49417a(String str) throws NetService.ParseException {
        C13479a.m54772d("WikiLoader", "networkWikiInfoFlow WikiInfo:" + str);
        return (WikiInfo) JSONObject.parseObject(str, WikiInfo.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C5968f m49411a(WikiInfo wikiInfo, C5968f fVar) throws Exception {
        C13479a.m54772d("WikiLoader", "writeCachedWikiInfoFlow res:" + fVar);
        if (C5955d.m24025b().mo24072a(fVar) > 0) {
            return fVar;
        }
        throw new IllegalStateException("Write resource data err !" + wikiInfo);
    }

    /* renamed from: b */
    private static AbstractC68307f<C5968f> m49427b(C10917c cVar, WikiInfo wikiInfo) {
        return cVar.mo41508c(AccountService.class).mo238014c($$Lambda$k8zqxeJuQnfe9U7SpUsxQ1mrw.INSTANCE).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$7fDeBzVoJfZKgZehCiR46SynkUI */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.m49410a(WikiInfo.this, (AccountService.Account) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$lrHyEF8jkrDrKAmfg1saMy97xNg */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.m49411a(WikiInfo.this, (C5968f) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C5968f m49410a(WikiInfo wikiInfo, AccountService.Account account) {
        String a = m49423a(account);
        String a2 = C6313i.m25327a().mo25382a(C8275a.f22377j.mo32553a(), wikiInfo.getWikiToken(), "");
        C5968f fVar = new C5968f();
        fVar.mo24128a(a);
        fVar.mo24138d(JSONObject.toJSONString(wikiInfo));
        fVar.mo24136c(wikiInfo.getWikiToken());
        fVar.mo24146h(a2);
        fVar.mo24127a(Long.valueOf(System.currentTimeMillis()));
        fVar.mo24135c(1);
        fVar.mo24133b(C8275a.f22377j.mo32553a());
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m49429b(WikiInfo wikiInfo, C5968f fVar) throws Exception {
        C13479a.m54764b("WikiLoader", "syncWriteCachedWikiInfo success:" + wikiInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static WikiInfo m49415a(C10917c cVar, WikiInfo wikiInfo) {
        Disposable b = m49427b(cVar, wikiInfo).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$hAYlxxQXEGaZQqrhydakcJjsja0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11922b.m49429b(WikiInfo.this, (C5968f) obj);
            }
        }, $$Lambda$b$yEB_eMEA0_u_BypOjB8_QJsLVo.INSTANCE);
        C13479a.m54764b("WikiLoader", "disposable = " + b);
        return wikiInfo;
    }

    C11922b(C6095s sVar, boolean z, AbstractC11923a aVar) {
        super(sVar);
        this.f16930a = "WikiLoader";
        this.f32249h = z;
        this.f32250i = aVar;
    }

    /* renamed from: a */
    public static WikiInfo m49412a(Context context, C10917c cVar, AccountService.Account account, String str) throws WikiException {
        return m49413a(context, cVar, account, str, false);
    }

    /* renamed from: b */
    private static AbstractC68307f<WikiInfo> m49426b(Context context, C10917c cVar, String str, boolean z) {
        return cVar.mo41508c(AccountService.class).mo237985a(C11678b.m48479c()).mo238014c($$Lambda$k8zqxeJuQnfe9U7SpUsxQ1mrw.INSTANCE).mo238020d(new Function(context, cVar, str, z) {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$b$wJ8Q5Eq0TlsjukFuGM3_OmDw */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ C10917c f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11922b.m49414a(this.f$0, this.f$1, this.f$2, this.f$3, (AccountService.Account) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ WikiInfo m49414a(Context context, C10917c cVar, String str, boolean z, AccountService.Account account) throws Exception {
        WikiInfo a = m49413a(context, cVar, account, str, z);
        C13479a.m54772d("WikiLoader", "readCachedWikiInfoFlow success:" + a);
        return a;
    }

    /* renamed from: a */
    public static WikiInfo m49413a(Context context, C10917c cVar, AccountService.Account account, String str, boolean z) throws WikiException {
        if (account != null) {
            Context applicationContext = context.getApplicationContext();
            String d = C5955d.m24025b().mo24091c(m49423a(account), str).mo24137d();
            if (TextUtils.isEmpty(d)) {
                return null;
            }
            return WikiException.validate(applicationContext, cVar, (WikiInfo) JSONObject.parseObject(d, WikiInfo.class), z);
        }
        throw new IllegalArgumentException("readCachedWikiInfo while account null");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ WikiInfo m49418a(String str, Context context, C10917c cVar, boolean z, WikiInfo wikiInfo) throws Exception {
        wikiInfo.setWikiToken(str);
        return WikiException.validate(context, cVar, wikiInfo, z);
    }
}
