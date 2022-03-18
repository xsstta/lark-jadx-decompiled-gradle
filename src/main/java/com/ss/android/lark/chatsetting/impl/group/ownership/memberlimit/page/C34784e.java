package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page;

import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyMemberLimitPageState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.e */
final /* synthetic */ class C34784e extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C34784e();

    C34784e() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "selectedOption";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(ApplyMemberLimitPageState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getSelectedOption()I";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return Integer.valueOf(((ApplyMemberLimitPageState) obj).mo128323a());
    }
}
