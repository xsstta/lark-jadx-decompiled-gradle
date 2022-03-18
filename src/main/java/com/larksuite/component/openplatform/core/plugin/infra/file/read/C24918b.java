package com.larksuite.component.openplatform.core.plugin.infra.file.read;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a;
import com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24901b;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67070z;
import java.io.File;
import java.util.HashMap;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.read.b */
public class C24918b extends AbstractC24901b {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.openplatform.core.plugin.infra.file.AbstractC24899a
    /* renamed from: b */
    public boolean mo87976b() throws Exception {
        String a = mo87967a("filePath");
        String a2 = mo87967a("encoding");
        AppBrandLogger.m52830i("ApiReadFileCtrl", "ApiReadFileCtrl handleInvoke apiName=" + this.f61047a + " filePath=" + a + " encoding=" + a2);
        File file = new File(mo87982d(a));
        if (TextUtils.isEmpty(a)) {
            AppBrandLogger.m52829e("ApiReadFileCtrl", "filePath is empty!");
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (!mo87977b(file)) {
            AppBrandLogger.m52829e("ApiReadFileCtrl", "file cannot be read and filePath=" + a);
            this.f61050d = mo87970a(this.f61047a, a);
            return false;
        } else if (file.exists() || StreamLoader.loadByteFromStream(a, mo87965a()) != null) {
            this.f61051e = new HashMap();
            if (!file.exists()) {
                byte[] loadByteFromStream = StreamLoader.loadByteFromStream(a, mo87965a());
                if (loadByteFromStream == null) {
                    return false;
                }
                if (TextUtils.isEmpty(a2) || a2.equals("null")) {
                    AppBrandLogger.m52830i("ApiReadFileCtrl", "read stream without encode");
                    String base64 = ByteString.of(loadByteFromStream, 0, loadByteFromStream.length).base64();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    jSONObject.put("base64", base64);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    this.f61051e.put("__nativeBuffers__", jSONArray);
                    return true;
                }
                AppBrandLogger.m52830i("ApiReadFileCtrl", "read stream with encode");
                this.f61051e.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C67070z.m261390a(loadByteFromStream, a2));
                return true;
            } else if (TextUtils.isEmpty(a2) || "null".equals(a2)) {
                AppBrandLogger.m52830i("ApiReadFileCtrl", "file exist but encoding is not exist, read file with binary.");
                byte[] b = C67070z.m261399b(file.getAbsolutePath());
                String base642 = ByteString.of(b, 0, b.length).base64();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                jSONObject2.put("base64", base642);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject2);
                this.f61051e.put("__nativeBuffers__", jSONArray2);
                return true;
            } else {
                AppBrandLogger.m52830i("ApiReadFileCtrl", "file exist and encoding is valid.");
                this.f61051e.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C67070z.m261389a(file.getAbsolutePath(), a2));
                return true;
            }
        } else {
            AppBrandLogger.m52829e("ApiReadFileCtrl", "file is not exist and filePath=" + a);
            this.f61050d = mo87975b(this.f61047a, a);
            return false;
        }
    }

    public C24918b(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87972a(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        this.f61049c.put("filePath", new AbstractC24899a.C24900a(jSONObject.optString("filePath"), true));
        this.f61049c.put("encoding", new AbstractC24899a.C24900a(jSONObject.optString("encoding"), false));
    }
}
