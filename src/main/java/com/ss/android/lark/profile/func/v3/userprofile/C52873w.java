package com.ss.android.lark.profile.func.v3.userprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.w */
public final /* synthetic */ class C52873w extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C52873w();

    C52873w() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "canShowMoreButton";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UserProfileState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getCanShowMoreButton()Z";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return Boolean.valueOf(((UserProfileState) obj).mo179996B());
    }
}