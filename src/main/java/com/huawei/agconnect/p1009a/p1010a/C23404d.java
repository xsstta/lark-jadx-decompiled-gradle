package com.huawei.agconnect.p1009a.p1010a;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.agconnect.a.a.d */
public class C23404d implements AbstractC23402b {

    /* renamed from: a */
    private final JSONObject f57720a;

    C23404d(InputStream inputStream) {
        this.f57720a = m84937a(inputStream);
    }

    /* renamed from: a */
    private JSONObject m84937a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(C23408h.m84949a(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    @Override // com.huawei.agconnect.p1009a.p1010a.AbstractC23402b
    /* renamed from: a */
    public String mo81790a(String str, String str2) {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] split = str.split("/");
        try {
            JSONObject jSONObject = this.f57720a;
            for (int i = 1; i < split.length; i++) {
                if (i == split.length - 1) {
                    return jSONObject.get(split[i]).toString();
                }
                jSONObject = jSONObject.getJSONObject(split[i]);
            }
        } catch (JSONException unused) {
            Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
        }
        return str2;
    }
}
