package com.bytedance.ee.bear.templates.recommend;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.create.C8228a;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.list.dto.AbstractC8276b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.C11515d;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.TemplateCenterActivity;
import com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.BasePresenter;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u00016BE\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0014J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J \u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/J\b\u00100\u001a\u00020%H\u0016J\u0018\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020%H\u0002R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c¨\u00067"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplatePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IModel;", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView;", "Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView$IViewDelegate;", "model", "view", "fragment", "Landroidx/fragment/app/Fragment;", "module", "", "subModule", "parentToken", "isFolder", "", "isFromEmpty", "(Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IModel;Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateContract$IView;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "getFragment", "()Landroidx/fragment/app/Fragment;", "hasData", "()Z", "getModule", "()Ljava/lang/String;", "getParentToken", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "getSubModule", "create", "", "createViewDelegate", "destroy", "loadData", "observeNetwork", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onMoreClicked", "onTemplateSelected", "position", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "preProcessBeforeCreate", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.recommend.d */
public final class NewRecommendTemplatePresenter extends BasePresenter<NewRecommendTemplateContract.IModel, NewRecommendTemplateContract.IView, NewRecommendTemplateContract.IView.IViewDelegate> implements NewRecommendTemplateContract.IView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31233a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewRecommendTemplatePresenter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewRecommendTemplatePresenter.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: c */
    public static final Companion f31234c = new Companion(null);

    /* renamed from: b */
    public boolean f31235b;

    /* renamed from: d */
    private final Lazy f31236d = LazyKt.lazy(C11605h.INSTANCE);

    /* renamed from: e */
    private final Lazy f31237e = LazyKt.lazy(C11599b.INSTANCE);

    /* renamed from: f */
    private final Fragment f31238f;

    /* renamed from: g */
    private final String f31239g;

    /* renamed from: h */
    private final String f31240h;

    /* renamed from: i */
    private final String f31241i;

    /* renamed from: j */
    private final boolean f31242j;

    /* renamed from: k */
    private final boolean f31243k;

    /* renamed from: i */
    private final C68289a m48187i() {
        Lazy lazy = this.f31237e;
        KProperty kProperty = f31233a[1];
        return (C68289a) lazy.getValue();
    }

    /* renamed from: b */
    public final C10917c mo44562b() {
        Lazy lazy = this.f31236d;
        KProperty kProperty = f31233a[0];
        return (C10917c) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public NewRecommendTemplateContract.IView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplatePresenter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final Fragment mo44565e() {
        return this.f31238f;
    }

    /* renamed from: f */
    public final String mo44566f() {
        return this.f31239g;
    }

    /* renamed from: g */
    public final String mo44567g() {
        return this.f31240h;
    }

    /* renamed from: h */
    public final String mo44568h() {
        return this.f31241i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$b */
    static final class C11599b extends Lambda implements Function0<C68289a> {
        public static final C11599b INSTANCE = new C11599b();

        C11599b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C68289a invoke() {
            return new C68289a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$h */
    static final class C11605h extends Lambda implements Function0<C10917c> {
        public static final C11605h INSTANCE = new C11605h();

        C11605h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    /* renamed from: j */
    private final void m48188j() {
        C5084ad.m20847d().mo20037a().mo5923a(this.f31238f, new C11602e(this));
    }

    /* renamed from: k */
    private final void m48189k() {
        AbstractC5233x b = C5234y.m21391b();
        b.mo21077a("add_doc");
        b.mo21078a("add_doc", "module", this.f31239g);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((NewRecommendTemplateContract.IView) getView()).mo44546a();
        mo44563c();
        m48188j();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (!m48187i().isDisposed()) {
            m48187i().dispose();
        }
    }

    /* renamed from: c */
    public final void mo44563c() {
        m48187i().mo237937a(((NewRecommendTemplateContract.IModel) getModel()).mo44543a().mo238001b(new C11600c(this), new C11601d(this)));
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo44551a() {
        Intent intent = new Intent(this.f31238f.getContext(), TemplateCenterActivity.class);
        intent.putExtra("MODULE", this.f31239g);
        intent.putExtra("ROOT_TOKEN", this.f31241i);
        intent.putExtra("enterSource", "create_new_more");
        intent.putExtra(C11515d.f31005b, "create_new_more");
        this.f31238f.startActivityForResult(intent, 0);
        TemplateReport.f31011b.mo44233c("from_newcreate_more");
        C8228a.m33789a(C5234y.m21391b());
        C8228a.m33795a(C5234y.m21391b(), "template_more", (String) null, this.f31239g, this.f31242j, this.f31243k);
        ListAnalysis.Companion aVar = ListAnalysis.f21728a;
        String str = this.f31239g;
        String str2 = this.f31240h;
        String str3 = this.f31241i;
        C8275a aVar2 = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.UNKNOWN");
        aVar.mo31436a(str, str2, "templates_more", "ccm_template_systemcenter_view", "", str3, "", aVar2.mo32555b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$d */
    public static final class C11601d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplatePresenter f31245a;

        C11601d(NewRecommendTemplatePresenter dVar) {
            this.f31245a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "t");
            ((NewRecommendTemplateContract.IView) this.f31245a.getView()).mo44547a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$e */
    public static final class C11602e<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplatePresenter f31246a;

        C11602e(NewRecommendTemplatePresenter dVar) {
            this.f31246a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            if (!this.f31246a.f31235b && networkState != null && networkState.mo20041b()) {
                this.f31246a.mo44563c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/recommend/RecommendTemplates;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$c */
    public static final class C11600c<T> implements Consumer<RecommendTemplates> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplatePresenter f31244a;

        C11600c(NewRecommendTemplatePresenter dVar) {
            this.f31244a = dVar;
        }

        /* renamed from: a */
        public final void accept(RecommendTemplates recommendTemplates) {
            if (recommendTemplates.getSource() != 2 || recommendTemplates.getErr() == null) {
                this.f31244a.f31235b = !recommendTemplates.getTemplates().isEmpty();
                ((NewRecommendTemplateContract.IView) this.f31244a.getView()).mo44548a(recommendTemplates.getTemplates());
            } else if (!this.f31244a.f31235b) {
                ((NewRecommendTemplateContract.IView) this.f31244a.getView()).mo44547a(recommendTemplates.getErr());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "documentCreateInfo", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$f */
    static final class C11603f<T> implements Consumer<DocumentCreateInfo> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplatePresenter f31247a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31248b;

        C11603f(NewRecommendTemplatePresenter dVar, TemplateV4 templateV4) {
            this.f31247a = dVar;
            this.f31248b = templateV4;
        }

        /* renamed from: a */
        public final void accept(DocumentCreateInfo documentCreateInfo) {
            Intrinsics.checkParameterIsNotNull(documentCreateInfo, "documentCreateInfo");
            C13479a.m54764b("NewRecommendTemplatePresenter", "create template success");
            ((NewRecommendTemplateContract.IView) this.f31247a.getView()).mo44550c();
            ((NewRecommendTemplateContract.IModel) this.f31247a.getModel()).mo44545a(this.f31248b, true);
            C8241g.m33840a(this.f31247a.mo44565e().getContext(), "", "space_template", this.f31247a.mo44562b(), documentCreateInfo.mo20275c());
            ListAnalysis.f21728a.mo31433a(this.f31247a.mo44566f(), this.f31247a.mo44567g(), "templates", this.f31248b.getId(), this.f31247a.mo44568h(), documentCreateInfo.f14843b, this.f31248b.getObjType());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.d$g */
    static final class C11604g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendTemplatePresenter f31249a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31250b;

        C11604g(NewRecommendTemplatePresenter dVar, TemplateV4 templateV4) {
            this.f31249a = dVar;
            this.f31250b = templateV4;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("NewRecommendTemplatePresenter", "create template failed, throwable = " + th);
            ((NewRecommendTemplateContract.IView) this.f31249a.getView()).mo44550c();
            C8237e eVar = new C8237e(this.f31249a.mo44562b(), this.f31249a.mo44568h(), this.f31249a.mo44566f(), "docs_manage");
            String string = this.f31249a.mo44565e().getString(R.string.Doc_List_TemplateLoadingFailedToast);
            Intrinsics.checkExpressionValueIsNotNull(string, "fragment.getString(\n    …mplateLoadingFailedToast)");
            C8241g.m33836a(this.f31249a.mo44565e().getContext(), eVar, C8275a.m34050a(this.f31250b.getObjType()), (AbstractC8276b) null, this.f31249a.mo44562b(), th, string);
        }
    }

    @Override // com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo44552a(int i, TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        C13479a.m54772d("NewRecommendTemplatePresenter", "onTemplateSelected()...template = " + templateV4);
        m48189k();
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean z = !b.mo20041b();
        if (templateV4.getEnable() || !z) {
            ((NewRecommendTemplateContract.IView) getView()).mo44549b();
            m48187i().mo237937a(((NewRecommendTemplateContract.IModel) getModel()).mo44544a(templateV4, this.f31241i, this.f31239g).mo238028f(15, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new C11603f(this, templateV4), new C11604g(this, templateV4)));
            C8228a.m33795a(C5234y.m21391b(), "template" + (i + 1), (String) null, this.f31239g, this.f31242j, this.f31243k);
            return;
        }
        C13479a.m54764b("NewRecommendTemplatePresenter", "create template offline, state:" + b + ", template enable: " + templateV4.getEnable());
        Toast.showFailureText(this.f31238f.getContext(), (int) R.string.Doc_List_NoInternetClickMoreToast);
    }

    /* renamed from: a */
    public final void mo44561a(int i, int i2, Intent intent) {
        String str;
        int i3;
        C13479a.m54764b("NewRecommendTemplatePresenter", "onActivityResult()...resultCode = " + i2);
        if (i2 == -1) {
            if (intent == null || (str = intent.getStringExtra("templateType")) == null) {
                str = "";
            }
            if (intent != null) {
                i3 = intent.getIntExtra("templateType", -1);
            } else {
                i3 = -1;
            }
            ((NewRecommendTemplateContract.IModel) getModel()).mo44545a(new TemplateV4(str, null, i3, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, 0, 0, 0, 0, null, null, 0, null, null, null, false, 0, null, null, false, 2147483642, null), false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewRecommendTemplatePresenter(NewRecommendTemplateContract.IModel aVar, NewRecommendTemplateContract.IView bVar, Fragment fragment, String str, String str2, String str3, boolean z, boolean z2) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "module");
        Intrinsics.checkParameterIsNotNull(str2, "subModule");
        Intrinsics.checkParameterIsNotNull(str3, "parentToken");
        this.f31238f = fragment;
        this.f31239g = str;
        this.f31240h = str2;
        this.f31241i = str3;
        this.f31242j = z;
        this.f31243k = z2;
    }
}
