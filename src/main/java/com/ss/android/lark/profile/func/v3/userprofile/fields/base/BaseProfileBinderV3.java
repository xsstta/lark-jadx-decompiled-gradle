package com.ss.android.lark.profile.func.v3.userprofile.fields.base;

import com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.IProfileBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseViewDataV3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseProfileBinderV3;", "VD", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseViewDataV3;", "DP", "Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/IProfileBinderV3;", "mDependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;)V", "getMDependency", "()Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.c.c */
public abstract class BaseProfileBinderV3<VD extends BaseViewDataV3, DP extends IBinderDependencyV3> implements IProfileBinderV3<VD> {

    /* renamed from: a */
    private final DP f130493a;

    /* renamed from: b */
    public final DP mo180255b() {
        return this.f130493a;
    }

    public BaseProfileBinderV3(DP dp) {
        Intrinsics.checkParameterIsNotNull(dp, "mDependency");
        this.f130493a = dp;
    }
}
