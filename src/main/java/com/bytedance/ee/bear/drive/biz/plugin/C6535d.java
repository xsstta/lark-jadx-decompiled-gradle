package com.bytedance.ee.bear.drive.biz.plugin;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.PluginManager;
import com.bytedance.ee.plugin.common.ttreader.ITTOfficePlugin;
import com.bytedance.ee.util.p701d.C13615c;

/* renamed from: com.bytedance.ee.bear.drive.biz.plugin.d */
public class C6535d extends AbstractC6533b {

    /* renamed from: a */
    private static volatile C6535d f17988a;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: b */
    public String mo26079b() {
        return "com.bytedance.ee.plugin.ttoffice";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: c */
    public String mo26081c() {
        return "com.bytedance.ee.plugin.ttoffice.TTOfficeInit";
    }

    /* renamed from: a */
    public static C6535d m26238a() {
        if (f17988a == null) {
            synchronized (C6535d.class) {
                if (f17988a == null) {
                    f17988a = new C6535d();
                }
            }
        }
        return f17988a;
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: d */
    public boolean mo26082d() {
        if ((C6534c.m26231a() || C6534c.m26232b()) && C13615c.f35773a != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: e */
    public boolean mo26083e() {
        if (mo26082d()) {
            return mo26101k();
        }
        C13479a.m54758a("TTOfficePlugin", "isPluginStateEnable() isPkgCanUsePlugin is false, return false.");
        return false;
    }

    /* renamed from: d */
    public static boolean m26239d(C6923a aVar) {
        return m26238a().mo26097c(aVar);
    }

    /* renamed from: e */
    public static boolean m26240e(C6923a aVar) {
        return m26238a().mo26097c(aVar);
    }

    /* renamed from: f */
    public static boolean m26241f(C6923a aVar) {
        return m26238a().mo26097c(aVar);
    }

    /* renamed from: g */
    public static boolean m26242g(C6923a aVar) {
        return m26238a().mo26097c(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: a */
    public void mo26077a(Class cls) throws Throwable {
        cls.getMethod("install", new Class[0]).invoke(null, new Object[0]);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: b */
    public boolean mo26080b(C6923a aVar) {
        if (((ITTOfficePlugin) PluginManager.getPluginApi(ITTOfficePlugin.class)) != null) {
            return true;
        }
        C13479a.m54758a("TTOfficePlugin", "PluginManager.getPluginApi() is null");
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: a */
    public boolean mo26078a(C6923a aVar) {
        if (!C6534c.m26232b()) {
            return true;
        }
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.ttoffice_dynamic_feature_init_enable", false);
        C13479a.m54764b("TTOfficePlugin", "isTTOfficeDynamicFeatureEnable, fg = " + a);
        return a;
    }
}
