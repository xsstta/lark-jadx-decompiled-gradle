package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.tt.miniapp.streamloader.StreamLoader;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.c */
public class C24902c extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        String a = mo87967a("path");
        AppBrandLogger.m52830i("ApiAccessCtrl", "handleInvoke path=" + a);
        if (TextUtils.isEmpty(a)) {
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        }
        File file = new File(mo87982d(a));
        if (!mo87977b(file)) {
            AppBrandLogger.m52830i("ApiAccessCtrl", "handleInvoke file cannot read");
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (file.exists() || StreamLoader.findFile(a, mo87965a()) != null || StreamLoader.isDirectoryOfPkg(a, mo87965a())) {
            return true;
        } else {
            AppBrandLogger.m52830i("ApiAccessCtrl", "handleInvoke file not exist");
            this.f61050d = mo87975b(this.f61047a, a);
            return false;
        }
    }

    public C24902c(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        this.f61049c.put("path", new AbstractC24899a.C24900a(new JSONObject(str).optString("path"), true));
    }
}
