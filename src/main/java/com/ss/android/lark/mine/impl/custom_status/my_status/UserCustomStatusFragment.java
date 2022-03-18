package com.ss.android.lark.mine.impl.custom_status.my_status;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.AbstractC0203c;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import androidx.navigation.C1259g;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.C1254b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.custom_status.CustomStatusUIUtils;
import com.ss.android.lark.mine.impl.custom_status.ModifyCustomStatusFragment;
import com.ss.android.lark.mine.impl.custom_status.model.C45499f;
import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusState;
import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel;
import com.ss.android.lark.mine.impl.custom_status.model.ErrorEvent;
import com.ss.android.lark.mine.impl.custom_status.model.FetchSource;
import com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u000b\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\u001a\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u00062"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "onBackPressedCallback", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$onBackPressedCallback$1", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$onBackPressedCallback$1;", "statusAdapter", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter;", "viewModel", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "getViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "hideEmptyPage", "", "initNavSetting", "initRecyclerView", "initSubscribers", "initTitleBar", "navModifyPage", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "navSettingPage", "navigateNewPage", "onBackStatus", "openedStatus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onResume", "onViewCreated", "view", "showEmptyPage", "showOnBoarding", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserCustomStatusFragment extends BaseFragment implements JackView {

    /* renamed from: c */
    public static final Companion f115144c = new Companion(null);

    /* renamed from: a */
    public UserCustomStatusAdapter f115145a;

    /* renamed from: b */
    public final C45563k f115146b;

    /* renamed from: d */
    private final Lazy f115147d = LazyKt.lazy(new C45562j(this));

    /* renamed from: e */
    private final LifecycleAwareLazy f115148e;

    /* renamed from: f */
    private HashMap f115149f;

    /* renamed from: j */
    private final C1259g m180724j() {
        return (C1259g) this.f115147d.getValue();
    }

    /* renamed from: a */
    public View mo160588a(int i) {
        if (this.f115149f == null) {
            this.f115149f = new HashMap();
        }
        View view = (View) this.f115149f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f115149f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final CustomStatusViewModel mo160591c() {
        return (CustomStatusViewModel) this.f115148e.getValue();
    }

    /* renamed from: i */
    public void mo160597i() {
        HashMap hashMap = this.f115149f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo160597i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavController;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$j */
    static final class C45562j extends Lambda implements Function0<C1259g> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45562j(UserCustomStatusFragment userCustomStatusFragment) {
            super(0);
            this.this$0 = userCustomStatusFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1259g invoke() {
            return C1254b.m5698a(this.this$0);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$onBackPressedCallback$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$k */
    public static final class C45563k extends AbstractC0203c {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusFragment f115152a;

        @Override // androidx.activity.AbstractC0203c
        public void handleOnBackPressed() {
            this.f115152a.mo160591c().onBackPress();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45563k(UserCustomStatusFragment userCustomStatusFragment, boolean z) {
            super(z);
            this.f115152a = userCustomStatusFragment;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f115146b.setEnabled(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$n */
    static final class C45566n extends Lambda implements Function0<ak> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45566n(UserCustomStatusFragment userCustomStatusFragment) {
            super(0);
            this.this$0 = userCustomStatusFragment;
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
    private final void m180726l() {
        ((ImageView) mo160588a(R.id.icon_group_back)).setOnClickListener(new View$OnClickListenerC45561i(this));
    }

    /* renamed from: m */
    private final void m180727m() {
        CustomStatusUIUtils bVar = CustomStatusUIUtils.f115068a;
        LinearLayout linearLayout = (LinearLayout) mo160588a(R.id.layout_status_setting);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "layout_status_setting");
        bVar.mo160435a(linearLayout, new C45552b(this));
    }

    /* renamed from: d */
    public final void mo160592d() {
        NavDestination d = m180724j().mo6341d();
        if (d != null && d.mo6254h() == R.id.customStatusFragment) {
            m180724j().mo6340c(R.id.action_new_custom_status_from_home);
        }
    }

    /* renamed from: e */
    public final void mo160593e() {
        NavDestination d = m180724j().mo6341d();
        if (d != null && d.mo6254h() == R.id.customStatusFragment) {
            m180724j().mo6340c(R.id.action_setting_custom_status_from_home);
        }
    }

    /* renamed from: f */
    public final void mo160594f() {
        NavDestination d = m180724j().mo6341d();
        if (d == null || d.mo6254h() != R.id.onBoardingDialogFragment) {
            m180724j().mo6340c(R.id.action_on_boarding);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        StatusBarUtil.setColor(requireActivity(), ContextCompat.getColor(requireActivity(), R.color.bg_base), 0);
    }

    /* renamed from: k */
    private final void m180725k() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        this.f115145a = new UserCustomStatusAdapter(context, new C45553c(this));
        RecyclerView recyclerView = (RecyclerView) mo160588a(R.id.list_user_custom);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        UserCustomStatusAdapter bVar = this.f115145a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusAdapter");
        }
        recyclerView.setAdapter(bVar);
    }

    /* renamed from: h */
    public final void mo160596h() {
        ImageView imageView = (ImageView) mo160588a(R.id.icon_group_back);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "icon_group_back");
        imageView.setVisibility(0);
        NestedScrollView nestedScrollView = (NestedScrollView) mo160588a(R.id.layout_scroll);
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollView, "layout_scroll");
        nestedScrollView.setVisibility(0);
        UDEmptyState uDEmptyState = (UDEmptyState) mo160588a(R.id.empty_cover);
        Intrinsics.checkExpressionValueIsNotNull(uDEmptyState, "empty_cover");
        uDEmptyState.setVisibility(8);
    }

    public UserCustomStatusFragment() {
        C45566n nVar = new C45566n(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomStatusViewModel.class);
        this.f115148e = new LifecycleAwareLazy(orCreateKotlinClass, new UserCustomStatusFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), nVar, UserCustomStatusFragment$$special$$inlined$viewModel$3.INSTANCE, UserCustomStatusFragment$$special$$inlined$viewModel$2.INSTANCE);
        this.f115146b = new C45563k(this, true);
    }

    /* renamed from: n */
    private final void m180728n() {
        ISubscriber.C24024a.m87810a(this, mo160591c(), C45600d.INSTANCE, (SubscriptionConfig) null, new C45555e(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160591c(), C45601e.INSTANCE, (SubscriptionConfig) null, new C45556f(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160591c(), C45602f.INSTANCE, (SubscriptionConfig) null, new C45559g(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160591c(), C45603g.INSTANCE, (SubscriptionConfig) null, new C45560h(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160591c(), C45604h.INSTANCE, (SubscriptionConfig) null, new C45554d(this), 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo160595g() {
        ImageView imageView = (ImageView) mo160588a(R.id.icon_group_back);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "icon_group_back");
        imageView.setVisibility(8);
        NestedScrollView nestedScrollView = (NestedScrollView) mo160588a(R.id.layout_scroll);
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollView, "layout_scroll");
        nestedScrollView.setVisibility(8);
        UDEmptyState uDEmptyState = (UDEmptyState) mo160588a(R.id.empty_cover);
        Intrinsics.checkExpressionValueIsNotNull(uDEmptyState, "this");
        uDEmptyState.setVisibility(0);
        uDEmptyState.setPrimaryClickListener(new View$OnClickListenerC45564l(this));
        uDEmptyState.setSecondaryClickListener(new View$OnClickListenerC45565m(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$f */
    public static final class C45556f extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45556f(UserCustomStatusFragment userCustomStatusFragment) {
            super(1);
            this.this$0 = userCustomStatusFragment;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$initSubscribers$4$1$1$1", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$initSubscribers$4$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$f$a */
        public static final class C45557a extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ Drawable $drawable$inlined;
            final /* synthetic */ IsAllowedCreateUserCustomStatusResponse $it$inlined;
            final /* synthetic */ C45556f this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45557a(IsAllowedCreateUserCustomStatusResponse isAllowedCreateUserCustomStatusResponse, Drawable drawable, C45556f fVar) {
                super(1);
                this.$it$inlined = isAllowedCreateUserCustomStatusResponse;
                this.$drawable$inlined = drawable;
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                this.this$0.this$0.mo160592d();
                UserCustomStatusHitPoint.f115066a.mo160411b();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$initSubscribers$4$1$1$2", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$initSubscribers$4$$special$$inlined$apply$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$f$b */
        public static final class C45558b extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ Drawable $drawable$inlined;
            final /* synthetic */ IsAllowedCreateUserCustomStatusResponse $it$inlined;
            final /* synthetic */ C45556f this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45558b(IsAllowedCreateUserCustomStatusResponse isAllowedCreateUserCustomStatusResponse, Drawable drawable, C45556f fVar) {
                super(1);
                this.$it$inlined = isAllowedCreateUserCustomStatusResponse;
                this.$drawable$inlined = drawable;
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Context context = this.this$0.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                UDToast.show(context, (int) R.string.Lark_Profile_CustomStatusLimit);
                UserCustomStatusHitPoint.f115066a.mo160411b();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            IsAllowedCreateUserCustomStatusResponse a = dVar.mo160495j().mo86215a();
            if (a != null) {
                Drawable drawable = UIUtils.getDrawable(this.this$0.getContext(), R.drawable.ud_icon_add_outlined);
                ImageView imageView = (ImageView) this.this$0.mo160588a(R.id.icon_add_status);
                Boolean bool = a.mis_allowed;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.mis_allowed");
                if (bool.booleanValue()) {
                    drawable.setTint(UIUtils.getColor(imageView.getContext(), R.color.icon_n1));
                    CustomStatusUIUtils.f115068a.mo160435a(imageView, new C45557a(a, drawable, this));
                } else {
                    drawable.setTint(UIUtils.getColor(imageView.getContext(), R.color.icon_n3));
                    CustomStatusUIUtils.f115068a.mo160435a(imageView, new C45558b(a, drawable, this));
                }
                imageView.setImageDrawable(drawable);
                com.larksuite.framework.utils.ak.m95027a(imageView, CustomStatusUIUtils.f115068a.mo160434a(4), CustomStatusUIUtils.f115068a.mo160434a(4), CustomStatusUIUtils.f115068a.mo160434a(4), CustomStatusUIUtils.f115068a.mo160434a(4));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$b */
    public static final class C45552b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45552b(UserCustomStatusFragment userCustomStatusFragment) {
            super(1);
            this.this$0 = userCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            this.this$0.mo160593e();
            UserCustomStatusHitPoint.f115066a.mo160415c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$initRecyclerView$clickListener$1", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusAdapter$OnClickListener;", "onMoreSettingClick", "", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "onUpdateMeta", "list", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$c */
    public static final class C45553c implements UserCustomStatusAdapter.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusFragment f115150a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45553c(UserCustomStatusFragment userCustomStatusFragment) {
            this.f115150a = userCustomStatusFragment;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.OnClickListener
        /* renamed from: a */
        public void mo160599a(UserCustomStatus userCustomStatus) {
            Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
            this.f115150a.mo160589a(userCustomStatus);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusAdapter.OnClickListener
        /* renamed from: a */
        public void mo160600a(List<UpdateUserCustomStatusMeta> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f115150a.mo160591c().updateMeta(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$d */
    public static final class C45554d extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45554d(UserCustomStatusFragment userCustomStatusFragment) {
            super(1);
            this.this$0 = userCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            if (Intrinsics.areEqual((Object) dVar.mo160497l().mo86215a(), (Object) true)) {
                this.this$0.mo160594f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$e */
    public static final class C45555e extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45555e(UserCustomStatusFragment userCustomStatusFragment) {
            super(1);
            this.this$0 = userCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            Pair<Map<Long, UserCustomStatus>, Long> a = dVar.mo160494i().mo86206a();
            if (a == null) {
                return;
            }
            if (a.getFirst().isEmpty()) {
                this.this$0.mo160595g();
                return;
            }
            this.this$0.mo160596h();
            UserCustomStatusFragment.m180723a(this.this$0).mo160642a(a.getFirst(), a.getSecond().longValue());
            this.this$0.mo160591c().checkIsAllowCreateUserCustomStatus();
            this.this$0.mo160591c().fetchOnBoarding();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$g */
    public static final class C45559g extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45559g(UserCustomStatusFragment userCustomStatusFragment) {
            super(1);
            this.this$0 = userCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            UserCustomStatus a = dVar.mo160498m().mo86215a();
            if (a != null && !Intrinsics.areEqual(a, C45499f.m180678a())) {
                if (Intrinsics.areEqual(a, C45499f.m180679b())) {
                    this.this$0.mo160590b(null);
                } else {
                    this.this$0.mo160590b(a);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$h */
    public static final class C45560h extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ UserCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45560h(UserCustomStatusFragment userCustomStatusFragment) {
            super(1);
            this.this$0 = userCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            ErrorEvent a = dVar.mo160496k().mo86215a();
            if (a instanceof ErrorEvent.GetUserStatus) {
                this.this$0.mo160595g();
            } else if (a instanceof ErrorEvent.IsAllowedToCreateStatus) {
                Context context = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                String message = a.mo160537a().getMessage();
                if (message == null) {
                    message = "";
                }
                UDToast.show(context, message);
            } else if (a instanceof ErrorEvent.SwitchStatus) {
                if (((ErrorEvent.SwitchStatus) a).mo160539b()) {
                    Context context2 = this.this$0.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
                    UDToast.show(context2, (int) R.string.Lark_Profile_EnableFailedRetry);
                } else {
                    Context context3 = this.this$0.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context3, "mContext");
                    UDToast.show(context3, (int) R.string.Lark_Profile_CloseFailedRetry);
                }
                Pair<Map<Long, UserCustomStatus>, Long> a2 = dVar.mo160494i().mo86206a();
                if (a2 != null) {
                    UserCustomStatusFragment.m180723a(this.this$0).mo160642a(a2.getFirst(), a2.getSecond().longValue());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$i */
    public static final class View$OnClickListenerC45561i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusFragment f115151a;

        View$OnClickListenerC45561i(UserCustomStatusFragment userCustomStatusFragment) {
            this.f115151a = userCustomStatusFragment;
        }

        public final void onClick(View view) {
            this.f115151a.f115146b.handleOnBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$showEmptyPage$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$m */
    public static final class View$OnClickListenerC45565m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusFragment f115154a;

        View$OnClickListenerC45565m(UserCustomStatusFragment userCustomStatusFragment) {
            this.f115154a = userCustomStatusFragment;
        }

        public final void onClick(View view) {
            this.f115154a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/custom_status/my_status/UserCustomStatusFragment$showEmptyPage$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.UserCustomStatusFragment$l */
    public static final class View$OnClickListenerC45564l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserCustomStatusFragment f115153a;

        View$OnClickListenerC45564l(UserCustomStatusFragment userCustomStatusFragment) {
            this.f115153a = userCustomStatusFragment;
        }

        public final void onClick(View view) {
            this.f115153a.mo160591c().fetchUserCustomStatus(FetchSource.Retry);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ UserCustomStatusAdapter m180723a(UserCustomStatusFragment userCustomStatusFragment) {
        UserCustomStatusAdapter bVar = userCustomStatusFragment.f115145a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusAdapter");
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo160590b(UserCustomStatus userCustomStatus) {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        Bundle a2 = a.mo133463v().mo133527a(userCustomStatus);
        Intent intent = new Intent();
        intent.putExtras(a2);
        setResult(-1, intent);
        finish();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo160591c().fetchUserCustomStatus(FetchSource.PersonalStatus);
        this.f115146b.setEnabled(true);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        requireActivity.getOnBackPressedDispatcher().addCallback(this, this.f115146b);
    }

    /* renamed from: a */
    public final void mo160589a(UserCustomStatus userCustomStatus) {
        NavDestination d = m180724j().mo6341d();
        if (d != null && d.mo6254h() == R.id.customStatusFragment) {
            m180724j().mo6336b(R.id.action_modify_custom_status_from_home, ModifyCustomStatusFragment.f115029d.mo160340a(userCustomStatus));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m180725k();
        m180726l();
        m180727m();
        m180728n();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_custom_status, viewGroup, false);
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
