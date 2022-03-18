package com.ss.android.lark.mine.impl.custom_status;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.h */
final /* synthetic */ class C45482h extends PropertyReference1 {
    public static final KProperty1 INSTANCE = new C45482h();

    C45482h() {
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return ShareHitPoint.f121869d;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UpdateStatusState.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getType()Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus$Type;";
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((UpdateStatusState) obj).mo160545b();
    }
}
