package com.ss.android.lark.moments.impl.p2354g.p2357c;

import com.bytedance.lark.pb.moments.v1.UserCircleConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.g.c.b */
public final /* synthetic */ class C47673b extends MutablePropertyReference0 {
    C47673b(UserGlobalConfigAndSettingsManager aVar) {
        super(aVar);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "userCircleConfig";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UserGlobalConfigAndSettingsManager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getUserCircleConfig()Lcom/bytedance/lark/pb/moments/v1/UserCircleConfig;";
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        UserGlobalConfigAndSettingsManager aVar = (UserGlobalConfigAndSettingsManager) this.receiver;
        return UserGlobalConfigAndSettingsManager.f120181b;
    }

    @Override // kotlin.reflect.KMutableProperty0
    public void set(Object obj) {
        UserGlobalConfigAndSettingsManager aVar = (UserGlobalConfigAndSettingsManager) this.receiver;
        UserGlobalConfigAndSettingsManager.f120181b = (UserCircleConfig) obj;
    }
}
