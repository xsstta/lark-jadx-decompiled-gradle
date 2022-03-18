package com.ss.android.openbusiness.data;

import com.ss.android.lark.appsetting.api.SettingManager;

/* renamed from: com.ss.android.openbusiness.data.a */
public class C59566a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.openbusiness.data.a$a */
    public static class C59568a {

        /* renamed from: a */
        public static C59566a f147857a = new C59566a();
    }

    private C59566a() {
    }

    /* renamed from: a */
    public static C59566a m231079a() {
        return C59568a.f147857a;
    }

    /* renamed from: d */
    private MessengeActionConfig m231080d() {
        return (MessengeActionConfig) SettingManager.getInstance().get(MessengeActionConfig.class);
    }

    /* renamed from: b */
    public String mo202959b() {
        if (m231080d() == null || m231080d().mo202953a() == null) {
            return null;
        }
        return m231080d().mo202953a().getHelpUrl();
    }

    /* renamed from: c */
    public String mo202960c() {
        if (m231080d() == null || m231080d().mo202954b() == null) {
            return null;
        }
        return m231080d().mo202954b().getHelpUrl();
    }
}
