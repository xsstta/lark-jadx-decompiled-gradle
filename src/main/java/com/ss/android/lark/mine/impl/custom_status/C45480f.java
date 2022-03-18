package com.ss.android.lark.mine.impl.custom_status;

import com.larksuite.arch.jack.Event;
import com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusState;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KMutableProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.f */
final /* synthetic */ class C45480f extends MutablePropertyReference1 {
    public static final KMutableProperty1 INSTANCE = new C45480f();

    C45480f() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "errorEvent";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UpdateStatusState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getErrorEvent()Lcom/larksuite/arch/jack/Event;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((UpdateStatusState) obj).mo160558k();
    }

    public void set(Object obj, Object obj2) {
        ((UpdateStatusState) obj).mo160544a((Event) obj2);
    }
}
