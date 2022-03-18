package com.bytedance.ee.larkbrand.p643a.p645b;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.a.b.a */
public class C12951a {

    /* renamed from: a */
    public String f34500a;

    /* renamed from: b */
    private boolean f34501b;

    /* renamed from: c */
    private ArrayList<String> f34502c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<String> f34503d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<String> f34504e = new ArrayList<>();

    public C12951a(JSONObject jSONObject) {
        this.f34500a = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APPID);
        this.f34501b = jSONObject.optBoolean("fullMatchForPath");
        JSONArray optJSONArray = jSONObject.optJSONArray("hosts");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f34502c.add(optJSONArray.optString(i));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("paths");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.f34503d.add(optJSONArray2.optString(i2));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("schemes");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                this.f34504e.add(optJSONArray3.optString(i3));
            }
        }
    }

    /* renamed from: a */
    public boolean mo48849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(host) && !TextUtils.isEmpty(path) && this.f34504e.contains(scheme) && this.f34502c.contains(host)) {
            if (this.f34501b) {
                return this.f34503d.contains(path);
            }
            Iterator<String> it = this.f34503d.iterator();
            while (it.hasNext()) {
                if (path.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
