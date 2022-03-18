package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page;

import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyMemberLimitPageState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.page.d */
final /* synthetic */ class C34783d extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C34783d();

    C34783d() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "approvalInfo";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(ApplyMemberLimitPageState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getApprovalInfo()Ljava/util/List;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ApplyMemberLimitPageState) obj).mo128327d();
    }
}
