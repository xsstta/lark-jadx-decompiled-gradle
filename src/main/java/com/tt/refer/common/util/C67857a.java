package com.tt.refer.common.util;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;

/* renamed from: com.tt.refer.common.util.a */
public class C67857a {
    /* renamed from: a */
    public static boolean m263992a(IAppContext iAppContext) {
        return ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50461e();
    }

    /* renamed from: b */
    public static int m263993b(IAppContext iAppContext) {
        return ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50463f();
    }

    /* renamed from: d */
    public static String m263995d(IAppContext iAppContext) {
        if (iAppContext.getAppType() == AppType.GadgetAPP || iAppContext.getAppType() == AppType.WebGadgetAPP || iAppContext.getAppType() == AppType.BlockitApp) {
            return m263994c(iAppContext);
        }
        if (iAppContext.getAppType() == AppType.WebAPP) {
            return String.format("https://%s/open-apis/mina/jssdk", ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50438a(iAppContext));
        }
        throw new RuntimeException("getMinaBaseUrlByEnv fail for UnSupport AppType");
    }

    /* renamed from: c */
    public static String m263994c(IAppContext iAppContext) {
        String str;
        boolean a = m263992a(iAppContext);
        int b = m263993b(iAppContext);
        if (iAppContext.getAppType() == AppType.GadgetAPP || iAppContext.getAppType() == AppType.WebGadgetAPP || iAppContext.getAppType() == AppType.WebAPP || iAppContext.getAppType() == AppType.BlockitApp) {
            String str2 = "https://" + ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50438a(iAppContext);
            Object[] objArr = new Object[4];
            objArr[0] = "envInfo: envtype:";
            if (b == 1) {
                str = "production";
            } else {
                str = "staging";
            }
            objArr[1] = str;
            objArr[2] = "is oversea:";
            objArr[3] = Boolean.valueOf(a);
            AppBrandLogger.m52830i("EnvUtil", objArr);
            return str2 + "/open-apis/mina";
        }
        throw new RuntimeException("getMinaBaseUrlByEnv fail for UnSupport AppType");
    }
}
