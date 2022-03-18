package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.wikiv2.common.p590a.C12239b;
import com.bytedance.ee.bear.wikiv2.common.util.Opt;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.WikiBrowseReportPuller;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.p3459a.C68326a;
import java.io.Serializable;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0001H\u0007\u001a\"\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\u001a\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\r*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"ALL_TEMPLATES_API", "", "TAG", "browseReport", "", "wikiToken", "buildWikiInfoResourceData", "Lcom/bytedance/ee/bear/document/offline/offlinestorage/ResourceData;", "wikiInfo", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "networkWikiInfoFlow", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "appContext", "Landroid/content/Context;", "optWikiInfoFlow", "readCachedWikiInfo", "context", "fromDisk", "", "readDiskCachedWikiInfo", "readDiskCachedWikiInfoFlow", "readMemoryCachedWikiInfo", "readMemoryCachedWikiInfoFlow", "wikiInfoCacheKey", "wikiInfoFlow", "writeCachedWikiInfo", "validateWikiInfo", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f */
public final class C12213f {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$a */
    public static final class C12214a<T> implements Consumer<Boolean> {

        /* renamed from: a */
        public static final C12214a f32852a = new C12214a();

        C12214a() {
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$b */
    public static final class C12215b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C12215b f32853a = new C12215b();

        C12215b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiRepository", "browseReport err. ", th);
        }
    }

