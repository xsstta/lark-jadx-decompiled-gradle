package com.bytedance.ee.bear.templates.search.base;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.list.dto.AbstractC8276b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.TemplateUtils;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.templates.search.base.ISearchListView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\b\u0016\u0018\u0000 82\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u00018B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\b\u0010&\u001a\u00020\u0004H\u0014J\b\u0010'\u001a\u00020(H\u0016J0\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/H\u0002J(\u00100\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0002J\b\u00102\u001a\u00020(H\u0016J\b\u00103\u001a\u00020(H\u0016J\u0010\u00104\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u00106\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u00107\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8DX\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00069"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BasePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListModel;", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;", "Lcom/bytedance/ee/bear/templates/search/base/ISearchListView$IViewDelegate;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "view", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/templates/search/base/ISearchListModel;Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;)V", "buffer", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFragment", "()Landroidx/fragment/app/Fragment;", "hasData", "", "loadingRunnable", "Ljava/lang/Runnable;", "getModel", "()Lcom/bytedance/ee/bear/templates/search/base/ISearchListModel;", "offset", "", "searchKey", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "templateCenterViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenterViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenterViewModel$delegate", "getView", "()Lcom/bytedance/ee/bear/templates/search/base/ISearchListView;", "createViewDelegate", "destroy", "", "handleCreateError", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "module", "throwable", "", "handleCreateSuccess", "url", "loadMore", "onLoadFailed", "onSearchChange", "onTemplateClicked", "onTemplateDelete", "resetSearchKey", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a.b */
public class BasePresenter extends com.larksuite.framework.mvp.BasePresenter<ISearchListModel, ISearchListView, ISearchListView.IViewDelegate> implements ISearchListView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31314a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BasePresenter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BasePresenter.class), "templateCenterViewModel", "getTemplateCenterViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: f */
    public static final Companion f31315f = new Companion(null);

    /* renamed from: b */
    public int f31316b;

    /* renamed from: c */
    public String f31317c = "";

    /* renamed from: d */
    public boolean f31318d;

    /* renamed from: e */
    public final Runnable f31319e = new RunnableC11632d(this);

    /* renamed from: g */
    private final C68289a f31320g = new C68289a();

    /* renamed from: h */
    private String f31321h = "";

    /* renamed from: i */
    private final Lazy f31322i = LazyKt.lazy(C11637i.INSTANCE);

    /* renamed from: j */
    private final Lazy f31323j = LazyKt.lazy(new C11638j(this));

    /* renamed from: k */
    private final Fragment f31324k;

    /* renamed from: l */
    private final ISearchListModel f31325l;

    /* renamed from: m */
    private final ISearchListView f31326m;

    /* renamed from: a */
    public final C10917c mo44633a() {
        Lazy lazy = this.f31322i;
        KProperty kProperty = f31314a[0];
        return (C10917c) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final TemplateCenterViewModel mo44638b() {
        Lazy lazy = this.f31323j;
        KProperty kProperty = f31314a[1];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ISearchListView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView.IViewDelegate
    /* renamed from: e */
    public void mo44642e() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/BasePresenter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public Fragment mo44643f() {
        return this.f31324k;
    }

    /* renamed from: g */
    public ISearchListModel mo44644g() {
        return this.f31325l;
    }

    /* renamed from: h */
    public ISearchListView mo44645h() {
        return this.f31326m;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$i */
    static final class C11637i extends Lambda implements Function0<C10917c> {
        public static final C11637i INSTANCE = new C11637i();

        C11637i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$j */
    static final class C11638j extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BasePresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11638j(BasePresenter bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.mo44643f().requireActivity()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (!this.f31320g.isDisposed()) {
            this.f31320g.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$d */
    static final class RunnableC11632d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f31329a;

        RunnableC11632d(BasePresenter bVar) {
            this.f31329a = bVar;
        }

        public final void run() {
            if (this.f31329a.mo44643f().getUserVisibleHint() && this.f31329a.mo44643f().isAdded()) {
                FragmentActivity activity = this.f31329a.mo44643f().getActivity();
                if (activity == null || !activity.isFinishing()) {
                    this.f31329a.mo44645h().mo44674f();
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView.IViewDelegate
    /* renamed from: d */
    public void mo44641d() {
        C13479a.m54764b("SearchListPresenter", "loadMore()...offset = " + this.f31316b + " searchKey=" + this.f31321h);
        this.f31320g.mo237937a(mo44644g().mo44658b(this.f31316b, this.f31321h, this.f31317c).mo238001b(new C11630b(this), new C11631c(this)));
    }

    /* renamed from: b */
    private final void m48278b(String str) {
        this.f31321h = str;
        this.f31316b = 0;
        this.f31317c = "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$c */
    static final class C11631c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f31328a;

        C11631c(BasePresenter bVar) {
            this.f31328a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("SearchListPresenter", "loadMoreError()...", th);
            this.f31328a.mo44645h().mo44670b(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$f */
    static final class C11634f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f31332a;

        C11634f(BasePresenter bVar) {
            this.f31332a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("SearchListPresenter", "loadData err:", th);
            C13742g.m55710c(this.f31332a.f31319e);
            ISearchListView h = this.f31332a.mo44645h();
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            h.mo44666a(th);
        }
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView.IViewDelegate
    /* renamed from: a */
    public void mo44634a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        mo44638b().getDeleteToken().mo5929b(templateV4.getObjToken());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$b */
    static final class C11630b<T> implements Consumer<TemplateGroupTab> {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f31327a;

        C11630b(BasePresenter bVar) {
            this.f31327a = bVar;
        }

        /* renamed from: a */
        public final void accept(TemplateGroupTab templateGroupTab) {
            this.f31327a.f31316b += templateGroupTab.getSize();
            this.f31327a.f31317c = templateGroupTab.getBuffer();
            this.f31327a.mo44645h().mo44667a(templateGroupTab.getCategoryTabList());
            this.f31327a.mo44645h().mo44670b(templateGroupTab.getHasMore());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "documentCreateInfo", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$g */
    static final class C11635g<T> implements Consumer<DocumentCreateInfo> {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f31333a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31334b;

        /* renamed from: c */
        final /* synthetic */ String f31335c;

        C11635g(BasePresenter bVar, TemplateV4 templateV4, String str) {
            this.f31333a = bVar;
            this.f31334b = templateV4;
            this.f31335c = str;
        }

        /* renamed from: a */
        public final void accept(DocumentCreateInfo documentCreateInfo) {
            Intrinsics.checkParameterIsNotNull(documentCreateInfo, "documentCreateInfo");
            C13479a.m54764b("SearchListPresenter", "create template success");
            BasePresenter bVar = this.f31333a;
            TemplateV4 templateV4 = this.f31334b;
            C10917c a = bVar.mo44633a();
            String str = documentCreateInfo.f14845d;
            Intrinsics.checkExpressionValueIsNotNull(str, "documentCreateInfo.url");
            bVar.mo44635a(templateV4, a, str, this.f31335c);
            TemplateReportV2.f31015b.mo44239a(this.f31334b, documentCreateInfo.f14843b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$h */
    static final class C11636h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f31336a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31337b;

        /* renamed from: c */
        final /* synthetic */ String f31338c;

        /* renamed from: d */
        final /* synthetic */ String f31339d;

        C11636h(BasePresenter bVar, TemplateV4 templateV4, String str, String str2) {
            this.f31336a = bVar;
            this.f31337b = templateV4;
            this.f31338c = str;
            this.f31339d = str2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("SearchListPresenter", "create template failed, throwable = " + th);
            BasePresenter bVar = this.f31336a;
            bVar.mo44636a(this.f31337b, bVar.mo44633a(), this.f31338c, this.f31339d, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.b$e */
    static final class C11633e<T> implements Consumer<TemplateGroupTab> {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f31330a;

        /* renamed from: b */
        final /* synthetic */ String f31331b;

        C11633e(BasePresenter bVar, String str) {
            this.f31330a = bVar;
            this.f31331b = str;
        }

        /* renamed from: a */
        public final void accept(TemplateGroupTab templateGroupTab) {
            C13742g.m55710c(this.f31330a.f31319e);
            if (templateGroupTab.getErr() == null) {
                this.f31330a.f31318d = templateGroupTab.getHasData();
                this.f31330a.f31317c = templateGroupTab.getBuffer();
                this.f31330a.f31316b = templateGroupTab.getSize();
                ISearchListView h = this.f31330a.mo44645h();
                Intrinsics.checkExpressionValueIsNotNull(templateGroupTab, "it");
                h.mo44664a(templateGroupTab);
            } else if (!this.f31330a.f31318d) {
                this.f31330a.mo44645h().mo44666a(templateGroupTab.getErr());
            }
            boolean z = false;
            try {
                z = !templateGroupTab.getCategoryTabList().get(0).getCategoryList().get(0).getTemplates().isEmpty();
            } catch (Throwable unused) {
            }
            TemplateReportV2.f31015b.mo44243a(this.f31331b, z);
        }
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView.IViewDelegate
    /* renamed from: a */
    public void mo44637a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        m48278b(str);
        C13742g.m55706a(this.f31319e, 300);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str.length() > 1000) {
            C13742g.m55710c(this.f31319e);
            mo44645h().mo44664a(new TemplateGroupTab(2, null, false, false, null, null, null, 0, 254, null));
            return;
        }
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        if (!b.mo20041b()) {
            C13742g.m55710c(this.f31319e);
            mo44645h().mo44666a(new Throwable("net not connected"));
            return;
        }
        this.f31320g.mo237937a(mo44644g().mo44657a(str).mo238001b(new C11633e(this, str), new C11634f(this)));
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListView.IViewDelegate
    /* renamed from: b */
    public void mo44639b(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        C13479a.m54772d("SearchListPresenter", "onTemplateSelected()...template = " + templateV4);
        TemplateReport.f31011b.mo44232c();
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean z = !b.mo20041b();
        if (!templateV4.getEnable() && z) {
            C13479a.m54764b("SearchListPresenter", "create template offline, state:" + b + ", template enable: " + templateV4.getEnable());
            Toast.showFailureText(mo44643f().getContext(), (int) R.string.Doc_List_NoInternetClickMoreToast);
        } else if (templateV4.isSceneTemplate()) {
            StringBuilder sb = new StringBuilder();
            C6313i a = C6313i.m25327a();
            C8275a b2 = C8275a.m34052b(templateV4.getObjType());
            Intrinsics.checkExpressionValueIsNotNull(b2, "DocumentType.getDocumentType(template.objType)");
            sb.append(a.mo25382a(b2.mo32553a(), templateV4.getObjToken(), ""));
            sb.append("?from=template_preview&collectionId=");
            sb.append(templateV4.getCollectionId());
            String sb2 = sb.toString();
            RouteBean routeBean = new RouteBean();
            routeBean.mo40620g(1);
            ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(sb2, routeBean);
            TemplateReportV2.f31015b.mo44246b(templateV4);
        } else if (mo44638b().previewEnable(templateV4)) {
            TemplateUtils.f31021a.mo44264a(templateV4, mo44638b(), mo44645h().mo44673e(), "templatecenter_searchresult");
            TemplateReportV2.f31015b.mo44246b(templateV4);
        } else {
            mo44645h().mo44675g();
            String parentToken = mo44638b().getParentToken();
            String module = mo44638b().getModule();
            this.f31320g.mo237937a(mo44644g().mo44656a(templateV4, parentToken, module).mo238028f(15, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new C11635g(this, templateV4, module), new C11636h(this, templateV4, parentToken, module)));
            TemplateReportV2.f31015b.mo44238a(templateV4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasePresenter(Fragment fragment, ISearchListModel fVar, ISearchListView gVar) {
        super(fVar, gVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(fVar, "model");
        Intrinsics.checkParameterIsNotNull(gVar, "view");
        this.f31324k = fragment;
        this.f31325l = fVar;
        this.f31326m = gVar;
    }

    /* renamed from: a */
    public final void mo44635a(TemplateV4 templateV4, C10917c cVar, String str, String str2) {
        mo44645h().mo44676h();
        mo44638b().setSelectedTemplate(templateV4);
        C8241g.m33840a(mo44643f().getContext(), "", "new_template", cVar, str);
    }

    /* renamed from: a */
    public final void mo44636a(TemplateV4 templateV4, C10917c cVar, String str, String str2, Throwable th) {
        mo44645h().mo44676h();
        C8237e eVar = new C8237e(cVar, str, str2, "docs_manage");
        String string = mo44643f().getString(R.string.Doc_List_TemplateLoadingFailedToast);
        Intrinsics.checkExpressionValueIsNotNull(string, "fragment.getString(R.str…mplateLoadingFailedToast)");
        C8241g.m33836a(mo44643f().getContext(), eVar, C8275a.m34050a(templateV4.getObjType()), (AbstractC8276b) null, cVar, th, string);
    }
}
