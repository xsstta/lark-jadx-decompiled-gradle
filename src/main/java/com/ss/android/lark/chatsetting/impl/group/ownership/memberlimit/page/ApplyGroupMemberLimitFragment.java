package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.C1254b;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.UserInfoFlowView;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyGroupMemberLimitModel;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyMemberLimitPageState;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0002J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010\f2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010/\u001a\u00020\"H\u0002J\b\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u00020\"H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX.¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/ApplyGroupMemberLimitFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/ViewCompanion;", "Lcom/larksuite/arch/jack/JackView;", "()V", "applyDescriptionET", "Landroid/widget/EditText;", "approvalContainer", "Landroid/view/ViewGroup;", "currentOptionsTV", "Landroid/widget/TextView;", "currentOptionsWrapper", "Landroid/view/View;", "groupAvatarView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "groupNameTV", "imageLoader", "Lcom/ss/android/lark/image/api/IRequestCreator;", "kotlin.jvm.PlatformType", "getImageLoader", "()Lcom/ss/android/lark/image/api/IRequestCreator;", "imageLoader$delegate", "Lkotlin/Lazy;", "model", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel;", "getModel", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel;", "model$delegate", "submitTextView", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "userInfoFlowView", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/UserInfoFlowView;", "initApplyContentRegion", "", "initChatRegion", "initEventHandler", "initInfoFlowRegion", "initOptionSelectRegion", "initTitleBar", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onSubmitApplyClick", "setupView", "startSelectLimitOptionsPage", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ApplyGroupMemberLimitFragment extends BaseFragment implements JackView, ViewCompanion {

    /* renamed from: f */
    public static final Companion f89796f = new Companion(null);

    /* renamed from: a */
    public TextView f89797a;

    /* renamed from: b */
    public View f89798b;

    /* renamed from: c */
    public TextView f89799c;

    /* renamed from: d */
    public UserInfoFlowView f89800d;

    /* renamed from: e */
    public ViewGroup f89801e;

    /* renamed from: g */
    private LKUIRoundedImageView2 f89802g;

    /* renamed from: h */
    private TextView f89803h;

    /* renamed from: i */
    private CommonTitleBar f89804i;

    /* renamed from: j */
    private EditText f89805j;

    /* renamed from: k */
    private final Lazy f89806k;

    /* renamed from: l */
    private final Lazy f89807l = LazyKt.lazy(new C34765b(this));

    /* renamed from: m */
    private HashMap f89808m;

    /* renamed from: g */
    private final IRequestCreator m135169g() {
        return (IRequestCreator) this.f89807l.getValue();
    }

    /* renamed from: c */
    public final ApplyGroupMemberLimitModel mo128347c() {
        return (ApplyGroupMemberLimitModel) this.f89806k.getValue();
    }

    /* renamed from: f */
    public void mo128350f() {
        HashMap hashMap = this.f89808m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo128350f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/ApplyGroupMemberLimitFragment$Companion;", "", "()V", "AVATAR_SIZE", "", "LOG_TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    public Context ay_() {
        return ViewCompanion.C34764a.m135160a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/image/api/IRequestCreator;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$b */
    static final class C34765b extends Lambda implements Function0<IRequestCreator> {
        final /* synthetic */ ApplyGroupMemberLimitFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34765b(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            super(0);
            this.this$0 = applyGroupMemberLimitFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final IRequestCreator invoke() {
            return ImageLoader.with(this.this$0.getContext());
        }
    }

    /* renamed from: k */
    private final void m135173k() {
        EditText editText = this.f89805j;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applyDescriptionET");
        }
        editText.addTextChangedListener(new C34766c(this));
    }

    /* renamed from: l */
    private final void m135174l() {
        ISubscriber.C24024a.m87810a(this, mo128347c(), C34783d.INSTANCE, (SubscriptionConfig) null, new C34770g(this), 2, (Object) null);
    }

    /* renamed from: n */
    private final void m135176n() {
        m135170h();
        m135171i();
        m135172j();
        m135173k();
        m135174l();
        m135175m();
    }

    /* renamed from: e */
    public final void mo128349e() {
        C1254b.m5698a(this).mo6340c(R.id.action_nav_to_select_page);
        if (KeyboardUtils.isSoftShowing(getActivity())) {
            KeyboardUtils.hideKeyboard(getActivity());
        }
    }

    public ApplyGroupMemberLimitFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApplyGroupMemberLimitModel.class);
        this.f89806k = LazyKt.lazy(new ApplyGroupMemberLimitFragment$$special$$inlined$activityViewModel$1(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    /* renamed from: j */
    private final void m135172j() {
        ISubscriber.C24024a.m87810a(this, mo128347c(), C34784e.INSTANCE, (SubscriptionConfig) null, new C34771h(this), 2, (Object) null);
        View view = this.f89798b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentOptionsWrapper");
        }
        view.setOnClickListener(new View$OnClickListenerC34772i(this));
    }

    /* renamed from: h */
    private final void m135170h() {
        CommonTitleBar commonTitleBar = this.f89804i;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC34773j(this));
        commonTitleBar.setLeftImageDrawable(null);
        commonTitleBar.setLeftText(R.string.Lark_GroupLimit_AppealGroupSize_CancelButton);
        TextView textView = new TextView(requireContext());
        textView.setText(getString(R.string.Lark_GroupLimit_AppealGroupSize_SubmitButton));
        textView.setTextSize(16.0f);
        textView.setGravity(16);
        textView.setTextColor(C0215a.m652a(requireContext(), R.color.ud_button_blue_text));
        this.f89797a = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("submitTextView");
        }
        commonTitleBar.addAction(new C34774k(textView, this));
    }

    /* renamed from: i */
    private final void m135171i() {
        int a = mo128346a(32);
        IRequestCreator load = m135169g().load(AvatarImage.Builder.obtain(mo128347c().getChat().getAvatarKey(), mo128347c().getChat().getEntityId(), a, a).build());
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.f89802g;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("groupAvatarView");
        }
        load.into(lKUIRoundedImageView2);
        String name = mo128347c().getChat().getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "model.chat.getName()");
        TextView textView = this.f89803h;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("groupNameTV");
        }
        textView.setText(name);
    }

    /* renamed from: m */
    private final void m135175m() {
        ISubscriber.C24024a.m87810a(this, mo128347c(), C34780a.INSTANCE, (SubscriptionConfig) null, new C34767d(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo128347c(), C34781b.INSTANCE, (SubscriptionConfig) null, new C34768e(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo128347c(), C34782c.INSTANCE, (SubscriptionConfig) null, new C34769f(this), 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo128348d() {
        EditText editText = this.f89805j;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applyDescriptionET");
        }
        mo128347c().submitApply(editText.getText().toString());
        ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.SUBMIT;
        TARGET_NONE eVar = TARGET_NONE.f135700a;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        mo128347c().withState(new C34775l(intRef));
        ChatSettingHitPointNew.m136655p(C54952a.m213204a(click.plus(eVar), MapsKt.mapOf(TuplesKt.to("member_toplimit", Integer.valueOf(intRef.element)))));
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/ApplyGroupMemberLimitFragment$initApplyContentRegion$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$c */
    public static final class C34766c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ApplyGroupMemberLimitFragment f89809a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34766c(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            this.f89809a = applyGroupMemberLimitFragment;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
            ApplyGroupMemberLimitModel c = this.f89809a.mo128347c();
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            c.setApprovalDescriptionsEmpty(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$d */
    public static final class C34767d extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ ApplyGroupMemberLimitFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34767d(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            super(1);
            this.this$0 = applyGroupMemberLimitFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            if (Intrinsics.areEqual((Object) bVar.mo128328e().mo86215a(), (Object) true)) {
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                UDToast.show(requireContext, (int) R.string.Lark_GroupLimit_AppealSubmitted_Toast, (int) R.drawable.ud_icon_yes_outlined);
                this.this$0.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$e */
    public static final class C34768e extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ ApplyGroupMemberLimitFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34768e(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            super(1);
            this.this$0 = applyGroupMemberLimitFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            ApplyGroupMemberLimitFragment.m135168e(this.this$0).setEnabled(bVar.mo128325b());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$f */
    public static final class C34769f extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ ApplyGroupMemberLimitFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34769f(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            super(1);
            this.this$0 = applyGroupMemberLimitFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            ErrorResult a = bVar.mo128330f().mo86215a();
            if (a != null) {
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                UDToast.show(requireContext, String.valueOf(a.getDisplayMsg()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$g */
    public static final class C34770g extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ ApplyGroupMemberLimitFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34770g(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            super(1);
            this.this$0 = applyGroupMemberLimitFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            if (bVar.mo128327d().isEmpty()) {
                ApplyGroupMemberLimitFragment.m135166c(this.this$0).setVisibility(8);
                return;
            }
            ApplyGroupMemberLimitFragment.m135166c(this.this$0).setVisibility(0);
            ApplyGroupMemberLimitFragment.m135167d(this.this$0).setUserInfo(bVar.mo128327d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$h */
    public static final class C34771h extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ ApplyGroupMemberLimitFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34771h(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            super(1);
            this.this$0 = applyGroupMemberLimitFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            if (bVar.mo128323a() == -1) {
                ApplyGroupMemberLimitFragment.m135164a(this.this$0).setClickable(false);
                ApplyGroupMemberLimitFragment.m135165b(this.this$0).setText("");
                return;
            }
            ApplyGroupMemberLimitFragment.m135165b(this.this$0).setText(String.valueOf(bVar.mo128323a()));
            ApplyGroupMemberLimitFragment.m135164a(this.this$0).setClickable(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$i */
    public static final class View$OnClickListenerC34772i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplyGroupMemberLimitFragment f89810a;

        View$OnClickListenerC34772i(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            this.f89810a = applyGroupMemberLimitFragment;
        }

        public final void onClick(View view) {
            this.f89810a.mo128349e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/ApplyGroupMemberLimitFragment$initTitleBar$1$3", "Lcom/ss/android/lark/ui/IActionTitlebar$ViewAction;", "performAction", "", "view", "Landroid/view/View;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$k */
    public static final class C34774k extends IActionTitlebar.C57575b {

        /* renamed from: a */
        final /* synthetic */ ApplyGroupMemberLimitFragment f89812a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f89812a.mo128348d();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34774k(View view, ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            super(view);
            this.f89812a = applyGroupMemberLimitFragment;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$l */
    public static final class C34775l extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ Ref.IntRef $selectedOption;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34775l(Ref.IntRef intRef) {
            super(1);
            this.$selectedOption = intRef;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            this.$selectedOption.element = bVar.mo128323a();
        }
    }

    /* renamed from: a */
    public int mo128346a(int i) {
        return ViewCompanion.C34764a.m135159a(this, i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    /* renamed from: b */
    public float mo128336b(int i) {
        return ViewCompanion.C34764a.m135161b(this, i);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m135176n();
    }

    /* renamed from: a */
    public static final /* synthetic */ View m135164a(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
        View view = applyGroupMemberLimitFragment.f89798b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentOptionsWrapper");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m135165b(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
        TextView textView = applyGroupMemberLimitFragment.f89799c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentOptionsTV");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ViewGroup m135166c(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
        ViewGroup viewGroup = applyGroupMemberLimitFragment.f89801e;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("approvalContainer");
        }
        return viewGroup;
    }

    /* renamed from: d */
    public static final /* synthetic */ UserInfoFlowView m135167d(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
        UserInfoFlowView userInfoFlowView = applyGroupMemberLimitFragment.f89800d;
        if (userInfoFlowView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfoFlowView");
        }
        return userInfoFlowView;
    }

    /* renamed from: e */
    public static final /* synthetic */ TextView m135168e(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
        TextView textView = applyGroupMemberLimitFragment.f89797a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("submitTextView");
        }
        return textView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/page/ApplyGroupMemberLimitFragment$initTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.ApplyGroupMemberLimitFragment$j */
    public static final class View$OnClickListenerC34773j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ApplyGroupMemberLimitFragment f89811a;

        View$OnClickListenerC34773j(ApplyGroupMemberLimitFragment applyGroupMemberLimitFragment) {
            this.f89811a = applyGroupMemberLimitFragment;
        }

        public final void onClick(View view) {
            this.f89811a.finish();
            ChatSettingHitPointNew.m136654o(ChatSettingExtraParams.Click.CANCEL.plus(TARGET_NONE.f135700a));
        }
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
        View inflate = layoutInflater.inflate(R.layout.fragment_apply_group_member_limit, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.v_user_info_flow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.v_user_info_flow)");
        this.f89800d = (UserInfoFlowView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.et_apply_desc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.et_apply_desc)");
        this.f89805j = (EditText) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.v_group_avatar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.v_group_avatar)");
        this.f89802g = (LKUIRoundedImageView2) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.tv_group_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.tv_group_name)");
        this.f89803h = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.titlbar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.titlbar)");
        this.f89804i = (CommonTitleBar) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.v_select_option);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.v_select_option)");
        this.f89798b = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.tv_select_option);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.tv_select_option)");
        this.f89799c = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(R.id.approval_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.approval_container)");
        this.f89801e = (ViewGroup) findViewById8;
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
