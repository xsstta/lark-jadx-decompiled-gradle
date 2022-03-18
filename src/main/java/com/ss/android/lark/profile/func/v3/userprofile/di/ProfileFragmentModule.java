package com.ss.android.lark.profile.func.v3.userprofile.di;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/di/ProfileFragmentModule;", "", "()V", "bindActionBtnClickDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/action/IActionBtnClickDependency;", "dependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/action/ActionBtnClickDependencyImpl;", "bindActionBtnDependency", "Lcom/ss/android/lark/profile/func/user_profile/action/IActionBtnDependency;", "Lcom/ss/android/lark/profile/func/v3/userprofile/action/ActionBtnDependencyImpl;", "bindViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
@Module
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.di.a */
public abstract class ProfileFragmentModule {

    /* renamed from: a */
    public static final Companion f130462a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/di/ProfileFragmentModule$Companion;", "", "()V", "provideUserProfileFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "provideUserProfileFragmentEnterParams", "Landroid/os/Bundle;", "fragment", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.di.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        /* renamed from: a */
        public final Bundle mo180205a(BaseFragment baseFragment) {
            Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
            return baseFragment.getArguments();
        }

        @Provides
        /* renamed from: a */
        public final BaseFragment mo180206a(FragmentActivity fragmentActivity) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("UserProfileFragmentV3");
            if (findFragmentByTag != null) {
                return (BaseFragment) findFragmentByTag;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
        }
    }
}
