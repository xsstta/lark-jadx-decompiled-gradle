package com.bytedance.apm.util;

import android.text.TextUtils;
import com.bytedance.apm.net.C3062a;
import com.bytedance.services.apm.api.C20697b;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.util.d */
public class C3116d {
    /* renamed from: a */
    public static C20697b m12978a(String str, List<File> list, Map<String, String> map) {
        try {
            C3062a aVar = new C3062a(str, "UTF-8", false);
            if (list != null && !list.isEmpty()) {
                for (File file : list) {
                    if (file.exists()) {
                        aVar.mo12914a(file.getName(), file, new HashMap());
                    }
                }
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVar.mo12915a(entry.getKey(), entry.getValue());
                }
            }
            String a = aVar.mo12913a();
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(a);
                return new C20697b(jSONObject.optInt("error_code", 0), jSONObject.optString("message", "").getBytes());
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
