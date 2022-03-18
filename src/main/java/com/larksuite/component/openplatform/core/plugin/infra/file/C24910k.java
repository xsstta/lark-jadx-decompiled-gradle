package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.k */
public class C24910k extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        String a = mo87967a("filePath");
        File file = new File(mo87982d(a));
        if (!mo87973a(file)) {
            AppBrandLogger.m52829e("ApiUnlinkCtrl", "cannot write file, filePath=" + a);
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!file.exists()) {
            AppBrandLogger.m52829e("ApiUnlinkCtrl", "file is not exist, filePath=" + a);
            this.f61050d = mo87975b(a);
            return false;
        } else if (file.isFile()) {
            return file.delete();
        } else {
            AppBrandLogger.m52829e("ApiUnlinkCtrl", "it's not a file, filePath=" + a);
            this.f61050d = mo87969a("operation not permitted, %s %s", this.f61047a, a);
            return false;
        }
    }

    public C24910k(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        this.f61049c.put("filePath", new AbstractC24899a.C24900a(new JSONObject(str).optString("filePath"), true));
    }
}