    /* renamed from: a */
    private static final AbstractC68307f<WikiInfo> m50861a(AbstractC68307f<Opt<WikiInfo>> fVar) {
        AbstractC68307f<R> d = fVar.mo238020d(C12223i.f32863a);
        Intrinsics.checkExpressionValueIsNotNull(d, "map { opt ->\n    val wik…    return@map wikiInfo\n}");
        return d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "T", "kotlin.jvm.PlatformType", "it", "apply", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$onOptNoneResumeNext$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$k */
    public static final class C12225k<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ Application f32866a;

        /* renamed from: b */
        final /* synthetic */ String f32867b;

        public C12225k(Application application, String str) {
            this.f32866a = application;
            this.f32867b = str;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "T", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postSerial$1", "com/bytedance/ee/bear/wikiv2/browser/plugin/WikiRepositoryKt$$special$$inlined$postSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$k$a */
        public static final class C12226a<T, R> implements Function<T, R> {
            @Override // io.reactivex.functions.Function
            public final T apply(final T t) {
                AbstractC68307f.m265099b((Callable) new Callable<T>(this) {
                    /* class com.bytedance.ee.bear.wikiv2.browser.plugin.C12213f.C12225k.C12226a.CallableC122271 */

                    /* renamed from: a */
                    final /* synthetic */ C12226a f32868a;

                    {
                        this.f32868a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public /* synthetic */ Object call() {
                        mo46724a();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: a */
                    public final void mo46724a() {
                        C12213f.m50864a((WikiInfo) ((Opt) t).mo46761b());
                    }
                }).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
                return t;
            }
        }

        /* renamed from: a */
        public final AbstractC68307f<Opt<T>> apply(Opt<T> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            if (!aVar.mo46760a()) {
                return AbstractC68307f.m265083a(aVar);
            }
            C13479a.m54764b("WikiRepository", "No wiki info cache or read err,will load from network");
            Application application = this.f32866a;
            Intrinsics.checkExpressionValueIsNotNull(application, "appContext");
            AbstractC68307f<R> d = C12213f.m50867c(application, this.f32867b).mo238020d(new C12226a());
            Intrinsics.checkExpressionValueIsNotNull(d, "networkWikiInfoFlow(appC…achedWikiInfo(it.get()) }");
            return d;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "wikiInfo", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$d */
    public static final class C12217d<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f32855a;

        C12217d(String str) {
            this.f32855a = str;
        }

        /* renamed from: a */
        public final Opt<WikiInfo> apply(WikiInfo wikiInfo) {
            Intrinsics.checkParameterIsNotNull(wikiInfo, "wikiInfo");
            wikiInfo.setWikiToken(this.f32855a);
            return Opt.f32884a.mo46763a(wikiInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "T", "it", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$postSerial$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$f */
    public static final class C12219f<T, R> implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        public final T apply(final T t) {
            AbstractC68307f.m265099b((Callable) new Callable<T>(this) {
                /* class com.bytedance.ee.bear.wikiv2.browser.plugin.C12213f.C12219f.CallableC122201 */

                /* renamed from: a */
                final /* synthetic */ C12219f f32857a;

                {
                    this.f32857a = r1;
                }

                @Override // java.util.concurrent.Callable
                public /* synthetic */ Object call() {
                    mo46717a();
                    return Unit.INSTANCE;
                }

                /* renamed from: a */
                public final void mo46717a() {
                    C12213f.m50864a((WikiInfo) ((Opt) t).mo46761b());
                }
            }).mo238004b(C11678b.m48482f()).mo238001b(C68326a.m265193b(), C12239b.C12240a.f32886a);
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "opt", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$i */
    public static final class C12223i<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C12223i f32863a = new C12223i();

        C12223i() {
        }

        /* renamed from: a */
        public final WikiInfo apply(Opt<WikiInfo> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "opt");
            WikiInfo c = aVar.mo46762c();
            WikiException.validate(C13615c.f35773a, ar.f14811a, c);
            return c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0003 \u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "T", "kotlin.jvm.PlatformType", "it", "apply", "com/bytedance/ee/bear/wikiv2/common/util/RxUtilsKt$onOptNoneResumeNext$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$j */
    public static final class C12224j<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ Application f32864a;

        /* renamed from: b */
        final /* synthetic */ String f32865b;

        public C12224j(Application application, String str) {
            this.f32864a = application;
            this.f32865b = str;
        }

        /* renamed from: a */
        public final AbstractC68307f<Opt<T>> apply(Opt<T> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            if (!aVar.mo46760a()) {
                return AbstractC68307f.m265083a(aVar);
            }
            Application application = this.f32864a;
            Intrinsics.checkExpressionValueIsNotNull(application, "appContext");
            return (AbstractC68307f<Opt<T>>) C12213f.m50865b(application, this.f32865b);
        }
    }

    /* renamed from: a */
    private static final String m50863a(AccountService.Account account) {
        return account.f14592i + "_" + account.f14584a + "_WIKI_INFO";
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "throwable", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$c */
    public static final class C12216c<T, R> implements Function<Throwable, WikiInfo> {

        /* renamed from: a */
        public static final C12216c f32854a = new C12216c();

        C12216c() {
        }

        /* renamed from: a */
        public final WikiInfo apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54775e("WikiRepository", "Wiki info rsp err:" + th.getMessage());
            WikiInfo wikiInfo = new WikiInfo();
            if (th instanceof NetService.ServerErrorException) {
                wikiInfo.setCode(((NetService.ServerErrorException) th).getCode());
            } else {
                wikiInfo.setCode(-8011);
            }
            return wikiInfo;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "kotlin.jvm.PlatformType", "json", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$e */
    public static final class C12218e<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<WikiInfo> {

        /* renamed from: a */
        public static final C12218e f32856a = new C12218e();

        C12218e() {
        }

        /* renamed from: a */
        public final WikiInfo parse(String str) {
            Intrinsics.checkParameterIsNotNull(str, "json");
            C13479a.m54772d("WikiRepository", "networkWikiInfoFlow WikiInfo:" + str);
            return (WikiInfo) JSONObject.parseObject(str, WikiInfo.class);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "<anonymous parameter 0>", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$g */
    public static final class C12221g<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ Context f32859a;

        /* renamed from: b */
        final /* synthetic */ String f32860b;

        C12221g(Context context, String str) {
            this.f32859a = context;
            this.f32860b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ee.bear.wikiv2.common.a.a$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final Opt<WikiInfo> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 0>");
            WikiInfo e = C12213f.m50870e(this.f32859a, this.f32860b);
            C13479a.m54772d("WikiRepository", "readDiskCachedWikiInfoFlow success:" + e);
            return Opt.f32884a.mo46763a(e);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "<anonymous parameter 0>", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.f$h */
    public static final class C12222h<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ Context f32861a;

        /* renamed from: b */
        final /* synthetic */ String f32862b;

        C12222h(Context context, String str) {
            this.f32861a = context;
            this.f32862b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.bytedance.ee.bear.wikiv2.common.a.a$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final Opt<WikiInfo> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 0>");
            WikiInfo d = C12213f.m50869d(this.f32861a, this.f32862b);
            C13479a.m54772d("WikiRepository", "readMemoryCachedWikiInfoFlow success:" + d);
            return Opt.f32884a.mo46763a(d);
        }
    }

    /* renamed from: b */
    public static final AbstractC68307f<Opt<WikiInfo>> m50866b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "appContext");
        Application application2 = application;
        AbstractC68307f<Opt<WikiInfo>> a = AbstractC68307f.m265091a(m50871f(application2, str), m50867c(application2, str).mo238020d(new C12219f()));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.concat(\n       …                  }\n    )");
        return a;
    }

    /* renamed from: c */
    public static final void m50868c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C12455c.m51805p((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new WikiBrowseReportPuller.Params(str)).mo238001b(C12214a.f32852a, C12215b.f32853a);
        }
    }

    /* renamed from: a */
    public static final AbstractC68307f<WikiInfo> m50862a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "appContext");
        AbstractC68307f<R> c = m50871f(application, str).mo238014c(new C12224j(application, str));
        Intrinsics.checkExpressionValueIsNotNull(c, "flatMap {\n    return@fla…t(it) else consumer(it)\n}");
        AbstractC68307f<R> c2 = c.mo238014c(new C12225k(application, str));
        Intrinsics.checkExpressionValueIsNotNull(c2, "flatMap {\n    return@fla…t(it) else consumer(it)\n}");
        AbstractC68307f<WikiInfo> a = m50861a(c2).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a, "readMemoryCachedWikiInfo…rSchedulers.mainThread())");
        return a;
    }

    /* renamed from: a */
    public static final void m50864a(WikiInfo wikiInfo) {
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (!wikiInfo.isValid()) {
            C5955d.m24025b().mo24088b(wikiInfo.getWikiToken());
            C13479a.m54772d("WikiRepository", "writeCachedWikiInfo, invalid wikiInfo, delete res:" + wikiInfo);
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(f, "account");
        C5968f a = m50860a(wikiInfo, f);
        C13479a.m54772d("WikiRepository", "writeCachedWikiInfoFlow res:" + a);
        if (C5955d.m24025b().mo24072a(a) <= 0) {
            C13479a.m54758a("WikiRepository", "Write resource data err !");
        }
    }

    /* renamed from: d */
    public static final WikiInfo m50869d(Context context, String str) {
        return m50859a(context, str, false);
    }

    /* renamed from: e */
    public static final WikiInfo m50870e(Context context, String str) {
        return m50859a(context, str, true);
    }

    /* renamed from: b */
    public static final AbstractC68307f<Opt<WikiInfo>> m50865b(Context context, String str) {
        AbstractC68307f<Opt<WikiInfo>> d = AbstractC68307f.m265083a("").mo237985a(C11678b.m48477a()).mo238020d(new C12221g(context, str));
        Intrinsics.checkExpressionValueIsNotNull(d, "Flowable.just(\"\")\n      …e(wikiInfo)\n            }");
        return d;
    }

    /* renamed from: f */
    private static final AbstractC68307f<Opt<WikiInfo>> m50871f(Context context, String str) {
        AbstractC68307f<Opt<WikiInfo>> d = AbstractC68307f.m265083a("").mo238020d(new C12222h(context, str));
        Intrinsics.checkExpressionValueIsNotNull(d, "Flowable.just(\"\")\n      …e(wikiInfo)\n            }");
        return d;
    }

    /* renamed from: a */
    public static final WikiInfo m50858a(Context context, String str) throws WikiException {
        Intrinsics.checkParameterIsNotNull(context, "appContext");
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        WikiInfo d = m50869d(context, str);
        if (d == null) {
            d = m50870e(context, str);
        }
        WikiInfo validate = WikiException.validate(context, ar.f14811a, d);
        Intrinsics.checkExpressionValueIsNotNull(validate, "WikiException.validate(a…serviceContext, wikiInfo)");
        return validate;
    }

    /* renamed from: c */
    public static final AbstractC68307f<Opt<WikiInfo>> m50867c(Context context, String str) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/wiki/v2/tree/get_type/");
        fVar.mo20145a("wiki_token", str);
        fVar.mo20143a(2);
        AbstractC68307f<Opt<WikiInfo>> d = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(C12218e.f32856a).mo20141a(fVar).mo238029f(C12216c.f32854a).mo238020d(new C12217d(str));
        Intrinsics.checkExpressionValueIsNotNull(d, "puller.pull(request)\n   …e(wikiInfo)\n            }");
        return d;
    }

    /* renamed from: a */
    private static final C5968f m50860a(WikiInfo wikiInfo, AccountService.Account account) {
        String a = m50863a(account);
        C6313i a2 = C6313i.m25327a();
        C8275a aVar = C8275a.f22377j;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.WIKI");
        String a3 = a2.mo25382a(aVar.mo32553a(), wikiInfo.getWikiToken(), "");
        C5968f fVar = new C5968f();
        fVar.mo24128a(a);
        fVar.mo24138d(JSONObject.toJSONString(wikiInfo));
        fVar.mo24136c(wikiInfo.getWikiToken());
        fVar.mo24146h(a3);
        fVar.mo24127a(Long.valueOf(System.currentTimeMillis()));
        fVar.mo24135c(1);
        C8275a aVar2 = C8275a.f22377j;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.WIKI");
        fVar.mo24133b(aVar2.mo32553a());
        return fVar;
    }

    /* renamed from: a */
    private static final WikiInfo m50859a(Context context, String str, boolean z) {
        C5968f fVar;
        String str2;
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f == null) {
            return null;
        }
        String a = m50863a(f);
        if (z) {
            fVar = C5955d.m24025b().mo24086b(a, str);
        } else {
            fVar = C5955d.m24025b().mo24091c(a, str);
        }
        if (fVar != null) {
            str2 = fVar.mo24137d();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return (WikiInfo) JSONObject.parseObject(str2, WikiInfo.class);
    }
}
