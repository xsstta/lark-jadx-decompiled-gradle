package com.tt.remotedebug.p3437a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3324r.p3325a.C66695a;
import com.tt.miniapp.p3324r.p3325a.C66698b;
import com.tt.miniapp.p3324r.p3325a.C66701c;
import com.tt.miniapp.p3324r.p3325a.C66705d;
import com.tt.miniapp.p3324r.p3325a.C66709e;
import com.tt.miniapp.p3324r.p3325a.C66712f;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.remotedebug.a.a */
public class C67951a extends C66718d {
    /* renamed from: a */
    public static IApiInputParam m264520a(String str, JSONObject jSONObject) {
        if (TextUtils.equals("writeFile", str) || TextUtils.equals("writeFileSync", str)) {
            return new C66709e.C66710a(jSONObject.optString("filePath"), jSONObject.optString("encoding"), jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), null);
        } else if (TextUtils.equals("readFile", str) || TextUtils.equals("readFileSync", str)) {
            return new C66701c.C66702a(jSONObject.optString("filePath"), jSONObject.optString("encoding"));
        } else {
            if (TextUtils.equals("createRequestTask", str)) {
                String optString = jSONObject.optString("url");
                String optString2 = jSONObject.optString("method");
                String optString3 = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                boolean optBoolean = jSONObject.optBoolean("usePrefetchCache");
                JSONArray optJSONArray = jSONObject.optJSONArray("header2");
                JSONObject jSONObject2 = new JSONObject();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
                        if (optJSONArray2 != null) {
                            try {
                                jSONObject2.put(optJSONArray2.optString(0), optJSONArray2.optString(1));
                            } catch (Exception e) {
                                AppBrandLogger.m52829e("VscApiParamParser", e);
                            }
                        }
                    }
                }
                return new C66705d.C66706a(optString, optString2, optBoolean, optString3, jSONObject2.toString(), jSONObject.optString("dataType"), jSONObject.optString("responseType"), null);
            } else if (TextUtils.equals("createSocketTask", str)) {
                String optString4 = jSONObject.optString("url");
                String optString5 = jSONObject.optString("method");
                boolean optBoolean2 = jSONObject.optBoolean("__skipDomainCheck__");
                JSONArray optJSONArray3 = jSONObject.optJSONArray("header2");
                JSONObject jSONObject3 = new JSONObject();
                if (optJSONArray3 != null) {
                    int length2 = optJSONArray3.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i2);
                        if (optJSONArray4 != null) {
                            try {
                                jSONObject3.put(optJSONArray4.optString(0), optJSONArray4.optString(1));
                            } catch (Exception e2) {
                                AppBrandLogger.m52829e("VscApiParamParser", e2);
                            }
                        }
                    }
                }
                return new C66695a.C66696a(optString4, optString5, jSONObject3, jSONObject.optJSONArray("protocols"), optBoolean2);
            } else if (!TextUtils.equals("operateSocketTask", str)) {
                return null;
            } else {
                String optString6 = jSONObject.optString("operationType");
                String optString7 = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                return new C66698b.C66699a(optString6, jSONObject.optInt("socketTaskId"), optString7, null, jSONObject.optInt("code"), jSONObject.optString("reason"));
            }
        }
    }

    /* renamed from: a */
    static JSONObject m264521a(String str, IApiOutputParam iApiOutputParam) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (iApiOutputParam == null) {
            return jSONObject;
        }
        try {
            if (TextUtils.equals("readFile", str) || TextUtils.equals("readFileSync", str)) {
                C66701c.C66703b bVar = (C66701c.C66703b) iApiOutputParam;
                List<C66701c.C66703b.C66704a> list = bVar.f168386c;
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, bVar.f168384a);
                if (!TextUtils.isEmpty(bVar.f168385b)) {
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bVar.f168385b);
                }
            } else if (TextUtils.equals("writeFile", str) || TextUtils.equals("writeFileSync", str)) {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, ((C66709e.C66711b) iApiOutputParam).f168414a);
            } else if (TextUtils.equals("createRequestTask", str) || TextUtils.equals("onRequestTaskStateChange", str)) {
                C66705d.C66708b bVar2 = (C66705d.C66708b) iApiOutputParam;
                if (!TextUtils.isEmpty(bVar2.f168401c)) {
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, bVar2.f168401c);
                }
                if (!TextUtils.isEmpty(bVar2.f168404f)) {
                    jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, bVar2.f168404f);
                }
                if (!TextUtils.isEmpty(bVar2.f168400b)) {
                    jSONObject.put("state", bVar2.f168400b);
                }
                if (bVar2.f168406h != -1) {
                    if (bVar2.f168406h == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject.put("isPrefetch", z);
                }
                if (bVar2.f168403e != null) {
                    jSONObject.put("header", bVar2.f168403e);
                }
                if (!TextUtils.isEmpty(bVar2.f168408j)) {
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bVar2.f168408j);
                }
                List<C66701c.C66703b.C66704a> list2 = bVar2.f168407i;
                if (bVar2.f168399a > 0) {
                    jSONObject.put("requestTaskId", bVar2.f168399a);
                }
            } else if (TextUtils.equals("operateSocketTask", str)) {
                C66698b.C66700b bVar3 = (C66698b.C66700b) iApiOutputParam;
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, bVar3.f168374a);
                if (!TextUtils.isEmpty(bVar3.f168376c)) {
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRSTACK, bVar3.f168376c);
                }
            } else if (TextUtils.equals("onSocketTaskStateChange", str)) {
                C66698b.C66700b bVar4 = (C66698b.C66700b) iApiOutputParam;
                if (!TextUtils.isEmpty(bVar4.f168374a)) {
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, bVar4.f168374a);
                }
                if (!TextUtils.isEmpty(bVar4.f168380g)) {
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bVar4.f168380g);
                }
                if (!TextUtils.isEmpty(bVar4.f168378e)) {
                    jSONObject.put("state", bVar4.f168378e);
                }
                if (!TextUtils.isEmpty(bVar4.f168379f)) {
                    jSONObject.put("header", bVar4.f168379f);
                }
                if (bVar4.f168377d > 0) {
                    jSONObject.put("socketTaskId", bVar4.f168377d);
                }
                List<C66712f> list3 = bVar4.f168381h;
            } else if (TextUtils.equals("createSocketTask", str)) {
                C66695a.C66697b bVar5 = (C66695a.C66697b) iApiOutputParam;
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, bVar5.f168366b);
                jSONObject.put("socketTaskId", bVar5.f168365a);
            }
            return jSONObject;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("VscApiParamParser", "JsonError", e);
            return jSONObject;
        }
    }
}
