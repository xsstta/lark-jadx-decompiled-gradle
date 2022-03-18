package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.q */
public class C23615q implements AbstractC23617s {

    /* renamed from: a */
    public String f58308a;

    /* renamed from: b */
    public String f58309b;

    /* renamed from: c */
    public String f58310c;

    /* renamed from: d */
    public String f58311d;

    /* renamed from: e */
    public String f58312e;

    /* renamed from: f */
    public String f58313f;

    @Override // com.huawei.hms.hatool.AbstractC23617s
    /* renamed from: a */
    public JSONObject mo82974a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121869d, this.f58308a);
        jSONObject.put("eventtime", this.f58311d);
        jSONObject.put("event", this.f58309b);
        jSONObject.put("event_session_name", this.f58312e);
        jSONObject.put("first_session_event", this.f58313f);
        if (TextUtils.isEmpty(this.f58310c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f58310c));
        return jSONObject;
    }

    /* renamed from: a */
    public void mo83141a(String str) {
        this.f58310c = str;
    }

    /* renamed from: a */
    public void mo83142a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f58309b = jSONObject.optString("event");
            this.f58310c = jSONObject.optString("properties");
            this.f58310c = C23599d.m85664a(this.f58310c, d0.m85666f().mo82981a());
            this.f58308a = jSONObject.optString(ShareHitPoint.f121869d);
            this.f58311d = jSONObject.optString("eventtime");
            this.f58312e = jSONObject.optString("event_session_name");
            this.f58313f = jSONObject.optString("first_session_event");
        }
    }

    /* renamed from: b */
    public String mo83143b() {
        return this.f58311d;
    }

    /* renamed from: b */
    public void mo83144b(String str) {
        this.f58309b = str;
    }

    /* renamed from: c */
    public String mo83145c() {
        return this.f58308a;
    }

    /* renamed from: c */
    public void mo83146c(String str) {
        this.f58311d = str;
    }

    /* renamed from: d */
    public JSONObject mo83147d() {
        JSONObject a = mo82974a();
        a.put("properties", C23599d.m85665b(this.f58310c, d0.m85666f().mo82981a()));
        return a;
    }

    /* renamed from: d */
    public void mo83148d(String str) {
        this.f58308a = str;
    }

    /* renamed from: e */
    public void mo83149e(String str) {
        this.f58313f = str;
    }

    /* renamed from: f */
    public void mo83150f(String str) {
        this.f58312e = str;
    }
}
