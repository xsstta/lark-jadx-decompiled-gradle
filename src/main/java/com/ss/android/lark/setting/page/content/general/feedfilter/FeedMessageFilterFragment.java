package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import butterknife.BindView;
import butterknife.ButterKnife;
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
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.general.GeneralSettingLauncher;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.page.content.general.feedfilter.viewmodel.FeedFilterSettingViewModel;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.statistics.SettingHitPointNew;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020,H\u0002J\b\u00103\u001a\u00020,H\u0002J\u0010\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u0005H\u0002J&\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020.H\u0002J\u001a\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010<H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006B"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "atMeFilterLayout", "Landroid/view/View;", "getAtMeFilterLayout", "()Landroid/view/View;", "setAtMeFilterLayout", "(Landroid/view/View;)V", "filterSortEntryLayout", "getFilterSortEntryLayout", "setFilterSortEntryLayout", "messaegFilterSwitch", "Lcom/larksuite/component/ui/button/LKUISwitchButton;", "getMessaegFilterSwitch", "()Lcom/larksuite/component/ui/button/LKUISwitchButton;", "setMessaegFilterSwitch", "(Lcom/larksuite/component/ui/button/LKUISwitchButton;)V", "muteFilterLayout", "getMuteFilterLayout", "setMuteFilterLayout", "muteFilterSwitch", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "getMuteFilterSwitch", "()Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "setMuteFilterSwitch", "(Lcom/larksuite/component/universe_design/udswitch/UDSwitch;)V", "muteFilterTipView", "getMuteFilterTipView", "setMuteFilterTipView", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "viewModel", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel;", "getViewModel", "()Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "bindData", "", "enableAtMeFeedFg", "", "enableFeedMuteFilter", "initAtFeedFilterEntry", "initSortFilterEntry", "initSwitchButton", "initTitleBar", "initViews", "rootView", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFilterStateChanged", "filterEnabled", "onViewCreated", "view", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedMessageFilterFragment extends BaseFragment implements JackView {

    /* renamed from: a */
    public static final Companion f134676a = new Companion(null);
    @BindView(6563)
    public View atMeFilterLayout;

    /* renamed from: b */
    private final LifecycleAwareLazy f134677b;

    /* renamed from: c */
    private HashMap f134678c;
    @BindView(6979)
    public View filterSortEntryLayout;
    @BindView(6970)
    public LKUISwitchButton messaegFilterSwitch;
    @BindView(7385)
    public View muteFilterLayout;
    @BindView(7386)
    public UDSwitch muteFilterSwitch;
    @BindView(7387)
    public View muteFilterTipView;
    @BindView(7904)
    public CommonTitleBar titleBar;

    /* renamed from: c */
    public final FeedFilterSettingViewModel mo186176c() {
        return (FeedFilterSettingViewModel) this.f134677b.getValue();
    }

    /* renamed from: g */
    public void mo186180g() {
        HashMap hashMap = this.f134678c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo186180g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterFragment$Companion;", "", "()V", "TAG", "", "UNKNOWN_FILTER_INDEX", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/JackViewModelFactory;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$l */
    static final class C54475l extends Lambda implements Function0<JackViewModelFactory> {
        public static final C54475l INSTANCE = new C54475l();

        C54475l() {
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

    /* renamed from: i */
    private final boolean m211372i() {
        return C54115c.m210080a().mo178288c("lark.feed.setting_filter_only_at_me");
    }

    /* renamed from: j */
    private final boolean m211373j() {
        return C54115c.m210080a().mo178273I();
    }

    /* renamed from: d */
    public final LKUISwitchButton mo186177d() {
        LKUISwitchButton lKUISwitchButton = this.messaegFilterSwitch;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messaegFilterSwitch");
        }
        return lKUISwitchButton;
    }

    /* renamed from: e */
    public final UDSwitch mo186178e() {
        UDSwitch uDSwitch = this.muteFilterSwitch;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("muteFilterSwitch");
        }
        return uDSwitch;
    }

    /* renamed from: f */
    public final CommonTitleBar mo186179f() {
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        return commonTitleBar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$k */
    static final class C54474k extends Lambda implements Function0<ak> {
        final /* synthetic */ FeedMessageFilterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54474k(FeedMessageFilterFragment feedMessageFilterFragment) {
            super(0);
            this.this$0 = feedMessageFilterFragment;
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

    /* renamed from: l */
    private final void m211375l() {
        View view = this.filterSortEntryLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterSortEntryLayout");
        }
        view.setOnClickListener(View$OnClickListenerC54470g.f134680a);
    }

    public FeedMessageFilterFragment() {
        C54474k kVar = new C54474k(this);
        FeedMessageFilterFragment$$special$$inlined$viewModel$3 feedMessageFilterFragment$$special$$inlined$viewModel$3 = C54475l.INSTANCE;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeedFilterSettingViewModel.class);
        this.f134677b = new LifecycleAwareLazy(orCreateKotlinClass, new FeedMessageFilterFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), kVar, feedMessageFilterFragment$$special$$inlined$viewModel$3 == null ? FeedMessageFilterFragment$$special$$inlined$viewModel$3.INSTANCE : feedMessageFilterFragment$$special$$inlined$viewModel$3, FeedMessageFilterFragment$$special$$inlined$viewModel$2.INSTANCE);
    }

    /* renamed from: k */
    private final void m211374k() {
        int i;
        View view = this.atMeFilterLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atMeFilterLayout");
        }
        view.setOnClickListener(View$OnClickListenerC54469f.f134679a);
        View view2 = this.atMeFilterLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atMeFilterLayout");
        }
        if (m211372i()) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
    }

    /* renamed from: m */
    private final void m211376m() {
        CommonTitleBar commonTitleBar = this.titleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        CommonTitleBar commonTitleBar2 = this.titleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setTitle(UIHelper.getString(R.string.Lark_Feed_FeedFilterSettingsTitle));
        CommonTitleBar commonTitleBar3 = this.titleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC54473j(this));
    }

    /* renamed from: h */
    private final void m211371h() {
        ISubscriber.C24024a.m87812a(this, mo186176c(), C54503d.INSTANCE, (SubscriptionConfig) null, new C54465b(this), (Function0) null, new C54466c(this), 10, (Object) null);
        ISubscriber.C24024a.m87812a(this, mo186176c(), C54521e.INSTANCE, (SubscriptionConfig) null, new C54467d(this), (Function0) null, (Function1) null, 26, (Object) null);
        ISubscriber.C24024a.m87812a(this, mo186176c(), C54522f.INSTANCE, (SubscriptionConfig) null, new C54468e(this), (Function0) null, (Function1) null, 26, (Object) null);
        mo186176c().requestFeedFilterSetting(false);
    }

    /* renamed from: n */
    private final void m211377n() {
        int i;
        LKUISwitchButton lKUISwitchButton = this.messaegFilterSwitch;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messaegFilterSwitch");
        }
        lKUISwitchButton.setOnClickListener(new View$OnClickListenerC54471h(this));
        UDSwitch uDSwitch = this.muteFilterSwitch;
        if (uDSwitch == null) {
            Intrinsics.throwUninitializedPropertyAccessException("muteFilterSwitch");
        }
        uDSwitch.setOnClickListener(new View$OnClickListenerC54472i(this));
        if (m211373j()) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.muteFilterLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("muteFilterLayout");
        }
        view.setVisibility(i);
        View view2 = this.muteFilterTipView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("muteFilterTipView");
        }
        view2.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$b */
    public static final class C54465b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ FeedMessageFilterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54465b(FeedMessageFilterFragment feedMessageFilterFragment) {
            super(1);
            this.this$0 = feedMessageFilterFragment;
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
            Log.m165384e(this.this$0.TAG, "get feed filter setting error", th);
            LKUIToast.show(this.this$0.mo186179f().getContext(), UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$c */
    public static final class C54466c extends Lambda implements Function1<FeedFilterTabInfo, Unit> {
        final /* synthetic */ FeedMessageFilterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54466c(FeedMessageFilterFragment feedMessageFilterFragment) {
            super(1);
            this.this$0 = feedMessageFilterFragment;
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
            this.this$0.mo186175a(bVar.mo186307a());
            this.this$0.mo186178e().setChecked(bVar.mo186312d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$d */
    public static final class C54467d extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ FeedMessageFilterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54467d(FeedMessageFilterFragment feedMessageFilterFragment) {
            super(1);
            this.this$0 = feedMessageFilterFragment;
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
            Log.m165384e(this.this$0.TAG, "update feed filter setting error", th);
            LKUIToast.show(this.this$0.mo186179f().getContext(), UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$e */
    public static final class C54468e extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ FeedMessageFilterFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54468e(FeedMessageFilterFragment feedMessageFilterFragment) {
            super(1);
            this.this$0 = feedMessageFilterFragment;
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
            Log.m165384e(this.this$0.TAG, "update mute filter setting error", th);
            Context context = this.this$0.mo186179f().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "titleBar.context");
            String string = UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Legacy_NetworkErrorRetry)");
            UDToast.show(context, string);
        }
    }

    /* renamed from: a */
    private final void m211370a(View view) {
        m211376m();
        m211377n();
        m211375l();
        m211374k();
        m211371h();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$f */
    public static final class View$OnClickListenerC54469f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC54469f f134679a = new View$OnClickListenerC54469f();

        View$OnClickListenerC54469f() {
        }

        public final void onClick(View view) {
            GeneralSettingLauncher dVar = GeneralSettingLauncher.f134644a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            dVar.mo186110a(context);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$g */
    public static final class View$OnClickListenerC54470g implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC54470g f134680a = new View$OnClickListenerC54470g();

        View$OnClickListenerC54470g() {
        }

        public final void onClick(View view) {
            GeneralSettingLauncher dVar = GeneralSettingLauncher.f134644a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            dVar.mo186113b(context, 0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$j */
    public static final class View$OnClickListenerC54473j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterFragment f134683a;

        View$OnClickListenerC54473j(FeedMessageFilterFragment feedMessageFilterFragment) {
            this.f134683a = feedMessageFilterFragment;
        }

        public final void onClick(View view) {
            SettingHitPoint.f134851a.mo186410j();
            SettingHitPointNew.f134850a.mo186384a(SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_CLOSE);
            this.f134683a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$i */
    public static final class View$OnClickListenerC54472i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterFragment f134682a;

        View$OnClickListenerC54472i(FeedMessageFilterFragment feedMessageFilterFragment) {
            this.f134682a = feedMessageFilterFragment;
        }

        public final void onClick(View view) {
            SettingHitPointNew.SettingDetailType settingDetailType;
            boolean isChecked = this.f134682a.mo186178e().isChecked();
            this.f134682a.mo186176c().updateMuteFilterSetting(isChecked);
            SettingHitPointNew settingHitPointNew = SettingHitPointNew.f134850a;
            SettingHitPointNew.FeedGroupingEditClickParam feedGroupingEditClickParam = SettingHitPointNew.FeedGroupingEditClickParam.FEED_MUTE_FILTER_TOGGLE;
            if (isChecked) {
                settingDetailType = SettingHitPointNew.SettingDetailType.TOGGLE_ON;
            } else {
                settingDetailType = SettingHitPointNew.SettingDetailType.TOGGLE_OFF;
            }
            settingHitPointNew.mo186385a(feedGroupingEditClickParam, settingDetailType);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterFragment$h */
    public static final class View$OnClickListenerC54471h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterFragment f134681a;

        View$OnClickListenerC54471h(FeedMessageFilterFragment feedMessageFilterFragment) {
            this.f134681a = feedMessageFilterFragment;
        }

        public final void onClick(View view) {
            int i;
            SettingHitPointNew.SettingDetailType settingDetailType;
            boolean isChecked = this.f134681a.mo186177d().isChecked();
            Context context = this.f134681a.mo186177d().getContext();
            if (isChecked) {
                i = R.string.Lark_Feed_MessageFilterOnToast;
            } else {
                i = R.string.Lark_Feed_MessageFilterOffToast;
            }
            LKUIToast.show(context, i);
            SettingHitPoint.f134851a.mo186404e(isChecked);
            SettingHitPointNew.f134850a.mo186384a(SettingHitPointNew.FeedGroupingEditClickParam.FEED_GROUPING_EDIT_FILTER_TOGGLE);
            SettingHitPointNew settingHitPointNew = SettingHitPointNew.f134850a;
            SettingHitPointNew.FeedGroupingEditClickParam feedGroupingEditClickParam = SettingHitPointNew.FeedGroupingEditClickParam.FEED_FILTER_TOGGLE;
            if (isChecked) {
                settingDetailType = SettingHitPointNew.SettingDetailType.TOGGLE_ON;
            } else {
                settingDetailType = SettingHitPointNew.SettingDetailType.TOGGLE_OFF;
            }
            settingHitPointNew.mo186385a(feedGroupingEditClickParam, settingDetailType);
            this.f134681a.mo186176c().updateFeedFilterSetting(isChecked);
            this.f134681a.mo186175a(isChecked);
        }
    }

    /* renamed from: a */
    public final void mo186175a(boolean z) {
        int i;
        LKUISwitchButton lKUISwitchButton = this.messaegFilterSwitch;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messaegFilterSwitch");
        }
        lKUISwitchButton.setChecked(z);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        if (m211372i()) {
            View view = this.filterSortEntryLayout;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterSortEntryLayout");
            }
            view.setVisibility(i);
            View view2 = this.atMeFilterLayout;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atMeFilterLayout");
            }
            view2.setVisibility(i);
        }
        if (m211373j()) {
            View view3 = this.filterSortEntryLayout;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterSortEntryLayout");
            }
            view3.setVisibility(i);
            View view4 = this.muteFilterLayout;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("muteFilterLayout");
            }
            view4.setVisibility(i);
            View view5 = this.muteFilterTipView;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("muteFilterTipView");
            }
            view5.setVisibility(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m211370a(view);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_feed_filter_layout, viewGroup, false);
        ButterKnife.bind(this, inflate);
        return inflate;
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
}
