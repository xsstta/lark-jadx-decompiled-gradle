package com.bytedance.apm.p148j;

import android.text.TextUtils;
import com.bytedance.apm.net.C3062a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3117e;
import com.bytedance.services.apm.api.AbstractC20700e;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.j.a */
public class C3017a {

    /* renamed from: a */
    public static String f9728a;

    /* renamed from: b */
    public static String f9729b;

    /* renamed from: c */
    public static String f9730c;

    /* renamed from: a */
    public static void m12668a(String str) {
        f9728a = "https://" + str + "/monitor/collect/c/logcollect";
        f9730c = str;
    }

    /* renamed from: b */
    public static void m12671b(String str) {
        f9729b = "https://" + str + "/monitor/collect/c/code_coverage";
    }

    /* renamed from: a */
    public static void m12669a(final String str, final String str2, final String str3, final String str4, final String str5, final JSONObject jSONObject, final AbstractC20700e eVar) {
        C3047b.m12756a().mo12890b(new Runnable() {
            /* class com.bytedance.apm.p148j.C3017a.RunnableC30181 */

            public void run() {
                C3017a.m12672b(str, str2, str3, str4, str5, jSONObject, null, eVar);
            }
        });
    }

    /* renamed from: a */
    public static void m12670a(final String str, final String str2, final String str3, final String str4, final String str5, final JSONObject jSONObject, final String str6, final AbstractC20700e eVar) {
        C3047b.m12756a().mo12890b(new Runnable() {
            /* class com.bytedance.apm.p148j.C3017a.RunnableC30192 */

            public void run() {
                C3017a.m12672b(str, str2, str3, str4, str5, jSONObject, str6, eVar);
            }
        });
    }

    /* renamed from: b */
    public static void m12672b(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6, AbstractC20700e eVar) {
        try {
            C3062a aVar = new C3062a(f9729b, "UTF-8", false);
            aVar.mo12915a("aid", str);
            aVar.mo12915a("os", "Android");
            aVar.mo12915a("update_version_code", str2);
            aVar.mo12915a("channel", str3);
            aVar.mo12915a("release_build", str4);
            if (!TextUtils.isEmpty(str6)) {
                aVar.mo12915a("device_id", str6);
            }
            aVar.mo12915a("monitor_version", "5.0.19.1-rc.92");
            File file = new File(str5);
            if (file.exists()) {
                String str7 = file.getParent() + "/" + (C3117e.m12980a(file) + ".zip");
                C3117e.m12982a(str7, str5);
                File file2 = new File(str7);
                aVar.mo12914a(file2.getName(), file2, new HashMap());
                file2.delete();
            }
            aVar.mo12916a(jSONObject);
            String a = aVar.mo12913a();
            int i = -1;
            try {
                i = new JSONObject(a).optInt("errno", -1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (eVar == null) {
                return;
            }
            if (i == 200) {
                eVar.mo69903a();
            } else {
                eVar.mo69904a(a);
            }
        } catch (IOException e2) {
            if (eVar != null) {
                eVar.mo69904a(e2.getMessage());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
