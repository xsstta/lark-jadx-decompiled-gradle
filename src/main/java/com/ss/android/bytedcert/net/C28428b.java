package com.ss.android.bytedcert.net;

import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.bytedcert.config.INetWork;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.p1304b.C28320c;
import com.ss.android.bytedcert.p1314g.C28380b;
import com.ss.android.bytedcert.utils.C28432b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.net.b */
public class C28428b {

    /* renamed from: a */
    private static Map<String, String> f71507a = new HashMap();

    /* renamed from: a */
    private static INetWork m104179a() {
        return BytedCertManager.getInstance().getNetWork();
    }

    /* renamed from: b */
    private static Map<String, String> m104191b(Map<String, String> map) {
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    /* renamed from: a */
    public static BDResponse m104180a(String str) {
        return new BDResponse(new C28429c(str));
    }

    /* renamed from: a */
    private static String m104184a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m104190b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                URI uri = new URI(str);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(uri.getHost())) {
                    sb.append(uri.getHost());
                }
                if (!TextUtils.isEmpty(uri.getPath())) {
                    sb.append(uri.getPath());
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: a */
    private static void m104186a(Map<String, String> map) {
        if (map != null) {
            Map<String, String> map2 = f71507a;
            if (!(map2 == null || map2.size() == 0)) {
                for (Map.Entry<String, String> entry : f71507a.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            map.put("sdk_version", "4.1.0");
            C28380b certInfo = BytedCertManager.getInstance().getCertInfo();
            if (certInfo != null) {
                if (!TextUtils.isEmpty(certInfo.f71351a)) {
                    map.put("scene", certInfo.f71351a);
                }
                if (!TextUtils.isEmpty(certInfo.f71352b)) {
                    map.put("ticket", certInfo.f71352b);
                }
                if (!TextUtils.isEmpty(certInfo.f71353c)) {
                    map.put("mode", certInfo.f71353c);
                }
                if (!TextUtils.isEmpty(certInfo.f71356f)) {
                    map.put("cert_app_id", certInfo.f71356f);
                }
            }
        }
    }

    /* renamed from: a */
    public static BDResponse m104181a(String str, Map<String, String> map, Map<String, Pair<String, byte[]>> map2) {
        return m104187b(C28320c.m103911b() + str, map, map2);
    }

    /* renamed from: b */
    public static BDResponse m104187b(String str, Map<String, String> map, Map<String, Pair<String, byte[]>> map2) {
        BDResponse bDResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Map<String, String> b = m104191b(map);
            m104186a(b);
            bDResponse = m104180a(m104179a().executePostFile(str, b, map2));
        } catch (Exception e) {
            e.printStackTrace();
            int a = C28317a.m103907a(e);
            BDResponse bDResponse2 = new BDResponse(a, m104184a(e));
            C28432b.m104210a(e, a);
            bDResponse = bDResponse2;
        }
        m104185a(bDResponse, currentTimeMillis, str);
        return bDResponse;
    }

    /* renamed from: a */
    private static void m104185a(BDResponse bDResponse, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("path", m104190b(str));
            }
            if (!TextUtils.isEmpty(bDResponse.logId)) {
                jSONObject.put("log_id", bDResponse.logId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C28432b.m104206a("cert_net_request_log", bDResponse, Integer.valueOf((int) (System.currentTimeMillis() - j)), jSONObject);
    }

    /* renamed from: c */
    public static BDResponse m104192c(boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) {
        return m104193d(z, C28320c.m103911b() + str, map, map2, map3);
    }

    /* renamed from: a */
    public static BDResponse m104182a(boolean z, String str, Map<String, String> map, String str2, Map<String, Object> map2) {
        return m104188b(z, C28320c.m103911b() + str, map, str2, map2);
    }

    /* renamed from: b */
    public static BDResponse m104188b(boolean z, String str, Map<String, String> map, String str2, Map<String, Object> map2) {
        BDResponse bDResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            bDResponse = m104180a(m104179a().executePost(str, map, str2, map2));
        } catch (Exception e) {
            e.printStackTrace();
            int a = C28317a.m103907a(e);
            BDResponse bDResponse2 = new BDResponse(a, m104184a(e));
            C28432b.m104210a(e, a);
            bDResponse = bDResponse2;
        }
        m104185a(bDResponse, currentTimeMillis, str);
        return bDResponse;
    }

    /* renamed from: a */
    public static BDResponse m104183a(boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) {
        return m104189b(z, C28320c.m103911b() + str, map, map2, map3);
    }

    /* renamed from: b */
    public static BDResponse m104189b(boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) {
        BDResponse bDResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Map<String, String> b = m104191b(map2);
            m104186a(b);
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : b.entrySet()) {
                    jSONObject.put("map_key_" + entry.getKey(), entry.getValue());
                }
                jSONObject.put("test_ticket", BytedCertManager.getInstance().getCertInfo().f71352b);
                jSONObject.put("test_aid", BytedCertManager.getInstance().getCertInfo().f71356f);
                jSONObject.put("test_scene", BytedCertManager.getInstance().getCertInfo().f71351a);
                C28432b.m104209a("test_fetchPost", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            bDResponse = m104180a(m104179a().executePost(str, map, b, map3));
        } catch (Exception e2) {
            e2.printStackTrace();
            int a = C28317a.m103907a(e2);
            BDResponse bDResponse2 = new BDResponse(a, m104184a(e2));
            C28432b.m104210a(e2, a);
            bDResponse = bDResponse2;
        }
        m104185a(bDResponse, currentTimeMillis, str);
        return bDResponse;
    }

    /* renamed from: d */
    public static BDResponse m104193d(boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) {
        BDResponse bDResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Map<String, String> b = m104191b(map2);
            m104186a(b);
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : b.entrySet()) {
                    jSONObject.put("map_key_" + entry.getKey(), entry.getValue());
                }
                jSONObject.put("test_ticket", BytedCertManager.getInstance().getCertInfo().f71352b);
                jSONObject.put("test_aid", BytedCertManager.getInstance().getCertInfo().f71356f);
                jSONObject.put("test_scene", BytedCertManager.getInstance().getCertInfo().f71351a);
                C28432b.m104209a("test_fetchGet", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            bDResponse = m104180a(m104179a().executeGet(str, map, b, map3));
        } catch (Exception e2) {
            e2.printStackTrace();
            int a = C28317a.m103907a(e2);
            BDResponse bDResponse2 = new BDResponse(a, m104184a(e2));
            C28432b.m104210a(e2, a);
            bDResponse = bDResponse2;
        }
        m104185a(bDResponse, currentTimeMillis, str);
        return bDResponse;
    }
}
