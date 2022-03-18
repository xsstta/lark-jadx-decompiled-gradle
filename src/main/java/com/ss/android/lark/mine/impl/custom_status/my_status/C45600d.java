package com.ss.android.lark.mine.impl.custom_status.my_status;

import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.d */
final /* synthetic */ class C45600d extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C45600d();

    C45600d() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "getRequest";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(CustomStatusState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getGetRequest()Lcom/larksuite/arch/jack/Async;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((CustomStatusState) obj).mo160494i();
    }
}
