package com.tt.miniapp.p3324r;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.miniapp.falcon.p3285a.AbstractC66046a;
import com.tt.miniapp.falcon.p3285a.AbstractC66047b;
import com.tt.miniapp.p3324r.p3325a.C66695a;
import com.tt.miniapp.p3324r.p3325a.C66698b;
import com.tt.miniapp.p3324r.p3325a.C66701c;
import com.tt.miniapp.p3324r.p3325a.C66705d;
import com.tt.miniapp.p3324r.p3325a.C66709e;
import com.tt.miniapp.p3324r.p3325a.C66712f;
import com.tt.refer.p3400a.p3401a.p3402a.C67705d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.r.d */
public class C66718d {
    /* renamed from: a */
    public static boolean m260519a(String str) {
        if (TextUtils.isEmpty(str) || str.toLowerCase().equals("undefined") || str.toLowerCase().equals("null")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static JSONObject m260518a(C66717c cVar) {
        ByteBuffer byteBuffer;
        JSONObject jSONObject = new JSONObject();
        AbstractC66046a d = cVar.mo231150d("__nativeBuffers__");
        JSONArray jSONArray = new JSONArray();
        if (d != null) {
            AbstractC66047b bVar = (AbstractC66047b) cVar.mo231145a(d, 0, AbstractC66047b.class);
            if (!(bVar == null || (byteBuffer = (ByteBuffer) cVar.mo231146a(bVar, "value", ByteBuffer.class)) == null || !byteBuffer.hasArray())) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("value", byteBuffer.array());
                    jSONArray.put(0, jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            try {
                jSONObject.put("tech", cVar.mo231147b("tech"));
                jSONObject.put("__nativeBuffers__", jSONArray);
                return jSONObject;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static IApiInputParam m260515a(String str, C66717c cVar) {
        String str2;
        ByteBuffer byteBuffer;
        AbstractC66047b bVar;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        if (TextUtils.equals("writeFile", str) || TextUtils.equals("writeFileSync", str)) {
            String b = cVar.mo231147b("filePath");
            try {
                str2 = cVar.mo231147b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            } catch (Exception e) {
                AppBrandLogger.m52829e("ApiParamParser", "data parse exception", e);
                str2 = null;
            }
            String b2 = cVar.mo231147b("encoding");
            AbstractC66046a d = cVar.mo231150d("__nativeBuffers__");
            if (d != null) {
                byteBuffer3 = (ByteBuffer) cVar.mo231146a((AbstractC66047b) cVar.mo231145a(d, 0, AbstractC66047b.class), "value", ByteBuffer.class);
            }
            return new C66709e.C66710a(b, b2, str2, byteBuffer3);
        } else if (TextUtils.equals("readFile", str) || TextUtils.equals("readFileSync", str)) {
            return new C66701c.C66702a(cVar.mo231147b("filePath"), cVar.mo231147b("encoding"));
        } else {
            if (TextUtils.equals("createRequestTask", str)) {
                String b3 = cVar.mo231147b("url");
                String b4 = cVar.mo231147b("method");
                String b5 = cVar.mo231147b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                boolean c = cVar.mo231149c("usePrefetchCache");
                AbstractC66046a d2 = cVar.mo231150d("header2");
                JSONObject jSONObject = new JSONObject();
                if (d2 != null) {
                    int arrayGetLength = d2.arrayGetLength();
                    for (int i = 0; i < arrayGetLength; i++) {
                        AbstractC66046a aVar = (AbstractC66046a) cVar.mo231145a(d2, i, AbstractC66046a.class);
                        if (aVar != null) {
                            try {
                                jSONObject.put(aVar.getString(0), aVar.getString(1));
                            } catch (Exception e2) {
                                AppBrandLogger.m52829e("ApiParamParser", e2);
                            }
                        }
                    }
                }
                String b6 = cVar.mo231147b("dataType");
                String b7 = cVar.mo231147b("responseType");
                AbstractC66046a d3 = cVar.mo231150d("__nativeBuffers__");
                if (!(d3 == null || (bVar = (AbstractC66047b) cVar.mo231145a(d3, 0, AbstractC66047b.class)) == null || (byteBuffer2 = (ByteBuffer) cVar.mo231146a(bVar, "value", ByteBuffer.class)) == null || !byteBuffer2.hasArray())) {
                    C66705d.C66706a.C66707a aVar2 = new C66705d.C66706a.C66707a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, byteBuffer2.array());
                    arrayList = new ArrayList();
                    arrayList.add(aVar2);
                }
                return new C66705d.C66706a(b3, b4, c, b5, jSONObject.toString(), b6, b7, arrayList);
            } else if (TextUtils.equals("createSocketTask", str)) {
                String b8 = cVar.mo231147b("url");
                String b9 = cVar.mo231147b("method");
                boolean c2 = cVar.mo231149c("__skipDomainCheck__");
                AbstractC66046a d4 = cVar.mo231150d("header2");
                JSONObject jSONObject2 = new JSONObject();
                if (d4 != null) {
                    int arrayGetLength2 = d4.arrayGetLength();
                    for (int i2 = 0; i2 < arrayGetLength2; i2++) {
                        AbstractC66046a aVar3 = (AbstractC66046a) cVar.mo231145a(d4, i2, AbstractC66046a.class);
                        if (aVar3 != null) {
                            try {
                                jSONObject2.put(aVar3.getString(0), aVar3.getString(1));
                            } catch (Exception e3) {
                                AppBrandLogger.m52829e("ApiParamParser", e3);
                            }
                        }
                    }
                }
                AbstractC66046a d5 = cVar.mo231150d("protocols");
                JSONArray jSONArray = new JSONArray();
                if (d5 != null) {
                    int arrayGetLength3 = d5.arrayGetLength();
                    for (int i3 = 0; i3 < arrayGetLength3; i3++) {
                        jSONArray.put((String) cVar.mo231145a(d5, i3, String.class));
                    }
                }
                return new C66695a.C66696a(b8, b9, jSONObject2, jSONArray, c2);
            } else if (!TextUtils.equals("operateSocketTask", str)) {
                return null;
            } else {
                String b10 = cVar.mo231147b("operationType");
                String b11 = cVar.mo231147b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                int a = cVar.mo231142a("socketTaskId");
                String b12 = cVar.mo231147b("reason");
                int a2 = cVar.mo231142a("code");
                AbstractC66046a d6 = cVar.mo231150d("__nativeBuffers__");
                if (d6 != null) {
                    arrayList2 = new ArrayList();
                    AbstractC66047b bVar2 = (AbstractC66047b) cVar.mo231145a(d6, 0, AbstractC66047b.class);
                    if (!(bVar2 == null || (byteBuffer = (ByteBuffer) cVar.mo231146a(bVar2, "value", ByteBuffer.class)) == null)) {
                        arrayList2.add(new C66712f(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, byteBuffer));
                    }
                }
                return new C66698b.C66699a(b10, a, b11, arrayList2, a2, b12);
            }
        }
    }

    /* renamed from: b */
    public static JSONObject m260521b(String str, C66717c cVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ByteBuffer byteBuffer;
        int i;
        AbstractC66046a aVar;
        int i2;
        Exception e;
        str.hashCode();
        if (str.equals("nfcTransceive")) {
            return m260518a(cVar);
        }
        if (!str.equals("createRequestTask")) {
            return null;
        }
        String b = cVar.mo231147b("url");
        String b2 = cVar.mo231147b("method");
        if (TextUtils.equals(b2, "undefined")) {
            b2 = "GET";
        }
        String b3 = cVar.mo231147b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean c = cVar.mo231149c("usePrefetchCache");
        String b4 = cVar.mo231147b("header");
        AbstractC66046a d = cVar.mo231150d("header2");
        JSONObject jSONObject = new JSONObject();
        if (d != null) {
            int arrayGetLength = d.arrayGetLength();
            str2 = "usePrefetchCache";
            int i3 = 0;
            while (i3 < arrayGetLength) {
                AbstractC66046a aVar2 = (AbstractC66046a) cVar.mo231145a(d, i3, AbstractC66046a.class);
                if (aVar2 != null) {
                    aVar = d;
                    i = arrayGetLength;
                    try {
                        i2 = 1;
                        try {
                            jSONObject.put(aVar2.getString(0), aVar2.getString(1));
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i2 = 1;
                        Object[] objArr = new Object[i2];
                        objArr[0] = e;
                        AppBrandLogger.m52829e("ApiParamParser", objArr);
                        i3++;
                        d = aVar;
                        arrayGetLength = i;
                    }
                } else {
                    aVar = d;
                    i = arrayGetLength;
                }
                i3++;
                d = aVar;
                arrayGetLength = i;
            }
        } else {
            str2 = "usePrefetchCache";
        }
        String b5 = cVar.mo231147b("dataType");
        if (m260519a(b5)) {
            str3 = null;
        } else {
            str3 = b5;
        }
        String b6 = cVar.mo231147b("responseType");
        if (m260519a(b6)) {
            str4 = null;
        } else {
            str4 = b6;
        }
        AbstractC66046a d2 = cVar.mo231150d("__nativeBuffers__");
        JSONArray jSONArray = new JSONArray();
        if (d2 != null) {
            str6 = "__nativeBuffers__";
            str5 = str4;
            AbstractC66047b bVar = (AbstractC66047b) cVar.mo231145a(d2, 0, AbstractC66047b.class);
            if (!(bVar == null || (byteBuffer = (ByteBuffer) cVar.mo231146a(bVar, "value", ByteBuffer.class)) == null || !byteBuffer.hasArray())) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("value", byteBuffer.array());
                    jSONArray.put(0, jSONObject2);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        } else {
            str5 = str4;
            str6 = "__nativeBuffers__";
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", b);
            jSONObject3.put("method", b2);
            jSONObject3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, b3);
            jSONObject3.put(str2, c);
            jSONObject3.put("header", b4);
            jSONObject3.put("header2", jSONObject);
            jSONObject3.put("dataType", str3);
            jSONObject3.put("responseType", str5);
            jSONObject3.put(str6, jSONArray);
            return jSONObject3;
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static AbstractC66047b m260517a(String str, C67705d dVar, C66717c cVar) {
        AbstractC66047b a = cVar.mo231144a();
        Iterator<String> a2 = dVar.mo235002a();
        while (a2.hasNext()) {
            String next = a2.next();
            Object a3 = dVar.mo235001a(next);
            if (a3 != null && !m260520a(str, a, cVar, next, a3)) {
                if (a3 instanceof Boolean) {
                    a.set(next, ((Boolean) a3).booleanValue());
                } else if (a3 instanceof Integer) {
                    a.set(next, ((Integer) a3).intValue());
                } else if (a3 instanceof Double) {
                    a.set(next, ((Double) a3).doubleValue());
                } else if (a3 instanceof String) {
                    a.set(next, (String) a3);
                } else if (a3 instanceof AbstractC66047b) {
                    a.set(next, (AbstractC66047b) a3);
                } else if (a3 instanceof AbstractC66046a) {
                    a.set(next, (AbstractC66046a) a3);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static AbstractC66047b m260516a(String str, AbstractC25903n nVar, C66717c cVar) {
        C66701c.C66703b.C66704a aVar;
        boolean z;
        C66712f fVar;
        if (nVar == null) {
            return null;
        }
        int i = 0;
        if (TextUtils.equals("readFile", str) || TextUtils.equals("readFileSync", str)) {
            AbstractC66047b a = cVar.mo231144a();
            C66701c.C66703b bVar = (C66701c.C66703b) nVar;
            List<C66701c.C66703b.C66704a> list = bVar.f168386c;
            if (list != null && !list.isEmpty()) {
                AbstractC66046a a2 = cVar.mo231143a(list.size());
                for (C66701c.C66703b.C66704a aVar2 : list) {
                    byte[] bArr = aVar2.f168388b;
                    AbstractC66047b a3 = cVar.mo231144a();
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    a3.set("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    a3.set("value", wrap);
                    a2.set(i, a3);
                    i++;
                }
                a.set("__nativeBuffers__", a2);
            }
            a.set(ApiHandler.API_CALLBACK_ERRMSG, bVar.f168384a);
            if (TextUtils.isEmpty(bVar.f168385b)) {
                return a;
            }
            a.set(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bVar.f168385b);
            return a;
        } else if (TextUtils.equals("writeFile", str) || TextUtils.equals("writeFileSync", str)) {
            AbstractC66047b a4 = cVar.mo231144a();
            a4.set(ApiHandler.API_CALLBACK_ERRMSG, ((C66709e.C66711b) nVar).f168414a);
            return a4;
        } else if (TextUtils.equals("createRequestTask", str) || TextUtils.equals("onRequestTaskStateChange", str)) {
            C66705d.C66708b bVar2 = (C66705d.C66708b) nVar;
            AbstractC66047b a5 = cVar.mo231144a();
            if (!TextUtils.isEmpty(bVar2.f168401c)) {
                a5.set(ApiHandler.API_CALLBACK_ERRMSG, bVar2.f168401c);
            }
            if (bVar2.f168402d != null) {
                a5.set("errCode", bVar2.f168402d.intValue());
            }
            if (!TextUtils.isEmpty(bVar2.f168404f)) {
                a5.set(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, bVar2.f168404f);
            }
            if (!TextUtils.isEmpty(bVar2.f168400b)) {
                a5.set("state", bVar2.f168400b);
            }
            if (bVar2.f168406h != -1) {
                if (bVar2.f168406h == 1) {
                    z = true;
                } else {
                    z = false;
                }
                a5.set("isPrefetch", z);
            }
            if (!TextUtils.isEmpty(bVar2.f168409k)) {
                a5.set("trace", bVar2.f168409k);
            }
            if (bVar2.f168403e != null) {
                AbstractC66047b a6 = cVar.mo231144a();
                JSONObject jSONObject = bVar2.f168403e;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        a6.set(next, jSONObject.getString(next));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                a5.set("header", a6);
            }
            if (!TextUtils.isEmpty(bVar2.f168408j)) {
                a5.set(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bVar2.f168408j);
            }
            if (!(bVar2.f168407i == null || (aVar = bVar2.f168407i.get(0)) == null || aVar.f168388b == null)) {
                AbstractC66047b a7 = cVar.mo231144a();
                ByteBuffer wrap2 = ByteBuffer.wrap(aVar.f168388b);
                a7.set("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                a7.set("value", wrap2);
                AbstractC66046a a8 = cVar.mo231143a(1);
                a8.set(0, a7);
                a5.set("__nativeBuffers__", a8);
            }
            if (bVar2.f168399a <= 0) {
                return a5;
            }
            a5.set("requestTaskId", bVar2.f168399a);
            return a5;
        } else if (TextUtils.equals("operateSocketTask", str)) {
            C66698b.C66700b bVar3 = (C66698b.C66700b) nVar;
            AbstractC66047b a9 = cVar.mo231144a();
            a9.set(ApiHandler.API_CALLBACK_ERRMSG, bVar3.f168374a);
            if (bVar3.f168375b != null) {
                a9.set("errCode", bVar3.f168375b.intValue());
            }
            if (TextUtils.isEmpty(bVar3.f168376c)) {
                return a9;
            }
            a9.set(ApiHandler.API_CALLBACK_ERRSTACK, bVar3.f168376c);
            return a9;
        } else if (TextUtils.equals("onSocketTaskStateChange", str)) {
            C66698b.C66700b bVar4 = (C66698b.C66700b) nVar;
            AbstractC66047b a10 = cVar.mo231144a();
            if (!TextUtils.isEmpty(bVar4.f168374a)) {
                a10.set(ApiHandler.API_CALLBACK_ERRMSG, bVar4.f168374a);
            }
            if (!TextUtils.isEmpty(bVar4.f168380g)) {
                a10.set(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bVar4.f168380g);
            }
            if (!TextUtils.isEmpty(bVar4.f168378e)) {
                a10.set("state", bVar4.f168378e);
            }
            if (!TextUtils.isEmpty(bVar4.f168379f)) {
                a10.set("header", bVar4.f168379f);
            }
            if (bVar4.f168377d > 0) {
                a10.set("socketTaskId", bVar4.f168377d);
            }
            if (bVar4.f168381h == null || (fVar = bVar4.f168381h.get(0)) == null || fVar.f168416b == null) {
                return a10;
            }
            ByteBuffer byteBuffer = fVar.f168416b;
            AbstractC66047b a11 = cVar.mo231144a();
            a11.set("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            a11.set("value", byteBuffer);
            AbstractC66046a a12 = cVar.mo231143a(1);
            a12.set(0, a11);
            a10.set("__nativeBuffers__", a12);
            return a10;
        } else if (!TextUtils.equals("createSocketTask", str)) {
            return null;
        } else {
            C66695a.C66697b bVar5 = (C66695a.C66697b) nVar;
            AbstractC66047b a13 = cVar.mo231144a();
            a13.set(ApiHandler.API_CALLBACK_ERRMSG, bVar5.f168366b);
            if (bVar5.f168367c != null) {
                a13.set("errCode", bVar5.f168367c.intValue());
            }
            a13.set("socketTaskId", bVar5.f168365a);
            return a13;
        }
    }

    /* renamed from: a */
    private static boolean m260520a(String str, AbstractC66047b bVar, C66717c cVar, String str2, Object obj) {
        byte[] bArr;
        str.hashCode();
        if (str.equals("onRequestTaskStateChange") || str.equals("createRequestTask")) {
            str2.hashCode();
            if (str2.equals("__nativeBuffers__")) {
                JSONObject optJSONObject = ((JSONArray) obj).optJSONObject(0);
                if (!(optJSONObject == null || (bArr = (byte[]) optJSONObject.opt("value")) == null)) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    AbstractC66047b a = cVar.mo231144a();
                    a.set("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    a.set("value", wrap);
                    AbstractC66046a a2 = cVar.mo231143a(1);
                    a2.set(0, a);
                    bVar.set("__nativeBuffers__", a2);
                    return true;
                }
            } else if (str2.equals("header")) {
                AbstractC66047b a3 = cVar.mo231144a();
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        a3.set(next, jSONObject.getString(next));
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("ApiParamParser", "insertSpecialParam", e);
                    }
                }
                bVar.set("header", a3);
                return true;
            }
        }
        return false;
    }
}
