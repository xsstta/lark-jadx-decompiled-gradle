package com.ss.android.lark.profile.func.v3.userprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.n */
public final /* synthetic */ class C52863n extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C52863n();

    C52863n() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "departmentTag";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UserProfileState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getDepartmentTag()Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$DepartmentTagInfo;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((UserProfileState) obj).mo180057u();
    }
}
