package com.bytedance.ee.bear.debug.doctest;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.C5087ae;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.debug.doctest.PopWindowImpl;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001JB=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\b\u0010)\u001a\u00020$H\u0002J\u0012\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010\u001fH\u0016J\"\u0010,\u001a\u00020$2\u0006\u0010+\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u001f2\u0006\u0010.\u001a\u00020\u001cH\u0016J\b\u0010/\u001a\u00020$H\u0016J\b\u00100\u001a\u00020$H\u0016J(\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u0001032\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u000105H\u0016J\u001e\u00106\u001a\u00020$2\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u000105H\u0016J\u0012\u00108\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u00109\u001a\u00020$H\u0016J\b\u0010:\u001a\u00020$H\u0016J\b\u0010;\u001a\u00020$H\u0016J\u0010\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020$H\u0016J\b\u0010@\u001a\u00020$H\u0016J\u0016\u0010A\u001a\u00020$2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\b\u0010C\u001a\u00020$H\u0016J0\u0010D\u001a\u00020$2&\u0010E\u001a\"\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010Fj\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u0001`GH\u0002J\b\u0010H\u001a\u00020$H\u0016J\b\u0010I\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl;", "Lcom/bytedance/ee/bear/debug/doctest/IDocAutoTest;", "Lcom/bytedance/ee/bear/debug/doctest/IDocTrigger;", "Lcom/bytedance/ee/bear/debug/doctest/PopWindowImpl$DialogDismiss;", "Lcom/bytedance/ee/bear/contract/DocWebService$RenderCallback;", "mContext", "Landroid/content/Context;", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "mRouterService", "Lcom/bytedance/ee/bear/route/RouteService;", "mDebugServiceImp", "Lcom/bytedance/ee/bear/debug/doctest/DocDebugService;", "mDocWebService", "Lcom/bytedance/ee/bear/contract/DocWebService;", "mInfoProvideService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "mLoginService", "Lcom/bytedance/ee/bear/contract/LocalAccountService;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/contract/NetService;Lcom/bytedance/ee/bear/route/RouteService;Lcom/bytedance/ee/bear/debug/doctest/DocDebugService;Lcom/bytedance/ee/bear/contract/DocWebService;Lcom/bytedance/ee/bear/contract/InfoProvideService;Lcom/bytedance/ee/bear/contract/LocalAccountService;)V", "mCounter", "Lcom/bytedance/ee/bear/debug/doctest/DocCounter;", "mPop", "Lcom/bytedance/ee/bear/debug/doctest/IPopWindow;", "mRequest", "Lcom/bytedance/ee/bear/debug/doctest/IRequest;", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "stopWorld", "", "whiteList", "", "", "whiteListType", "Ljava/util/ArrayList;", "", "autoOpen", "", "docInfo", "autoPullRefresh", "dismiss", "getWhiteList", "loadMore", "onDocGoBack", "url", "onDocStart", "tag", "forward", "onDownloadFullResource", "onRenderByWaitPreload", "onRenderFail", "throwable", "", "map", "", "onRenderSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onRendering", "onWaitDownloadFullResource", "onWaitPreloading", "openNext", "openWiki", "wiki", "Lcom/bytedance/ee/bear/list/dto/Document;", "pause", "resume", "setWhiteList", "types", "start", "startRequest", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stop", "stopPull", "Companion", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.doctest.k */
public final class WikiAutoTestImpl implements AbstractC5089af.AbstractC5091b, IDocAutoTest, IDocTrigger, PopWindowImpl.DialogDismiss {

    /* renamed from: b */
    public static final Companion f15137b = new Companion(null);

    /* renamed from: a */
    public final AbstractC10740f f15138a;

    /* renamed from: c */
    private final IPopWindow f15139c;

    /* renamed from: d */
    private final IRequest<DocumentListInfo> f15140d;

    /* renamed from: e */
    private final DocCounter f15141e;

    /* renamed from: f */
    private boolean f15142f;

    /* renamed from: g */
    private List<String> f15143g;

    /* renamed from: h */
    private final ArrayList<Integer> f15144h;

    /* renamed from: i */
    private final Context f15145i;

    /* renamed from: j */
    private final NetService f15146j;

    /* renamed from: k */
    private final AbstractC5279b f15147k;

    /* renamed from: l */
    private final AbstractC5089af f15148l;

    /* renamed from: m */
    private final al f15149m;

    /* renamed from: n */
    private final an f15150n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$f */
    static final class C5288f implements AbstractC68309a {

        /* renamed from: a */
        public static final C5288f f15155a = new C5288f();

        C5288f() {
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
        }
    }

