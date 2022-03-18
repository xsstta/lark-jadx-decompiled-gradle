package com.tt.miniapp.net;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12804c;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.errorcode.C66015a;
import com.tt.miniapp.net.C66504b;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.k */
public class C66535k extends AbstractC67550j {

    /* renamed from: a */
    private String f167982a;

    /* renamed from: b */
    private String f167983b;

    /* renamed from: c */
    private String f167984c;

    /* renamed from: d */
    private String f167985d;

    /* renamed from: e */
    private String f167986e;

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "createUploadTask";
    }

    public C66535k(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    /* renamed from: a */
    private String m259955a(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uploadTaskId", i);
        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "createUploadTask:ok");
        return jSONObject.toString();
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        AppBrandLogger.m52830i("tma_UploadRequestImpl", "upload task invoke string .....");
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f167982a = jSONObject.optString("url");
            this.f167983b = jSONObject.optString("header");
            this.f167984c = jSONObject.optString("filePath");
            this.f167985d = jSONObject.optString("name");
            this.f167986e = jSONObject.optString("formData");
            int a = C12804c.m52892a();
            if (TextUtils.isEmpty(this.f167982a)) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("uploadTaskId", a);
                        jSONObject2.put("state", "fail");
                        C66015a.m258507a(jSONObject2, ApiCode.UPLOADFILE_INVALID_URL);
                        aVar.onNativeModuleCall(jSONObject2.toString());
                        AppBrandLogger.m52829e("tma_UploadRequestImpl", "createUploadTask failed:url is empty");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return m259955a(a);
            } else if (!C67053q.m261326a("upload", this.f167982a, this.f170359f)) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("uploadTaskId", a);
                        jSONObject3.put("state", "fail");
                        C66015a.m258507a(jSONObject3, ApiCode.UPLOADFILE_INVALID_DOMAIN);
                        aVar.onNativeModuleCall(jSONObject3.toString());
                        AppBrandLogger.m52829e("tma_UploadRequestImpl", "createUploadTask failed:is not safe domain");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return m259955a(a);
            } else if (TextUtils.isEmpty(this.f167985d)) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("uploadTaskId", a);
                        jSONObject4.put("state", "fail");
                        C66015a.m258507a(jSONObject4, ApiCode.UPLOADFILE_NAME_EMPTY);
                        aVar.onNativeModuleCall(jSONObject4.toString());
                        AppBrandLogger.m52829e("tma_UploadRequestImpl", "createUploadTask failed>> file name is empty!");
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                return m259955a(a);
            } else {
                C66504b.m259893a(new C66504b.C66508a(a, this.f167982a, this.f167983b, this.f167984c, this.f167985d, this.f167986e, this.f170359f), aVar, this.f170359f, C12805d.m52894a(AppbrandContext.getInst().getTracing(), true, this.f170359f));
                return m259955a(a);
            }
        } catch (Exception e4) {
            AppBrandLogger.m52829e("tma_UploadRequestImpl", "createUploadTask fail>>>exception:", e4.getMessage());
            return "";
        }
    }
}
