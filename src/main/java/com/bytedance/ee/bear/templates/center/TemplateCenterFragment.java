package com.bytedance.ee.bear.templates.center;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.abtest.service.AbstractC4156b;
import com.bytedance.ee.bear.contract.p278b.AbstractC5115a;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplatePreviewAbTestExperiment;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
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
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J\u001a\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/facade/common/ActivityResultHandler;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "openTemplateCenter", "", "presenter", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterPresenter;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "viewModel$delegate", "initABTest", "", "initData", "initMVP", "rootView", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.d */
public final class TemplateCenterFragment extends C7667e implements AbstractC7664b {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30813a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TemplateCenterFragment.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: b */
    public static final Companion f30814b = new Companion(null);

    /* renamed from: c */
    private TemplateCenterPresenter f30815c;

    /* renamed from: d */
    private String f30816d = "";

    /* renamed from: e */
    private final C68289a f30817e = new C68289a();

    /* renamed from: f */
    private final Lazy f30818f = LazyKt.lazy(C11461d.INSTANCE);

    /* renamed from: g */
    private final Lazy f30819g = LazyKt.lazy(new C11462e(this));

    /* renamed from: h */
    private HashMap f30820h;

    /* renamed from: c */
    private final C10917c m47691c() {
        Lazy lazy = this.f30818f;
        KProperty kProperty = f30813a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: a */
    public final TemplateCenterViewModel mo44014a() {
        Lazy lazy = this.f30819g;
        KProperty kProperty = f30813a[1];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    /* renamed from: b */
    public void mo44015b() {
        HashMap hashMap = this.f30820h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterFragment$Companion;", "", "()V", "EXTRA_CATEGORY_ID", "", "EXTRA_OPEN_TEMPLATE_CENTER", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "openTemplateCenter", "categoryId", "", "enterSource", "parentToken", "module", "filterType", "", "isSpaceV2", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo44016a(Context context, String str, long j, String str2, String str3, String str4, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "openTemplateCenter");
            Intrinsics.checkParameterIsNotNull(str2, "enterSource");
            Intrinsics.checkParameterIsNotNull(str3, "parentToken");
            Intrinsics.checkParameterIsNotNull(str4, "module");
            Bundle bundle = new Bundle();
            bundle.putString("extra_open_template_center", str);
            bundle.putLong("extra_open_template_center_category_id", j);
            bundle.putString("enterSource", str2);
            bundle.putString("ROOT_TOKEN", str3);
            bundle.putString("MODULE", str4);
            bundle.putInt("objType", i);
            bundle.putBoolean("key_folder_version", z);
            Fragment instantiate = Fragment.instantiate(context, TemplateCenterFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…:class.java.name, bundle)");
            return instantiate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.d$d */
    static final class C11461d extends Lambda implements Function0<C10917c> {
        public static final C11461d INSTANCE = new C11461d();

        C11461d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.d$e */
    static final class C11462e extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ TemplateCenterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11462e(TemplateCenterFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.requireActivity()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        TemplateCenterPresenter fVar = this.f30815c;
        if (fVar != null) {
            fVar.destroy();
        }
        ((AbstractC5115a) KoinJavaComponent.m268613a(AbstractC5115a.class, null, null, 6, null)).mo20220a("ccm_template_center");
        mo44015b();
    }

    /* renamed from: e */
    private final void m47693e() {
        Disposable b = m47691c().mo41508c(AbstractC4156b.class).mo238001b(new C11459b(this), C11460c.f30822a);
        Intrinsics.checkExpressionValueIsNotNull(b, "serviceContext.justServi…wable)\n                })");
        this.f30817e.mo237937a(b);
    }

    /* renamed from: d */
    private final void m47692d() {
        String str;
        int i;
        String str2;
        String str3;
        String string;
        boolean z;
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments == null || (str = arguments.getString("extra_open_template_center", str4)) == null) {
            str = str4;
        }
        this.f30816d = str;
        TemplateCenterViewModel.Companion aVar = TemplateCenterViewModel.Companion;
        Bundle arguments2 = getArguments();
        long j = -1;
        if (arguments2 != null) {
            j = arguments2.getLong("extra_open_template_center_category_id", -1);
        }
        aVar.mo44063a(j);
        boolean z2 = false;
        if (StringsKt.contains$default((CharSequence) this.f30816d, (CharSequence) "custom", false, 2, (Object) null)) {
            TemplateCenterViewModel.Companion.mo44062a(1);
        } else if (StringsKt.contains$default((CharSequence) this.f30816d, (CharSequence) "corporate", false, 2, (Object) null)) {
            TemplateCenterViewModel.Companion.mo44062a(2);
        } else {
            if (this.f30816d.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TemplateCenterViewModel.Companion.mo44062a(0);
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i = arguments3.getInt("objType", -1);
        } else {
            i = -1;
        }
        if (true ^ StringsKt.isBlank(this.f30816d)) {
            mo44014a().clearLocalFilterRecord();
        }
        if (i != -1) {
            mo44014a().saveSystemFilter(i);
        }
        TemplateCenterViewModel a = mo44014a();
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("ROOT_TOKEN")) == null) {
            str2 = str4;
        }
        a.setParentToken(str2);
        TemplateCenterViewModel a2 = mo44014a();
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str3 = arguments5.getString("MODULE")) == null) {
            str3 = str4;
        }
        a2.setModule(str3);
        TemplateCenterViewModel a3 = mo44014a();
        Bundle arguments6 = getArguments();
        if (!(arguments6 == null || (string = arguments6.getString("enterSource", str4)) == null)) {
            str4 = string;
        }
        a3.setEnterSource(str4);
        mo44014a().setInitFilterType(i);
        TemplateCenterViewModel a4 = mo44014a();
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            z2 = arguments7.getBoolean("key_folder_version");
        }
        a4.setSpaceV2(z2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.d$c */
    public static final class C11460c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C11460c f30822a = new C11460c();

        C11460c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("TemplateCenterFragment", "initABTest error:", th);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m47692d();
        Context context = getContext();
        if (context != null) {
            ((AbstractC5115a) KoinJavaComponent.m268613a(AbstractC5115a.class, null, null, 6, null)).mo20221a("ccm_template_center", null, context, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "docsABTestService", "Lcom/bytedance/ee/bear/abtest/service/DocsABTestService;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.d$b */
    public static final class C11459b<T> implements Consumer<AbstractC4156b> {

        /* renamed from: a */
        final /* synthetic */ TemplateCenterFragment f30821a;

        C11459b(TemplateCenterFragment dVar) {
            this.f30821a = dVar;
        }

        /* renamed from: a */
        public final void accept(AbstractC4156b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "docsABTestService");
            boolean equals = TextUtils.equals("true", bVar.getABTestStringValue(TemplatePreviewAbTestExperiment.class.getName(), true));
            this.f30821a.mo44014a().setPreviewABEnable(equals);
            C13479a.m54764b("TemplateCenterFragment", "initABTest result=" + equals);
        }
    }

    /* renamed from: a */
    private final void m47690a(View view) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        TemplateCenterPresenter fVar = new TemplateCenterPresenter(new TemplateCenterModel(), new TemplateCenterView(requireActivity, childFragmentManager, view), requireContext);
        this.f30815c = fVar;
        if (fVar != null) {
            fVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m47690a(view);
        m47693e();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_template_center, viewGroup, false);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (205 == i2 && intent != null && (stringExtra = intent.getStringExtra("token")) != null) {
            AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(TemplateCenterViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…terViewModel::class.java)");
            ((TemplateCenterViewModel) a).getDeleteToken().mo5929b(stringExtra);
        }
    }
}
