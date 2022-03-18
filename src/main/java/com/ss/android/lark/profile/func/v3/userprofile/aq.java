package com.ss.android.lark.profile.func.v3.userprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
public final /* synthetic */ class aq extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new aq();

    aq() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "mainViewPointEvent";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UserProfileState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getMainViewPointEvent()Lcom/larksuite/arch/jack/Event;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((UserProfileState) obj).ak();
    }
}
