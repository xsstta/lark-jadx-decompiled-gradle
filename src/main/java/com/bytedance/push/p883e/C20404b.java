package com.bytedance.push.p883e;

import android.app.NotificationChannel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.e.b */
public class C20404b {

    /* renamed from: a */
    private String f49866a;

    /* renamed from: b */
    private boolean f49867b = true;

    /* renamed from: c */
    private String f49868c;

    /* renamed from: d */
    private String f49869d;

    /* renamed from: e */
    private int f49870e;

    /* renamed from: f */
    private boolean f49871f;

    /* renamed from: g */
    private int f49872g;

    /* renamed from: h */
    private boolean f49873h;

    /* renamed from: i */
    private boolean f49874i;

    /* renamed from: j */
    private boolean f49875j;

    /* renamed from: k */
    private String f49876k;

    /* renamed from: b */
    public String mo68809b() {
        return this.f49868c;
    }

    /* renamed from: c */
    public String mo68810c() {
        return this.f49869d;
    }

    /* renamed from: d */
    public int mo68811d() {
        return this.f49870e;
    }

    /* renamed from: e */
    public int mo68812e() {
        return this.f49872g;
    }

    /* renamed from: f */
    public boolean mo68813f() {
        return this.f49871f;
    }

    /* renamed from: g */
    public boolean mo68814g() {
        return this.f49873h;
    }

    /* renamed from: h */
    public boolean mo68815h() {
        return this.f49874i;
    }

    /* renamed from: i */
    public boolean mo68816i() {
        return this.f49875j;
    }

    /* renamed from: j */
    public boolean mo68817j() {
        return this.f49867b;
    }

    /* renamed from: k */
    public String mo68818k() {
        return this.f49866a;
    }

    /* renamed from: l */
    public String mo68819l() {
        return this.f49876k;
    }

    /* renamed from: a */
    public JSONObject mo68808a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", mo68809b());
        jSONObject.put("name", mo68810c());
        jSONObject.put("importance", mo68811d());
        jSONObject.put("bypassDnd", mo68813f());
        jSONObject.put("lockscreenVisibility", mo68812e());
        jSONObject.put("lights", mo68814g());
        jSONObject.put("vibration", mo68815h());
        jSONObject.put("showBadge", mo68816i());
        jSONObject.put("enable", mo68817j());
        jSONObject.put("desc", mo68818k());
        return jSONObject;
    }

    public C20404b(NotificationChannel notificationChannel) {
        this.f49868c = notificationChannel.getId();
        this.f49869d = String.valueOf(notificationChannel.getName());
        this.f49870e = notificationChannel.getImportance();
        this.f49871f = notificationChannel.canBypassDnd();
        this.f49872g = notificationChannel.getLockscreenVisibility();
        this.f49873h = notificationChannel.shouldShowLights();
        this.f49874i = notificationChannel.shouldVibrate();
        this.f49875j = notificationChannel.canShowBadge();
        this.f49866a = notificationChannel.getDescription();
    }

    public C20404b(JSONObject jSONObject) {
        this.f49868c = jSONObject.optString("id");
        this.f49869d = jSONObject.optString("name");
        this.f49870e = jSONObject.optInt("importance", 3);
        this.f49871f = jSONObject.optBoolean("bypassDnd", true);
        this.f49872g = jSONObject.optInt("lockscreenVisibility", -1);
        this.f49873h = jSONObject.optBoolean("lights", true);
        this.f49874i = jSONObject.optBoolean("vibration", true);
        this.f49875j = jSONObject.optBoolean("showBadge", true);
        this.f49867b = jSONObject.optBoolean("enable", true);
        this.f49866a = jSONObject.optString("desc");
        this.f49876k = jSONObject.optString("sound");
    }
}
