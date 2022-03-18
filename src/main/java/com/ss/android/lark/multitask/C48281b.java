package com.ss.android.lark.multitask;

import android.os.Bundle;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.multitask.b */
public final class C48281b {
    /* renamed from: a */
    public static JSONObject m190474a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static Bundle m190473a(JSONObject jSONObject) {
        String str;
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray optJSONArray = jSONObject.optJSONArray(next);
            Object opt = jSONObject.opt(next);
            Object obj = null;
            if (opt instanceof String) {
                str = (String) opt;
            } else if (opt instanceof Number) {
                obj = (Number) opt;
                str = null;
            } else {
                str = null;
            }
            int i = 0;
            if (optJSONArray != null && optJSONArray.length() <= 0) {
                bundle.putStringArray(next, new String[0]);
            } else if (optJSONArray != null && !Double.isNaN(optJSONArray.optDouble(0))) {
                double[] dArr = new double[optJSONArray.length()];
                while (i < optJSONArray.length()) {
                    dArr[i] = optJSONArray.optDouble(i);
                    i++;
                }
                bundle.putDoubleArray(next, dArr);
            } else if (optJSONArray != null && optJSONArray.optString(0) != null) {
                String[] strArr = new String[optJSONArray.length()];
                while (i < optJSONArray.length()) {
                    strArr[i] = optJSONArray.optString(i);
                    i++;
                }
                bundle.putStringArray(next, strArr);
            } else if (obj instanceof Double) {
                Double d = (Double) obj;
                if (!Double.isNaN(d.doubleValue())) {
                    bundle.putDouble(next, d.doubleValue());
                }
            } else if (obj instanceof Float) {
                Float f = (Float) obj;
                if (!Float.isNaN(f.floatValue())) {
                    bundle.putFloat(next, f.floatValue());
                }
            } else if (obj instanceof Integer) {
                bundle.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(next, ((Short) obj).shortValue());
            } else if (str != null) {
                bundle.putString(next, str);
            } else {
                Log.m165397w("MULTITASK-JsonBundleConverter", "unable to transform json to bundle " + next);
            }
        }
        return bundle;
    }
}
