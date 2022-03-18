package com.bytedance.ee.bear.document.loading;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C5671b;
import com.bytedance.ee.bear.document.DocReport;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.fail.DocException;
import com.bytedance.ee.bear.document.loading.LoadingLayout;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u0012J\b\u0010!\u001a\u00020\u0014H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPluginV2;", "()V", "loadingState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$DocumentLoadState;", "getLoadingState", "()Landroidx/lifecycle/MutableLiveData;", "loadingState$delegate", "Lkotlin/Lazy;", "mDocReport", "Lcom/bytedance/ee/bear/document/DocReport;", "getMDocReport", "()Lcom/bytedance/ee/bear/document/DocReport;", "mDocReport$delegate", "mLoadingWrapper", "Lcom/bytedance/ee/bear/document/loading/LazyLoadingWrapper;", "mOnRetryListener", "Lcom/bytedance/ee/bear/document/loading/LoadingLayout$OnRetryListener;", "hideLoadingView", "", "initLoadingView", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "loadFail", "failState", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "onAttachToUIContainer", "onDetachFromUIContainer", "setOnRetryListener", "listener", "showLoadingView", "Companion", "DocumentLoadState", "InnerLoadingHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocLoadingPlugin extends DocumentPluginV2 {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocLoadingPlugin.class), "mDocReport", "getMDocReport()Lcom/bytedance/ee/bear/document/DocReport;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocLoadingPlugin.class), "loadingState", "getLoadingState()Landroidx/lifecycle/MutableLiveData;"))};
    public static final Companion Companion = new Companion(null);
    public static final String TAG = TAG;
    private final Lazy loadingState$delegate = LazyKt.lazy(C5859e.INSTANCE);
    private final Lazy mDocReport$delegate = LazyKt.lazy(C5860f.INSTANCE);
    private LazyLoadingWrapper mLoadingWrapper;
    private LoadingLayout.AbstractC5864a mOnRetryListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$DocumentLoadState;", "", "code", "", "err", "", "(ILjava/lang/Throwable;)V", "getCode", "()I", "getErr", "()Ljava/lang/Throwable;", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.loading.DocLoadingPlugin$b */
    public static final class DocumentLoadState {

        /* renamed from: a */
        public static final Companion f16404a = new Companion(null);

        /* renamed from: b */
        private final int f16405b;

        /* renamed from: c */
        private final Throwable f16406c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$DocumentLoadState$Companion;", "", "()V", "CODE_LOADING", "", "CODE_SUCCESS", "fail", "Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$DocumentLoadState;", "code", "err", "", "loading", "success", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.loading.DocLoadingPlugin$b$a */
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            /* renamed from: a */
            public final DocumentLoadState mo23551a() {
                return new DocumentLoadState(-800001, null);
            }

            /* renamed from: b */
            public final DocumentLoadState mo23553b() {
                return new DocumentLoadState(-800002, null);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final DocumentLoadState mo23552a(int i, Throwable th) {
                return new DocumentLoadState(i, th);
            }
        }

        /* renamed from: a */
        public final int mo23549a() {
            return this.f16405b;
        }

        /* renamed from: b */
        public final Throwable mo23550b() {
            return this.f16406c;
        }

        public DocumentLoadState(int i, Throwable th) {
            this.f16405b = i;
            this.f16406c = th;
        }
    }

    private final DocReport getMDocReport() {
        Lazy lazy = this.mDocReport$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (DocReport) lazy.getValue();
    }

    public final C1177w<DocumentLoadState> getLoadingState() {
        Lazy lazy = this.loadingState$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (C1177w) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.loading.DocLoadingPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$DocumentLoadState;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.loading.DocLoadingPlugin$e */
    static final class C5859e extends Lambda implements Function0<C1177w<DocumentLoadState>> {
        public static final C5859e INSTANCE = new C5859e();

        C5859e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<DocumentLoadState> invoke() {
            return new C1177w<>();
        }
    }

    public final void hideLoadingView() {
        LazyLoadingWrapper lazyLoadingWrapper = this.mLoadingWrapper;
        if (lazyLoadingWrapper != null) {
            lazyLoadingWrapper.mo23560d();
        }
    }

    public final void showLoadingView() {
        LazyLoadingWrapper lazyLoadingWrapper = this.mLoadingWrapper;
        if (lazyLoadingWrapper != null) {
            lazyLoadingWrapper.mo23558b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$InnerLoadingHandler;", "Lcom/bytedance/ee/bear/document/DocumentLoader$LoadingCallback;", "(Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin;)V", "onLoadFail", "", "code", "", "e", "", "onLoadStart", "onLoadSuccess", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.loading.DocLoadingPlugin$c */
    private final class InnerLoadingHandler implements AbstractC5887o.AbstractC5888a {
        @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
        public void onLoadStart() {
            C13479a.m54764b(DocLoadingPlugin.TAG, "startLoading");
            DocLoadingPlugin.this.getLoadingState().mo5929b(DocumentLoadState.f16404a.mo23551a());
        }

        @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
        public void onLoadSuccess() {
            C13479a.m54764b(DocLoadingPlugin.TAG, "loadSuccess");
            DocLoadingPlugin.this.getLoadingState().mo5929b(DocumentLoadState.f16404a.mo23553b());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public InnerLoadingHandler() {
        }

        @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
        public void onLoadFail(int i, Throwable th) {
            StackTraceElement[] stackTraceElementArr;
            String str = DocLoadingPlugin.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("loadFail{code:");
            sb.append(i);
            sb.append(", ");
            if (th != null) {
                stackTraceElementArr = th.getStackTrace();
            } else {
                stackTraceElementArr = null;
            }
            sb.append(stackTraceElementArr);
            sb.append('}');
            C13479a.m54764b(str, sb.toString());
            DocLoadingPlugin.this.getLoadingState().mo5929b(DocumentLoadState.f16404a.mo23552a(i, th));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/document/DocReport;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.loading.DocLoadingPlugin$f */
    static final class C5860f extends Lambda implements Function0<DocReport> {
        public static final C5860f INSTANCE = new C5860f();

        C5860f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DocReport invoke() {
            ConnectionService d = C5084ad.m20847d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            al d2 = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "InfoProvideServiceImp.getInstance()");
            AbstractC5238z j = C5102ai.m20872j();
            Intrinsics.checkExpressionValueIsNotNull(j, "DocumentSdkVisibleServiceImpl.getInstance()");
            al d3 = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d3, "InfoProvideServiceImp.getInstance()");
            String q = d3.mo17367q();
            Intrinsics.checkExpressionValueIsNotNull(q, "InfoProvideServiceImp.getInstance().versionType");
            return new DocReport(d, b, d2, j, q);
        }
    }

    public final void setOnRetryListener(LoadingLayout.AbstractC5864a aVar) {
        this.mOnRetryListener = aVar;
        LazyLoadingWrapper lazyLoadingWrapper = this.mLoadingWrapper;
        if (lazyLoadingWrapper != null) {
            lazyLoadingWrapper.mo23557a(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "host");
        super.onAttachToHost(eVar);
        getEditorAbility().mo24600o().mo23796a(new InnerLoadingHandler());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "docmentLoadState", "Lcom/bytedance/ee/bear/document/loading/DocLoadingPlugin$DocumentLoadState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.loading.DocLoadingPlugin$d */
    public static final class C5858d<T> implements AbstractC1178x<DocumentLoadState> {

        /* renamed from: a */
        final /* synthetic */ DocLoadingPlugin f16408a;

        C5858d(DocLoadingPlugin docLoadingPlugin) {
            this.f16408a = docLoadingPlugin;
        }

        /* renamed from: a */
        public final void onChanged(DocumentLoadState bVar) {
            switch (bVar.mo23549a()) {
                case -800002:
                    this.f16408a.hideLoadingView();
                    return;
                case -800001:
                    this.f16408a.showLoadingView();
                    return;
                default:
                    DocLoadingPlugin docLoadingPlugin = this.f16408a;
                    Intrinsics.checkExpressionValueIsNotNull(bVar, "docmentLoadState");
                    docLoadingPlugin.loadFail(bVar);
                    return;
            }
        }
    }

    private final void initLoadingView(AbstractC4958n nVar) {
        BearUrl bearUrl = getEditorAbility().mo24602q().getBearUrl();
        LazyLoadingWrapper lazyLoadingWrapper = new LazyLoadingWrapper(nVar.mo19601f(), C5890a.m23709b(bearUrl), bearUrl.f17446a);
        this.mLoadingWrapper = lazyLoadingWrapper;
        if (lazyLoadingWrapper != null) {
            lazyLoadingWrapper.mo23557a(this.mOnRetryListener);
        }
        C1177w<DocumentLoadState> loadingState = getLoadingState();
        C4943e host = getHost();
        Intrinsics.checkExpressionValueIsNotNull(host, "host");
        loadingState.mo5923a(host.mo19566h(), new C5858d(this));
    }

    public final void loadFail(DocumentLoadState bVar) {
        String str;
        if (bVar.mo23549a() == 5) {
            getMDocReport().mo22997a(bVar.mo23549a());
            new C5671b(ar.m20936a()).mo22660b();
        }
        if (this.mLoadingWrapper == null) {
            C13479a.m54758a(TAG, "load fail while loading view null !");
            return;
        }
        if (bVar.mo23550b() instanceof DocException) {
            str = bVar.mo23550b().getMessage();
        } else {
            str = "";
        }
        LazyLoadingWrapper lazyLoadingWrapper = this.mLoadingWrapper;
        if (lazyLoadingWrapper != null) {
            lazyLoadingWrapper.mo23556a(bVar.mo23549a(), str);
        }
        LazyLoadingWrapper lazyLoadingWrapper2 = this.mLoadingWrapper;
        if (lazyLoadingWrapper2 != null) {
            lazyLoadingWrapper2.mo23559c();
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        initLoadingView(nVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer(eVar, nVar);
        this.mOnRetryListener = null;
        LazyLoadingWrapper lazyLoadingWrapper = this.mLoadingWrapper;
        if (lazyLoadingWrapper != null) {
            lazyLoadingWrapper.mo23555a();
        }
    }
}
