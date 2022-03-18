package com.bytedance.ee.lark.infra.cookie.persistence;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

/* renamed from: com.bytedance.ee.lark.infra.cookie.persistence.b */
public class C12771b {
    /* renamed from: a */
    public static String m52801a(IAppContext iAppContext) {
        StringBuilder sb = new StringBuilder(DependencyMgr.f34159a.mo48297a());
        if (iAppContext == null || TextUtils.isEmpty(iAppContext.getAppId())) {
            sb.append("MiniAppCookiePersistence");
            return sb.toString();
        }
        sb.append(iAppContext.getAppId());
        sb.append("_");
        sb.append("MiniAppCookiePersistence");
        return sb.toString();
    }
}
