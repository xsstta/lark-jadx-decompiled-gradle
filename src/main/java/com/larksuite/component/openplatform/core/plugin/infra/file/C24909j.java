package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.j */
public class C24909j extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        String a = mo87967a("path");
        AppBrandLogger.m52830i("ApiStatCtrl", "handleInvoke apiName=" + this.f61047a + " path=" + a);
        File file = new File(mo87982d(a));
        if (!mo87977b(file)) {
            AppBrandLogger.m52830i("ApiStatCtrl", "the file cannot be read, path=" + a);
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!file.exists()) {
            AppBrandLogger.m52830i("ApiStatCtrl", "the file is not exist, path=" + a);
            this.f61050d = mo87975b(a);
            return false;
        } else {
            Stats fileStats = Stats.getFileStats(mo87982d(a));
            if (fileStats != null) {
                this.f61051e = new HashMap();
                this.f61051e.put("stat", fileStats.toJson());
                return true;
            }
            AppBrandLogger.m52830i("ApiStatCtrl", "the file stats is null, path=" + a);
            this.f61050d = mo87969a("get stat fail %s", a);
            return false;
        }
    }

    public C24909j(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        this.f61049c.put("path", new AbstractC24899a.C24900a(new JSONObject(str).optString("path"), true));
    }
}
