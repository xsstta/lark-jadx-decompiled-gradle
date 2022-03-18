package com.ss.android.lark.moments.impl.p2354g.p2357c;

import com.bytedance.lark.pb.moments.v1.UserSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.g.c.c */
public final /* synthetic */ class C47674c extends MutablePropertyReference0 {
    C47674c(UserGlobalConfigAndSettingsManager aVar) {
        super(aVar);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "userSetting";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(UserGlobalConfigAndSettingsManager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getUserSetting()Lcom/bytedance/lark/pb/moments/v1/UserSetting;";
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        UserGlobalConfigAndSettingsManager aVar = (UserGlobalConfigAndSettingsManager) this.receiver;
        return UserGlobalConfigAndSettingsManager.f120182c;
    }

    @Override // kotlin.reflect.KMutableProperty0
    public void set(Object obj) {
        UserGlobalConfigAndSettingsManager aVar = (UserGlobalConfigAndSettingsManager) this.receiver;
        UserGlobalConfigAndSettingsManager.f120182c = (UserSetting) obj;
    }
}
