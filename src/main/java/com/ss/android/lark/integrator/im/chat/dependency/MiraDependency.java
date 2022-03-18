package com.ss.android.lark.integrator.im.chat.dependency;

import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.mira.MiraModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/im/chat/dependency/MiraDependency;", "Lcom/ss/android/lark/dependency/IChatModuleDependency$IMiraDependency;", "()V", "isPluginInstalled", "", "pluginPackageName", "", "isPluginLoaded", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.v */
public final class MiraDependency implements AbstractC36474h.AbstractC36484j {
    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36484j
    /* renamed from: a */
    public boolean mo134626a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
        return MiraModule.f130883a.mo180981c(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36484j
    /* renamed from: b */
    public boolean mo134627b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pluginPackageName");
        return MiraModule.f130883a.mo180982d(str);
    }
}
