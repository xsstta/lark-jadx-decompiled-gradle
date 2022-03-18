package com.ss.android.lark.profile.func.medal.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.detail.b */
final /* synthetic */ class C52373b extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C52373b();

    C52373b() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "medalImage";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MedalDetailState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getMedalImage()Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((MedalDetailState) obj).mo179286b();
    }
}
