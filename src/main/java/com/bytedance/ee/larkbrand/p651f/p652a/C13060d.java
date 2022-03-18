package com.bytedance.ee.larkbrand.p651f.p652a;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12804c;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.network.p633e.C12836c;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.net.C66522i;
import com.tt.miniapp.net.C66528j;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3325a.C66705d;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.DebugUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.f.a.d */
public class C13060d extends AbstractC67550j {

    /* renamed from: a */
    private String f34708a;

    /* renamed from: b */
    private String f34709b;

    /* renamed from: c */
    private String f34710c;

    /* renamed from: d */
    private String f34711d;

    /* renamed from: e */
    private String f34712e;

    /* renamed from: g */
    private String f34713g;

    /* renamed from: h */
    private byte[] f34714h;

    /* renamed from: i */
    private boolean f34715i;

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "createRequestTask";
    }

    /* renamed from: b */
    public boolean mo49106b() {
        return false;
    }

    public C13060d(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    /* renamed from: b */
    private IApiOutputParam m53561b(int i) {
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
    private String m53560a(int i) {
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
    public String mo49104a(String str, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject(str);
        this.f34714h = null;
        this.f34708a = jSONObject2.optString("url");
        String optString = jSONObject2.optString("method", "GET");
        this.f34709b = optString;
        if (TextUtils.isEmpty(optString)) {
            this.f34709b = "POST";
        }
        this.f34712e = jSONObject2.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f34713g = jSONObject2.optString("header");
        this.f34710c = jSONObject2.optString("dataType", "json");
        this.f34711d = jSONObject2.optString("responseType", "text");
        JSONArray optJSONArray = jSONObject2.optJSONArray("__nativeBuffers__");
        if (!(optJSONArray == null || (jSONObject = optJSONArray.getJSONObject(0)) == null)) {
            String optString2 = jSONObject.optString("key");
            String string = jSONObject.getString("base64");
            if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(string)) {
                this.f34714h = Base64.decode(string.getBytes(), 0);
            }
        }
        AppBrandLogger.m52828d("tma_RequestImpl", "url = ", this.f34708a, " mMethod ", this.f34709b, " mHeader ", this.f34713g, "mData ", this.f34712e, "mBuffer ", this.f34714h);
        int a = C12804c.m52892a();
        if (!TextUtils.equals(this.f34709b, "GET") && !TextUtils.equals(this.f34709b, "POST") && !TextUtils.equals(this.f34709b, "DELETE") && !TextUtils.equals(this.f34709b, "CONNECT") && !TextUtils.equals(this.f34709b, "HEAD") && !TextUtils.equals(this.f34709b, "OPTIONS") && !TextUtils.equals(this.f34709b, "PUT") && !TextUtils.equals(this.f34709b, "TRACE")) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("state", "fail");
                jSONObject3.put("requestTaskId", a);
                jSONObject3.put(ApiHandler.API_CALLBACK_ERRMSG, "method is invalid");
                if (aVar != null) {
                    aVar.onNativeModuleCall(jSONObject3.toString());
                }
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e.getStackTrace());
            }
            return m53560a(a);
        } else if (TextUtils.isEmpty(this.f34708a) || mo49106b() || C67053q.m261326a("request", this.f34708a, this.f170359f)) {
            C13051a.m53536a(this.f170359f).mo49089a(a, new C66522i.C66526b(a, this.f34708a, this.f34709b, this.f34712e, this.f34714h, this.f34713g, this.f34710c, this.f34711d), aVar);
            return m53560a(a);
        } else {
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("state", "fail");
                jSONObject4.put("requestTaskId", a);
                jSONObject4.put(ApiHandler.API_CALLBACK_ERRMSG, "url is not valid domain, url == " + this.f34708a);
                if (aVar != null) {
                    aVar.onNativeModuleCall(jSONObject4.toString());
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e2.getStackTrace());
            }
            return m53560a(a);
        }
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public IApiOutputParam mo49105a(IApiInputParam iApiInputParam, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        String str;
        String str2;
        C66705d.C66706a.C66707a aVar2;
        AppBrandLogger.m52830i("tma_RequestImpl", "LarkRequestModule invoke ........");
        C66705d.C66706a aVar3 = (C66705d.C66706a) iApiInputParam;
        this.f34714h = null;
        this.f34708a = aVar3.f168389a;
        String str3 = aVar3.f168390b;
        this.f34709b = str3;
        if (TextUtils.equals(str3, "undefined")) {
            this.f34709b = "GET";
        } else if (TextUtils.isEmpty(this.f34709b)) {
            this.f34709b = "POST";
        }
        this.f34712e = aVar3.f168391c;
        this.f34713g = aVar3.f168393e;
        this.f34715i = aVar3.f168392d;
        if (C66718d.m260519a(aVar3.f168394f)) {
            str = "json";
        } else {
            str = aVar3.f168394f;
        }
        this.f34710c = str;
        if (C66718d.m260519a(aVar3.f168395g)) {
            str2 = "text";
        } else {
            str2 = aVar3.f168395g;
        }
        this.f34711d = str2;
        List<C66705d.C66706a.C66707a> list = aVar3.f168396h;
        if (!(list == null || (aVar2 = list.get(0)) == null)) {
            this.f34714h = aVar2.f168398b;
        }
        if (DebugUtil.debug()) {
            AppBrandLogger.m52828d("tma_RequestImpl", "url = ", this.f34708a, " mMethod ", this.f34709b, " mHeader ", this.f34713g, "mData ", this.f34712e, "mBuffer ", this.f34714h);
        } else {
            AppBrandLogger.m52830i("tma_RequestImpl", "url = ", C67019aa.m261223a(this.f34708a), " mMethod ", this.f34709b);
        }
        int a = C12804c.m52892a();
        OPTrace a2 = C12805d.m52894a(AppbrandContext.getInst().getTracing(), true, this.f170359f);
        C12836c.m53009a(this.f34709b, this.f34708a, a2, this.f34715i, this.f170359f);
        if (!TextUtils.equals(this.f34709b, "GET") && !TextUtils.equals(this.f34709b, "POST") && !TextUtils.equals(this.f34709b, "DELETE") && !TextUtils.equals(this.f34709b, "CONNECT") && !TextUtils.equals(this.f34709b, "HEAD") && !TextUtils.equals(this.f34709b, "OPTIONS") && !TextUtils.equals(this.f34709b, "PUT") && !TextUtils.equals(this.f34709b, "TRACE")) {
            C66705d.C66708b bVar = new C66705d.C66708b();
            bVar.f168400b = "fail";
            bVar.f168399a = a;
            bVar.f168401c = ApiCode.REQUEST_INVALID_METHOD.msg;
            bVar.f168402d = Integer.valueOf(ApiCode.REQUEST_INVALID_METHOD.code);
            bVar.f168405g = a2;
            if (aVar != null) {
                try {
                    aVar.onNativeModuleCall(bVar);
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_RequestImpl", e.getStackTrace());
                }
            }
            AppBrandLogger.m52829e("tma_RequestImpl", "http method is invalid! taskId:", Integer.valueOf(a));
            return m53561b(a);
        } else if (TextUtils.isEmpty(this.f34708a)) {
            try {
                C66705d.C66708b bVar2 = new C66705d.C66708b();
                bVar2.f168400b = "fail";
                bVar2.f168399a = a;
                bVar2.f168401c = ApiCode.REQUEST_INVALID_URL.msg;
                bVar2.f168402d = Integer.valueOf(ApiCode.REQUEST_INVALID_URL.code);
                bVar2.f168405g = a2;
                if (aVar != null) {
                    aVar.onNativeModuleCall(bVar2);
                }
                AppBrandLogger.m52829e("tma_RequestImpl", "url is empty!", "taskId:", Integer.valueOf(a));
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e2.getStackTrace());
            }
            return m53561b(a);
        } else if (mo49106b() || C67053q.m261326a("request", this.f34708a, this.f170359f)) {
            C13055b.m53547a(this.f170359f).mo49097a(a, new C66528j.C66533b(a, this.f34708a, this.f34709b, this.f34715i, this.f34712e, this.f34714h, this.f34713g, this.f34710c, this.f34711d), aVar, a2);
            return m53561b(a);
        } else {
            try {
                C66705d.C66708b bVar3 = new C66705d.C66708b();
                bVar3.f168400b = "fail";
                bVar3.f168399a = a;
                bVar3.f168401c = "url is not valid domain, url == " + this.f34708a;
                bVar3.f168402d = Integer.valueOf(ApiCode.REQUEST_INVALID_DOMAIN.code);
                bVar3.f168405g = a2;
                if (aVar != null) {
                    aVar.onNativeModuleCall(bVar3);
                }
                AppBrandLogger.m52829e("tma_RequestImpl", "url is not valid domain, url ==", C67019aa.m261223a(this.f34708a), " taskId:", Integer.valueOf(a));
            } catch (Exception e3) {
                AppBrandLogger.stacktrace(6, "tma_RequestImpl", e3.getStackTrace());
            }
            return m53561b(a);
        }
    }
}
