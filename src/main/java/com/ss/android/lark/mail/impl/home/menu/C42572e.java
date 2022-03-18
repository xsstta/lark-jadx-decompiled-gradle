package com.ss.android.lark.mail.impl.home.menu;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.menu.e */
public final /* synthetic */ class C42572e extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C42572e();

    C42572e() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "listItem";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MailMenuState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getListItem()Ljava/util/List;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((MailMenuState) obj).mo153058c();
    }
}
