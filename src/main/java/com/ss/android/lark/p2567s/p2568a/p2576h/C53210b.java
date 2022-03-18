package com.ss.android.lark.p2567s.p2568a.p2576h;

import com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider;
import com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider;
import com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;

/* renamed from: com.ss.android.lark.s.a.h.b */
public final class C53210b {
    /* renamed from: a */
    public static void m205845a(String str) {
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2078305489:
                    if (str.equals("com.ss.android.lark.appcenter.wrapper.AppCenterModule")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1071962124:
                    if (str.equals("com.ss.android.lark.littleapp.LittleAppModule")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1252317254:
                    if (str.equals("com.ss.android.lark.appstrategy.AppStrategyModule")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1458465178:
                    if (str.equals("com.ss.android.lark.openplatform.OpenPlatformModule")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    AppCenterModuleProvider.m154360a();
                    return;
                case 1:
                    LittleAppModuleProvider.m157932a();
                    return;
                case 2:
                    AppStrategyModuleProvider.m154406a();
                    return;
                case 3:
                    OpenPlatformModuleProvider.m158457a();
                    return;
                default:
                    return;
            }
        }
    }
}
