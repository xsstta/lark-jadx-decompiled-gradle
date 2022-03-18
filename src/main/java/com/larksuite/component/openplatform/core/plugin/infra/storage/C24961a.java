package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.a */
public class C24961a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "base64ToTempFilePath";
    }

    public C24961a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppBrandLogger.m52830i("tma_ApiBase64ToTempFilePathCtrl", "invoke api");
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String a = m90221a(jSONObject.optString("base64Data"));
            try {
                byte[] decode = Base64.decode(a, 0);
                AppBrandLogger.m52830i("tma_ApiBase64ToTempFilePathCtrl", "base-64 convert to bytes success");
                File d = getApiDependency().mo235047d();
                String optString = jSONObject.optString("fileType", "png");
                File file = new File(d, System.currentTimeMillis() + "." + optString);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(decode, 0, decode.length);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (!file.exists()) {
                    callbackFail("save temp file fail");
                    AppBrandLogger.m52830i("tma_ApiBase64ToTempFilePathCtrl", "save temp file fail");
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tempFilePath", getApiDependency().mo235048d(file.getPath()));
                AppBrandLogger.m52830i("tma_ApiBase64ToTempFilePathCtrl", "return success.");
                callbackOk(jSONObject2);
            } catch (Exception e) {
                callbackFail(e);
                AppBrandLogger.m52829e("tma_ApiBase64ToTempFilePathCtrl", "decode base 64 or build bitmap error:" + a, e);
            }
        } catch (JSONException unused) {
            callbackFail("args error");
            AppBrandLogger.m52829e("tma_ApiBase64ToTempFilePathCtrl", "args error:" + this.mArgs);
        }
    }

    /* renamed from: a */
    private String m90221a(String str) {
        if (str.startsWith("data:image/png;base64,") || str.startsWith("data:image/x-icon;base64,") || str.startsWith("data:image/jpg;base64,")) {
            String[] split = str.split(",");
            if (split.length > 1) {
                return split[1];
            }
            AppBrandLogger.m52829e("tma_ApiBase64ToTempFilePathCtrl", "base base-64:" + str);
        }
        return str;
    }

    public C24961a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
