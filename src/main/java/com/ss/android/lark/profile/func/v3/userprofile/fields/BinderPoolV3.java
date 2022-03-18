package com.ss.android.lark.profile.func.v3.userprofile.fields;

import com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0016\u0010\u0014\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\b0\u0006RB\u0010\u0003\u001a6\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0004j\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006`\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/BinderPoolV3;", "", "()V", "mBinderMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "Lkotlin/collections/HashMap;", "mNameList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getBinder", "index", "", "name", "getIndex", "registerBinder", "", "binder", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.a */
public final class BinderPoolV3 {

    /* renamed from: a */
    private final ArrayList<String> f130468a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, BaseInfoBinderV3<BaseInfoViewDataV3, IBinderDependencyV3>> f130469b = new HashMap<>();

    /* renamed from: a */
    public final int mo180232a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f130468a.indexOf(str);
    }

    /* renamed from: a */
    public final BaseInfoBinderV3<BaseInfoViewDataV3, IBinderDependencyV3> mo180233a(int i) {
        return this.f130469b.get(this.f130468a.get(i));
    }

    /* renamed from: a */
    public final void mo180234a(String str, BaseInfoBinderV3<? extends BaseInfoViewDataV3, ? extends IBinderDependencyV3> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(aVar, "binder");
        this.f130468a.add(str);
        this.f130469b.put(str, aVar);
    }
}
