package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.e */
public class C24904e extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        String a = mo87967a("dirPath");
        boolean b = mo87978b("recursive");
        AppBrandLogger.m52830i("ApiMkDirCtrl", "handleInvoke dirPath=" + a + " recursive=" + b);
        File file = new File(mo87982d(a));
        if (!mo87973a(file)) {
            AppBrandLogger.m52830i("ApiMkDirCtrl", "handleInvoke file cannot write");
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (file.exists()) {
            AppBrandLogger.m52830i("ApiMkDirCtrl", "handleInvoke file exist");
            this.f61050d = mo87969a("file already exists, %s %s", this.f61047a, a);
            return false;
        } else if (b || file.getParentFile().exists()) {
            return file.mkdirs();
        } else {
            AppBrandLogger.m52830i("ApiMkDirCtrl", "handleInvoke parent not exist");
            this.f61050d = mo87975b(this.f61047a, a);
            return false;
        }
    }

    public C24904e(String str) {
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
