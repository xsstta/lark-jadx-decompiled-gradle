package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.i */
public class C24908i extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() {
        String a = mo87967a("tempFilePath");
        String a2 = mo87967a("filePath");
        AppBrandLogger.m52830i("ApiSaveFileCtrl", "tempFilePath=" + a + " targetFilePath=" + a2);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("current thread:");
        sb2.append(Thread.currentThread().getName());
        AppBrandLogger.m52828d("ApiSaveFileCtrl", sb2.toString());
        String a3 = mo87984f().mo235017a(a, a2, sb);
        AppBrandLogger.m52828d("ApiSaveFileCtrl", "save file result=" + a3);
        if (!TextUtils.isEmpty(a3)) {
            HashMap hashMap = new HashMap();
            hashMap.put("savedFilePath", a3);
            this.f61051e = hashMap;
            return true;
        }
        this.f61050d = sb.toString();
        return false;
    }

    public C24908i(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        this.f61049c.put("tempFilePath", new AbstractC24899a.C24900a(jSONObject.optString("tempFilePath"), true));
        this.f61049c.put("filePath", new AbstractC24899a.C24900a(jSONObject.optString("filePath"), false));
    }
}
