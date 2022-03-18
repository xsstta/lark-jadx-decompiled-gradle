package com.bytedance.ee.bear.templates.topic;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.list.dto.AbstractC8276b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.TemplateUtils;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.topic.ITopicView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.List;
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
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u00012B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\b\u0010\u001f\u001a\u00020\u0004H\u0014J\b\u0010 \u001a\u00020!H\u0016J0\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J(\u0010*\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010+\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\u0018\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0010\u00101\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/BaseTopicPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/templates/topic/TopicModel;", "Lcom/bytedance/ee/bear/templates/topic/ITopicView;", "Lcom/bytedance/ee/bear/templates/topic/ITopicView$IViewDelegate;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "view", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/templates/topic/TopicModel;Lcom/bytedance/ee/bear/templates/topic/ITopicView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFragment", "()Landroidx/fragment/app/Fragment;", "hasData", "", "getModel", "()Lcom/bytedance/ee/bear/templates/topic/TopicModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "templateCenterViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenterViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenterViewModel$delegate", "getView", "()Lcom/bytedance/ee/bear/templates/topic/ITopicView;", "createViewDelegate", "destroy", "", "handleCreateError", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "", "module", "throwable", "", "handleCreateSuccess", "url", "loadData", "topicID", ShareHitPoint.f121869d, "", "onLoadFailed", "onTemplateClicked", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.topic.b */
public class BaseTopicPresenter extends BasePresenter<TopicModel, ITopicView, ITopicView.IViewDelegate> implements ITopicView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31399a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTopicPresenter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseTopicPresenter.class), "templateCenterViewModel", "getTemplateCenterViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: b */
    public static final Companion f31400b = new Companion(null);

    /* renamed from: c */
    private final C68289a f31401c = new C68289a();

    /* renamed from: d */
    private final Lazy f31402d = LazyKt.lazy(C11662f.INSTANCE);

    /* renamed from: e */
    private final Lazy f31403e = LazyKt.lazy(new C11663g(this));

    /* renamed from: f */
    private final Fragment f31404f;

    /* renamed from: g */
    private final TopicModel f31405g;

    /* renamed from: h */
    private final ITopicView f31406h;

    /* renamed from: g */
    private final TemplateCenterViewModel m48398g() {
        Lazy lazy = this.f31403e;
        KProperty kProperty = f31399a[1];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    /* renamed from: a */
    public final C10917c mo44716a() {
        Lazy lazy = this.f31402d;
        KProperty kProperty = f31399a[0];
        return (C10917c) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ITopicView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView.IViewDelegate
    /* renamed from: c */
    public void mo44722c() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/topic/BaseTopicPresenter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public Fragment mo44723d() {
        return this.f31404f;
    }

    /* renamed from: e */
    public TopicModel mo44724e() {
        return this.f31405g;
    }

    /* renamed from: f */
    public ITopicView mo44725f() {
        return this.f31406h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.b$f */
    static final class C11662f extends Lambda implements Function0<C10917c> {
        public static final C11662f INSTANCE = new C11662f();

        C11662f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.b$g */
    static final class C11663g extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ BaseTopicPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11663g(BaseTopicPresenter bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.mo44723d().requireActivity()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (!this.f31401c.isDisposed()) {
            this.f31401c.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.b$c */
    static final class C11659c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseTopicPresenter f31409a;

        C11659c(BaseTopicPresenter bVar) {
            this.f31409a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("SearchListPresenter", "loadData err:", th);
            ITopicView f = this.f31409a.mo44725f();
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            f.mo44733a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/topic/TopicDataResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.b$b */
    static final class C11658b<T> implements Consumer<TopicDataResult> {

        /* renamed from: a */
        final /* synthetic */ BaseTopicPresenter f31407a;

        /* renamed from: b */
        final /* synthetic */ int f31408b;

        C11658b(BaseTopicPresenter bVar, int i) {
            this.f31407a = bVar;
            this.f31408b = i;
        }

        /* renamed from: a */
        public final void accept(TopicDataResult topicDataResult) {
            ITopicView f = this.f31407a.mo44725f();
            Intrinsics.checkExpressionValueIsNotNull(topicDataResult, "it");
            f.mo44731a(topicDataResult);
            boolean z = false;
            try {
                List<TemplateV4> templates = ((TopicData) topicDataResult.data).getTemplates();
                if (templates != null && (!templates.isEmpty())) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
            TemplateReportV2.f31015b.mo44237a(C8275a.m34052b(this.f31408b), z, "ccm_template_banner_view_click");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "documentCreateInfo", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.b$d */
    static final class C11660d<T> implements Consumer<DocumentCreateInfo> {

        /* renamed from: a */
        final /* synthetic */ BaseTopicPresenter f31410a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31411b;

        /* renamed from: c */
        final /* synthetic */ String f31412c;

        C11660d(BaseTopicPresenter bVar, TemplateV4 templateV4, String str) {
            this.f31410a = bVar;
            this.f31411b = templateV4;
            this.f31412c = str;
        }

        /* renamed from: a */
        public final void accept(DocumentCreateInfo documentCreateInfo) {
            Intrinsics.checkParameterIsNotNull(documentCreateInfo, "documentCreateInfo");
            C13479a.m54764b("SearchListPresenter", "create template success");
            BaseTopicPresenter bVar = this.f31410a;
            TemplateV4 templateV4 = this.f31411b;
            C10917c a = bVar.mo44716a();
            String str = documentCreateInfo.f14845d;
            Intrinsics.checkExpressionValueIsNotNull(str, "documentCreateInfo.url");
            bVar.mo44718a(templateV4, a, str, this.f31412c);
            TemplateReportV2.f31015b.mo44239a(this.f31411b, documentCreateInfo.f14843b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.topic.b$e */
    static final class C11661e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseTopicPresenter f31413a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31414b;

        /* renamed from: c */
        final /* synthetic */ String f31415c;

        /* renamed from: d */
        final /* synthetic */ String f31416d;

        C11661e(BaseTopicPresenter bVar, TemplateV4 templateV4, String str, String str2) {
            this.f31413a = bVar;
            this.f31414b = templateV4;
            this.f31415c = str;
            this.f31416d = str2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("SearchListPresenter", "create template failed, throwable = " + th);
            BaseTopicPresenter bVar = this.f31413a;
            bVar.mo44719a(this.f31414b, bVar.mo44716a(), this.f31415c, this.f31416d, th);
        }
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView.IViewDelegate
    /* renamed from: a */
    public void mo44717a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        C13479a.m54772d("SearchListPresenter", "onTemplateSelected()...template = " + templateV4);
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean z = !b.mo20041b();
        if (!templateV4.getEnable() && z) {
            C13479a.m54764b("SearchListPresenter", "create template offline, state:" + b + ", template enable: " + templateV4.getEnable());
            Toast.showFailureText(mo44723d().getContext(), (int) R.string.Doc_List_NoInternetClickMoreToast);
        } else if (m48398g().previewEnable(templateV4)) {
            TemplateUtils.f31021a.mo44264a(templateV4, m48398g(), mo44725f().mo44736d(), "templatecenter_banner");
            TemplateReportV2.f31015b.mo44246b(templateV4);
        } else {
            mo44725f().mo44738f();
            String parentToken = m48398g().getParentToken();
            String module = m48398g().getModule();
            this.f31401c.mo237937a(mo44724e().mo44753a(templateV4, parentToken, module).mo238028f(15, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new C11660d(this, templateV4, module), new C11661e(this, templateV4, parentToken, module)));
            TemplateReportV2.f31015b.mo44255e(templateV4);
        }
    }

    @Override // com.bytedance.ee.bear.templates.topic.ITopicView.IViewDelegate
    /* renamed from: a */
    public void mo44720a(String str, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "topicID");
        mo44725f().mo44737e();
        String str2 = str;
        if (!StringsKt.isBlank(str2)) {
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f31401c.mo237937a(mo44724e().mo44754a(str, i).mo238001b(new C11658b(this, i), new C11659c(this)));
                return;
            }
        }
        mo44725f().mo44733a(new RuntimeException("topic is empty"));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseTopicPresenter(Fragment fragment, TopicModel hVar, ITopicView eVar) {
        super(hVar, eVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(hVar, "model");
        Intrinsics.checkParameterIsNotNull(eVar, "view");
        this.f31404f = fragment;
        this.f31405g = hVar;
        this.f31406h = eVar;
    }

    /* renamed from: a */
    public final void mo44718a(TemplateV4 templateV4, C10917c cVar, String str, String str2) {
        mo44725f().mo44739g();
        m48398g().setSelectedTemplate(templateV4);
        C8241g.m33840a(mo44723d().getContext(), "", "new_template", cVar, str);
    }

    /* renamed from: a */
    public final void mo44719a(TemplateV4 templateV4, C10917c cVar, String str, String str2, Throwable th) {
        mo44725f().mo44739g();
        C8237e eVar = new C8237e(cVar, str, str2, "docs_manage");
        String string = mo44723d().getString(R.string.Doc_List_TemplateLoadingFailedToast);
        Intrinsics.checkExpressionValueIsNotNull(string, "fragment.getString(R.str…mplateLoadingFailedToast)");
        C8241g.m33836a(mo44723d().getContext(), eVar, C8275a.m34050a(templateV4.getObjType()), (AbstractC8276b) null, cVar, th, string);
    }
}
