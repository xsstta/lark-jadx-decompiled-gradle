package com.ss.android.lark.mine.impl.custom_status.setting;

import com.ss.android.lark.mine.impl.custom_status.model.CustomStatusState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.setting.h */
final /* synthetic */ class C45646h extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C45646h();

    C45646h() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "syncOnLeave";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(CustomStatusState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getSyncOnLeave()Ljava/lang/Boolean;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((CustomStatusState) obj).mo160487d();
    }
}
