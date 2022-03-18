package com.ss.android.lark.profile.func.v3.userprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ai */
public final /* synthetic */ class C52680ai extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C52680ai();

    C52680ai() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "openedCustomStatusEvent";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UserProfileState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getOpenedCustomStatusEvent()Lcom/larksuite/arch/jack/Event;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((UserProfileState) obj).aj();
    }
}
