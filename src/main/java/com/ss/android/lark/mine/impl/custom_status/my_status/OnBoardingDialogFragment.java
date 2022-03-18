package com.ss.android.lark.mine.impl.custom_status.my_status;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ak;
import androidx.navigation.C1259g;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.C1254b;
import com.google.android.material.bottomsheet.C22184b;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
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
import com.larksuite.suite.R;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/OnBoardingDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "viewModel", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "getViewModel", "()Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "getTheme", "", "initButton", "", "button", "Landroid/widget/Button;", "initSetting", "initTextView", "textView", "Landroid/widget/TextView;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OnBoardingDialogFragment extends C22184b implements JackView {

    /* renamed from: c */
    public static final Companion f115136c = new Companion(null);

    /* renamed from: d */
    private final LifecycleAwareLazy f115137d;

    /* renamed from: e */
    private HashMap f115138e;

    /* renamed from: g */
    private final CustomStatusViewModel m180712g() {
        return (CustomStatusViewModel) this.f115137d.getValue();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: e */
    public int mo5515e() {
        return R.style.CustomBottomSheetDialogTheme;
    }

    /* renamed from: f */
    public void mo160583f() {
        HashMap hashMap = this.f115138e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo160583f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/OnBoardingDialogFragment$Companion;", "", "()V", "CUSTOM_STATUS_GUIDE_KEY", "", "TAG", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.OnBoardingDialogFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: h */
    private final void m180713h() {
        m180712g().updateSyncSettingOnBoarding();
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
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.OnBoardingDialogFragment$d */
    static final class C45551d extends Lambda implements Function0<ak> {
        final /* synthetic */ OnBoardingDialogFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45551d(OnBoardingDialogFragment onBoardingDialogFragment) {
            super(0);
            this.this$0 = onBoardingDialogFragment;
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

    public OnBoardingDialogFragment() {
        C45551d dVar = new C45551d(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomStatusViewModel.class);
        this.f115137d = new LifecycleAwareLazy(orCreateKotlinClass, new OnBoardingDialogFragment$$special$$inlined$viewModel$1(orCreateKotlinClass), dVar, OnBoardingDialogFragment$$special$$inlined$viewModel$3.INSTANCE, OnBoardingDialogFragment$$special$$inlined$viewModel$2.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.OnBoardingDialogFragment$b */
    public static final class View$OnClickListenerC45549b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnBoardingDialogFragment f115139a;

        View$OnClickListenerC45549b(OnBoardingDialogFragment onBoardingDialogFragment) {
            this.f115139a = onBoardingDialogFragment;
        }

        public final void onClick(View view) {
            this.f115139a.u_();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/my_status/OnBoardingDialogFragment$initTextView$span$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.OnBoardingDialogFragment$c */
    public static final class C45550c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ OnBoardingDialogFragment f115140a;

        /* renamed from: b */
        final /* synthetic */ int f115141b;

        /* renamed from: c */
        final /* synthetic */ int f115142c;

        /* renamed from: d */
        final /* synthetic */ int f115143d;

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            C1259g a = C1254b.m5698a(this.f115140a);
            NavDestination d = a.mo6341d();
            if (d != null && d.mo6254h() == R.id.onBoardingDialogFragment) {
                a.mo6340c(R.id.action_setting_from_guide);
            }
        }

        C45550c(OnBoardingDialogFragment onBoardingDialogFragment, int i, int i2, int i3) {
            this.f115140a = onBoardingDialogFragment;
            this.f115141b = i;
            this.f115142c = i2;
            this.f115143d = i3;
        }
    }

    /* renamed from: a */
    private final void m180710a(Button button) {
        button.setOnClickListener(new View$OnClickListenerC45549b(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133445d().mo133468a("all_im_status_setting");
    }

    /* renamed from: a */
    private final void m180711a(TextView textView) {
        String string = UIHelper.getString(R.string.Lark_Profile_ModifySyncSettings);
        int length = string.length();
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C45550c(this, 0, length, 18), 0, length, 18);
        spannableString.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.ud_primary_color_5)), 0, length, 18);
        textView.append(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.tv_3_desc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_3_desc)");
        m180711a((TextView) findViewById);
        View findViewById2 = view.findViewById(R.id.confirm_button);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.confirm_button)");
        m180710a((Button) findViewById2);
        m180713h();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.guide_custom_status, viewGroup, false);
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
