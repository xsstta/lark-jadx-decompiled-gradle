package com.ss.android.bytedcert.p1314g;

import android.graphics.Bitmap;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.manager.C28396a;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.utils.C28432b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.g.d */
public class C28382d {

    /* renamed from: a */
    public String f71360a = "1.0";

    /* renamed from: b */
    public int f71361b = 10;

    /* renamed from: c */
    public int[] f71362c;

    /* renamed from: d */
    public C28383a f71363d = new C28383a();

    /* renamed from: e */
    public boolean f71364e;

    /* renamed from: f */
    public int f71365f;

    /* renamed from: g */
    public Bitmap f71366g;

    /* renamed from: h */
    public BDResponse f71367h;

    /* renamed from: com.ss.android.bytedcert.g.d$a */
    public static class C28383a {

        /* renamed from: a */
        private int[] f71368a;

        /* renamed from: b */
        private float[] f71369b;

        /* renamed from: b */
        public float[] mo101094b() {
            return this.f71369b;
        }

        /* renamed from: a */
        public int[] mo101093a() {
            return this.f71368a;
        }

        /* renamed from: a */
        public void mo101091a(float[] fArr) {
            this.f71369b = fArr;
        }

        /* renamed from: a */
        public void mo101092a(int[] iArr) {
            this.f71368a = iArr;
        }

        /* renamed from: a */
        public void mo101090a(JSONArray jSONArray) {
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        this.f71368a = new int[length];
                        this.f71369b = new float[length];
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            this.f71368a[i] = jSONObject.optInt("enum");
                            this.f71369b[i] = (float) jSONObject.optDouble("value");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf((char) this.f71360a.length()));
        sb.append(this.f71360a);
        sb.append("liveness_timeout=");
        sb.append(this.f71361b);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("motion_types=");
        int i = 0;
        while (true) {
            int[] iArr = this.f71362c;
            if (i < iArr.length) {
                sb.append(iArr[i]);
                if (i != this.f71362c.length - 1) {
                    sb.append(",");
                }
                i++;
            } else {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                return sb.toString();
            }
        }
    }

    public C28382d() {
        ArrayList arrayList = new ArrayList(Arrays.asList(0, 2, 3));
        Collections.shuffle(arrayList);
        this.f71362c = new int[]{((Integer) arrayList.get(0)).intValue()};
        if (C28396a.m104125a().mo101170b()) {
            String[] split = C28396a.m104125a().mo101174f().split(",");
            int length = split.length;
            this.f71362c = new int[length];
            for (int i = 0; i < length; i++) {
                this.f71362c[i] = Integer.parseInt(split[i]);
            }
            C28383a aVar = new C28383a();
            this.f71363d = aVar;
            aVar.mo101092a(new int[]{15, 16});
            this.f71363d.mo101091a(new float[]{0.375f, 0.37f});
            this.f71361b = 20;
        }
    }

    /* renamed from: a */
    public String mo101087a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int[] iArr = this.f71362c;
            if (i < iArr.length) {
                sb.append(iArr[i]);
                if (i != this.f71362c.length - 1) {
                    sb.append(",");
                }
                i++;
            } else {
                return String.valueOf((char) 3) + "4.0" + str;
            }
        }
    }

    /* renamed from: a */
    public void mo101088a(int i) {
        if (i > 0 && i <= 3) {
            ArrayList arrayList = new ArrayList(Arrays.asList(0, 2, 3));
            Collections.shuffle(arrayList);
            this.f71362c = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f71362c[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
    }

    public C28382d(BDResponse bDResponse) {
        this.f71367h = bDResponse;
        if (bDResponse != null) {
            try {
                if (bDResponse.success && bDResponse.jsonData != null) {
                    JSONObject jSONObject = bDResponse.jsonData;
                    this.f71360a = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                    this.f71361b = jSONObject.optInt("liveness_timeout", 10);
                    String optString = C28396a.m104125a().mo101170b() ? C28396a.m104125a().mo101174f() : jSONObject.optString("motion_types");
                    this.f71363d.mo101090a(jSONObject.optJSONArray("liveness_conf"));
                    String[] split = optString.split(",");
                    int length = split.length;
                    if (C28396a.m104125a().mo101170b()) {
                        C28383a aVar = new C28383a();
                        this.f71363d = aVar;
                        aVar.mo101092a(new int[]{15, 16});
                        this.f71363d.mo101091a(new float[]{0.375f, 0.37f});
                    }
                    this.f71362c = new int[length];
                    for (int i = 0; i < length; i++) {
                        this.f71362c[i] = Integer.parseInt(split[i]);
                    }
                    m104094a("response", optString);
                    int optInt = jSONObject.optInt("beauty_intensity", -1);
                    if (optInt >= 0) {
                        BytedCertManager.getInstance().getThemeConfig().mo100954a(optInt);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m104094a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_scene", str);
            jSONObject.put("motion_types", str2);
            C28432b.m104209a("cert_motion_types", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
