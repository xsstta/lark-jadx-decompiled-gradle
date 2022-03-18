package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.tt.miniapphost.util.C67586c;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.h */
public class C24907h extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        boolean z;
        String a = mo87967a("dirPath");
        boolean b = mo87978b("recursive");
        AppBrandLogger.m52830i("ApiRmDirCtrl", "rmDir begin dirPath=" + a + " recursive=" + b);
        File file = new File(mo87982d(a));
        if (!mo87973a(file) || mo87984f().mo235042b(file)) {
            AppBrandLogger.m52830i("ApiRmDirCtrl", "rmDir end dir permission not right");
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!file.exists() || !file.isDirectory()) {
            AppBrandLogger.m52830i("ApiRmDirCtrl", "rmDir end dir not exist or not dir");
            this.f61050d = mo87975b(a);
            return false;
        } else {
            if (b) {
                C67586c.m263051b(file);
                z = true;
            } else {
                z = file.delete();
            }
            AppBrandLogger.m52830i("ApiRmDirCtrl", "rmDir end success=" + z);
            if (!z) {
                this.f61050d = "directory not empty";
            }
            return z;
        }
    }

    public C24907h(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        this.f61049c.put("dirPath", new AbstractC24899a.C24900a(jSONObject.optString("dirPath"), true));
        this.f61049c.put("recursive", new AbstractC24899a.C24900a(Boolean.valueOf(jSONObject.optBoolean("recursive")), false));
    }
}
