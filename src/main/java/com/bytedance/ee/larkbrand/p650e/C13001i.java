package com.bytedance.ee.larkbrand.p650e;

import android.content.Context;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.option.p3386g.C67631a;
import java.util.Locale;

/* renamed from: com.bytedance.ee.larkbrand.e.i */
public class C13001i extends C67631a {
    @Override // com.tt.option.p3386g.C67631a, com.tt.option.p3386g.AbstractC67632b
    public boolean doAppBundleSplitInstallAction(Context context) {
        return false;
    }

    @Override // com.tt.option.p3386g.C67631a, com.tt.option.p3386g.AbstractC67632b
    public boolean isEnableAppBundleMode() {
        return false;
    }

    @Override // com.tt.option.p3386g.C67631a, com.tt.option.p3386g.AbstractC67632b
    public String replaceOpenApiDomain() {
        return null;
    }

    @Override // com.tt.option.p3386g.C67631a, com.tt.option.p3386g.AbstractC67632b
    public Locale getInitLocale() {
        return LarkExtensionManager.getInstance().getExtension().mo49563a();
    }

    @Override // com.tt.option.p3386g.C67631a, com.tt.option.p3386g.AbstractC67632b
    public boolean isEnableI18nNetRequest() {
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null) {
            return a.mo148730a();
        }
        return false;
    }
}
