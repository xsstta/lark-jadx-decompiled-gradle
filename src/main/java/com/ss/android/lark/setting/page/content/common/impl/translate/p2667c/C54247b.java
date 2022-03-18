package com.ss.android.lark.setting.page.content.common.impl.translate.p2667c;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.c.b */
public class C54247b {
    /* renamed from: a */
    public static JSONObject m210657a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m210656a(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
