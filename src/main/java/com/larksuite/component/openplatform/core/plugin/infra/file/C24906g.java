package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.g */
public class C24906g extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        String a = mo87967a("oldPath");
        String a2 = mo87967a("newPath");
        AppBrandLogger.m52830i("ApiRenameCtrl", "oldPath=" + a + " newPath=" + a2);
        File file = new File(mo87982d(a));
        File file2 = new File(mo87982d(a2));
        if (!mo87977b(file) || !mo87973a(file2)) {
            AppBrandLogger.m52830i("ApiRenameCtrl", "file permission is wrong");
            this.f61050d = mo87970a(this.f61047a, a, a2);
            return false;
        } else if (!file.exists() || !file2.getParentFile().exists()) {
            AppBrandLogger.m52830i("ApiRenameCtrl", "file not exists");
            this.f61050d = mo87975b(this.f61047a, a, a2);
            return false;
        } else {
            boolean renameTo = file.renameTo(file2);
            if (!renameTo) {
                AppBrandLogger.m52830i("ApiRenameCtrl", "file rename failed");
                this.f61050d = mo87970a(this.f61047a, a, a2);
            }
            return renameTo;
        }
    }

    public C24906g(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        this.f61049c.put("oldPath", new AbstractC24899a.C24900a(jSONObject.optString("oldPath"), true));
        this.f61049c.put("newPath", new AbstractC24899a.C24900a(jSONObject.optString("newPath"), true));
    }
}
