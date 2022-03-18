package com.tt.p3257c;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;

/* renamed from: com.tt.c.a */
public final class C65680a {
    /* renamed from: a */
    public static boolean m257566a() {
        return false;
    }

    /* renamed from: a */
    public static boolean m257567a(IAppContext iAppContext) {
        if (ProcessUtil.isMiniappProcess()) {
            return false;
        }
        if (iAppContext == null || AppType.GadgetAPP != iAppContext.getAppType()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m257568b(IAppContext iAppContext) {
        if (ProcessUtil.isMiniappProcess()) {
            return false;
        }
        if (iAppContext == null || AppType.GadgetAPP != iAppContext.getAppType()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m257569c(IAppContext iAppContext) {
        if (ProcessUtil.isMiniappProcess()) {
            return false;
        }
        if (iAppContext == null || AppType.GadgetAPP != iAppContext.getAppType()) {
            return true;
        }
        return false;
    }
}
