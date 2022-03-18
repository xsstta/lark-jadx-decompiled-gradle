package com.bytedance.ee.bear.templates.scene;

import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.scene.ISceneView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.List;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u0001\"B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0004H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/BaseScenePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/templates/scene/SceneModel;", "Lcom/bytedance/ee/bear/templates/scene/ISceneView;", "Lcom/bytedance/ee/bear/templates/scene/ISceneView$IViewDelegate;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "view", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/templates/scene/SceneModel;Lcom/bytedance/ee/bear/templates/scene/ISceneView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFragment", "()Landroidx/fragment/app/Fragment;", "getModel", "()Lcom/bytedance/ee/bear/templates/scene/SceneModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "getView", "()Lcom/bytedance/ee/bear/templates/scene/ISceneView;", "createViewDelegate", "destroy", "", "loadData", "topicID", "", "onLoadFailed", "onTemplateClicked", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.scene.b */
public class BaseScenePresenter extends BasePresenter<SceneModel, ISceneView, ISceneView.IViewDelegate> implements ISceneView.IViewDelegate {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31265a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseScenePresenter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    public static final Companion f31266b = new Companion(null);

    /* renamed from: c */
    private final C68289a f31267c = new C68289a();

    /* renamed from: d */
    private final Lazy f31268d = LazyKt.lazy(C11612d.INSTANCE);

    /* renamed from: e */
    private final Fragment f31269e;

    /* renamed from: f */
    private final SceneModel f31270f;

    /* renamed from: g */
    private final ISceneView f31271g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ISceneView.IViewDelegate createViewDelegate() {
        return this;
    }

    @Override // com.bytedance.ee.bear.templates.scene.ISceneView.IViewDelegate
    /* renamed from: b */
    public void mo44592b() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/BaseScenePresenter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public Fragment mo44593c() {
        return this.f31269e;
    }

    /* renamed from: d */
    public SceneModel mo44594d() {
        return this.f31270f;
    }

    /* renamed from: e */
    public ISceneView mo44595e() {
        return this.f31271g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.b$d */
    static final class C11612d extends Lambda implements Function0<C10917c> {
        public static final C11612d INSTANCE = new C11612d();

        C11612d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (!this.f31267c.isDisposed()) {
            this.f31267c.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.b$c */
    static final class C11611c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseScenePresenter f31273a;

        C11611c(BaseScenePresenter bVar) {
            this.f31273a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("SearchListPresenter", "loadData err:", th);
            ISceneView e = this.f31273a.mo44595e();
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            e.mo44600a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/scene/TopicDataResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.b$b */
    static final class C11610b<T> implements Consumer<TopicDataResult> {

        /* renamed from: a */
        final /* synthetic */ BaseScenePresenter f31272a;

        C11610b(BaseScenePresenter bVar) {
            this.f31272a = bVar;
        }

        /* renamed from: a */
        public final void accept(TopicDataResult topicDataResult) {
            ISceneView e = this.f31272a.mo44595e();
            Intrinsics.checkExpressionValueIsNotNull(topicDataResult, "it");
            e.mo44598a(topicDataResult);
            try {
                List<TemplateV4> templates = ((TopicData) topicDataResult.data).getTemplates();
                if (templates != null) {
                    boolean z = !templates.isEmpty();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.ee.bear.templates.scene.ISceneView.IViewDelegate
    /* renamed from: a */
    public void mo44590a(TemplateV4 templateV4) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        C13479a.m54772d("SearchListPresenter", "onTemplateSelected()...template = " + templateV4);
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        boolean z = !b.mo20041b();
        if (templateV4.getEnable() || !z) {
            mo44594d().mo44611a(templateV4);
            TemplateReportV2.f31015b.mo44255e(templateV4);
            return;
        }
        C13479a.m54764b("SearchListPresenter", "create template offline, state:" + b + ", template enable: " + templateV4.getEnable());
        Toast.showFailureText(mo44593c().getContext(), (int) R.string.Doc_List_NoInternetClickMoreToast);
    }

    @Override // com.bytedance.ee.bear.templates.scene.ISceneView.IViewDelegate
    /* renamed from: a */
    public void mo44591a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "topicID");
        mo44595e().mo44603d();
        String str2 = str;
        if (!StringsKt.isBlank(str2)) {
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f31267c.mo237937a(mo44594d().mo44612b(str).mo238001b(new C11610b(this), new C11611c(this)));
                return;
            }
        }
        mo44595e().mo44600a(new RuntimeException("topic is empty"));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseScenePresenter(Fragment fragment, SceneModel gVar, ISceneView eVar) {
        super(gVar, eVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(gVar, "model");
        Intrinsics.checkParameterIsNotNull(eVar, "view");
        this.f31269e = fragment;
        this.f31270f = gVar;
        this.f31271g = eVar;
    }
}
