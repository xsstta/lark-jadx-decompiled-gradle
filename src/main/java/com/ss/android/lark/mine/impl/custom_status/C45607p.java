package com.ss.android.lark.mine.impl.custom_status;

import com.larksuite.arch.jack.Event;
import com.ss.android.lark.mine.impl.custom_status.model.CreateStatusState;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KMutableProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.p */
final /* synthetic */ class C45607p extends MutablePropertyReference1 {
    public static final KMutableProperty1 INSTANCE = new C45607p();

    C45607p() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "avatarEvent";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(CreateStatusState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getAvatarEvent()Lcom/larksuite/arch/jack/Event;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((CreateStatusState) obj).mo160471d();
    }

    public void set(Object obj, Object obj2) {
        ((CreateStatusState) obj).mo160466a((Event) obj2);
    }
}
