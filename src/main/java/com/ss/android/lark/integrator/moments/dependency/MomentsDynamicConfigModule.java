package com.ss.android.lark.integrator.moments.dependency;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.moments.dependency.idependency.IDynamicConfigModuleDependency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsDynamicConfigModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IDynamicConfigModuleDependency;", "()V", "getSuiteMainDomain", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.g */
public final class MomentsDynamicConfigModule implements IDynamicConfigModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.IDynamicConfigModuleDependency
    /* renamed from: a */
    public String mo144709a() {
        boolean z;
        List<String> b = DynamicConfigModule.m145553b(DomainSettings.Alias.SUITE_MAIN_DOMAIN);
        List<String> list = b;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String str = b.get(0);
        Intrinsics.checkExpressionValueIsNotNull(str, "domain[0]");
        return str;
    }
}
