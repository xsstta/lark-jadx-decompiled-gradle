package com.ss.android.lark.p1786d;

import android.text.TextUtils;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.d.i */
public class C36438i extends BaseHitPoint {
    /* renamed from: a */
    static void m143589a(String str) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("preload_failed_layout", str);
                C37030f.m146093a().mo103026a("preload_xml_failed", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Log.m165397w("InflaterHitPoint", "sendPreloadFailEvent:" + str);
        }
    }

    /* renamed from: a */
    static void m143588a(int i, int i2) {
        if (i2 <= i) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("total_count", i);
                jSONObject.put("failed_count", i2);
                C37030f.m146093a().mo103026a("preload_inflate_no_cache", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Log.m165379d("InflaterHitPoint", "sendPreloadNoCacheEvent:" + i + "/" + i2);
        }
    }
}
