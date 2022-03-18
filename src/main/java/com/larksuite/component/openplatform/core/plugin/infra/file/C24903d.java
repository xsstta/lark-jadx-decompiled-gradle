package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.d */
public class C24903d extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        boolean z;
        boolean z2;
        String a = mo87967a("srcPath");
        String a2 = mo87967a("destPath");
        AppBrandLogger.m52830i("ApiCopyFileCtrl", "handleInvoke srcPath=" + a + " destPath=" + a2);
        File file = new File(mo87982d(a));
        File file2 = new File(mo87982d(a2));
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
            this.f61050d = mo87970a(this.f61047a, a, a2);
            return false;
        } else if (!mo87977b(file) || !mo87973a(file2)) {
            AppBrandLogger.m52830i("ApiCopyFileCtrl", "handleInvoke files permission deny");
            this.f61050d = mo87970a(this.f61047a, a, a2);
            return false;
        } else {
            TTAPkgFile findFile = StreamLoader.findFile(a, mo87965a());
            if ((findFile == null && !file.exists()) || !file2.getParentFile().exists()) {
                AppBrandLogger.m52830i("ApiCopyFileCtrl", "handleInvoke files not exist");
                this.f61050d = mo87975b(this.f61047a, a, a2);
                return false;
            } else if ((findFile == null || !mo87984f().mo235031a((long) findFile.getSize())) && (!file.exists() || !mo87984f().mo235031a(file.length()))) {
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("handleInvoke srcFileExist=");
                sb.append(file.exists());
                sb.append(" srcTTTileExist=");
                if (findFile != null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("ApiCopyFileCtrl", objArr);
                if (file.exists()) {
                    IOUtils.copyFile(file, file2, false);
                    z2 = true;
                } else if (findFile != null) {
                    z2 = StreamLoader.extractToFile(a, file2.getParent(), file2.getName(), mo87965a());
                } else {
                    z2 = false;
                }
                AppBrandLogger.m52830i("ApiCopyFileCtrl", "handleInvoke success=" + z2);
                return z2;
            } else {
                AppBrandLogger.m52830i("ApiCopyFileCtrl", "handleInvoke user dir over limit");
                this.f61050d = "user dir saved file size limit exceeded";
                return false;
            }
        }
    }

    public C24903d(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        this.f61049c.put("srcPath", new AbstractC24899a.C24900a(jSONObject.optString("srcPath"), true));
        this.f61049c.put("destPath", new AbstractC24899a.C24900a(jSONObject.optString("destPath"), true));
    }
}
