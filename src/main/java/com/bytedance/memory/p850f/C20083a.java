package com.bytedance.memory.p850f;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.util.C3125k;
import com.bytedance.apm.util.C3126l;
import com.bytedance.memory.heap.C20092a;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.memory.p846b.C20060b;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p847c.C20073b;
import com.bytedance.memory.p848d.C20076a;
import com.bytedance.memory.p851g.C20087a;
import com.bytedance.services.apm.api.C20697b;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.memory.f.a */
public class C20083a {

    /* renamed from: a */
    public static List<String> f49036a = new ArrayList();

    /* renamed from: b */
    public static List<String> f49037b = new ArrayList();

    /* renamed from: c */
    public static List<String> f49038c = new ArrayList();

    /* renamed from: d */
    public static String f49039d = "hprof_force_upload";

    /* renamed from: e */
    public static volatile boolean f49040e = false;

    /* renamed from: f */
    private static volatile long f49041f = 0;

    /* renamed from: a */
    public static void m73275a() {
        synchronized (C20083a.class) {
            if (!f49040e) {
                if (!TextUtils.isEmpty(C20092a.m73301a().mo68096f())) {
                    f49040e = true;
                    C20060b.f49007b.mo68035a(new Runnable() {
                        /* class com.bytedance.memory.p850f.C20083a.RunnableC200852 */

                        public void run() {
                            try {
                                C20063c.m73220a("MemoryNetApi uploadFile begin", new Object[0]);
                                JSONObject o = C2785b.m11774o();
                                o.put("update_version_code", C20092a.m73301a().mo68097g());
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("event_type", "memory_object_monitor");
                                jSONObject.put("hprof_type", C20092a.m73301a().mo68098h());
                                jSONObject.put("timestamp", C20092a.m73301a().mo68099i());
                                HashMap hashMap = new HashMap(2);
                                hashMap.put("header", o.toString());
                                hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject.toString());
                                ArrayList arrayList = new ArrayList(1);
                                arrayList.add(new File(C20092a.m73301a().mo68096f()));
                                C20076a.m73263a("upload_dump");
                                if (C20083a.f49037b != null && C20083a.f49037b.size() > 0) {
                                    Iterator<String> it = C20083a.f49037b.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        C20697b a = C2785b.m11736a(it.next(), arrayList, hashMap);
                                        if (a != null) {
                                            String str = new String(a.mo69901b());
                                            if (TextUtils.isEmpty(str)) {
                                                C20063c.m73220a("MemoryNetApi uploadFile succeed", new Object[0]);
                                                C20092a.m73301a().mo68104n();
                                                C20076a.m73263a("upload_dump_success");
                                                C20087a.m73278a().mo68064a(false);
                                                break;
                                            }
                                            C20063c.m73220a("MemoryNetApi uploadFile failed,message:" + str, new Object[0]);
                                        } else {
                                            C20063c.m73220a("MemoryNetApi uploadFile failed, response is null", new Object[0]);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                            C20083a.f49040e = false;
                        }
                    }, "uploadFile-MNA");
                }
            }
        }
    }

    /* renamed from: b */
    public static void m73277b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f49041f < 300000 || !C20073b.m73242i().mo68046e() || !C3126l.m13016b(C20055a.m73200c().mo68027f())) {
            C20063c.m73220a("uploadCheck return", new Object[0]);
            return;
        }
        if (!TextUtils.equals(C2785b.m11774o().optString("update_version_code", ""), C20092a.m73301a().mo68097g())) {
            C20092a.m73301a().mo68104n();
            return;
        }
        f49041f = currentTimeMillis;
        if (C20076a.m73267c(f49039d)) {
            C20063c.m73220a("hprof_force_upload", new Object[0]);
            C20092a.m73301a().mo68103m();
            return;
        }
        C20060b.f49007b.mo68035a(new Runnable() {
            /* class com.bytedance.memory.p850f.C20083a.RunnableC200863 */

            public void run() {
                try {
                    if (C20083a.f49036a != null && C20083a.f49036a.size() > 0) {
                        for (String str : C20083a.f49036a) {
                            C20697b a = C2785b.m11737a(String.format(str, Integer.valueOf(C2785b.m11774o().optInt("aid", 0))), (Map<String, String>) null);
                            if (a != null) {
                                boolean optBoolean = new JSONObject(new String(a.mo69901b())).optBoolean("should_upload");
                                C20063c.m73220a("uploadCheck with api: shouldUpload " + optBoolean, new Object[0]);
                                if (optBoolean) {
                                    C20092a.m73301a().mo68103m();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "uploadCheck-MNA");
    }

    /* renamed from: a */
    public static void m73276a(final String str) {
        C20060b.f49007b.mo68035a(new Runnable() {
            /* class com.bytedance.memory.p850f.C20083a.RunnableC200841 */

            public void run() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("d_s_t", System.currentTimeMillis());
                    jSONObject2.put("event_type", "memory_object_monitor");
                    jSONObject2.put("log_id", 464);
                    jSONObject2.put("log_type", "memory_object_monitor");
                    jSONObject2.put("memory_object", new JSONObject(str).optJSONObject("memory_object"));
                    jSONObject2.put("network_type", C3125k.m13014a(C2785b.m11735a()).getValue());
                    String b = C2785b.m11775p().mo12552b();
                    if (!TextUtils.isEmpty(b)) {
                        jSONObject2.put("session_id", b);
                    }
                    jSONObject2.put("sid", C2785b.m11767h());
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                    jSONArray.put(jSONObject2);
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                    jSONObject.put("header", C2785b.m11774o());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                for (String str : C20083a.f49038c) {
                    try {
                        C20697b a = C2785b.m11738a(str, jSONObject.toString().getBytes(), (Map<String, String>) null);
                        if (a != null && new JSONObject(new String(a.mo69901b())).optInt("error_code", -1) == 0) {
                            C20063c.m73220a("client analysis report success", new Object[0]);
                            return;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "uploadClientResult-MNA");
    }
}
