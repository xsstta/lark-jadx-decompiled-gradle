package com.tt.miniapp.net;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12804c;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.net.C66522i;
import com.tt.miniapp.net.C66528j;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3325a.C66705d;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.net.h */
public class C66521h extends AbstractC67550j {

    /* renamed from: a */
    private String f167908a;

    /* renamed from: b */
    private String f167909b;

    /* renamed from: c */
    private boolean f167910c;

    /* renamed from: d */
    private String f167911d;

    /* renamed from: e */
    private String f167912e;

    /* renamed from: g */
    private String f167913g;

    /* renamed from: h */
    private String f167914h;

    /* renamed from: i */
    private byte[] f167915i;

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "createRequestTask";
    }

    /* renamed from: b */
    public boolean mo232081b() {
        return false;
    }

    public C66521h(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    /* renamed from: b */
    private IApiOutputParam m259926b(int i) {
        try {
            C66705d.C66708b bVar = new C66705d.C66708b();
            bVar.f168399a = i;
            return bVar;
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_RequestImpl", "", e);
            return null;
        }
    }

    /* renamed from: a */
    private String m259925a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestTaskId", i);
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_RequestImpl", "", e);
            return "";
        }
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public IApiOutputParam mo49105a(IApiInputParam iApiInputParam, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        String str;
        String str2;
        C66705d.C66706a.C66707a aVar2;
        AppBrandLogger.m52830i("tma_RequestImpl", "request invoke APIInputParam.....");
        C66705d.C66706a aVar3 = (C66705d.C66706a) iApiInputParam;
        this.f167915i = null;
        this.f167908a = aVar3.f168389a;
        this.f167909b = aVar3.f168390b;
        this.f167910c = aVar3.f168392d;
        if (TextUtils.equals(this.f167909b, "undefined")) {
            this.f167909b = "GET";
        } else if (TextUtils.isEmpty(this.f167909b)) {
            this.f167909b = "POST";
        }
        this.f167913g = aVar3.f168391c;
        this.f167914h = aVar3.f168393e;
        if (C66718d.m260519a(aVar3.f168394f)) {
            str = "json";
        } else {
            str = aVar3.f168394f;
        }
        this.f167911d = str;
        if (C66718d.m260519a(aVar3.f168395g)) {
            str2 = "text";
        } else {
            str2 = aVar3.f168395g;
        }
        this.f167912e = str2;
        List<C66705d.C66706a.C66707a> list = aVar3.f168396h;
        if (!(list == null || (aVar2 = list.get(0)) == null)) {
            this.f167915i = aVar2.f168398b;
        }
        AppBrandLogger.m52828d("tma_RequestImpl", "url = ", this.f167908a, " mMethod ", this.f167909b, " mHeader ", this.f167914h, "mData ", this.f167913g, "mBuffer ", this.f167915i);
        int a = C12804c.m52892a();
        if (!TextUtils.equals(this.f167909b, "GET") && !TextUtils.equals(this.f167909b, "POST") && !TextUtils.equals(this.f167909b, "DELETE") && !TextUtils.equals(this.f167909b, "CONNECT") && !TextUtils.equals(this.f167909b, "HEAD") && !TextUtils.equals(this.f167909b, "OPTIONS") && !TextUtils.equals(this.f167909b, "PUT") && !TextUtils.equals(this.f167909b, "TRACE")) {
            C66705d.C66708b bVar = new C66705d.C66708b();
            bVar.f168400b = "fail";
            bVar.f168399a = a;
            bVar.f168401c = "http method is invalid";
            if (aVar != null) {
                try {
                    aVar.onNativeModuleCall(bVar);
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_RequestImpl", e.getStackTrace());
                }
            }
            AppBrandLogger.m52830i("tma_RequestImpl", "http method is invalid!");
            return m259926b(a);
        } else if (TextUtils.isEmpty(this.f167908a)) {
            try {
                C66705d.C66708b bVar2 = new C66705d.C66708b();
                bVar2.f168400b = "fail";
                bVar2.f168399a = a;
                bVar2.f168401c = "url is empty!";
                if (aVar != null) {
                    aVar.onNativeModuleCall(bVar2);
                }
                AppBrandLogger.m52830i("tma_RequestImpl", "url is empty!");
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e2.getStackTrace());
            }
            return m259926b(a);
        } else if (mo232081b() || C67053q.m261326a("request", this.f167908a, this.f170359f)) {
            C66528j.m259943a(this.f170359f).mo232095a(a, new C66528j.C66533b(a, this.f167908a, this.f167909b, this.f167910c, this.f167913g, this.f167915i, this.f167914h, this.f167911d, this.f167912e), aVar);
            return m259926b(a);
        } else {
            try {
                C66705d.C66708b bVar3 = new C66705d.C66708b();
                bVar3.f168400b = "fail";
                bVar3.f168399a = a;
                bVar3.f168401c = "url is not valid domain, url == " + this.f167908a;
                if (aVar != null) {
                    aVar.onNativeModuleCall(bVar3);
                }
                AppBrandLogger.m52830i("tma_RequestImpl", "url is not valid domain, url == " + C67019aa.m261223a(this.f167908a));
            } catch (Exception e3) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e3.getStackTrace());
            }
            return m259926b(a);
        }
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        JSONObject jSONObject;
        AppBrandLogger.m52830i("tma_RequestImpl", "request invoke string .........");
        JSONObject jSONObject2 = new JSONObject(str);
        this.f167915i = null;
        this.f167908a = jSONObject2.optString("url");
        String optString = jSONObject2.optString("method", "GET");
        this.f167909b = optString;
        if (TextUtils.isEmpty(optString)) {
            this.f167909b = "POST";
        }
        this.f167913g = jSONObject2.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f167914h = jSONObject2.optString("header");
        this.f167911d = jSONObject2.optString("dataType", "json");
        this.f167912e = jSONObject2.optString("responseType", "text");
        JSONArray optJSONArray = jSONObject2.optJSONArray("__nativeBuffers__");
        if (!(optJSONArray == null || (jSONObject = optJSONArray.getJSONObject(0)) == null)) {
            String optString2 = jSONObject.optString("key");
            String string = jSONObject.getString("base64");
            if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(string)) {
                this.f167915i = Base64.decode(string.getBytes(), 0);
            }
        }
        AppBrandLogger.m52828d("tma_RequestImpl", "url = ", this.f167908a, " mMethod ", this.f167909b, " mHeader ", this.f167914h, "mData ", this.f167913g, "mBuffer ", this.f167915i);
        int a = C12804c.m52892a();
        if (!TextUtils.equals(this.f167909b, "GET") && !TextUtils.equals(this.f167909b, "POST") && !TextUtils.equals(this.f167909b, "DELETE") && !TextUtils.equals(this.f167909b, "CONNECT") && !TextUtils.equals(this.f167909b, "HEAD") && !TextUtils.equals(this.f167909b, "OPTIONS") && !TextUtils.equals(this.f167909b, "PUT") && !TextUtils.equals(this.f167909b, "TRACE")) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("state", "fail");
                jSONObject3.put("requestTaskId", a);
                jSONObject3.put(ApiHandler.API_CALLBACK_ERRMSG, "http method is invalid");
                if (aVar != null) {
                    aVar.onNativeModuleCall(jSONObject3.toString());
                }
                AppBrandLogger.m52829e("tma_RequestImpl", "http method is invalid");
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e.getStackTrace());
            }
            return m259925a(a);
        } else if (TextUtils.isEmpty(this.f167908a)) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("state", "fail");
                jSONObject4.put("requestTaskId", a);
                jSONObject4.put(ApiHandler.API_CALLBACK_ERRMSG, "url is empty!");
                if (aVar != null) {
                    aVar.onNativeModuleCall(jSONObject4.toString());
                }
                AppBrandLogger.m52830i("tma_RequestImpl", "url is empty!");
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e2.getStackTrace());
            }
            return m259925a(a);
        } else if (mo232081b() || C67053q.m261326a("request", this.f167908a, this.f170359f)) {
            C66522i.m259931a(this.f170359f).mo232086a(a, new C66522i.C66526b(a, this.f167908a, this.f167909b, this.f167913g, this.f167915i, this.f167914h, this.f167911d, this.f167912e), aVar);
            return m259925a(a);
        } else {
            try {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("state", "fail");
                jSONObject5.put("requestTaskId", a);
                jSONObject5.put(ApiHandler.API_CALLBACK_ERRMSG, "url is not valid domain, url == " + this.f167908a);
                if (aVar != null) {
                    aVar.onNativeModuleCall(jSONObject5.toString());
                }
                AppBrandLogger.m52830i("tma_RequestImpl", "url is not valid domain, url == " + C67019aa.m261223a(this.f167908a));
            } catch (Exception e3) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e3.getStackTrace());
            }
            return m259925a(a);
        }
    }
}
