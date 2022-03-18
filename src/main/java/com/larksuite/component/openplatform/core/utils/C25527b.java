package com.larksuite.component.openplatform.core.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.lark.falcon.engine.bridge.NativeHostObject;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.falcon.p3285a.AbstractC66046a;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.p3324r.C66717c;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.p3400a.p3401a.p3402a.C67704c;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.utils.b */
public class C25527b {
    /* renamed from: a */
    private static void m91123a(String str, Object obj, C66717c cVar, AbstractC66047b bVar) {
        if (obj instanceof String) {
            bVar.set(str, (String) obj);
        } else if (obj instanceof Boolean) {
            bVar.set(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            bVar.set(str, ((Integer) obj).intValue());
        } else if (obj instanceof Double) {
            bVar.set(str, ((Double) obj).doubleValue());
        } else if (obj instanceof JSONObject) {
            bVar.set(str, m91121a((JSONObject) obj, cVar));
        }
    }

    /* renamed from: a */
    public static LKBasePluginResult.AbstractC25940a.C25941a<ByteBuffer> m91118a(C66717c cVar) {
        AbstractC66046a d;
        AbstractC66047b bVar;
        T t;
        if (cVar == null || (d = cVar.mo231150d("__nativeBuffers__")) == null || (bVar = (AbstractC66047b) cVar.mo231145a(d, 0, AbstractC66047b.class)) == null || (t = (T) ((ByteBuffer) cVar.mo231146a(bVar, "value", ByteBuffer.class))) == null) {
            return null;
        }
        LKBasePluginResult.AbstractC25940a.C25941a<ByteBuffer> aVar = new LKBasePluginResult.AbstractC25940a.C25941a<>();
        aVar.f64248a = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
        aVar.f64249b = t;
        String string = bVar.getString("base64");
        if (!TextUtils.isEmpty(string) && !"undefined".equals(string)) {
            aVar.f64250c = string;
        }
        return aVar;
    }

    /* renamed from: a */
    public static LKBasePluginResult.AbstractC25940a.C25941a<ByteBuffer> m91119a(C67704c cVar) {
        JSONArray jSONArray;
        JSONObject optJSONObject;
        LKBasePluginResult.AbstractC25940a.C25941a<ByteBuffer> aVar = null;
        if (!(cVar == null || (jSONArray = (JSONArray) cVar.mo234997a("__nativeBuffers__")) == null || (optJSONObject = jSONArray.optJSONObject(0)) == null)) {
            String optString = optJSONObject.optString("base64", null);
            aVar = new LKBasePluginResult.AbstractC25940a.C25941a<>();
            aVar.f64248a = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
            if (optString != null && !"undefined".equals(optString)) {
                try {
                    aVar.f64249b = (T) ByteBuffer.wrap(C67070z.m261400b(optString, "base64"));
                } catch (UnsupportedEncodingException e) {
                    AppBrandLogger.m52829e("OPCallPluginUtils", "base64 decode exception", e);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static AbstractC66047b m91121a(JSONObject jSONObject, C66717c cVar) {
        AbstractC66047b a = cVar.mo231144a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                m91123a(next, jSONObject.get(next), cVar, a);
            } catch (JSONException e) {
                Log.m165384e("OPCallPluginUtils", "JSONException", e);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static Pair<Boolean, JSONObject> m91117a(LKBasePluginResult lKBasePluginResult, String str) {
        String str2;
        if (lKBasePluginResult == null) {
            AppBrandLogger.m52829e("OPCallPluginUtils", "plugin pluginJSONResult is null:" + str);
            return null;
        }
        JSONObject e = lKBasePluginResult.mo92270e();
        int c = lKBasePluginResult.mo92267c();
        String str3 = "";
        if (e != null) {
            str2 = e.optString(ApiHandler.API_CALLBACK_ERRMSG);
        } else {
            str2 = str3;
        }
        if (c != Integer.MIN_VALUE || str2.contains("fail")) {
            JSONObject jSONObject = new JSONObject();
            AppBrandLogger.m52829e("OPCallPluginUtils", "errMsg:" + str2 + " api:" + str);
            try {
                jSONObject.putOpt(ApiHandler.API_CALLBACK_ERRMSG, m91122a(str, "fail", str2));
            } catch (JSONException e2) {
                AppBrandLogger.m52829e("OPCallPluginUtils", "put errMsg exception", e2);
            }
            return Pair.create(false, jSONObject);
        }
        if (e != null) {
            if (lKBasePluginResult.mo92266b() != null) {
                for (LKBasePluginResult.AbstractC25940a.C25941a aVar : lKBasePluginResult.mo92266b()) {
                    if (aVar.f64249b instanceof ByteBuffer) {
                        T t = aVar.f64249b;
                        if (TextUtils.isEmpty(aVar.f64250c)) {
                            aVar.f64250c = C67070z.m261390a(t.array(), "base64");
                        }
                    }
                }
                try {
                    e.putOpt("__nativeBuffers__", new JSONArray(JSON.toJSONString(lKBasePluginResult.mo92266b())));
                } catch (JSONException e3) {
                    AppBrandLogger.m52829e("OPCallPluginUtils", "generate native buffer array exception", e3);
                }
            }
            try {
                String optString = e.optString(ApiHandler.API_CALLBACK_ERRMSG);
                if (!"undefined".equals(optString)) {
                    str3 = optString;
                }
                e.putOpt(ApiHandler.API_CALLBACK_ERRMSG, m91122a(str, "ok", str3));
            } catch (JSONException e4) {
                AppBrandLogger.m52829e("OPCallPluginUtils", "regenerate errMsg exception", e4);
            }
        }
        return Pair.create(true, e);
    }

    /* renamed from: a */
    public static AbstractC66047b m91120a(LKBasePluginResult lKBasePluginResult, C66717c cVar, String str) {
        String str2;
        String str3;
        int i;
        AbstractC66047b bVar = null;
        if (lKBasePluginResult == null) {
            Log.m165383e("OPCallPluginUtils", "plugin result is null:" + str);
            return null;
        }
        JSONObject e = lKBasePluginResult.mo92270e();
        int c = lKBasePluginResult.mo92267c();
        String str4 = "";
        if (e != null) {
            str2 = e.optString(ApiHandler.API_CALLBACK_ERRMSG);
        } else {
            str2 = str4;
        }
        if (c != Integer.MIN_VALUE || str2.contains("fail")) {
            AbstractC66047b a = cVar.mo231144a();
            Log.m165383e("OPCallPluginUtils", "errMsg:" + str2 + " api:" + str);
            a.set(ApiHandler.API_CALLBACK_ERRMSG, m91122a(str, "fail", str2));
            return a;
        }
        if (e != null) {
            bVar = m91121a(e, cVar);
            if (lKBasePluginResult.mo92266b() != null) {
                AbstractC66046a a2 = cVar.mo231143a(lKBasePluginResult.mo92266b().size());
                boolean z = false;
                int i2 = 0;
                for (LKBasePluginResult.AbstractC25940a.C25941a aVar : lKBasePluginResult.mo92266b()) {
                    String str5 = aVar.f64248a;
                    if (aVar.f64249b instanceof ByteBuffer) {
                        T t = aVar.f64249b;
                        if (t != null) {
                            AbstractC66047b a3 = cVar.mo231144a();
                            a3.set("key", str5);
                            a3.set("value", (ByteBuffer) t);
                            a2.set(i2, a3);
                            i2++;
                        }
                    } else {
                        if (aVar.f64249b instanceof AbstractC66047b) {
                            AbstractC66047b a4 = cVar.mo231144a();
                            a4.set("key", str5);
                            a4.set("value", (AbstractC66047b) aVar.f64249b);
                            i = i2 + 1;
                            a2.set(i2, a4);
                        } else if (aVar.f64249b instanceof NativeHostObject) {
                            AbstractC66047b a5 = cVar.mo231144a();
                            a5.set("key", str5);
                            a5.mo81264a("value", aVar.f64249b);
                            i = i2 + 1;
                            a2.set(i2, a5);
                        }
                        i2 = i;
                        z = true;
                    }
                }
                if (!z) {
                    str3 = "__nativeBuffers__";
                } else {
                    str3 = "__nativeJsObject__";
                }
                bVar.set(str3, a2);
            }
            String string = bVar.getString(ApiHandler.API_CALLBACK_ERRMSG);
            if (!"undefined".equals(string)) {
                str4 = string;
            }
            bVar.set(ApiHandler.API_CALLBACK_ERRMSG, m91122a(str, "ok", str4));
        }
        return bVar;
    }

    /* renamed from: a */
    private static String m91122a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return str + ":" + str2;
        }
        return str + ":" + str2 + " " + str3;
    }
}
