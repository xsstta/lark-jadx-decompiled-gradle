package com.ss.android.lark.profile.func.medal.wall;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.wall.f */
final /* synthetic */ class C52419f extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C52419f();

    C52419f() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "isMedalsEmpty";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MedalWallState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "isMedalsEmpty()Z";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return Boolean.valueOf(((MedalWallState) obj).mo179365i());
    }
}
