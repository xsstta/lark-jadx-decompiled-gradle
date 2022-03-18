package com.ss.android.lark.profile.func.v3.userprofile.action;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileState;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/action/ActionBtnDependencyImpl;", "Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "actionBtnClickDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/action/IActionBtnClickDependency;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/base/fragment/BaseFragment;Lcom/ss/android/lark/profile/func/v3/userprofile/action/IActionBtnClickDependency;)V", "mProfileModuleDependency", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "getMProfileModuleDependency", "()Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "setMProfileModuleDependency", "(Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;)V", "viewModel", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "getViewModel", "()Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getContext", "Landroid/content/Context;", "onAcceptBtnClick", "", "onAddContactBtnClick", "onAddNameCardBtnClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.c */
public final class ActionBtnDependencyImpl implements IActionBtnDependency {
    @Inject

    /* renamed from: a */
    public IProfileModuleDependency f130370a;

    /* renamed from: b */
    public final IActionBtnClickDependency f130371b;

    /* renamed from: c */
    private final Lazy f130372c;

    /* renamed from: d */
    private final FragmentActivity f130373d;

    /* renamed from: e */
    private final BaseFragment f130374e;

    /* renamed from: e */
    public final UserProfileViewModel mo179974e() {
        return (UserProfileViewModel) this.f130372c.getValue();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency
    /* renamed from: c */
    public void mo179612c() {
        FragmentActivity fragmentActivity = this.f130373d;
        if (fragmentActivity != null) {
            mo179974e().onCreateNameCard(fragmentActivity);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.base.IBinderDependency
    /* renamed from: d */
    public Context mo179591d() {
        FragmentActivity fragmentActivity = this.f130373d;
        if (fragmentActivity == null) {
            Intrinsics.throwNpe();
        }
        return fragmentActivity;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency
    /* renamed from: b */
    public void mo179611b() {
        FragmentActivity fragmentActivity = this.f130373d;
        if (fragmentActivity != null) {
            mo179974e().withState(new C52670a(fragmentActivity, this));
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.action.IActionBtnDependency
    /* renamed from: a */
    public void mo179610a() {
        IProfileModuleDependency iProfileModuleDependency = this.f130370a;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProfileModuleDependency");
        }
        if (iProfileModuleDependency.mo133561a("lark.client.contact.opt")) {
            mo179974e().withState(new C52671b(this));
        } else {
            mo179974e().withState(new C52672c(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke", "com/ss/android/lark/profile/func/v3/userprofile/action/ActionBtnDependencyImpl$onAcceptBtnClick$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.c$a */
    static final class C52670a extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ FragmentActivity $it;
        final /* synthetic */ ActionBtnDependencyImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52670a(FragmentActivity fragmentActivity, ActionBtnDependencyImpl cVar) {
            super(1);
            this.$it = fragmentActivity;
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            this.this$0.mo179974e().acceptAddFriendRequest(this.$it, azVar.mo180048m());
            UserProfileHitPointV3.f130746c.mo180575b(azVar.mo180049n(), azVar.mo180050o());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.c$b */
    static final class C52671b extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ ActionBtnDependencyImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52671b(ActionBtnDependencyImpl cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            if (!TextUtils.isEmpty(azVar.mo180045j())) {
                this.this$0.f130371b.mo179973a(azVar.mo180062z(), azVar.mo180045j(), this.this$0.mo179974e().getChatId(), azVar.mo180022a(), this.this$0.mo179974e().getSource(), azVar.mo180049n(), azVar.mo180050o());
                UserProfileHitPointV3.f130746c.mo180569a(azVar.mo180049n(), azVar.mo180050o());
                return;
            }
            Log.m165383e("UserProfileFragmentV3", "user id is null or empty");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.c$c */
    static final class C52672c extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ ActionBtnDependencyImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52672c(ActionBtnDependencyImpl cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            this.this$0.f130371b.mo179972a(azVar.mo180062z(), this.this$0.mo179974e().getChatId(), this.this$0.mo179974e().getSource());
        }
    }

    @Inject
    public ActionBtnDependencyImpl(FragmentActivity fragmentActivity, BaseFragment baseFragment, IActionBtnClickDependency fVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(fVar, "actionBtnClickDependency");
        this.f130373d = fragmentActivity;
        this.f130374e = baseFragment;
        this.f130371b = fVar;
        if (baseFragment != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserProfileViewModel.class);
            this.f130372c = LazyKt.lazy(new ActionBtnDependencyImpl$$special$$inlined$activityViewModel$1((UserProfileFragmentV3) baseFragment, orCreateKotlinClass, orCreateKotlinClass));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3");
    }
}
