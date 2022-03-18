package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.tt.miniapp.streamloader.StreamLoader;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.l */
public class C24911l extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() throws Exception {
        String a = mo87967a("zipFilePath");
        String a2 = mo87967a("targetPath");
        AppBrandLogger.m52830i("ApiUnzipCtrl", "handleInvoke zipFilePath=" + a + " targetPath=" + a2);
        File file = new File(mo87982d(a));
        File file2 = new File(mo87982d(a2));
        if (!file2.exists()) {
            file2.mkdirs();
        }
        StreamLoader.waitExtractFinishIfNeeded(a, this.f61052f);
        if (!mo87977b(file)) {
            AppBrandLogger.m52830i("ApiUnzipCtrl", "zip file cannot be read, zipFilePath=" + a);
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!mo87973a(file2)) {
            AppBrandLogger.m52830i("ApiUnzipCtrl", "targetFile cannot be write, targetFile=" + file2);
            this.f61050d = mo87970a(this.f61047a, a2);
            return false;
        } else if (!file.exists() || !file.isFile() || !file2.exists()) {
            AppBrandLogger.m52830i("ApiUnzipCtrl", "zipFile exist=" + file.exists() + ", targetFile exist=" + file2.exists() + ", zipFile is file ?= " + file.isFile());
            this.f61050d = mo87975b(this.f61047a, a, a2);
            return false;
        } else {
            if (mo87984f().mo235031a(IOUtils.getZipTrueSize(file.getAbsolutePath()))) {
                AppBrandLogger.m52830i("ApiUnzipCtrl", "user dir saved file size limit exceeded");
                this.f61050d = "user dir saved file size limit exceeded";
                return false;
            }
            try {
                IOUtils.unZipFolder(file.getAbsolutePath(), file2.getAbsolutePath(), true);
                return true;
            } catch (Exception e) {
                AppBrandLogger.m52829e("ApiUnzipCtrl", e);
                throw e;
            }
        }
    }

    public C24911l(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        this.f61049c.put("zipFilePath", new AbstractC24899a.C24900a(jSONObject.optString("zipFilePath"), true));
        this.f61049c.put("targetPath", new AbstractC24899a.C24900a(jSONObject.optString("targetPath"), false));
    }
}
