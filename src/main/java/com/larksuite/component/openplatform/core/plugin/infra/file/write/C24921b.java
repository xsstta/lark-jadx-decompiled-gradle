package com.larksuite.component.openplatform.core.plugin.infra.file.write;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24901b;
import com.tt.miniapp.util.C67070z;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.write.b */
public class C24921b extends AbstractC24901b {

    /* renamed from: g */
    private String f61061g;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() throws Exception {
        String a = mo87967a("filePath");
        String a2 = mo87967a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        String a3 = mo87967a("encoding");
        File file = new File(mo87982d(a));
        AppBrandLogger.m52828d("ApiWriteFileCtrl", "filePath ", a, " \n data ", a2, " \n encoding ", a3);
        if (!mo87973a(file)) {
            AppBrandLogger.m52830i("ApiWriteFileCtrl", "the file cannot be write, filePath=" + a);
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!file.getParentFile().exists()) {
            AppBrandLogger.m52830i("ApiWriteFileCtrl", "the parent is not exist, filePath=" + a);
            this.f61050d = mo87975b(this.f61047a, a);
            return false;
        } else {
            String str = this.f61061g;
            if (str != null) {
                if (mo87984f().mo235031a((long) str.getBytes().length)) {
                    AppBrandLogger.m52830i("ApiWriteFileCtrl", "buffer data is not null, user dir saved file size limit exceeded");
                    this.f61050d = "user dir saved file size limit exceeded";
                    return false;
                }
                C67070z.m261394a(file.getAbsolutePath(), str, "base64");
                return true;
            } else if (TextUtils.isEmpty(a2) || a2.getBytes() == null) {
                AppBrandLogger.m52830i("ApiWriteFileCtrl", "data and nativeBuffer is empty");
                return true;
            } else {
                if (mo87984f().mo235031a((long) a2.getBytes().length)) {
                    AppBrandLogger.m52830i("ApiWriteFileCtrl", "data is not null, user dir saved file size limit exceeded");
                    this.f61050d = "user dir saved file size limit exceeded";
                    return false;
                }
                C67070z.m261394a(file.getAbsolutePath(), a2, a3);
                return true;
            }
        }
    }

    public C24921b(String str) {
        super(str);
    }

    /* renamed from: a */
    private String m90159a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (TextUtils.equals(jSONObject.optString("key"), Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    return jSONObject.optString("base64");
                }
            }
            return null;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiWriteFileCtrl", e.getStackTrace());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        this.f61049c.put("filePath", new AbstractC24899a.C24900a(jSONObject.optString("filePath"), true));
        this.f61049c.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new AbstractC24899a.C24900a(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), false));
        this.f61049c.put("encoding", new AbstractC24899a.C24900a(jSONObject.optString("encoding", "utf-8"), false));
        if (jSONObject.has("__nativeBuffers__")) {
            this.f61061g = m90159a(jSONObject.optJSONArray("__nativeBuffers__"));
        }
    }
}
