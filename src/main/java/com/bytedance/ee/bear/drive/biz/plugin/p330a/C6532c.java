package com.bytedance.ee.bear.drive.biz.plugin.p330a;

import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.biz.plugin.a.c */
public class C6532c implements AbstractC6531b {
    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: a */
    public Object mo26090a(String str) {
        try {
            return Class.forName("com.bytedance.mira.Mira").getMethod("getPlugin", String.class).invoke(null, str);
        } catch (Throwable th) {
            C13479a.m54761a("MiraPluginManager", th);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: b */
    public boolean mo26091b(String str) {
        try {
            return ((Boolean) Class.forName("com.bytedance.mira.Mira").getMethod("isPluginInstalled", String.class).invoke(null, str)).booleanValue();
        } catch (Throwable th) {
            C13479a.m54761a("MiraPluginManager", th);
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: c */
    public ClassLoader mo26092c(String str) {
        try {
            return (ClassLoader) Class.forName("com.bytedance.mira.Mira").getMethod("getPluginClassLoader", String.class).invoke(null, str);
        } catch (Throwable th) {
            C13479a.m54761a("MiraPluginManager", th);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: d */
    public boolean mo26093d(String str) {
        try {
            return ((Boolean) Class.forName("com.bytedance.mira.Mira").getMethod("isPluginLoaded", String.class).invoke(null, str)).booleanValue();
        } catch (Throwable th) {
            C13479a.m54761a("MiraPluginManager", th);
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: e */
    public boolean mo26094e(String str) {
        try {
            return ((Boolean) Class.forName("com.bytedance.mira.Mira").getMethod("loadPlugin", String.class).invoke(null, str)).booleanValue();
        } catch (Throwable th) {
            C13479a.m54761a("MiraPluginManager", th);
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.p330a.AbstractC6531b
    /* renamed from: f */
    public boolean mo26095f(String str) {
        try {
            return ((Boolean) Class.forName("com.bytedance.mira.Mira").getMethod("unInstallPlugin", String.class).invoke(null, str)).booleanValue();
        } catch (Throwable th) {
            C13479a.m54761a("MiraPluginManager", th);
            return false;
        }
    }
}
