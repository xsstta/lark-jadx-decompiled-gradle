package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.JackViewModelFactory;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.page.content.general.feedfilter.viewmodel.FeedFilterSettingViewModel;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.statistics.SettingHitPointNew;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/AtFeedDetailFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "enableAtAllFilter", "", "viewModel", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel;", "getViewModel", "()Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "bindData", "", "initViews", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a */
public final class AtFeedDetailFragment extends BaseFragment implements JackView {

    /* renamed from: b */
    public static final Companion f134719b = new Companion(null);

    /* renamed from: a */
    public boolean f134720a;

    /* renamed from: c */
    private final LifecycleAwareLazy f134721c;

    /* renamed from: d */
    private HashMap f134722d;

    /* renamed from: a */
    public View mo186225a(int i) {
        if (this.f134722d == null) {
            this.f134722d = new HashMap();
        }
        View view = (View) this.f134722d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f134722d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final FeedFilterSettingViewModel mo186226c() {
        return (FeedFilterSettingViewModel) this.f134721c.getValue();
    }

    /* renamed from: d */
    public void mo186227d() {
        HashMap hashMap = this.f134722d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo186227d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/AtFeedDetailFragment$Companion;", "", "()V", "LOG_TAG", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/JackViewModelFactory;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$i */
    static final class C54497i extends Lambda implements Function0<JackViewModelFactory> {
        public static final C54497i INSTANCE = new C54497i();

        C54497i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JackViewModelFactory invoke() {
            return new JackViewModelFactory();
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$h */
    static final class C54496h extends Lambda implements Function0<ak> {
        final /* synthetic */ AtFeedDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54496h(AtFeedDetailFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ak invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            ak viewModelStore = requireActivity.getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    public AtFeedDetailFragment() {
        C54496h hVar = new C54496h(this);
        AtFeedDetailFragment$$special$$inlined$viewModel$3 atFeedDetailFragment$$special$$inlined$viewModel$3 = C54497i.INSTANCE;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeedFilterSettingViewModel.class);
        this.f134721c = new LifecycleAwareLazy(orCreateKotlinClass, new AtFeedDetailFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), hVar, atFeedDetailFragment$$special$$inlined$viewModel$3 == null ? AtFeedDetailFragment$$special$$inlined$viewModel$3.INSTANCE : atFeedDetailFragment$$special$$inlined$viewModel$3, AtFeedDetailFragment$$special$$inlined$viewModel$2.INSTANCE);
        this.f134720a = true;
    }

    /* renamed from: e */
    private final void m211425e() {
        ISubscriber.C24024a.m87812a(this, mo186226c(), C54498b.INSTANCE, (SubscriptionConfig) null, new C54490b(this), (Function0) null, new C54491c(this), 10, (Object) null);
        ISubscriber.C24024a.m87812a(this, mo186226c(), C54499c.INSTANCE, (SubscriptionConfig) null, new C54492d(this), (Function0) null, new C54493e(this), 10, (Object) null);
        mo186226c().requestFeedFilterSettingFromCache();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$b */
    public static final class C54490b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AtFeedDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54490b(AtFeedDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            Log.m165384e("AtFeedDetailFragment", "update at feed filter setting error", th);
            Context context = this.this$0.getContext();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                String string = UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Legacy_NetworkErrorRetry)");
                UDToast.makeToast(context, string).show();
            }
            UDCheckBox uDCheckBox = (UDCheckBox) this.this$0.mo186225a(R.id.at_all_selector);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "at_all_selector");
            uDCheckBox.setChecked(!this.this$0.f134720a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$d */
    public static final class C54492d extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AtFeedDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54492d(AtFeedDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            Log.m165384e("AtFeedDetailFragment", "get feed filter setting error", th);
            Context context = this.this$0.getContext();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                String string = UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Legacy_NetworkErrorRetry)");
                UDToast.makeToast(context, string).show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$e */
    public static final class C54493e extends Lambda implements Function1<FeedFilterTabInfo, Unit> {
        final /* synthetic */ AtFeedDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54493e(AtFeedDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FeedFilterTabInfo bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(FeedFilterTabInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            this.this$0.f134720a = bVar.mo186313e();
            UDCheckBox uDCheckBox = (UDCheckBox) this.this$0.mo186225a(R.id.at_all_selector);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "at_all_selector");
            uDCheckBox.setChecked(bVar.mo186313e());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$c */
    public static final class C54491c extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ AtFeedDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54491c(AtFeedDetailFragment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Log.m165389i("AtFeedDetailFragment", "update at feed filter setting success, enableAtAllFilter=" + this.this$0.f134720a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$f */
    public static final class View$OnClickListenerC54494f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtFeedDetailFragment f134723a;

        View$OnClickListenerC54494f(AtFeedDetailFragment aVar) {
            this.f134723a = aVar;
        }

        public final void onClick(View view) {
            SettingHitPoint.f134851a.mo186410j();
            SettingHitPointNew.f134850a.mo186384a(SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_CLOSE);
            this.f134723a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.a$g */
    public static final class View$OnClickListenerC54495g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtFeedDetailFragment f134724a;

        View$OnClickListenerC54495g(AtFeedDetailFragment aVar) {
            this.f134724a = aVar;
        }

        public final void onClick(View view) {
            UDCheckBox uDCheckBox = (UDCheckBox) this.f134724a.mo186225a(R.id.at_all_selector);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "at_all_selector");
            boolean isChecked = uDCheckBox.isChecked();
            UDCheckBox uDCheckBox2 = (UDCheckBox) this.f134724a.mo186225a(R.id.at_all_selector);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "at_all_selector");
            uDCheckBox2.setChecked(!isChecked);
            AtFeedDetailFragment aVar = this.f134724a;
            UDCheckBox uDCheckBox3 = (UDCheckBox) aVar.mo186225a(R.id.at_all_selector);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "at_all_selector");
            aVar.f134720a = uDCheckBox3.isChecked();
            FeedFilterSettingViewModel c = this.f134724a.mo186226c();
            UDCheckBox uDCheckBox4 = (UDCheckBox) this.f134724a.mo186225a(R.id.at_all_selector);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "at_all_selector");
            c.updateAtFeedFilterSetting(uDCheckBox4.isChecked());
        }
    }

    /* renamed from: a */
    private final void m211424a(View view) {
        ((CommonTitleBar) mo186225a(R.id.title_bar)).setTitle(UIHelper.getString(R.string.Lark_Messenger_AtMeMessageGrouping_Subtitle));
        ((CommonTitleBar) mo186225a(R.id.title_bar)).setLeftClickListener(new View$OnClickListenerC54494f(this));
        UDCheckBox uDCheckBox = (UDCheckBox) mo186225a(R.id.at_me_selector);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "at_me_selector");
        uDCheckBox.setChecked(true);
        UDCheckBox uDCheckBox2 = (UDCheckBox) mo186225a(R.id.at_me_selector);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "at_me_selector");
        uDCheckBox2.setEnabled(false);
        ((LinearLayout) mo186225a(R.id.at_all_container)).setOnClickListener(new View$OnClickListenerC54495g(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m211424a(view);
        m211425e();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_at_feed_detail_layout, viewGroup, false);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }
}
