package com.ss.android.lark.profile.func.v3.userprofile.fields.department;

import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/DepartmentNameViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "id", "", "departmentName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDepartmentName", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.d.c */
public final class DepartmentNameViewDataV3 extends BaseInfoViewDataV3 {

    /* renamed from: a */
    private final String f130498a;

    public DepartmentNameViewDataV3() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final String mo180259a() {
        return this.f130498a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentNameViewDataV3(String str, String str2) {
        super(str, DepartmentNameViewDataV3.class.getSimpleName());
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f130498a = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepartmentNameViewDataV3(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
