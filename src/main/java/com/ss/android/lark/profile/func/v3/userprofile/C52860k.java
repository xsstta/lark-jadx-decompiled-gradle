package com.ss.android.lark.profile.func.v3.userprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.k */
public final /* synthetic */ class C52860k extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C52860k();

    C52860k() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "userStatusSpanResult";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UserProfileState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getUserStatusSpanResult()Lcom/ss/android/lark/widget/span/RecogniseSpansResult;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((UserProfileState) obj).ai();
    }
}
