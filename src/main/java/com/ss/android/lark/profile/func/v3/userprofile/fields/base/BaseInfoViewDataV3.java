package com.ss.android.lark.profile.func.v3.userprofile.fields.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseViewDataV3;", "id", "", "fieldName", "(Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.c.b */
public abstract class BaseInfoViewDataV3 extends BaseViewDataV3 {

    /* renamed from: a */
    private final String f130492a;

    /* renamed from: c */
    public final String mo180254c() {
        return this.f130492a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseInfoViewDataV3(String str, String str2) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f130492a = str2;
    }
}
