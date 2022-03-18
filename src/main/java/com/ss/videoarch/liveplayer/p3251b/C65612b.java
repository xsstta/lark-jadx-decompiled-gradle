package com.ss.videoarch.liveplayer.p3251b;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.videoarch.liveplayer.p3252c.C65615a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.b.b */
public class C65612b {

    /* renamed from: a */
    private JSONObject f165151a;

    /* renamed from: b */
    private JSONObject f165152b;

    /* renamed from: c */
    private int f165153c;

    /* renamed from: d */
    private String f165154d;

    /* renamed from: e */
    private String f165155e;

    /* renamed from: f */
    private boolean f165156f;

    /* renamed from: a */
    public JSONObject mo229599a() {
        try {
            return this.f165152b.getJSONObject("auto");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public String mo229603b() {
        JSONObject jSONObject = this.f165152b;
        if (jSONObject == null || !jSONObject.has("session_id")) {
            return null;
        }
        return this.f165152b.optString("session_id");
    }

    /* renamed from: c */
    public Map<String, String> mo229608c() {
        JSONObject jSONObject = this.f165152b;
        if (jSONObject != null && jSONObject.has("header")) {
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject2 = this.f165152b.getJSONObject("header");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
                return hashMap;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: d */
    public String mo229610d() {
        JSONObject jSONObject = this.f165152b;
        if (jSONObject != null && jSONObject.has(SearchIntents.EXTRA_QUERY)) {
            StringBuilder sb = new StringBuilder();
            try {
                JSONObject jSONObject2 = this.f165152b.getJSONObject(SearchIntents.EXTRA_QUERY);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    String encode = URLEncoder.encode(next, "UTF-8");
                    String encode2 = URLEncoder.encode(string, "UTF-8");
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                    sb.append(encode);
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(encode2);
                }
                return sb.toString();
            } catch (UnsupportedEncodingException | JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo229600a(String str) {
        this.f165155e = str;
    }

    /* renamed from: a */
    public void mo229601a(boolean z) {
        this.f165156f = z;
    }

    /* renamed from: b */
    public void mo229606b(String str) {
        if (mo229612d(str)) {
            this.f165154d = str;
        }
    }

    /* renamed from: a */
    public boolean mo229602a(int i) {
        this.f165153c = i | this.f165153c;
        return true;
    }

    /* renamed from: d */
    public boolean mo229612d(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = this.f165151a.getJSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null) {
            return true;
        }
        return false;
    }

    public C65612b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f165151a = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (jSONObject.has("common")) {
                    this.f165152b = jSONObject.getJSONObject("common");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f165153c = 0;
        }
    }

    /* renamed from: c */
    public boolean mo229609c(String str) {
        if (!mo229612d(str)) {
            return false;
        }
        try {
            JSONArray optJSONArray = this.f165152b.getJSONObject("auto").optJSONArray("list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (string != null && string.equals(str) && (!string.equals("origin") || this.f165156f)) {
                        return true;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: c */
    public int mo229607c(String str, String str2) {
        if (!mo229612d(str)) {
            return -1;
        }
        try {
            String i = mo229617i(str, str2);
            if (i != null) {
                return new JSONObject(i).optInt("CheckSilenceInterval");
            }
            return -1;
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: i */
    public String mo229617i(String str, String str2) {
        if (!mo229612d(str)) {
            return null;
        }
        try {
            return this.f165151a.getJSONObject(str).getJSONObject(str2).optString("sdk_params");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public int mo229595a(String str, String str2) {
        if (!mo229612d(str)) {
            return 0;
        }
        try {
            String i = mo229617i(str, str2);
            if (i == null || new JSONObject(i).optInt("EnableCheckDropAudio") != 1) {
                return 0;
            }
            return 1;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public String mo229604b(String str, String str2) {
        try {
            String i = mo229617i(str, str2);
            if (i != null) {
                return new JSONObject(i).optString("AvLines");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public String mo229611d(String str, String str2) {
        String str3;
        try {
            str3 = new JSONObject(this.f165151a.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestFormat");
        } catch (JSONException e) {
            e.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: e */
    public String mo229613e(String str, String str2) {
        String str3;
        try {
            str3 = new JSONObject(this.f165151a.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("SuggestProtocol");
        } catch (JSONException e) {
            e.printStackTrace();
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: f */
    public String mo229614f(String str, String str2) {
        if (!mo229612d(str)) {
            return null;
        }
        try {
            return new JSONObject(this.f165151a.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("VCodec");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public long mo229615g(String str, String str2) {
        if (!mo229612d(str)) {
            return 0;
        }
        try {
            return new JSONObject(this.f165151a.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("vbitrate");
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public long mo229616h(String str, String str2) {
        if (!mo229612d(str)) {
            return 0;
        }
        try {
            return new JSONObject(this.f165151a.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optLong("GopDuration");
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public String mo229596a(long j, String str) {
        JSONObject jSONObject = this.f165151a;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        Iterator<String> keys = this.f165151a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (mo229609c(next) && j == mo229615g(next, str) / 1000) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public String mo229605b(String str, String str2, String str3) {
        String str4;
        String str5;
        if (this.f165152b == null) {
            return null;
        }
        if (str.equals("rtmp")) {
            str4 = "rtmp_ports";
        } else {
            str4 = "http_ports";
        }
        try {
            str5 = new JSONObject(this.f165152b.getJSONObject(str4).optString(str2)).optString(str3);
        } catch (JSONException e) {
            e.printStackTrace();
            str5 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            return null;
        }
        return str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo229597a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.p3251b.C65612b.mo229597a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public String mo229598a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject;
        int i;
        JSONObject jSONObject2 = this.f165151a;
        if (jSONObject2 == null || jSONObject2.length() <= 0) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = this.f165151a.keys();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject4 = new JSONObject();
            long j = 0;
            int i2 = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                if (mo229609c(next)) {
                    String a = mo229597a(next, str, str2);
                    if (a != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("id", i2);
                        jSONObject5.put("codec", mo229614f(next, str2));
                        jSONObject5.put("format", str);
                        jSONObject5.put("bitrate", mo229615g(next, str2));
                        jSONObject5.put("qualityType", next);
                        jSONObject5.put("hidden", 0);
                        if (this.f165154d.equals(next)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject5.put("defaultSelect", i);
                        if (!this.f165155e.isEmpty()) {
                            int indexOf = a.indexOf("?");
                            if (indexOf == -1) {
                                a = a + "?" + this.f165155e;
                            } else if (indexOf != a.length() - 1) {
                                a = a + ContainerUtils.FIELD_DELIMITER + this.f165155e;
                            }
                        }
                        if (str3 == null || str4 == null || !C65615a.m257228c(a).equals(str4)) {
                            jSONObject5.put("url", a);
                        } else {
                            jSONObject5.put("url", C65615a.m257227a(a, str3));
                        }
                        arrayList.add(jSONObject5);
                        if (j == 0) {
                            j = mo229616h(next, str2);
                        } else {
                            j = j;
                        }
                        i2++;
                        jSONObject4 = jSONObject4;
                        keys = keys;
                        jSONObject3 = jSONObject3;
                    }
                }
            }
            if (i2 == 0) {
                return null;
            }
            jSONObject4.put("gopDuration", j);
            jSONObject4.put("representation", new JSONArray((Collection) arrayList));
            jSONObject3.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "1.0");
            jSONObject3.put("adaptationSet", jSONObject4);
            jSONObject = jSONObject3;
            if (jSONObject == null || jSONObject.length() <= 0) {
                return null;
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
    }
}
