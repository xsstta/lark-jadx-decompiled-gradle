package com.ss.android.lark.mail.impl.home.menu;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.menu.d */
public final /* synthetic */ class C42571d extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C42571d();

    C42571d() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "loadingType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MailMenuState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getLoadingType()I";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return Integer.valueOf(((MailMenuState) obj).mo153057b());
    }
}