    /* renamed from: f */
    private final void m21624f() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onDocGoBack(String str) {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRenderByWaitPreload() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRenderFail(Throwable th, Map<String, String> map) {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRendering(String str) {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onWaitPreloading() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl$Companion;", "", "()V", "TAG", "", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo21263a() {
        mo21267c();
    }

    /* renamed from: b */
    public void mo21266b() {
        m21624f();
    }

    @Override // com.bytedance.ee.bear.debug.doctest.PopWindowImpl.DialogDismiss
    public void dismiss() {
        stop();
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public List<String> getWhiteList() {
        return this.f15143g;
    }

    /* renamed from: c */
    public final void mo21267c() {
        m21622a((HashMap<String, String>) null);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onDownloadFullResource() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onWaitDownloadFullResource() {
        throw new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public void start() {
        C13479a.m54764b("WikiAutoTestImpl", "start");
        this.f15142f = false;
        this.f15139c.mo21251a();
        this.f15147k.mo21250a(this);
        mo21263a();
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public void stop() {
        C13479a.m54764b("WikiAutoTestImpl", "stop");
        this.f15142f = true;
        mo21266b();
        this.f15147k.mo21250a(null);
        this.f15139c.mo21252b();
    }

    /* renamed from: e */
    private final void m21623e() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("check_id", this.f15141e.mo21246d());
        hashMap.put("next_id", this.f15141e.mo21244c());
        hashMap.put("next_id", this.f15141e.mo21242b());
        m21622a(hashMap);
    }

    /* renamed from: d */
    public void mo21268d() {
        while (this.f15141e.mo21248f()) {
            Document g = this.f15141e.mo21249g();
            if (g != null && this.f15144h.contains(Integer.valueOf(g.mo32483t()))) {
                AbstractC68307f.m265083a(g).mo237985a(C11678b.m48481e()).mo238001b(new C5289g(this, g), C5290h.f15158a);
                return;
            }
        }
        if (this.f15141e.mo21247e()) {
            m21623e();
        } else {
            mo21267c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$e */
    static final class C5287e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C5287e f15154a = new C5287e();

        C5287e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiAutoTestImpl", "error throwable ", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/dto/Document;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$g */
    public static final class C5289g<T> implements Consumer<Document> {

        /* renamed from: a */
        final /* synthetic */ WikiAutoTestImpl f15156a;

        /* renamed from: b */
        final /* synthetic */ Document f15157b;

        C5289g(WikiAutoTestImpl kVar, Document document) {
            this.f15156a = kVar;
            this.f15157b = document;
        }

        /* renamed from: a */
        public final void accept(Document document) {
            this.f15156a.mo21265a(this.f15157b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$h */
    public static final class C5290h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C5290h f15158a = new C5290h();

        C5290h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiAutoTestImpl", "error!", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$i */
    public static final class C5291i<T> implements Consumer<DocumentListInfo> {

        /* renamed from: a */
        final /* synthetic */ WikiAutoTestImpl f15159a;

        C5291i(WikiAutoTestImpl kVar) {
            this.f15159a = kVar;
        }

        /* renamed from: a */
        public final void accept(DocumentListInfo documentListInfo) {
            WikiAutoTestImpl kVar = this.f15159a;
            Intrinsics.checkExpressionValueIsNotNull(documentListInfo, "it");
            kVar.mo21264a(documentListInfo);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$j */
    public static final class C5292j<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiAutoTestImpl f15160a;

        C5292j(WikiAutoTestImpl kVar) {
            this.f15160a = kVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("WikiAutoTestImpl", th);
            this.f15160a.mo21267c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0004*\u0001\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "com/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl$onRenderSuccess$1", "it", "apply", "(Lcom/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl$onRenderSuccess$1;)Lcom/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl$onRenderSuccess$1;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$c */
    static final class C5285c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ WikiAutoTestImpl f15152a;

        C5285c(WikiAutoTestImpl kVar) {
            this.f15152a = kVar;
        }

        /* renamed from: a */
        public final C5284b apply(C5284b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            C13479a.m54764b("WikiAutoTestImpl", "onBackPressed");
            Activity b = this.f15152a.f15138a.mo17294b();
            if (b != null) {
                b.onBackPressed();
            }
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0004*\u0001\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "com/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl$onRenderSuccess$1", "kotlin.jvm.PlatformType", "accept", "(Lcom/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl$onRenderSuccess$1;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$d */
    static final class C5286d<T> implements Consumer<C5284b> {

        /* renamed from: a */
        public static final C5286d f15153a = new C5286d();

        C5286d() {
        }

        /* renamed from: a */
        public final void accept(C5284b bVar) {
            WikiAutoTestImpl kVar;
            C13479a.m54764b("WikiAutoTestImpl", "after 2 seconds openNext");
            if (bVar != null && (kVar = (WikiAutoTestImpl) bVar.get()) != null) {
                kVar.mo21268d();
            }
        }
    }

    /* renamed from: a */
    public final void mo21265a(Document document) {
        if (!this.f15142f) {
            this.f15148l.mo20186a(this);
            this.f15138a.mo17292a(document.mo32481s());
        }
    }

    /* renamed from: a */
    private final void m21622a(HashMap<String, String> hashMap) {
        AbstractC68307f<DocumentListInfo> fVar;
        if (!this.f15142f) {
            if (hashMap != null) {
                fVar = this.f15140d.mo21254a("/api/wiki/search/get_recent/", hashMap);
            } else {
                fVar = this.f15140d.mo21253a();
            }
            fVar.mo237985a(C11678b.m48481e()).mo238001b(new C5291i(this), new C5292j(this));
        }
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IDocAutoTest
    public void setWhiteList(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "types");
        this.f15144h.clear();
        this.f15143g = list;
        for (String str : list) {
            this.f15144h.add(Integer.valueOf(C8275a.m34051b(str)));
        }
    }

    /* renamed from: a */
    public final void mo21264a(DocumentListInfo documentListInfo) {
        if (!this.f15142f) {
            ArrayList<Document> documentList = documentListInfo.getDocumentList();
            Intrinsics.checkExpressionValueIsNotNull(documentList, "docInfo.documentList");
            this.f15141e.mo21238a().addAll(documentList);
            DocCounter aVar = this.f15141e;
            String lastLabel = documentListInfo.getLastLabel();
            String str = "";
            if (lastLabel == null) {
                lastLabel = str;
            }
            aVar.mo21240a(lastLabel);
            DocCounter aVar2 = this.f15141e;
            String nextId = documentListInfo.getNextId();
            if (nextId == null) {
                nextId = str;
            }
            aVar2.mo21243b(nextId);
            DocCounter aVar3 = this.f15141e;
            String checkId = documentListInfo.getCheckId();
            if (checkId != null) {
                str = checkId;
            }
            aVar3.mo21245c(str);
            this.f15141e.mo21241a(documentListInfo.isHasMore());
            if (this.f15141e.mo21248f()) {
                mo21268d();
            } else {
                mo21267c();
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5091b
    public void onRenderSuccess(Map<String, String> map) {
        if (C5087ae.f14801a.booleanValue() && !this.f15142f) {
            AbstractC68307f.m265083a(new C5284b(this, this)).mo238019d(2, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238020d(new C5285c(this)).mo238019d(1, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo237978a(C5286d.f15153a, C5287e.f15154a, C5288f.f15155a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl$onRenderSuccess$1", "Ljava/lang/ref/WeakReference;", "Lcom/bytedance/ee/bear/debug/doctest/WikiAutoTestImpl;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.doctest.k$b */
    public static final class C5284b extends WeakReference<WikiAutoTestImpl> {

        /* renamed from: a */
        final /* synthetic */ WikiAutoTestImpl f15151a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5284b(WikiAutoTestImpl kVar, Object obj) {
            super(obj);
            this.f15151a = kVar;
        }
    }

    public WikiAutoTestImpl(Context context, NetService netService, AbstractC10740f fVar, AbstractC5279b bVar, AbstractC5089af afVar, al alVar, an anVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(netService, "mNetService");
        Intrinsics.checkParameterIsNotNull(fVar, "mRouterService");
        Intrinsics.checkParameterIsNotNull(bVar, "mDebugServiceImp");
        Intrinsics.checkParameterIsNotNull(afVar, "mDocWebService");
        Intrinsics.checkParameterIsNotNull(alVar, "mInfoProvideService");
        Intrinsics.checkParameterIsNotNull(anVar, "mLoginService");
        this.f15145i = context;
        this.f15146j = netService;
        this.f15138a = fVar;
        this.f15147k = bVar;
        this.f15148l = afVar;
        this.f15149m = alVar;
        this.f15150n = anVar;
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        C8275a aVar2 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
        C8275a aVar3 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.BITABLE");
        this.f15143g = CollectionsKt.listOf((Object[]) new String[]{aVar.mo32553a(), aVar2.mo32553a(), aVar3.mo32553a()});
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f15144h = arrayList;
        PopWindowImpl hVar = new PopWindowImpl(context, this);
        this.f15139c = hVar;
        this.f15140d = new RequestWikiImpl(netService);
        this.f15141e = new DocCounter(hVar);
        C8275a aVar4 = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.DOC");
        arrayList.add(Integer.valueOf(aVar4.mo32555b()));
    }
}
