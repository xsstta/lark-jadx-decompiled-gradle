package com.ss.android.lark.mine.impl.custom_status;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ak;
import com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarViewData;
import com.ss.android.lark.mine.impl.custom_status.model.CreateStatusState;
import com.ss.android.lark.mine.impl.custom_status.model.CreateStatusViewModel;
import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel;
import com.ss.android.lark.mine.impl.custom_status.model.ErrorEvent;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.reaction.p2557b.C52977a;
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
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001eH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020#H\u0016J\u001a\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013¨\u00063"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/NewCustomStatusFragment;", "Lcom/ss/android/lark/mine/impl/custom_status/AbsModifyAwareFragment;", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusViewModel;", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "()V", "mainViewModel", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "getMainViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "mainViewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "maxLengthToast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "getMaxLengthToast", "()Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "maxLengthToast$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusViewModel;", "viewModel$delegate", "getDisturbSetting", "", "()Ljava/lang/Boolean;", "getIconImageView", "Landroid/widget/ImageView;", "getModifyAwareViewModel", "getSaveTextView", "Landroid/widget/TextView;", "getSyncSetting", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "getTitleText", "", "initAvatarView", "", "initEditText", "initSubscribers", "initTitleBar", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NewCustomStatusFragment extends AbsModifyAwareFragment<CreateStatusViewModel, CreateStatusState> {

    /* renamed from: b */
    public static final Companion f115044b = new Companion(null);

    /* renamed from: c */
    private final LifecycleAwareLazy f115045c;

    /* renamed from: d */
    private final LifecycleAwareLazy f115046d;

    /* renamed from: e */
    private final Lazy f115047e = LazyKt.lazy(new C45465j(this));

    /* renamed from: f */
    private HashMap f115048f;

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: a */
    public View mo160322a(int i) {
        if (this.f115048f == null) {
            this.f115048f = new HashMap();
        }
        View view = (View) this.f115048f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f115048f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: i */
    public Map<CustomStatusSyncField, Boolean> mo160328i() {
        return null;
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: o */
    public void mo160330o() {
        HashMap hashMap = this.f115048f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment, com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo160330o();
    }

    /* renamed from: p */
    public final CreateStatusViewModel mo160362p() {
        return (CreateStatusViewModel) this.f115045c.getValue();
    }

    /* renamed from: q */
    public final CustomStatusViewModel mo160363q() {
        return (CustomStatusViewModel) this.f115046d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/NewCustomStatusFragment$Companion;", "", "()V", "LOG_TAG", "", "TOAST_DURATION", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r */
    public CreateStatusViewModel mo160329j() {
        return mo160362p();
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: e */
    public ImageView mo160324e() {
        return (ImageView) mo160322a(R.id.avatar);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: g */
    public TextView mo160326g() {
        return (TextView) mo160322a(R.id.save_title_bar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$i */
    static final class C45464i extends Lambda implements Function0<ak> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45464i(NewCustomStatusFragment newCustomStatusFragment) {
            super(0);
            this.this$0 = newCustomStatusFragment;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$k */
    static final class C45466k extends Lambda implements Function0<ak> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45466k(NewCustomStatusFragment newCustomStatusFragment) {
            super(0);
            this.this$0 = newCustomStatusFragment;
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

    /* renamed from: s */
    private final void m180516s() {
        UDEditText uDEditText = (UDEditText) mo160322a(R.id.input_title);
        Intrinsics.checkExpressionValueIsNotNull(uDEditText, "input_title");
        ((UDEditText) mo160322a(R.id.input_title)).addTextChangedListener(mo160384a(20, uDEditText));
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: f */
    public String mo160325f() {
        UDEditText uDEditText = (UDEditText) mo160322a(R.id.input_title);
        Intrinsics.checkExpressionValueIsNotNull(uDEditText, "input_title");
        return String.valueOf(uDEditText.getText());
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.AbsModifyAwareFragment
    /* renamed from: h */
    public Boolean mo160327h() {
        UDSwitch uDSwitch = (UDSwitch) mo160322a(R.id.switch_notification);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switch_notification");
        return Boolean.valueOf(uDSwitch.isChecked());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        StatusBarUtil.setColor(requireActivity(), ContextCompat.getColor(requireActivity(), R.color.bg_base), 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$j */
    static final class C45465j extends Lambda implements Function0<UDToastImpl> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45465j(NewCustomStatusFragment newCustomStatusFragment) {
            super(0);
            this.this$0 = newCustomStatusFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDToastImpl invoke() {
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            return new UDToast.Builder(requireContext).mo91647b(R.drawable.ud_icon_warning_outlined).mo91637a(R.string.Lark_Profile_CharactersLimit).mo91640a(3000L).mo91655j();
        }
    }

    /* renamed from: t */
    private final void m180517t() {
        CustomStatusUIUtils bVar = CustomStatusUIUtils.f115068a;
        TextView textView = (TextView) mo160322a(R.id.cancel_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancel_title_bar");
        bVar.mo160435a(textView, new C45462g(this));
        CustomStatusUIUtils bVar2 = CustomStatusUIUtils.f115068a;
        TextView textView2 = (TextView) mo160322a(R.id.save_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "save_title_bar");
        bVar2.mo160435a(textView2, new C45463h(this));
    }

    /* renamed from: u */
    private final void m180518u() {
        C52977a.m205190a().mo180995a((ImageView) mo160322a(R.id.avatar), "Status_PrivateMessage");
        CustomStatusUIUtils bVar = CustomStatusUIUtils.f115068a;
        ImageView imageView = (ImageView) mo160322a(R.id.avatar);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "avatar");
        bVar.mo160435a(imageView, new C45457b(this));
    }

    public NewCustomStatusFragment() {
        C45466k kVar = new C45466k(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateStatusViewModel.class);
        this.f115045c = new LifecycleAwareLazy(orCreateKotlinClass, new NewCustomStatusFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), kVar, NewCustomStatusFragment$$special$$inlined$viewModel$3.INSTANCE, NewCustomStatusFragment$$special$$inlined$viewModel$2.INSTANCE);
        C45464i iVar = new C45464i(this);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(CustomStatusViewModel.class);
        this.f115046d = new LifecycleAwareLazy(orCreateKotlinClass2, new NewCustomStatusFragment$$special$$inlined$viewModel$4(orCreateKotlinClass2), iVar, NewCustomStatusFragment$$special$$inlined$viewModel$6.INSTANCE, NewCustomStatusFragment$$special$$inlined$viewModel$5.INSTANCE);
    }

    /* renamed from: v */
    private final void m180519v() {
        ISubscriber.C24024a.m87810a(this, mo160362p(), C45605n.INSTANCE, (SubscriptionConfig) null, new C45458c(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160362p(), C45606o.INSTANCE, (SubscriptionConfig) null, new C45459d(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160362p(), C45607p.INSTANCE, (SubscriptionConfig) null, new C45460e(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo160362p(), C45608q.INSTANCE, (SubscriptionConfig) null, new C45461f(this), 2, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$b */
    public static final class C45457b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45457b(NewCustomStatusFragment newCustomStatusFragment) {
            super(1);
            this.this$0 = newCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            this.this$0.mo160362p().getAvatarList();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$c */
    public static final class C45458c extends Lambda implements Function1<CreateStatusState, Unit> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45458c(NewCustomStatusFragment newCustomStatusFragment) {
            super(1);
            this.this$0 = newCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateStatusState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CreateStatusState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            CreateUserCustomStatusResponse a = bVar.mo160462a().mo86215a();
            if (a != null) {
                UserCustomStatus userCustomStatus = a.status;
                if (userCustomStatus != null) {
                    Context context = this.this$0.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                    UDToast.show(context, (int) R.string.Lark_Profile_Saved);
                    CustomStatusViewModel q = this.this$0.mo160363q();
                    Intrinsics.checkExpressionValueIsNotNull(userCustomStatus, "this");
                    q.notifyInsert(userCustomStatus);
                    this.this$0.mo160387c();
                    if (userCustomStatus != null) {
                        return;
                    }
                }
                Context context2 = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
                UDToast.show(context2, (int) R.string.Lark_Profile_FailedSaveRetry);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$d */
    public static final class C45459d extends Lambda implements Function1<CreateStatusState, Unit> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45459d(NewCustomStatusFragment newCustomStatusFragment) {
            super(1);
            this.this$0 = newCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateStatusState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CreateStatusState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            if (bVar.mo160467b().mo86215a() instanceof ErrorEvent.CreateCustomStatus) {
                Context context = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                UDToast.show(context, (int) R.string.Lark_Profile_FailedSaveRetry);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$e */
    public static final class C45460e extends Lambda implements Function1<CreateStatusState, Unit> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45460e(NewCustomStatusFragment newCustomStatusFragment) {
            super(1);
            this.this$0 = newCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateStatusState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CreateStatusState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            Pair<List<AvatarViewData>, Integer> a = bVar.mo160471d().mo86215a();
            if (a != null) {
                this.this$0.mo160386a(a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$f */
    public static final class C45461f extends Lambda implements Function1<CreateStatusState, Unit> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45461f(NewCustomStatusFragment newCustomStatusFragment) {
            super(1);
            this.this$0 = newCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateStatusState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CreateStatusState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            Boolean a = bVar.mo160470c().mo86215a();
            if (a != null && a.booleanValue()) {
                this.this$0.mo160387c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$g */
    public static final class C45462g extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45462g(NewCustomStatusFragment newCustomStatusFragment) {
            super(1);
            this.this$0 = newCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            this.this$0.mo160390l();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.NewCustomStatusFragment$h */
    public static final class C45463h extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ NewCustomStatusFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45463h(NewCustomStatusFragment newCustomStatusFragment) {
            super(1);
            this.this$0 = newCustomStatusFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            boolean z;
            UDEditText uDEditText = (UDEditText) this.this$0.mo160322a(R.id.input_title);
            Intrinsics.checkExpressionValueIsNotNull(uDEditText, "input_title");
            Editable text = uDEditText.getText();
            if (text == null || StringsKt.isBlank(text)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Context context = this.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                UDToast.show(context, (int) R.string.Lark_Profile_StatusNameDesc);
                return;
            }
            this.this$0.mo160391m();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m180516s();
        m180517t();
        m180519v();
        m180518u();
        UserCustomStatusHitPoint.f115066a.mo160419d();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_new_custom_status, viewGroup, false);
    }
}
