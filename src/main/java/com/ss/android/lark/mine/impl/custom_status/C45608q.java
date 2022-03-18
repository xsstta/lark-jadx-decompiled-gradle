package com.ss.android.lark.mine.impl.custom_status;

import com.ss.android.lark.mine.impl.custom_status.model.CreateStatusState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.q */
final /* synthetic */ class C45608q extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C45608q();

    C45608q() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "popBackEvent";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(CreateStatusState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getPopBackEvent()Lcom/larksuite/arch/jack/Event;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((CreateStatusState) obj).mo160470c();
    }
}
