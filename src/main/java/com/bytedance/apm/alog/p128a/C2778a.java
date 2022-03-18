package com.bytedance.apm.alog.p128a;

import com.bytedance.apm.net.C3062a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.alog.a.a */
public class C2778a {

    /* renamed from: a */
    public static String f8862a = "https://i.isnssdk.com/monitor/collect/c/logcollect";

    /* renamed from: com.bytedance.apm.alog.a.a$a */
    public interface AbstractC2779a {
        /* renamed from: a */
        void mo12085a(boolean z, int i, Exception exc, JSONObject jSONObject);
    }

    /* renamed from: a */
    public static void m11722a(String str) {
        f8862a = "https://" + str + "/monitor/collect/c/logcollect";
    }

    /* renamed from: a */
    public static boolean m11723a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject) {
        return m11724a(str, str2, str3, list, str4, jSONObject, null);
    }

    /* renamed from: a */
    public static boolean m11724a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, AbstractC2779a aVar) {
        try {
            C3062a aVar2 = new C3062a(f8862a, "UTF-8", false);
            aVar2.mo12915a("aid", str);
            aVar2.mo12915a("device_id", str2);
            aVar2.mo12915a("os", "Android");
            aVar2.mo12915a("process_name", str3);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    aVar2.mo12914a(file.getName(), file, hashMap);
                }
            }
            aVar2.mo12916a(jSONObject);
            try {
                JSONObject jSONObject2 = new JSONObject(aVar2.mo12913a());
                if (jSONObject2.optInt("errno", -1) == 200) {
                    if (aVar != null) {
                        aVar.mo12085a(true, -1, null, jSONObject2);
                    }
                    return true;
                }
                if (aVar != null) {
                    aVar.mo12085a(false, 6, null, null);
                }
                return false;
            } catch (JSONException e) {
                if (aVar != null) {
                    aVar.mo12085a(false, 7, e, null);
                }
            }
        } catch (IOException e2) {
            if (aVar != null) {
                aVar.mo12085a(false, 8, e2, null);
            }
            return false;
        }
    }
}
