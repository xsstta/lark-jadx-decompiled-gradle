package com.bytedance.ee.bear.drive.biz.plugin.p330a;

import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.biz.plugin.a.a */
public class C6530a implements AbstractC6531b {
    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: e */
    public boolean mo26094e(String str) {
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: f */
    public boolean mo26095f(String str) {
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: d */
    public boolean mo26093d(String str) {
        return mo26091b(str);
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: c */
    public ClassLoader mo26092c(String str) {
        try {
            return C6530a.class.getClassLoader();
        } catch (Throwable th) {
            C13479a.m54761a("AABPluginManager", th);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: a */
    public Object mo26090a(String str) {
        String g = m26191g(str);
        C13479a.m54764b("AABPluginManager", "getPluginInfoObj, moduleName = " + g);
        return g;
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: b */
    public boolean mo26091b(String str) {
        String g = m26191g(str);
        try {
            return ((Boolean) Class.forName("com.ss.android.lark.dfcore.utils.DynamicFeatureUtils").getMethod("isModuleInstalled", String.class).invoke(null, g)).booleanValue();
        } catch (Throwable th) {
            C13479a.m54761a("AABPluginManager", th);
            return false;
        }
    }

    /* renamed from: g */
    private static String m26191g(String str) {
        try {
            C13479a.m54764b("AABPluginManager", "getModuleNameByPackage, packageName = " + str);
            String str2 = (String) Class.forName("com.ss.android.lark.dfcore.utils.DynamicFeatureUtils").getMethod("getModuleName", String.class).invoke(null, str);
            C13479a.m54764b("AABPluginManager", "getModuleNameByPackage, moduleName = " + str2);
            return str2;
        } catch (Throwable th) {
            C13479a.m54761a("AABPluginManager", th);
            return null;
        }
    }
}
