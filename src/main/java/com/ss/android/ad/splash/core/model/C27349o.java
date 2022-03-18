package com.ss.android.ad.splash.core.model;

import com.ss.android.ad.splash.utils.C27476f;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.o */
public class C27349o {

    /* renamed from: a */
    private List<String> f68263a;

    /* renamed from: b */
    private List<String> f68264b;

    /* renamed from: c */
    private List<String> f68265c;

    /* renamed from: d */
    private String f68266d;

    /* renamed from: e */
    private long f68267e;

    /* renamed from: f */
    private boolean f68268f;

    /* renamed from: g */
    private int f68269g;

    /* renamed from: h */
    private int f68270h;

    /* renamed from: i */
    private String f68271i;

    /* renamed from: j */
    private long f68272j;

    /* renamed from: a */
    public List<String> mo97571a() {
        return this.f68263a;
    }

    /* renamed from: b */
    public List<String> mo97573b() {
        return this.f68264b;
    }

    /* renamed from: c */
    public List<String> mo97574c() {
        return this.f68265c;
    }

    /* renamed from: d */
    public String mo97575d() {
        return this.f68266d;
    }

    /* renamed from: e */
    public long mo97576e() {
        return this.f68272j;
    }

    /* renamed from: f */
    public int mo97577f() {
        return this.f68269g;
    }

    /* renamed from: g */
    public int mo97578g() {
        return this.f68270h;
    }

    /* renamed from: h */
    public String mo97579h() {
        return this.f68271i;
    }

    /* renamed from: i */
    public boolean mo97580i() {
        if (C27480i.m100385a(this.f68266d) || this.f68269g <= 0 || C27476f.m100322a(this.f68265c) || C27480i.m100385a(this.f68265c.get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo97572a(JSONObject jSONObject) {
        int i;
        JSONArray optJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.f68263a = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    mo97571a().add(optJSONArray.getString(i2));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.f68264b = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                try {
                    this.f68264b.add(optJSONArray2.getString(i3));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
            this.f68265c = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                try {
                    mo97574c().add(optJSONArray3.getString(i4));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        this.f68266d = jSONObject.optString("video_id");
        this.f68267e = jSONObject.optLong("video_group_id");
        this.f68268f = jSONObject.optBoolean("voice_switch");
        this.f68272j = jSONObject.optLong("video_duration_ms");
        String optString = jSONObject.optString("video_density");
        this.f68271i = jSONObject.optString("secret_key");
        int indexOf = optString.indexOf("x");
        if (indexOf >= 0 && (i = indexOf + 1) < optString.length()) {
            this.f68270h = Integer.parseInt(optString.substring(0, indexOf));
            this.f68269g = Integer.parseInt(optString.substring(i));
        }
    }
}
