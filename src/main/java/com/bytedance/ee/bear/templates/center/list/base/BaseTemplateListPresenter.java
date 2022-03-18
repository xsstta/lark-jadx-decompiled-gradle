package com.bytedance.ee.bear.templates.center.list.base;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.p283g.C5174a;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.create.C8228a;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.list.create.CreateControl;
import com.bytedance.ee.bear.list.dto.AbstractC8276b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.TemplateUtils;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListModel;
import com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
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
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 L2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u0001LB%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0004H\u0014J\b\u00100\u001a\u00020+H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000202H\u0004J0\u00106\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020:H\u0002J(\u0010;\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0002J\b\u0010=\u001a\u00020+H\u0016J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u000202H\u0002J\b\u0010@\u001a\u00020+H\u0016J\u0010\u0010A\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010B\u001a\u00020+H\u0002J\b\u0010C\u001a\u00020+H\u0002J\b\u0010D\u001a\u00020+H\u0002J\u0010\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020+H\u0016J\u0010\u0010I\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010J\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010K\u001a\u00020+2\u0006\u00109\u001a\u00020:H\u0002R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001b\u0010#\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006M"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel;", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView;", "Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView$IViewDelegate;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "view", "tabName", "", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel;Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView;Ljava/lang/String;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "connected", "", "getFragment", "()Landroidx/fragment/app/Fragment;", "hasData", "lastIndex", "getLastIndex", "()Ljava/lang/String;", "setLastIndex", "(Ljava/lang/String;)V", "getModel", "()Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "getTabName", "templateCenterViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenterViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenterViewModel$delegate", "getView", "()Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListView;", "create", "", "createBlankDocument", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "createViewDelegate", "destroy", "findTargetCategoryIndex", "", "tab", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "getCurrentFilterType", "handleCreateError", "parentToken", "module", "throwable", "", "handleCreateSuccess", "url", "loadCategoryTab", "loadData", "filterType", "loadMore", "netCheck", "observeDeleteTemplate", "observeFilter", "observeNetwork", "onCategoryClicked", "categoryTab", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "onLoadFailed", "onTemplateClicked", "onTemplateDelete", "refreshDataIfNeed", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.a.c */
public class BaseTemplateListPresenter extends BasePresenter<IBaseTemplateListModel, IBaseTemplateListView, IBaseTemplateListView.IViewDelegate> implements IBaseTemplateListView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30872a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTemplateListPresenter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTemplateListPresenter.class), "templateCenterViewModel", "getTemplateCenterViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: d */
    public static final Companion f30873d = new Companion(null);

    /* renamed from: b */
    public boolean f30874b;

    /* renamed from: c */
    public boolean f30875c = true;

    /* renamed from: e */
    private final C68289a f30876e = new C68289a();

    /* renamed from: f */
    private String f30877f = "";

    /* renamed from: g */
    private final Lazy f30878g = LazyKt.lazy(C11495o.INSTANCE);

    /* renamed from: h */
    private final Lazy f30879h = LazyKt.lazy(new C11496p(this));

    /* renamed from: i */
    private final Fragment f30880i;

    /* renamed from: j */
    private final IBaseTemplateListModel f30881j;

    /* renamed from: k */
    private final IBaseTemplateListView f30882k;

    /* renamed from: l */
    private final String f30883l;

    /* renamed from: m */
    private final TemplateCenterViewModel mo44215m() {
        Lazy lazy = this.f30879h;
        KProperty kProperty = f30872a[1];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    /* renamed from: c */
    public final C10917c mo44155c() {
        Lazy lazy = this.f30878g;
        KProperty kProperty = f30872a[0];
        return (C10917c) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public IBaseTemplateListView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/BaseTemplateListPresenter$Companion;", "", "()V", "NO_FOUND", "", "NO_PERMISSION", "TAG", "", "TEMPLATE_HAS_DELETE", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C68289a mo44146a() {
        return this.f30876e;
    }

    /* renamed from: b */
    public final String mo44153b() {
        return this.f30877f;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate
    /* renamed from: e */
    public void mo44157e() {
        mo44158f();
    }

    /* renamed from: i */
    public Fragment mo44161i() {
        return this.f30880i;
    }

    /* renamed from: j */
    public IBaseTemplateListModel mo44162j() {
        return this.f30881j;
    }

    /* renamed from: k */
    public IBaseTemplateListView mo44163k() {
        return this.f30882k;
    }

    /* renamed from: l */
    public String mo44164l() {
        return this.f30883l;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate
    /* renamed from: h */
    public void mo44160h() {
        mo44147a(mo44159g());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$o */
    static final class C11495o extends Lambda implements Function0<C10917c> {
        public static final C11495o INSTANCE = new C11495o();

        C11495o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m47757o();
        m47758p();
        mo44216n();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$p */
    static final class C11496p extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BaseTemplateListPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11496p(BaseTemplateListPresenter cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.mo44161i().requireActivity()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    /* renamed from: n */
    private final void mo44216n() {
        mo44215m().getDeleteToken().mo5923a(mo44161i(), new C11490j(this));
    }

    /* renamed from: o */
    private final void m47757o() {
        mo44162j().mo44203e().mo5923a(mo44161i(), new C11491k(this));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (!this.f30876e.isDisposed()) {
            this.f30876e.dispose();
        }
    }

    /* renamed from: p */
    private final void m47758p() {
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "connectionService");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "connectionService.networkState");
        this.f30875c = b.mo20041b();
        d.mo20037a().mo5923a(mo44161i(), new C11492l(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo44159g() {
        C8275a b = mo44162j().mo44203e().mo5927b();
        if (b == null) {
            b = C8275a.f22369b;
        }
        IBaseTemplateListModel j = mo44162j();
        Intrinsics.checkExpressionValueIsNotNull(b, "filterDocumentType");
        if (j.mo44139a(b.mo32555b())) {
            b = C8275a.f22378k;
        }
        if (Intrinsics.areEqual(b, C8275a.f22369b)) {
            return -1;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "filterDocumentType");
        return b.mo32555b();
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate
    /* renamed from: f */
    public void mo44158f() {
        C13479a.m54764b("BaseTemplateListPresenter", "loadMore()...index = " + this.f30877f);
        this.f30876e.mo237937a(IBaseTemplateListModel.C11502b.m47833a(mo44162j(), this.f30877f, mo44159g(), 0, 0, 12, null).mo238001b(new C11488h(this), new C11489i(this)));
    }

    /* renamed from: a */
    public final void mo44152a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f30877f = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$g */
    public static final class C11487g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30901a;

        C11487g(BaseTemplateListPresenter cVar) {
            this.f30901a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("BaseTemplateListPresenter", "loadData err:", th);
            IBaseTemplateListView k = this.f30901a.mo44163k();
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            k.mo44182a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$i */
    public static final class C11489i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30903a;

        C11489i(BaseTemplateListPresenter cVar) {
            this.f30903a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("BaseTemplateListPresenter", "loadMoreError()...", th);
            this.f30903a.mo44163k().mo44184a(true);
        }
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate
    /* renamed from: a */
    public void mo44148a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        mo44215m().getDeleteToken().mo5929b(templateV4.getObjToken());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$c */
    public static final class C11483c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30888a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f30889b;

        /* renamed from: c */
        final /* synthetic */ String f30890c;

        /* renamed from: d */
        final /* synthetic */ String f30891d;

        C11483c(BaseTemplateListPresenter cVar, TemplateV4 templateV4, String str, String str2) {
            this.f30888a = cVar;
            this.f30889b = templateV4;
            this.f30890c = str;
            this.f30891d = str2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("BaseTemplateListPresenter", "createBlankDocument createOfflineDocumentFlow()...failed, throwable = " + th);
            BaseTemplateListPresenter cVar = this.f30888a;
            cVar.mo44150a(this.f30889b, cVar.mo44155c(), this.f30890c, this.f30891d, th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "documentCreateInfo", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$d */
    public static final class C11484d<T> implements Consumer<DocumentCreateInfo> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30892a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f30893b;

        /* renamed from: c */
        final /* synthetic */ String f30894c;

        C11484d(BaseTemplateListPresenter cVar, TemplateV4 templateV4, String str) {
            this.f30892a = cVar;
            this.f30893b = templateV4;
            this.f30894c = str;
        }

        /* renamed from: a */
        public final void accept(DocumentCreateInfo documentCreateInfo) {
            Intrinsics.checkParameterIsNotNull(documentCreateInfo, "documentCreateInfo");
            C13479a.m54758a("BaseTemplateListPresenter", "createBlankDocument createOnlineDocument()...success, type = " + this.f30893b.getObjType());
            BaseTemplateListPresenter cVar = this.f30892a;
            TemplateV4 templateV4 = this.f30893b;
            C10917c c = cVar.mo44155c();
            String str = documentCreateInfo.f14845d;
            Intrinsics.checkExpressionValueIsNotNull(str, "documentCreateInfo.url");
            cVar.mo44149a(templateV4, c, str, this.f30894c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$e */
    public static final class C11485e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30895a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f30896b;

        /* renamed from: c */
        final /* synthetic */ String f30897c;

        /* renamed from: d */
        final /* synthetic */ String f30898d;

        C11485e(BaseTemplateListPresenter cVar, TemplateV4 templateV4, String str, String str2) {
            this.f30895a = cVar;
            this.f30896b = templateV4;
            this.f30897c = str;
            this.f30898d = str2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("BaseTemplateListPresenter", "createBlankDocument createOnlineDocument()...failed, throwable = " + th);
            BaseTemplateListPresenter cVar = this.f30895a;
            cVar.mo44150a(this.f30896b, cVar.mo44155c(), this.f30897c, this.f30898d, th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$h */
    public static final class C11488h<T> implements Consumer<TemplateGroupTab> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30902a;

        C11488h(BaseTemplateListPresenter cVar) {
            this.f30902a = cVar;
        }

        /* renamed from: a */
        public final void accept(TemplateGroupTab templateGroupTab) {
            this.f30902a.mo44152a(templateGroupTab.getShareIndex());
            IBaseTemplateListView.C11503a.m47849a(this.f30902a.mo44163k(), templateGroupTab.getCategoryTabList(), 0, 0, 6, null);
            this.f30902a.mo44163k().mo44184a(templateGroupTab.getHasMore());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$k */
    public static final class C11491k<T> implements AbstractC1178x<C8275a> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30905a;

        C11491k(BaseTemplateListPresenter cVar) {
            this.f30905a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(C8275a aVar) {
            if (Intrinsics.areEqual(aVar, C8275a.f22369b)) {
                this.f30905a.mo44147a(-1);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
            int b = aVar.mo32555b();
            if (this.f30905a.mo44162j().mo44139a(b)) {
                C8275a aVar2 = C8275a.f22378k;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.DOCX");
                b = aVar2.mo32555b();
            }
            this.f30905a.mo44147a(b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$l */
    public static final class C11492l<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30906a;

        C11492l(BaseTemplateListPresenter cVar) {
            this.f30906a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            boolean z;
            if (networkState != null) {
                z = networkState.mo20041b();
            } else {
                z = false;
            }
            if (!this.f30906a.f30875c && z && !this.f30906a.f30874b) {
                this.f30906a.mo44147a(-1);
            }
            this.f30906a.f30875c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "documentCreateInfo", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$m */
    static final class C11493m<T> implements Consumer<DocumentCreateInfo> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30907a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f30908b;

        /* renamed from: c */
        final /* synthetic */ String f30909c;

        C11493m(BaseTemplateListPresenter cVar, TemplateV4 templateV4, String str) {
            this.f30907a = cVar;
            this.f30908b = templateV4;
            this.f30909c = str;
        }

        /* renamed from: a */
        public final void accept(DocumentCreateInfo documentCreateInfo) {
            Intrinsics.checkParameterIsNotNull(documentCreateInfo, "documentCreateInfo");
            C13479a.m54764b("BaseTemplateListPresenter", "create template success");
            BaseTemplateListPresenter cVar = this.f30907a;
            TemplateV4 templateV4 = this.f30908b;
            C10917c c = cVar.mo44155c();
            String str = documentCreateInfo.f14845d;
            Intrinsics.checkExpressionValueIsNotNull(str, "documentCreateInfo.url");
            cVar.mo44149a(templateV4, c, str, this.f30909c);
            TemplateReportV2.f31015b.mo44239a(this.f30908b, documentCreateInfo.f14843b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$n */
    static final class C11494n<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30910a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f30911b;

        /* renamed from: c */
        final /* synthetic */ String f30912c;

        /* renamed from: d */
        final /* synthetic */ String f30913d;

        C11494n(BaseTemplateListPresenter cVar, TemplateV4 templateV4, String str, String str2) {
            this.f30910a = cVar;
            this.f30911b = templateV4;
            this.f30912c = str;
            this.f30913d = str2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("BaseTemplateListPresenter", "create template failed, throwable = " + th);
            BaseTemplateListPresenter cVar = this.f30910a;
            cVar.mo44150a(this.f30911b, cVar.mo44155c(), this.f30912c, this.f30913d, th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "hasDeletedToken", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$j */
    public static final class C11490j<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30904a;

        C11490j(BaseTemplateListPresenter cVar) {
            this.f30904a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            T t;
            CategoryTab h = this.f30904a.mo44163k().mo44193h();
            if (h != null) {
                for (T t2 : h.getCategoryList()) {
                    Iterator<T> it = t2.getTemplates().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (Intrinsics.areEqual(str, t.getObjToken())) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        t2.getTemplates().remove(t3);
                        this.f30904a.mo44163k().mo44179a(h);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m47752a(Throwable th) {
        if (th instanceof NetService.ServerErrorException) {
            int code = ((NetService.ServerErrorException) th).getCode();
            if (code == 10002 || code == 10007 || code == 3) {
                C13479a.m54764b("BaseTemplateListPresenter", "refreshDataIfNeed()...errorCode = " + code);
                mo44147a(mo44159g());
                Toast.showFailureText(mo44161i().getContext(), (int) R.string.Doc_List_TemplateNoPermissionToast);
            }
        }
    }

    /* renamed from: c */
    private final boolean m47753c(TemplateV4 templateV4) {
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean z = !b.mo20041b();
        if (templateV4.getEnable() || !z) {
            return true;
        }
        C13479a.m54764b("BaseTemplateListPresenter", "create template offline, state:" + b + ", template enable: " + templateV4.getEnable());
        Toast.showFailureText(mo44161i().getContext(), (int) R.string.Doc_List_NoInternetClickMoreToast);
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "offlineDoc", "Lcom/bytedance/ee/bear/contract/offline/OfflineDoc;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$b */
    public static final class C11482b<T> implements Consumer<OfflineDoc> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30884a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f30885b;

        /* renamed from: c */
        final /* synthetic */ String f30886c;

        /* renamed from: d */
        final /* synthetic */ String f30887d;

        C11482b(BaseTemplateListPresenter cVar, TemplateV4 templateV4, String str, String str2) {
            this.f30884a = cVar;
            this.f30885b = templateV4;
            this.f30886c = str;
            this.f30887d = str2;
        }

        /* renamed from: a */
        public final void accept(OfflineDoc offlineDoc) {
            Intrinsics.checkParameterIsNotNull(offlineDoc, "offlineDoc");
            C13479a.m54764b("BaseTemplateListPresenter", "createBlankDocument createOfflineDocumentFlow()...success, type = " + this.f30885b.getObjType());
            if (!TextUtils.isEmpty(offlineDoc.getFakeToken())) {
                String a = C6313i.m25327a().mo25382a(C8275a.m34050a(this.f30885b.getObjType()), offlineDoc.getFakeToken(), "tab_create");
                BaseTemplateListPresenter cVar = this.f30884a;
                TemplateV4 templateV4 = this.f30885b;
                C10917c c = cVar.mo44155c();
                Intrinsics.checkExpressionValueIsNotNull(a, "url");
                cVar.mo44149a(templateV4, c, a, this.f30886c);
                AbstractC5233x b = C5234y.m21391b();
                String a2 = C8275a.m34050a(this.f30885b.getObjType());
                String fakeToken = offlineDoc.getFakeToken();
                al d = C4511g.m18594d();
                Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
                C8228a.m33793a(b, a2, fakeToken, C5174a.m21161a(d.mo17344E()), this.f30887d, this.f30886c);
                return;
            }
            BaseTemplateListPresenter cVar2 = this.f30884a;
            cVar2.mo44150a(this.f30885b, cVar2.mo44155c(), this.f30887d, this.f30886c, new Throwable());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.c$f */
    public static final class C11486f<T> implements Consumer<TemplateGroupTab> {

        /* renamed from: a */
        final /* synthetic */ BaseTemplateListPresenter f30899a;

        /* renamed from: b */
        final /* synthetic */ int f30900b;

        C11486f(BaseTemplateListPresenter cVar, int i) {
            this.f30899a = cVar;
            this.f30900b = i;
        }

        /* renamed from: a */
        public final void accept(TemplateGroupTab templateGroupTab) {
            boolean z;
            this.f30899a.mo44152a(templateGroupTab.getShareIndex());
            if (templateGroupTab.getSource() != 2 || templateGroupTab.getErr() == null) {
                try {
                    z = !templateGroupTab.getCategoryTabList().get(0).getCategoryList().get(0).getTemplates().isEmpty();
                } catch (Throwable unused) {
                    z = false;
                }
                TemplateReportV2.m47968a(TemplateReportV2.f31015b, C8275a.m34052b(this.f30900b), z, null, 4, null);
                this.f30899a.f30874b = templateGroupTab.getHasData();
                IBaseTemplateListView k = this.f30899a.mo44163k();
                Intrinsics.checkExpressionValueIsNotNull(templateGroupTab, "it");
                k.mo44180a(templateGroupTab);
                this.f30899a.mo44163k().mo44187b(templateGroupTab);
                this.f30899a.mo44163k().mo44186b(this.f30899a.mo44145a(templateGroupTab));
            } else if (!this.f30899a.f30874b) {
                this.f30899a.mo44163k().mo44182a(templateGroupTab.getErr());
            }
        }
    }

    /* renamed from: d */
    private final void m47754d(TemplateV4 templateV4) {
        String parentToken = mo44215m().getParentToken();
        String module = mo44215m().getModule();
        if (CreateControl.m33799a(templateV4.getObjType())) {
            mo44163k().mo44195j();
            this.f30876e.mo237937a(C8241g.m33831a(templateV4.getObjType(), parentToken, module, mo44215m().isSpaceV2()).mo237985a(C11678b.m48481e()).mo238001b(new C11482b(this, templateV4, module, parentToken), new C11483c(this, templateV4, parentToken, module)));
            TemplateReportV2.f31015b.mo44249c(templateV4);
        } else if (m47753c(templateV4)) {
            mo44163k().mo44195j();
            this.f30876e.mo237937a(C8241g.m33832a(mo44155c(), templateV4.getObjType(), parentToken, module, mo44215m().isSpaceV2()).mo237985a(C11678b.m48481e()).mo238001b(new C11484d(this, templateV4, module), new C11485e(this, templateV4, parentToken, module)));
            TemplateReportV2.f31015b.mo44249c(templateV4);
        }
    }

    /* renamed from: a */
    public final int mo44145a(TemplateGroupTab templateGroupTab) {
        T t;
        boolean z;
        if (TemplateCenterViewModel.Companion.mo44064b() == -1 || templateGroupTab.getCategoryTabList().isEmpty()) {
            return (int) -1;
        }
        int size = templateGroupTab.getCategoryTabList().size();
        for (int i = 1; i < size; i++) {
            Iterator<T> it = templateGroupTab.getCategoryTabList().get(i).getCategoryList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.getCategoryId() == TemplateCenterViewModel.Companion.mo44064b()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (t != null) {
                C13479a.m54764b("BaseTemplateListPresenter", "findTargetCategoryIndex = " + i);
                TemplateCenterViewModel.Companion.mo44063a(-1L);
                return i;
            }
        }
        return (int) -1;
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate
    /* renamed from: b */
    public void mo44154b(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        C13479a.m54772d("BaseTemplateListPresenter", "onTemplateSelected()...template = " + templateV4);
        if (templateV4.isBlankDocumentTemplate()) {
            m47754d(templateV4);
        } else if (m47753c(templateV4)) {
            if (templateV4.isSceneTemplate()) {
                StringBuilder sb = new StringBuilder();
                C6313i a = C6313i.m25327a();
                C8275a b = C8275a.m34052b(templateV4.getObjType());
                Intrinsics.checkExpressionValueIsNotNull(b, "DocumentType.getDocumentType(template.objType)");
                sb.append(a.mo25382a(b.mo32553a(), templateV4.getObjToken(), ""));
                sb.append("?from=template_preview&collectionId=");
                sb.append(templateV4.getCollectionId());
                String sb2 = sb.toString();
                RouteBean routeBean = new RouteBean();
                routeBean.mo40620g(1);
                ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(sb2, routeBean);
                TemplateReportV2.f31015b.mo44246b(templateV4);
            } else if (mo44215m().previewEnable(templateV4)) {
                TemplateUtils.m48001a(TemplateUtils.f31021a, templateV4, mo44215m(), mo44163k().mo44193h(), null, 8, null);
                TemplateReportV2.f31015b.mo44246b(templateV4);
            } else {
                mo44163k().mo44195j();
                String parentToken = mo44215m().getParentToken();
                String module = mo44215m().getModule();
                this.f30876e.mo237937a(mo44162j().mo44134a(templateV4, parentToken, module).mo238028f(15, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new C11493m(this, templateV4, module), new C11494n(this, templateV4, parentToken, module)));
                TemplateReportV2.f31015b.mo44238a(templateV4);
            }
        }
    }

    /* renamed from: a */
    public final void mo44147a(int i) {
        if (!this.f30874b) {
            mo44163k().mo44194i();
        }
        C13479a.m54764b("BaseTemplateListPresenter", "loadData()... filterType = " + i);
        this.f30876e.mo237937a(mo44162j().mo44135a("", i).mo238001b(new C11486f(this, i), new C11487g(this)));
    }

    @Override // com.bytedance.ee.bear.templates.center.list.base.IBaseTemplateListView.IViewDelegate
    /* renamed from: a */
    public void mo44151a(CategoryTab categoryTab) {
        Intrinsics.checkParameterIsNotNull(categoryTab, "categoryTab");
        try {
            String c = C4484g.m18494b().mo17252c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("primary", mo44164l());
            jSONObject.put(ShareHitPoint.f121869d, categoryTab.getCategoryList().get(0).getCategoryId());
            jSONObject.put("lang", c);
            C5234y.m21391b().mo21080a("click_template_primary_tab", jSONObject);
        } catch (Throwable th) {
            C13479a.m54759a("BaseTemplateListPresenter", "onCategoryClicked()...reportEvent error:", th);
        }
    }

    /* renamed from: a */
    public final void mo44149a(TemplateV4 templateV4, C10917c cVar, String str, String str2) {
        mo44163k().mo44196k();
        mo44215m().setSelectedTemplate(templateV4);
        C8241g.m33840a(mo44161i().getContext(), "", "new_template", cVar, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseTemplateListPresenter(Fragment fragment, IBaseTemplateListModel eVar, IBaseTemplateListView fVar, String str) {
        super(eVar, fVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(eVar, "model");
        Intrinsics.checkParameterIsNotNull(fVar, "view");
        Intrinsics.checkParameterIsNotNull(str, "tabName");
        this.f30880i = fragment;
        this.f30881j = eVar;
        this.f30882k = fVar;
        this.f30883l = str;
    }

    /* renamed from: a */
    public final void mo44150a(TemplateV4 templateV4, C10917c cVar, String str, String str2, Throwable th) {
        mo44163k().mo44196k();
        C8237e eVar = new C8237e(cVar, str, str2, "docs_manage");
        String string = mo44161i().getString(R.string.Doc_List_TemplateLoadingFailedToast);
        Intrinsics.checkExpressionValueIsNotNull(string, "fragment.getString(R.str…mplateLoadingFailedToast)");
        C8241g.m33836a(mo44161i().getContext(), eVar, C8275a.m34050a(templateV4.getObjType()), (AbstractC8276b) null, cVar, th, string);
        m47752a(th);
    }
}
