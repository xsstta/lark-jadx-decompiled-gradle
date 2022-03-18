package com.lark.falcon.engine.p1058b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.manager.p3302a.C66389b;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

/* renamed from: com.lark.falcon.engine.b.a */
public class C23949a {

    /* renamed from: a */
    private static final String f59274a = "a";

    /* renamed from: a */
    private static File m87581a(IAppContext iAppContext, String str, String str2) {
        File f = ((AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class)).mo235093f();
        File file = new File(f, "components" + File.separator + str + File.separator + str2 + File.separator);
        if (!file.exists()) {
            file.mkdirs();
        }
        AppBrandLogger.m52830i(f59274a, "getComponentInstallDir -> ", file.getAbsolutePath());
        return file;
    }

    /* renamed from: b */
    public static String m87583b(IAppContext iAppContext, String str, String str2, String str3) {
        File a = m87581a(iAppContext, str2, str3);
        File file = new File(a, str2 + ".js");
        if (!file.exists()) {
            m87582a(iAppContext, str, str2, str3);
        }
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        AppBrandLogger.m52829e(f59274a, "getBundlePath, bundle file not exist");
        return "";
    }

    /* renamed from: a */
    public static void m87582a(IAppContext iAppContext, String str, String str2, String str3) {
        File a = m87581a(iAppContext, str2, str3);
        File file = new File(a, str2 + ".js");
        try {
            if (str.endsWith(".zip")) {
                File a2 = C66389b.m259576a(iAppContext.getApplicationContext(), "buildin_bundle", str2);
                IOUtils.copyAssets(iAppContext.getApplicationContext(), str, a2.getAbsolutePath());
                IOUtils.unZipFolder(a2.getAbsolutePath(), a.getAbsolutePath());
                return;
            }
            IOUtils.copyAssets(iAppContext.getApplicationContext(), str, file.getAbsolutePath());
        } catch (Exception e) {
            String str4 = f59274a;
            AppBrandLogger.m52829e(str4, "copyAssetsToBundle error: " + e.getMessage(), e);
        }
    }
}
