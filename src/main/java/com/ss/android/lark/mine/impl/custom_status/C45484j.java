package com.ss.android.lark.mine.impl.custom_status;

import com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.j */
final /* synthetic */ class C45484j extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C45484j();

    C45484j() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "title";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UpdateStatusState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getTitle()Ljava/lang/String;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((UpdateStatusState) obj).mo160549d();
    }
}
