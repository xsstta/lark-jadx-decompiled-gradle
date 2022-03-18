package com.ss.android.lark.profile.func.medal.wall;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.wall.g */
final /* synthetic */ class C52420g extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C52420g();

    C52420g() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "toastEvent";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MedalWallState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getToastEvent()Lcom/larksuite/arch/jack/Event;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((MedalWallState) obj).mo179372p();
    }
}
