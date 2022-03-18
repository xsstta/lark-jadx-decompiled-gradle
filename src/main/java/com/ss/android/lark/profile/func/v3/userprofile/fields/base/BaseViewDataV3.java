package com.ss.android.lark.profile.func.v3.userprofile.fields.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseViewDataV3;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.c.d */
public abstract class BaseViewDataV3 {

    /* renamed from: a */
    private final String f130494a;

    /* renamed from: d */
    public final String mo180256d() {
        return this.f130494a;
    }

    public BaseViewDataV3(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f130494a = str;
    }
}
