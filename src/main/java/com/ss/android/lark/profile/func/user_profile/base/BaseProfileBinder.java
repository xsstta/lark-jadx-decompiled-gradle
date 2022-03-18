package com.ss.android.lark.profile.func.user_profile.base;

import com.ss.android.lark.profile.func.user_profile.base.BaseViewData;
import com.ss.android.lark.profile.func.user_profile.base.IBinderDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/base/BaseProfileBinder;", "VD", "Lcom/ss/android/lark/profile/func/user_profile/base/BaseViewData;", "DP", "Lcom/ss/android/lark/profile/func/user_profile/base/IBinderDependency;", "Lcom/ss/android/lark/profile/func/user_profile/base/IProfileBinder;", "mDependency", "(Lcom/ss/android/lark/profile/func/user_profile/base/IBinderDependency;)V", "getMDependency", "()Lcom/ss/android/lark/profile/func/user_profile/base/IBinderDependency;", "Lcom/ss/android/lark/profile/func/user_profile/base/IBinderDependency;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.a.a */
public abstract class BaseProfileBinder<VD extends BaseViewData, DP extends IBinderDependency> implements IProfileBinder<VD> {

    /* renamed from: a */
    private final DP f130037a;

    /* renamed from: a */
    public final DP mo179589a() {
        return this.f130037a;
    }

    public BaseProfileBinder(DP dp) {
        Intrinsics.checkParameterIsNotNull(dp, "mDependency");
        this.f130037a = dp;
    }
}
